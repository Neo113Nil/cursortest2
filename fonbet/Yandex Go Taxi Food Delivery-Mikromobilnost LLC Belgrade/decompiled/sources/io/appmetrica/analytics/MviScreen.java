package io.appmetrica.analytics;

import android.app.Activity;

/* loaded from: classes9.dex */
public interface MviScreen {

    public static class MviScreenActivity implements MviScreen {
        private final Class a;
        private final int b;

        public MviScreenActivity(Activity activity) {
            this.a = activity.getClass();
            this.b = System.identityHashCode(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MviScreenActivity mviScreenActivity = (MviScreenActivity) obj;
                if (this.b == mviScreenActivity.b && this.a.equals(mviScreenActivity.a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.appmetrica.analytics.MviScreen
        public String getName() {
            return this.a.getSimpleName();
        }

        public int hashCode() {
            return this.b;
        }
    }

    String getName();
}
