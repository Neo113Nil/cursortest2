package defpackage;

import android.os.Handler;

/* loaded from: classes10.dex */
public interface uf10 {
    void addDrmEventListener(Handler handler, nmm nmmVar);

    void addEventListener(Handler handler, yf10 yf10Var);

    default boolean canUpdateMediaItem(fe10 fe10Var) {
        return false;
    }

    xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j);

    void disable(tf10 tf10Var);

    void enable(tf10 tf10Var);

    default a9z0 getInitialTimeline() {
        return null;
    }

    fe10 getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError();

    void prepareSource(tf10 tf10Var, cj01 cj01Var);

    void prepareSource(tf10 tf10Var, cj01 cj01Var, vyc0 vyc0Var);

    void releasePeriod(xe10 xe10Var);

    void releaseSource(tf10 tf10Var);

    void removeDrmEventListener(nmm nmmVar);

    void removeEventListener(yf10 yf10Var);

    default void updateMediaItem(fe10 fe10Var) {
    }
}
