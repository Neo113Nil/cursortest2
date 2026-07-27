package p8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39862n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39863u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39864v;

    public /* synthetic */ l(r rVar, int i, Object obj, int i6) {
        this.f39862n = i6;
        this.f39863u = rVar;
        this.f39864v = i;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f39862n) {
            case 0:
                r rVar = this.f39863u;
                int i = this.f39864v;
                rVar.f39878D.getClass();
                try {
                    rVar.f39889P.m(i, EnumC4856b.f39813A);
                    synchronized (rVar) {
                        rVar.f39891R.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return u7.v.f41350a;
            case 1:
                r rVar2 = this.f39863u;
                int i6 = this.f39864v;
                rVar2.f39878D.getClass();
                synchronized (rVar2) {
                    rVar2.f39891R.remove(Integer.valueOf(i6));
                }
                return u7.v.f41350a;
            default:
                r rVar3 = this.f39863u;
                int i9 = this.f39864v;
                rVar3.f39878D.getClass();
                try {
                    rVar3.f39889P.m(i9, EnumC4856b.f39813A);
                    synchronized (rVar3) {
                        rVar3.f39891R.remove(Integer.valueOf(i9));
                    }
                } catch (IOException unused2) {
                }
                return u7.v.f41350a;
        }
    }

    public /* synthetic */ l(r rVar, int i, List list, boolean z3) {
        this.f39862n = 2;
        this.f39863u = rVar;
        this.f39864v = i;
    }
}
