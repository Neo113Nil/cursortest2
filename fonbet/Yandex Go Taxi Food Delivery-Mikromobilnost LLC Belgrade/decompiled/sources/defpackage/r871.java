package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class r871 implements kq71 {
    public static final r871 K = new r871("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
    public static final yx61 L = new yx61(2);
    public final float A;
    public final int B;
    public final float C;
    public final float D;
    public final boolean E;
    public final int F;
    public final int G;
    public final float H;
    public final int I;
    public final float J;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap w;
    public final float x;
    public final int y;
    public final int z;

    public r871(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else if (bitmap != null) {
            w511.q();
            throw null;
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.w = bitmap;
        this.x = f;
        this.y = i;
        this.z = i2;
        this.A = f2;
        this.B = i3;
        this.C = f4;
        this.D = f5;
        this.E = z;
        this.F = i5;
        this.G = i4;
        this.H = f3;
        this.I = i6;
        this.J = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r871.class == obj.getClass()) {
            r871 r871Var = (r871) obj;
            if (TextUtils.equals(this.a, r871Var.a) && this.b == r871Var.b && this.c == r871Var.c) {
                Bitmap bitmap = r871Var.w;
                Bitmap bitmap2 = this.w;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.x == r871Var.x && this.y == r871Var.y && this.z == r871Var.z && this.A == r871Var.A && this.B == r871Var.B && this.C == r871Var.C && this.D == r871Var.D && this.E == r871Var.E && this.F == r871Var.F && this.G == r871Var.G && this.H == r871Var.H && this.I == r871Var.I && this.J == r871Var.J) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.w, Float.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C), Float.valueOf(this.D), Boolean.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Float.valueOf(this.H), Integer.valueOf(this.I), Float.valueOf(this.J)});
    }
}
