package app.cash.redwood.treehouse;

/* loaded from: classes.dex */
public interface CodeSession$Listener {
    void onStop(ZiplineCodeSession ziplineCodeSession);

    void onUncaughtException(ZiplineCodeSession ziplineCodeSession, Throwable th);
}
