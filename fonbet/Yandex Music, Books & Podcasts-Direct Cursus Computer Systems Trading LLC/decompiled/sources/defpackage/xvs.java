package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xvs {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final dsc[] d;
    public int e;

    static {
        int i = dvt.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public xvs(String str, dsc... dscVarArr) {
        vq1.v(dscVarArr.length > 0);
        this.b = str;
        this.d = dscVarArr;
        this.a = dscVarArr.length;
        int i = l5i.i(dscVarArr[0].n);
        this.c = i == -1 ? l5i.i(dscVarArr[0].m) : i;
        String str2 = dscVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = dscVarArr[0].f | 16384;
        for (int i3 = 1; i3 < dscVarArr.length; i3++) {
            String str3 = dscVarArr[i3].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i3, dscVarArr[0].d, dscVarArr[i3].d);
                return;
            } else {
                if (i2 != (dscVarArr[i3].f | 16384)) {
                    c("role flags", i3, Integer.toBinaryString(dscVarArr[0].f), Integer.toBinaryString(dscVarArr[i3].f));
                    return;
                }
            }
        }
    }

    public static xvs a(Bundle bundle) {
        qsn G;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        int i = 0;
        if (parcelableArrayList == null) {
            ude udeVar = yde.b;
            G = qsn.e;
        } else {
            G = sk3.G(new wvs(i), parcelableArrayList);
        }
        return new xvs(bundle.getString(g, ""), (dsc[]) G.toArray(new dsc[0]));
    }

    public static void c(String str, int i, String str2, String str3) {
        StringBuilder m = f1d.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        m.append(str3);
        m.append("' (track ");
        m.append(i);
        m.append(")");
        vq1.L("TrackGroup", "", new IllegalStateException(m.toString()));
    }

    public final int b(dsc dscVar) {
        int i = 0;
        while (true) {
            dsc[] dscVarArr = this.d;
            if (i >= dscVarArr.length) {
                return -1;
            }
            if (dscVar == dscVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        dsc[] dscVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(dscVarArr.length);
        for (dsc dscVar : dscVarArr) {
            List list = dscVar.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(dsc.P, dscVar.a);
            bundle2.putString(dsc.Q, dscVar.b);
            String str = dsc.u0;
            yde<rif> ydeVar = dscVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(ydeVar.size());
            for (rif rifVar : ydeVar) {
                rifVar.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = rifVar.a;
                if (str2 != null) {
                    bundle3.putString(rif.c, str2);
                }
                bundle3.putString(rif.d, rifVar.b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(dsc.R, dscVar.d);
            bundle2.putInt(dsc.S, dscVar.e);
            bundle2.putInt(dsc.T, dscVar.f);
            int i = dscVar.g;
            if (i != dsc.O.g) {
                bundle2.putInt(dsc.v0, i);
            }
            bundle2.putInt(dsc.U, dscVar.h);
            bundle2.putInt(dsc.V, dscVar.i);
            bundle2.putString(dsc.W, dscVar.k);
            bundle2.putString(dsc.X, dscVar.m);
            bundle2.putString(dsc.Y, dscVar.n);
            bundle2.putInt(dsc.Z, dscVar.o);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(dsc.a0 + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(dsc.b0, dscVar.r);
            bundle2.putLong(dsc.c0, dscVar.s);
            bundle2.putInt(dsc.d0, dscVar.u);
            bundle2.putInt(dsc.e0, dscVar.v);
            bundle2.putFloat(dsc.f0, dscVar.w);
            bundle2.putInt(dsc.g0, dscVar.x);
            bundle2.putFloat(dsc.h0, dscVar.y);
            bundle2.putByteArray(dsc.i0, dscVar.z);
            bundle2.putInt(dsc.j0, dscVar.A);
            q85 q85Var = dscVar.B;
            if (q85Var != null) {
                String str3 = dsc.k0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(q85.i, q85Var.a);
                bundle4.putInt(q85.j, q85Var.b);
                bundle4.putInt(q85.k, q85Var.c);
                bundle4.putByteArray(q85.l, q85Var.d);
                bundle4.putInt(q85.m, q85Var.e);
                bundle4.putInt(q85.n, q85Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(dsc.w0, dscVar.C);
            bundle2.putInt(dsc.l0, dscVar.D);
            bundle2.putInt(dsc.m0, dscVar.E);
            bundle2.putInt(dsc.n0, dscVar.F);
            bundle2.putInt(dsc.o0, dscVar.G);
            bundle2.putInt(dsc.p0, dscVar.H);
            bundle2.putInt(dsc.q0, dscVar.I);
            bundle2.putInt(dsc.s0, dscVar.K);
            bundle2.putInt(dsc.t0, dscVar.L);
            bundle2.putInt(dsc.r0, dscVar.M);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xvs.class == obj.getClass()) {
            xvs xvsVar = (xvs) obj;
            if (this.b.equals(xvsVar.b) && Arrays.equals(this.d, xvsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + k5r.c(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
