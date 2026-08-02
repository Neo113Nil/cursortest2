package Z0;

import l1.AbstractC4672g;
import l1.ChoreographerFrameCallbackC4670e;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f4006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f4007c;

    public /* synthetic */ q(v vVar, float f2, int i) {
        this.f4005a = i;
        this.f4006b = vVar;
        this.f4007c = f2;
    }

    @Override // Z0.u
    public final void run() {
        switch (this.f4005a) {
            case 0:
                v vVar = this.f4006b;
                i iVar = vVar.f4046n;
                float f2 = this.f4007c;
                if (iVar != null) {
                    float f9 = AbstractC4672g.f(iVar.f3975l, iVar.f3976m, f2);
                    ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = vVar.f4053u;
                    choreographerFrameCallbackC4670e.p(choreographerFrameCallbackC4670e.f38821C, f9);
                    break;
                } else {
                    vVar.f4057y.add(new q(vVar, f2, 0));
                    break;
                }
            case 1:
                v vVar2 = this.f4006b;
                i iVar2 = vVar2.f4046n;
                float f10 = this.f4007c;
                if (iVar2 != null) {
                    vVar2.s((int) AbstractC4672g.f(iVar2.f3975l, iVar2.f3976m, f10));
                    break;
                } else {
                    vVar2.f4057y.add(new q(vVar2, f10, 1));
                    break;
                }
            default:
                this.f4006b.u(this.f4007c);
                break;
        }
    }
}
