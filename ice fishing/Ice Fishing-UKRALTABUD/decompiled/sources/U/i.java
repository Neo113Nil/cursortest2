package U;

import M0.o;
import M0.p;
import c0.r;
import v.InterfaceC0262a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0262a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1029b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1028a = i2;
        this.f1029b = obj;
    }

    @Override // v.InterfaceC0262a
    public final void accept(Object obj) {
        switch (this.f1028a) {
            case 0:
                ((o) ((p) this.f1029b)).n((k) obj);
                break;
            default:
                ((r) this.f1029b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
