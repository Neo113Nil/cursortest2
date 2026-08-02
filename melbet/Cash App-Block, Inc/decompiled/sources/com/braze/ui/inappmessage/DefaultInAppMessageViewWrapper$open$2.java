package com.braze.ui.inappmessage;

import android.view.View;
import android.view.ViewGroup;
import bo.app.q4$$ExternalSyntheticLambda0;
import bo.app.xf$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$2", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapper$open$2 implements View.OnLayoutChangeListener {
    final /* synthetic */ ViewGroup $parentViewGroup;
    final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

    public DefaultInAppMessageViewWrapper$open$2(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        this.$parentViewGroup = viewGroup;
        this.this$0 = defaultInAppMessageViewWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLayoutChange$lambda$0(int i, int i2) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i - i2, "Detected (bottom - top) of ", " in OnLayoutChangeListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChange$lambda$1(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, ViewGroup viewGroup) {
        defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(viewGroup, defaultInAppMessageViewWrapper.getInAppMessage(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.getClass();
        this.$parentViewGroup.removeOnLayoutChangeListener(this);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(bottom, top, 5), 7, (Object) null);
        this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
        ViewGroup viewGroup = this.$parentViewGroup;
        viewGroup.post(new q4$$ExternalSyntheticLambda0(14, this.this$0, viewGroup));
    }
}
