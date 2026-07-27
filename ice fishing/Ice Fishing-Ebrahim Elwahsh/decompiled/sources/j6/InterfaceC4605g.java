package j6;

import T7.v;
import l6.C4694a;

/* renamed from: j6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4605g {
    static InterfaceC4605g a(C4694a c4694a) {
        Object obj;
        v vVar = AbstractC4607i.f38578a;
        int i = 0;
        while (true) {
            Object[] objArr = c4694a.f39055a;
            if (i >= objArr.length) {
                obj = null;
                break;
            }
            if (objArr[i] == vVar) {
                obj = objArr[i + 1];
                break;
            }
            i += 2;
        }
        InterfaceC4605g interfaceC4605g = (InterfaceC4605g) obj;
        return interfaceC4605g == null ? C4604f.f38576b : interfaceC4605g;
    }
}
