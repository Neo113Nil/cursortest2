package p8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39865n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39866u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39867v;

    public /* synthetic */ l(r rVar, int i, Object obj, int i6) {
        this.f39865n = i6;
        this.f39866u = rVar;
        this.f39867v = i;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f39865n) {
            case 0:
                r rVar = this.f39866u;
                int i = this.f39867v;
                rVar.f39881D.getClass();
                try {
                    rVar.f39892P.m(i, EnumC4856b.f39816A);
                    synchronized (rVar) {
                        rVar.f39894R.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return u7.v.f41353a;
            case 1:
                r rVar2 = this.f39866u;
                int i6 = this.f39867v;
                rVar2.f39881D.getClass();
                synchronized (rVar2) {
                    rVar2.f39894R.remove(Integer.valueOf(i6));
                }
                return u7.v.f41353a;
            default:
                r rVar3 = this.f39866u;
                int i9 = this.f39867v;
                rVar3.f39881D.getClass();
                try {
                    rVar3.f39892P.m(i9, EnumC4856b.f39816A);
                    synchronized (rVar3) {
                        rVar3.f39894R.remove(Integer.valueOf(i9));
                    }
                } catch (IOException unused2) {
                }
                return u7.v.f41353a;
        }
    }

    public /* synthetic */ l(r rVar, int i, List list, boolean z3) {
        this.f39865n = 2;
        this.f39866u = rVar;
        this.f39867v = i;
    }
}
