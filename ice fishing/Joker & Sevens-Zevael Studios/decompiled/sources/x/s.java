package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7893a = ((float) 0.125d) / 18;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean a(r1.g gVar, long j3) {
        Object obj;
        ?? r62 = gVar.f5954a;
        int size = r62.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i10);
            if (r1.m.a(((r1.n) obj).f5963a, j3)) {
                break;
            }
            i10++;
        }
        r1.n nVar = (r1.n) obj;
        if (nVar != null && nVar.f5966d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
