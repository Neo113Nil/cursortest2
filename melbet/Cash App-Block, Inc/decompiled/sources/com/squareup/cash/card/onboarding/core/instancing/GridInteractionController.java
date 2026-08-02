package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.text.zzd;
import com.squareup.cash.card.onboarding.ZoomLevel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GridInteractionController {
    public static final float PINCH_SPRING_DAMPING = ((float) Math.sqrt(1500.0d)) * 2.0f;
    public boolean blendingToFarRest;
    public int flingTargetCol;
    public int flingTargetRow;
    public GridConfig gridConfig;
    public boolean isDragging;
    public boolean isFlingSettling;
    public boolean isInitialized;
    public boolean isPinching;
    public long lastDragTimeNanos;
    public Integer lastExploredCanonicalIndex;
    public CardDesignLibraryScene$$ExternalSyntheticLambda0 onInteractionChanged;
    public ZoomLevel pinchBaseZoom;
    public float pinchCurrentLogZoom;
    public float pinchFarTargetPanX;
    public float pinchFarTargetPanY;
    public boolean pinchHasTargetCard;
    public float pinchLastCentroidX;
    public float pinchLastCentroidY;
    public float pinchLastScreenHeight;
    public float pinchLastScreenWidth;
    public float pinchLogZoomVelocity;
    public final float[] pinchSpringScratch;
    public float pinchStartCameraZ;
    public float pinchStartPanX;
    public float pinchStartPanY;
    public int pinchTargetCardCol;
    public int pinchTargetCardRow;
    public float pinchTargetLogZoom;
    public float screenAspectRatio = 0.5f;
    public Pair trackingCell;
    public float trackingStartCameraZ;
    public float trackingStartPanX;
    public float trackingStartPanY;
    public final ArrayDeque velocitySamples;
    public final ZoomAnimator zoomAnimator;
    public ZoomLevel zoomOriginBeforeNear;

    public final class TappedCell {
        public final int canonicalIndex;
        public final int virtualCol;
        public final int virtualRow;

        public TappedCell(int i, int i2, int i3) {
            this.virtualCol = i;
            this.virtualRow = i2;
            this.canonicalIndex = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TappedCell)) {
                return false;
            }
            TappedCell tappedCell = (TappedCell) obj;
            return this.virtualCol == tappedCell.virtualCol && this.virtualRow == tappedCell.virtualRow && this.canonicalIndex == tappedCell.canonicalIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.canonicalIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.virtualRow, Integer.hashCode(this.virtualCol) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.canonicalIndex, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.virtualCol, this.virtualRow, "TappedCell(virtualCol=", ", virtualRow=", ", canonicalIndex="));
        }
    }

    public final class VelocitySample {
        public final float dtSeconds;
        public final float dx;
        public final float dy;

        public VelocitySample(float f, float f2, float f3) {
            this.dx = f;
            this.dy = f2;
            this.dtSeconds = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VelocitySample)) {
                return false;
            }
            VelocitySample velocitySample = (VelocitySample) obj;
            return Float.compare(this.dx, velocitySample.dx) == 0 && Float.compare(this.dy, velocitySample.dy) == 0 && Float.compare(this.dtSeconds, velocitySample.dtSeconds) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.dtSeconds) + CameraState$Type$EnumUnboxingLocalUtility.m(this.dy, Float.hashCode(this.dx) * 31, 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(this.dtSeconds, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VelocitySample(dx=", this.dx, ", dy=", this.dy, ", dtSeconds="));
        }
    }

    public GridInteractionController(ZoomAnimator zoomAnimator) {
        this.zoomAnimator = zoomAnimator;
        ZoomLevel zoomLevel = ZoomLevel.FAR;
        this.zoomOriginBeforeNear = zoomLevel;
        this.velocitySamples = new ArrayDeque(5);
        this.pinchBaseZoom = zoomLevel;
        this.flingTargetCol = PKIFailureInfo.systemUnavail;
        this.flingTargetRow = PKIFailureInfo.systemUnavail;
        this.pinchSpringScratch = new float[2];
    }

    public static boolean isInsideVisibleFarTile(float f, float f2, int i, int i2, GridConfig gridConfig, GridRenderParams gridRenderParams) {
        gridConfig.getClass();
        float f3 = gridRenderParams.stepX;
        int i3 = gridConfig.rows;
        float f4 = gridRenderParams.stepY;
        float f5 = ((i3 - 1) * f4) / 2.0f;
        int roundToInt = MathKt__MathJVMKt.roundToInt((f + ((3.0f * f3) / 2.0f)) / f3);
        int i4 = roundToInt / 4;
        if ((roundToInt ^ 4) < 0 && i4 * 4 != roundToInt) {
            i4--;
        }
        int i5 = i4 * 4;
        int roundToInt2 = MathKt__MathJVMKt.roundToInt((f2 + f5) / f4);
        int i6 = roundToInt2 / i3;
        if ((roundToInt2 ^ i3) < 0 && i6 * i3 != roundToInt2) {
            i6--;
        }
        int i7 = i - i5;
        int i8 = i2 - (i6 * i3);
        return i8 >= 0 && i8 < i3 && i7 >= 0 && i7 < 4 && (i8 * 4) + i7 < gridConfig.cardCount;
    }

    public final void applyFarRestOffset() {
        GridConfig gridConfig = this.gridConfig;
        if (gridConfig == null) {
            return;
        }
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        float f = zoomAnimator.farRestOffsetY;
        float farRestOffsetY = farRestOffsetY(gridConfig);
        zoomAnimator.farRestOffsetY = farRestOffsetY;
        float f2 = zoomAnimator.farTileOriginY;
        Pair farPanBounds = farPanBounds(gridConfig);
        float floatValue = ((Number) farPanBounds.first).floatValue();
        float floatValue2 = ((Number) farPanBounds.second).floatValue();
        float f3 = floatValue + f2;
        zoomAnimator.farPanMinY = f3;
        float f4 = f2 + floatValue2;
        zoomAnimator.farPanMaxY = f4;
        if (zoomAnimator.targetZoom != ZoomLevel.FAR || zoomAnimator.isAnimating()) {
            return;
        }
        zoomAnimator.panY = RangesKt___RangesKt.coerceIn((farRestOffsetY - f) + zoomAnimator.panY, f3, f4);
    }

    public final void centerOnNearestCard() {
        GridConfig gridConfig = this.gridConfig;
        if (gridConfig == null) {
            return;
        }
        GridRenderParams renderParams = GridLayout.getRenderParams(ZoomLevel.MEDIUM, gridConfig);
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        Pair findNearestCellIndices = GridLayout.findNearestCellIndices(zoomAnimator.panX, zoomAnimator.panY, gridConfig, renderParams);
        int intValue = ((Number) findNearestCellIndices.first).intValue();
        int intValue2 = ((Number) findNearestCellIndices.second).intValue();
        Pair position = GridLayout.position(intValue, intValue2, gridConfig, renderParams);
        float floatValue = ((Number) position.first).floatValue();
        float floatValue2 = ((Number) position.second).floatValue();
        Integer cardMetadataIndex = GridLayout.cardMetadataIndex(intValue2, intValue, gridConfig);
        if (cardMetadataIndex != null) {
            this.lastExploredCanonicalIndex = Integer.valueOf(cardMetadataIndex.intValue());
        }
        ZoomAnimator.animatePanTo$default(zoomAnimator, floatValue, -floatValue2);
    }

    public final GridRenderParams currentRenderParams$views() {
        GridConfig gridConfig = this.gridConfig;
        if (gridConfig == null) {
            return GridLayout.getRenderParams(ZoomLevel.FAR, zzd.create$default(1.0f, 1.0f, 1));
        }
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        GridRenderParams renderParams = GridLayout.getRenderParams(zoomAnimator.currentZoom, gridConfig);
        GridRenderParams renderParams2 = GridLayout.getRenderParams(zoomAnimator.targetZoom, gridConfig);
        float coerceIn = RangesKt___RangesKt.coerceIn(zoomAnimator.getEasedProgress(), RecyclerView.DECELERATION_RATE, 1.0f);
        float f = renderParams.cameraZ;
        float f2 = renderParams.staggerAmount;
        float f3 = f - (-3.0f);
        float f4 = renderParams2.cameraZ;
        float f5 = renderParams2.staggerAmount;
        float f6 = f4 - (-3.0f);
        if (f3 != f6) {
            f = (1.0f / GridLayout.lerp(1.0f / f3, 1.0f / f6, coerceIn)) - 3.0f;
        }
        float f7 = f;
        float f8 = f7 - (-3.0f);
        return new GridRenderParams(GridLayout.lerp(renderParams.stepX, renderParams2.stepX, coerceIn), GridLayout.lerp(renderParams.stepY, renderParams2.stepY, coerceIn), (f3 != f6 && f8 > RecyclerView.DECELERATION_RATE) ? GridLayout.lerp(f2 / f3, f5 / f6, coerceIn) * f8 : GridLayout.lerp(f2, f5, coerceIn), GridLayout.lerp(renderParams.nonCanonicalOpacity, renderParams2.nonCanonicalOpacity, coerceIn), f7, GridLayout.lerp(renderParams.miniCardScaleMultiplier, renderParams2.miniCardScaleMultiplier, coerceIn));
    }

    public final Pair farPanBounds(GridConfig gridConfig) {
        float tan = ((float) Math.tan((float) Math.toRadians(25.0d))) * 28.0f;
        float f = ((gridConfig.rows - 1) * gridConfig.farStepY) / 2.0f;
        float farRestOffsetY = farRestOffsetY(gridConfig);
        float f2 = (-tan) + f + 0.6f;
        if (f2 < farRestOffsetY) {
            f2 = farRestOffsetY;
        }
        return new Pair(Float.valueOf(farRestOffsetY), Float.valueOf(f2));
    }

    public final float farRestOffsetY(GridConfig gridConfig) {
        float tan = ((((float) Math.tan((float) Math.toRadians(25.0d))) * 28.0f) * 0.6f) - (((gridConfig.rows - 1) * gridConfig.farStepY) / 2.0f);
        return tan < RecyclerView.DECELERATION_RATE ? RecyclerView.DECELERATION_RATE : tan;
    }

    public final TappedCell findCellAtScreenPosition(float f, float f2, float f3, float f4, GridConfig gridConfig, GridRenderParams gridRenderParams, ZoomLevel zoomLevel) {
        Pair screenToWorldOffset = screenToWorldOffset(f, f2, f3, f4, gridRenderParams.cameraZ);
        float floatValue = ((Number) screenToWorldOffset.first).floatValue();
        float floatValue2 = ((Number) screenToWorldOffset.second).floatValue();
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        Pair findNearestCellIndices = GridLayout.findNearestCellIndices(zoomAnimator.panX + floatValue, zoomAnimator.panY - floatValue2, gridConfig, gridRenderParams);
        int intValue = ((Number) findNearestCellIndices.first).intValue();
        int intValue2 = ((Number) findNearestCellIndices.second).intValue();
        Integer cardMetadataIndex = GridLayout.cardMetadataIndex(intValue2, intValue, gridConfig);
        if (cardMetadataIndex == null) {
            return null;
        }
        int intValue3 = cardMetadataIndex.intValue();
        if (zoomLevel != ZoomLevel.FAR || isInsideVisibleFarTile(zoomAnimator.panX, zoomAnimator.panY, intValue, intValue2, gridConfig, gridRenderParams)) {
            return new TappedCell(intValue, intValue2, intValue3);
        }
        return null;
    }

    public final boolean isUserInteracting() {
        return this.isDragging || this.isPinching;
    }

    public final Pair screenToWorldOffset(float f, float f2, float f3, float f4, float f5) {
        float tan = ((float) Math.tan((float) Math.toRadians(25.0d))) * (f5 - (-3.0f));
        float f6 = this.screenAspectRatio;
        return new Pair(Float.valueOf((((f / f3) * 2.0f) - 1.0f) * Float.valueOf(f6 > RecyclerView.DECELERATION_RATE ? f6 * tan : tan).floatValue()), Float.valueOf((-(((f2 / f4) * 2.0f) - 1.0f)) * Float.valueOf(tan).floatValue()));
    }

    public final void setUpMediumTrackingBlend(GridConfig gridConfig, ZoomLevel zoomLevel, float f, float f2, float f3) {
        Pair nearestVirtualCellForCanonical;
        int intValue;
        ZoomLevel zoomLevel2 = ZoomLevel.NEAR;
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        if (zoomLevel == zoomLevel2) {
            nearestVirtualCellForCanonical = new Pair(Integer.valueOf(zoomAnimator.focusedCol), Integer.valueOf(zoomAnimator.focusedRow));
        } else {
            Pair findNearestCellIndices = GridLayout.findNearestCellIndices(f, f2, gridConfig, GridLayout.getRenderParams(ZoomLevel.MEDIUM, gridConfig));
            int intValue2 = ((Number) findNearestCellIndices.first).intValue();
            int intValue3 = ((Number) findNearestCellIndices.second).intValue();
            Integer num = this.lastExploredCanonicalIndex;
            if (num == null || (intValue = num.intValue()) < 0 || intValue >= gridConfig.cardCount) {
                num = null;
            }
            nearestVirtualCellForCanonical = num != null ? GridLayout.nearestVirtualCellForCanonical(num.intValue(), intValue2, intValue3, gridConfig) : new Pair(Integer.valueOf(intValue2), Integer.valueOf(intValue3));
        }
        this.trackingCell = new Pair(Integer.valueOf(((Number) nearestVirtualCellForCanonical.first).intValue()), Integer.valueOf(((Number) nearestVirtualCellForCanonical.second).intValue()));
        this.trackingStartPanX = f;
        this.trackingStartPanY = f2;
        this.trackingStartCameraZ = f3;
        this.blendingToFarRest = false;
        zoomAnimator.panAnimProgress = 1.0f;
    }

    public final void zoomToNear(TappedCell tappedCell, ZoomLevel zoomLevel) {
        int i = tappedCell.canonicalIndex;
        this.zoomOriginBeforeNear = zoomLevel;
        GridConfig gridConfig = this.gridConfig;
        if (gridConfig == null) {
            return;
        }
        this.trackingStartCameraZ = GridLayout.getRenderParams(zoomLevel, gridConfig).cameraZ;
        int i2 = tappedCell.virtualRow;
        int i3 = tappedCell.virtualCol;
        this.lastExploredCanonicalIndex = Integer.valueOf(i);
        ZoomAnimator zoomAnimator = this.zoomAnimator;
        zoomAnimator.focusedCol = i3;
        zoomAnimator.focusedRow = i2;
        zoomAnimator.focusedCardIndex = i;
        zoomAnimator.zoomTo(ZoomLevel.NEAR);
        this.trackingCell = new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
        this.trackingStartPanX = zoomAnimator.panX;
        this.trackingStartPanY = zoomAnimator.panY;
    }
}
