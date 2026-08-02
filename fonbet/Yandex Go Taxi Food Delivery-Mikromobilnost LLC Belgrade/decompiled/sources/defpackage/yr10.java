package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import com.google.common.collect.w;
import com.google.common.collect.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class yr10 extends ekd {
    public static final fe10 L;
    public final uf10[] D;
    public final ArrayList E;
    public final a9z0[] F;
    public final ArrayList G;
    public final z8h H;
    public int I;
    public long[][] J;
    public MergingMediaSource$IllegalMergeException K;

    static {
        td10 td10Var = new td10();
        td10Var.a = "MergingMediaSource";
        L = td10Var.a();
    }

    public yr10(uf10... uf10VarArr) {
        z8h z8hVar = new z8h();
        this.D = uf10VarArr;
        this.H = z8hVar;
        this.G = new ArrayList(Arrays.asList(uf10VarArr));
        this.I = -1;
        this.E = new ArrayList(uf10VarArr.length);
        for (int i = 0; i < uf10VarArr.length; i++) {
            this.E.add(new ArrayList());
        }
        this.F = new a9z0[uf10VarArr.length];
        this.J = new long[0][];
        new HashMap();
        y5e.i(8, "expectedKeys");
        w wVar = new w();
        y5e.i(2, "expectedValuesPerKey");
        new y(wVar).a();
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        uf10[] uf10VarArr = this.D;
        return uf10VarArr.length > 0 && uf10VarArr[0].canUpdateMediaItem(fe10Var);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        uf10[] uf10VarArr = this.D;
        int length = uf10VarArr.length;
        xe10[] xe10VarArr = new xe10[length];
        a9z0[] a9z0VarArr = this.F;
        int b = a9z0VarArr[0].b(sf10Var.a);
        for (int i = 0; i < length; i++) {
            sf10 a = sf10Var.a(a9z0VarArr[i].m(b));
            xe10VarArr[i] = uf10VarArr[i].createPeriod(a, au1Var, j - this.J[b][i]);
            ((List) this.E.get(i)).add(new xr10(a, xe10VarArr[i]));
        }
        return new wr10(this.H, this.J[b], xe10VarArr);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.C = cj01Var;
        this.B = tw21.n(null);
        int i = 0;
        while (true) {
            uf10[] uf10VarArr = this.D;
            if (i >= uf10VarArr.length) {
                return;
            }
            l(Integer.valueOf(i), uf10VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ekd, defpackage.c45
    public final void g() {
        super.g();
        Arrays.fill(this.F, (Object) null);
        this.I = -1;
        this.K = null;
        ArrayList arrayList = this.G;
        arrayList.clear();
        Collections.addAll(arrayList, this.D);
    }

    @Override // defpackage.uf10
    public final fe10 getMediaItem() {
        uf10[] uf10VarArr = this.D;
        return uf10VarArr.length > 0 ? uf10VarArr[0].getMediaItem() : L;
    }

    @Override // defpackage.ekd
    public final sf10 h(Object obj, sf10 sf10Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.E;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((xr10) list.get(i)).a.equals(sf10Var)) {
                return ((xr10) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException] */
    @Override // defpackage.ekd
    public final void k(Object obj, uf10 uf10Var, a9z0 a9z0Var) {
        Integer num = (Integer) obj;
        if (this.K != null) {
            return;
        }
        if (this.I == -1) {
            this.I = a9z0Var.i();
        } else if (a9z0Var.i() != this.I) {
            this.K = new IOException() { // from class: androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException
                public final int reason = 0;
            };
            return;
        }
        int length = this.J.length;
        a9z0[] a9z0VarArr = this.F;
        if (length == 0) {
            this.J = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.I, a9z0VarArr.length);
        }
        ArrayList arrayList = this.G;
        arrayList.remove(uf10Var);
        a9z0VarArr[num.intValue()] = a9z0Var;
        if (arrayList.isEmpty()) {
            f(a9z0VarArr[0]);
        }
    }

    @Override // defpackage.ekd, defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.K;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        wr10 wr10Var = (wr10) xe10Var;
        int i = 0;
        while (true) {
            uf10[] uf10VarArr = this.D;
            if (i >= uf10VarArr.length) {
                return;
            }
            List list = (List) this.E.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((xr10) list.get(i2)).b.equals(xe10Var)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            uf10 uf10Var = uf10VarArr[i];
            boolean z = wr10Var.b[i];
            xe10[] xe10VarArr = wr10Var.a;
            uf10Var.releasePeriod(z ? ((p6z0) xe10VarArr[i]).a : xe10VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.uf10
    public final void updateMediaItem(fe10 fe10Var) {
        this.D[0].updateMediaItem(fe10Var);
    }
}
