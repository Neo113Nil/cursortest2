package n6;

import L3.v;
import p6.C4840a;

/* renamed from: n6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4765g {
    static InterfaceC4765g a(C4840a c4840a) {
        Object obj;
        v vVar = AbstractC4767i.f39501a;
        int i = 0;
        while (true) {
            Object[] objArr = c4840a.f39772a;
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
        InterfaceC4765g interfaceC4765g = (InterfaceC4765g) obj;
        return interfaceC4765g == null ? C4764f.f39499b : interfaceC4765g;
    }
}
