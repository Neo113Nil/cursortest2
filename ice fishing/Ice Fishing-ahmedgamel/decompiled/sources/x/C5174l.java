package x;

import java.util.ArrayList;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5174l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5178p f41731a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f41732b;

    public static long a(C5168f c5168f, long j6) {
        AbstractC5178p abstractC5178p = c5168f.f41720d;
        if (abstractC5178p instanceof C5172j) {
            return j6;
        }
        ArrayList arrayList = c5168f.f41726k;
        int size = arrayList.size();
        long j9 = j6;
        for (int i = 0; i < size; i++) {
            InterfaceC5166d interfaceC5166d = (InterfaceC5166d) arrayList.get(i);
            if (interfaceC5166d instanceof C5168f) {
                C5168f c5168f2 = (C5168f) interfaceC5166d;
                if (c5168f2.f41720d != abstractC5178p) {
                    j9 = Math.min(j9, a(c5168f2, c5168f2.f41722f + j6));
                }
            }
        }
        if (c5168f != abstractC5178p.i) {
            return j9;
        }
        long j10 = abstractC5178p.j();
        long j11 = j6 - j10;
        return Math.min(Math.min(j9, a(abstractC5178p.f41748h, j11)), j11 - r9.f41722f);
    }

    public static long b(C5168f c5168f, long j6) {
        AbstractC5178p abstractC5178p = c5168f.f41720d;
        if (abstractC5178p instanceof C5172j) {
            return j6;
        }
        ArrayList arrayList = c5168f.f41726k;
        int size = arrayList.size();
        long j9 = j6;
        for (int i = 0; i < size; i++) {
            InterfaceC5166d interfaceC5166d = (InterfaceC5166d) arrayList.get(i);
            if (interfaceC5166d instanceof C5168f) {
                C5168f c5168f2 = (C5168f) interfaceC5166d;
                if (c5168f2.f41720d != abstractC5178p) {
                    j9 = Math.max(j9, b(c5168f2, c5168f2.f41722f + j6));
                }
            }
        }
        if (c5168f != abstractC5178p.f41748h) {
            return j9;
        }
        long j10 = abstractC5178p.j();
        long j11 = j6 + j10;
        return Math.max(Math.max(j9, b(abstractC5178p.i, j11)), j11 - r9.f41722f);
    }
}
