package n6;

import p6.C4840a;

/* renamed from: n6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4781g {
    static InterfaceC4781g a(C4840a c4840a) {
        Object obj;
        F2.b bVar = AbstractC4783i.f39668a;
        int i = 0;
        while (true) {
            Object[] objArr = c4840a.f39822a;
            if (i >= objArr.length) {
                obj = null;
                break;
            }
            if (objArr[i] == bVar) {
                obj = objArr[i + 1];
                break;
            }
            i += 2;
        }
        InterfaceC4781g interfaceC4781g = (InterfaceC4781g) obj;
        return interfaceC4781g == null ? C4780f.f39666b : interfaceC4781g;
    }
}
