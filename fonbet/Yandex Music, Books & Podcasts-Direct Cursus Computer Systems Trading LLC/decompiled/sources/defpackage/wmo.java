package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.KotlinVersion;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class wmo {
    public sfm a;
    public jlo b;
    public boolean c;
    public int d;
    public boolean e;
    public umo f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(flo floVar, String str, String str2) {
        Boolean bool;
        int i;
        rko rkoVar;
        String substring;
        rko rkoVar2;
        int i2;
        int i3;
        rko C;
        rko[] rkoVarArr;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = tmo.a(str).ordinal();
        int i4 = 5;
        if (ordinal == 1) {
            x3n x3nVar = null;
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                ah3 ah3Var = new ah3(str2.substring(5));
                ah3Var.L();
                rko u = u(ah3Var);
                ah3Var.K();
                rko u2 = u(ah3Var);
                ah3Var.K();
                rko u3 = u(ah3Var);
                ah3Var.K();
                rko u4 = u(ah3Var);
                ah3Var.L();
                if (ah3Var.m(')') || ah3Var.p()) {
                    x3nVar = new x3n();
                    x3nVar.a = u;
                    x3nVar.b = u2;
                    x3nVar.c = u3;
                    x3nVar.d = u4;
                }
            }
            x3n x3nVar2 = x3nVar;
            floVar.p = x3nVar2;
            if (x3nVar2 != null) {
                floVar.a |= 1048576;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            floVar.x = r(str2);
            floVar.a |= 268435456;
            return;
        }
        if (ordinal == 4) {
            floVar.K = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            floVar.a |= 536870912;
        }
        try {
            if (ordinal == 5) {
                floVar.k = n(str2);
                floVar.a |= 4096;
                return;
            }
            if (ordinal == 8) {
                int i5 = !str2.equals("ltr") ? !str2.equals("rtl") ? 0 : 2 : 1;
                floVar.I = i5;
                if (i5 != 0) {
                    floVar.a |= 68719476736L;
                    return;
                }
                return;
            }
            if (ordinal == 35) {
                floVar.y = r(str2);
                floVar.a |= 1073741824;
                return;
            }
            if (ordinal == 40) {
                floVar.j = v(str2);
                floVar.a |= 2048;
                return;
            }
            if (ordinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                floVar.o = bool;
                if (bool != null) {
                    floVar.a |= 524288;
                    return;
                }
                return;
            }
            if (ordinal == 78) {
                int i6 = !str2.equals("none") ? !str2.equals("non-scaling-stroke") ? 0 : 2 : 1;
                floVar.L = i6;
                if (i6 != 0) {
                    floVar.a |= 34359738368L;
                    return;
                }
                return;
            }
            jko jkoVar = jko.a;
            if (ordinal == 58) {
                if (str2.equals("currentColor")) {
                    floVar.z = jkoVar;
                } else {
                    try {
                        floVar.z = n(str2);
                    } catch (nmo e) {
                        Log.w("SVGParser", e.getMessage());
                        return;
                    }
                }
                floVar.a |= 2147483648L;
                return;
            }
            if (ordinal == 59) {
                floVar.A = v(str2);
                floVar.a |= 4294967296L;
                return;
            }
            if (ordinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                floVar.J = i;
                if (i != 0) {
                    floVar.a |= 262144;
                    return;
                }
                return;
            }
            if (ordinal == 75) {
                switch (str2) {
                    case "line-through":
                        i4 = 4;
                        break;
                    case "underline":
                        i4 = 2;
                        break;
                    case "none":
                        i4 = 1;
                        break;
                    case "blink":
                        break;
                    case "overline":
                        i4 = 3;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                floVar.H = i4;
                if (i4 != 0) {
                    floVar.a |= 131072;
                    return;
                }
                return;
            }
            switch (ordinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            floVar.t = Boolean.valueOf(!str2.equals("none"));
                            floVar.a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    olo w = w(str2);
                    floVar.b = w;
                    if (w != null) {
                        floVar.a |= 1;
                        break;
                    }
                    break;
                case 16:
                    int i7 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    floVar.D = i7;
                    if (i7 != 0) {
                        floVar.a |= 2;
                        break;
                    }
                    break;
                case 17:
                    Float v = v(str2);
                    floVar.c = v;
                    if (v != null) {
                        floVar.a |= 4;
                        break;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        ah3 ah3Var2 = new ah3(str2);
                        Integer num = null;
                        String str3 = null;
                        int i8 = 0;
                        while (true) {
                            String F = ah3Var2.F('/', false);
                            ah3Var2.L();
                            if (F != null) {
                                if (num == null || i8 == 0) {
                                    if (!F.equals("normal") && (num != null || (num = (Integer) rmo.a.get(F)) == null)) {
                                        if (i8 == 0) {
                                            switch (F) {
                                                case "oblique":
                                                    i8 = 3;
                                                    break;
                                                case "italic":
                                                    i8 = 2;
                                                    break;
                                                case "normal":
                                                    i8 = 1;
                                                    break;
                                                default:
                                                    i8 = 0;
                                                    break;
                                            }
                                            if (i8 != 0) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && F.equals("small-caps")) {
                                            str3 = F;
                                        }
                                    }
                                }
                                try {
                                    rkoVar = (rko) qmo.a.get(F);
                                    if (rkoVar == null) {
                                        rkoVar = s(F);
                                    }
                                } catch (nmo unused) {
                                    rkoVar = null;
                                }
                                if (ah3Var2.m('/')) {
                                    ah3Var2.L();
                                    String E = ah3Var2.E();
                                    if (E != null) {
                                        s(E);
                                    }
                                    ah3Var2.L();
                                }
                                if (ah3Var2.p()) {
                                    substring = null;
                                } else {
                                    int i9 = ah3Var2.b;
                                    ah3Var2.b = ah3Var2.c;
                                    substring = ((String) ah3Var2.d).substring(i9);
                                }
                                floVar.l = q(substring);
                                floVar.m = rkoVar;
                                floVar.n = Integer.valueOf(num == null ? 400 : num.intValue());
                                if (i8 == 0) {
                                    i8 = 1;
                                }
                                floVar.G = i8;
                                floVar.a |= 122880;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 19:
                    ArrayList q = q(str2);
                    floVar.l = q;
                    if (q != null) {
                        floVar.a |= 8192;
                        break;
                    }
                    break;
                case 20:
                    try {
                        rko rkoVar3 = (rko) qmo.a.get(str2);
                        rkoVar2 = rkoVar3 == null ? s(str2) : rkoVar3;
                    } catch (nmo unused2) {
                        rkoVar2 = null;
                    }
                    floVar.m = rkoVar2;
                    if (rkoVar2 != null) {
                        floVar.a |= 16384;
                        break;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) rmo.a.get(str2);
                    floVar.n = num2;
                    if (num2 != null) {
                        floVar.a |= 32768;
                        break;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i2 = 3;
                            break;
                        case "italic":
                            i2 = 2;
                            break;
                        case "normal":
                            i2 = 1;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    floVar.G = i2;
                    if (i2 != 0) {
                        floVar.a |= 65536;
                        break;
                    }
                    break;
                default:
                    switch (ordinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i3 = 2;
                                    break;
                                case "auto":
                                    i3 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i3 = 3;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            floVar.X = i3;
                            if (i3 != 0) {
                                floVar.a |= 137438953472L;
                                break;
                            }
                            break;
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                            String r = r(str2);
                            floVar.q = r;
                            floVar.r = r;
                            floVar.s = r;
                            floVar.a |= 14680064;
                            break;
                        case 29:
                            floVar.q = r(str2);
                            floVar.a |= 2097152;
                            break;
                        case 30:
                            floVar.r = r(str2);
                            floVar.a |= 4194304;
                            break;
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                            floVar.s = r(str2);
                            floVar.a |= 8388608;
                            break;
                        default:
                            switch (ordinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        floVar.v = jkoVar;
                                    } else {
                                        try {
                                            floVar.v = n(str2);
                                        } catch (nmo e2) {
                                            Log.w("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    floVar.a |= 67108864;
                                    break;
                                case 63:
                                    floVar.w = v(str2);
                                    floVar.a |= 134217728;
                                    break;
                                case SQLiteDatabase.OPEN_URI /* 64 */:
                                    olo w2 = w(str2);
                                    floVar.d = w2;
                                    if (w2 != null) {
                                        floVar.a |= 8;
                                        break;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        ah3 ah3Var3 = new ah3(str2);
                                        ah3Var3.L();
                                        if (!ah3Var3.p() && (C = ah3Var3.C()) != null && !C.g()) {
                                            float f = C.a;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(C);
                                            while (true) {
                                                if (!ah3Var3.p()) {
                                                    ah3Var3.K();
                                                    rko C2 = ah3Var3.C();
                                                    if (C2 != null && !C2.g()) {
                                                        arrayList.add(C2);
                                                        f += C2.a;
                                                    }
                                                } else if (f != 0.0f) {
                                                    rkoVarArr = (rko[]) arrayList.toArray(new rko[arrayList.size()]);
                                                }
                                            }
                                        }
                                        rkoVarArr = null;
                                        floVar.h = rkoVarArr;
                                        if (rkoVarArr != null) {
                                            floVar.a |= 512;
                                            break;
                                        }
                                    } else {
                                        floVar.h = null;
                                        floVar.a |= 512;
                                        break;
                                    }
                                    break;
                                case 66:
                                    floVar.i = s(str2);
                                    floVar.a |= 1024;
                                    break;
                                case 67:
                                    int i10 = "butt".equals(str2) ? 1 : "round".equals(str2) ? 2 : "square".equals(str2) ? 3 : 0;
                                    floVar.E = i10;
                                    if (i10 != 0) {
                                        floVar.a |= 64;
                                        break;
                                    }
                                    break;
                                case 68:
                                    int i11 = "miter".equals(str2) ? 1 : "round".equals(str2) ? 2 : "bevel".equals(str2) ? 3 : 0;
                                    floVar.F = i11;
                                    if (i11 != 0) {
                                        floVar.a |= 128;
                                        break;
                                    }
                                    break;
                                case 69:
                                    floVar.g = Float.valueOf(p(str2));
                                    floVar.a |= 256;
                                    break;
                                case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                    Float v2 = v(str2);
                                    floVar.e = v2;
                                    if (v2 != null) {
                                        floVar.a |= 16;
                                        break;
                                    }
                                    break;
                                case 71:
                                    floVar.f = s(str2);
                                    floVar.a |= 32;
                                    break;
                                default:
                                    switch (ordinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                floVar.B = jkoVar;
                                            } else {
                                                try {
                                                    floVar.B = n(str2);
                                                } catch (nmo e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            floVar.a |= 8589934592L;
                                            break;
                                        case 89:
                                            floVar.C = v(str2);
                                            floVar.a |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    floVar.u = Boolean.valueOf(str2.equals("visible"));
                                                    floVar.a |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                            }
                    }
            }
        } catch (nmo unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        return f > 255.0f ? KotlinVersion.MAX_COMPONENT_VALUE : Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return b(e(f10, f9, f5 - 2.0f) * 256.0f) | (b(e(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f5) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? su4.e(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? su4.e(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(hlo hloVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = tlm.e(attributes, i);
            if (e != 73) {
                switch (e) {
                    case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                        ah3 ah3Var = new ah3(trim);
                        HashSet hashSet = new HashSet();
                        while (!ah3Var.p()) {
                            String E = ah3Var.E();
                            if (E.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(E.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            ah3Var.L();
                        }
                        hloVar.e(hashSet);
                        break;
                    case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                        hloVar.j(trim);
                        break;
                    case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                        ah3 ah3Var2 = new ah3(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!ah3Var2.p()) {
                            hashSet2.add(ah3Var2.E());
                            ah3Var2.L();
                        }
                        hloVar.k(hashSet2);
                        break;
                    case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                        ArrayList q = q(trim);
                        hloVar.i(q != null ? new HashSet(q) : new HashSet(0));
                        break;
                }
            } else {
                ah3 ah3Var3 = new ah3(trim);
                HashSet hashSet3 = new HashSet();
                while (!ah3Var3.p()) {
                    String E2 = ah3Var3.E();
                    int indexOf = E2.indexOf(45);
                    if (indexOf != -1) {
                        E2 = E2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(E2, "", "").getLanguage());
                    ah3Var3.L();
                }
                hloVar.g(hashSet3);
            }
        }
    }

    public static void g(llo lloVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals(ConnectableDevice.KEY_ID) || qName.equals("xml:id")) {
                lloVar.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    lloVar.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new nmo(f1d.g("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    lloVar.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(mko mkoVar, Attributes attributes) {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int e = tlm.e(attributes, i2);
            if (e == 23) {
                mkoVar.j = z(trim);
            } else if (e != 24) {
                if (e != 26) {
                    if (e == 60) {
                        if (trim != null) {
                            try {
                                if (trim.equals("pad")) {
                                    i = 1;
                                } else if (trim.equals("reflect")) {
                                    i = 2;
                                } else if (trim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    xq0.x("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(trim));
                                }
                                mkoVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new nmo(hrg.q("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                            }
                        } else {
                            jj4.j("Name is null");
                        }
                        i = 0;
                        mkoVar.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    mkoVar.l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mkoVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    e7o.j("Invalid value for attribute gradientUnits");
                    return;
                }
                mkoVar.i = Boolean.TRUE;
            }
        }
    }

    public static void i(alo aloVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (tmo.a(attributes.getLocalName(i)) == tmo.b) {
                ah3 ah3Var = new ah3(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                ah3Var.L();
                while (!ah3Var.p()) {
                    float B = ah3Var.B();
                    if (Float.isNaN(B)) {
                        throw new nmo(hrg.q("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    ah3Var.K();
                    float B2 = ah3Var.B();
                    if (Float.isNaN(B2)) {
                        throw new nmo(hrg.q("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    ah3Var.K();
                    arrayList.add(Float.valueOf(B));
                    arrayList.add(Float.valueOf(B2));
                }
                aloVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    aloVar.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(llo lloVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int e = tlm.e(attributes, i);
                if (e == 0) {
                    bo3 bo3Var = new bo3(trim);
                    ArrayList arrayList = null;
                    while (!bo3Var.p()) {
                        String E = bo3Var.E();
                        if (E != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(E);
                            bo3Var.L();
                        }
                    }
                    lloVar.g = arrayList;
                } else if (e != 72) {
                    if (lloVar.e == null) {
                        lloVar.e = new flo();
                    }
                    C(lloVar.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    ah3 ah3Var = new ah3(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String F = ah3Var.F(':', false);
                        ah3Var.L();
                        if (!ah3Var.m(':')) {
                            break;
                        }
                        ah3Var.L();
                        String F2 = ah3Var.F(';', true);
                        if (F2 == null) {
                            break;
                        }
                        ah3Var.L();
                        if (ah3Var.p() || ah3Var.m(';')) {
                            if (lloVar.f == null) {
                                lloVar.f = new flo();
                            }
                            C(lloVar.f, F, F2);
                            ah3Var.L();
                        }
                    }
                }
            }
        }
    }

    public static void k(amo amoVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = tlm.e(attributes, i);
            if (e == 9) {
                amoVar.p = t(trim);
            } else if (e == 10) {
                amoVar.q = t(trim);
            } else if (e == 82) {
                amoVar.n = t(trim);
            } else if (e == 83) {
                amoVar.o = t(trim);
            }
        }
    }

    public static void l(pko pkoVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (tmo.a(attributes.getLocalName(i)) == tmo.c) {
                pkoVar.l(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(rlo rloVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = tlm.e(attributes, i);
            if (e == 48) {
                x(rloVar, trim);
            } else if (e != 80) {
                continue;
            } else {
                ah3 ah3Var = new ah3(trim);
                ah3Var.L();
                float B = ah3Var.B();
                ah3Var.K();
                float B2 = ah3Var.B();
                ah3Var.K();
                float B3 = ah3Var.B();
                ah3Var.K();
                float B4 = ah3Var.B();
                if (Float.isNaN(B) || Float.isNaN(B2) || Float.isNaN(B3) || Float.isNaN(B4)) {
                    e7o.j("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (B3 < 0.0f) {
                    e7o.j("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (B4 < 0.0f) {
                        e7o.j("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    rloVar.o = new spi(B, B2, B3, B4);
                }
            }
        }
    }

    public static iko n(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            mdr mdrVar = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    mdrVar = new mdr(j2, i2);
                }
            }
            if (mdrVar == null) {
                throw new nmo("Bad hex colour value: ".concat(str));
            }
            long j3 = mdrVar.b;
            int i3 = mdrVar.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new iko(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new iko(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new nmo("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new iko((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new iko((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            ah3 ah3Var = new ah3(str.substring(startsWith ? 5 : 4));
            ah3Var.L();
            float B = ah3Var.B();
            if (!Float.isNaN(B) && ah3Var.m('%')) {
                B = (B * 256.0f) / 100.0f;
            }
            float l = ah3Var.l(B);
            if (!Float.isNaN(l) && ah3Var.m('%')) {
                l = (l * 256.0f) / 100.0f;
            }
            float l2 = ah3Var.l(l);
            if (!Float.isNaN(l2) && ah3Var.m('%')) {
                l2 = (l2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                ah3Var.L();
                if (Float.isNaN(l2) || !ah3Var.m(')')) {
                    throw new nmo("Bad rgb() colour value: ".concat(str));
                }
                return new iko((b(B) << 16) | (-16777216) | (b(l) << 8) | b(l2));
            }
            float l3 = ah3Var.l(l2);
            ah3Var.L();
            if (Float.isNaN(l3) || !ah3Var.m(')')) {
                throw new nmo("Bad rgba() colour value: ".concat(str));
            }
            return new iko((b(l3 * 256.0f) << 24) | (b(B) << 16) | (b(l) << 8) | b(l2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) pmo.a.get(lowerCase);
            if (num != null) {
                return new iko(num.intValue());
            }
            throw new nmo("Invalid colour keyword: ".concat(lowerCase));
        }
        ah3 ah3Var2 = new ah3(str.substring(startsWith2 ? 5 : 4));
        ah3Var2.L();
        float B2 = ah3Var2.B();
        float l4 = ah3Var2.l(B2);
        if (!Float.isNaN(l4)) {
            ah3Var2.m('%');
        }
        float l5 = ah3Var2.l(l4);
        if (!Float.isNaN(l5)) {
            ah3Var2.m('%');
        }
        if (!startsWith2) {
            ah3Var2.L();
            if (Float.isNaN(l5) || !ah3Var2.m(')')) {
                throw new nmo("Bad hsl() colour value: ".concat(str));
            }
            return new iko(d(B2, l4, l5) | (-16777216));
        }
        float l6 = ah3Var2.l(l5);
        ah3Var2.L();
        if (Float.isNaN(l6) || !ah3Var2.m(')')) {
            throw new nmo("Bad hsla() colour value: ".concat(str));
        }
        return new iko((b(l6 * 256.0f) << 24) | d(B2, l4, l5));
    }

    public static float o(int i, String str) {
        float l = new jsg(1).l(0, i, str);
        if (Float.isNaN(l)) {
            throw new nmo(f1d.g("Invalid float value: ", str));
        }
        return l;
    }

    public static float p(String str) {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        e7o.j("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        ah3 ah3Var = new ah3(str);
        ArrayList arrayList = null;
        do {
            String D = ah3Var.D();
            if (D == null) {
                D = ah3Var.F(',', true);
            }
            if (D == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(D);
            ah3Var.K();
        } while (!ah3Var.p());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static rko s(String str) {
        int i;
        if (str.length() == 0) {
            e7o.j("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            i = 9;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                i = tlm.q(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new nmo("Invalid length unit specifier: ".concat(str));
            }
        } else {
            i = 1;
        }
        try {
            return new rko(i, o(length, str));
        } catch (NumberFormatException e) {
            throw new nmo("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) {
        if (str.length() == 0) {
            e7o.j("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        ah3 ah3Var = new ah3(str);
        ah3Var.L();
        while (!ah3Var.p()) {
            float B = ah3Var.B();
            if (Float.isNaN(B)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) ah3Var.d;
                int i = ah3Var.b;
                while (!ah3Var.p() && !ah3.y(str2.charAt(ah3Var.b))) {
                    ah3Var.b++;
                }
                String substring = str2.substring(i, ah3Var.b);
                ah3Var.b = i;
                sb.append(substring);
                throw new nmo(sb.toString());
            }
            int G = ah3Var.G();
            if (G == 0) {
                G = 1;
            }
            arrayList.add(new rko(G, B));
            ah3Var.K();
        }
        return arrayList;
    }

    public static rko u(ah3 ah3Var) {
        return ah3Var.n("auto") ? new rko(0.0f) : ah3Var.C();
    }

    public static Float v(String str) {
        try {
            float p = p(str);
            float f = 0.0f;
            if (p >= 0.0f) {
                f = 1.0f;
                if (p > 1.0f) {
                }
                return Float.valueOf(p);
            }
            p = f;
            return Float.valueOf(p);
        } catch (nmo unused) {
            return null;
        }
    }

    public static olo w(String str) {
        boolean startsWith = str.startsWith("url(");
        olo oloVar = iko.c;
        olo oloVar2 = jko.a;
        olo oloVar3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return oloVar;
            }
            if (str.equals("currentColor")) {
                return oloVar2;
            }
            try {
                return n(str);
            } catch (nmo unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new wko(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    oloVar = oloVar2;
                } else {
                    try {
                        oloVar = n(trim2);
                    } catch (nmo unused2) {
                        oloVar = null;
                    }
                }
            }
            oloVar3 = oloVar;
        }
        return new wko(trim, oloVar3);
    }

    public static void x(plo ploVar, String str) {
        int i;
        ah3 ah3Var = new ah3(str);
        ah3Var.L();
        String E = ah3Var.E();
        if ("defer".equals(E)) {
            ah3Var.L();
            E = ah3Var.E();
        }
        kqm kqmVar = (kqm) omo.a.get(E);
        ah3Var.L();
        if (ah3Var.p()) {
            i = 0;
        } else {
            String E2 = ah3Var.E();
            E2.getClass();
            if (E2.equals("meet")) {
                i = 1;
            } else {
                if (!E2.equals("slice")) {
                    throw new nmo("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        ploVar.n = new lqm(kqmVar, i);
    }

    public static HashMap y(ah3 ah3Var) {
        HashMap hashMap = new HashMap();
        ah3Var.L();
        String F = ah3Var.F('=', false);
        while (F != null) {
            ah3Var.m('=');
            hashMap.put(F, ah3Var.D());
            ah3Var.L();
            F = ah3Var.F('=', false);
        }
        return hashMap;
    }

    public static Matrix z(String str) {
        Matrix matrix = new Matrix();
        ah3 ah3Var = new ah3(str);
        ah3Var.L();
        while (!ah3Var.p()) {
            String str2 = (String) ah3Var.d;
            String str3 = null;
            if (!ah3Var.p()) {
                int i = ah3Var.b;
                int charAt = str2.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = ah3Var.i();
                    }
                }
                int i2 = ah3Var.b;
                while (ah3.y(charAt)) {
                    charAt = ah3Var.i();
                }
                if (charAt == 40) {
                    ah3Var.b++;
                    str3 = str2.substring(i, i2);
                } else {
                    ah3Var.b = i;
                }
            }
            if (str3 == null) {
                throw new nmo("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str3) {
                case "matrix":
                    ah3Var.L();
                    float B = ah3Var.B();
                    ah3Var.K();
                    float B2 = ah3Var.B();
                    ah3Var.K();
                    float B3 = ah3Var.B();
                    ah3Var.K();
                    float B4 = ah3Var.B();
                    ah3Var.K();
                    float B5 = ah3Var.B();
                    ah3Var.K();
                    float B6 = ah3Var.B();
                    ah3Var.L();
                    if (!Float.isNaN(B6) && ah3Var.m(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{B, B3, B5, B2, B4, B6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    ah3Var.L();
                    float B7 = ah3Var.B();
                    float H = ah3Var.H();
                    float H2 = ah3Var.H();
                    ah3Var.L();
                    if (Float.isNaN(B7) || !ah3Var.m(')')) {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(H)) {
                        matrix.preRotate(B7);
                        break;
                    } else if (!Float.isNaN(H2)) {
                        matrix.preRotate(B7, H, H2);
                        break;
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    ah3Var.L();
                    float B8 = ah3Var.B();
                    float H3 = ah3Var.H();
                    ah3Var.L();
                    if (!Float.isNaN(B8) && ah3Var.m(')')) {
                        if (!Float.isNaN(H3)) {
                            matrix.preScale(B8, H3);
                            break;
                        } else {
                            matrix.preScale(B8, B8);
                            break;
                        }
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    ah3Var.L();
                    float B9 = ah3Var.B();
                    ah3Var.L();
                    if (!Float.isNaN(B9) && ah3Var.m(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(B9)), 0.0f);
                        break;
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    ah3Var.L();
                    float B10 = ah3Var.B();
                    ah3Var.L();
                    if (!Float.isNaN(B10) && ah3Var.m(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(B10)));
                        break;
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    ah3Var.L();
                    float B11 = ah3Var.B();
                    float H4 = ah3Var.H();
                    ah3Var.L();
                    if (!Float.isNaN(B11) && ah3Var.m(')')) {
                        if (!Float.isNaN(H4)) {
                            matrix.preTranslate(B11, H4);
                            break;
                        } else {
                            matrix.preTranslate(B11, 0.0f);
                            break;
                        }
                    } else {
                        throw new nmo("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new nmo(hrg.q("Invalid transform list fn: ", str3, ")"));
            }
            if (ah3Var.p()) {
                return matrix;
            }
            ah3Var.K();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            smo smoVar = new smo(this);
            xMLReader.setContentHandler(smoVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", smoVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new nmo("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new nmo("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new nmo("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                vmo vmoVar = new vmo();
                vmoVar.a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        ah3 ah3Var = new ah3(newPullParser.getText());
                        String E = ah3Var.E();
                        y(ah3Var);
                        E.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            E(newPullParser.getNamespace(), newPullParser.getName(), name, vmoVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            G(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            F(newPullParser.getText());
                        }
                    } else if (((glo) this.a.a) == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            A(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                throw new nmo("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new nmo("Stream error", e2);
        }
    }

    public final void D() {
        sfm sfmVar = new sfm();
        sfmVar.a = null;
        sfmVar.b = new lo3(0);
        sfmVar.c = new HashMap();
        this.a = sfmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x044d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05f0, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x09ff, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0abd, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0c01, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0e11, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0955 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(String str, String str2, String str3, Attributes attributes) {
        int i;
        int intValue;
        float B;
        float f;
        float f2;
        float f3;
        float f4;
        char charAt;
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            umo umoVar = (umo) umo.e.get(str2.length() > 0 ? str2 : str3);
            if (umoVar == null) {
                umoVar = umo.d;
            }
            int i2 = 0;
            switch (umoVar.ordinal()) {
                case 0:
                    glo gloVar = new glo();
                    gloVar.a = this.a;
                    gloVar.b = this.b;
                    g(gloVar, attributes);
                    j(gloVar, attributes);
                    f(gloVar, attributes);
                    m(gloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim = attributes.getValue(i2).trim();
                        int e = tlm.e(attributes, i2);
                        if (e == 25) {
                            rko s = s(trim);
                            gloVar.s = s;
                            if (s.g()) {
                                e7o.j("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (e != 79) {
                            switch (e) {
                                case 81:
                                    rko s2 = s(trim);
                                    gloVar.r = s2;
                                    if (s2.g()) {
                                        e7o.j("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    gloVar.p = s(trim);
                                    break;
                                case 83:
                                    gloVar.q = s(trim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    }
                    jlo jloVar = this.b;
                    if (jloVar == null) {
                        this.a.a = gloVar;
                    } else {
                        jloVar.h(gloVar);
                    }
                    this.b = gloVar;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    oko okoVar = new oko();
                    okoVar.a = this.a;
                    okoVar.b = this.b;
                    g(okoVar, attributes);
                    j(okoVar, attributes);
                    l(okoVar, attributes);
                    f(okoVar, attributes);
                    this.b.h(okoVar);
                    this.b = okoVar;
                    return;
                case 2:
                    jlo jloVar2 = this.b;
                    if (jloVar2 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gko gkoVar = new gko();
                    gkoVar.a = this.a;
                    gkoVar.b = jloVar2;
                    g(gkoVar, attributes);
                    j(gkoVar, attributes);
                    l(gkoVar, attributes);
                    f(gkoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim2 = attributes.getValue(i2).trim();
                        int e2 = tlm.e(attributes, i2);
                        if (e2 == 6) {
                            gkoVar.o = s(trim2);
                        } else if (e2 == 7) {
                            gkoVar.p = s(trim2);
                        } else if (e2 != 49) {
                            continue;
                        } else {
                            rko s3 = s(trim2);
                            gkoVar.q = s3;
                            if (s3.g()) {
                                e7o.j("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                        i2++;
                    }
                    this.b.h(gkoVar);
                    return;
                case 3:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    hko hkoVar = new hko();
                    hkoVar.a = this.a;
                    hkoVar.b = this.b;
                    g(hkoVar, attributes);
                    j(hkoVar, attributes);
                    l(hkoVar, attributes);
                    f(hkoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim3 = attributes.getValue(i2).trim();
                        if (tlm.e(attributes, i2) == 3) {
                            if ("objectBoundingBox".equals(trim3)) {
                                hkoVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim3)) {
                                    e7o.j("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                hkoVar.o = Boolean.TRUE;
                            }
                        }
                        i2++;
                    }
                    this.b.h(hkoVar);
                    this.b = hkoVar;
                    return;
                case 4:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    kko kkoVar = new kko();
                    kkoVar.a = this.a;
                    kkoVar.b = this.b;
                    g(kkoVar, attributes);
                    j(kkoVar, attributes);
                    l(kkoVar, attributes);
                    this.b.h(kkoVar);
                    this.b = kkoVar;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = umoVar;
                    return;
                case 6:
                    jlo jloVar3 = this.b;
                    if (jloVar3 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lko lkoVar = new lko();
                    lkoVar.a = this.a;
                    lkoVar.b = jloVar3;
                    g(lkoVar, attributes);
                    j(lkoVar, attributes);
                    l(lkoVar, attributes);
                    f(lkoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim4 = attributes.getValue(i2).trim();
                        int e3 = tlm.e(attributes, i2);
                        if (e3 == 6) {
                            lkoVar.o = s(trim4);
                        } else if (e3 == 7) {
                            lkoVar.p = s(trim4);
                        } else if (e3 == 56) {
                            rko s4 = s(trim4);
                            lkoVar.q = s4;
                            if (s4.g()) {
                                e7o.j("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (e3 != 57) {
                            continue;
                        } else {
                            rko s5 = s(trim4);
                            lkoVar.r = s5;
                            if (s5.g()) {
                                e7o.j("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                        i2++;
                    }
                    this.b.h(lkoVar);
                    return;
                case 8:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qko qkoVar = new qko();
                    qkoVar.a = this.a;
                    qkoVar.b = this.b;
                    g(qkoVar, attributes);
                    j(qkoVar, attributes);
                    l(qkoVar, attributes);
                    f(qkoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim5 = attributes.getValue(i2).trim();
                        int e4 = tlm.e(attributes, i2);
                        if (e4 == 25) {
                            rko s6 = s(trim5);
                            qkoVar.s = s6;
                            if (s6.g()) {
                                e7o.j("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (e4 != 26) {
                            if (e4 != 48) {
                                switch (e4) {
                                    case 81:
                                        rko s7 = s(trim5);
                                        qkoVar.r = s7;
                                        if (s7.g()) {
                                            e7o.j("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        qkoVar.p = s(trim5);
                                        break;
                                    case 83:
                                        qkoVar.q = s(trim5);
                                        break;
                                }
                            } else {
                                x(qkoVar, trim5);
                            }
                        } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            qkoVar.o = trim5;
                        }
                        i2++;
                    }
                    this.b.h(qkoVar);
                    this.b = qkoVar;
                    return;
                case 9:
                    jlo jloVar4 = this.b;
                    if (jloVar4 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    sko skoVar = new sko();
                    skoVar.a = this.a;
                    skoVar.b = jloVar4;
                    g(skoVar, attributes);
                    j(skoVar, attributes);
                    l(skoVar, attributes);
                    f(skoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim6 = attributes.getValue(i2).trim();
                        switch (tlm.e(attributes, i2)) {
                            case 84:
                                skoVar.o = s(trim6);
                                break;
                            case 85:
                                skoVar.p = s(trim6);
                                break;
                            case 86:
                                skoVar.q = s(trim6);
                                break;
                            case 87:
                                skoVar.r = s(trim6);
                                break;
                        }
                        i2++;
                    }
                    this.b.h(skoVar);
                    return;
                case 10:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mlo mloVar = new mlo();
                    mloVar.a = this.a;
                    mloVar.b = this.b;
                    g(mloVar, attributes);
                    j(mloVar, attributes);
                    h(mloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim7 = attributes.getValue(i2).trim();
                        switch (tlm.e(attributes, i2)) {
                            case 84:
                                mloVar.m = s(trim7);
                                break;
                            case 85:
                                mloVar.n = s(trim7);
                                break;
                            case 86:
                                mloVar.o = s(trim7);
                                break;
                            case 87:
                                mloVar.p = s(trim7);
                                break;
                        }
                        i2++;
                    }
                    this.b.h(mloVar);
                    this.b = mloVar;
                    return;
                case 11:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tko tkoVar = new tko();
                    tkoVar.a = this.a;
                    tkoVar.b = this.b;
                    g(tkoVar, attributes);
                    j(tkoVar, attributes);
                    f(tkoVar, attributes);
                    m(tkoVar, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String trim8 = attributes.getValue(i3).trim();
                        int e5 = tlm.e(attributes, i3);
                        if (e5 != 41) {
                            if (e5 == 50) {
                                tkoVar.q = s(trim8);
                            } else if (e5 != 51) {
                                switch (e5) {
                                    case 32:
                                        rko s8 = s(trim8);
                                        tkoVar.t = s8;
                                        if (s8.g()) {
                                            e7o.j("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        break;
                                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                        if (!"strokeWidth".equals(trim8)) {
                                            if ("userSpaceOnUse".equals(trim8)) {
                                                tkoVar.p = true;
                                                break;
                                            } else {
                                                e7o.j("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                        } else {
                                            tkoVar.p = false;
                                            break;
                                        }
                                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                        rko s9 = s(trim8);
                                        tkoVar.s = s9;
                                        if (s9.g()) {
                                            e7o.j("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                tkoVar.r = s(trim8);
                            }
                        } else if ("auto".equals(trim8)) {
                            tkoVar.u = Float.valueOf(Float.NaN);
                        } else {
                            tkoVar.u = Float.valueOf(p(trim8));
                        }
                    }
                    this.b.h(tkoVar);
                    this.b = tkoVar;
                    return;
                case 12:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    uko ukoVar = new uko();
                    ukoVar.a = this.a;
                    ukoVar.b = this.b;
                    g(ukoVar, attributes);
                    j(ukoVar, attributes);
                    f(ukoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim9 = attributes.getValue(i2).trim();
                        int e6 = tlm.e(attributes, i2);
                        if (e6 == 25) {
                            rko s10 = s(trim9);
                            ukoVar.q = s10;
                            if (s10.g()) {
                                e7o.j("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (e6 != 36) {
                            if (e6 != 37) {
                                switch (e6) {
                                    case 81:
                                        rko s11 = s(trim9);
                                        ukoVar.p = s11;
                                        if (s11.g()) {
                                            e7o.j("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        s(trim9);
                                        break;
                                    case 83:
                                        s(trim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(trim9)) {
                                ukoVar.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim9)) {
                                    e7o.j("Invalid value for attribute maskUnits");
                                    return;
                                }
                                ukoVar.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim9)) {
                            ukoVar.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim9)) {
                                e7o.j("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            ukoVar.o = Boolean.TRUE;
                        }
                        i2++;
                    }
                    this.b.h(ukoVar);
                    this.b = ukoVar;
                    return;
                case 13:
                    jlo jloVar5 = this.b;
                    if (jloVar5 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    xko xkoVar = new xko();
                    xkoVar.a = this.a;
                    xkoVar.b = jloVar5;
                    g(xkoVar, attributes);
                    j(xkoVar, attributes);
                    l(xkoVar, attributes);
                    f(xkoVar, attributes);
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < attributes.getLength()) {
                        String trim10 = attributes.getValue(i5).trim();
                        int e7 = tlm.e(attributes, i5);
                        float f5 = 0.0f;
                        if (e7 == 13) {
                            ah3 ah3Var = new ah3(trim10);
                            ah3 ah3Var2 = new ah3(6, (byte) 0);
                            ah3Var2.b = i4;
                            ah3Var2.c = i4;
                            ah3Var2.d = new byte[8];
                            ah3Var2.e = new float[16];
                            if (!ah3Var.p() && ((intValue = ah3Var.A().intValue()) == 77 || intValue == 109)) {
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                float f9 = 0.0f;
                                float f10 = 0.0f;
                                float f11 = 0.0f;
                                while (true) {
                                    ah3Var.L();
                                    float f12 = f5;
                                    switch (intValue) {
                                        case 65:
                                        case 97:
                                            i = i5;
                                            float B2 = ah3Var.B();
                                            float l = ah3Var.l(B2);
                                            float f13 = f8;
                                            float l2 = ah3Var.l(l);
                                            Boolean k = ah3Var.k(Float.valueOf(l2));
                                            Boolean k2 = ah3Var.k(k);
                                            if (k2 == null) {
                                                B = Float.NaN;
                                            } else {
                                                ah3Var.K();
                                                B = ah3Var.B();
                                            }
                                            float f14 = B;
                                            float l3 = ah3Var.l(f14);
                                            if (!Float.isNaN(l3) && B2 >= f12 && l >= f12) {
                                                if (intValue == 97) {
                                                    f = f14 + f6;
                                                    l3 += f13;
                                                } else {
                                                    f = f14;
                                                }
                                                boolean booleanValue = k.booleanValue();
                                                boolean booleanValue2 = k2.booleanValue();
                                                float f15 = f;
                                                float f16 = l3;
                                                ah3Var2.f(B2, l, l2, booleanValue, booleanValue2, f15, f16);
                                                f6 = f15;
                                                f7 = f6;
                                                f8 = f16;
                                                f9 = f8;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                    break;
                                                } else {
                                                    int i6 = ah3Var.b;
                                                    if (i6 != ah3Var.c && (((charAt = ((String) ah3Var.d).charAt(i6)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                        intValue = ah3Var.A().intValue();
                                                    }
                                                    f5 = f12;
                                                    i5 = i;
                                                }
                                            }
                                            break;
                                        case 67:
                                        case 99:
                                            i = i5;
                                            float B3 = ah3Var.B();
                                            float l4 = ah3Var.l(B3);
                                            float l5 = ah3Var.l(l4);
                                            float l6 = ah3Var.l(l5);
                                            float l7 = ah3Var.l(l6);
                                            float l8 = ah3Var.l(l7);
                                            if (Float.isNaN(l8)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 99) {
                                                    l7 += f6;
                                                    l8 += f8;
                                                    B3 += f6;
                                                    l4 += f8;
                                                    l5 += f6;
                                                    l6 += f8;
                                                }
                                                float f17 = B3;
                                                f2 = l5;
                                                f3 = l8;
                                                f9 = l6;
                                                float f18 = l4;
                                                f4 = l7;
                                                ah3Var2.e(f17, f18, f2, f9, f4, f3);
                                                f7 = f2;
                                                f6 = f4;
                                                f8 = f3;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 72:
                                        case 104:
                                            i = i5;
                                            float B4 = ah3Var.B();
                                            if (Float.isNaN(B4)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 104) {
                                                    B4 += f6;
                                                }
                                                f6 = B4;
                                                ah3Var2.g(f6, f8);
                                                f7 = f6;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 76:
                                        case 108:
                                            i = i5;
                                            float B5 = ah3Var.B();
                                            float l9 = ah3Var.l(B5);
                                            if (Float.isNaN(l9)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 108) {
                                                    B5 += f6;
                                                    l9 += f8;
                                                }
                                                f6 = B5;
                                                f8 = l9;
                                                ah3Var2.g(f6, f8);
                                                f7 = f6;
                                                f9 = f8;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            i = i5;
                                            float B6 = ah3Var.B();
                                            float l10 = ah3Var.l(B6);
                                            if (Float.isNaN(l10)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 109 && ah3Var2.b != 0) {
                                                    B6 += f6;
                                                    l10 += f8;
                                                }
                                                f6 = B6;
                                                f8 = l10;
                                                ah3Var2.d(f6, f8);
                                                f7 = f6;
                                                f10 = f7;
                                                f9 = f8;
                                                f11 = f9;
                                                intValue = intValue != 109 ? 76 : 108;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 81:
                                        case 113:
                                            i = i5;
                                            float B7 = ah3Var.B();
                                            float l11 = ah3Var.l(B7);
                                            float l12 = ah3Var.l(l11);
                                            float l13 = ah3Var.l(l12);
                                            if (Float.isNaN(l13)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 113) {
                                                    l12 += f6;
                                                    l13 += f8;
                                                    B7 += f6;
                                                    l11 += f8;
                                                }
                                                f6 = l12;
                                                f8 = l13;
                                                ah3Var2.a(B7, l11, f6, f8);
                                                f7 = B7;
                                                f9 = l11;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 83:
                                        case 115:
                                            float f19 = (f6 * 2.0f) - f7;
                                            float f20 = (2.0f * f8) - f9;
                                            float B8 = ah3Var.B();
                                            float l14 = ah3Var.l(B8);
                                            i = i5;
                                            float l15 = ah3Var.l(l14);
                                            float l16 = ah3Var.l(l15);
                                            if (Float.isNaN(l16)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 115) {
                                                    l15 += f6;
                                                    l16 += f8;
                                                    B8 += f6;
                                                    l14 += f8;
                                                }
                                                f2 = B8;
                                                f9 = l14;
                                                f3 = l16;
                                                f4 = l15;
                                                ah3Var2.e(f19, f20, f2, f9, f4, f3);
                                                f7 = f2;
                                                f6 = f4;
                                                f8 = f3;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 84:
                                        case BuildConfig.API_LEVEL /* 116 */:
                                            f7 = (f6 * 2.0f) - f7;
                                            f9 = (2.0f * f8) - f9;
                                            float B9 = ah3Var.B();
                                            float l17 = ah3Var.l(B9);
                                            if (Float.isNaN(l17)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 116) {
                                                    B9 += f6;
                                                    l17 += f8;
                                                }
                                                f6 = B9;
                                                f8 = l17;
                                                ah3Var2.a(f7, f9, f6, f8);
                                                i = i5;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 86:
                                        case 118:
                                            float B10 = ah3Var.B();
                                            if (Float.isNaN(B10)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 118) {
                                                    B10 += f8;
                                                }
                                                f8 = B10;
                                                ah3Var2.g(f6, f8);
                                                i = i5;
                                                f9 = f8;
                                                ah3Var.K();
                                                if (!ah3Var.p()) {
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            ah3Var2.close();
                                            i = i5;
                                            f6 = f10;
                                            f7 = f6;
                                            f8 = f11;
                                            f9 = f8;
                                            ah3Var.K();
                                            if (!ah3Var.p()) {
                                            }
                                            break;
                                    }
                                }
                                xkoVar.o = ah3Var2;
                            }
                            i = i5;
                            xkoVar.o = ah3Var2;
                        } else {
                            if (e7 == 43 && p(trim10) < 0.0f) {
                                e7o.j("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i = i5;
                        }
                        i5 = i + 1;
                        i4 = 0;
                    }
                    this.b.h(xkoVar);
                    return;
                case 14:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zko zkoVar = new zko();
                    zkoVar.a = this.a;
                    zkoVar.b = this.b;
                    g(zkoVar, attributes);
                    j(zkoVar, attributes);
                    f(zkoVar, attributes);
                    m(zkoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim11 = attributes.getValue(i2).trim();
                        int e8 = tlm.e(attributes, i2);
                        if (e8 == 25) {
                            rko s12 = s(trim11);
                            zkoVar.v = s12;
                            if (s12.g()) {
                                e7o.j("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (e8 != 26) {
                            switch (e8) {
                                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            zkoVar.q = Boolean.TRUE;
                                            break;
                                        } else {
                                            e7o.j("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                    } else {
                                        zkoVar.q = Boolean.FALSE;
                                        break;
                                    }
                                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                    zkoVar.r = z(trim11);
                                    break;
                                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            zkoVar.p = Boolean.TRUE;
                                            break;
                                        } else {
                                            e7o.j("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                    } else {
                                        zkoVar.p = Boolean.FALSE;
                                        break;
                                    }
                                default:
                                    switch (e8) {
                                        case 81:
                                            rko s13 = s(trim11);
                                            zkoVar.u = s13;
                                            if (s13.g()) {
                                                e7o.j("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                        case 82:
                                            zkoVar.s = s(trim11);
                                            break;
                                        case 83:
                                            zkoVar.t = s(trim11);
                                            break;
                                    }
                            }
                        } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            zkoVar.w = trim11;
                        }
                        i2++;
                    }
                    this.b.h(zkoVar);
                    this.b = zkoVar;
                    return;
                case 15:
                    jlo jloVar6 = this.b;
                    if (jloVar6 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    blo bloVar = new blo();
                    bloVar.a = this.a;
                    bloVar.b = jloVar6;
                    g(bloVar, attributes);
                    j(bloVar, attributes);
                    l(bloVar, attributes);
                    f(bloVar, attributes);
                    i(bloVar, attributes, "polygon");
                    this.b.h(bloVar);
                    return;
                case 16:
                    jlo jloVar7 = this.b;
                    if (jloVar7 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    alo aloVar = new alo();
                    aloVar.a = this.a;
                    aloVar.b = jloVar7;
                    g(aloVar, attributes);
                    j(aloVar, attributes);
                    l(aloVar, attributes);
                    f(aloVar, attributes);
                    i(aloVar, attributes, "polyline");
                    this.b.h(aloVar);
                    return;
                case 17:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qlo qloVar = new qlo();
                    qloVar.a = this.a;
                    qloVar.b = this.b;
                    g(qloVar, attributes);
                    j(qloVar, attributes);
                    h(qloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim12 = attributes.getValue(i2).trim();
                        int e9 = tlm.e(attributes, i2);
                        if (e9 == 6) {
                            qloVar.m = s(trim12);
                        } else if (e9 == 7) {
                            qloVar.n = s(trim12);
                        } else if (e9 == 11) {
                            qloVar.p = s(trim12);
                        } else if (e9 == 12) {
                            qloVar.q = s(trim12);
                        } else if (e9 != 49) {
                            continue;
                        } else {
                            rko s14 = s(trim12);
                            qloVar.o = s14;
                            if (s14.g()) {
                                e7o.j("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                        i2++;
                    }
                    this.b.h(qloVar);
                    this.b = qloVar;
                    return;
                case 18:
                    jlo jloVar8 = this.b;
                    if (jloVar8 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    clo cloVar = new clo();
                    cloVar.a = this.a;
                    cloVar.b = jloVar8;
                    g(cloVar, attributes);
                    j(cloVar, attributes);
                    l(cloVar, attributes);
                    f(cloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim13 = attributes.getValue(i2).trim();
                        int e10 = tlm.e(attributes, i2);
                        if (e10 == 25) {
                            rko s15 = s(trim13);
                            cloVar.r = s15;
                            if (s15.g()) {
                                e7o.j("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (e10 == 56) {
                            rko s16 = s(trim13);
                            cloVar.s = s16;
                            if (s16.g()) {
                                e7o.j("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (e10 != 57) {
                            switch (e10) {
                                case 81:
                                    rko s17 = s(trim13);
                                    cloVar.q = s17;
                                    if (s17.g()) {
                                        e7o.j("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    cloVar.o = s(trim13);
                                    break;
                                case 83:
                                    cloVar.p = s(trim13);
                                    break;
                            }
                        } else {
                            rko s18 = s(trim13);
                            cloVar.t = s18;
                            if (s18.g()) {
                                e7o.j("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i2++;
                    }
                    this.b.h(cloVar);
                    return;
                case 19:
                    jlo jloVar9 = this.b;
                    if (jloVar9 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dlo dloVar = new dlo();
                    dloVar.a = this.a;
                    dloVar.b = jloVar9;
                    g(dloVar, attributes);
                    j(dloVar, attributes);
                    this.b.h(dloVar);
                    this.b = dloVar;
                    return;
                case 20:
                    jlo jloVar10 = this.b;
                    if (jloVar10 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(jloVar10 instanceof mko)) {
                        e7o.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    elo eloVar = new elo();
                    eloVar.a = this.a;
                    eloVar.b = jloVar10;
                    g(eloVar, attributes);
                    j(eloVar, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String trim14 = attributes.getValue(i7).trim();
                        if (tlm.e(attributes, i7) == 39) {
                            if (trim14.length() == 0) {
                                e7o.j("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = trim14.length();
                            if (trim14.charAt(trim14.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float o = o(length, trim14);
                                float f21 = 100.0f;
                                if (z) {
                                    o /= 100.0f;
                                }
                                if (o < 0.0f) {
                                    f21 = 0.0f;
                                } else if (o <= 100.0f) {
                                    f21 = o;
                                }
                                eloVar.h = Float.valueOf(f21);
                            } catch (NumberFormatException e11) {
                                throw new nmo("Invalid offset value in <stop>: ".concat(trim14), e11);
                            }
                        }
                    }
                    this.b.h(eloVar);
                    this.b = eloVar;
                    return;
                case 21:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean z2 = true;
                    while (i2 < attributes.getLength()) {
                        String trim15 = attributes.getValue(i2).trim();
                        int e12 = tlm.e(attributes, i2);
                        if (e12 == 38) {
                            str4 = trim15;
                        } else if (e12 == 77) {
                            z2 = trim15.equals("text/css");
                        }
                        i2++;
                    }
                    if (z2) {
                        bo3 bo3Var = new bo3(str4);
                        bo3Var.L();
                        Iterator it = n20.j(bo3Var).iterator();
                        while (it.hasNext()) {
                            co3 co3Var = (co3) it.next();
                            if (co3Var == co3.a || co3Var == co3.b) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    slo sloVar = new slo();
                    sloVar.a = this.a;
                    sloVar.b = this.b;
                    g(sloVar, attributes);
                    j(sloVar, attributes);
                    l(sloVar, attributes);
                    f(sloVar, attributes);
                    this.b.h(sloVar);
                    this.b = sloVar;
                    return;
                case 23:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tlo tloVar = new tlo();
                    tloVar.a = this.a;
                    tloVar.b = this.b;
                    g(tloVar, attributes);
                    j(tloVar, attributes);
                    f(tloVar, attributes);
                    m(tloVar, attributes);
                    this.b.h(tloVar);
                    this.b = tloVar;
                    return;
                case 24:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    wlo wloVar = new wlo();
                    wloVar.a = this.a;
                    wloVar.b = this.b;
                    g(wloVar, attributes);
                    j(wloVar, attributes);
                    l(wloVar, attributes);
                    f(wloVar, attributes);
                    k(wloVar, attributes);
                    this.b.h(wloVar);
                    this.b = wloVar;
                    return;
                case 25:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zlo zloVar = new zlo();
                    zloVar.a = this.a;
                    zloVar.b = this.b;
                    g(zloVar, attributes);
                    j(zloVar, attributes);
                    f(zloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim16 = attributes.getValue(i2).trim();
                        int e13 = tlm.e(attributes, i2);
                        if (e13 != 26) {
                            if (e13 == 61) {
                                zloVar.o = s(trim16);
                            }
                        } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            zloVar.n = trim16;
                        }
                        i2++;
                    }
                    this.b.h(zloVar);
                    this.b = zloVar;
                    jlo jloVar11 = zloVar.b;
                    if (jloVar11 instanceof wlo) {
                        zloVar.p = (wlo) jloVar11;
                        return;
                    } else {
                        zloVar.p = ((xlo) jloVar11).d();
                        return;
                    }
                case 27:
                    jlo jloVar12 = this.b;
                    if (jloVar12 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(jloVar12 instanceof ylo)) {
                        e7o.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    ulo uloVar = new ulo();
                    uloVar.a = this.a;
                    uloVar.b = this.b;
                    g(uloVar, attributes);
                    j(uloVar, attributes);
                    f(uloVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim17 = attributes.getValue(i2).trim();
                        if (tlm.e(attributes, i2) == 26 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                            uloVar.n = trim17;
                        }
                        i2++;
                    }
                    this.b.h(uloVar);
                    jlo jloVar13 = uloVar.b;
                    if (jloVar13 instanceof wlo) {
                        uloVar.o = (wlo) jloVar13;
                        return;
                    } else {
                        uloVar.o = ((xlo) jloVar13).d();
                        return;
                    }
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    jlo jloVar14 = this.b;
                    if (jloVar14 == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(jloVar14 instanceof ylo)) {
                        e7o.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    vlo vloVar = new vlo();
                    vloVar.a = this.a;
                    vloVar.b = this.b;
                    g(vloVar, attributes);
                    j(vloVar, attributes);
                    f(vloVar, attributes);
                    k(vloVar, attributes);
                    this.b.h(vloVar);
                    this.b = vloVar;
                    jlo jloVar15 = vloVar.b;
                    if (jloVar15 instanceof wlo) {
                        vloVar.r = (wlo) jloVar15;
                        return;
                    } else {
                        vloVar.r = ((xlo) jloVar15).d();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    cmo cmoVar = new cmo();
                    cmoVar.a = this.a;
                    cmoVar.b = this.b;
                    g(cmoVar, attributes);
                    j(cmoVar, attributes);
                    l(cmoVar, attributes);
                    f(cmoVar, attributes);
                    while (i2 < attributes.getLength()) {
                        String trim18 = attributes.getValue(i2).trim();
                        int e14 = tlm.e(attributes, i2);
                        if (e14 == 25) {
                            rko s19 = s(trim18);
                            cmoVar.s = s19;
                            if (s19.g()) {
                                e7o.j("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (e14 != 26) {
                            switch (e14) {
                                case 81:
                                    rko s20 = s(trim18);
                                    cmoVar.r = s20;
                                    if (s20.g()) {
                                        e7o.j("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    cmoVar.p = s(trim18);
                                    break;
                                case 83:
                                    cmoVar.q = s(trim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            cmoVar.o = trim18;
                        }
                        i2++;
                    }
                    this.b.h(cmoVar);
                    this.b = cmoVar;
                    return;
                case 30:
                    if (this.b == null) {
                        e7o.j("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dmo dmoVar = new dmo();
                    dmoVar.a = this.a;
                    dmoVar.b = this.b;
                    g(dmoVar, attributes);
                    f(dmoVar, attributes);
                    m(dmoVar, attributes);
                    this.b.h(dmoVar);
                    this.b = dmoVar;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof ylo) {
            a(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof ylo) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        ilo iloVar = (ilo) this.b;
        int size = iloVar.i.size();
        nlo nloVar = size == 0 ? null : (nlo) iloVar.i.get(size - 1);
        if (nloVar instanceof bmo) {
            bmo bmoVar = (bmo) nloVar;
            bmoVar.c = su4.o(new StringBuilder(), bmoVar.c, str);
        } else {
            jlo jloVar = this.b;
            bmo bmoVar2 = new bmo();
            bmoVar2.c = str;
            jloVar.h(bmoVar2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            umo umoVar = (umo) umo.e.get(str2);
            if (umoVar == null) {
                umoVar = umo.d;
            }
            switch (umoVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                    this.b = ((nlo) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        umo umoVar2 = this.f;
                        if (umoVar2 == umo.c) {
                            this.a.getClass();
                        } else if (umoVar2 == umo.a) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String sb2 = sb.toString();
                        n20 n20Var = new n20();
                        n20Var.a = false;
                        sfm sfmVar = this.a;
                        bo3 bo3Var = new bo3(sb2);
                        bo3Var.L();
                        ((lo3) sfmVar.b).b(n20Var.l(bo3Var));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }
}
