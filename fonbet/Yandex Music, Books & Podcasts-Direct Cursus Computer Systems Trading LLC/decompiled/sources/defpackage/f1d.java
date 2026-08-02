package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f1d {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static yxm c(frn frnVar, Class cls, String str, String str2, int i) {
        frnVar.getClass();
        return new yxm(cls, str, str2, i);
    }

    public static String d(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String e(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String f(String str, s9f s9fVar) {
        return str + s9fVar;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String i(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String j(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, Throwable th, char c) {
        sb.append(th);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder l(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static Iterator n(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Pair o(int i, int i2, Integer num) {
        return new Pair(new cnq(i, i2), num);
    }

    public static Pair p(int i, rg3 rg3Var) {
        return new Pair(rg3Var, new apf(i));
    }

    public static Pair q(int i, ib6 ib6Var) {
        return new Pair(ib6Var, new gb6(i));
    }

    public static Pair r(int i, eho ehoVar) {
        return new Pair(ehoVar, new apf(i));
    }

    public static void s(float f, xdr xdrVar, Object obj) {
        Float valueOf = Float.valueOf(f);
        xdrVar.getClass();
        xdrVar.m(obj, valueOf);
    }

    public static void t(int i, int i2, int i3, int i4, int i5) {
        y2x.h(i);
        y2x.h(i2);
        y2x.h(i3);
        y2x.h(i4);
        y2x.h(i5);
    }

    public static void u(oq5 oq5Var, boolean z, boolean z2, boolean z3) {
        oq5Var.p(z);
        oq5Var.p(z2);
        oq5Var.p(z3);
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "LONG";
            case 9:
                return "BOOLEAN";
            case 10:
                return "NULL";
            case 11:
                return "END_DOCUMENT";
            case 12:
                return "ANY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }
}
