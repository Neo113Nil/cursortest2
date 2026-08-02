package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class dvf implements rwo {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwo b;
    public final /* synthetic */ mxo c;

    public /* synthetic */ dvf(rwo rwoVar, mxo mxoVar, int i) {
        this.a = i;
        this.c = mxoVar;
        this.b = rwoVar;
    }

    @Override // defpackage.rwo
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        switch (this.a) {
            case 0:
                fvf fvfVar = (fvf) this.c;
                bvf j = fvfVar.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = fvfVar.h();
                if (i > e() || h > i) {
                    return ((i - fvfVar.h()) * avf.U(j)) - fvfVar.i();
                }
                List list = j.k;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((cvf) obj).a != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                cvf cvfVar = (cvf) obj;
                if (cvfVar != null) {
                    return cvfVar.p;
                }
                return 0;
            default:
                o3k o3kVar = (o3k) this.c;
                return (int) (yhn.f(uwf.k(o3kVar) + eeh.b(((o3kVar.p() * (i - o3kVar.j())) - (o3kVar.k() * o3kVar.p())) + 0), o3kVar.h, o3kVar.g) - uwf.k(o3kVar));
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return ((fvf) this.c).h();
            default:
                return ((o3k) this.c).e;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return ((fvf) this.c).i();
            default:
                return ((o3k) this.c).f;
        }
    }

    public final int e() {
        switch (this.a) {
            case 0:
                cvf cvfVar = (cvf) CollectionsKt.Z(((fvf) this.c).j().k);
                if (cvfVar != null) {
                    return cvfVar.a;
                }
                return 0;
            default:
                return ((nfh) CollectionsKt.Y(((o3k) this.c).l().a)).a;
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ((fvf) this.c).n(i, i2, true);
                break;
            default:
                ((o3k) this.c).w(i2 / r0.p(), i, true);
                break;
        }
    }
}
