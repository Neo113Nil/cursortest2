package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n8t extends b8t {
    public int J;
    public b8t[] X;
    public ArrayList H = new ArrayList();
    public boolean I = true;
    public boolean K = false;
    public int L = 0;

    @Override // defpackage.b8t
    public final void F(View view) {
        super.F(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((b8t) this.H.get(i)).F(view);
        }
    }

    @Override // defpackage.b8t
    public final void G() {
        this.A = 0L;
        dc8 dc8Var = new dc8(this);
        for (int i = 0; i < this.H.size(); i++) {
            b8t b8tVar = (b8t) this.H.get(i);
            b8tVar.b(dc8Var);
            b8tVar.G();
            long j = b8tVar.A;
            boolean z = this.I;
            long j2 = this.A;
            if (z) {
                this.A = Math.max(j2, j);
            } else {
                b8tVar.C = j2;
                this.A = j2 + j;
            }
        }
    }

    @Override // defpackage.b8t
    public final b8t H(a8t a8tVar) {
        super.H(a8tVar);
        return this;
    }

    @Override // defpackage.b8t
    public final void I(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((b8t) this.H.get(i)).I(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.b8t
    public final void J(View view) {
        super.J(view);
        b8t[] a0 = a0();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            a0[i].J(view);
        }
        Arrays.fill(a0, (Object) null);
        this.X = a0;
    }

    @Override // defpackage.b8t
    public final void K() {
        ArrayList arrayList;
        if (this.H.isEmpty()) {
            S();
            q();
            return;
        }
        dc8 dc8Var = new dc8();
        dc8Var.b = this;
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((b8t) it.next()).b(dc8Var);
        }
        this.J = this.H.size();
        if (this.I) {
            Iterator it2 = this.H.iterator();
            while (it2.hasNext()) {
                ((b8t) it2.next()).K();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.H.size();
            arrayList = this.H;
            if (i >= size) {
                break;
            }
            ((b8t) arrayList.get(i - 1)).b(new m8t((b8t) this.H.get(i)));
            i++;
        }
        b8t b8tVar = (b8t) arrayList.get(0);
        if (b8tVar != null) {
            b8tVar.K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.b8t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(long j, long j2) {
        long j3;
        long j4 = this.A;
        long j5 = 0;
        if (this.k != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.t = false;
            E(this, wvs.b, z);
        }
        if (!this.I) {
            int i = 1;
            while (true) {
                int size = this.H.size();
                ArrayList arrayList = this.H;
                if (i >= size) {
                    i = arrayList.size();
                    break;
                } else if (((b8t) arrayList.get(i)).C > j2) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i - 1;
            if (j >= j2) {
                while (i2 < this.H.size()) {
                    b8t b8tVar = (b8t) this.H.get(i2);
                    long j6 = b8tVar.C;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    b8tVar.L(j7, j2 - j6);
                    i2++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i2 >= 0) {
                    b8t b8tVar2 = (b8t) this.H.get(i2);
                    long j8 = b8tVar2.C;
                    long j9 = j - j8;
                    b8tVar2.L(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.k == null) {
                if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.t = true;
                }
                E(this, wvs.c, z);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            ((b8t) this.H.get(i3)).L(j, j2);
        }
        j3 = j5;
        if (this.k == null) {
        }
    }

    @Override // defpackage.b8t
    public final void N(p6g p6gVar) {
        this.y = p6gVar;
        this.L |= 8;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((b8t) this.H.get(i)).N(p6gVar);
        }
    }

    @Override // defpackage.b8t
    public final void O(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((b8t) this.H.get(i)).O(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.b8t
    public final void P(z7l z7lVar) {
        super.P(z7lVar);
        this.L |= 4;
        if (this.H != null) {
            for (int i = 0; i < this.H.size(); i++) {
                ((b8t) this.H.get(i)).P(z7lVar);
            }
        }
    }

    @Override // defpackage.b8t
    public final void Q(e88 e88Var) {
        this.x = e88Var;
        this.L |= 2;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((b8t) this.H.get(i)).Q(e88Var);
        }
    }

    @Override // defpackage.b8t
    public final void R(long j) {
        this.b = j;
    }

    @Override // defpackage.b8t
    public final String T(String str) {
        String T = super.T(str);
        for (int i = 0; i < this.H.size(); i++) {
            StringBuilder m = tlm.m(T, StringUtil.LF);
            m.append(((b8t) this.H.get(i)).T(str.concat("  ")));
            T = m.toString();
        }
        return T;
    }

    public final void U(m8t m8tVar) {
        super.b(m8tVar);
    }

    @Override // defpackage.b8t
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void e(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((b8t) this.H.get(i)).e(view);
        }
        this.f.add(view);
    }

    public final void W(b8t b8tVar) {
        this.H.add(b8tVar);
        b8tVar.k = this;
        long j = this.c;
        if (j >= 0) {
            b8tVar.M(j);
        }
        if ((this.L & 1) != 0) {
            b8tVar.O(this.d);
        }
        if ((this.L & 2) != 0) {
            b8tVar.Q(this.x);
        }
        if ((this.L & 4) != 0) {
            b8tVar.P(this.z);
        }
        if ((this.L & 8) != 0) {
            b8tVar.N(this.y);
        }
    }

    public final b8t X(int i) {
        if (i < 0 || i >= this.H.size()) {
            return null;
        }
        return (b8t) this.H.get(i);
    }

    @Override // defpackage.b8t
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void M(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b8t) this.H.get(i)).M(j);
        }
    }

    public final void Z(int i) {
        if (i == 0) {
            this.I = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(k5r.i(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.I = false;
        }
    }

    public final b8t[] a0() {
        b8t[] b8tVarArr = this.X;
        this.X = null;
        if (b8tVarArr == null) {
            b8tVarArr = new b8t[this.H.size()];
        }
        return (b8t[]) this.H.toArray(b8tVarArr);
    }

    @Override // defpackage.b8t
    public final b8t c(String str) {
        throw null;
    }

    @Override // defpackage.b8t
    public final void cancel() {
        super.cancel();
        b8t[] a0 = a0();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            a0[i].cancel();
        }
        Arrays.fill(a0, (Object) null);
        this.X = a0;
    }

    @Override // defpackage.b8t
    public final void d(int i) {
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            ((b8t) this.H.get(i2)).d(i);
        }
        super.d(i);
    }

    @Override // defpackage.b8t
    public final void g(b9t b9tVar) {
        View view = b9tVar.b;
        if (B(view)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                b8t b8tVar = (b8t) it.next();
                if (b8tVar.B(view)) {
                    b8tVar.g(b9tVar);
                    b9tVar.c.add(b8tVar);
                }
            }
        }
    }

    @Override // defpackage.b8t
    public final void i(b9t b9tVar) {
        super.i(b9tVar);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((b8t) this.H.get(i)).i(b9tVar);
        }
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        View view = b9tVar.b;
        if (B(view)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                b8t b8tVar = (b8t) it.next();
                if (b8tVar.B(view)) {
                    b8tVar.j(b9tVar);
                    b9tVar.c.add(b8tVar);
                }
            }
        }
    }

    @Override // defpackage.b8t
    /* renamed from: m */
    public final b8t clone() {
        n8t n8tVar = (n8t) super.clone();
        n8tVar.H = new ArrayList();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            b8t clone = ((b8t) this.H.get(i)).clone();
            n8tVar.H.add(clone);
            clone.k = n8tVar;
        }
        return n8tVar;
    }

    @Override // defpackage.b8t
    public final void p(ViewGroup viewGroup, x3n x3nVar, x3n x3nVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            b8t b8tVar = (b8t) this.H.get(i);
            if (j > 0 && (this.I || i == 0)) {
                long j2 = b8tVar.b;
                if (j2 > 0) {
                    b8tVar.R(j2 + j);
                } else {
                    b8tVar.R(j);
                }
            }
            b8tVar.p(viewGroup, x3nVar, x3nVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.b8t
    public final void r(ViewGroup viewGroup) {
        super.r(viewGroup);
        b8t[] a0 = a0();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            a0[i].r(viewGroup);
        }
        Arrays.fill(a0, (Object) null);
        this.X = a0;
    }

    @Override // defpackage.b8t
    public final boolean x() {
        for (int i = 0; i < this.H.size(); i++) {
            if (((b8t) this.H.get(i)).x()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b8t
    public final boolean y() {
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            if (!((b8t) this.H.get(i)).y()) {
                return false;
            }
        }
        return true;
    }
}
