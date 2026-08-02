package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rk9 extends uif implements Function1 {
    public static final rk9 A;
    public static final rk9 A0;
    public static final rk9 B;
    public static final rk9 B0;
    public static final rk9 C;
    public static final rk9 D;
    public static final rk9 E;
    public static final rk9 F;
    public static final rk9 G;
    public static final rk9 H;
    public static final rk9 I;
    public static final rk9 J;
    public static final rk9 K;
    public static final rk9 L;
    public static final rk9 X;
    public static final rk9 Y;
    public static final rk9 Z;
    public static final rk9 s;
    public static final rk9 t;
    public static final rk9 u;
    public static final rk9 v;
    public static final rk9 v0;
    public static final rk9 w;
    public static final rk9 w0;
    public static final rk9 x;
    public static final rk9 x0;
    public static final rk9 y;
    public static final rk9 y0;
    public static final rk9 z;
    public static final rk9 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new rk9(i, 0);
        t = new rk9(i, 1);
        u = new rk9(i, 2);
        v = new rk9(i, 3);
        w = new rk9(i, 4);
        x = new rk9(i, 5);
        y = new rk9(i, 6);
        z = new rk9(i, 7);
        A = new rk9(i, 8);
        B = new rk9(i, 9);
        C = new rk9(i, 10);
        D = new rk9(i, 11);
        E = new rk9(i, 12);
        F = new rk9(i, 13);
        G = new rk9(i, 14);
        H = new rk9(i, 15);
        I = new rk9(i, 16);
        J = new rk9(i, 17);
        K = new rk9(i, 18);
        L = new rk9(i, 19);
        X = new rk9(i, 20);
        Y = new rk9(i, 21);
        Z = new rk9(i, 22);
        v0 = new rk9(i, 23);
        w0 = new rk9(i, 24);
        x0 = new rk9(i, 25);
        y0 = new rk9(i, 26);
        z0 = new rk9(i, 27);
        A0 = new rk9(i, 28);
        B0 = new rk9(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk9(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(obj instanceof um8);
            case 1:
                return Boolean.valueOf(obj instanceof om8);
            case 2:
                return Boolean.valueOf(obj instanceof pm8);
            case 3:
                return Boolean.valueOf(obj instanceof k1a);
            case 4:
                return Boolean.valueOf(obj instanceof jk9);
            case 5:
                return Boolean.valueOf(obj instanceof e09);
            case 6:
                return Boolean.valueOf(!(((jc8) obj) instanceof ob8));
            case 7:
                return Boolean.valueOf(obj instanceof om8);
            case 8:
                return Boolean.valueOf(obj instanceof pm8);
            case 9:
                return Boolean.valueOf(obj instanceof mw9);
            case 10:
                return Boolean.valueOf(obj instanceof k1a);
            case 11:
                return Boolean.valueOf(obj instanceof jk9);
            case 12:
                return Boolean.valueOf(obj instanceof om8);
            case 13:
                return Boolean.valueOf(obj instanceof pm8);
            case 14:
                return Boolean.valueOf(obj instanceof k1a);
            case 15:
                String str = (String) obj;
                if (Intrinsics.d(str, "slide")) {
                    return to9.SLIDE;
                }
                if (Intrinsics.d(str, "fade")) {
                    return to9.FADE;
                }
                if (Intrinsics.d(str, "none")) {
                    return to9.NONE;
                }
                return null;
            case 16:
                return ((to9) obj).a;
            case 17:
                return ((xj9) obj).a.a;
            case 18:
                return Boolean.valueOf(obj instanceof om8);
            case 19:
                return Boolean.valueOf(obj instanceof pm8);
            case 20:
                return Boolean.valueOf(obj instanceof k1a);
            case 21:
                return Boolean.valueOf(obj instanceof e09);
            case 22:
                return Boolean.valueOf(obj instanceof to9);
            case 23:
                return Boolean.valueOf(obj instanceof jk9);
            case 24:
                return Boolean.valueOf(obj instanceof e09);
            case 25:
                return Boolean.valueOf(obj instanceof e09);
            case 26:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "none")) {
                    return qq9.NONE;
                }
                if (Intrinsics.d(str2, "button")) {
                    return qq9.BUTTON;
                }
                if (Intrinsics.d(str2, "image")) {
                    return qq9.IMAGE;
                }
                if (Intrinsics.d(str2, "text")) {
                    return qq9.TEXT;
                }
                if (Intrinsics.d(str2, "auto")) {
                    return qq9.AUTO;
                }
                return null;
            case 27:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "normal")) {
                    return sq9.NORMAL;
                }
                if (Intrinsics.d(str3, "reversed")) {
                    return sq9.REVERSED;
                }
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((sq9) obj).a;
            default:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "none")) {
                    return wq9.NONE;
                }
                if (Intrinsics.d(str4, "start")) {
                    return wq9.START;
                }
                if (Intrinsics.d(str4, "end")) {
                    return wq9.END;
                }
                if (Intrinsics.d(str4, "middle")) {
                    return wq9.MIDDLE;
                }
                return null;
        }
    }
}
