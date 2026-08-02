package defpackage;

import android.view.View;
import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gd9 extends uif implements Function1 {
    public static final gd9 A;
    public static final gd9 A0;
    public static final gd9 B;
    public static final gd9 B0;
    public static final gd9 C;
    public static final gd9 D;
    public static final gd9 E;
    public static final gd9 F;
    public static final gd9 G;
    public static final gd9 H;
    public static final gd9 I;
    public static final gd9 J;
    public static final gd9 K;
    public static final gd9 L;
    public static final gd9 X;
    public static final gd9 Y;
    public static final gd9 Z;
    public static final gd9 s;
    public static final gd9 t;
    public static final gd9 u;
    public static final gd9 v;
    public static final gd9 v0;
    public static final gd9 w;
    public static final gd9 w0;
    public static final gd9 x;
    public static final gd9 x0;
    public static final gd9 y;
    public static final gd9 y0;
    public static final gd9 z;
    public static final gd9 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new gd9(i, 0);
        t = new gd9(i, 1);
        u = new gd9(i, 2);
        v = new gd9(i, 3);
        w = new gd9(i, 4);
        x = new gd9(i, 5);
        y = new gd9(i, 6);
        z = new gd9(i, 7);
        A = new gd9(i, 8);
        B = new gd9(i, 9);
        C = new gd9(i, 10);
        D = new gd9(i, 11);
        E = new gd9(i, 12);
        F = new gd9(i, 13);
        G = new gd9(i, 14);
        H = new gd9(i, 15);
        I = new gd9(i, 16);
        J = new gd9(i, 17);
        K = new gd9(i, 18);
        L = new gd9(i, 19);
        X = new gd9(i, 20);
        Y = new gd9(i, 21);
        Z = new gd9(i, 22);
        v0 = new gd9(i, 23);
        w0 = new gd9(i, 24);
        x0 = new gd9(i, 25);
        y0 = new gd9(i, 26);
        z0 = new gd9(i, 27);
        A0 = new gd9(i, 28);
        B0 = new gd9(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd9(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return (jc8) obj;
            case 1:
                return null;
            case 2:
                return ((k79) obj).a;
            case 3:
                xzb xzbVar = ((k79) obj).b;
                if (xzbVar instanceof zzb) {
                    return (zzb) xzbVar;
                }
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof jk9);
            case 5:
                return Boolean.valueOf(obj instanceof jk9);
            case 6:
                String str = (String) obj;
                if (Intrinsics.d(str, "nearest_corner")) {
                    return yg9.NEAREST_CORNER;
                }
                if (Intrinsics.d(str, "farthest_corner")) {
                    return yg9.FARTHEST_CORNER;
                }
                if (Intrinsics.d(str, "nearest_side")) {
                    return yg9.NEAREST_SIDE;
                }
                if (Intrinsics.d(str, "farthest_side")) {
                    return yg9.FARTHEST_SIDE;
                }
                return null;
            case 7:
                return ((yg9) obj).a;
            case 8:
                return Boolean.valueOf(obj instanceof yg9);
            case 9:
                return Integer.valueOf(((View) obj).getMeasuredWidth());
            case 10:
                return Integer.valueOf(((View) obj).getMeasuredHeight());
            case 11:
                return ((ro9) obj).a;
            case 12:
                return Boolean.valueOf(obj instanceof um8);
            case 13:
                return Boolean.valueOf(obj instanceof om8);
            case 14:
                return Boolean.valueOf(obj instanceof pm8);
            case 15:
                return Boolean.valueOf(obj instanceof jk9);
            case 16:
                return Boolean.valueOf(obj instanceof e09);
            case 17:
                return Boolean.valueOf(obj instanceof k1a);
            case 18:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "vertical")) {
                    return pi9.VERTICAL;
                }
                if (Intrinsics.d(str2, "horizontal")) {
                    return pi9.HORIZONTAL;
                }
                return null;
            case 19:
                return ((pi9) obj).a;
            case 20:
                return Boolean.valueOf(obj instanceof pi9);
            case 21:
                return Boolean.valueOf(obj instanceof om8);
            case 22:
                return Boolean.valueOf(obj instanceof pm8);
            case 23:
                return Boolean.valueOf(obj instanceof k1a);
            case 24:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "dp")) {
                    return jk9.DP;
                }
                if (Intrinsics.d(str3, "sp")) {
                    return jk9.SP;
                }
                if (Intrinsics.d(str3, "px")) {
                    return jk9.PX;
                }
                return null;
            case 25:
                return ((jk9) obj).a;
            case 26:
                return Boolean.valueOf(obj instanceof jk9);
            case 27:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "left")) {
                    return pk9.LEFT;
                }
                if (Intrinsics.d(str4, "top")) {
                    return pk9.TOP;
                }
                if (Intrinsics.d(str4, "right")) {
                    return pk9.RIGHT;
                }
                if (Intrinsics.d(str4, "bottom")) {
                    return pk9.BOTTOM;
                }
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((pk9) obj).a;
            default:
                return Boolean.valueOf(obj instanceof pk9);
        }
    }
}
