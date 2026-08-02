package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i49 extends uif implements Function1 {
    public static final i49 A;
    public static final i49 A0;
    public static final i49 B;
    public static final i49 B0;
    public static final i49 C;
    public static final i49 D;
    public static final i49 E;
    public static final i49 F;
    public static final i49 G;
    public static final i49 H;
    public static final i49 I;
    public static final i49 J;
    public static final i49 K;
    public static final i49 L;
    public static final i49 X;
    public static final i49 Y;
    public static final i49 Z;
    public static final i49 s;
    public static final i49 t;
    public static final i49 u;
    public static final i49 v;
    public static final i49 v0;
    public static final i49 w;
    public static final i49 w0;
    public static final i49 x;
    public static final i49 x0;
    public static final i49 y;
    public static final i49 y0;
    public static final i49 z;
    public static final i49 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new i49(i, 0);
        t = new i49(i, 1);
        u = new i49(i, 2);
        v = new i49(i, 3);
        w = new i49(i, 4);
        x = new i49(i, 5);
        y = new i49(i, 6);
        z = new i49(i, 7);
        A = new i49(i, 8);
        B = new i49(i, 9);
        C = new i49(i, 10);
        D = new i49(i, 11);
        E = new i49(i, 12);
        F = new i49(i, 13);
        G = new i49(i, 14);
        H = new i49(i, 15);
        I = new i49(i, 16);
        J = new i49(i, 17);
        K = new i49(i, 18);
        L = new i49(i, 19);
        X = new i49(i, 20);
        Y = new i49(i, 21);
        Z = new i49(i, 22);
        v0 = new i49(i, 23);
        w0 = new i49(i, 24);
        x0 = new i49(i, 25);
        y0 = new i49(i, 26);
        z0 = new i49(i, 27);
        A0 = new i49(i, 28);
        B0 = new i49(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i49(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return ((j49) obj).a;
            case 1:
                return Boolean.valueOf(obj instanceof om8);
            case 2:
                return Boolean.valueOf(obj instanceof pm8);
            case 3:
                return Boolean.valueOf(obj instanceof g49);
            case 4:
                return Boolean.valueOf(obj instanceof h49);
            case 5:
                return Boolean.valueOf(obj instanceof jk9);
            case 6:
                return Boolean.valueOf(obj instanceof e09);
            case 7:
                return Boolean.valueOf(obj instanceof j49);
            case 8:
                return Boolean.valueOf(obj instanceof om8);
            case 9:
                return Boolean.valueOf(obj instanceof pm8);
            case 10:
                return Boolean.valueOf(obj instanceof k1a);
            case 11:
                String str = (String) obj;
                if (Intrinsics.d(str, "none")) {
                    return e89.NONE;
                }
                if (Intrinsics.d(str, "single")) {
                    return e89.SINGLE;
                }
                return null;
            case 12:
                return ((e89) obj).a;
            case 13:
                return Boolean.valueOf(obj instanceof tm8);
            case 14:
                return Boolean.valueOf(obj instanceof um8);
            case 15:
                return Boolean.valueOf(obj instanceof um8);
            case 16:
                return Boolean.valueOf(obj instanceof um8);
            case 17:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "start")) {
                    return cb9.START;
                }
                if (Intrinsics.d(str2, "center")) {
                    return cb9.CENTER;
                }
                if (Intrinsics.d(str2, "end")) {
                    return cb9.END;
                }
                return null;
            case 18:
                return ((cb9) obj).a;
            case 19:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "horizontal")) {
                    return db9.HORIZONTAL;
                }
                if (Intrinsics.d(str3, "vertical")) {
                    return db9.VERTICAL;
                }
                return null;
            case 20:
                return ((db9) obj).a;
            case 21:
                return Boolean.valueOf(obj instanceof om8);
            case 22:
                return Boolean.valueOf(obj instanceof pm8);
            case 23:
                return Boolean.valueOf(obj instanceof cb9);
            case 24:
                return Boolean.valueOf(obj instanceof db9);
            case 25:
                return Boolean.valueOf(obj instanceof cb9);
            case 26:
                return Boolean.valueOf(obj instanceof k1a);
            case 27:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "transactional")) {
                    return vc9.TRANSACTIONAL;
                }
                if (Intrinsics.d(str4, "partial")) {
                    return vc9.PARTIAL;
                }
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((vc9) obj).a;
            default:
                return Boolean.valueOf(obj instanceof vc9);
        }
    }
}
