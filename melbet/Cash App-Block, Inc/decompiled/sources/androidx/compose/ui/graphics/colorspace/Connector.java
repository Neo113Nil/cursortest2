package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public class Connector {
    public final ColorSpace destination;
    public final float[] transform;
    public final ColorSpace transformDestination;
    public final ColorSpace transformSource;

    /* loaded from: classes3.dex */
    public final class RgbConnector extends Connector {
        public final Rgb mDestination;
        public final Rgb mSource;
        public final float[] mTransform;

        public RgbConnector(Rgb rgb, Rgb rgb2) {
            super(rgb2, rgb, rgb2, null);
            float[] mul3x3;
            this.mSource = rgb;
            this.mDestination = rgb2;
            float[] fArr = Adaptation$Companion$Bradford$1.Bradford.transform;
            WhitePoint whitePoint = rgb.whitePoint;
            float[] fArr2 = rgb.transform;
            WhitePoint whitePoint2 = rgb2.whitePoint;
            float[] fArr3 = rgb2.inverseTransform;
            if (Illuminant.compare(whitePoint, whitePoint2)) {
                mul3x3 = Illuminant.mul3x3(fArr3, fArr2);
            } else {
                float[] xyz$ui_graphics = whitePoint.toXyz$ui_graphics();
                float[] xyz$ui_graphics2 = whitePoint2.toXyz$ui_graphics();
                WhitePoint whitePoint3 = Illuminant.D50;
                mul3x3 = Illuminant.mul3x3(Illuminant.compare(whitePoint2, whitePoint3) ? fArr3 : Illuminant.inverse3x3(Illuminant.mul3x3(Illuminant.chromaticAdaptation(fArr, xyz$ui_graphics2, new float[]{0.964212f, 1.0f, 0.825188f}), rgb2.transform)), Illuminant.compare(whitePoint, whitePoint3) ? fArr2 : Illuminant.mul3x3(Illuminant.chromaticAdaptation(fArr, xyz$ui_graphics, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.mTransform = mul3x3;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics */
        public final long mo717transformToColorl2rxGTc$ui_graphics(long j) {
            float m681getRedimpl = Color.m681getRedimpl(j);
            float m680getGreenimpl = Color.m680getGreenimpl(j);
            float m678getBlueimpl = Color.m678getBlueimpl(j);
            float m677getAlphaimpl = Color.m677getAlphaimpl(j);
            Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda1 = this.mSource.eotfFunc;
            float invoke = (float) rgb$$ExternalSyntheticLambda1.invoke(m681getRedimpl);
            float invoke2 = (float) rgb$$ExternalSyntheticLambda1.invoke(m680getGreenimpl);
            float invoke3 = (float) rgb$$ExternalSyntheticLambda1.invoke(m678getBlueimpl);
            float[] fArr = this.mTransform;
            float f = (fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke);
            float f2 = (fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke);
            float f3 = (fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke);
            Rgb rgb = this.mDestination;
            float invoke4 = (float) rgb.oetfFunc.invoke(f);
            Rgb$$ExternalSyntheticLambda1 rgb$$ExternalSyntheticLambda12 = rgb.oetfFunc;
            return ColorKt.Color(invoke4, (float) rgb$$ExternalSyntheticLambda12.invoke(f2), (float) rgb$$ExternalSyntheticLambda12.invoke(f3), m677getAlphaimpl, rgb);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        this(colorSpace2, r0, r1, r3);
        float[] fArr;
        ColorSpace adapt$default = Illuminant.m719equalsimpl0(colorSpace.model, 12884901888L) ? Illuminant.adapt$default(colorSpace) : colorSpace;
        ColorSpace adapt$default2 = Illuminant.m719equalsimpl0(colorSpace2.model, 12884901888L) ? Illuminant.adapt$default(colorSpace2) : colorSpace2;
        if (i == 3) {
            boolean m719equalsimpl0 = Illuminant.m719equalsimpl0(colorSpace.model, 12884901888L);
            boolean m719equalsimpl02 = Illuminant.m719equalsimpl0(colorSpace2.model, 12884901888L);
            if ((!m719equalsimpl0 || !m719equalsimpl02) && (m719equalsimpl0 || m719equalsimpl02)) {
                WhitePoint whitePoint = ((Rgb) (m719equalsimpl0 ? colorSpace : colorSpace2)).whitePoint;
                float[] fArr2 = Illuminant.D50Xyz;
                float[] xyz$ui_graphics = m719equalsimpl0 ? whitePoint.toXyz$ui_graphics() : fArr2;
                fArr2 = m719equalsimpl02 ? whitePoint.toXyz$ui_graphics() : fArr2;
                fArr = new float[]{xyz$ui_graphics[0] / fArr2[0], xyz$ui_graphics[1] / fArr2[1], xyz$ui_graphics[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics, reason: not valid java name */
    public long mo717transformToColorl2rxGTc$ui_graphics(long j) {
        float m681getRedimpl = Color.m681getRedimpl(j);
        float m680getGreenimpl = Color.m680getGreenimpl(j);
        float m678getBlueimpl = Color.m678getBlueimpl(j);
        float m677getAlphaimpl = Color.m677getAlphaimpl(j);
        ColorSpace colorSpace = this.transformSource;
        long xy$ui_graphics = colorSpace.toXy$ui_graphics(m681getRedimpl, m680getGreenimpl, m678getBlueimpl);
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics & BodyPartID.bodyIdMax));
        float z$ui_graphics = colorSpace.toZ$ui_graphics(m681getRedimpl, m680getGreenimpl, m678getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.transformDestination.mo716xyzaToColorJlNiLsg$ui_graphics(f, f2, z$ui_graphics, m677getAlphaimpl, this.destination);
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, float[] fArr) {
        this.destination = colorSpace;
        this.transformSource = colorSpace2;
        this.transformDestination = colorSpace3;
        this.transform = fArr;
    }
}
