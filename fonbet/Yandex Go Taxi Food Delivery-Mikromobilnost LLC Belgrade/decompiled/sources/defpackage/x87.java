package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class x87 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final HashMap e;
    public final fah f;

    static {
        p87.Z0.getClass();
        String str = zo60.e.a;
        String str2 = a150.d.a;
        String str3 = a150.a.a;
        String str4 = a150.b.a;
        String str5 = a150.c.a;
        b490.n3.getClass();
        bdf.a.getClass();
        cdy0.b.getClass();
        cdy0.a.getClass();
        cdy0.c.getClass();
        b490.S2.getClass();
        String str6 = xc51.h.a;
        u2 u2Var = xc51.a;
        String str7 = u2Var.a;
        b490.c3.getClass();
        bdf.e.getClass();
        bdf.f.getClass();
        pwk0.c.getClass();
        pwk0.d.getClass();
        String str8 = u2Var.a;
        String str9 = xc51.c.a;
        String str10 = xc51.d.a;
        String str11 = xc51.e.a;
        String str12 = xc51.f.a;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(str6);
        hashSet.add(str7);
        hashSet.add(str8);
        hashSet.add(str9);
        hashSet.add(str10);
        hashSet.add(str11);
        hashSet.add(str12);
        hashMap.put(str, str8);
        hashMap.put(str2, str9);
        hashMap.put(str3, str10);
        hashMap.put(str4, str11);
        hashMap.put(str5, str12);
    }

    public x87() {
        fah fahVar = new fah();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = fahVar;
    }

    public final w87 a(OutputStream outputStream, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        l2 l2Var;
        u2 u2Var = p87.Z0;
        jd4 jd4Var = new jd4(outputStream);
        jd4Var.a(p87.a1);
        jd4 jd4Var2 = new jd4(outputStream, 0);
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            z2 = false;
            z3 = false;
            z4 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof s3) {
                    int i = ((s3) next).c;
                    if (i == 1) {
                        z3 = true;
                    } else if (i == 2) {
                        z4 = true;
                    } else if (i == 3) {
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
        }
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = this.d;
        if (z2) {
            l2Var = new l2(5L);
        } else {
            ArrayList arrayList4 = this.b;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                z5 = false;
                while (it2.hasNext()) {
                    if (it2.next() instanceof s3) {
                        z5 = true;
                    }
                }
            } else {
                z5 = false;
            }
            if (z5) {
                l2Var = new l2(5L);
            } else if (z4) {
                l2Var = new l2(4L);
            } else if (z3) {
                l2Var = new l2(3L);
            } else {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            if (((zbs0) it4.next()).a.a instanceof s3) {
                            }
                        }
                        l2Var = !p87.Z0.q(u2Var) ? new l2(3L) : new l2(1L);
                    } else if (ybs0.m(((acs0) it3.next()).toASN1Structure()).a.A() == 3) {
                        break;
                    }
                }
                l2Var = new l2(3L);
            }
        }
        OutputStream outputStream2 = jd4Var2.a;
        l2Var.encodeTo(outputStream2);
        HashSet hashSet = new HashSet();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            b97.a(hashSet, (acs0) it5.next(), this.f);
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            hashSet.add(((zbs0) it6.next()).f);
        }
        int i2 = b97.a;
        zvf zvfVar = new zvf((xr1[]) hashSet.toArray(new xr1[hashSet.size()]), false);
        zvfVar.w = -1;
        outputStream2.write(zvfVar.getEncoded());
        jd4 jd4Var3 = new jd4(outputStream2);
        jd4Var3.a(u2Var);
        OutputStream b = z ? b97.b(outputStream2, true) : null;
        if (b == null) {
            b = new n77(2);
        }
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            zbs0 zbs0Var = (zbs0) it7.next();
            she sheVar = zbs0Var.d;
            ljj ljjVar = zbs0Var.e;
            OutputStream qcy0Var = ljjVar != null ? zbs0Var.b == null ? new qcy0(ljjVar.getOutputStream(), sheVar.getOutputStream()) : ljjVar.getOutputStream() : sheVar.getOutputStream();
            if (qcy0Var != null) {
                b = new qcy0(b, qcy0Var);
            }
        }
        return new w87(this, b, u2Var, jd4Var, jd4Var2, jd4Var3);
    }
}
