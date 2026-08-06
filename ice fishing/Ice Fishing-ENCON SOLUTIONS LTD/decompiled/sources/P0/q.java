package P0;

import x.InterfaceC1063a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC1063a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1449b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f1448a = i2;
        this.f1449b = obj;
    }

    @Override // x.InterfaceC1063a
    public final void accept(Object obj) {
        switch (this.f1448a) {
            case 0:
                ((t) this.f1449b).setWindowInfoListenerDisplayFeatures((Z.j) obj);
                break;
            default:
                ((C1.q) ((C1.r) this.f1449b)).g((Z.j) obj);
                break;
        }
    }
}
