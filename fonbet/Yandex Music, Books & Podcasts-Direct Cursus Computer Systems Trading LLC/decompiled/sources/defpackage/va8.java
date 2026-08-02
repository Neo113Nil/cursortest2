package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class va8 extends uif implements Function1 {
    public static final va8 A;
    public static final va8 A0;
    public static final va8 B;
    public static final va8 B0;
    public static final va8 C;
    public static final va8 D;
    public static final va8 E;
    public static final va8 F;
    public static final va8 G;
    public static final va8 H;
    public static final va8 I;
    public static final va8 J;
    public static final va8 K;
    public static final va8 L;
    public static final va8 X;
    public static final va8 Y;
    public static final va8 Z;
    public static final va8 s;
    public static final va8 t;
    public static final va8 u;
    public static final va8 v;
    public static final va8 v0;
    public static final va8 w;
    public static final va8 w0;
    public static final va8 x;
    public static final va8 x0;
    public static final va8 y;
    public static final va8 y0;
    public static final va8 z;
    public static final va8 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new va8(i, 0);
        t = new va8(i, 1);
        u = new va8(i, 2);
        v = new va8(i, 3);
        w = new va8(i, 4);
        x = new va8(i, 5);
        y = new va8(i, 6);
        z = new va8(i, 7);
        A = new va8(i, 8);
        B = new va8(i, 9);
        C = new va8(i, 10);
        D = new va8(i, 11);
        E = new va8(i, 12);
        F = new va8(i, 13);
        G = new va8(i, 14);
        H = new va8(i, 15);
        I = new va8(i, 16);
        J = new va8(i, 17);
        K = new va8(i, 18);
        L = new va8(i, 19);
        X = new va8(i, 20);
        Y = new va8(i, 21);
        Z = new va8(i, 22);
        v0 = new va8(i, 23);
        w0 = new va8(i, 24);
        x0 = new va8(i, 25);
        y0 = new va8(i, 26);
        z0 = new va8(i, 27);
        A0 = new va8(i, 28);
        B0 = new va8(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(xv.C(obj));
            case 1:
                String str = (String) obj;
                if (Intrinsics.d(str, "default")) {
                    return rc8.DEFAULT;
                }
                if (Intrinsics.d(str, "merge")) {
                    return rc8.MERGE;
                }
                if (Intrinsics.d(str, "exclude")) {
                    return rc8.EXCLUDE;
                }
                return null;
            case 2:
                return ((rc8) obj).a;
            case 3:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "none")) {
                    return sc8.NONE;
                }
                if (Intrinsics.d(str2, "button")) {
                    return sc8.BUTTON;
                }
                if (Intrinsics.d(str2, "image")) {
                    return sc8.IMAGE;
                }
                if (Intrinsics.d(str2, "text")) {
                    return sc8.TEXT;
                }
                if (Intrinsics.d(str2, "edit_text")) {
                    return sc8.EDIT_TEXT;
                }
                if (Intrinsics.d(str2, "header")) {
                    return sc8.HEADER;
                }
                if (Intrinsics.d(str2, "tab_bar")) {
                    return sc8.TAB_BAR;
                }
                if (Intrinsics.d(str2, "list")) {
                    return sc8.LIST;
                }
                if (Intrinsics.d(str2, "select")) {
                    return sc8.SELECT;
                }
                if (Intrinsics.d(str2, "checkbox")) {
                    return sc8.CHECKBOX;
                }
                if (Intrinsics.d(str2, "radio")) {
                    return sc8.RADIO;
                }
                if (Intrinsics.d(str2, "auto")) {
                    return sc8.AUTO;
                }
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof rc8);
            case 5:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "_self")) {
                    return ad8.SELF;
                }
                if (Intrinsics.d(str3, "_blank")) {
                    return ad8.BLANK;
                }
                return null;
            case 6:
                return ((ad8) obj).a;
            case 7:
                return Boolean.valueOf(obj instanceof tm8);
            case 8:
                return Boolean.valueOf(obj instanceof um8);
            case 9:
                return Boolean.valueOf(obj instanceof ad8);
            case 10:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "clamp")) {
                    return rg8.CLAMP;
                }
                if (Intrinsics.d(str4, "ring")) {
                    return rg8.RING;
                }
                return null;
            case 11:
                return ((rg8) obj).a;
            case 12:
                return Boolean.valueOf(obj instanceof rg8);
            case 13:
                return men.y((String) obj);
            case 14:
                return ((ii8) obj).a;
            case 15:
                return Boolean.valueOf(obj instanceof ii8);
            case 16:
                String str5 = (String) obj;
                if (Intrinsics.d(str5, "get")) {
                    return aj8.GET;
                }
                if (Intrinsics.d(str5, "post")) {
                    return aj8.POST;
                }
                if (Intrinsics.d(str5, "put")) {
                    return aj8.PUT;
                }
                if (Intrinsics.d(str5, "patch")) {
                    return aj8.PATCH;
                }
                if (Intrinsics.d(str5, "delete")) {
                    return aj8.DELETE;
                }
                if (Intrinsics.d(str5, "head")) {
                    return aj8.HEAD;
                }
                if (Intrinsics.d(str5, "options")) {
                    return aj8.OPTIONS;
                }
                return null;
            case 17:
                return ((aj8) obj).a;
            case 18:
                return Boolean.valueOf(obj instanceof aj8);
            case 19:
                String str6 = (String) obj;
                if (Intrinsics.d(str6, "start")) {
                    return qj8.START;
                }
                if (Intrinsics.d(str6, "stop")) {
                    return qj8.STOP;
                }
                if (Intrinsics.d(str6, "pause")) {
                    return qj8.PAUSE;
                }
                if (Intrinsics.d(str6, "resume")) {
                    return qj8.RESUME;
                }
                if (Intrinsics.d(str6, "cancel")) {
                    return qj8.CANCEL;
                }
                if (Intrinsics.d(str6, "reset")) {
                    return qj8.RESET;
                }
                return null;
            case 20:
                return ((qj8) obj).a;
            case 21:
                return Boolean.valueOf(obj instanceof qj8);
            case 22:
                String str7 = (String) obj;
                if (Intrinsics.d(str7, "start")) {
                    return gm8.START;
                }
                if (Intrinsics.d(str7, "pause")) {
                    return gm8.PAUSE;
                }
                return null;
            case 23:
                return ((gm8) obj).a;
            case 24:
                return Boolean.valueOf(obj instanceof gm8);
            case 25:
                String str8 = (String) obj;
                if (Intrinsics.d(str8, "left")) {
                    return om8.LEFT;
                }
                if (Intrinsics.d(str8, "center")) {
                    return om8.CENTER;
                }
                if (Intrinsics.d(str8, "right")) {
                    return om8.RIGHT;
                }
                if (Intrinsics.d(str8, "start")) {
                    return om8.START;
                }
                if (Intrinsics.d(str8, "end")) {
                    return om8.END;
                }
                return null;
            case 26:
                return ((om8) obj).a;
            case 27:
                String str9 = (String) obj;
                if (Intrinsics.d(str9, "top")) {
                    return pm8.TOP;
                }
                if (Intrinsics.d(str9, "center")) {
                    return pm8.CENTER;
                }
                if (Intrinsics.d(str9, "bottom")) {
                    return pm8.BOTTOM;
                }
                if (Intrinsics.d(str9, "baseline")) {
                    return pm8.BASELINE;
                }
                return null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((pm8) obj).a;
            default:
                String str10 = (String) obj;
                if (Intrinsics.d(str10, "fade")) {
                    return rm8.FADE;
                }
                if (Intrinsics.d(str10, "translate")) {
                    return rm8.TRANSLATE;
                }
                if (Intrinsics.d(str10, "scale")) {
                    return rm8.SCALE;
                }
                if (Intrinsics.d(str10, "native")) {
                    return rm8.NATIVE;
                }
                if (Intrinsics.d(str10, "set")) {
                    return rm8.SET;
                }
                if (Intrinsics.d(str10, "no_animation")) {
                    return rm8.NO_ANIMATION;
                }
                return null;
        }
    }
}
