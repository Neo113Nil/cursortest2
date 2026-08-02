package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.go.design.compose.theme.AppThemeType;
import flex.utils.android.DimensionUnit;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import okhttp3.Protocol;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes.dex */
public abstract class rzo {
    public static final jb20 a;
    public static final lz41 b = new lz41(0.31006f, 0.31616f);
    public static final lz41 c = new lz41(0.34567f, 0.3585f);
    public static final lz41 d = new lz41(0.32168f, 0.33767f);
    public static final lz41 e = new lz41(0.31271f, 0.32902f);
    public static final float[] f = {0.964212f, 1.0f, 0.825188f};
    public static final jb20 g;
    public static final jb20 h;
    public static final jb20 i;
    public static final jb20 j;
    public static final jb20 k;

    static {
        int i2 = 1;
        a = new jb20("CLOSED", i2);
        g = new jb20("STATE_REG", i2);
        h = new jb20("STATE_COMPLETED", i2);
        i = new jb20("STATE_CANCELLED", i2);
        j = new jb20("NO_RESULT", i2);
        k = new jb20("PARAM_CLAUSE_0", i2);
    }

    public static final long A(View view) {
        view.getLocationInWindow(new int[2]);
        return ior.a(r0[0], r0[1]);
    }

    public static Bitmap B(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return bitmap.copy(config, false);
    }

    public static EvaluableException C(ioz0 ioz0Var) {
        return new EvaluableException("Invalid token '" + ioz0Var.a() + "' at position " + ioz0Var.b, null);
    }

    public static final void D(pam pamVar) {
        if (pamVar.getNode().isAttached()) {
            qje.N(pamVar, 1).i1();
        }
    }

    public static boolean E(char c2, ioz0 ioz0Var) {
        if (c2 == '\'') {
            int i2 = ioz0Var.b;
            char[] cArr = ioz0Var.a;
            if (i2 < cArr.length) {
                int i3 = 0;
                for (int i4 = i2 - 1; i4 > 0 && cArr[i4] == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 1) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r8 == '-') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r7 != 'E') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (java.lang.Character.isDigit(r8) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean F(char c2, char c3, char c4) {
        boolean z;
        if (!Character.isDigit(c2)) {
            if (c2 != '+') {
                if (c2 == 'E' || c2 == 'e') {
                    if (Character.isDigit(c3)) {
                        if (!Character.isDigit(c4)) {
                            if (c4 != '+') {
                            }
                        }
                        z = true;
                        if (!z) {
                            return false;
                        }
                    }
                } else if (c2 != '-') {
                    if (c2 == '.') {
                        z = Character.isDigit(c4);
                        if (!z) {
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            if (c3 != 'e') {
            }
        }
        return true;
    }

    public static boolean G(byte b2) {
        return b2 > -65;
    }

    public static boolean H(ArrayList arrayList) {
        if (arrayList.isEmpty() || (a.Z(arrayList) instanceof tmz0)) {
            return false;
        }
        return (a.Z(arrayList) instanceof qlz0) || (a.Z(arrayList) instanceof ilz0);
    }

    public static boolean I(char c2, ioz0 ioz0Var) {
        return c2 == '@' && ioz0.d(ioz0Var) != '\\' && ioz0.c(ioz0Var) == '{';
    }

    public static final boolean J(Object obj) {
        Set set = obj instanceof Set ? (Set) obj : null;
        if (set == null) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return true;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public static boolean K(ArrayList arrayList) {
        return (H(arrayList) || (a.b0(arrayList) instanceof tmz0)) ? false : true;
    }

    public static final long L(long j2, float f2, long j3) {
        qw60 qw60Var = wgc.x;
        long a2 = ldc.a(j2, qw60Var);
        long a3 = ldc.a(j3, qw60Var);
        float d2 = ldc.d(a2);
        float h2 = ldc.h(a2);
        float g2 = ldc.g(a2);
        float e2 = ldc.e(a2);
        float d3 = ldc.d(a3);
        float h3 = ldc.h(a3);
        float g3 = ldc.g(a3);
        float e3 = ldc.e(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return ldc.a(i(cjb1.d(h2, h3, f2), cjb1.d(g2, g3, f2), cjb1.d(e2, e3, f2), cjb1.d(d2, d3, f2), qw60Var), ldc.f(j3));
    }

    public static final float M(long j2) {
        ugc f2 = ldc.f(j2);
        if (!cvw.v(f2.b, 12884901888L)) {
            hxv.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) cvw.j0(f2.b)));
        }
        a3k0 a3k0Var = ((androidx.compose.ui.graphics.colorspace.a) f2).p;
        double a2 = a3k0Var.a(ldc.h(j2));
        float a3 = (float) ((a3k0Var.a(ldc.e(j2)) * 0.0722d) + (a3k0Var.a(ldc.g(j2)) * 0.7152d) + (a2 * 0.2126d));
        if (a3 < 0.0f) {
            a3 = 0.0f;
        }
        if (a3 > 1.0f) {
            return 1.0f;
        }
        return a3;
    }

    public static final xne N(yne yneVar) {
        String str;
        switch (zne.a[yneVar.c.ordinal()]) {
            case 1:
                str = "gps";
                break;
            case 2:
                str = "lbs-wifi";
                break;
            case 3:
                str = "lbs-gsm";
                break;
            case 4:
                str = "lbs-ip";
                break;
            case 5:
                str = "lbs";
                break;
            case 6:
                str = "mapkit";
                break;
            case 7:
                str = "platform_lbs";
                break;
            case 8:
                str = GplLibraryWrapper.FUSED_PROVIDER;
                break;
            case 9:
                str = "zero_km";
                break;
            case 10:
                str = "ridetech_location_sdk";
                break;
            case 11:
                str = "ridetech_location_sdk_last_location";
                break;
            case 12:
                str = "unknown";
                break;
            default:
                w511.b();
                return null;
        }
        Map map = yneVar.g;
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : null;
        String str2 = linkedHashMap != null ? (String) linkedHashMap.get("suffix_tag") : null;
        if (str2 != null && str2.length() != 0 && yneVar.c == CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION) {
            str = "ridetech_location_sdk_".concat(str2);
        }
        String str3 = str;
        if (linkedHashMap != null) {
        }
        return new xne(str3, yneVar.d, Integer.valueOf(yneVar.b), Integer.valueOf(yneVar.a), xv21.a(yneVar.e), yneVar.f, (linkedHashMap == null || !linkedHashMap.isEmpty()) ? linkedHashMap : null, yneVar.h);
    }

    public static suu O(String str) {
        Protocol protocol;
        int i2;
        String str2;
        if (cvu0.x(str, "HTTP/1.", false)) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (cvu0.x(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i2 = 4;
        } else {
            if (!cvu0.x(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i2 = 12;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer l = bvu0.l(10, str.substring(i2, i3));
        if (l == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int intValue = l.intValue();
        if (str.length() <= i3) {
            str2 = "";
        } else {
            if (str.charAt(i3) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            str2 = str.substring(i2 + 4);
        }
        return new suu(protocol, intValue, str2);
    }

    public static String P(ioz0 ioz0Var, boolean z) {
        int i2 = ioz0Var.b;
        while (ioz0Var.a() != 0 && !I(ioz0Var.a(), ioz0Var) && (!z || !E(ioz0Var.a(), ioz0Var))) {
            ioz0Var.b(1);
        }
        String u = ngd0.u(cvu0.o(ioz0Var.a, i2, ioz0Var.b));
        if (u.length() > 0) {
            return u;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v34, types: [smz0] */
    /* JADX WARN: Type inference failed for: r4v40, types: [qmz0] */
    public static void Q(ioz0 ioz0Var, List list, boolean z) {
        int i2;
        int i3;
        int i4;
        imz0 imz0Var;
        hmz0 hmz0Var;
        char c2;
        int i5;
        boolean z2;
        klz0 klz0Var;
        char c3;
        llz0 llz0Var;
        char[] cArr = ioz0Var.a;
        int i6 = 1;
        if (z) {
            ioz0Var.b(1);
        }
        ArrayList arrayList = new ArrayList();
        String P = P(ioz0Var, z);
        Throwable th = null;
        if (ioz0Var.a() == 0) {
            if (z) {
                throw new TokenizingException("''' expected at end of string literal at " + ioz0Var.b, null);
            }
            if (P != null) {
                list.add(new nlz0(P));
                return;
            }
            return;
        }
        if (E(ioz0Var.a(), ioz0Var)) {
            if (P == null) {
                P = "";
            }
            list.add(new nlz0(P));
            ioz0Var.b(1);
            return;
        }
        xmz0 xmz0Var = xmz0.a;
        if (P != null && I(ioz0Var.a(), ioz0Var)) {
            arrayList.add(xmz0Var);
            arrayList.add(new nlz0(P));
        }
        while (I(ioz0Var.a(), ioz0Var)) {
            ArrayList arrayList2 = new ArrayList();
            if (I(ioz0Var.a(), ioz0Var)) {
                int i7 = 2;
                ioz0Var.b(2);
                while (ioz0Var.a() != 0 && ioz0Var.a() != '}') {
                    char a2 = ioz0Var.a();
                    if (a2 != '!') {
                        if (a2 == '/') {
                            i4 = i6;
                            arrayList2.add(zlz0.a);
                            ioz0Var.b(i4);
                        } else if (a2 != ':') {
                            if (a2 != '|') {
                                switch (a2) {
                                    case '%':
                                        arrayList2.add(amz0.a);
                                        i4 = 1;
                                        ioz0Var.b(1);
                                        break;
                                    case '&':
                                        if (ioz0.c(ioz0Var) != '&') {
                                            throw C(ioz0Var);
                                        }
                                        arrayList2.add(dmz0.a);
                                        i2 = 2;
                                        ioz0Var.b(2);
                                        break;
                                    case '\'':
                                        Q(ioz0Var, arrayList2, i6);
                                        th = null;
                                        i7 = 2;
                                    case '(':
                                        i4 = i6;
                                        arrayList2.add(hlz0.a);
                                        ioz0Var.b(i4);
                                        break;
                                    case ')':
                                        i4 = i6;
                                        arrayList2.add(ilz0.a);
                                        ioz0Var.b(i4);
                                        break;
                                    case '*':
                                        i4 = i6;
                                        arrayList2.add(bmz0.a);
                                        ioz0Var.b(i4);
                                        break;
                                    case '+':
                                        i4 = i6;
                                        if (K(arrayList2)) {
                                            imz0Var = smz0.a;
                                        } else {
                                            if (!H(arrayList2)) {
                                                throw C(ioz0Var);
                                            }
                                            imz0Var = imz0.a;
                                        }
                                        arrayList2.add(imz0Var);
                                        ioz0Var.b(i4);
                                        break;
                                    case ',':
                                        i4 = i6;
                                        arrayList2.add(jlz0.a);
                                        ioz0Var.b(i4);
                                        break;
                                    case '-':
                                        i4 = i6;
                                        if (K(arrayList2)) {
                                            hmz0Var = qmz0.a;
                                        } else {
                                            if (!H(arrayList2)) {
                                                throw C(ioz0Var);
                                            }
                                            hmz0Var = hmz0.a;
                                        }
                                        arrayList2.add(hmz0Var);
                                        ioz0Var.b(i4);
                                        break;
                                    default:
                                        switch (a2) {
                                            case '<':
                                                i2 = i7;
                                                if (ioz0.c(ioz0Var) != '=') {
                                                    arrayList2.add(tlz0.a);
                                                    i4 = 1;
                                                    ioz0Var.b(1);
                                                    break;
                                                } else {
                                                    arrayList2.add(ulz0.a);
                                                    ioz0Var.b(i2);
                                                    break;
                                                }
                                            case '=':
                                                i2 = i7;
                                                if (ioz0.c(ioz0Var) != '=') {
                                                    throw C(ioz0Var);
                                                }
                                                arrayList2.add(wlz0.a);
                                                ioz0Var.b(i2);
                                                break;
                                            case '>':
                                                i3 = i6;
                                                if (ioz0.c(ioz0Var) == '=') {
                                                    arrayList2.add(slz0.a);
                                                    i2 = 2;
                                                    ioz0Var.b(2);
                                                } else {
                                                    i2 = 2;
                                                    arrayList2.add(rlz0.a);
                                                    ioz0Var.b(i3);
                                                }
                                                int i8 = i3;
                                                i7 = i2;
                                                i6 = i8;
                                                break;
                                            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                                i4 = i6;
                                                arrayList2.add(nmz0.a);
                                                ioz0Var.b(i4);
                                                break;
                                            default:
                                                char a3 = ioz0Var.a();
                                                if (a3 == ' ' || a3 == '\t' || a3 == '\r' || a3 == '\n') {
                                                    i4 = i6;
                                                    ioz0Var.b(i4);
                                                    break;
                                                } else if (F(ioz0Var.a(), ioz0.d(ioz0Var), ioz0.c(ioz0Var))) {
                                                    int i9 = ioz0Var.b;
                                                    boolean z3 = a.b0(arrayList2) instanceof qmz0;
                                                    if (z3) {
                                                        ycc.A(arrayList2);
                                                    }
                                                    do {
                                                        ioz0Var.b(i6);
                                                    } while (Character.isDigit(ioz0Var.a()));
                                                    if (((i9 < 0 || i9 >= cArr.length) ? (char) 0 : cArr[i9]) == '.' || F(ioz0Var.a(), ioz0.d(ioz0Var), ioz0.c(ioz0Var))) {
                                                        while (F(ioz0Var.a(), ioz0.d(ioz0Var), ioz0.c(ioz0Var))) {
                                                            ioz0Var.b(1);
                                                        }
                                                        int i10 = ioz0Var.b;
                                                        String concat = z3 ? "-".concat(cvu0.o(cArr, i9, i10)) : cvu0.o(cArr, i9, i10);
                                                        try {
                                                            arrayList2.add(new mlz0(Double.valueOf(Double.parseDouble(concat))));
                                                        } catch (Exception unused) {
                                                            kbs.n(oyr.p("Value ", concat, " can't be converted to Number type."), th);
                                                            return;
                                                        }
                                                    } else {
                                                        int i11 = ioz0Var.b;
                                                        String concat2 = z3 ? "-".concat(cvu0.o(cArr, i9, i11)) : cvu0.o(cArr, i9, i11);
                                                        try {
                                                            arrayList2.add(new mlz0(Long.valueOf(Long.parseLong(concat2))));
                                                        } catch (Exception unused2) {
                                                            kbs.n(oyr.p("Value ", concat2, " can't be converted to Integer type."), th);
                                                            return;
                                                        }
                                                    }
                                                    i6 = 1;
                                                    i7 = 2;
                                                } else {
                                                    char a4 = ioz0Var.a();
                                                    char c4 = '[';
                                                    char c5 = 'A';
                                                    char c6 = '{';
                                                    char c7 = 'a';
                                                    lmz0 lmz0Var = lmz0.a;
                                                    if (('a' > a4 || a4 >= '{') && (('A' > a4 || a4 >= '[') && a4 != '_')) {
                                                        i4 = 1;
                                                        if (ioz0Var.a() != '.') {
                                                            throw C(ioz0Var);
                                                        }
                                                        ioz0Var.b(1);
                                                        arrayList2.add(lmz0Var);
                                                        break;
                                                    } else {
                                                        int i12 = ioz0Var.b;
                                                        Integer num = null;
                                                        while (true) {
                                                            int i13 = ioz0Var.b;
                                                            while (true) {
                                                                char a5 = ioz0Var.a();
                                                                if ((c7 <= a5 && a5 < c6) || ((c5 <= a5 && a5 < c4) || a5 == '_' || ('0' <= a5 && a5 < ':'))) {
                                                                    ioz0Var.b(1);
                                                                    c4 = '[';
                                                                }
                                                            }
                                                            if (ioz0Var.a() == '.') {
                                                                int i14 = ioz0Var.b + 1;
                                                                num = Integer.valueOf(i14);
                                                                ioz0Var.b(1);
                                                                if (i14 - i13 <= 1) {
                                                                    kbs.n("Unexpected token: .", null);
                                                                    return;
                                                                }
                                                            }
                                                            char a6 = ioz0Var.a();
                                                            c6 = '{';
                                                            if (c7 > a6 || a6 >= '{') {
                                                                c2 = 'A';
                                                                c4 = '[';
                                                                if (('A' > a6 || a6 >= '[') && a6 != '_' && (('0' > a6 || a6 >= ':') && ioz0Var.a() != '.')) {
                                                                    int i15 = ioz0Var.b;
                                                                    while (true) {
                                                                        char a7 = ioz0Var.a();
                                                                        if (a7 != ' ' && a7 != '\t') {
                                                                            if (a7 != '\r') {
                                                                                if (a7 == '\n') {
                                                                                    i5 = 1;
                                                                                    ioz0Var.b(i5);
                                                                                } else {
                                                                                    if (ioz0Var.a() == '(') {
                                                                                        klz0Var = new klz0(cvu0.o(cArr, num != null ? num.intValue() : i12, i15));
                                                                                        if (num == null) {
                                                                                            arrayList2.add(klz0Var);
                                                                                            i6 = 1;
                                                                                            break;
                                                                                        } else {
                                                                                            z2 = true;
                                                                                            i15 = num.intValue() - 1;
                                                                                        }
                                                                                    } else {
                                                                                        z2 = true;
                                                                                        klz0Var = null;
                                                                                    }
                                                                                    String o = cvu0.o(cArr, i12, i15);
                                                                                    if (o.equals("true")) {
                                                                                        llz0Var = new llz0(z2);
                                                                                        c3 = 0;
                                                                                    } else if (o.equals("false")) {
                                                                                        c3 = 0;
                                                                                        llz0Var = new llz0(false ? 1 : 0);
                                                                                    } else {
                                                                                        c3 = 0;
                                                                                        llz0Var = null;
                                                                                    }
                                                                                    if (llz0Var == null) {
                                                                                        int i16 = i15 - 1;
                                                                                        if (((i16 < 0 || i16 >= cArr.length) ? c3 : cArr[i16]) == '.') {
                                                                                            kbs.n("Unexpected token: .", null);
                                                                                            return;
                                                                                        }
                                                                                        arrayList2.add(new plz0(o));
                                                                                    } else {
                                                                                        arrayList2.add(llz0Var);
                                                                                    }
                                                                                    if (klz0Var != null) {
                                                                                        arrayList2.add(lmz0Var);
                                                                                        arrayList2.add(klz0Var);
                                                                                    }
                                                                                    i6 = 1;
                                                                                }
                                                                            }
                                                                            i5 = 1;
                                                                            ioz0Var.b(i5);
                                                                        }
                                                                        i5 = 1;
                                                                        ioz0Var.b(i5);
                                                                    }
                                                                }
                                                            } else {
                                                                c2 = 'A';
                                                                c4 = '[';
                                                            }
                                                            c5 = c2;
                                                            c7 = 'a';
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                }
                            } else {
                                if (ioz0.c(ioz0Var) != '|') {
                                    throw C(ioz0Var);
                                }
                                arrayList2.add(emz0.a);
                                i2 = 2;
                                ioz0Var.b(2);
                            }
                            i7 = i2;
                            i6 = 1;
                        } else {
                            arrayList2.add(mmz0.a);
                            i4 = 1;
                            ioz0Var.b(1);
                        }
                        i6 = i4;
                        th = null;
                        i7 = 2;
                    } else {
                        if (ioz0.c(ioz0Var) == '=') {
                            arrayList2.add(xlz0.a);
                            i2 = 2;
                            ioz0Var.b(2);
                        } else {
                            i2 = 2;
                            if (ioz0.c(ioz0Var) == ':') {
                                arrayList2.add(pmz0.a);
                                ioz0Var.b(2);
                            } else {
                                if (!K(arrayList2)) {
                                    throw C(ioz0Var);
                                }
                                arrayList2.add(rmz0.a);
                                i3 = 1;
                                ioz0Var.b(1);
                                int i82 = i3;
                                i7 = i2;
                                i6 = i82;
                            }
                        }
                        i7 = i2;
                        i6 = 1;
                    }
                    th = null;
                }
                int i17 = i6;
                if (ioz0Var.a() != '}') {
                    throw new TokenizingException("'}' expected at end of expression at " + ioz0Var.b, null);
                }
                ioz0Var.b(i17);
            }
            String P2 = P(ioz0Var, z);
            if (!z && arrayList.isEmpty() && P2 == null && !I(ioz0Var.a(), ioz0Var)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(xmz0Var);
            }
            arrayList.add(ymz0.a);
            arrayList.addAll(arrayList2);
            arrayList.add(wmz0.a);
            if (P2 != null) {
                arrayList.add(new nlz0(P2));
            }
            i6 = 1;
            th = null;
        }
        if (z && !E(ioz0Var.a(), ioz0Var)) {
            throw new TokenizingException("''' expected at end of string literal at " + ioz0Var.b, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(vmz0.a);
        }
        if (z) {
            ioz0Var.b(1);
        }
    }

    public static final byte[] R(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void S(FrameContainerLayout frameContainerLayout, Div2View div2View) {
        int i2 = 0;
        while (true) {
            if (!(i2 < frameContainerLayout.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = frameContainerLayout.getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                wwg.Y(div2View.getReleaseViewVisitor$div_release(), childAt);
                i2 = i3;
            }
        }
    }

    public static final void T(View view, rs31 rs31Var) {
        view.setTag(x8h0.view_tree_view_model_store_owner, rs31Var);
    }

    public static final void U(wc70 wc70Var, int i2, Object obj) {
        wc70Var.e[(wc70Var.f - wc70Var.a[wc70Var.b - 1].b) + i2] = obj;
    }

    public static final void V(wc70 wc70Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = wc70Var.f - wc70Var.a[wc70Var.b - 1].b;
        Object[] objArr = wc70Var.e;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final void W(wc70 wc70Var, Object obj, Object obj2, Object obj3) {
        int i2 = wc70Var.f - wc70Var.a[wc70Var.b - 1].b;
        Object[] objArr = wc70Var.e;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        objArr[i2 + 2] = obj3;
    }

    public static final int X(long j2) {
        float[] fArr = wgc.a;
        return (int) (ldc.a(j2, wgc.e) >>> 32);
    }

    public static final j5x Y(b bVar) {
        if (bVar instanceof c) {
            return Z((c) bVar);
        }
        if (bVar instanceof kotlinx.serialization.json.a) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((kotlinx.serialization.json.a) bVar).a.iterator();
            while (it.hasNext()) {
                j5x Y = Y((b) it.next());
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
            return new v4x(arrayList);
        }
        if (!(bVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) bVar;
        if (dVar instanceof JsonNull) {
            return null;
        }
        if (dVar.b()) {
            return new o6x(dVar.a());
        }
        Boolean f2 = qcx.f(dVar);
        if (f2 != null) {
            return new w4x(f2.booleanValue());
        }
        Long o = qcx.o(dVar);
        if (o != null) {
            return new i5x(o.longValue());
        }
        Double i2 = qcx.i(dVar);
        h5x h5xVar = i2 != null ? new h5x(i2.doubleValue()) : null;
        if (h5xVar != null) {
            return h5xVar;
        }
        kbs.f(dVar, "Unsupported type of element ");
        return null;
    }

    public static final m5x Z(c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            j5x Y = Y((b) entry.getValue());
            if (Y != null) {
                linkedHashMap.put(str, Y);
            }
        }
        return new m5x(linkedHashMap);
    }

    public static final void a(androidx.compose.runtime.internal.a aVar, fid fidVar, int i2) {
        int i3;
        ry2 ry2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2122607812);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.e(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            sy2.a(btsVar);
            btsVar.e0(-385399372);
            AppThemeType a2 = srt.a(btsVar);
            btsVar.e0(1865784140);
            String str = (String) btsVar.m(sy2.f);
            if (str == null) {
                str = (String) sy2.e.getValue();
            }
            btsVar.t(false);
            if (jl40.l(str, "ultima")) {
                int i5 = rrt.a[a2.ordinal()];
                if (i5 == 1) {
                    ry2Var = (ry2) hmt.c.getValue();
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return;
                    }
                    ry2Var = (ry2) hmt.d.getValue();
                }
            } else {
                int i6 = rrt.a[a2.ordinal()];
                if (i6 == 1) {
                    ry2Var = (ry2) hmt.a.getValue();
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return;
                    }
                    ry2Var = (ry2) hmt.b.getValue();
                }
            }
            xy2 xy2Var = (xy2) lmt.k.getValue();
            nx2 nx2Var = (nx2) jmt.a.getValue();
            btsVar.t(false);
            vvf0 a3 = uy2.a.a(ry2Var);
            vvf0 a4 = uy2.b.a(xy2Var);
            vvf0 a5 = uy2.c.a(nx2Var);
            a7u0 a7u0Var = q4z.a;
            boolean c2 = btsVar.c(1500) | btsVar.c(1000);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (c2 || Q == obj) {
                Q = new ltr0(0);
                btsVar.o0(Q);
            }
            ltr0 ltr0Var = (ltr0) Q;
            ltr0Var.a(btsVar, 0);
            boolean k2 = btsVar.k(ltr0Var);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == obj) {
                Q2 = new ate0(13, ltr0Var);
                btsVar.o0(Q2);
            }
            zpn.a(ltr0Var, (tls) Q2, btsVar);
            sb2.c(new vvf0[]{a3, a4, a5, a7u0Var.a(ltr0Var), lrv.a.a(fsk0.a(7, false))}, wwg.S(-1278294020, true, new vy2(aVar), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wy2(aVar, i2, i4);
        }
    }

    public static final long a0(long j2) {
        float f2 = (int) (j2 >> 32);
        float f3 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void b(AppThemeType appThemeType, String str, androidx.compose.runtime.internal.a aVar, fid fidVar, int i2, int i3) {
        String str2;
        AppThemeType appThemeType2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(170405291);
        int i4 = i2 | 6;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 54;
        } else if ((i2 & 48) == 0) {
            i4 |= btsVar.c(appThemeType == null ? -1 : appThemeType.ordinal()) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= btsVar.k(str) ? 256 : 128;
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                appThemeType = null;
            }
            if (i6 != 0) {
                str = null;
            }
            if (str == null) {
                btsVar.e0(550734770);
                str2 = (String) btsVar.m(sy2.f);
                btsVar.t(false);
            } else {
                btsVar.e0(550733747);
                btsVar.t(false);
                str2 = str;
            }
            if (appThemeType == null) {
                btsVar.e0(550736594);
                appThemeType2 = (AppThemeType) btsVar.m(sy2.d);
                btsVar.t(false);
            } else {
                btsVar.e0(550735509);
                btsVar.t(false);
                appThemeType2 = appThemeType;
            }
            btsVar.e0(550738962);
            qwd qwdVar = sy2.b;
            srt srtVar = (srt) btsVar.m(qwdVar);
            btsVar.t(false);
            sb2.c(new vvf0[]{sy2.f.a(str2), sy2.d.a(appThemeType2), qwdVar.a(srtVar)}, wwg.S(-1592884629, true, new k2z0(aVar, 3), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        AppThemeType appThemeType3 = appThemeType;
        String str3 = str;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(appThemeType3, str3, aVar, i2, i3, 4);
        }
    }

    public static final Set b0(Object obj) {
        Set set = obj instanceof Set ? (Set) obj : null;
        if (set == null) {
            return null;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return a.N0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(float f2, float f3, float f4, float f5, ugc ugcVar) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (ugcVar.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            long j2 = (i14 | ((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i15 = ldc.n;
            return j2;
        }
        if (((int) (ugcVar.b >> 32)) != 3) {
            hxv.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = ugcVar.c;
        if (i16 == -1) {
            hxv.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = ugcVar.b(0);
        float a4 = ugcVar.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i4;
                    b2 = ugcVar.b(1);
                    a2 = ugcVar.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i8;
                                b3 = ugcVar.b(2);
                                a3 = ugcVar.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            long j3 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i28 = ldc.n;
                                            return j3;
                                        }
                                        i10 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i282 = ldc.n;
                                return j32;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    b3 = ugcVar.b(2);
                    a3 = ugcVar.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (i16 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2822 = ldc.n;
                    return j322;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s3 = (short) i4;
        b2 = ugcVar.b(1);
        a2 = ugcVar.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i212 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s222 = (short) i8;
        b3 = ugcVar.b(2);
        a3 = ugcVar.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j3222 = (i16 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i28222 = ldc.n;
        return j3222;
    }

    public static ArrayList c0(String str) {
        char[] charArray = str.toCharArray();
        ioz0 ioz0Var = new ioz0(charArray);
        ArrayList arrayList = ioz0Var.c;
        try {
            Q(ioz0Var, arrayList, false);
            return arrayList;
        } catch (EvaluableException e2) {
            if (!(e2 instanceof TokenizingException)) {
                throw e2;
            }
            throw new EvaluableException("Error tokenizing '" + new String(charArray) + "'.", e2);
        }
    }

    public static final long d(int i2) {
        long j2 = i2 << 32;
        int i3 = ldc.n;
        return j2;
    }

    public static final dzp0 d0(ywl ywlVar) {
        see seeVar = ywlVar.a;
        if (seeVar instanceof dzp0) {
            return (dzp0) seeVar;
        }
        return null;
    }

    public static final long e(int i2, int i3, int i4, int i5) {
        return d(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static int e0(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static final long f(long j2) {
        long j3 = j2 << 32;
        int i2 = ldc.n;
        return j3;
    }

    public static final long h(int i2, int i3) {
        return (i3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i2 << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(float f2, float f3, float f4, float f5, ugc ugcVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (ugcVar.c()) {
            long j2 = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i11 = ldc.n;
            return j2;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = floatToRawIntBits & 8388607;
        int i15 = 49;
        int i16 = 0;
        if (i13 == 255) {
            i3 = i14 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i13 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i17 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i17) + 1) | (i12 << 15);
                    short s = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i18 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i19 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i19 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 > 0) {
                            int i20 = i19 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i20) + 1) | (i18 << 15);
                                short s2 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i21 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i22 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i16 = i22 == 0 ? 0 : 512;
                                    i15 = 31;
                                } else {
                                    int i23 = i9 - 112;
                                    if (i23 < 31) {
                                        if (i23 > 0) {
                                            i16 = i22 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i23 << 10) | i16) + 1) | (i21 << 15);
                                                long max = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (ugcVar.c & 63);
                                                int i24 = ldc.n;
                                                return max;
                                            }
                                            i15 = i23;
                                        } else if (i23 >= -10) {
                                            int i25 = (i22 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i23);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i15 = 0;
                                            i16 = i25 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    }
                                }
                                i10 = (i21 << 15) | (i15 << 10) | i16;
                                long max2 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (ugcVar.c & 63);
                                int i242 = ldc.n;
                                return max2;
                            }
                            i7 = i20;
                        } else if (i6 >= -10) {
                            int i26 = (i19 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i6);
                            if ((i26 & 4096) != 0) {
                                i26 += 8192;
                            }
                            i7 = i26 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i18 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i212 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i222 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i212 << 15) | (i15 << 10) | i16;
                    long max22 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (ugcVar.c & 63);
                    int i2422 = ldc.n;
                    return max22;
                }
                i3 = i17;
            } else if (i2 >= -10) {
                int i27 = (i14 | SelfTester_JCP.ENCRYPT_CNT) >> (1 - i2);
                if ((i27 & 4096) != 0) {
                    i27 += 8192;
                }
                i3 = i27 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i12 << 15) | (i2 << 10);
        short s3 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i182 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i192 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i182 << 15) | (i6 << 10);
        short s222 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2122 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2222 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2122 << 15) | (i15 << 10) | i16;
        long max222 = ((((short) i10) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (ugcVar.c & 63);
        int i24222 = ldc.n;
        return max222;
    }

    public static final go20 j(int i2, int i3) {
        MapBuilder mapBuilder = new MapBuilder();
        if (i2 > 0) {
            mapBuilder.put("X-Retry-Number", String.valueOf(i2));
        }
        if (i3 > 0) {
            mapBuilder.put("X-Retry-Last-Http-Status-Code", String.valueOf(i3));
        }
        return new go20(mapBuilder.j());
    }

    public static final long k(long j2, long j3) {
        float f2;
        float f3;
        long a2 = ldc.a(j2, ldc.f(j3));
        float d2 = ldc.d(j3);
        float d3 = ldc.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = ldc.h(a2);
        float h3 = ldc.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = ldc.g(a2);
        float g3 = ldc.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = ldc.e(a2);
        float e3 = ldc.e(j3);
        if (f5 != 0.0f) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return i(f2, f3, f6, f5, ldc.f(j3));
    }

    public static long l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static final wkp m(g0c g0cVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5) {
        Object failure;
        try {
            failure = (wkp) q(g0cVar, slsVar, slsVar2, slsVar3, slsVar4, slsVar5);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        wkp wkpVar = (wkp) (failure instanceof Result.Failure ? null : failure);
        Throwable a2 = Result.a(failure);
        if (wkpVar != null && a2 == null) {
            return wkpVar;
        }
        throw new IllegalArgumentException("Feature flags can only be of Boolean, String, Set<String>, Int or Float type and can not be of " + g0cVar + " type!", a2);
    }

    public static final rlp n(g0c g0cVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5) {
        Object failure;
        try {
            failure = (rlp) q(g0cVar, slsVar, slsVar2, slsVar3, slsVar4, slsVar5);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        rlp rlpVar = (rlp) (failure instanceof Result.Failure ? null : failure);
        Throwable a2 = Result.a(failure);
        if (rlpVar != null && a2 == null) {
            return rlpVar;
        }
        throw new IllegalArgumentException("Feature flags can only be of Boolean, String, Set<String>, Int or Float type and can not be of " + g0cVar + " type!", a2);
    }

    public static void o(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final void p(wu wuVar, kr krVar, pxl pxlVar) {
        if (krVar != null) {
            wuVar.b(krVar, pxlVar, kotlin.collections.b.f());
        }
    }

    public static final Object q(g0c g0cVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5) {
        Class N = ffx.N(g0cVar);
        if (Boolean.class.isAssignableFrom(N)) {
            return slsVar.invoke();
        }
        if (String.class.isAssignableFrom(N)) {
            return slsVar2.invoke();
        }
        if (Set.class.isAssignableFrom(N)) {
            return slsVar3.invoke();
        }
        if (Integer.class.isAssignableFrom(N)) {
            return slsVar4.invoke();
        }
        if (Float.class.isAssignableFrom(N)) {
            return slsVar5.invoke();
        }
        return null;
    }

    public static final pkj r(float f2) {
        return new pkj(f2, DimensionUnit.DP);
    }

    public static final int s(float f2, View view) {
        return m810.b(f2 * view.getContext().getResources().getDisplayMetrics().density);
    }

    public static final int t(int i2, Context context) {
        return m810.b(i2 * context.getResources().getDisplayMetrics().density);
    }

    public static final int u(int i2, View view) {
        return m810.b(i2 * view.getContext().getResources().getDisplayMetrics().density);
    }

    public static void v(Exception exc, String str, String str2) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static final myi w(i9 i9Var, sjd sjdVar, String str) {
        myi a2 = i9Var.a(sjdVar, str);
        if (a2 != null) {
            return a2;
        }
        vha1.e(str, i9Var.c());
        throw null;
    }

    public static final KSerializer x(i9 i9Var, Encoder encoder, Object obj) {
        KSerializer b2 = i9Var.b(encoder, obj);
        if (b2 != null) {
            return b2;
        }
        vha1.d(qoi0.a(obj.getClass()), i9Var.c());
        throw null;
    }

    public static final Object y(s7q0 s7q0Var, long j2, wls wlsVar) {
        while (true) {
            if (s7q0Var.x >= j2 && !s7q0Var.g()) {
                return s7q0Var;
            }
            Object e2 = s7q0Var.e();
            jb20 jb20Var = a;
            if (e2 == jb20Var) {
                return jb20Var;
            }
            s7q0 s7q0Var2 = (s7q0) ((cxd) e2);
            if (s7q0Var2 == null) {
                s7q0Var2 = (s7q0) wlsVar.invoke(Long.valueOf(s7q0Var.x + 1), s7q0Var);
                if (s7q0Var.j(s7q0Var2)) {
                    if (s7q0Var.g()) {
                        s7q0Var.i();
                    }
                }
            }
            s7q0Var = s7q0Var2;
        }
    }

    public static final rs31 z(View view) {
        while (view != null) {
            Object tag = view.getTag(x8h0.view_tree_view_model_store_owner);
            rs31 rs31Var = tag instanceof rs31 ? (rs31) tag : null;
            if (rs31Var != null) {
                return rs31Var;
            }
            Object p = qke.p(view);
            view = p instanceof View ? (View) p : null;
        }
        return null;
    }
}
