package com.squareup.cash.securitysignals.backend;

import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.ui.MainActivity;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealScreenRecordingDetector {
    public final StateFlowImpl _screenIsBeingRecorded = FlowKt.MutableStateFlow(null);
    public final MainActivity activity;

    public RealScreenRecordingDetector(MainActivity mainActivity) {
        this.activity = mainActivity;
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector$observer$1
            public final RealScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0 callback;

            {
                this.callback = new RealScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0(RealScreenRecordingDetector.this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(LifecycleOwner lifecycleOwner) {
                RealScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0 realScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0 = this.callback;
                RealScreenRecordingDetector realScreenRecordingDetector = RealScreenRecordingDetector.this;
                MainActivity mainActivity2 = realScreenRecordingDetector.activity;
                try {
                    realScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0.accept(Integer.valueOf(mainActivity2.getWindowManager().addScreenRecordingCallback(mainActivity2.getMainExecutor(), realScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0)));
                } catch (NullPointerException e) {
                    SecurityError securityError = new SecurityError(e);
                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter == null) {
                        throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                    }
                    errorReporter.report(securityError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    StateFlowImpl stateFlowImpl = realScreenRecordingDetector._screenIsBeingRecorded;
                    Boolean bool = Boolean.FALSE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(LifecycleOwner lifecycleOwner) {
                try {
                    RealScreenRecordingDetector.this.activity.getWindowManager().removeScreenRecordingCallback(this.callback);
                } catch (NullPointerException e) {
                    SecurityError securityError = new SecurityError(e);
                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter == null) {
                        throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                    }
                    errorReporter.report(securityError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 35) {
            mainActivity.getLifecycle().addObserver(defaultLifecycleObserver);
        }
    }
}
