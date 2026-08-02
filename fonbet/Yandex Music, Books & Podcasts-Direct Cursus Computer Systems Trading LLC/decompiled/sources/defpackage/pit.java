package defpackage;

/* loaded from: classes3.dex */
public final class pit extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public pit() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
