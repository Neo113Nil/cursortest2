package f;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f121a = new d(null);

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f120a;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof e;
    }
}
