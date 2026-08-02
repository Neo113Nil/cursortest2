package defpackage;

/* loaded from: classes.dex */
public final class iyf {
    public static kyf a(lyf lyfVar) {
        lyfVar.getClass();
        int ordinal = lyfVar.ordinal();
        if (ordinal == 2) {
            return kyf.ON_DESTROY;
        }
        if (ordinal == 3) {
            return kyf.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return kyf.ON_PAUSE;
    }
}
