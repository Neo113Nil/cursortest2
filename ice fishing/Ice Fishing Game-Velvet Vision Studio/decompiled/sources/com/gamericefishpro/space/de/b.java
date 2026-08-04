package com.gamericefishpro.space.de;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private boolean prompted;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public enum a {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR;

        private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());

        public static com.gamericefishpro.space.wh.a getEntries() {
            return $ENTRIES;
        }
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(com.gamericefishpro.space.th.a aVar);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z) {
        this.prompted = z;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
