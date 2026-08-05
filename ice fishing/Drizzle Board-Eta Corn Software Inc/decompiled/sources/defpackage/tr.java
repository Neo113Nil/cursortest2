package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class tr extends Drawable implements e70 {
    public static final Paint SgZGMMPL;
    public static final sr[] ytu5o6f4;
    public t60 DK9slbsy;
    public final v60 Ey6iv0m0;
    public final RectF FySoLYna;
    public PorterDuffColorFilter I5GHvsYW;
    public final qr KlHjfFWx;
    public rr MdtA4re8;
    public float[] Mq3SeTnW;
    public final qr NCTxEWno;
    public final RectF OnDfzHZD;
    public final Paint OxcuoDLp;
    public final BitSet P7K7Inc8;
    public boolean Qr9iLBAD;
    public PorterDuffColorFilter RXQxj5Oe;
    public final f80[] U0LaHZX7;
    public final c70[] VgvYg0wo;
    public boolean WYNAV5pd;
    public final q60 amk52bBQ;
    public boolean b2ZJblxo;
    public final Path eVhOlqcC;
    public wm euDDoUNr;
    public boolean gjV1z5T1;
    public float[] i7xS8jrb;
    public final Matrix jb9XjC4I;
    public final Path k3x7lurq;
    public final Region lDXGDhIF;
    public g80 lwWCatUu;
    public final RectF ow5vqvCr;
    public final Paint sjUBp5pO;
    public final c70[] wxUZMvaN;
    public final Region ygLcUYwZ;

    static {
        Paint paint = new Paint(1);
        SgZGMMPL = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ytu5o6f4 = new sr[4];
        int i = 0;
        while (true) {
            sr[] srVarArr = ytu5o6f4;
            if (i >= srVarArr.length) {
                return;
            }
            srVarArr[i] = new sr(i);
            i++;
        }
    }

    public tr(rr rrVar) {
        this.NCTxEWno = new qr(this);
        this.wxUZMvaN = new c70[4];
        this.VgvYg0wo = new c70[4];
        this.P7K7Inc8 = new BitSet(8);
        this.jb9XjC4I = new Matrix();
        this.eVhOlqcC = new Path();
        this.k3x7lurq = new Path();
        this.ow5vqvCr = new RectF();
        this.OnDfzHZD = new RectF();
        this.ygLcUYwZ = new Region();
        this.lDXGDhIF = new Region();
        Paint paint = new Paint(1);
        this.sjUBp5pO = paint;
        Paint paint2 = new Paint(1);
        this.OxcuoDLp = paint2;
        this.amk52bBQ = new q60();
        this.Ey6iv0m0 = v60.NCTxEWno();
        this.FySoLYna = new RectF();
        this.gjV1z5T1 = true;
        this.WYNAV5pd = true;
        this.U0LaHZX7 = new f80[4];
        this.MdtA4re8 = rrVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        FySoLYna();
        I5GHvsYW(getState());
        this.KlHjfFWx = new qr(this);
    }

    public final void Ey6iv0m0(r60 r60Var) {
        if (r60Var instanceof t60) {
            setShapeAppearanceModel((t60) r60Var);
            return;
        }
        z90 z90Var = (z90) r60Var;
        rr rrVar = this.MdtA4re8;
        if (rrVar.qoPGr6Ce != z90Var) {
            rrVar.qoPGr6Ce = z90Var;
            RXQxj5Oe(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean FySoLYna() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.I5GHvsYW;
        PorterDuffColorFilter porterDuffColorFilter3 = this.RXQxj5Oe;
        rr rrVar = this.MdtA4re8;
        ColorStateList colorStateList = rrVar.VgvYg0wo;
        PorterDuff.Mode mode = rrVar.P7K7Inc8;
        if (colorStateList == null || mode == null) {
            int color = this.sjUBp5pO.getColor();
            int wxUZMvaN = wxUZMvaN(color);
            porterDuffColorFilter = wxUZMvaN != color ? new PorterDuffColorFilter(wxUZMvaN, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(wxUZMvaN(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.I5GHvsYW = porterDuffColorFilter;
        this.MdtA4re8.getClass();
        this.RXQxj5Oe = null;
        this.MdtA4re8.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.I5GHvsYW) && Objects.equals(porterDuffColorFilter3, this.RXQxj5Oe)) ? false : true;
    }

    public final boolean I5GHvsYW(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.MdtA4re8.MdtA4re8 == null || color2 == (colorForState2 = this.MdtA4re8.MdtA4re8.getColorForState(iArr, (color2 = (paint2 = this.sjUBp5pO).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.MdtA4re8.wxUZMvaN == null || color == (colorForState = this.MdtA4re8.wxUZMvaN.getColorForState(iArr, (color = (paint = this.OxcuoDLp).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void KlHjfFWx() {
        this.amk52bBQ.qoPGr6Ce(-12303292);
        this.MdtA4re8.getClass();
        super.invalidateSelf();
    }

    public final float MdtA4re8(RectF rectF, t60 t60Var, float[] fArr) {
        if (fArr == null) {
            if (t60Var.jb9XjC4I(rectF)) {
                return t60Var.VgvYg0wo.qoPGr6Ce(rectF);
            }
            return -1.0f;
        }
        if (this.WYNAV5pd) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void NCTxEWno(RectF rectF, Path path) {
        this.Ey6iv0m0.qoPGr6Ce(this.MdtA4re8.qoPGr6Ce.wxUZMvaN(), this.i7xS8jrb, this.MdtA4re8.jb9XjC4I, rectF, this.KlHjfFWx, path);
        if (this.MdtA4re8.Qr9iLBAD != 1.0f) {
            Matrix matrix = this.jb9XjC4I;
            matrix.reset();
            float f = this.MdtA4re8.Qr9iLBAD;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.FySoLYna, true);
    }

    public final void OnDfzHZD(Context context) {
        this.MdtA4re8.NCTxEWno = new te(context);
        gjV1z5T1();
    }

    public final void OxcuoDLp(ColorStateList colorStateList) {
        rr rrVar = this.MdtA4re8;
        if (rrVar.MdtA4re8 != colorStateList) {
            rrVar.MdtA4re8 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void P7K7Inc8(Canvas canvas, Paint paint, Path path, t60 t60Var, float[] fArr, RectF rectF) {
        float MdtA4re8 = MdtA4re8(rectF, t60Var, fArr);
        if (MdtA4re8 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = MdtA4re8 * this.MdtA4re8.jb9XjC4I;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final t60 Qr9iLBAD() {
        return this.MdtA4re8.qoPGr6Ce.wxUZMvaN();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void RXQxj5Oe(int[] iArr, boolean z) {
        boolean z2;
        RectF b2ZJblxo = b2ZJblxo();
        if (!this.MdtA4re8.qoPGr6Ce.VgvYg0wo() || b2ZJblxo.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.lwWCatUu == null);
        if (this.i7xS8jrb == null) {
            this.i7xS8jrb = new float[4];
        }
        t60 NCTxEWno = this.MdtA4re8.qoPGr6Ce.NCTxEWno(iArr);
        float[] fArr = this.i7xS8jrb;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
        }
        if (NCTxEWno.jb9XjC4I(b2ZJblxo())) {
            z2 = true;
            this.WYNAV5pd = z2;
            if (!z2) {
                this.b2ZJblxo = true;
                this.Qr9iLBAD = true;
            }
            while (i < 4) {
                this.Ey6iv0m0.getClass();
                float qoPGr6Ce = (i != 1 ? i != 2 ? i != 3 ? NCTxEWno.P7K7Inc8 : NCTxEWno.VgvYg0wo : NCTxEWno.Qr9iLBAD : NCTxEWno.b2ZJblxo).qoPGr6Ce(b2ZJblxo);
                if (z3) {
                    this.i7xS8jrb[i] = qoPGr6Ce;
                }
                f80[] f80VarArr = this.U0LaHZX7;
                f80 f80Var = f80VarArr[i];
                if (f80Var != null) {
                    f80Var.qoPGr6Ce(qoPGr6Ce);
                    if (z3) {
                        f80VarArr[i].MdtA4re8();
                    }
                }
                i++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.WYNAV5pd = z2;
        if (!z2) {
        }
        while (i < 4) {
        }
        if (z3) {
        }
    }

    public final void VgvYg0wo(Canvas canvas) {
        if (this.P7K7Inc8.cardinality() > 0) {
            Log.w("tr", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.MdtA4re8.lDXGDhIF;
        Path path = this.eVhOlqcC;
        q60 q60Var = this.amk52bBQ;
        if (i != 0) {
            canvas.drawPath(path, q60Var.qoPGr6Ce);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            c70 c70Var = this.wxUZMvaN[i2];
            int i3 = this.MdtA4re8.ygLcUYwZ;
            Matrix matrix = c70.NCTxEWno;
            c70Var.qoPGr6Ce(matrix, q60Var, i3, canvas);
            this.VgvYg0wo[i2].qoPGr6Ce(matrix, q60Var, this.MdtA4re8.ygLcUYwZ, canvas);
        }
        if (this.gjV1z5T1) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.MdtA4re8.lDXGDhIF);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.MdtA4re8.lDXGDhIF);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, SgZGMMPL);
            canvas.translate(sin, cos);
        }
    }

    public final void amk52bBQ(float f) {
        rr rrVar = this.MdtA4re8;
        if (rrVar.jb9XjC4I != f) {
            rrVar.jb9XjC4I = f;
            this.b2ZJblxo = true;
            this.Qr9iLBAD = true;
            invalidateSelf();
        }
    }

    public final RectF b2ZJblxo() {
        Rect bounds = getBounds();
        RectF rectF = this.ow5vqvCr;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        PorterDuffColorFilter porterDuffColorFilter = this.I5GHvsYW;
        Paint paint3 = this.sjUBp5pO;
        paint3.setColorFilter(porterDuffColorFilter);
        int alpha = paint3.getAlpha();
        int i = this.MdtA4re8.k3x7lurq;
        paint3.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.RXQxj5Oe;
        Paint paint4 = this.OxcuoDLp;
        paint4.setColorFilter(porterDuffColorFilter2);
        paint4.setStrokeWidth(this.MdtA4re8.eVhOlqcC);
        int alpha2 = paint4.getAlpha();
        int i2 = this.MdtA4re8.k3x7lurq;
        paint4.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = k3x7lurq() || !ygLcUYwZ();
        Paint.Style style = this.MdtA4re8.sjUBp5pO;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.b2ZJblxo;
            Path path = this.eVhOlqcC;
            if (z2) {
                if (z) {
                    NCTxEWno(b2ZJblxo(), path);
                }
                this.b2ZJblxo = false;
            }
            if (k3x7lurq()) {
                canvas.save();
                canvas.translate((int) (this.MdtA4re8.lDXGDhIF * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * this.MdtA4re8.lDXGDhIF));
                if (this.gjV1z5T1) {
                    Rect bounds = getBounds();
                    RectF rectF = this.FySoLYna;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.MdtA4re8.ygLcUYwZ * 2) + ((int) rectF.width()) + width, (this.MdtA4re8.ygLcUYwZ * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.MdtA4re8.ygLcUYwZ;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    VgvYg0wo(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    VgvYg0wo(canvas);
                    canvas.restore();
                }
            }
            P7K7Inc8(canvas, paint3, path, this.MdtA4re8.qoPGr6Ce.wxUZMvaN(), this.i7xS8jrb, b2ZJblxo());
            paint = paint3;
        } else {
            paint = paint3;
        }
        if (ow5vqvCr()) {
            boolean z3 = this.Qr9iLBAD;
            RectF rectF2 = this.OnDfzHZD;
            Path path2 = this.k3x7lurq;
            if (z3) {
                t60 Qr9iLBAD = Qr9iLBAD();
                s60 eVhOlqcC = Qr9iLBAD.eVhOlqcC();
                i9 i9Var = Qr9iLBAD.VgvYg0wo;
                qr qrVar = this.NCTxEWno;
                eVhOlqcC.VgvYg0wo = qrVar.qoPGr6Ce(i9Var);
                eVhOlqcC.P7K7Inc8 = qrVar.qoPGr6Ce(Qr9iLBAD.P7K7Inc8);
                eVhOlqcC.Qr9iLBAD = qrVar.qoPGr6Ce(Qr9iLBAD.Qr9iLBAD);
                eVhOlqcC.b2ZJblxo = qrVar.qoPGr6Ce(Qr9iLBAD.b2ZJblxo);
                this.DK9slbsy = eVhOlqcC.qoPGr6Ce();
                float[] fArr = this.i7xS8jrb;
                if (fArr != null) {
                    if (this.Mq3SeTnW == null) {
                        this.Mq3SeTnW = new float[fArr.length];
                    }
                    float jb9XjC4I = jb9XjC4I();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.i7xS8jrb;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.Mq3SeTnW[i5] = Math.max(0.0f, fArr2[i5] - jb9XjC4I);
                        i5++;
                    }
                } else {
                    this.Mq3SeTnW = null;
                }
                if (z) {
                    t60 t60Var = this.DK9slbsy;
                    float[] fArr3 = this.Mq3SeTnW;
                    float f3 = this.MdtA4re8.jb9XjC4I;
                    rectF2.set(b2ZJblxo());
                    float jb9XjC4I2 = jb9XjC4I();
                    rectF2.inset(jb9XjC4I2, jb9XjC4I2);
                    this.Ey6iv0m0.qoPGr6Ce(t60Var, fArr3, f3, rectF2, null, path2);
                }
                this.Qr9iLBAD = false;
            }
            t60 t60Var2 = this.DK9slbsy;
            float[] fArr4 = this.Mq3SeTnW;
            rectF2.set(b2ZJblxo());
            float jb9XjC4I3 = jb9XjC4I();
            rectF2.inset(jb9XjC4I3, jb9XjC4I3);
            paint2 = paint4;
            P7K7Inc8(canvas, paint2, path2, t60Var2, fArr4, rectF2);
        } else {
            paint2 = paint4;
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final float eVhOlqcC() {
        float[] fArr = this.i7xS8jrb;
        return fArr != null ? fArr[3] : this.MdtA4re8.qoPGr6Ce.wxUZMvaN().VgvYg0wo.qoPGr6Ce(b2ZJblxo());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.MdtA4re8.k3x7lurq;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.MdtA4re8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.MdtA4re8.getClass();
        RectF b2ZJblxo = b2ZJblxo();
        if (b2ZJblxo.isEmpty()) {
            return;
        }
        float MdtA4re8 = MdtA4re8(b2ZJblxo, this.MdtA4re8.qoPGr6Ce.wxUZMvaN(), this.i7xS8jrb);
        if (MdtA4re8 >= 0.0f) {
            outline.setRoundRect(getBounds(), MdtA4re8 * this.MdtA4re8.jb9XjC4I);
            return;
        }
        boolean z = this.b2ZJblxo;
        Path path = this.eVhOlqcC;
        if (z) {
            NCTxEWno(b2ZJblxo, path);
            this.b2ZJblxo = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            td.qoPGr6Ce(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                sd.qoPGr6Ce(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            sd.qoPGr6Ce(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.MdtA4re8.b2ZJblxo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.ygLcUYwZ;
        region.set(bounds);
        RectF b2ZJblxo = b2ZJblxo();
        Path path = this.eVhOlqcC;
        NCTxEWno(b2ZJblxo, path);
        Region region2 = this.lDXGDhIF;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void gjV1z5T1() {
        rr rrVar = this.MdtA4re8;
        float f = rrVar.OnDfzHZD + 0.0f;
        rrVar.ygLcUYwZ = (int) Math.ceil(0.75f * f);
        this.MdtA4re8.lDXGDhIF = (int) Math.ceil(f * 0.25f);
        FySoLYna();
        if (k3x7lurq() || !ygLcUYwZ()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.b2ZJblxo = true;
        this.Qr9iLBAD = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.MdtA4re8.VgvYg0wo;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.MdtA4re8.getClass();
        ColorStateList colorStateList2 = this.MdtA4re8.wxUZMvaN;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.MdtA4re8.MdtA4re8;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.MdtA4re8.qoPGr6Ce.VgvYg0wo();
    }

    public final float jb9XjC4I() {
        if (ow5vqvCr()) {
            return this.OxcuoDLp.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean k3x7lurq() {
        rr rrVar = this.MdtA4re8;
        rrVar.getClass();
        return rrVar.ygLcUYwZ > 0 && !ygLcUYwZ() && !this.eVhOlqcC.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final void lDXGDhIF(g80 g80Var) {
        if (this.lwWCatUu == g80Var) {
            return;
        }
        this.lwWCatUu = g80Var;
        int i = 0;
        while (true) {
            f80[] f80VarArr = this.U0LaHZX7;
            if (i >= f80VarArr.length) {
                RXQxj5Oe(getState(), true);
                invalidateSelf();
                return;
            }
            if (f80VarArr[i] == null) {
                f80VarArr[i] = new f80(this, ytu5o6f4[i]);
            }
            f80 f80Var = f80VarArr[i];
            g80 g80Var2 = new g80();
            g80Var2.qoPGr6Ce((float) g80Var.NCTxEWno);
            double d = g80Var.qoPGr6Ce;
            g80Var2.NCTxEWno((float) (d * d));
            f80Var.k3x7lurq = g80Var2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        rr rrVar = this.MdtA4re8;
        rr rrVar2 = new rr();
        rrVar2.MdtA4re8 = null;
        rrVar2.wxUZMvaN = null;
        rrVar2.VgvYg0wo = null;
        rrVar2.P7K7Inc8 = PorterDuff.Mode.SRC_IN;
        rrVar2.b2ZJblxo = null;
        rrVar2.Qr9iLBAD = 1.0f;
        rrVar2.jb9XjC4I = 1.0f;
        rrVar2.k3x7lurq = 255;
        rrVar2.ow5vqvCr = 0.0f;
        rrVar2.OnDfzHZD = 0.0f;
        rrVar2.ygLcUYwZ = 0;
        rrVar2.lDXGDhIF = 0;
        rrVar2.sjUBp5pO = Paint.Style.FILL_AND_STROKE;
        rrVar2.qoPGr6Ce = rrVar.qoPGr6Ce;
        rrVar2.NCTxEWno = rrVar.NCTxEWno;
        rrVar2.eVhOlqcC = rrVar.eVhOlqcC;
        rrVar2.MdtA4re8 = rrVar.MdtA4re8;
        rrVar2.wxUZMvaN = rrVar.wxUZMvaN;
        rrVar2.P7K7Inc8 = rrVar.P7K7Inc8;
        rrVar2.VgvYg0wo = rrVar.VgvYg0wo;
        rrVar2.k3x7lurq = rrVar.k3x7lurq;
        rrVar2.Qr9iLBAD = rrVar.Qr9iLBAD;
        rrVar2.lDXGDhIF = rrVar.lDXGDhIF;
        rrVar2.jb9XjC4I = rrVar.jb9XjC4I;
        rrVar2.ow5vqvCr = rrVar.ow5vqvCr;
        rrVar2.OnDfzHZD = rrVar.OnDfzHZD;
        rrVar2.ygLcUYwZ = rrVar.ygLcUYwZ;
        rrVar2.sjUBp5pO = rrVar.sjUBp5pO;
        Rect rect = rrVar.b2ZJblxo;
        if (rect != null) {
            rrVar2.b2ZJblxo = new Rect(rect);
        }
        this.MdtA4re8 = rrVar2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.b2ZJblxo = true;
        this.Qr9iLBAD = true;
        super.onBoundsChange(rect);
        if (!this.MdtA4re8.qoPGr6Ce.VgvYg0wo() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        f80[] f80VarArr = this.U0LaHZX7;
        int length = f80VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                f80 f80Var = f80VarArr[i];
                if (f80Var != null && f80Var.P7K7Inc8) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        RXQxj5Oe(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dc0
    public boolean onStateChange(int[] iArr) {
        if (this.MdtA4re8.qoPGr6Ce.VgvYg0wo()) {
            RXQxj5Oe(iArr, false);
        }
        boolean z = I5GHvsYW(iArr) || FySoLYna();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean ow5vqvCr() {
        Paint.Style style = this.MdtA4re8.sjUBp5pO;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.OxcuoDLp.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        rr rrVar = this.MdtA4re8;
        if (rrVar.k3x7lurq != i) {
            rrVar.k3x7lurq = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.MdtA4re8.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.e70
    public final void setShapeAppearanceModel(t60 t60Var) {
        this.MdtA4re8.qoPGr6Ce = t60Var;
        this.i7xS8jrb = null;
        this.Mq3SeTnW = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.MdtA4re8.VgvYg0wo = colorStateList;
        FySoLYna();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        rr rrVar = this.MdtA4re8;
        if (rrVar.P7K7Inc8 != mode) {
            rrVar.P7K7Inc8 = mode;
            FySoLYna();
            super.invalidateSelf();
        }
    }

    public final void sjUBp5pO(float f) {
        rr rrVar = this.MdtA4re8;
        if (rrVar.OnDfzHZD != f) {
            rrVar.OnDfzHZD = f;
            gjV1z5T1();
        }
    }

    public final int wxUZMvaN(int i) {
        int i2;
        rr rrVar = this.MdtA4re8;
        float f = rrVar.OnDfzHZD + 0.0f + rrVar.ow5vqvCr;
        te teVar = rrVar.NCTxEWno;
        if (teVar == null || !teVar.qoPGr6Ce || g6.wxUZMvaN(i, 255) != teVar.wxUZMvaN) {
            return i;
        }
        float min = (teVar.VgvYg0wo <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int I5GHvsYW = fn.I5GHvsYW(g6.wxUZMvaN(i, 255), teVar.NCTxEWno, min);
        if (min > 0.0f && (i2 = teVar.MdtA4re8) != 0) {
            I5GHvsYW = g6.NCTxEWno(g6.wxUZMvaN(i2, te.P7K7Inc8), I5GHvsYW);
        }
        return g6.wxUZMvaN(I5GHvsYW, alpha);
    }

    public final boolean ygLcUYwZ() {
        if (this.MdtA4re8.qoPGr6Ce.NCTxEWno(getState()).jb9XjC4I(b2ZJblxo())) {
            return this.i7xS8jrb == null || this.WYNAV5pd;
        }
        return false;
    }

    public tr(Context context, AttributeSet attributeSet, int i, int i2) {
        this(t60.P7K7Inc8(context, attributeSet, i, i2).qoPGr6Ce());
    }

    public tr(t60 t60Var) {
        this(new rr(t60Var));
    }

    public tr(r60 r60Var) {
        this(new rr(r60Var));
    }

    public tr() {
        this(new t60());
    }
}
