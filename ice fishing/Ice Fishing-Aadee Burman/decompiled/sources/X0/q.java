package X0;

import j1.AbstractC4603g;
import j1.ChoreographerFrameCallbackC4601e;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3655c;

    public /* synthetic */ q(v vVar, float f3, int i) {
        this.f3653a = i;
        this.f3654b = vVar;
        this.f3655c = f3;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3653a) {
            case 0:
                v vVar = this.f3654b;
                i iVar = vVar.f3690n;
                float f3 = this.f3655c;
                if (iVar != null) {
                    float f9 = AbstractC4603g.f(iVar.f3623l, iVar.f3624m, f3);
                    ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = vVar.f3698u;
                    choreographerFrameCallbackC4601e.p(choreographerFrameCallbackC4601e.f38309C, f9);
                    break;
                } else {
                    vVar.f3706y.add(new q(vVar, f3, 0));
                    break;
                }
            case 1:
                v vVar2 = this.f3654b;
                i iVar2 = vVar2.f3690n;
                float f10 = this.f3655c;
                if (iVar2 != null) {
                    vVar2.s((int) AbstractC4603g.f(iVar2.f3623l, iVar2.f3624m, f10));
                    break;
                } else {
                    vVar2.f3706y.add(new q(vVar2, f10, 1));
                    break;
                }
            default:
                this.f3654b.u(this.f3655c);
                break;
        }
    }
}
