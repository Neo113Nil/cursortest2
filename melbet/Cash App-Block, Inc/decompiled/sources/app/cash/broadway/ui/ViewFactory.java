package app.cash.broadway.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface ViewFactory extends UiFactory {

    /* loaded from: classes3.dex */
    public final class ScreenView {
        public final Ui ui;
        public final View view;

        public ScreenView(View view, Ui ui) {
            view.getClass();
            this.view = view;
            this.ui = ui;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenView)) {
                return false;
            }
            ScreenView screenView = (ScreenView) obj;
            return Intrinsics.areEqual(this.view, screenView.view) && Intrinsics.areEqual(this.ui, screenView.ui);
        }

        public final Ui getUi() {
            return this.ui;
        }

        public final View getView() {
            return this.view;
        }

        public final int hashCode() {
            int hashCode = this.view.hashCode() * 31;
            Ui ui = this.ui;
            return hashCode + (ui == null ? 0 : ui.hashCode());
        }

        public final String toString() {
            return "ScreenView(view=" + this.view + ", ui=" + this.ui + ")";
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    default UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        ScreenView createView = createView(screen, context, viewGroup);
        if (createView != null) {
            return new UiFactory.ViewUi(createView.getView(), createView.getUi());
        }
        return null;
    }

    ScreenView createView(Screen screen, Context context, ViewGroup viewGroup);
}
