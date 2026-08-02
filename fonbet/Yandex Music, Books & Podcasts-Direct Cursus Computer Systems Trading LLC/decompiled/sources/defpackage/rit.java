package defpackage;

/* loaded from: classes.dex */
public class rit extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public rit() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
