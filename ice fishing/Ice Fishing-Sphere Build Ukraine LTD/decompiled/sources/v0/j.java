package v0;

import D0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f3014e = new j();

    @Override // v0.i
    public final i f(i iVar) {
        E0.i.e(iVar, "context");
        return iVar;
    }

    @Override // v0.i
    public final i g(h hVar) {
        E0.i.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // v0.i
    public final g i(h hVar) {
        E0.i.e(hVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // v0.i
    public final Object m(Object obj, p pVar) {
        return obj;
    }
}
