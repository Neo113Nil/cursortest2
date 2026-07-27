package l8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39145n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39146u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39147v;

    public /* synthetic */ l(r rVar, int i, Object obj, int i4) {
        this.f39145n = i4;
        this.f39146u = rVar;
        this.f39147v = i;
    }

    @Override // E7.a
    public final Object invoke() {
        switch (this.f39145n) {
            case 0:
                r rVar = this.f39146u;
                int i = this.f39147v;
                rVar.f39161D.getClass();
                try {
                    rVar.f39172P.m(i, EnumC4710b.f39096A);
                    synchronized (rVar) {
                        rVar.f39174R.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return q7.v.f40183a;
            case 1:
                r rVar2 = this.f39146u;
                int i4 = this.f39147v;
                rVar2.f39161D.getClass();
                synchronized (rVar2) {
                    rVar2.f39174R.remove(Integer.valueOf(i4));
                }
                return q7.v.f40183a;
            default:
                r rVar3 = this.f39146u;
                int i9 = this.f39147v;
                rVar3.f39161D.getClass();
                try {
                    rVar3.f39172P.m(i9, EnumC4710b.f39096A);
                    synchronized (rVar3) {
                        rVar3.f39174R.remove(Integer.valueOf(i9));
                    }
                } catch (IOException unused2) {
                }
                return q7.v.f40183a;
        }
    }

    public /* synthetic */ l(r rVar, int i, List list, boolean z8) {
        this.f39145n = 2;
        this.f39146u = rVar;
        this.f39147v = i;
    }
}
