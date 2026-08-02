package defpackage;

import android.net.Uri;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vv8 extends uif implements Function1 {
    public static final vv8 A;
    public static final vv8 A0;
    public static final vv8 B;
    public static final vv8 B0;
    public static final vv8 C;
    public static final vv8 D;
    public static final vv8 E;
    public static final vv8 F;
    public static final vv8 G;
    public static final vv8 H;
    public static final vv8 I;
    public static final vv8 J;
    public static final vv8 K;
    public static final vv8 L;
    public static final vv8 X;
    public static final vv8 Y;
    public static final vv8 Z;
    public static final vv8 s;
    public static final vv8 t;
    public static final vv8 u;
    public static final vv8 v;
    public static final vv8 v0;
    public static final vv8 w;
    public static final vv8 w0;
    public static final vv8 x;
    public static final vv8 x0;
    public static final vv8 y;
    public static final vv8 y0;
    public static final vv8 z;
    public static final vv8 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new vv8(i, 0);
        t = new vv8(i, 1);
        u = new vv8(i, 2);
        v = new vv8(i, 3);
        w = new vv8(i, 4);
        x = new vv8(i, 5);
        y = new vv8(i, 6);
        z = new vv8(i, 7);
        A = new vv8(i, 8);
        B = new vv8(i, 9);
        C = new vv8(i, 10);
        D = new vv8(i, 11);
        E = new vv8(i, 12);
        F = new vv8(i, 13);
        G = new vv8(i, 14);
        H = new vv8(i, 15);
        I = new vv8(i, 16);
        J = new vv8(i, 17);
        K = new vv8(i, 18);
        L = new vv8(i, 19);
        X = new vv8(i, 20);
        Y = new vv8(i, 21);
        Z = new vv8(i, 22);
        v0 = new vv8(i, 23);
        w0 = new vv8(i, 24);
        x0 = new vv8(i, 25);
        y0 = new vv8(i, 26);
        z0 = new vv8(i, 27);
        A0 = new vv8(i, 28);
        B0 = new vv8(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv8(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue;
        String obj2;
        switch (this.r) {
            case 0:
                return Boolean.valueOf(obj instanceof mw9);
            case 1:
                return Boolean.valueOf(obj instanceof jk9);
            case 2:
                return Boolean.valueOf(obj instanceof jk9);
            case 3:
                String str = (String) obj;
                if (Intrinsics.d(str, PListParser.TAG_STRING)) {
                    return nx8.STRING;
                }
                if (Intrinsics.d(str, PListParser.TAG_INTEGER)) {
                    return nx8.INTEGER;
                }
                if (Intrinsics.d(str, "number")) {
                    return nx8.NUMBER;
                }
                if (Intrinsics.d(str, "boolean")) {
                    return nx8.BOOLEAN;
                }
                if (Intrinsics.d(str, "datetime")) {
                    return nx8.DATETIME;
                }
                if (Intrinsics.d(str, "color")) {
                    return nx8.COLOR;
                }
                if (Intrinsics.d(str, "url")) {
                    return nx8.URL;
                }
                if (Intrinsics.d(str, PListParser.TAG_DICT)) {
                    return nx8.DICT;
                }
                if (Intrinsics.d(str, PListParser.TAG_ARRAY)) {
                    return nx8.ARRAY;
                }
                return null;
            case 4:
                if (obj instanceof String) {
                    intValue = bow.v((String) obj);
                } else if (obj instanceof c85) {
                    intValue = ((c85) obj).a;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new ClassCastException("Received value of wrong type");
                    }
                    intValue = ((Number) obj).intValue();
                }
                return new c85(intValue);
            case 5:
                if (obj instanceof String) {
                    obj2 = (String) obj;
                } else if (obj instanceof lpt) {
                    obj2 = ((lpt) obj).a;
                } else {
                    if (!(obj instanceof Uri)) {
                        throw new ClassCastException("Received value of wrong type");
                    }
                    obj2 = obj.toString();
                    obj2.getClass();
                }
                return new lpt(obj2);
            case 6:
                return Boolean.valueOf(obj instanceof um8);
            case 7:
                return Boolean.valueOf(obj instanceof jk9);
            case 8:
                return Boolean.valueOf(obj instanceof jk9);
            case 9:
                String str2 = (String) obj;
                if (Intrinsics.d(str2, "light")) {
                    return e09.LIGHT;
                }
                if (Intrinsics.d(str2, "medium")) {
                    return e09.MEDIUM;
                }
                if (Intrinsics.d(str2, "regular")) {
                    return e09.REGULAR;
                }
                if (Intrinsics.d(str2, "bold")) {
                    return e09.BOLD;
                }
                return null;
            case 10:
                return ((e09) obj).a;
            case 11:
                String str3 = (String) obj;
                if (Intrinsics.d(str3, "start")) {
                    return o09.START;
                }
                if (Intrinsics.d(str3, "center")) {
                    return o09.CENTER;
                }
                if (Intrinsics.d(str3, "end")) {
                    return o09.END;
                }
                return null;
            case 12:
                return ((o09) obj).a;
            case 13:
                String str4 = (String) obj;
                if (Intrinsics.d(str4, "horizontal")) {
                    return p09.HORIZONTAL;
                }
                if (Intrinsics.d(str4, "vertical")) {
                    return p09.VERTICAL;
                }
                return null;
            case 14:
                return ((p09) obj).a;
            case 15:
                String str5 = (String) obj;
                if (Intrinsics.d(str5, "paging")) {
                    return q09.PAGING;
                }
                if (Intrinsics.d(str5, "default")) {
                    return q09.DEFAULT;
                }
                return null;
            case 16:
                return ((q09) obj).a;
            case 17:
                String str6 = (String) obj;
                if (Intrinsics.d(str6, "none")) {
                    return r09.NONE;
                }
                if (Intrinsics.d(str6, "auto")) {
                    return r09.AUTO;
                }
                return null;
            case 18:
                return ((r09) obj).a;
            case 19:
                return Boolean.valueOf(obj instanceof om8);
            case 20:
                return Boolean.valueOf(obj instanceof pm8);
            case 21:
                return Boolean.valueOf(obj instanceof o09);
            case 22:
                return Boolean.valueOf(obj instanceof p09);
            case 23:
                return Boolean.valueOf(obj instanceof r09);
            case 24:
                return Boolean.valueOf(obj instanceof q09);
            case 25:
                return Boolean.valueOf(obj instanceof k1a);
            case 26:
                return Boolean.valueOf(obj instanceof om8);
            case 27:
                return Boolean.valueOf(obj instanceof pm8);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Boolean.valueOf(obj instanceof om8);
            default:
                return Boolean.valueOf(obj instanceof pm8);
        }
    }
}
