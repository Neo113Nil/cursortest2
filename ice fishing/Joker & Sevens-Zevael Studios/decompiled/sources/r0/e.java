package r0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import pc.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: j, reason: collision with root package name */
    public final u0.h f5907j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5908k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5909l;

    /* renamed from: m, reason: collision with root package name */
    public int f5910m;

    public e(u0.h hVar, l[] lVarArr) {
        super(hVar.f6673h, lVarArr);
        this.f5907j = hVar;
        this.f5910m = hVar.f6675j;
    }

    public final void c(int i10, k kVar, Object obj, int i11) {
        int i12 = i11 * 5;
        l[] lVarArr = this.f5904g;
        if (i12 <= 30) {
            int B = 1 << a.a.B(i10, i12);
            if (kVar.h(B)) {
                lVarArr[i11].a(kVar.f5920d, Integer.bitCount(kVar.f5917a) * 2, kVar.f(B));
                this.f5905h = i11;
                return;
            } else {
                int t3 = kVar.t(B);
                k s10 = kVar.s(t3);
                lVarArr[i11].a(kVar.f5920d, Integer.bitCount(kVar.f5917a) * 2, t3);
                c(i10, s10, obj, i11 + 1);
                return;
            }
        }
        l lVar = lVarArr[i11];
        Object[] objArr = kVar.f5920d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i11];
            if (pc.j.a(lVar2.f5921g[lVar2.f5923i], obj)) {
                this.f5905h = i11;
                return;
            } else {
                lVarArr[i11].f5923i += 2;
            }
        }
    }

    @Override // r0.d, java.util.Iterator
    public final Object next() {
        if (this.f5907j.f6675j != this.f5910m) {
            throw new ConcurrentModificationException();
        }
        if (!this.f5906i) {
            throw new NoSuchElementException();
        }
        l lVar = this.f5904g[this.f5905h];
        this.f5908k = lVar.f5921g[lVar.f5923i];
        this.f5909l = true;
        return super.next();
    }

    @Override // r0.d, java.util.Iterator
    public final void remove() {
        if (!this.f5909l) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f5906i;
        u0.h hVar = this.f5907j;
        if (!z10) {
            v.b(hVar).remove(this.f5908k);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = this.f5904g[this.f5905h];
            Object obj = lVar.f5921g[lVar.f5923i];
            v.b(hVar).remove(this.f5908k);
            c(obj != null ? obj.hashCode() : 0, hVar.f6673h, obj, 0);
        }
        this.f5908k = null;
        this.f5909l = false;
        this.f5910m = hVar.f6675j;
    }
}
