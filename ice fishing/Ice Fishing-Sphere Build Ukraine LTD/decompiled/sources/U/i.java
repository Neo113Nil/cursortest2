package U;

import N0.o;
import N0.p;
import c0.r;
import v.InterfaceC0256a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0256a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1037b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1036a = i2;
        this.f1037b = obj;
    }

    @Override // v.InterfaceC0256a
    public final void accept(Object obj) {
        switch (this.f1036a) {
            case 0:
                ((o) ((p) this.f1037b)).n((k) obj);
                break;
            default:
                ((r) this.f1037b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
