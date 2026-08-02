package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\f\u0010V\u001a\u00020W*\u00020XH\u0014R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR/\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001e\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010\t\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001e\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010AR+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u001e\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001e\u001a\u0004\bG\u0010\u001a\"\u0004\bH\u0010\u001cR+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR+\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u001e\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0010\u0010U\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Lcom/airbnb/lottie/compose/LottiePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;)V", "<set-?>", "getApplyOpacityToLayers$lottie_compose_release", "()Z", "setApplyOpacityToLayers$lottie_compose_release", "(Z)V", "applyOpacityToLayers$delegate", "Landroidx/compose/runtime/MutableState;", "getAsyncUpdates$lottie_compose_release", "()Lcom/airbnb/lottie/AsyncUpdates;", "setAsyncUpdates$lottie_compose_release", "(Lcom/airbnb/lottie/AsyncUpdates;)V", "asyncUpdates$delegate", "getClipTextToBoundingBox$lottie_compose_release", "setClipTextToBoundingBox$lottie_compose_release", "clipTextToBoundingBox$delegate", "getClipToCompositionBounds$lottie_compose_release", "setClipToCompositionBounds$lottie_compose_release", "clipToCompositionBounds$delegate", "getComposition$lottie_compose_release", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "getDynamicProperties$lottie_compose_release", "()Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "setDynamicProperties$lottie_compose_release", "(Lcom/airbnb/lottie/compose/LottieDynamicProperties;)V", "dynamicProperties$delegate", "getEnableMergePaths$lottie_compose_release", "setEnableMergePaths$lottie_compose_release", "enableMergePaths$delegate", "getFontMap$lottie_compose_release", "()Ljava/util/Map;", "setFontMap$lottie_compose_release", "(Ljava/util/Map;)V", "fontMap$delegate", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "getMaintainOriginalImageBounds$lottie_compose_release", "setMaintainOriginalImageBounds$lottie_compose_release", "maintainOriginalImageBounds$delegate", "matrix", "Landroid/graphics/Matrix;", "getOutlineMasksAndMattes$lottie_compose_release", "setOutlineMasksAndMattes$lottie_compose_release", "outlineMasksAndMattes$delegate", "getProgress$lottie_compose_release", "()F", "setProgress$lottie_compose_release", "(F)V", "progress$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getRenderMode$lottie_compose_release", "()Lcom/airbnb/lottie/RenderMode;", "setRenderMode$lottie_compose_release", "(Lcom/airbnb/lottie/RenderMode;)V", "renderMode$delegate", "setDynamicProperties", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottiePainter extends Painter {
    public static final int $stable = 8;

    /* renamed from: applyOpacityToLayers$delegate, reason: from kotlin metadata */
    private final MutableState applyOpacityToLayers;

    /* renamed from: asyncUpdates$delegate, reason: from kotlin metadata */
    private final MutableState asyncUpdates;

    /* renamed from: clipTextToBoundingBox$delegate, reason: from kotlin metadata */
    private final MutableState clipTextToBoundingBox;

    /* renamed from: clipToCompositionBounds$delegate, reason: from kotlin metadata */
    private final MutableState clipToCompositionBounds;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    private final MutableState composition;
    private final LottieDrawable drawable;

    /* renamed from: dynamicProperties$delegate, reason: from kotlin metadata */
    private final MutableState dynamicProperties;

    /* renamed from: enableMergePaths$delegate, reason: from kotlin metadata */
    private final MutableState enableMergePaths;

    /* renamed from: fontMap$delegate, reason: from kotlin metadata */
    private final MutableState fontMap;

    /* renamed from: maintainOriginalImageBounds$delegate, reason: from kotlin metadata */
    private final MutableState maintainOriginalImageBounds;
    private final Matrix matrix;

    /* renamed from: outlineMasksAndMattes$delegate, reason: from kotlin metadata */
    private final MutableState outlineMasksAndMattes;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final MutableFloatState progress;

    /* renamed from: renderMode$delegate, reason: from kotlin metadata */
    private final MutableState renderMode;
    private LottieDynamicProperties setDynamicProperties;

    public LottiePainter(LottieComposition lottieComposition, float f, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, boolean z5, boolean z6, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates) {
        renderMode.getClass();
        asyncUpdates.getClass();
        this.composition = Updater.mutableStateOf$default(lottieComposition);
        this.progress = new ParcelableSnapshotMutableFloatState(f);
        this.outlineMasksAndMattes = Updater.mutableStateOf$default(Boolean.valueOf(z));
        this.applyOpacityToLayers = Updater.mutableStateOf$default(Boolean.valueOf(z2));
        this.enableMergePaths = Updater.mutableStateOf$default(Boolean.valueOf(z3));
        this.renderMode = Updater.mutableStateOf$default(renderMode);
        this.maintainOriginalImageBounds = Updater.mutableStateOf$default(Boolean.valueOf(z4));
        this.dynamicProperties = Updater.mutableStateOf$default(lottieDynamicProperties);
        this.clipToCompositionBounds = Updater.mutableStateOf$default(Boolean.valueOf(z5));
        this.fontMap = Updater.mutableStateOf$default(map);
        this.asyncUpdates = Updater.mutableStateOf$default(asyncUpdates);
        this.clipTextToBoundingBox = Updater.mutableStateOf$default(Boolean.valueOf(z6));
        this.drawable = new LottieDrawable();
        this.matrix = new Matrix();
    }

    public final boolean getApplyOpacityToLayers$lottie_compose_release() {
        return ((Boolean) this.applyOpacityToLayers.getValue()).booleanValue();
    }

    public final AsyncUpdates getAsyncUpdates$lottie_compose_release() {
        return (AsyncUpdates) this.asyncUpdates.getValue();
    }

    public final boolean getClipTextToBoundingBox$lottie_compose_release() {
        return ((Boolean) this.clipTextToBoundingBox.getValue()).booleanValue();
    }

    public final boolean getClipToCompositionBounds$lottie_compose_release() {
        return ((Boolean) this.clipToCompositionBounds.getValue()).booleanValue();
    }

    public final LottieComposition getComposition$lottie_compose_release() {
        return (LottieComposition) this.composition.getValue();
    }

    public final LottieDynamicProperties getDynamicProperties$lottie_compose_release() {
        return (LottieDynamicProperties) this.dynamicProperties.getValue();
    }

    public final boolean getEnableMergePaths$lottie_compose_release() {
        return ((Boolean) this.enableMergePaths.getValue()).booleanValue();
    }

    public final Map<String, Typeface> getFontMap$lottie_compose_release() {
        return (Map) this.fontMap.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo759getIntrinsicSizeNHjbRc() {
        if (getComposition$lottie_compose_release() == null) {
            return 9205357640488583168L;
        }
        return DimensionKt.Size(r2.getBounds().width(), r2.getBounds().height());
    }

    public final boolean getMaintainOriginalImageBounds$lottie_compose_release() {
        return ((Boolean) this.maintainOriginalImageBounds.getValue()).booleanValue();
    }

    public final boolean getOutlineMasksAndMattes$lottie_compose_release() {
        return ((Boolean) this.outlineMasksAndMattes.getValue()).booleanValue();
    }

    public final float getProgress$lottie_compose_release() {
        return ((ParcelableSnapshotMutableFloatState) this.progress).getFloatValue();
    }

    public final RenderMode getRenderMode$lottie_compose_release() {
        return (RenderMode) this.renderMode.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        LottieComposition composition$lottie_compose_release = getComposition$lottie_compose_release();
        if (composition$lottie_compose_release == null) {
            return;
        }
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        long Size = DimensionKt.Size(composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        long IntSize = Countries.IntSize(MathKt__MathJVMKt.roundToInt(Size.m643getWidthimpl(drawScope.mo753getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m640getHeightimpl(drawScope.mo753getSizeNHjbRc())));
        this.matrix.reset();
        this.matrix.preScale(((int) (IntSize >> 32)) / Size.m643getWidthimpl(Size), ((int) (IntSize & BodyPartID.bodyIdMax)) / Size.m640getHeightimpl(Size));
        this.drawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, getEnableMergePaths$lottie_compose_release());
        this.drawable.setRenderMode(getRenderMode$lottie_compose_release());
        this.drawable.setAsyncUpdates(getAsyncUpdates$lottie_compose_release());
        this.drawable.setComposition(composition$lottie_compose_release);
        this.drawable.setFontMap(getFontMap$lottie_compose_release());
        LottieDynamicProperties dynamicProperties$lottie_compose_release = getDynamicProperties$lottie_compose_release();
        LottieDynamicProperties lottieDynamicProperties = this.setDynamicProperties;
        if (dynamicProperties$lottie_compose_release != lottieDynamicProperties) {
            if (lottieDynamicProperties != null) {
                lottieDynamicProperties.removeFrom$lottie_compose_release(this.drawable);
            }
            LottieDynamicProperties dynamicProperties$lottie_compose_release2 = getDynamicProperties$lottie_compose_release();
            if (dynamicProperties$lottie_compose_release2 != null) {
                dynamicProperties$lottie_compose_release2.addTo$lottie_compose_release(this.drawable);
            }
            this.setDynamicProperties = getDynamicProperties$lottie_compose_release();
        }
        this.drawable.setOutlineMasksAndMattes(getOutlineMasksAndMattes$lottie_compose_release());
        this.drawable.setApplyingOpacityToLayersEnabled(getApplyOpacityToLayers$lottie_compose_release());
        this.drawable.setMaintainOriginalImageBounds(getMaintainOriginalImageBounds$lottie_compose_release());
        this.drawable.setClipToCompositionBounds(getClipToCompositionBounds$lottie_compose_release());
        this.drawable.setClipTextToBoundingBox(getClipTextToBoundingBox$lottie_compose_release());
        this.drawable.setProgress(getProgress$lottie_compose_release());
        this.drawable.setBounds(0, 0, composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        this.drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), this.matrix);
    }

    public final void setApplyOpacityToLayers$lottie_compose_release(boolean z) {
        this.applyOpacityToLayers.setValue(Boolean.valueOf(z));
    }

    public final void setAsyncUpdates$lottie_compose_release(AsyncUpdates asyncUpdates) {
        asyncUpdates.getClass();
        this.asyncUpdates.setValue(asyncUpdates);
    }

    public final void setClipTextToBoundingBox$lottie_compose_release(boolean z) {
        this.clipTextToBoundingBox.setValue(Boolean.valueOf(z));
    }

    public final void setClipToCompositionBounds$lottie_compose_release(boolean z) {
        this.clipToCompositionBounds.setValue(Boolean.valueOf(z));
    }

    public final void setComposition$lottie_compose_release(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    public final void setDynamicProperties$lottie_compose_release(LottieDynamicProperties lottieDynamicProperties) {
        this.dynamicProperties.setValue(lottieDynamicProperties);
    }

    public final void setEnableMergePaths$lottie_compose_release(boolean z) {
        this.enableMergePaths.setValue(Boolean.valueOf(z));
    }

    public final void setFontMap$lottie_compose_release(Map<String, ? extends Typeface> map) {
        this.fontMap.setValue(map);
    }

    public final void setMaintainOriginalImageBounds$lottie_compose_release(boolean z) {
        this.maintainOriginalImageBounds.setValue(Boolean.valueOf(z));
    }

    public final void setOutlineMasksAndMattes$lottie_compose_release(boolean z) {
        this.outlineMasksAndMattes.setValue(Boolean.valueOf(z));
    }

    public final void setProgress$lottie_compose_release(float f) {
        ((ParcelableSnapshotMutableFloatState) this.progress).setFloatValue(f);
    }

    public final void setRenderMode$lottie_compose_release(RenderMode renderMode) {
        renderMode.getClass();
        this.renderMode.setValue(renderMode);
    }

    public /* synthetic */ LottiePainter(LottieComposition lottieComposition, float f, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, boolean z5, boolean z6, Map map, AsyncUpdates asyncUpdates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lottieComposition, (i & 2) != 0 ? RecyclerView.DECELERATION_RATE : f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? RenderMode.AUTOMATIC : renderMode, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : lottieDynamicProperties, (i & 256) != 0 ? true : z5, (i & 512) == 0 ? z6 : false, (i & 1024) == 0 ? map : null, (i & 2048) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates);
    }

    public LottiePainter() {
        this(null, RecyclerView.DECELERATION_RATE, false, false, false, null, false, null, false, false, null, null, 4095, null);
    }
}
