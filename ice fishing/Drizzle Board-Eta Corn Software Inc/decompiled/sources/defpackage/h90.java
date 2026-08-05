package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h90 extends ng0 {
    public final v80 MdtA4re8;
    public final zy NCTxEWno;
    public boolean OnDfzHZD;
    public final e10 P7K7Inc8;
    public final h70 Qr9iLBAD;
    public final x90 VgvYg0wo;
    public final h70 b2ZJblxo;
    public List eVhOlqcC;
    public List jb9XjC4I;
    public Long k3x7lurq;
    public long ow5vqvCr;
    public final i90 wxUZMvaN;
    public q90 ygLcUYwZ;

    public h90(zy zyVar, v80 v80Var, h50 h50Var) {
        zyVar.getClass();
        v80Var.getClass();
        h50Var.getClass();
        this.NCTxEWno = zyVar;
        this.MdtA4re8 = v80Var;
        String str = (String) h50Var.qoPGr6Ce("traitKey");
        str = str == null ? "" : str;
        i90.MdtA4re8.getClass();
        i90 qoPGr6Ce = k00.qoPGr6Ce(str);
        this.wxUZMvaN = qoPGr6Ce;
        wf wfVar = wf.NCTxEWno;
        x90 qoPGr6Ce2 = ra.qoPGr6Ce(new e90(qoPGr6Ce, wfVar, 0L, false));
        this.VgvYg0wo = qoPGr6Ce2;
        this.P7K7Inc8 = new e10(qoPGr6Ce2);
        h70 qoPGr6Ce3 = le0.qoPGr6Ce(5);
        this.b2ZJblxo = qoPGr6Ce3;
        this.Qr9iLBAD = qoPGr6Ce3;
        this.jb9XjC4I = wfVar;
        this.eVhOlqcC = wfVar;
        q90 q90Var = this.ygLcUYwZ;
        g9 g9Var = null;
        if (q90Var != null) {
            q90Var.b2ZJblxo(null);
        }
        this.ygLcUYwZ = fn.Ey6iv0m0(le0.FySoLYna(this), null, new y7(this, g9Var, 7), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r13 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P7K7Inc8(h9 h9Var) {
        f90 f90Var;
        int i;
        vn vnVar;
        Object OnDfzHZD;
        u9 u9Var;
        if (h9Var instanceof f90) {
            f90Var = (f90) h9Var;
            int i2 = f90Var.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f90Var.b2ZJblxo = i2 - Integer.MIN_VALUE;
                Object obj = f90Var.VgvYg0wo;
                i = f90Var.b2ZJblxo;
                xe0 xe0Var = xe0.qoPGr6Ce;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    l9 l9Var = f90Var.MdtA4re8;
                    l9Var.getClass();
                    vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
                    if (vnVar == null ? vnVar.VhgXwMj9() : true) {
                        re reVar = ge.NCTxEWno;
                        long FXJmAAN1 = le0.FXJmAAN1(200L, ie.MILLISECONDS);
                        f90Var.b2ZJblxo = 1;
                        OnDfzHZD = ej0.OnDfzHZD(ej0.N8VPGzVC(FXJmAAN1), f90Var);
                        u9Var = u9.NCTxEWno;
                        if (OnDfzHZD != u9Var) {
                        }
                        if (xe0Var == u9Var) {
                        }
                        if (!this.OnDfzHZD) {
                        }
                    }
                    return xe0Var;
                }
                if (i != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                if (!this.OnDfzHZD) {
                    x90 x90Var = this.VgvYg0wo;
                    x90Var.eVhOlqcC(null, e90.qoPGr6Ce((e90) x90Var.Qr9iLBAD(), null, null, System.currentTimeMillis() - this.ow5vqvCr, false, 11));
                    l9 l9Var2 = f90Var.MdtA4re8;
                    l9Var2.getClass();
                    vnVar = (vn) l9Var2.OnDfzHZD(re.VgvYg0wo);
                    if ((vnVar == null ? vnVar.VhgXwMj9() : true) && !this.OnDfzHZD) {
                        re reVar2 = ge.NCTxEWno;
                        long FXJmAAN12 = le0.FXJmAAN1(200L, ie.MILLISECONDS);
                        f90Var.b2ZJblxo = 1;
                        OnDfzHZD = ej0.OnDfzHZD(ej0.N8VPGzVC(FXJmAAN12), f90Var);
                        u9Var = u9.NCTxEWno;
                        if (OnDfzHZD != u9Var) {
                        }
                        if (xe0Var == u9Var) {
                            return u9Var;
                        }
                        if (!this.OnDfzHZD) {
                        }
                    }
                }
                return xe0Var;
            }
        }
        f90Var = new f90(this, h9Var);
        Object obj2 = f90Var.VgvYg0wo;
        i = f90Var.b2ZJblxo;
        xe0 xe0Var2 = xe0.qoPGr6Ce;
        if (i != 0) {
        }
    }

    public final void VgvYg0wo() {
        List list = this.jb9XjC4I;
        int ESscZ9M1 = zq.ESscZ9M1(z5.bvfAo0eO(list, 10));
        if (ESscZ9M1 < 16) {
            ESscZ9M1 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ESscZ9M1);
        for (Object obj : list) {
            linkedHashMap.put(Long.valueOf(((xx) obj).qoPGr6Ce), obj);
        }
        x90 x90Var = this.VgvYg0wo;
        e90 e90Var = (e90) x90Var.Qr9iLBAD();
        List list2 = this.eVhOlqcC;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            t70 t70Var = null;
            if (!it.hasNext()) {
                x90Var.eVhOlqcC(null, e90.qoPGr6Ce(e90Var, this.wxUZMvaN, arrayList, 0L, this.eVhOlqcC.size() == 5, 4));
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y5.ZyZthT5G();
                throw null;
            }
            xx xxVar = (xx) linkedHashMap.get(Long.valueOf(((Number) next).longValue()));
            if (xxVar != null) {
                long j = xxVar.qoPGr6Ce;
                String str = xxVar.NCTxEWno;
                String str2 = xxVar.MdtA4re8;
                String str3 = xxVar.P7K7Inc8;
                String str4 = xxVar.eVhOlqcC;
                Long l = this.k3x7lurq;
                t70Var = new t70(j, str, str2, str3, str4, i2, l != null && l.longValue() == j);
            }
            if (t70Var != null) {
                arrayList.add(t70Var);
            }
            i = i2;
        }
    }
}
