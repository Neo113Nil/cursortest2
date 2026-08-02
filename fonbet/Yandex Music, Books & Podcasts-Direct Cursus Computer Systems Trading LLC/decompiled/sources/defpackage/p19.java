package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p19 extends uif implements Function1 {
    public static final p19 A;
    public static final p19 A0;
    public static final p19 B;
    public static final p19 B0;
    public static final p19 C;
    public static final p19 D;
    public static final p19 E;
    public static final p19 F;
    public static final p19 G;
    public static final p19 H;
    public static final p19 I;
    public static final p19 J;
    public static final p19 K;
    public static final p19 L;
    public static final p19 X;
    public static final p19 Y;
    public static final p19 Z;
    public static final p19 s;
    public static final p19 t;
    public static final p19 u;
    public static final p19 v;
    public static final p19 v0;
    public static final p19 w;
    public static final p19 w0;
    public static final p19 x;
    public static final p19 x0;
    public static final p19 y;
    public static final p19 y0;
    public static final p19 z;
    public static final p19 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new p19(i, 0);
        t = new p19(i, 1);
        u = new p19(i, 2);
        v = new p19(i, 3);
        w = new p19(i, 4);
        x = new p19(i, 5);
        y = new p19(i, 6);
        z = new p19(i, 7);
        A = new p19(i, 8);
        B = new p19(i, 9);
        C = new p19(i, 10);
        D = new p19(i, 11);
        E = new p19(i, 12);
        F = new p19(i, 13);
        G = new p19(i, 14);
        H = new p19(i, 15);
        I = new p19(i, 16);
        J = new p19(i, 17);
        K = new p19(i, 18);
        L = new p19(i, 19);
        X = new p19(i, 20);
        Y = new p19(i, 21);
        Z = new p19(i, 22);
        v0 = new p19(i, 23);
        w0 = new p19(i, 24);
        x0 = new p19(i, 25);
        y0 = new p19(i, 26);
        z0 = new p19(i, 27);
        A0 = new p19(i, 28);
        B0 = new p19(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p19(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(obj instanceof g39);
            case 1:
                return Boolean.valueOf(obj instanceof k1a);
            case 2:
                return Boolean.valueOf(obj instanceof om8);
            case 3:
                return Boolean.valueOf(obj instanceof pm8);
            case 4:
                return Boolean.valueOf(obj instanceof om8);
            case 5:
                return Boolean.valueOf(obj instanceof pm8);
            case 6:
                return Boolean.valueOf(obj instanceof k1a);
            case 7:
                return Boolean.valueOf(obj instanceof om8);
            case 8:
                return Boolean.valueOf(obj instanceof pm8);
            case 9:
                return Boolean.valueOf(obj instanceof g39);
            case 10:
                return Boolean.valueOf(obj instanceof om8);
            case 11:
                return Boolean.valueOf(obj instanceof pm8);
            case 12:
                return Boolean.valueOf(obj instanceof om8);
            case 13:
                return Boolean.valueOf(obj instanceof pm8);
            case 14:
                return Boolean.valueOf(obj instanceof g39);
            case 15:
                return Boolean.valueOf(obj instanceof ip8);
            case 16:
                return Boolean.valueOf(obj instanceof k1a);
            case 17:
                String str = (String) obj;
                if (Intrinsics.d(str, "fill")) {
                    return g39.FILL;
                }
                if (Intrinsics.d(str, "no_scale")) {
                    return g39.NO_SCALE;
                }
                if (Intrinsics.d(str, "fit")) {
                    return g39.FIT;
                }
                if (Intrinsics.d(str, "stretch")) {
                    return g39.STRETCH;
                }
                return null;
            case 18:
                return ((g39) obj).a;
            case 19:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "scale")) {
                    return j39.SCALE;
                }
                if (Intrinsics.d(str2, "worm")) {
                    return j39.WORM;
                }
                if (Intrinsics.d(str2, "slider")) {
                    return j39.SLIDER;
                }
                return null;
            case 20:
                return ((j39) obj).a;
            case 21:
                return Boolean.valueOf(obj instanceof om8);
            case 22:
                return Boolean.valueOf(obj instanceof pm8);
            case 23:
                return Boolean.valueOf(obj instanceof j39);
            case 24:
                return Boolean.valueOf(obj instanceof k1a);
            case 25:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "auto")) {
                    return g49.AUTO;
                }
                if (Intrinsics.d(str3, "none")) {
                    return g49.NONE;
                }
                if (Intrinsics.d(str3, "words")) {
                    return g49.WORDS;
                }
                if (Intrinsics.d(str3, "sentences")) {
                    return g49.SENTENCES;
                }
                if (Intrinsics.d(str3, "all_characters")) {
                    return g49.ALL_CHARACTERS;
                }
                return null;
            case 26:
                return ((g49) obj).a;
            case 27:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "default")) {
                    return h49.DEFAULT;
                }
                if (Intrinsics.d(str4, "go")) {
                    return h49.GO;
                }
                if (Intrinsics.d(str4, "search")) {
                    return h49.SEARCH;
                }
                if (Intrinsics.d(str4, "send")) {
                    return h49.SEND;
                }
                if (Intrinsics.d(str4, "done")) {
                    return h49.DONE;
                }
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((h49) obj).a;
            default:
                String str5 = (String) obj;
                if (Intrinsics.d(str5, "single_line_text")) {
                    return j49.SINGLE_LINE_TEXT;
                }
                if (Intrinsics.d(str5, "multi_line_text")) {
                    return j49.MULTI_LINE_TEXT;
                }
                if (Intrinsics.d(str5, "phone")) {
                    return j49.PHONE;
                }
                if (Intrinsics.d(str5, "number")) {
                    return j49.NUMBER;
                }
                if (Intrinsics.d(str5, "email")) {
                    return j49.EMAIL;
                }
                if (Intrinsics.d(str5, "uri")) {
                    return j49.URI;
                }
                if (Intrinsics.d(str5, "password")) {
                    return j49.PASSWORD;
                }
                return null;
        }
    }
}
