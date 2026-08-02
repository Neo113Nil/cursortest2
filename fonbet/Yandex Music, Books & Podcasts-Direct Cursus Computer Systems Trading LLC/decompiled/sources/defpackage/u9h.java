package defpackage;

/* loaded from: classes3.dex */
public final class u9h {
    public static r9h a(Object obj, Object obj2) {
        r9h r9hVar = (r9h) obj;
        r9h r9hVar2 = (r9h) obj2;
        if (!r9hVar2.isEmpty()) {
            if (!r9hVar.a) {
                r9hVar = r9hVar.d();
            }
            r9hVar.c();
            if (!r9hVar2.isEmpty()) {
                r9hVar.putAll(r9hVar2);
            }
        }
        return r9hVar;
    }
}
