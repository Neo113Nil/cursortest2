package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes11.dex */
public final class w491 implements Iterable, r691, a691 {
    public final TreeMap a;
    public final TreeMap b;

    public w491(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                l(i, (r691) list.get(i));
            }
        }
    }

    @Override // defpackage.a691
    public final r691 a(String str) {
        r691 r691Var;
        return "length".equals(str) ? new n591(Double.valueOf(j())) : (!d(str) || (r691Var = (r691) this.b.get(str)) == null) ? r691.z5 : r691Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dc, code lost:
    
        if (defpackage.qpa1.h(r7, r2, (defpackage.o691) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).j() == r7.j()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // defpackage.r691
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        cr71 cr71Var2;
        String str5;
        Object obj2;
        w491 w491Var;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d;
        String str6;
        s591 s591Var;
        String str7 = "toString";
        String str8 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !PolicyMappingsExtension.MAP.equals(str) && !"pop".equals(str) && !Constants.PUSH.equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str3 = "filter";
            str4 = "sort";
            if (str4.equals(str)) {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if (!"unshift".equals(str)) {
                            return a691.g(this, new a791(str), cr71Var, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        w491Var = this;
                        cr71Var2 = cr71Var;
                    }
                }
            }
            obj = "unshift";
            cr71Var2 = cr71Var;
            arrayList2 = arrayList;
            str5 = "forEach";
            w491Var = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = w491Var.a;
            r691 r691Var = r691.z5;
            TreeMap treeMap3 = treeMap2;
            double d2 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        cwa1.e(0, str9, arrayList2);
                        return new a791(w491Var.o(","));
                    }
                    ny61.g("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        w491 w491Var2 = (w491) w491Var.e();
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                r691 b = ((p791) cr71Var2.c).b(cr71Var2, (r691) it.next());
                                if (b instanceof g591) {
                                    ny61.r("Failed evaluation of arguments");
                                    return null;
                                }
                                int j = w491Var2.j();
                                if (b instanceof w491) {
                                    w491 w491Var3 = (w491) b;
                                    Iterator i = w491Var3.i();
                                    while (i.hasNext()) {
                                        Integer num = (Integer) i.next();
                                        w491Var2.l(num.intValue() + j, w491Var3.k(num.intValue()));
                                    }
                                } else {
                                    w491Var2.l(j, b);
                                }
                            }
                        }
                        return w491Var2;
                    }
                    ny61.g("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        cwa1.e(1, str10, arrayList2);
                        r691 b2 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        if (!(b2 instanceof o691)) {
                            ny61.g("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() == 0) {
                            return new w491();
                        }
                        w491 w491Var4 = (w491) w491Var.e();
                        w491 h = qpa1.h(w491Var, cr71Var2, (o691) b2, null, Boolean.TRUE);
                        w491 w491Var5 = new w491();
                        Iterator i2 = h.i();
                        while (i2.hasNext()) {
                            w491Var5.l(w491Var5.j(), w491Var4.k(((Integer) i2.next()).intValue()));
                        }
                        return w491Var5;
                    }
                    ny61.g("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return qpa1.g(w491Var, cr71Var2, arrayList2, true);
                    }
                    ny61.g("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new w491();
                        }
                        r691 r691Var2 = (r691) arrayList2.get(0);
                        p791 p791Var = (p791) cr71Var2.c;
                        p791 p791Var2 = (p791) cr71Var2.c;
                        int l = (int) cwa1.l(p791Var.b(cr71Var2, r691Var2).zzd().doubleValue());
                        if (l < 0) {
                            l = Math.max(0, w491Var.j() + l);
                        } else if (l > w491Var.j()) {
                            l = w491Var.j();
                        }
                        int j2 = w491Var.j();
                        w491 w491Var6 = new w491();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) cwa1.l(p791Var2.b(cr71Var2, (r691) arrayList2.get(1)).zzd().doubleValue()));
                            if (max > 0) {
                                for (int i3 = l; i3 < Math.min(j2, l + max); i3++) {
                                    w491Var6.l(w491Var6.j(), w491Var.k(l));
                                    w491Var.n(l);
                                }
                            }
                            int i4 = 2;
                            if (arrayList2.size() > 2) {
                                while (i4 < arrayList2.size()) {
                                    r691 b3 = p791Var2.b(cr71Var2, (r691) arrayList2.get(i4));
                                    if (b3 instanceof g591) {
                                        ny61.g("Failed to parse elements to add");
                                        return null;
                                    }
                                    int i5 = (l + i4) - 2;
                                    if (i5 < 0) {
                                        ny61.g(unr0.m(i5, "Invalid value index: ", new StringBuilder(String.valueOf(i5).length() + 21)));
                                        return null;
                                    }
                                    if (i5 >= w491Var.j()) {
                                        w491Var.l(i5, b3);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i5) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            r691 r691Var3 = (r691) treeMap4.get(valueOf2);
                                            if (r691Var3 != null) {
                                                w491Var.l(intValue + 1, r691Var3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        w491Var.l(i5, b3);
                                    }
                                    i4++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (l < j2) {
                                w491Var6.l(w491Var6.j(), w491Var.k(l));
                                w491Var.l(l, null);
                                l++;
                            }
                        }
                        return w491Var6;
                    }
                    ny61.g("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        cwa1.e(1, str11, arrayList2);
                        r691 b4 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        if (!(b4 instanceof o691)) {
                            ny61.g("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() != 0) {
                            qpa1.h(w491Var, cr71Var2, (o691) b4, null, null);
                            return r691Var;
                        }
                        return r691Var;
                    }
                    ny61.g("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        cwa1.g(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            r691Var = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        }
                        r691 r691Var4 = r691Var;
                        int j3 = w491Var.j() - 1;
                        if (arrayList2.size() > 1) {
                            r691 b5 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(1));
                            d = Double.isNaN(b5.zzd().doubleValue()) ? w491Var.j() - 1 : cwa1.l(b5.zzd().doubleValue());
                            if (d < 0.0d) {
                                d += w491Var.j();
                            }
                        } else {
                            d = j3;
                        }
                        if (d < 0.0d) {
                            return new n591(valueOf);
                        }
                        for (int min = (int) Math.min(w491Var.j(), d); min >= 0; min--) {
                            if (w491Var.m(min) && cwa1.j(w491Var.k(min), r691Var4)) {
                                return new n591(Double.valueOf(min));
                            }
                        }
                        return new n591(valueOf);
                    }
                    ny61.g("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            w491 w491Var7 = new w491();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                r691 b6 = ((p791) cr71Var2.c).b(cr71Var2, (r691) it2.next());
                                if (b6 instanceof g591) {
                                    ny61.r("Argument evaluation failed");
                                    return null;
                                }
                                w491Var7.l(w491Var7.j(), b6);
                            }
                            int j4 = w491Var7.j();
                            Iterator i6 = w491Var.i();
                            while (i6.hasNext()) {
                                Integer num2 = (Integer) i6.next();
                                w491Var7.l(num2.intValue() + j4, w491Var.k(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator i7 = w491Var7.i();
                            while (i7.hasNext()) {
                                Integer num3 = (Integer) i7.next();
                                w491Var.l(num3.intValue(), w491Var7.k(num3.intValue()));
                            }
                        }
                        return new n591(Double.valueOf(w491Var.j()));
                    }
                    ny61.g("Command not supported");
                    return null;
                case 107868:
                    if (str.equals(PolicyMappingsExtension.MAP)) {
                        cwa1.e(1, PolicyMappingsExtension.MAP, arrayList2);
                        r691 b7 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        if (b7 instanceof o691) {
                            return w491Var.j() == 0 ? new w491() : qpa1.h(w491Var, cr71Var2, (o691) b7, null, null);
                        }
                        ny61.g("Callback should be a method");
                        return null;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        cwa1.e(0, "pop", arrayList2);
                        int j5 = w491Var.j();
                        if (j5 != 0) {
                            int i8 = j5 - 1;
                            r691 k = w491Var.k(i8);
                            w491Var.n(i8);
                            return k;
                        }
                        return r691Var;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        cwa1.g(1, "join", arrayList2);
                        if (w491Var.j() == 0) {
                            return r691.G5;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            r691 b8 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                            str6 = ((b8 instanceof l691) || (b8 instanceof g791)) ? "" : b8.zzc();
                        }
                        return new a791(w491Var.o(str6));
                    }
                    ny61.g("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals(Constants.PUSH)) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                w491Var.l(w491Var.j(), ((p791) cr71Var2.c).b(cr71Var2, (r691) it3.next()));
                            }
                        }
                        return new n591(Double.valueOf(w491Var.j()));
                    }
                    ny61.g("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        cwa1.e(1, "some", arrayList2);
                        r691 b9 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        if (!(b9 instanceof s591)) {
                            ny61.g("Callback should be a method");
                            return null;
                        }
                        if (w491Var.j() != 0) {
                            s591 s591Var2 = (s591) b9;
                            Iterator i9 = w491Var.i();
                            while (i9.hasNext()) {
                                int intValue2 = ((Integer) i9.next()).intValue();
                                if (w491Var.m(intValue2) && s591Var2.c(cr71Var2, Arrays.asList(w491Var.k(intValue2), new n591(Double.valueOf(intValue2)), w491Var)).zze().booleanValue()) {
                                    return r691.E5;
                                }
                            }
                        }
                        return r691.F5;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        cwa1.g(1, str4, arrayList2);
                        if (w491Var.j() >= 2) {
                            List h2 = w491Var.h();
                            if (arrayList2.isEmpty()) {
                                s591Var = null;
                            } else {
                                r691 b10 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                                if (!(b10 instanceof s591)) {
                                    ny61.g("Comparator should be a method");
                                    return null;
                                }
                                s591Var = (s591) b10;
                            }
                            Collections.sort(h2, new w83(3, s591Var, cr71Var2));
                            treeMap3.clear();
                            Iterator it4 = ((ArrayList) h2).iterator();
                            int i10 = 0;
                            while (it4.hasNext()) {
                                w491Var.l(i10, (r691) it4.next());
                                i10++;
                            }
                        }
                        return w491Var;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        cwa1.e(1, "every", arrayList2);
                        r691 b11 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        if (!(b11 instanceof o691)) {
                            ny61.g("Callback should be a method");
                            return null;
                        }
                        if (w491Var.j() != 0) {
                            break;
                        }
                        return r691.E5;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        cwa1.e(0, "shift", arrayList2);
                        if (w491Var.j() != 0) {
                            r691 k2 = w491Var.k(0);
                            w491Var.n(0);
                            return k2;
                        }
                        return r691Var;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        cwa1.g(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return w491Var.e();
                        }
                        double j6 = w491Var.j();
                        double l2 = cwa1.l(((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0)).zzd().doubleValue());
                        double max2 = l2 < 0.0d ? Math.max(l2 + j6, 0.0d) : Math.min(l2, j6);
                        if (arrayList2.size() == 2) {
                            double l3 = cwa1.l(((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(1)).zzd().doubleValue());
                            j6 = l3 < 0.0d ? Math.max(j6 + l3, 0.0d) : Math.min(j6, l3);
                        }
                        w491 w491Var8 = new w491();
                        for (int i11 = (int) max2; i11 < j6; i11++) {
                            w491Var8.l(w491Var8.j(), w491Var.k(i11));
                        }
                        return w491Var8;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return qpa1.g(w491Var, cr71Var2, arrayList2, false);
                    }
                    ny61.g("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        cwa1.e(0, "reverse", arrayList2);
                        int j7 = w491Var.j();
                        if (j7 != 0) {
                            for (int i12 = 0; i12 < j7 / 2; i12++) {
                                if (w491Var.m(i12)) {
                                    r691 k3 = w491Var.k(i12);
                                    w491Var.l(i12, null);
                                    int i13 = (j7 - 1) - i12;
                                    if (w491Var.m(i13)) {
                                        w491Var.l(i12, w491Var.k(i13));
                                    }
                                    w491Var.l(i13, k3);
                                }
                            }
                        }
                        return w491Var;
                    }
                    ny61.g("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        cwa1.g(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            r691Var = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(0));
                        }
                        r691 r691Var5 = r691Var;
                        if (arrayList2.size() > 1) {
                            double l4 = cwa1.l(((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList2.get(1)).zzd().doubleValue());
                            if (l4 >= w491Var.j()) {
                                return new n591(valueOf);
                            }
                            d2 = l4 < 0.0d ? w491Var.j() + l4 : l4;
                        }
                        Iterator i14 = w491Var.i();
                        while (i14.hasNext()) {
                            int intValue3 = ((Integer) i14.next()).intValue();
                            double d3 = intValue3;
                            if (d3 >= d2 && cwa1.j(w491Var.k(intValue3), r691Var5)) {
                                return new n591(Double.valueOf(d3));
                            }
                        }
                        return new n591(valueOf);
                    }
                    ny61.g("Command not supported");
                    return null;
                default:
                    ny61.g("Command not supported");
                    return null;
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        cr71Var2 = cr71Var;
        str5 = "forEach";
        obj2 = "reduce";
        w491Var = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = w491Var.a;
        r691 r691Var6 = r691.z5;
        TreeMap treeMap32 = treeMap22;
        double d22 = 0.0d;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    @Override // defpackage.a691
    public final boolean d(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    @Override // defpackage.r691
    public final r691 e() {
        w491 w491Var = new w491();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof a691;
            TreeMap treeMap = w491Var.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (r691) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((r691) entry.getValue()).e());
            }
        }
        return w491Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w491)) {
            return false;
        }
        w491 w491Var = (w491) obj;
        if (j() != w491Var.j()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return w491Var.a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!k(intValue).equals(w491Var.k(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.a691
    public final void f(String str, r691 r691Var) {
        TreeMap treeMap = this.b;
        if (r691Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, r691Var);
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList(j());
        for (int i = 0; i < j(); i++) {
            arrayList.add(k(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final Iterator i() {
        return this.a.keySet().iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v691(2, this);
    }

    public final int j() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final r691 k(int i) {
        r691 r691Var;
        if (i < j()) {
            return (!m(i) || (r691Var = (r691) this.a.get(Integer.valueOf(i))) == null) ? r691.z5 : r691Var;
        }
        ny61.m("Attempting to get element outside of current array");
        return null;
    }

    public final void l(int i, r691 r691Var) {
        if (i > 32468) {
            ny61.r("Array too large");
            return;
        }
        if (i < 0) {
            ny61.m(unr0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.a;
        if (r691Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), r691Var);
        }
    }

    public final boolean m(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        ny61.m(unr0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void n(int i) {
        TreeMap treeMap = this.a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, r691.z5);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            r691 r691Var = (r691) treeMap.get(valueOf2);
            if (r691Var != null) {
                treeMap.put(Integer.valueOf(i - 1), r691Var);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String o(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= j()) {
                    break;
                }
                r691 k = k(i);
                sb.append(str2);
                if (!(k instanceof g791) && !(k instanceof l691)) {
                    sb.append(k.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return o(",");
    }

    @Override // defpackage.r691
    public final String zzc() {
        return o(",");
    }

    @Override // defpackage.r691
    public final Double zzd() {
        TreeMap treeMap = this.a;
        return treeMap.size() == 1 ? k(0).zzd() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return new l491(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public w491() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
}
