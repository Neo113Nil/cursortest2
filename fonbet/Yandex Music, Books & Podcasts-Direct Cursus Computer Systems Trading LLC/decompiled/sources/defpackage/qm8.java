package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qm8 extends uif implements Function1 {
    public static final qm8 A;
    public static final qm8 A0;
    public static final qm8 B;
    public static final qm8 B0;
    public static final qm8 C;
    public static final qm8 D;
    public static final qm8 E;
    public static final qm8 F;
    public static final qm8 G;
    public static final qm8 H;
    public static final qm8 I;
    public static final qm8 J;
    public static final qm8 K;
    public static final qm8 L;
    public static final qm8 X;
    public static final qm8 Y;
    public static final qm8 Z;
    public static final qm8 s;
    public static final qm8 t;
    public static final qm8 u;
    public static final qm8 v;
    public static final qm8 v0;
    public static final qm8 w;
    public static final qm8 w0;
    public static final qm8 x;
    public static final qm8 x0;
    public static final qm8 y;
    public static final qm8 y0;
    public static final qm8 z;
    public static final qm8 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new qm8(i, 0);
        t = new qm8(i, 1);
        u = new qm8(i, 2);
        v = new qm8(i, 3);
        w = new qm8(i, 4);
        x = new qm8(i, 5);
        y = new qm8(i, 6);
        z = new qm8(i, 7);
        A = new qm8(i, 8);
        B = new qm8(i, 9);
        C = new qm8(i, 10);
        D = new qm8(i, 11);
        E = new qm8(i, 12);
        F = new qm8(i, 13);
        G = new qm8(i, 14);
        H = new qm8(i, 15);
        I = new qm8(i, 16);
        J = new qm8(i, 17);
        K = new qm8(i, 18);
        L = new qm8(i, 19);
        X = new qm8(i, 20);
        Y = new qm8(i, 21);
        Z = new qm8(i, 22);
        v0 = new qm8(i, 23);
        w0 = new qm8(i, 24);
        x0 = new qm8(i, 25);
        y0 = new qm8(i, 26);
        z0 = new qm8(i, 27);
        A0 = new qm8(i, 28);
        B0 = new qm8(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm8(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return ((rm8) obj).a;
            case 1:
                String str = (String) obj;
                if (Intrinsics.d(str, "normal")) {
                    return tm8.NORMAL;
                }
                if (Intrinsics.d(str, "reverse")) {
                    return tm8.REVERSE;
                }
                if (Intrinsics.d(str, "alternate")) {
                    return tm8.ALTERNATE;
                }
                if (Intrinsics.d(str, "alternate_reverse")) {
                    return tm8.ALTERNATE_REVERSE;
                }
                return null;
            case 2:
                return ((tm8) obj).a;
            case 3:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "linear")) {
                    return um8.LINEAR;
                }
                if (Intrinsics.d(str2, "ease")) {
                    return um8.EASE;
                }
                if (Intrinsics.d(str2, "ease_in")) {
                    return um8.EASE_IN;
                }
                if (Intrinsics.d(str2, "ease_out")) {
                    return um8.EASE_OUT;
                }
                if (Intrinsics.d(str2, "ease_in_out")) {
                    return um8.EASE_IN_OUT;
                }
                if (Intrinsics.d(str2, "spring")) {
                    return um8.SPRING;
                }
                return null;
            case 4:
                return ((um8) obj).a;
            case 5:
                return Boolean.valueOf(obj instanceof um8);
            case 6:
                return Boolean.valueOf(obj instanceof rm8);
            case 7:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "source_in")) {
                    return ip8.SOURCE_IN;
                }
                if (Intrinsics.d(str3, "source_atop")) {
                    return ip8.SOURCE_ATOP;
                }
                if (Intrinsics.d(str3, "darken")) {
                    return ip8.DARKEN;
                }
                if (Intrinsics.d(str3, "lighten")) {
                    return ip8.LIGHTEN;
                }
                if (Intrinsics.d(str3, "multiply")) {
                    return ip8.MULTIPLY;
                }
                if (Intrinsics.d(str3, "screen")) {
                    return ip8.SCREEN;
                }
                return null;
            case 8:
                return ((ip8) obj).a;
            case 9:
                return Boolean.valueOf(obj instanceof um8);
            case 10:
                return Boolean.valueOf(obj instanceof tm8);
            case 11:
                return Boolean.valueOf(obj instanceof um8);
            case 12:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "no_wrap")) {
                    return ft8.NO_WRAP;
                }
                if (Intrinsics.d(str4, "wrap")) {
                    return ft8.WRAP;
                }
                return null;
            case 13:
                return ((ft8) obj).a;
            case 14:
                String str5 = (String) obj;
                if (Intrinsics.d(str5, "vertical")) {
                    return gt8.VERTICAL;
                }
                if (Intrinsics.d(str5, "horizontal")) {
                    return gt8.HORIZONTAL;
                }
                if (Intrinsics.d(str5, "overlap")) {
                    return gt8.OVERLAP;
                }
                return null;
            case 15:
                return ((gt8) obj).a;
            case 16:
                return Boolean.valueOf(obj instanceof om8);
            case 17:
                return Boolean.valueOf(obj instanceof pm8);
            case 18:
                return Boolean.valueOf(obj instanceof du8);
            case 19:
                return Boolean.valueOf(obj instanceof eu8);
            case 20:
                return Boolean.valueOf(obj instanceof ft8);
            case 21:
                return Boolean.valueOf(obj instanceof gt8);
            case 22:
                return Boolean.valueOf(obj instanceof k1a);
            case 23:
                String str6 = (String) obj;
                if (Intrinsics.d(str6, "left")) {
                    return du8.LEFT;
                }
                if (Intrinsics.d(str6, "center")) {
                    return du8.CENTER;
                }
                if (Intrinsics.d(str6, "right")) {
                    return du8.RIGHT;
                }
                if (Intrinsics.d(str6, "start")) {
                    return du8.START;
                }
                if (Intrinsics.d(str6, "end")) {
                    return du8.END;
                }
                if (Intrinsics.d(str6, "space-between")) {
                    return du8.SPACE_BETWEEN;
                }
                if (Intrinsics.d(str6, "space-around")) {
                    return du8.SPACE_AROUND;
                }
                if (Intrinsics.d(str6, "space-evenly")) {
                    return du8.SPACE_EVENLY;
                }
                return null;
            case 24:
                return ((du8) obj).a;
            case 25:
                String str7 = (String) obj;
                if (Intrinsics.d(str7, "top")) {
                    return eu8.TOP;
                }
                if (Intrinsics.d(str7, "center")) {
                    return eu8.CENTER;
                }
                if (Intrinsics.d(str7, "bottom")) {
                    return eu8.BOTTOM;
                }
                if (Intrinsics.d(str7, "baseline")) {
                    return eu8.BASELINE;
                }
                if (Intrinsics.d(str7, "space-between")) {
                    return eu8.SPACE_BETWEEN;
                }
                if (Intrinsics.d(str7, "space-around")) {
                    return eu8.SPACE_AROUND;
                }
                if (Intrinsics.d(str7, "space-evenly")) {
                    return eu8.SPACE_EVENLY;
                }
                return null;
            case 26:
                return ((eu8) obj).a;
            case 27:
                return Boolean.valueOf(obj instanceof om8);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Boolean.valueOf(obj instanceof pm8);
            default:
                return Boolean.valueOf(obj instanceof k1a);
        }
    }
}
