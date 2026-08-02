package com.datadog.android.rum.internal.startup;

import com.datadog.android.rum.internal.domain.Time;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public interface RumStartupScenario {

    public final class Cold implements RumStartupScenario {
        public final WeakReference activity;
        public final long appStartActivityOnCreateGapNs;
        public final boolean hasSavedInstanceStateBundle;
        public final Time initialTime;

        public Cold(boolean z, WeakReference weakReference, long j, Time time) {
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.appStartActivityOnCreateGapNs = j;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final WeakReference getActivity() {
            return this.activity;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final Time getInitialTime() {
            return this.initialTime;
        }
    }

    public final class WarmAfterActivityDestroyed implements RumStartupScenario {
        public final WeakReference activity;
        public final boolean hasSavedInstanceStateBundle;
        public final Time initialTime;

        public WarmAfterActivityDestroyed(boolean z, WeakReference weakReference, Time time) {
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final WeakReference getActivity() {
            return this.activity;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final Time getInitialTime() {
            return this.initialTime;
        }
    }

    public final class WarmFirstActivity implements RumStartupScenario {
        public final WeakReference activity;
        public final long appStartActivityOnCreateGapNs;
        public final boolean hasSavedInstanceStateBundle;
        public final Time initialTime;

        public WarmFirstActivity(boolean z, WeakReference weakReference, long j, Time time) {
            this.hasSavedInstanceStateBundle = z;
            this.activity = weakReference;
            this.appStartActivityOnCreateGapNs = j;
            this.initialTime = time;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final WeakReference getActivity() {
            return this.activity;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        @Override // com.datadog.android.rum.internal.startup.RumStartupScenario
        public final Time getInitialTime() {
            return this.initialTime;
        }
    }

    WeakReference getActivity();

    boolean getHasSavedInstanceStateBundle();

    Time getInitialTime();
}
