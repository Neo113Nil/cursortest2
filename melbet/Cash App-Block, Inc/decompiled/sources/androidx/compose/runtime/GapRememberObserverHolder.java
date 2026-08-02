package androidx.compose.runtime;

/* loaded from: classes.dex */
public class GapRememberObserverHolder implements RememberObserverHolder {
    public final int afterGroupIndex;
    public final RememberObserver wrapped;

    public GapRememberObserverHolder(RememberObserver rememberObserver, int i) {
        this.wrapped = rememberObserver;
        this.afterGroupIndex = i;
    }
}
