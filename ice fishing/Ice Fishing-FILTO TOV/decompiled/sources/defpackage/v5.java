package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v5 implements wn0 {
    public Object GWasM1elztuh;
    public Object OOA6hdeuvCS;
    public final Object X1lG3V04pd;
    public Object Yi7zF1RB1;
    public Object xqGvceK5x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    public v5(u3 u3Var, y81 y81Var, List list, el elVar, yt ytVar) {
        int i;
        List list2;
        String str;
        int i2;
        ArrayList arrayList;
        u3 u3Var2 = u3Var;
        y81 y81Var2 = y81Var;
        this.GWasM1elztuh = u3Var2;
        this.Yi7zF1RB1 = list;
        final int i3 = 0;
        wu wuVar = new wu(this) { // from class: if0
            public final /* synthetic */ v5 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i4 = i3;
                vn0 vn0Var = null;
                int i5 = 1;
                v5 v5Var = this.EljAMC1QTz;
                switch (i4) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) v5Var.OOA6hdeuvCS;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float GWasM1elztuh = ((vn0) r0).GWasM1elztuh.GWasM1elztuh();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float GWasM1elztuh2 = ((vn0) obj).GWasM1elztuh.GWasM1elztuh();
                                    r0 = z;
                                    if (Float.compare(GWasM1elztuh, GWasM1elztuh2) < 0) {
                                        r0 = obj;
                                        GWasM1elztuh = GWasM1elztuh2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            vn0Var = r0;
                        }
                        vn0 vn0Var2 = vn0Var;
                        return Float.valueOf(vn0Var2 != null ? vn0Var2.GWasM1elztuh.GWasM1elztuh() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) v5Var.OOA6hdeuvCS;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float X1lG3V04pd = ((vn0) r02).GWasM1elztuh.mOu10nynGul.X1lG3V04pd();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float X1lG3V04pd2 = ((vn0) obj2).GWasM1elztuh.mOu10nynGul.X1lG3V04pd();
                                    r02 = z2;
                                    if (Float.compare(X1lG3V04pd, X1lG3V04pd2) < 0) {
                                        r02 = obj2;
                                        X1lG3V04pd = X1lG3V04pd2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            vn0Var = r02;
                        }
                        vn0 vn0Var3 = vn0Var;
                        return Float.valueOf(vn0Var3 != null ? vn0Var3.GWasM1elztuh.mOu10nynGul.X1lG3V04pd() : 0.0f);
                }
            }
        };
        a90 a90Var = a90.OOA6hdeuvCS;
        this.X1lG3V04pd = d70.arNh8D4Z5gB(a90Var, wuVar);
        final int i4 = 1;
        this.xqGvceK5x = d70.arNh8D4Z5gB(a90Var, new wu(this) { // from class: if0
            public final /* synthetic */ v5 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i42 = i4;
                vn0 vn0Var = null;
                int i5 = 1;
                v5 v5Var = this.EljAMC1QTz;
                switch (i42) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) v5Var.OOA6hdeuvCS;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float GWasM1elztuh = ((vn0) r0).GWasM1elztuh.GWasM1elztuh();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float GWasM1elztuh2 = ((vn0) obj).GWasM1elztuh.GWasM1elztuh();
                                    r0 = z;
                                    if (Float.compare(GWasM1elztuh, GWasM1elztuh2) < 0) {
                                        r0 = obj;
                                        GWasM1elztuh = GWasM1elztuh2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            vn0Var = r0;
                        }
                        vn0 vn0Var2 = vn0Var;
                        return Float.valueOf(vn0Var2 != null ? vn0Var2.GWasM1elztuh.GWasM1elztuh() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) v5Var.OOA6hdeuvCS;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float X1lG3V04pd = ((vn0) r02).GWasM1elztuh.mOu10nynGul.X1lG3V04pd();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float X1lG3V04pd2 = ((vn0) obj2).GWasM1elztuh.mOu10nynGul.X1lG3V04pd();
                                    r02 = z2;
                                    if (Float.compare(X1lG3V04pd, X1lG3V04pd2) < 0) {
                                        r02 = obj2;
                                        X1lG3V04pd = X1lG3V04pd2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            vn0Var = r02;
                        }
                        vn0 vn0Var3 = vn0Var;
                        return Float.valueOf(vn0Var3 != null ? vn0Var3.GWasM1elztuh.mOu10nynGul.X1lG3V04pd() : 0.0f);
                }
            }
        });
        yn0 yn0Var = y81Var2.Yi7zF1RB1;
        int i5 = v3.GWasM1elztuh;
        ArrayList arrayList2 = u3Var2.encWxUiV2;
        String str2 = u3Var2.EljAMC1QTz;
        xp xpVar = xp.OOA6hdeuvCS;
        List FhVkB11j = arrayList2 != null ? rb.FhVkB11j(arrayList2, new st(6)) : xpVar;
        ArrayList arrayList3 = new ArrayList();
        v4 v4Var = new v4();
        int size = FhVkB11j.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            t3 t3Var = (t3) FhVkB11j.get(i6);
            yn0 GWasM1elztuh = yn0Var.GWasM1elztuh((yn0) t3Var.GWasM1elztuh);
            int i8 = t3Var.Yi7zF1RB1;
            int i9 = t3Var.X1lG3V04pd;
            if (i8 > i9) {
                u10.GWasM1elztuh("Reversed range is not supported");
            }
            while (i7 < i8 && !v4Var.isEmpty()) {
                t3 t3Var2 = (t3) v4Var.last();
                List list3 = FhVkB11j;
                int i10 = t3Var2.X1lG3V04pd;
                xp xpVar2 = xpVar;
                Object obj = t3Var2.GWasM1elztuh;
                if (i8 < i10) {
                    arrayList3.add(new t3(i7, i8, obj));
                    i7 = i8;
                    FhVkB11j = list3;
                    xpVar = xpVar2;
                } else {
                    int i11 = size;
                    arrayList3.add(new t3(i7, i10, obj));
                    i7 = t3Var2.X1lG3V04pd;
                    while (!v4Var.isEmpty() && i7 == ((t3) v4Var.last()).X1lG3V04pd) {
                        v4Var.removeLast();
                    }
                    FhVkB11j = list3;
                    xpVar = xpVar2;
                    size = i11;
                }
            }
            List list4 = FhVkB11j;
            xp xpVar3 = xpVar;
            int i12 = size;
            if (i7 < i8) {
                arrayList3.add(new t3(i7, i8, yn0Var));
                i7 = i8;
            }
            t3 t3Var3 = (t3) v4Var.encWxUiV2();
            if (t3Var3 != null) {
                int i13 = t3Var3.X1lG3V04pd;
                Object obj2 = t3Var3.GWasM1elztuh;
                int i14 = t3Var3.Yi7zF1RB1;
                if (i14 == i8 && i13 == i9) {
                    v4Var.removeLast();
                    v4Var.addLast(new t3(i8, i9, ((yn0) obj2).GWasM1elztuh(GWasM1elztuh)));
                } else if (i14 == i13) {
                    arrayList3.add(new t3(i14, i13, obj2));
                    v4Var.removeLast();
                    v4Var.addLast(new t3(i8, i9, GWasM1elztuh));
                } else {
                    if (i13 < i9) {
                        throw new IllegalArgumentException();
                    }
                    v4Var.addLast(new t3(i8, i9, ((yn0) obj2).GWasM1elztuh(GWasM1elztuh)));
                }
            } else {
                v4Var.addLast(new t3(i8, i9, GWasM1elztuh));
            }
            i6++;
            FhVkB11j = list4;
            xpVar = xpVar3;
            size = i12;
        }
        xp xpVar4 = xpVar;
        while (i7 <= str2.length() && !v4Var.isEmpty()) {
            t3 t3Var4 = (t3) v4Var.last();
            Object obj3 = t3Var4.GWasM1elztuh;
            int i15 = t3Var4.X1lG3V04pd;
            arrayList3.add(new t3(i7, i15, obj3));
            while (!v4Var.isEmpty() && i15 == ((t3) v4Var.last()).X1lG3V04pd) {
                v4Var.removeLast();
            }
            i7 = i15;
        }
        if (i7 < str2.length()) {
            arrayList3.add(new t3(i7, str2.length(), yn0Var));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new t3(0, 0, yn0Var));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i16 = i;
        while (i16 < size2) {
            t3 t3Var5 = (t3) arrayList3.get(i16);
            int i17 = t3Var5.Yi7zF1RB1;
            int i18 = t3Var5.X1lG3V04pd;
            String substring = i17 != i18 ? str2.substring(i17, i18) : "";
            xp xpVar5 = 0;
            if (i17 == i18 || (list2 = u3Var2.OOA6hdeuvCS) == null) {
                str = str2;
            } else if (i17 != 0 || i18 < str2.length()) {
                str = str2;
                xpVar5 = new ArrayList(list2.size());
                int size3 = list2.size();
                int i19 = 0;
                while (i19 < size3) {
                    int i20 = size3;
                    t3 t3Var6 = (t3) list2.get(i19);
                    List list5 = list2;
                    Object obj4 = t3Var6.GWasM1elztuh;
                    int i21 = t3Var6.Yi7zF1RB1;
                    int i22 = i19;
                    if (!(((s3) obj4) instanceof yn0)) {
                        int i23 = t3Var6.X1lG3V04pd;
                        if (v3.GWasM1elztuh(i17, i18, i21, i23)) {
                            i2 = size2;
                            arrayList = arrayList3;
                            xpVar5.add(new t3((s3) t3Var6.GWasM1elztuh, o50.encWxUiV2(i21, i17, i18) - i17, o50.encWxUiV2(i23, i17, i18) - i17, t3Var6.xqGvceK5x));
                            i19 = i22 + 1;
                            list2 = list5;
                            size3 = i20;
                            size2 = i2;
                            arrayList3 = arrayList;
                        }
                    }
                    i2 = size2;
                    arrayList = arrayList3;
                    i19 = i22 + 1;
                    list2 = list5;
                    size3 = i20;
                    size2 = i2;
                    arrayList3 = arrayList;
                }
            } else {
                xpVar5 = new ArrayList(list2.size());
                int size4 = list2.size();
                str = str2;
                int i24 = 0;
                while (i24 < size4) {
                    int i25 = size4;
                    Object obj5 = list2.get(i24);
                    int i26 = i24;
                    if (!(((s3) ((t3) obj5).GWasM1elztuh) instanceof yn0)) {
                        xpVar5.add(obj5);
                    }
                    i24 = i26 + 1;
                    size4 = i25;
                }
            }
            int i27 = size2;
            ArrayList arrayList5 = arrayList3;
            u3 u3Var3 = new u3(substring, xpVar5 == 0 ? xpVar4 : xpVar5);
            yn0 yn0Var2 = (yn0) t3Var5.GWasM1elztuh;
            y81 y81Var3 = new y81(y81Var2.GWasM1elztuh, yn0Var.GWasM1elztuh(yn0Var2.Yi7zF1RB1 == 0 ? new yn0(yn0Var2.GWasM1elztuh, yn0Var.Yi7zF1RB1, yn0Var2.X1lG3V04pd, yn0Var2.xqGvceK5x, yn0Var2.OOA6hdeuvCS, yn0Var2.EljAMC1QTz, yn0Var2.AvO7iQsrTN, yn0Var2.encWxUiV2, yn0Var2.mOu10nynGul) : yn0Var2));
            ?? r1 = u3Var3.OOA6hdeuvCS;
            xp xpVar6 = r1 == 0 ? xpVar4 : r1;
            List list6 = (List) this.Yi7zF1RB1;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i28 = 0;
            while (i28 < size5) {
                t3 t3Var7 = (t3) list6.get(i28);
                int i29 = t3Var7.Yi7zF1RB1;
                List list7 = list6;
                int i30 = t3Var7.X1lG3V04pd;
                if (v3.GWasM1elztuh(i17, i18, i29, i30)) {
                    if (i17 > i29 || i30 > i18) {
                        u10.GWasM1elztuh("placeholder can not overlap with paragraph.");
                    }
                    arrayList6.add(new t3(i29 - i17, i30 - i17, t3Var7.GWasM1elztuh));
                }
                i28++;
                list6 = list7;
            }
            arrayList4.add(new vn0(new f1(substring, y81Var3, xpVar6, arrayList6, ytVar, elVar), i17, i18));
            i16++;
            u3Var2 = u3Var;
            y81Var2 = y81Var;
            str2 = str;
            size2 = i27;
            arrayList3 = arrayList5;
        }
        this.OOA6hdeuvCS = arrayList4;
    }

    public float AvO7iQsrTN(int i, boolean z) {
        Layout layout = (Layout) this.GWasM1elztuh;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public void EljAMC1QTz(hv hvVar) {
        int i;
        synchronized (this.GWasM1elztuh) {
            try {
                ag0 ag0Var = (ag0) this.xqGvceK5x;
                this.xqGvceK5x = (ag0) this.OOA6hdeuvCS;
                this.OOA6hdeuvCS = ag0Var;
                i5 i5Var = (i5) this.X1lG3V04pd;
                do {
                    i = i5Var.get();
                } while (!i5Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = ag0Var.Yi7zF1RB1;
                for (int i3 = 0; i3 < i2; i3++) {
                    hvVar.mOu10nynGul(ag0Var.EljAMC1QTz(i3));
                }
                ag0Var.xqGvceK5x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wn0
    public float GWasM1elztuh() {
        return ((Number) ((z60) this.X1lG3V04pd).getValue()).floatValue();
    }

    public void JFJ3QoxA(List list, boolean z) {
        Object obj;
        LinkedHashSet<ne0> linkedHashSet = new LinkedHashSet();
        v4 v4Var = new v4(new bv0(list));
        while (!v4Var.isEmpty()) {
            ne0 ne0Var = (ne0) v4Var.removeLast();
            if (linkedHashSet.add(ne0Var)) {
                ArrayList arrayList = ne0Var.OOA6hdeuvCS;
                arrayList.getClass();
                Iterator it = new av0(arrayList).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((zu0) it).EljAMC1QTz;
                    if (listIterator.hasPrevious()) {
                        ne0 ne0Var2 = (ne0) listIterator.previous();
                        if (!linkedHashSet.contains(ne0Var2)) {
                            v4Var.addLast(ne0Var2);
                        }
                    }
                }
            }
        }
        f4 f4Var = (f4) this.xqGvceK5x;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f4Var.xqGvceK5x;
        for (ne0 ne0Var3 : linkedHashSet) {
            for (Map.Entry entry : ne0Var3.X1lG3V04pd.entrySet()) {
                String str = (String) entry.getKey();
                o20 o20Var = (o20) entry.getValue();
                n6 n6Var = o20Var.GWasM1elztuh;
                v5 v5Var = (v5) f4Var.Yi7zF1RB1;
                str.getClass();
                n6 n6Var2 = o20Var.GWasM1elztuh;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f4Var.X1lG3V04pd;
                if (((o20) concurrentHashMap2.get(str)) != null) {
                    if (!z) {
                        throw new vk("Already existing definition for " + n6Var2 + " at " + str);
                    }
                    w60 w60Var = (w60) v5Var.GWasM1elztuh;
                    w60Var.getClass();
                    w60Var.Mjvvu5DE(g90.AvO7iQsrTN, "(+) override index '" + str + "' -> '" + n6Var2 + '\'');
                    Iterator it2 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((o21) obj).GWasM1elztuh.equals(n6Var2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((o21) obj) != null) {
                        concurrentHashMap.remove(Integer.valueOf(n6Var2.hashCode()));
                    }
                }
                w60 w60Var2 = (w60) v5Var.GWasM1elztuh;
                w60Var2.getClass();
                w60Var2.Mjvvu5DE(g90.OOA6hdeuvCS, "(+) index '" + str + "' -> '" + n6Var2 + '\'');
                concurrentHashMap2.put(str, o20Var);
            }
            for (o21 o21Var : ne0Var3.Yi7zF1RB1) {
                concurrentHashMap.put(Integer.valueOf(o21Var.GWasM1elztuh.hashCode()), o21Var);
            }
        }
        rx0 rx0Var = (rx0) this.X1lG3V04pd;
        rx0Var.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((Set) rx0Var.EljAMC1QTz).addAll(((ne0) it3.next()).xqGvceK5x);
        }
    }

    public void OOA6hdeuvCS() {
        w60 w60Var = (w60) this.GWasM1elztuh;
        w60Var.getClass();
        g90 g90Var = g90.OOA6hdeuvCS;
        w60Var.Mjvvu5DE(g90Var, "Create eager instances ...");
        long GWasM1elztuh = oe0.GWasM1elztuh();
        f4 f4Var = (f4) this.xqGvceK5x;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f4Var.xqGvceK5x;
        int i = 0;
        o21[] o21VarArr = (o21[]) concurrentHashMap.values().toArray(new o21[0]);
        ArrayList JFJ3QoxA = fb1.JFJ3QoxA(Arrays.copyOf(o21VarArr, o21VarArr.length));
        concurrentHashMap.clear();
        v5 v5Var = (v5) f4Var.Yi7zF1RB1;
        rx0 rx0Var = new rx0((w60) v5Var.GWasM1elztuh, (px0) ((rx0) v5Var.X1lG3V04pd).encWxUiV2, st0.GWasM1elztuh(rj0.class), null);
        int size = JFJ3QoxA.size();
        while (i < size) {
            Object obj = JFJ3QoxA.get(i);
            i++;
            ((o21) obj).Yi7zF1RB1(rx0Var);
        }
        long GWasM1elztuh2 = p91.GWasM1elztuh(GWasM1elztuh);
        w60 w60Var2 = (w60) this.GWasM1elztuh;
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        k61 k61Var = jo.OOA6hdeuvCS;
        sb.append(jo.Yi7zF1RB1(GWasM1elztuh2, mo.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        String sb2 = sb.toString();
        w60Var2.getClass();
        w60Var2.Mjvvu5DE(g90Var, sb2);
    }

    @Override // defpackage.wn0
    public float X1lG3V04pd() {
        return ((Number) ((z60) this.xqGvceK5x).getValue()).floatValue();
    }

    @Override // defpackage.wn0
    public boolean Yi7zF1RB1() {
        ArrayList arrayList = (ArrayList) this.OOA6hdeuvCS;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((vn0) arrayList.get(i)).GWasM1elztuh.Yi7zF1RB1()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float encWxUiV2(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.Yi7zF1RB1;
        Layout layout = (Layout) this.GWasM1elztuh;
        if (!z2) {
            return AvO7iQsrTN(i, z);
        }
        int AEn1Rrio = ki1.AEn1Rrio(layout, i, z2);
        int lineStart = layout.getLineStart(AEn1Rrio);
        int lineEnd = layout.getLineEnd(AEn1Rrio);
        if (i != lineStart && i != lineEnd) {
            return AvO7iQsrTN(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return AvO7iQsrTN(i, z);
        }
        Integer valueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            o4.mE4lRynR(mr0.encWxUiV2("fromIndex (0) is greater than toIndex (", size, ")."));
            return 0.0f;
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i2 = -(i9 + 1);
                break;
            }
            i2 = (i9 + i8) >>> 1;
            int Mjvvu5DE = n30.Mjvvu5DE((Comparable) arrayList.get(i2), valueOf);
            if (Mjvvu5DE >= 0) {
                if (Mjvvu5DE <= 0) {
                    break;
                }
                i8 = i2 - 1;
            } else {
                i9 = i2 + 1;
            }
        }
        int i10 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                i10 = i11;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1;
        int mOu10nynGul = mOu10nynGul(lineEnd, lineStart);
        int intValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int i12 = lineStart - intValue;
        int i13 = mOu10nynGul - intValue;
        ArrayList arrayList2 = (ArrayList) this.X1lG3V04pd;
        boolean[] zArr = (boolean[]) this.xqGvceK5x;
        if (zArr[i10]) {
            bidi = (Bidi) arrayList2.get(i10);
            i4 = AEn1Rrio;
            i3 = mOu10nynGul;
            i5 = -1;
        } else {
            int intValue2 = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i10)).intValue();
            int i14 = intValue3 - intValue2;
            char[] cArr = (char[]) this.OOA6hdeuvCS;
            i3 = mOu10nynGul;
            if (cArr == null || cArr.length < i14) {
                cArr = new char[i14];
            }
            i4 = AEn1Rrio;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i14)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i10, bidi);
                    zArr[i10] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.OOA6hdeuvCS;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.OOA6hdeuvCS = cArr;
                }
            } else {
                i5 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i10, bidi);
            zArr[i10] = z3;
            if (bidi != null) {
            }
            this.OOA6hdeuvCS = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i12, i13) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                r50[] r50VarArr = new r50[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    r50VarArr[i15] = new r50(createLineBidi.getRunStart(i15) + lineStart, createLineBidi.getRunLimit(i15) + lineStart, createLineBidi.getRunLevel(i15) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) createLineBidi.getRunLevel(i16);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, r50VarArr, 0, runCount);
                if (i != lineStart) {
                    int i17 = i4;
                    int mOu10nynGul2 = i > i3 ? mOu10nynGul(i, lineStart) : i;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= runCount) {
                            i6 = i5;
                            break;
                        }
                        if (r50VarArr[i18].Yi7zF1RB1 == mOu10nynGul2) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                    r50 r50Var = r50VarArr[i6];
                    if (z || z5 == r50Var.X1lG3V04pd) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    return (i6 == 0 && z6) ? layout.getLineLeft(i17) : (i6 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(r50VarArr[i6 - 1].Yi7zF1RB1) : layout.getPrimaryHorizontal(r50VarArr[i6 + 1].Yi7zF1RB1) : layout.getLineRight(i17);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i7 = i5;
                        break;
                    }
                    if (r50VarArr[i19].GWasM1elztuh == i) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
                r50 r50Var2 = r50VarArr[i7];
                if (!z && z5 != r50Var2.X1lG3V04pd) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i7 == 0 && z6) {
                    return layout.getLineLeft(i4);
                }
                return (i7 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(r50VarArr[i7 - 1].GWasM1elztuh) : layout.getPrimaryHorizontal(r50VarArr[i7 + 1].GWasM1elztuh) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i20 = i4;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i20) : layout.getLineRight(i20);
    }

    public int mOu10nynGul(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.GWasM1elztuh).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((o30.uFEq9NpZ(charAt, 8192) < 0 || o30.uFEq9NpZ(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void rQPn8YBR(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.GWasM1elztuh).put(str, obj);
        p51 p51Var = (p51) ((LinkedHashMap) this.X1lG3V04pd).get(str);
        if (p51Var != null) {
            p51Var.mOu10nynGul(obj);
        }
        p51 p51Var2 = (p51) ((LinkedHashMap) this.xqGvceK5x).get(str);
        if (p51Var2 != null) {
            p51Var2.mOu10nynGul(obj);
        }
    }

    public p9 xqGvceK5x(u5 u5Var, wu wuVar) {
        int i;
        int i2;
        int i3;
        pt0 pt0Var = new pt0();
        pt0Var.OOA6hdeuvCS = -1;
        synchronized (this.GWasM1elztuh) {
            Throwable th = (Throwable) this.Yi7zF1RB1;
            if (th != null) {
                u5Var.Yi7zF1RB1(th);
                return b9xEq24R1.lv06NcmrQ;
            }
            i5 i5Var = (i5) this.X1lG3V04pd;
            do {
                i = i5Var.get();
                i2 = i + 1;
            } while (!i5Var.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            pt0Var.OOA6hdeuvCS = (i2 >>> 27) & 15;
            ((ag0) this.xqGvceK5x).GWasM1elztuh(u5Var);
            if (z && wuVar != null) {
                try {
                    wuVar.GWasM1elztuh();
                } catch (Throwable th2) {
                    synchronized (this.GWasM1elztuh) {
                        try {
                            if (((Throwable) this.Yi7zF1RB1) == null) {
                                this.Yi7zF1RB1 = th2;
                                ag0 ag0Var = (ag0) this.xqGvceK5x;
                                Object[] objArr = ag0Var.GWasM1elztuh;
                                int i5 = ag0Var.Yi7zF1RB1;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((u5) objArr[i6]).Yi7zF1RB1(th2);
                                }
                                ((ag0) this.xqGvceK5x).xqGvceK5x();
                                i5 i5Var2 = (i5) this.X1lG3V04pd;
                                do {
                                    i3 = i5Var2.get();
                                } while (!i5Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new d(new t5(u5Var, this, pt0Var, i4));
        }
    }

    public v5(int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = new y0(1);
                this.Yi7zF1RB1 = new d(this);
                rx0 rx0Var = new rx0();
                rx0Var.OOA6hdeuvCS = this;
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                rx0Var.EljAMC1QTz = newSetFromMap;
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                rx0Var.AvO7iQsrTN = concurrentHashMap;
                a61 a61Var = rx0.mOu10nynGul;
                px0 px0Var = new px0(a61Var, "_root_", null, this, 8);
                rx0Var.encWxUiV2 = px0Var;
                newSetFromMap.add(a61Var);
                concurrentHashMap.put("_root_", px0Var);
                this.X1lG3V04pd = rx0Var;
                this.xqGvceK5x = new f4(this);
                new ConcurrentHashMap();
                new HashMap();
                this.OOA6hdeuvCS = new j00(1);
                break;
            default:
                this.GWasM1elztuh = new Object();
                this.X1lG3V04pd = new i5(0);
                this.xqGvceK5x = new ag0();
                this.OOA6hdeuvCS = new ag0();
                break;
        }
    }

    public v5(Layout layout) {
        this.GWasM1elztuh = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int qugwajBSa59j = b61.qugwajBSa59j(((Layout) this.GWasM1elztuh).getText(), '\n', i, 4);
            i = qugwajBSa59j < 0 ? ((Layout) this.GWasM1elztuh).getText().length() : qugwajBSa59j + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.GWasM1elztuh).getText().length());
        this.Yi7zF1RB1 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.X1lG3V04pd = arrayList2;
        this.xqGvceK5x = new boolean[((ArrayList) this.Yi7zF1RB1).size()];
        ((ArrayList) this.Yi7zF1RB1).size();
    }

    public v5(Map map) {
        map.getClass();
        this.GWasM1elztuh = new LinkedHashMap(map);
        this.Yi7zF1RB1 = new LinkedHashMap();
        this.X1lG3V04pd = new LinkedHashMap();
        this.xqGvceK5x = new LinkedHashMap();
        this.OOA6hdeuvCS = new zc(2, this);
    }
}
