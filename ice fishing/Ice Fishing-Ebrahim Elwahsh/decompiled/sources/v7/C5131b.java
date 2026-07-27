package v7;

import E7.p;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5131b implements p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41368n;

    public /* synthetic */ C5131b(int i) {
        this.f41368n = i;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        C5132c c5132c;
        switch (this.f41368n) {
            case 0:
                String acc = (String) obj;
                InterfaceC5136g element = (InterfaceC5136g) obj2;
                kotlin.jvm.internal.h.e(acc, "acc");
                kotlin.jvm.internal.h.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC5138i acc2 = (InterfaceC5138i) obj;
                InterfaceC5136g element2 = (InterfaceC5136g) obj2;
                kotlin.jvm.internal.h.e(acc2, "acc");
                kotlin.jvm.internal.h.e(element2, "element");
                InterfaceC5138i g9 = acc2.g(element2.getKey());
                C5139j c5139j = C5139j.f41372n;
                if (g9 == c5139j) {
                    return element2;
                }
                C5134e c5134e = C5134e.f41371n;
                InterfaceC5135f interfaceC5135f = (InterfaceC5135f) g9.i(c5134e);
                if (interfaceC5135f == null) {
                    c5132c = new C5132c(element2, g9);
                } else {
                    InterfaceC5138i g10 = g9.g(c5134e);
                    if (g10 == c5139j) {
                        return new C5132c(interfaceC5135f, element2);
                    }
                    c5132c = new C5132c(interfaceC5135f, new C5132c(element2, g10));
                }
                return c5132c;
        }
    }
}
