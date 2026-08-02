package z7;

import I7.p;

/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5238b implements p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f42237n;

    public /* synthetic */ C5238b(int i) {
        this.f42237n = i;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        C5239c c5239c;
        switch (this.f42237n) {
            case 0:
                String acc = (String) obj;
                InterfaceC5243g element = (InterfaceC5243g) obj2;
                kotlin.jvm.internal.h.e(acc, "acc");
                kotlin.jvm.internal.h.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC5245i acc2 = (InterfaceC5245i) obj;
                InterfaceC5243g element2 = (InterfaceC5243g) obj2;
                kotlin.jvm.internal.h.e(acc2, "acc");
                kotlin.jvm.internal.h.e(element2, "element");
                InterfaceC5245i i = acc2.i(element2.getKey());
                C5246j c5246j = C5246j.f42241n;
                if (i == c5246j) {
                    return element2;
                }
                C5241e c5241e = C5241e.f42240n;
                InterfaceC5242f interfaceC5242f = (InterfaceC5242f) i.m(c5241e);
                if (interfaceC5242f == null) {
                    c5239c = new C5239c(element2, i);
                } else {
                    InterfaceC5245i i4 = i.i(c5241e);
                    if (i4 == c5246j) {
                        return new C5239c(interfaceC5242f, element2);
                    }
                    c5239c = new C5239c(interfaceC5242f, new C5239c(element2, i4));
                }
                return c5239c;
        }
    }
}
