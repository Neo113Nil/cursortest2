package v1;

import C1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f4497a = new j();

    @Override // v1.i
    public final i c(h hVar) {
        D1.i.e(hVar, "key");
        return this;
    }

    @Override // v1.i
    public final Object d(Object obj, p pVar) {
        return obj;
    }

    @Override // v1.i
    public final g e(h hVar) {
        D1.i.e(hVar, "key");
        return null;
    }

    @Override // v1.i
    public final i f(i iVar) {
        D1.i.e(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
