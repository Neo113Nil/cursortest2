package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class bzh extends fr5 {
    public static final onh s;
    public final wvh[] k;
    public final ArrayList l;
    public final sis[] m;
    public final ArrayList n;
    public final rwd o;
    public int p;
    public long[][] q;
    public pg5 r;

    static {
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        qsn qsnVar2 = qsn.e;
        dnh dnhVar = new dnh();
        s = new onh("MergingMediaSource", new anh(xmhVar), null, new fnh(dnhVar), hoh.K, jnh.d);
    }

    public bzh(wvh... wvhVarArr) {
        rwd rwdVar = new rwd(19);
        this.k = wvhVarArr;
        this.o = rwdVar;
        this.n = new ArrayList(Arrays.asList(wvhVarArr));
        this.p = -1;
        this.l = new ArrayList(wvhVarArr.length);
        for (int i = 0; i < wvhVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new sis[wvhVarArr.length];
        this.q = new long[0][];
        new HashMap();
        hld.w(8, "expectedKeys");
        hld.w(2, "expectedValuesPerKey");
        new ygi(xk5.b(8)).f = new xgi();
    }

    @Override // defpackage.fr5
    public final uvh A(Object obj, uvh uvhVar) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((azh) list.get(i)).a.equals(uvhVar)) {
                return ((azh) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.fr5
    public final void D(Object obj, wvh wvhVar, sis sisVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = sisVar.h();
        } else if (sisVar.h() != this.p) {
            this.r = new pg5();
            return;
        }
        int length = this.q.length;
        sis[] sisVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, sisVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(wvhVar);
        sisVarArr[num.intValue()] = sisVar;
        if (arrayList.isEmpty()) {
            y(sisVarArr[0]);
        }
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        wvh[] wvhVarArr = this.k;
        return wvhVarArr.length > 0 && wvhVarArr[0].a(onhVar);
    }

    @Override // defpackage.wvh
    public final onh f() {
        wvh[] wvhVarArr = this.k;
        return wvhVarArr.length > 0 ? wvhVarArr[0].f() : s;
    }

    @Override // defpackage.wvh
    public final void i(onh onhVar) {
        this.k[0].i(onhVar);
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        wvh[] wvhVarArr = this.k;
        int length = wvhVarArr.length;
        woh[] wohVarArr = new woh[length];
        sis[] sisVarArr = this.m;
        int b = sisVarArr[0].b(uvhVar.a);
        for (int i = 0; i < length; i++) {
            uvh a = uvhVar.a(sisVarArr[i].l(b));
            wohVarArr[i] = wvhVarArr[i].n(a, zi7Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new azh(a, wohVarArr[i]));
        }
        return new zyh(this.o, this.q[b], wohVarArr);
    }

    @Override // defpackage.fr5, defpackage.wvh
    public final void p() {
        pg5 pg5Var = this.r;
        if (pg5Var != null) {
            throw pg5Var;
        }
        super.p();
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        zyh zyhVar = (zyh) wohVar;
        int i = 0;
        while (true) {
            wvh[] wvhVarArr = this.k;
            if (i >= wvhVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((azh) list.get(i2)).b.equals(wohVar)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            wvh wvhVar = wvhVarArr[i];
            boolean z = zyhVar.b[i];
            woh[] wohVarArr = zyhVar.a;
            wvhVar.s(z ? ((nhs) wohVarArr[i]).a : wohVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.j = t6tVar;
        this.i = dvt.p(null);
        int i = 0;
        while (true) {
            wvh[] wvhVarArr = this.k;
            if (i >= wvhVarArr.length) {
                return;
            }
            E(Integer.valueOf(i), wvhVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.fr5, defpackage.js2
    public final void z() {
        super.z();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }
}
