package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vz1 {
    public static void A(nsh nshVar, long j) {
        nshVar.s().k();
        nshVar.R(j);
    }

    public static void B(vci vciVar, float f, oq5 oq5Var, boolean z) {
        u1g.l(oq5Var, d.r(vciVar, f));
        oq5Var.p(z);
    }

    public static void C(String str, String str2, String str3) {
        vq1.n0(str3, str + str2);
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        for (int i : ouj.E(7)) {
            if (c(i).equals(str)) {
                return i;
            }
        }
        return 6;
    }

    public static final int b(int i) {
        HashSet hashSet = j3c.a;
        wxf.J();
        return ouj.D(i) + j3c.h;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "playlistOfTheDay";
            case 2:
                return "neverHeard";
            case 3:
                return "recentTracks";
            case 4:
                return "missedLikes";
            case 5:
                return "editorial";
            case 6:
                return "unknownType";
            case 7:
                return "rewind2024";
            default:
                throw null;
        }
    }

    public static n0 d(String str) {
        return new n0(str).G();
    }

    public static rp7 e(o18 o18Var, Class cls) {
        o18Var.getClass();
        o18Var.c = hag.I(cls);
        rp7 rp7Var = o18Var.b;
        rp7Var.getClass();
        return rp7Var;
    }

    public static qvg f(y yVar, lwg lwgVar) {
        yVar.getClass();
        return new qvg(lwgVar);
    }

    public static yci g(float f, yci yciVar, boolean z) {
        return yciVar.f(new LayoutWeightElement(z, f));
    }

    public static uoi h(oq5 oq5Var) {
        uoi uoiVar = new uoi();
        oq5Var.k0(uoiVar);
        return uoiVar;
    }

    public static x7j i(oq5 oq5Var, int i, boolean z) {
        oq5Var.Z(i);
        oq5Var.p(z);
        return new x7j();
    }

    public static x6k j(long j) {
        return szf.g0(new d85(j));
    }

    public static uhn k(Collection collection, Collection collection2) {
        collection.getClass();
        return new uhn(collection2);
    }

    public static Object l(l13 l13Var, Class cls) {
        l13Var.getClass();
        return l13Var.a.D(hag.I(cls), l13Var, l13Var.b);
    }

    public static Object m(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String n(oq5 oq5Var, int i, int i2, oq5 oq5Var2, boolean z) {
        oq5Var.Z(i);
        String M = rvf.M(i2, oq5Var2);
        oq5Var.p(z);
        return M;
    }

    public static String o(vci vciVar, float f, oq5 oq5Var, int i, oq5 oq5Var2) {
        u1g.l(oq5Var, d.e(vciVar, f));
        return rvf.M(i, oq5Var2);
    }

    public static String p(String str, String str2, String str3, boolean z) {
        return str + str2 + str3 + z;
    }

    public static String q(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String r(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String t(StringBuilder sb, ArrayList arrayList, String str) {
        sb.append(arrayList);
        sb.append(str);
        return sb.toString();
    }

    public static String u(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String v(StringBuilder sb, Set set, char c) {
        sb.append(set);
        sb.append(c);
        return sb.toString();
    }

    public static String w(CoverPath coverPath) {
        String pathForSize = coverPath.getPathForSize(wct.s());
        pathForSize.getClass();
        return pathForSize;
    }

    public static HashMap x(Class cls, xt1 xt1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, xt1Var);
        return hashMap;
    }

    public static Map y(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void z(float f, String str, StringBuilder sb) {
        sb.append((Object) cma.b(f));
        sb.append(str);
    }
}
