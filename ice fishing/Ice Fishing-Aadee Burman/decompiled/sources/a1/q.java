package a1;

import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC0424a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4290b;

    public /* synthetic */ q(int i, Object obj) {
        this.f4289a = i;
        this.f4290b = obj;
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        switch (this.f4289a) {
            case 0:
                ((r) this.f4290b).f4300k = true;
                break;
            case 1:
                ((r) this.f4290b).f4300k = true;
                break;
            case 2:
                ((r) this.f4290b).f4300k = true;
                break;
            default:
                AbstractC4498a abstractC4498a = (AbstractC4498a) this.f4290b;
                boolean z3 = abstractC4498a.f37367r.l() == 1.0f;
                if (z3 != abstractC4498a.f37373x) {
                    abstractC4498a.f37373x = z3;
                    abstractC4498a.f37364o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
