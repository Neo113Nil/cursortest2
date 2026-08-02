package app.cash.redwood.treehouse;

import com.fillr.m1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public interface ViewState {

    public final class Bound implements ViewState {
        public final TreehouseLayout view;

        public Bound(TreehouseLayout treehouseLayout) {
            treehouseLayout.getClass();
            this.view = treehouseLayout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bound) && Intrinsics.areEqual(this.view, ((Bound) obj).view);
        }

        public final int hashCode() {
            return this.view.hashCode();
        }

        public final String toString() {
            return "Bound(view=" + this.view + ")";
        }
    }

    public final class None implements ViewState {
        public static final None INSTANCE = new None();
    }

    public final class Preloading implements ViewState {
        public final m1 onBackPressedDispatcher;
        public final StateFlow uiConfiguration;

        public Preloading(m1 m1Var, StateFlowImpl stateFlowImpl) {
            m1Var.getClass();
            stateFlowImpl.getClass();
            this.onBackPressedDispatcher = m1Var;
            this.uiConfiguration = stateFlowImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preloading)) {
                return false;
            }
            Preloading preloading = (Preloading) obj;
            return Intrinsics.areEqual(this.onBackPressedDispatcher, preloading.onBackPressedDispatcher) && Intrinsics.areEqual(this.uiConfiguration, preloading.uiConfiguration);
        }

        public final int hashCode() {
            return this.uiConfiguration.hashCode() + (this.onBackPressedDispatcher.hashCode() * 31);
        }

        public final String toString() {
            return "Preloading(onBackPressedDispatcher=" + this.onBackPressedDispatcher + ", uiConfiguration=" + this.uiConfiguration + ")";
        }
    }
}
