package app.cash.sqldelight;

/* loaded from: classes.dex */
public abstract class Query extends ExecutableQuery {

    public interface Listener {
        void queryResultsChanged();
    }

    public abstract void addListener(Listener listener);

    public abstract void removeListener(Listener listener);
}
