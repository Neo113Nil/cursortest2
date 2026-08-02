package x;

import java.util.ArrayList;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5173l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5177p f41786a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f41787b;

    public static long a(C5167f c5167f, long j6) {
        AbstractC5177p abstractC5177p = c5167f.f41775d;
        if (abstractC5177p instanceof C5171j) {
            return j6;
        }
        ArrayList arrayList = c5167f.f41781k;
        int size = arrayList.size();
        long j9 = j6;
        for (int i = 0; i < size; i++) {
            InterfaceC5165d interfaceC5165d = (InterfaceC5165d) arrayList.get(i);
            if (interfaceC5165d instanceof C5167f) {
                C5167f c5167f2 = (C5167f) interfaceC5165d;
                if (c5167f2.f41775d != abstractC5177p) {
                    j9 = Math.min(j9, a(c5167f2, c5167f2.f41777f + j6));
                }
            }
        }
        if (c5167f != abstractC5177p.i) {
            return j9;
        }
        long j10 = abstractC5177p.j();
        long j11 = j6 - j10;
        return Math.min(Math.min(j9, a(abstractC5177p.f41803h, j11)), j11 - r9.f41777f);
    }

    public static long b(C5167f c5167f, long j6) {
        AbstractC5177p abstractC5177p = c5167f.f41775d;
        if (abstractC5177p instanceof C5171j) {
            return j6;
        }
        ArrayList arrayList = c5167f.f41781k;
        int size = arrayList.size();
        long j9 = j6;
        for (int i = 0; i < size; i++) {
            InterfaceC5165d interfaceC5165d = (InterfaceC5165d) arrayList.get(i);
            if (interfaceC5165d instanceof C5167f) {
                C5167f c5167f2 = (C5167f) interfaceC5165d;
                if (c5167f2.f41775d != abstractC5177p) {
                    j9 = Math.max(j9, b(c5167f2, c5167f2.f41777f + j6));
                }
            }
        }
        if (c5167f != abstractC5177p.f41803h) {
            return j9;
        }
        long j10 = abstractC5177p.j();
        long j11 = j6 + j10;
        return Math.max(Math.max(j9, b(abstractC5177p.i, j11)), j11 - r9.f41777f);
    }
}
