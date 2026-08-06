package androidx.lifecycle;

/* loaded from: classes.dex */
public final class b {
    public static d a(e state) {
        kotlin.jvm.internal.i.e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return d.ON_CREATE;
        }
        if (ordinal == 2) {
            return d.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return d.ON_RESUME;
    }
}
