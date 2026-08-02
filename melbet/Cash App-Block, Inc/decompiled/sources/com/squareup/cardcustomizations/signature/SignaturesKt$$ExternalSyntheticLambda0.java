package com.squareup.cardcustomizations.signature;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cardcustomizations.signature.Point;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class SignaturesKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ SignaturesKt$$ExternalSyntheticLambda0(Constraints constraints, float f, Placeable placeable, boolean z, float f2, int i, List list) {
        this.f$0 = constraints;
        this.f$2 = f;
        this.f$5 = placeable;
        this.f$1 = z;
        this.f$4 = f2;
        this.f$3 = i;
        this.f$6 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$6;
        float f = this.f$4;
        boolean z = this.f$1;
        Object obj3 = this.f$5;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                SignatureState signatureState = (SignatureState) obj4;
                Shape shape = (Shape) obj3;
                Density density = (Density) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                long mo838getSizeYbymL2g = layoutCoordinates.mo838getSizeYbymL2g();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = signatureState.signatureSize$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = signatureState.signature$delegate;
                parcelableSnapshotMutableState.setValue(new IntSize(mo838getSizeYbymL2g));
                long m2966getSignatureOffsetF1C5BW0$customizations = signatureState.m2966getSignatureOffsetF1C5BW0$customizations();
                if (z) {
                    Recorder$$ExternalSyntheticOutline1.m(layoutCoordinates.mo843localToWindowMKHz9U(0L), signatureState.signatureOffset$delegate);
                }
                AndroidPath clipPath$customizations = signatureState.getClipPath$customizations();
                clipPath$customizations.reset();
                float f2 = f * 2.0f;
                ColorKt.addOutline(clipPath$customizations, shape.mo175createOutlinePq9zytI((Float.floatToRawIntBits(((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32)) - f2) << 32), LayoutDirection.Ltr, density));
                clipPath$customizations.m667translatek4lQ0M((Float.floatToRawIntBits(Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) + f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + f) << 32));
                Signature signature$customizations = signatureState.getSignature$customizations();
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                long mo838getSizeYbymL2g2 = z ? (displayMetrics.widthPixels << 32) | (displayMetrics.heightPixels & BodyPartID.bodyIdMax) : layoutCoordinates.mo838getSizeYbymL2g();
                float f3 = this.f$2;
                int i2 = this.f$3;
                if (signature$customizations == null) {
                    Signature signature = new Signature((int) (mo838getSizeYbymL2g2 >> 32), (int) (mo838getSizeYbymL2g2 & BodyPartID.bodyIdMax), f3, i2, new SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0(SignaturesKt$Signature$canvasModifier$1$1$3.INSTANCE));
                    SavedSignature savedSignature = signatureState.initialState;
                    if (savedSignature != null) {
                        long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g());
                        long m2966getSignatureOffsetF1C5BW0$customizations2 = signatureState.m2966getSignatureOffsetF1C5BW0$customizations();
                        float min = Math.min(Float.intBitsToFloat((int) (m3991toSizeozmzZPI >> 32)) / savedSignature.width, Float.intBitsToFloat((int) (m3991toSizeozmzZPI & BodyPartID.bodyIdMax)) / savedSignature.height);
                        Matrix matrix = new Matrix();
                        matrix.preScale(min, min);
                        matrix.postTranslate(Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations2 >> 32)), Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations2 & BodyPartID.bodyIdMax)));
                        char c = 1;
                        float[] fArr = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
                        float[][][] fArr2 = savedSignature.glyphs;
                        ArrayList arrayList = new ArrayList(fArr2.length);
                        int length = fArr2.length;
                        int i3 = 0;
                        long j = 0;
                        while (i3 < length) {
                            float[][] fArr3 = fArr2[i3];
                            signature.startGlyph();
                            int length2 = fArr3.length;
                            int i4 = 0;
                            long j2 = j;
                            while (i4 < length2) {
                                float[] fArr4 = fArr3[i4];
                                fArr[0] = fArr4[0];
                                fArr[c] = fArr4[c];
                                matrix.mapPoints(fArr);
                                char c2 = c;
                                signature.extendGlyph(fArr[0], fArr[c2], j2);
                                i4++;
                                c = c2;
                                j2++;
                            }
                            signature.finishGlyph();
                            arrayList.add(Unit.INSTANCE);
                            i3++;
                            c = c;
                            j = j2;
                        }
                        AspectRatio.clip(signature.getBitmap(), signatureState.getClipPath$customizations());
                    }
                    parcelableSnapshotMutableState2.setValue(signature);
                } else {
                    Paint paint = signature$customizations.bitmapPaint;
                    if (Offset.m622equalsimpl0(m2966getSignatureOffsetF1C5BW0$customizations, 0L) || Offset.m622equalsimpl0(m2966getSignatureOffsetF1C5BW0$customizations, signatureState.m2966getSignatureOffsetF1C5BW0$customizations())) {
                        int i5 = (int) (mo838getSizeYbymL2g2 >> 32);
                        int i6 = (int) (mo838getSizeYbymL2g2 & BodyPartID.bodyIdMax);
                        float f4 = signature$customizations.strokeWidth;
                        int color = paint.getColor();
                        Signature.PainterProvider painterProvider = signature$customizations.painterProvider;
                        int i7 = signature$customizations.width;
                        int i8 = signature$customizations.height;
                        if (i7 != i5 || i8 != i6 || signature$customizations.strokeWidth != f4 || paint.getColor() != color) {
                            Bitmap bitmap = signature$customizations.getBitmap();
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            signature$customizations.bitmap = null;
                            Signature signature2 = painterProvider == null ? new Signature(i5, i6, f4, color, Signature.AnonymousClass1.INSTANCE) : new Signature(i5, i6, f4, color, painterProvider);
                            Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ALPHA_8);
                            if (createBitmap == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("null bitmap returned!");
                                return null;
                            }
                            signature2.bitmap = createBitmap;
                            float width = createBitmap.getWidth() / i7;
                            float height = createBitmap.getHeight() / i8;
                            for (Signature.Glyph glyph : signature$customizations.userDrawnGlyphs()) {
                                signature2.startGlyph();
                                for (Point.Timestamped timestamped : glyph.painter.points()) {
                                    signature2.extendGlyph(timestamped.x * width, timestamped.y * height, timestamped.time, false);
                                }
                                signature2.finishGlyph();
                            }
                            signature$customizations = signature2;
                        }
                        parcelableSnapshotMutableState2.setValue(signature$customizations);
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) - Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations & BodyPartID.bodyIdMax));
                        Signature signature3 = new Signature((int) (mo838getSizeYbymL2g2 >> 32), (int) (mo838getSizeYbymL2g2 & BodyPartID.bodyIdMax), f3, i2, new SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0(SignaturesKt$Signature$canvasModifier$1$1$newSignature$2.INSTANCE));
                        for (Signature.Glyph glyph2 : signature$customizations.userDrawnGlyphs()) {
                            signature3.startGlyph();
                            for (Point.Timestamped timestamped2 : glyph2.painter.points()) {
                                signature3.extendGlyph(timestamped2.x + intBitsToFloat, timestamped2.y + intBitsToFloat2, timestamped2.time);
                            }
                            signature3.finishGlyph();
                        }
                        AspectRatio.clip(signature3.getBitmap(), signatureState.getClipPath$customizations());
                        parcelableSnapshotMutableState2.setValue(signature3);
                    }
                }
                return Unit.INSTANCE;
            default:
                Constraints constraints = (Constraints) obj4;
                Placeable placeable = (Placeable) obj3;
                List list = (List) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                int m1025getMaxWidthimpl = (int) ((Constraints.m1025getMaxWidthimpl(constraints.value) * this.f$2) - (placeable.width / 2));
                if (z && placeable.getMeasuredWidth() >= f / 2.0f) {
                    int i9 = this.f$3;
                    if (i9 == 0) {
                        m1025getMaxWidthimpl = Math.max(0, m1025getMaxWidthimpl);
                    }
                    if (i9 == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                        m1025getMaxWidthimpl = Math.min(Constraints.m1025getMaxWidthimpl(constraints.value) - placeable.width, m1025getMaxWidthimpl);
                    }
                }
                placementScope.place(placeable, m1025getMaxWidthimpl, 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SignaturesKt$$ExternalSyntheticLambda0(SignatureState signatureState, boolean z, float f, int i, float f2, Shape shape, Density density) {
        this.f$0 = signatureState;
        this.f$1 = z;
        this.f$2 = f;
        this.f$3 = i;
        this.f$4 = f2;
        this.f$5 = shape;
        this.f$6 = density;
    }
}
