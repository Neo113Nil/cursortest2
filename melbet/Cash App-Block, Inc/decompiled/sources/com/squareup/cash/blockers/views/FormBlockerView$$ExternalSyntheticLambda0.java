package com.squareup.cash.blockers.views;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.ui.OnBackListener;

/* loaded from: classes7.dex */
public final /* synthetic */ class FormBlockerView$$ExternalSyntheticLambda0 implements OnBackListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FormBlockerView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Ui.EventReceiver) obj).sendEvent(FormViewEvent.GoBack.INSTANCE);
                break;
            default:
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) obj;
                chooseReactionOverlay.goToStateAnimator(ChooseReactionOverlay.State.AnimatingClosed).start();
                chooseReactionOverlay.onDismiss.invoke();
                break;
        }
        return true;
    }
}
