package com.squareup.cash.formview.components;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormView$$ExternalSyntheticLambda12 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormView f$0;

    public /* synthetic */ FormView$$ExternalSyntheticLambda12(FormView formView, int i) {
        this.$r8$classId = i;
        this.f$0 = formView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        FormView formView = this.f$0;
        switch (i) {
            case 0:
                formView.maybeFocusFirstInputField();
                break;
            case 1:
                formView.getAnimationView().setVisibility(8);
                break;
            default:
                formView.maybeFocusFirstInputField();
                break;
        }
    }
}
