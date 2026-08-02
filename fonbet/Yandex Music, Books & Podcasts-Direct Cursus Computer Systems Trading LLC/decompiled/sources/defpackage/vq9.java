package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vq9 extends uif implements Function1 {
    public static final vq9 A;
    public static final vq9 A0;
    public static final vq9 B;
    public static final vq9 B0;
    public static final vq9 C;
    public static final vq9 D;
    public static final vq9 E;
    public static final vq9 F;
    public static final vq9 G;
    public static final vq9 H;
    public static final vq9 I;
    public static final vq9 J;
    public static final vq9 K;
    public static final vq9 L;
    public static final vq9 X;
    public static final vq9 Y;
    public static final vq9 Z;
    public static final vq9 s;
    public static final vq9 t;
    public static final vq9 u;
    public static final vq9 v;
    public static final vq9 v0;
    public static final vq9 w;
    public static final vq9 w0;
    public static final vq9 x;
    public static final vq9 x0;
    public static final vq9 y;
    public static final vq9 y0;
    public static final vq9 z;
    public static final vq9 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new vq9(i, 0);
        t = new vq9(i, 1);
        u = new vq9(i, 2);
        v = new vq9(i, 3);
        w = new vq9(i, 4);
        x = new vq9(i, 5);
        y = new vq9(i, 6);
        z = new vq9(i, 7);
        A = new vq9(i, 8);
        B = new vq9(i, 9);
        C = new vq9(i, 10);
        D = new vq9(i, 11);
        E = new vq9(i, 12);
        F = new vq9(i, 13);
        G = new vq9(i, 14);
        H = new vq9(i, 15);
        I = new vq9(i, 16);
        J = new vq9(i, 17);
        K = new vq9(i, 18);
        L = new vq9(i, 19);
        X = new vq9(i, 20);
        Y = new vq9(i, 21);
        Z = new vq9(i, 22);
        v0 = new vq9(i, 23);
        w0 = new vq9(i, 24);
        x0 = new vq9(i, 25);
        y0 = new vq9(i, 26);
        z0 = new vq9(i, 27);
        A0 = new vq9(i, 28);
        B0 = new vq9(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq9(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return ((wq9) obj).a;
            case 1:
                String str = (String) obj;
                if (Intrinsics.d(str, "top")) {
                    return yq9.TOP;
                }
                if (Intrinsics.d(str, "center")) {
                    return yq9.CENTER;
                }
                if (Intrinsics.d(str, "bottom")) {
                    return yq9.BOTTOM;
                }
                if (Intrinsics.d(str, "baseline")) {
                    return yq9.BASELINE;
                }
                return null;
            case 2:
                return ((yq9) obj).a;
            case 3:
                return Boolean.valueOf(obj instanceof yq9);
            case 4:
                return Boolean.valueOf(obj instanceof sq9);
            case 5:
                return Boolean.valueOf(obj instanceof ip8);
            case 6:
                return Boolean.valueOf(obj instanceof om8);
            case 7:
                return Boolean.valueOf(obj instanceof pm8);
            case 8:
                return Boolean.valueOf(obj instanceof jk9);
            case 9:
                return Boolean.valueOf(obj instanceof e09);
            case 10:
                return Boolean.valueOf(obj instanceof e89);
            case 11:
                return Boolean.valueOf(obj instanceof om8);
            case 12:
                return Boolean.valueOf(obj instanceof pm8);
            case 13:
                return Boolean.valueOf(obj instanceof wq9);
            case 14:
                return Boolean.valueOf(obj instanceof e89);
            case 15:
                return Boolean.valueOf(obj instanceof k1a);
            case 16:
                return Boolean.valueOf(obj instanceof yq9);
            case 17:
                return Boolean.valueOf(obj instanceof jk9);
            case 18:
                return Boolean.valueOf(obj instanceof e09);
            case 19:
                return Boolean.valueOf(obj instanceof e89);
            case 20:
                return Boolean.valueOf(obj instanceof e89);
            case 21:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "left")) {
                    return hu9.LEFT;
                }
                if (Intrinsics.d(str2, "top-left")) {
                    return hu9.TOP_LEFT;
                }
                if (Intrinsics.d(str2, "top")) {
                    return hu9.TOP;
                }
                if (Intrinsics.d(str2, "top-right")) {
                    return hu9.TOP_RIGHT;
                }
                if (Intrinsics.d(str2, "right")) {
                    return hu9.RIGHT;
                }
                if (Intrinsics.d(str2, "bottom-right")) {
                    return hu9.BOTTOM_RIGHT;
                }
                if (Intrinsics.d(str2, "bottom")) {
                    return hu9.BOTTOM;
                }
                if (Intrinsics.d(str2, "bottom-left")) {
                    return hu9.BOTTOM_LEFT;
                }
                if (Intrinsics.d(str2, "center")) {
                    return hu9.CENTER;
                }
                return null;
            case 22:
                return ((hu9) obj).a;
            case 23:
                return Unit.a;
            case 24:
                return Boolean.valueOf(obj instanceof hu9);
            case 25:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "none")) {
                    return mw9.NONE;
                }
                if (Intrinsics.d(str3, "data_change")) {
                    return mw9.DATA_CHANGE;
                }
                if (Intrinsics.d(str3, "state_change")) {
                    return mw9.STATE_CHANGE;
                }
                if (Intrinsics.d(str3, "any_change")) {
                    return mw9.ANY_CHANGE;
                }
                return null;
            case 26:
                return ((mw9) obj).a;
            case 27:
                return (k79) obj;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "on_condition")) {
                    return hx9.ON_CONDITION;
                }
                if (Intrinsics.d(str4, "on_variable")) {
                    return hx9.ON_VARIABLE;
                }
                return null;
            default:
                return ((hx9) obj).a;
        }
    }
}
