package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class zyh implements woh, voh {
    public final woh[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final rwd d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public voh g;
    public yvs h;
    public woh[] i;
    public qr5 j;

    public zyh(rwd rwdVar, long[] jArr, woh... wohVarArr) {
        this.d = rwdVar;
        this.a = wohVarArr;
        rwdVar.getClass();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        this.j = new qr5(qsnVar, qsnVar);
        this.c = new IdentityHashMap();
        this.i = new woh[0];
        this.b = new boolean[wohVarArr.length];
        for (int i = 0; i < wohVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new nhs(wohVarArr[i], j);
            }
        }
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[zsbVarArr.length];
        int[] iArr3 = new int[zsbVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zsbVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            aoo aooVar = aooVarArr[i2];
            Integer num = aooVar == null ? null : (Integer) identityHashMap.get(aooVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            zsb zsbVar = zsbVarArr[i2];
            if (zsbVar != null) {
                String str = zsbVar.n().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = zsbVarArr.length;
        aoo[] aooVarArr2 = new aoo[length2];
        aoo[] aooVarArr3 = new aoo[zsbVarArr.length];
        zsb[] zsbVarArr2 = new zsb[zsbVarArr.length];
        woh[] wohVarArr = this.a;
        ArrayList arrayList = new ArrayList(wohVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < wohVarArr.length) {
            int i4 = i;
            while (i4 < zsbVarArr.length) {
                aooVarArr3[i4] = iArr2[i4] == i3 ? aooVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    zsb zsbVar2 = zsbVarArr[i4];
                    zsbVar2.getClass();
                    iArr = iArr2;
                    xvs xvsVar = (xvs) this.f.get(zsbVar2.n());
                    xvsVar.getClass();
                    zsbVarArr2[i4] = new yyh(zsbVar2, xvsVar);
                } else {
                    iArr = iArr2;
                    zsbVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            woh[] wohVarArr2 = wohVarArr;
            int i5 = i3;
            long a = wohVarArr2[i3].a(zsbVarArr2, zArr, aooVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = a;
            } else if (a != j2) {
                xq0.q("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < zsbVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    aoo aooVar2 = aooVarArr3[i6];
                    aooVar2.getClass();
                    aooVarArr2[i6] = aooVarArr3[i6];
                    identityHashMap.put(aooVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    vq1.A(aooVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(wohVarArr2[i5]);
            }
            i3 = i5 + 1;
            wohVarArr = wohVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(aooVarArr2, i7, aooVarArr, i7, length2);
        this.i = (woh[]) arrayList.toArray(new woh[i7]);
        AbstractList O = ldg.O(new tuh(10), arrayList);
        this.d.getClass();
        this.j = new qr5(arrayList, O);
        return j2;
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        voh vohVar = this.g;
        vohVar.getClass();
        vohVar.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        woh[] wohVarArr = this.i;
        return (wohVarArr.length > 0 ? wohVarArr[0] : this.a[0]).c(j, hapVar);
    }

    @Override // defpackage.ahp
    public final long e() {
        return this.j.e();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.j.f();
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        ArrayList arrayList = this.e;
        arrayList.remove(wohVar);
        if (arrayList.isEmpty()) {
            woh[] wohVarArr = this.a;
            int i = 0;
            for (woh wohVar2 : wohVarArr) {
                i += wohVar2.m().a;
            }
            xvs[] xvsVarArr = new xvs[i];
            int i2 = 0;
            for (int i3 = 0; i3 < wohVarArr.length; i3++) {
                yvs m = wohVarArr[i3].m();
                int i4 = m.a;
                int i5 = 0;
                while (i5 < i4) {
                    xvs a = m.a(i5);
                    int i6 = a.a;
                    dsc[] dscVarArr = new dsc[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        dsc dscVar = a.d[i7];
                        bsc a2 = dscVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = dscVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a2.a = sb.toString();
                        dscVarArr[i7] = new dsc(a2);
                    }
                    xvs xvsVar = new xvs(i3 + StringUtils.PROCESS_POSTFIX_DELIMITER + a.b, dscVarArr);
                    this.f.put(xvsVar, a);
                    xvsVarArr[i2] = xvsVar;
                    i5++;
                    i2++;
                }
            }
            this.h = new yvs(xvsVarArr);
            voh vohVar = this.g;
            vohVar.getClass();
            vohVar.g(this);
        }
    }

    @Override // defpackage.woh
    public final long h(long j) {
        long h = this.i[0].h(j);
        int i = 1;
        while (true) {
            woh[] wohVarArr = this.i;
            if (i >= wohVarArr.length) {
                return h;
            }
            if (wohVarArr[i].h(h) != h) {
                xq0.q("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.woh
    public final long i() {
        long j = -9223372036854775807L;
        for (woh wohVar : this.i) {
            long i = wohVar.i();
            if (i != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (woh wohVar2 : this.i) {
                        if (wohVar2 == wohVar) {
                            break;
                        }
                        if (wohVar2.h(i) != i) {
                            xq0.q("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j = i;
                } else if (i != j) {
                    xq0.q("Conflicting discontinuities.");
                    return 0L;
                }
            } else if (j != -9223372036854775807L && wohVar.h(j) != j) {
                xq0.q("Unexpected child seekToUs result.");
                return 0L;
            }
        }
        return j;
    }

    @Override // defpackage.woh
    public final void k() {
        for (woh wohVar : this.a) {
            wohVar.k();
        }
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.g = vohVar;
        ArrayList arrayList = this.e;
        woh[] wohVarArr = this.a;
        Collections.addAll(arrayList, wohVarArr);
        for (woh wohVar : wohVarArr) {
            wohVar.l(this, j);
        }
    }

    @Override // defpackage.woh
    public final yvs m() {
        yvs yvsVar = this.h;
        yvsVar.getClass();
        return yvsVar;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.j.n(dhgVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((woh) arrayList.get(i)).n(dhgVar);
        }
        return false;
    }

    @Override // defpackage.ahp
    public final long r() {
        return this.j.r();
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        for (woh wohVar : this.i) {
            wohVar.s(j, z);
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        this.j.t(j);
    }
}
