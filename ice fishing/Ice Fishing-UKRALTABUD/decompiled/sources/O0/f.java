package O0;

import P0.u;
import a.AbstractC0069a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: f, reason: collision with root package name */
    public final v0.i f821f;

    /* renamed from: g, reason: collision with root package name */
    public final int f822g;

    /* renamed from: h, reason: collision with root package name */
    public final int f823h;

    public f(v0.i iVar, int i2, int i3) {
        this.f821f = iVar;
        this.f822g = i2;
        this.f823h = i3;
    }

    public abstract Object a(M0.p pVar, v0.d dVar);

    public abstract f b(v0.i iVar, int i2, int i3);

    @Override // O0.j
    public final N0.d c(v0.i iVar, int i2, int i3) {
        v0.i iVar2 = this.f821f;
        v0.i f2 = iVar.f(iVar2);
        int i4 = this.f823h;
        int i5 = this.f822g;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (E0.i.a(f2, iVar2) && i2 == i5 && i3 == i4) ? this : b(f2, i2, i3);
    }

    @Override // N0.d
    public Object n(N0.e eVar, v0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.j());
        Object I2 = AbstractC0069a.I(uVar, uVar, dVar2);
        return I2 == w0.a.f3071f ? I2 : t0.g.f2989a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        v0.j jVar = v0.j.f3009f;
        v0.i iVar = this.f821f;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f822g;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f823h;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + u0.d.F(arrayList, ", ", null, null, null, 62) + ']';
    }
}
