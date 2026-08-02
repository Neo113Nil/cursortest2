package com.squareup.cash.blockers.scenarioplan.viewmodels;

/* loaded from: classes4.dex */
public abstract class ScenarioPlanLoadingViewModel {

    public final class Loaded extends ScenarioPlanLoadingViewModel {
        public static final Loaded INSTANCE = new Loaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loaded);
        }

        public final int hashCode() {
            return 1120236901;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    public final class Loading extends ScenarioPlanLoadingViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 367609820;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
