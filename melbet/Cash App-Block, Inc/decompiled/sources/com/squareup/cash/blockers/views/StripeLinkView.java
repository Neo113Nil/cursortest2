package com.squareup.cash.blockers.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.compose.runtime.PausedCompositionImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewModel;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.stripe.real.RealStripeLinkActivityLauncher;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class StripeLinkView extends FrameLayout implements Ui, DialogResultListener {
    public Ui.EventReceiver eventReceiver;
    public boolean hasLaunched;
    public final RealStripeLinkActivityLauncher launcher;

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new PlaidLinkView.State.Creator(1);
        public final boolean hasLaunched;
        public final Parcelable superState;

        public State(Parcelable parcelable, boolean z) {
            this.superState = parcelable;
            this.hasLaunched = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.superState, state.superState) && this.hasLaunched == state.hasLaunched;
        }

        public final int hashCode() {
            Parcelable parcelable = this.superState;
            return Boolean.hashCode(this.hasLaunched) + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        public final String toString() {
            return "State(superState=" + this.superState + ", hasLaunched=" + this.hasLaunched + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.superState, i);
            parcel.writeInt(this.hasLaunched ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeLinkView(Context context, RealStripeLinkActivityLauncher realStripeLinkActivityLauncher) {
        super(context);
        context.getClass();
        this.launcher = realStripeLinkActivityLauncher;
        setId(R.id.blocker_stripe_link);
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
        new PausedCompositionImpl(this, null, null, null, 62).setLoading(true);
        ViewKt.whileAttachedOnce$default(this, new PlaidLinkView.AnonymousClass2(this, (Continuation) null, 8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.hasLaunched) {
            return;
        }
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(StripeLinkViewEvent.WaitingForParams.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (screen instanceof FailureMessageBlockerScreen) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(StripeLinkViewEvent.Dismiss.INSTANCE);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof State)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        State state = (State) parcelable;
        this.hasLaunched = state.hasLaunched;
        super.onRestoreInstanceState(state.superState);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new State(super.onSaveInstanceState(), this.hasLaunched);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(StripeLinkViewModel stripeLinkViewModel) {
        stripeLinkViewModel.getClass();
        if (stripeLinkViewModel.equals(StripeLinkViewModel.Loading.INSTANCE)) {
            return;
        }
        if (!(stripeLinkViewModel instanceof StripeLinkViewModel.Ready)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        this.launcher.tryLaunch(((StripeLinkViewModel.Ready) stripeLinkViewModel).params);
        this.hasLaunched = true;
    }
}
