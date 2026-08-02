package androidx.camera.viewfinder.compose;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.camera.viewfinder.core.impl.TransformationsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.moneybot.views.shared.PlaceableRow;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewfinderKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda8(int i, ArrayList arrayList, int i2, ArrayList arrayList2, ArrayList arrayList3, int i3) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = arrayList;
        this.f$2 = i2;
        this.f$3 = arrayList2;
        this.f$8 = arrayList3;
        this.f$4 = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SizeF sizeF;
        float width;
        float width2;
        float f;
        LayoutDirection layoutDirection;
        float f2;
        RectF rectF;
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj2 = this.f$8;
        int i3 = this.f$2;
        int i4 = this.f$1;
        Object obj3 = this.f$3;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Constraints constraints = (Constraints) obj4;
                TransformationInfo transformationInfo = (TransformationInfo) obj3;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Size size = new Size(Constraints.m1025getMaxWidthimpl(constraints.value), Constraints.m1024getMaxHeightimpl(constraints.value));
                Size size2 = new Size(i4, i3);
                RectF cropRectFor = Transformations.cropRectFor(transformationInfo, size2);
                int i5 = transformationInfo.sourceRotation;
                if (i5 != 0) {
                    if (i5 != 90) {
                        if (i5 != 180) {
                            if (i5 != 270) {
                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Invalid rotation degrees: "));
                                return null;
                            }
                        }
                    }
                    sizeF = new SizeF(cropRectFor.height(), cropRectFor.width());
                    width = (sizeF.getWidth() + 1.0f) / (sizeF.getHeight() - 1.0f);
                    float width3 = (sizeF.getWidth() - 1.0f) / (sizeF.getHeight() + 1.0f);
                    width2 = size.getWidth() / size.getHeight();
                    if (width >= width2 || width2 < width3) {
                        Matrix matrix = new Matrix();
                        SizeF sizeF2 = new SizeF(size.getWidth(), size.getHeight());
                        long Size = DimensionKt.Size(sizeF.getWidth(), sizeF.getHeight());
                        long Size2 = DimensionKt.Size(sizeF2.getWidth(), sizeF2.getHeight());
                        f = 1.0f;
                        float max = Math.max(Float.intBitsToFloat((int) (Size2 >> 32)) / Float.intBitsToFloat((int) (Size >> 32)), Float.intBitsToFloat((int) (Size2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (Size & BodyPartID.bodyIdMax)));
                        long floatToRawIntBits = (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(max) << 32);
                        int i6 = ScaleFactor.$r8$clinit;
                        float m857getScaleXimpl = ScaleFactor.m857getScaleXimpl(floatToRawIntBits);
                        float m858getScaleYimpl = ScaleFactor.m858getScaleYimpl(floatToRawIntBits);
                        RectF rectF2 = TransformationsKt.NORMALIZED_RECT;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(m858getScaleYimpl) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m857getScaleXimpl) << 32);
                        int i7 = (int) (floatToRawIntBits2 >> 32);
                        float intBitsToFloat = Float.intBitsToFloat(i7);
                        int i8 = (int) (floatToRawIntBits2 & BodyPartID.bodyIdMax);
                        matrix.setScale(intBitsToFloat, Float.intBitsToFloat(i8));
                        SizeF sizeF3 = new SizeF(Float.intBitsToFloat(i7) * sizeF.getWidth(), Float.intBitsToFloat(i8) * sizeF.getHeight());
                        SizeF sizeF4 = new SizeF(size.getWidth(), size.getHeight());
                        long IntSize = Countries.IntSize(Math.round(sizeF3.getWidth()), Math.round(sizeF3.getHeight()));
                        long IntSize2 = Countries.IntSize(Math.round(sizeF4.getWidth()), Math.round(sizeF4.getHeight()));
                        if (i2 != 0) {
                            layoutDirection = LayoutDirection.Ltr;
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Invalid layout direction: "));
                                return null;
                            }
                            layoutDirection = LayoutDirection.Rtl;
                        }
                        f2 = -1.0f;
                        float f3 = (((int) (IntSize2 >> 32)) - ((int) (IntSize >> 32))) / 2.0f;
                        float f4 = (((int) (IntSize2 & BodyPartID.bodyIdMax)) - ((int) (IntSize & BodyPartID.bodyIdMax))) / 2.0f;
                        float f5 = layoutDirection != LayoutDirection.Ltr ? 0.0f : (-1.0f) * RecyclerView.DECELERATION_RATE;
                        long round = (Math.round((1.0f + RecyclerView.DECELERATION_RATE) * f4) & BodyPartID.bodyIdMax) | (Math.round((1.0f + f5) * f3) << 32);
                        long floatToRawIntBits3 = (Float.floatToRawIntBits((int) (round >> 32)) << 32) | (Float.floatToRawIntBits((int) (round & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                        matrix.postTranslate(Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits3 & BodyPartID.bodyIdMax)));
                        rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, sizeF.getWidth(), sizeF.getHeight());
                        matrix.mapRect(rectF);
                    } else {
                        rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight());
                        f = 1.0f;
                        f2 = -1.0f;
                    }
                    RectF cropRectFor2 = Transformations.cropRectFor(transformationInfo, size2);
                    Matrix matrix2 = new Matrix();
                    RectF rectF3 = TransformationsKt.NORMALIZED_RECT;
                    Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                    matrix2.setRectToRect(cropRectFor2, rectF3, scaleToFit);
                    matrix2.postRotate(i5);
                    Matrix matrix3 = new Matrix();
                    matrix3.setRectToRect(rectF3, rectF, scaleToFit);
                    matrix2.postConcat(matrix3);
                    if (transformationInfo.isSourceMirroredHorizontally) {
                        matrix2.preScale(f2, f, cropRectFor2.centerX(), cropRectFor2.centerY());
                    }
                    float f6 = i4;
                    float f7 = i3;
                    RectF rectF4 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f6, f7);
                    matrix2.mapRect(rectF4);
                    reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                    reusableGraphicsLayerScope.setScaleX(rectF4.width() / f6);
                    reusableGraphicsLayerScope.setScaleY(rectF4.height() / f7);
                    reusableGraphicsLayerScope.setTranslationX(rectF4.left);
                    reusableGraphicsLayerScope.setTranslationY(rectF4.top);
                    return Unit.INSTANCE;
                }
                sizeF = new SizeF(cropRectFor.width(), cropRectFor.height());
                width = (sizeF.getWidth() + 1.0f) / (sizeF.getHeight() - 1.0f);
                float width32 = (sizeF.getWidth() - 1.0f) / (sizeF.getHeight() + 1.0f);
                width2 = size.getWidth() / size.getHeight();
                if (width >= width2) {
                }
                Matrix matrix4 = new Matrix();
                SizeF sizeF22 = new SizeF(size.getWidth(), size.getHeight());
                long Size3 = DimensionKt.Size(sizeF.getWidth(), sizeF.getHeight());
                long Size22 = DimensionKt.Size(sizeF22.getWidth(), sizeF22.getHeight());
                f = 1.0f;
                float max2 = Math.max(Float.intBitsToFloat((int) (Size22 >> 32)) / Float.intBitsToFloat((int) (Size3 >> 32)), Float.intBitsToFloat((int) (Size22 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (Size3 & BodyPartID.bodyIdMax)));
                long floatToRawIntBits4 = (Float.floatToRawIntBits(max2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(max2) << 32);
                int i62 = ScaleFactor.$r8$clinit;
                float m857getScaleXimpl2 = ScaleFactor.m857getScaleXimpl(floatToRawIntBits4);
                float m858getScaleYimpl2 = ScaleFactor.m858getScaleYimpl(floatToRawIntBits4);
                RectF rectF22 = TransformationsKt.NORMALIZED_RECT;
                long floatToRawIntBits22 = (Float.floatToRawIntBits(m858getScaleYimpl2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m857getScaleXimpl2) << 32);
                int i72 = (int) (floatToRawIntBits22 >> 32);
                float intBitsToFloat2 = Float.intBitsToFloat(i72);
                int i82 = (int) (floatToRawIntBits22 & BodyPartID.bodyIdMax);
                matrix4.setScale(intBitsToFloat2, Float.intBitsToFloat(i82));
                SizeF sizeF32 = new SizeF(Float.intBitsToFloat(i72) * sizeF.getWidth(), Float.intBitsToFloat(i82) * sizeF.getHeight());
                SizeF sizeF42 = new SizeF(size.getWidth(), size.getHeight());
                long IntSize3 = Countries.IntSize(Math.round(sizeF32.getWidth()), Math.round(sizeF32.getHeight()));
                long IntSize22 = Countries.IntSize(Math.round(sizeF42.getWidth()), Math.round(sizeF42.getHeight()));
                if (i2 != 0) {
                }
                f2 = -1.0f;
                float f32 = (((int) (IntSize22 >> 32)) - ((int) (IntSize3 >> 32))) / 2.0f;
                float f42 = (((int) (IntSize22 & BodyPartID.bodyIdMax)) - ((int) (IntSize3 & BodyPartID.bodyIdMax))) / 2.0f;
                if (layoutDirection != LayoutDirection.Ltr) {
                }
                long round2 = (Math.round((1.0f + RecyclerView.DECELERATION_RATE) * f42) & BodyPartID.bodyIdMax) | (Math.round((1.0f + f5) * f32) << 32);
                long floatToRawIntBits32 = (Float.floatToRawIntBits((int) (round2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (round2 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                matrix4.postTranslate(Float.intBitsToFloat((int) (floatToRawIntBits32 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits32 & BodyPartID.bodyIdMax)));
                rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, sizeF.getWidth(), sizeF.getHeight());
                matrix4.mapRect(rectF);
                RectF cropRectFor22 = Transformations.cropRectFor(transformationInfo, size2);
                Matrix matrix22 = new Matrix();
                RectF rectF32 = TransformationsKt.NORMALIZED_RECT;
                Matrix.ScaleToFit scaleToFit2 = Matrix.ScaleToFit.FILL;
                matrix22.setRectToRect(cropRectFor22, rectF32, scaleToFit2);
                matrix22.postRotate(i5);
                Matrix matrix32 = new Matrix();
                matrix32.setRectToRect(rectF32, rectF, scaleToFit2);
                matrix22.postConcat(matrix32);
                if (transformationInfo.isSourceMirroredHorizontally) {
                }
                float f62 = i4;
                float f72 = i3;
                RectF rectF42 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f62, f72);
                matrix22.mapRect(rectF42);
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                reusableGraphicsLayerScope.setScaleX(rectF42.width() / f62);
                reusableGraphicsLayerScope.setScaleY(rectF42.height() / f72);
                reusableGraphicsLayerScope.setTranslationX(rectF42.left);
                reusableGraphicsLayerScope.setTranslationY(rectF42.top);
                return Unit.INSTANCE;
            case 1:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.placeRelative((Placeable) obj4, i4, i3, RecyclerView.DECELERATION_RATE);
                placementScope.placeRelative((Placeable) obj3, i2, ((Ref$IntRef) obj2).element, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                Iterator it = ((ArrayList) obj4).iterator();
                while (it.hasNext()) {
                    int i9 = 0;
                    int i10 = 0;
                    for (Object obj5 : ((PlaceableRow) it.next()).idxs) {
                        int i11 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        int intValue = ((Number) obj5).intValue();
                        Object obj6 = arrayList.get(intValue);
                        obj6.getClass();
                        Placeable placeable = (Placeable) obj6;
                        Object obj7 = arrayList2.get(intValue);
                        obj7.getClass();
                        int intValue2 = ((Number) obj7).intValue();
                        if (i9 > 0) {
                            i10 += i2;
                        }
                        placementScope2.placeRelative(placeable, i10, i4 - intValue2, RecyclerView.DECELERATION_RATE);
                        i10 += placeable.width;
                        i9 = i11;
                    }
                    i4 += i3;
                }
                return Unit.INSTANCE;
            default:
                Placeable.PlacementScope placementScope3 = (Placeable.PlacementScope) obj;
                placementScope3.getClass();
                placementScope3.placeRelative((Placeable) obj4, 0, 0, RecyclerView.DECELERATION_RATE);
                placementScope3.placeRelative((Placeable) obj3, i4 + i3, 0, RecyclerView.DECELERATION_RATE);
                placementScope3.placeRelative((Placeable) obj2, 0, i2 + i3, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda8(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3) {
        this.$r8$classId = 3;
        this.f$0 = placeable;
        this.f$3 = placeable2;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$8 = placeable3;
        this.f$4 = i3;
    }

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda8(Object obj, int i, int i2, Object obj2, int i3, Object obj3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = obj2;
        this.f$4 = i3;
        this.f$8 = obj3;
    }
}
