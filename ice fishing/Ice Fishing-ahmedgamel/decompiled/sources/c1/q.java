package c1;

import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC0541a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5685b;

    public /* synthetic */ q(int i, Object obj) {
        this.f5684a = i;
        this.f5685b = obj;
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        switch (this.f5684a) {
            case 0:
                ((r) this.f5685b).f5695k = true;
                break;
            case 1:
                ((r) this.f5685b).f5695k = true;
                break;
            case 2:
                ((r) this.f5685b).f5695k = true;
                break;
            default:
                AbstractC4563a abstractC4563a = (AbstractC4563a) this.f5685b;
                boolean z6 = abstractC4563a.f37991r.l() == 1.0f;
                if (z6 != abstractC4563a.f37997x) {
                    abstractC4563a.f37997x = z6;
                    abstractC4563a.f37988o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
