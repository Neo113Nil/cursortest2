package app.cash.broadway.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface UiFactory {

    public final class ComposeUi implements ScreenUi {
        public final Function4 content;

        public ComposeUi(Function4 function4) {
            function4.getClass();
            this.content = function4;
        }
    }

    public interface ScreenUi {
    }

    public final class ViewUi implements ScreenUi {
        public final Ui ui;
        public final View view;

        public ViewUi(View view, Ui ui) {
            view.getClass();
            this.view = view;
            this.ui = ui;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewUi)) {
                return false;
            }
            ViewUi viewUi = (ViewUi) obj;
            return Intrinsics.areEqual(this.view, viewUi.view) && Intrinsics.areEqual(this.ui, viewUi.ui);
        }

        public final int hashCode() {
            int hashCode = this.view.hashCode() * 31;
            Ui ui = this.ui;
            return hashCode + (ui == null ? 0 : ui.hashCode());
        }

        public final String toString() {
            return "ViewUi(view=" + this.view + ", ui=" + this.ui + ")";
        }
    }

    ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup);

    public final class LegacySheetComposeUi implements ScreenUi {
        public final Config config;
        public final ComposableLambdaImpl content;

        /* loaded from: classes3.dex */
        public final class Config {
            public final boolean consumeInsetsBeforeSheet;
            public final boolean isLocked;
            public final boolean outsideTapCloses;

            public Config(int i) {
                boolean z = (i & 1) == 0;
                boolean z2 = (i & 4) == 0;
                boolean z3 = (i & 16) != 0;
                this.consumeInsetsBeforeSheet = z;
                this.isLocked = z2;
                this.outsideTapCloses = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Config)) {
                    return false;
                }
                Config config = (Config) obj;
                return this.consumeInsetsBeforeSheet == config.consumeInsetsBeforeSheet && this.isLocked == config.isLocked && this.outsideTapCloses == config.outsideTapCloses;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.outsideTapCloses) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.consumeInsetsBeforeSheet) * 961, 961, this.isLocked);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Config(consumeInsetsBeforeSheet=", ", initialHeightPx=null, isLocked=", ", minDragDistanceToChangeStatePx=null, outsideTapCloses=", this.consumeInsetsBeforeSheet, this.isLocked), this.outsideTapCloses, ")");
            }
        }

        public /* synthetic */ LegacySheetComposeUi(ComposableLambdaImpl composableLambdaImpl) {
            this(new Config(31), composableLambdaImpl);
        }

        public LegacySheetComposeUi(Config config, ComposableLambdaImpl composableLambdaImpl) {
            this.config = config;
            this.content = composableLambdaImpl;
        }
    }
}
