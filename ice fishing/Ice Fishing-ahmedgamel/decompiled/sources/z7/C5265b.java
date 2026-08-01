package z7;

import I7.p;

/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5265b implements p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f42268n;

    public /* synthetic */ C5265b(int i) {
        this.f42268n = i;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        C5266c c5266c;
        switch (this.f42268n) {
            case 0:
                String acc = (String) obj;
                InterfaceC5270g element = (InterfaceC5270g) obj2;
                kotlin.jvm.internal.h.e(acc, "acc");
                kotlin.jvm.internal.h.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC5272i acc2 = (InterfaceC5272i) obj;
                InterfaceC5270g element2 = (InterfaceC5270g) obj2;
                kotlin.jvm.internal.h.e(acc2, "acc");
                kotlin.jvm.internal.h.e(element2, "element");
                InterfaceC5272i i = acc2.i(element2.getKey());
                C5273j c5273j = C5273j.f42272n;
                if (i == c5273j) {
                    return element2;
                }
                C5268e c5268e = C5268e.f42271n;
                InterfaceC5269f interfaceC5269f = (InterfaceC5269f) i.m(c5268e);
                if (interfaceC5269f == null) {
                    c5266c = new C5266c(element2, i);
                } else {
                    InterfaceC5272i i6 = i.i(c5268e);
                    if (i6 == c5273j) {
                        return new C5266c(interfaceC5269f, element2);
                    }
                    c5266c = new C5266c(interfaceC5269f, new C5266c(element2, i6));
                }
                return c5266c;
        }
    }
}
