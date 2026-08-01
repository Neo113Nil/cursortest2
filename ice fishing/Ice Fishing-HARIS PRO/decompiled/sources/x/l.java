package x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f4697a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4698b;

    public static long a(C0371f c0371f, long j) {
        o oVar = c0371f.f4688d;
        if (oVar instanceof C0375j) {
            return j;
        }
        ArrayList arrayList = c0371f.f4692k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0369d interfaceC0369d = (InterfaceC0369d) arrayList.get(i);
            if (interfaceC0369d instanceof C0371f) {
                C0371f c0371f2 = (C0371f) interfaceC0369d;
                if (c0371f2.f4688d != oVar) {
                    j2 = Math.min(j2, a(c0371f2, c0371f2.f4689f + j));
                }
            }
        }
        if (c0371f != oVar.i) {
            return j2;
        }
        long j3 = oVar.j();
        long j4 = j - j3;
        return Math.min(Math.min(j2, a(oVar.f4712h, j4)), j4 - r9.f4689f);
    }

    public static long b(C0371f c0371f, long j) {
        o oVar = c0371f.f4688d;
        if (oVar instanceof C0375j) {
            return j;
        }
        ArrayList arrayList = c0371f.f4692k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0369d interfaceC0369d = (InterfaceC0369d) arrayList.get(i);
            if (interfaceC0369d instanceof C0371f) {
                C0371f c0371f2 = (C0371f) interfaceC0369d;
                if (c0371f2.f4688d != oVar) {
                    j2 = Math.max(j2, b(c0371f2, c0371f2.f4689f + j));
                }
            }
        }
        if (c0371f != oVar.f4712h) {
            return j2;
        }
        long j3 = oVar.j();
        long j4 = j + j3;
        return Math.max(Math.max(j2, b(oVar.i, j4)), j4 - r9.f4689f);
    }
}
