package defpackage;

/* loaded from: classes3.dex */
public final class v8g {
    public static rse a(long j, Object obj) {
        rse rseVar = (rse) dmt.c.k(j, obj);
        if (((u8) rseVar).a) {
            return rseVar;
        }
        int size = rseVar.size();
        rse b = rseVar.b(size == 0 ? 10 : size * 2);
        dmt.p(j, obj, b);
        return b;
    }
}
