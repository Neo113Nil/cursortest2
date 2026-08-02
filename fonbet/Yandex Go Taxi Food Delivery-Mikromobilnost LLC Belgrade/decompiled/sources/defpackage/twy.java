package defpackage;

/* loaded from: classes10.dex */
public interface twy {
    rwy getFallbackSelectionFor(qwy qwyVar, swy swyVar);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(swy swyVar);

    default void onLoadTaskConcluded(long j) {
    }
}
