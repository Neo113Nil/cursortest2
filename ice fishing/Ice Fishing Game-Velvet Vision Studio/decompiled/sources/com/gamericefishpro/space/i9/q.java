package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterable, n {
    public final String d;

    public q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.d = str;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        return Boolean.valueOf(!this.d.isEmpty());
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        String str = this.d;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.d.equals(((q) obj).d);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return new p(0, this);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(1, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02ec A[PHI: r7
      0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        com.gamericefishpro.space.u6.n nVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int iHashCode = str.hashCode();
        String strM = "undefined";
        String str3 = this.d;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    a4.K("hasOwnProperty", arrayList, 1);
                    n nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    boolean zEquals = "length".equals(nVarC.m());
                    e eVar = n.o;
                    if (zEquals) {
                        return eVar;
                    }
                    double dDoubleValue = nVarC.c().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? n.p : eVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    a4.K("toString", arrayList, 0);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    a4.K("toLocaleLowerCase", arrayList, 0);
                    return new q(str3.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    a4.M("charAt", 1, arrayList);
                    int iR = arrayList.isEmpty() ? 0 : (int) a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue());
                    return (iR < 0 || iR >= str3.length()) ? n.q : new q(String.valueOf(str3.charAt(iR)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((t) nVar.e).c(nVar, (n) arrayList.get(i4)).m());
                        }
                        return new q(sb.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    a4.K("toLowerCase", arrayList, 0);
                    return new q(str3.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    a4.M("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m()).matcher(str3);
                    return matcher.find() ? new g(Double.valueOf(matcher.start())) : new g(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    a4.K("toLocaleUpperCase", arrayList, 0);
                    return new q(str3.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    a4.M("lastIndexOf", 2, arrayList);
                    String strM2 = arrayList.size() > 0 ? ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue();
                    return new g(Double.valueOf(str3.lastIndexOf(strM2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : a4.R(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    a4.K("toUpperCase", arrayList, 0);
                    return new q(str3.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    a4.K("toUpperCase", arrayList, 0);
                    return new q(str3.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    a4.M("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m()).matcher(str3);
                    return matcher2.find() ? new d(Arrays.asList(new q(matcher2.group()))) : n.k;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    a4.M("slice", 2, arrayList);
                    double dR = a4.R(!arrayList.isEmpty() ? ((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue() : 0.0d);
                    double dMax = dR < 0.0d ? Math.max(((double) str3.length()) + dR, 0.0d) : Math.min(dR, str3.length());
                    double dR2 = a4.R(arrayList.size() > 1 ? ((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new q(str3.substring(i5, Math.max(0, ((int) (dR2 < 0.0d ? Math.max(((double) str3.length()) + dR2, 0.0d) : Math.min(dR2, str3.length()))) - i5) + i5));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    a4.M("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new d(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strM3 = ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m();
                        long jQ = arrayList.size() > 1 ? ((long) a4.Q(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue())) & 4294967295L : 2147483647L;
                        if (jQ == 0) {
                            return new d();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strM3), ((int) jQ) + 1);
                        int length = strArrSplit.length;
                        if (!strM3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jQ) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new q(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new d(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    a4.M("substring", 2, arrayList);
                    int iR2 = !arrayList.isEmpty() ? (int) a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(0)).c().doubleValue()) : 0;
                    int iR3 = arrayList.size() > 1 ? (int) a4.R(((t) nVar.e).c(nVar, (n) arrayList.get(1)).c().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iR2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iR3, 0), str3.length());
                    return new q(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    a4.M("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    n nVarA = n.j;
                    if (!zIsEmpty2) {
                        strM = ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m();
                        if (arrayList.size() > 1) {
                            nVarA = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                        }
                    }
                    String str4 = strM;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (nVarA instanceof h) {
                            nVarA = ((h) nVarA).a(nVar, Arrays.asList(new q(str4), new g(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strM4 = nVarA.m();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new q(com.gamericefishpro.space.m5.a.j(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strM4).length() + String.valueOf(strSubstring2).length()), strSubstring, strM4, strSubstring2));
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    a4.M("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        strM = ((t) nVar2.e).c(nVar2, (n) arrayList.get(0)).m();
                    }
                    return new g(Double.valueOf(str3.indexOf(strM, (int) a4.R(arrayList.size() < 2 ? 0.0d : ((t) nVar2.e).c(nVar2, (n) arrayList.get(1)).c().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return new q(this.d);
    }

    public final String toString() {
        String str = this.d;
        return com.gamericefishpro.space.m5.a.j(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
