package com.squareup.cash.performance;

import android.provider.Settings;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.ui.MainActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class JankStatsAggregator$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JankStatsAggregator this$0;

    public /* synthetic */ JankStatsAggregator$1$1(JankStatsAggregator jankStatsAggregator, int i) {
        this.$r8$classId = i;
        this.this$0 = jankStatsAggregator;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Screen screen;
        int i = this.$r8$classId;
        JankStatsAggregator jankStatsAggregator = this.this$0;
        switch (i) {
            case 0:
                NavigationModel navigationModel = (NavigationModel) obj;
                NavigationModel.Ready ready = navigationModel instanceof NavigationModel.Ready ? (NavigationModel.Ready) navigationModel : null;
                if (ready != null && (screen = ready.fullScreen.screen) != null) {
                    jankStatsAggregator.previousScreenName = jankStatsAggregator.currentScreenName;
                    jankStatsAggregator.currentScreenId = System.identityHashCode(screen);
                    jankStatsAggregator.currentScreenName = screen.toString();
                    jankStatsAggregator.lastScreenTransitionTime = System.currentTimeMillis();
                }
                break;
            case 1:
                MainActivity mainActivity = jankStatsAggregator.activity;
                if (Settings.canDrawOverlays(mainActivity)) {
                    JankStatsAggregator.access$startOrStopJankStatsMonitoring(jankStatsAggregator, mainActivity, jankStatsAggregator.fpsCounterOverlayEnabled);
                } else {
                    jankStatsAggregator.alreadyRejectedOverlayPermission = true;
                }
                break;
            case 2:
                MainActivity mainActivity2 = jankStatsAggregator.activity;
                int ordinal = ((ActivityEvent) obj).ordinal();
                if (ordinal == 2) {
                    jankStatsAggregator.startMonitoring(mainActivity2);
                } else if (ordinal == 3) {
                    JankStatsAggregator.access$startOrStopJankStatsMonitoring(jankStatsAggregator, mainActivity2, false);
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jankStatsAggregator.fpsCounterOverlayEnabled = booleanValue;
                MainActivity mainActivity3 = jankStatsAggregator.activity;
                if (booleanValue) {
                    jankStatsAggregator.startMonitoring(mainActivity3);
                } else if (booleanValue) {
                    jankStatsAggregator.startOverlay(mainActivity3);
                } else {
                    try {
                        mainActivity3.unbindService(jankStatsAggregator.connection);
                    } catch (IllegalArgumentException unused) {
                    }
                    StandaloneCoroutine standaloneCoroutine = jankStatsAggregator.monitor;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    jankStatsAggregator.monitor = null;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
