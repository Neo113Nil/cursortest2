package p8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39912n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39913u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39914v;

    public /* synthetic */ l(r rVar, int i, Object obj, int i4) {
        this.f39912n = i4;
        this.f39913u = rVar;
        this.f39914v = i;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f39912n) {
            case 0:
                r rVar = this.f39913u;
                int i = this.f39914v;
                rVar.f39928D.getClass();
                try {
                    rVar.f39939P.m(i, EnumC4856b.f39863A);
                    synchronized (rVar) {
                        rVar.f39941R.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return u7.v.f41073a;
            case 1:
                r rVar2 = this.f39913u;
                int i4 = this.f39914v;
                rVar2.f39928D.getClass();
                synchronized (rVar2) {
                    rVar2.f39941R.remove(Integer.valueOf(i4));
                }
                return u7.v.f41073a;
            default:
                r rVar3 = this.f39913u;
                int i6 = this.f39914v;
                rVar3.f39928D.getClass();
                try {
                    rVar3.f39939P.m(i6, EnumC4856b.f39863A);
                    synchronized (rVar3) {
                        rVar3.f39941R.remove(Integer.valueOf(i6));
                    }
                } catch (IOException unused2) {
                }
                return u7.v.f41073a;
        }
    }

    public /* synthetic */ l(r rVar, int i, List list, boolean z6) {
        this.f39912n = 2;
        this.f39913u = rVar;
        this.f39914v = i;
    }
}
