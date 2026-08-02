package io.appmetrica.analytics;

import android.os.Bundle;
import android.view.KeyEvent;
import io.appmetrica.analytics.MviMetricsReporter;
import java.util.Set;

/* loaded from: classes9.dex */
public interface MviEventsReporter {
    void confirmReporting(MviScreen mviScreen);

    void confirmReporting(MviScreen mviScreen, Set<String> set);

    void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType);

    void onCreate(MviScreen mviScreen, Bundle bundle, MviTimestamp mviTimestamp, MviMetricsReporter.StartupType startupType, boolean z);

    void onDestroy(MviScreen mviScreen);

    void onFirstFrameDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp);

    void onFullyDrawn(MviScreen mviScreen, MviTimestamp mviTimestamp);

    void onKeyEvent(MviScreen mviScreen, KeyEvent keyEvent);

    void onStart(MviScreen mviScreen, MviTimestamp mviTimestamp);

    void onStop(MviScreen mviScreen);

    void onTouchEvent(MviScreen mviScreen, MviTouchEvent mviTouchEvent);
}
