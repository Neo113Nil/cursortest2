package defpackage;

/* loaded from: classes.dex */
public final class v9h {
    public static p9h a(Object obj, Object obj2) {
        p9h p9hVar = (p9h) obj;
        p9h p9hVar2 = (p9h) obj2;
        if (!p9hVar2.isEmpty()) {
            if (!p9hVar.a) {
                p9hVar = p9hVar.d();
            }
            p9hVar.c();
            if (!p9hVar2.isEmpty()) {
                p9hVar.putAll(p9hVar2);
            }
        }
        return p9hVar;
    }
}
