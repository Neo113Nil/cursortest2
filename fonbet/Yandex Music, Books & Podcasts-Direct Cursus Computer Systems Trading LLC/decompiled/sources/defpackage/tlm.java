package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public abstract /* synthetic */ class tlm {
    public static /* synthetic */ boolean a(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int c(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(ges gesVar, int i, int i2) {
        return (gesVar.hashCode() + i) * i2;
    }

    public static int e(Attributes attributes, int i) {
        return tmo.a(attributes.getLocalName(i)).ordinal();
    }

    public static fs5 f(mm6 mm6Var, oq5 oq5Var) {
        fs5 fs5Var = new fs5(mm6Var);
        oq5Var.k0(fs5Var);
        return fs5Var;
    }

    public static arf g(bwf bwfVar) {
        return btf.a(bwfVar, new uu1(0));
    }

    public static t6k h(float f, oq5 oq5Var) {
        t6k t6kVar = new t6k(f);
        oq5Var.k0(t6kVar);
        return t6kVar;
    }

    public static String i(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String j(String str, Class cls) {
        return str + cls;
    }

    public static String k(StringBuilder sb, Long l, char c) {
        sb.append(l);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder l(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static ArrayList n(a7f a7fVar) {
        a7fVar.m();
        return new ArrayList();
    }

    public static void o(y60 y60Var, String str, Map map) {
        y60Var.a(new y70(str, map));
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "PLAYLIST" : "TRACK" : "NON_MUSIC_ALBUM" : "ALBUM" : "ARTIST";
    }

    public static /* synthetic */ int q(String str) {
        if (str == null) {
            jj4.j("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        xq0.x("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}
