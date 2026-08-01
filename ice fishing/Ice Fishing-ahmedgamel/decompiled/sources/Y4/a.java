package Y4;

import com.onesignal.inAppMessages.internal.prompt.impl.b;

/* loaded from: classes2.dex */
public final class a {
    private b currentPrompt;
    private String inAppMessageIdShowing;
    private Long lastTimeInAppDismissed;
    private boolean paused;

    public final b getCurrentPrompt() {
        return this.currentPrompt;
    }

    public final String getInAppMessageIdShowing() {
        return this.inAppMessageIdShowing;
    }

    public final Long getLastTimeInAppDismissed() {
        return this.lastTimeInAppDismissed;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final void setCurrentPrompt(b bVar) {
        this.currentPrompt = bVar;
    }

    public final void setInAppMessageIdShowing(String str) {
        this.inAppMessageIdShowing = str;
    }

    public final void setLastTimeInAppDismissed(Long l9) {
        this.lastTimeInAppDismissed = l9;
    }

    public final void setPaused(boolean z3) {
        this.paused = z3;
    }
}
