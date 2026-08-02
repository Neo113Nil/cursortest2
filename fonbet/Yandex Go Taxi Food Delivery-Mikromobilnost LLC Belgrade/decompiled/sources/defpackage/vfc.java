package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.ybsdk.core.utils.ColorModel;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class vfc {
    public static void A(StringBuilder sb, CharSequence charSequence, String str, CharSequence charSequence2, String str2) {
        sb.append((Object) charSequence);
        sb.append(str);
        sb.append((Object) charSequence2);
        sb.append(str2);
    }

    public static void B(X509Certificate x509Certificate, int i, StringBuilder sb, String str, String str2) {
        sb.append(x509Certificate.getSerialNumber().toString(i));
        sb.append(str);
        sb.append(x509Certificate.getSubjectDN());
        sb.append(str2);
        sb.append(x509Certificate.getIssuerDN());
    }

    public static void C(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static void D(HashSet hashSet, u2 u2Var, u2 u2Var2, u2 u2Var3, u2 u2Var4) {
        hashSet.add(u2Var);
        hashSet.add(u2Var2);
        hashSet.add(u2Var3);
        hashSet.add(u2Var4);
    }

    public static double a(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    public static int b(yf70 yf70Var, int i, int i2) {
        return (yf70Var.hashCode() + i) * i2;
    }

    public static int c(PlusThemedColor plusThemedColor, int i, int i2) {
        return (plusThemedColor.hashCode() + i) * i2;
    }

    public static int d(ColorModel colorModel, int i, int i2) {
        return (colorModel.hashCode() + i) * i2;
    }

    public static int e(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static iho f(sv90 sv90Var, int i, String str, String str2, String str3) {
        sv90Var.getClass();
        wj00 wj00Var = new wj00(i);
        wj00Var.k(str, str2);
        return y891.c(str3, wj00Var);
    }

    public static yur g(bts btsVar) {
        yur yurVar = new yur();
        btsVar.o0(yurVar);
        return yurVar;
    }

    public static ywv h(Class cls, zwv zwvVar, tls tlsVar) {
        zwvVar.a(qoi0.a(cls), tlsVar);
        return zwvVar.b();
    }

    public static wj00 i(int i, String str, String str2, String str3, String str4) {
        wj00 wj00Var = new wj00(i);
        wj00Var.k(str, str2);
        wj00Var.k(str3, str4);
        return wj00Var;
    }

    public static f530 j(so5 so5Var, f530 f530Var) {
        return f530Var.k(new ypu(so5Var));
    }

    public static pa90 k(int i, int i2, int i3, bts btsVar, boolean z) {
        pa90 a = wya1.a(i, i2, btsVar);
        btsVar.e0(i3);
        btsVar.t(z);
        return a;
    }

    public static Uri.Builder l(String str, String str2, String str3) {
        return new Uri.Builder().scheme(str).authority(str2).path(str3);
    }

    public static Uri m(String str, String str2, String str3) {
        return new Uri.Builder().scheme(str).authority(str2).path(str3).build();
    }

    public static String n(i3 i3Var, StringBuilder sb) {
        sb.append(i3Var.size());
        return sb.toString();
    }

    public static String o(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
        return sb.toString();
    }

    public static String q(StringBuilder sb, Set set, String str) {
        sb.append(set);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder r(CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append((Object) charSequence);
        sb.append(str2);
        sb.append((Object) charSequence2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList s(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static Iterator t(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void u(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void v(int i, bts btsVar, wls wlsVar, bts btsVar2, tls tlsVar) {
        qje.W(btsVar, wlsVar, Integer.valueOf(i));
        qje.M(btsVar2, tlsVar);
    }

    public static void w(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    public static void x(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, long j, String str, int i) {
        sb.append(j);
        sb.append(str);
        sb.append(i);
    }

    public static void z(StringBuilder sb, ety0 ety0Var, String str, ety0 ety0Var2, String str2) {
        sb.append(ety0Var);
        sb.append(str);
        sb.append(ety0Var2);
        sb.append(str2);
    }
}
