package com.onesignal.inAppMessages.internal.prompt.impl;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    private boolean prompted;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public enum a {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(fc.d dVar);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z10) {
        this.prompted = z10;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
