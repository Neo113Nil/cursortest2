package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxRealm extends RuntimeException {
    public CatchingFishReduxRealm() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
