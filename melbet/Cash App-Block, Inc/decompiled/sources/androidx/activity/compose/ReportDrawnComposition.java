package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.squareup.cash.storage.RealStorage$temp$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class ReportDrawnComposition implements Function0 {
    public final RealStorage$temp$1 checkReporter;
    public final FullyDrawnReporter fullyDrawnReporter;
    public final Function0 predicate;
    public final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        boolean z;
        boolean z2;
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new ScrollState$$ExternalSyntheticLambda4(1));
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        RealStorage$temp$1 realStorage$temp$1 = new RealStorage$temp$1(1, this, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0, 1);
        this.checkReporter = realStorage$temp$1;
        synchronized (fullyDrawnReporter.lock) {
            if (fullyDrawnReporter.reportedFullyDrawn) {
                z = true;
            } else {
                fullyDrawnReporter.onReportCallbacks.add(this);
                z = false;
            }
        }
        if (z) {
            invoke();
        }
        synchronized (fullyDrawnReporter.lock) {
            z2 = fullyDrawnReporter.reportedFullyDrawn;
        }
        if (z2) {
            return;
        }
        synchronized (fullyDrawnReporter.lock) {
            if (!fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reporterCount++;
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        snapshotStateObserver.observeReads(function0, realStorage$temp$1, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(2, ref$BooleanRef, function0));
        if (ref$BooleanRef.element) {
            removeReporter();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        snapshotStateObserver.clear();
        snapshotStateObserver.stop();
        return Unit.INSTANCE;
    }

    public final void removeReporter() {
        boolean z;
        int i;
        this.snapshotStateObserver.clear(this.predicate);
        FullyDrawnReporter fullyDrawnReporter = this.fullyDrawnReporter;
        synchronized (fullyDrawnReporter.lock) {
            z = fullyDrawnReporter.reportedFullyDrawn;
        }
        if (!z) {
            FullyDrawnReporter fullyDrawnReporter2 = this.fullyDrawnReporter;
            synchronized (fullyDrawnReporter2.lock) {
                if (!fullyDrawnReporter2.reportedFullyDrawn && (i = fullyDrawnReporter2.reporterCount) > 0) {
                    int i2 = i - 1;
                    fullyDrawnReporter2.reporterCount = i2;
                    if (!fullyDrawnReporter2.reportPosted && i2 == 0) {
                        fullyDrawnReporter2.reportPosted = true;
                        fullyDrawnReporter2.executor.execute(fullyDrawnReporter2.reportRunnable);
                    }
                }
            }
        }
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        snapshotStateObserver.clear();
        snapshotStateObserver.stop();
    }
}
