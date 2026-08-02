package defpackage;

/* loaded from: classes.dex */
public final class w8g {
    public static sse a(long j, Object obj) {
        sse sseVar = (sse) emt.c.h(j, obj);
        if (((v8) sseVar).a) {
            return sseVar;
        }
        int size = sseVar.size();
        czm m = ((czm) sseVar).m(size == 0 ? 10 : size * 2);
        emt.o(j, obj, m);
        return m;
    }
}
