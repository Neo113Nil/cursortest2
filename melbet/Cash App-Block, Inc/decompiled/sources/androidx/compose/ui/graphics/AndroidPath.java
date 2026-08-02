package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AndroidPath {
    public final Path internalPath;
    public android.graphics.Matrix mMatrix;
    public float[] radii;
    public RectF rectF;

    public AndroidPath(Path path) {
        this.internalPath = path;
    }

    public static void addOval$default(AndroidPath androidPath, Rect rect) {
        Path$Direction[] path$DirectionArr = Path$Direction.$VALUES;
        if (androidPath.rectF == null) {
            androidPath.rectF = new RectF();
        }
        RectF rectF = androidPath.rectF;
        rectF.getClass();
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Path path = androidPath.internalPath;
        RectF rectF2 = androidPath.rectF;
        rectF2.getClass();
        path.addOval(rectF2, Path.Direction.CCW);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    public static void m664addPathUv8p0NA$default(AndroidPath androidPath, AndroidPath androidPath2) {
        Path path = androidPath.internalPath;
        if (androidPath2 instanceof AndroidPath) {
            path.addPath(androidPath2.internalPath, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    public static void addRect$default(AndroidPath androidPath, Rect rect) {
        Path$Direction[] path$DirectionArr = Path$Direction.$VALUES;
        androidPath.getClass();
        float f = rect.left;
        float f2 = rect.bottom;
        float f3 = rect.right;
        float f4 = rect.top;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
        if (androidPath.rectF == null) {
            androidPath.rectF = new RectF();
        }
        RectF rectF = androidPath.rectF;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = androidPath.internalPath;
        RectF rectF2 = androidPath.rectF;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void addRoundRect$default(AndroidPath androidPath, RoundRect roundRect) {
        Path$Direction[] path$DirectionArr = Path$Direction.$VALUES;
        if (androidPath.rectF == null) {
            androidPath.rectF = new RectF();
        }
        RectF rectF = androidPath.rectF;
        rectF.getClass();
        float f = roundRect.left;
        long j = roundRect.bottomLeftCornerRadius;
        long j2 = roundRect.bottomRightCornerRadius;
        long j3 = roundRect.topRightCornerRadius;
        long j4 = roundRect.topLeftCornerRadius;
        rectF.set(f, roundRect.top, roundRect.right, roundRect.bottom);
        if (androidPath.radii == null) {
            androidPath.radii = new float[8];
        }
        float[] fArr = androidPath.radii;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        Path path = androidPath.internalPath;
        RectF rectF2 = androidPath.rectF;
        rectF2.getClass();
        float[] fArr2 = androidPath.radii;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void arcTo(Rect rect, float f, float f2) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        this.internalPath.arcTo(rectF2, f, f2, false);
    }

    public final void close() {
        this.internalPath.close();
    }

    public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void lineTo(float f, float f2) {
        this.internalPath.lineTo(f, f2);
    }

    public final void moveTo(float f, float f2) {
        this.internalPath.moveTo(f, f2);
    }

    /* renamed from: op-N5in7k0, reason: not valid java name */
    public final boolean m665opN5in7k0(AndroidPath androidPath, AndroidPath androidPath2, int i) {
        Path.Op op = PathOperation.m706equalsimpl0(i, 0) ? Path.Op.DIFFERENCE : PathOperation.m706equalsimpl0(i, 1) ? Path.Op.INTERSECT : PathOperation.m706equalsimpl0(i, 4) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.m706equalsimpl0(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(androidPath instanceof AndroidPath)) {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = androidPath.internalPath;
        if (androidPath2 instanceof AndroidPath) {
            return this.internalPath.op(path, androidPath2.internalPath, op);
        }
        a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void reset() {
        this.internalPath.reset();
    }

    public final void rewind() {
        this.internalPath.rewind();
    }

    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public final void m666setFillTypeoQ8Xj4U(int i) {
        this.internalPath.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m667translatek4lQ0M(long j) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        android.graphics.Matrix matrix3 = this.mMatrix;
        matrix3.getClass();
        this.internalPath.transform(matrix3);
    }
}
