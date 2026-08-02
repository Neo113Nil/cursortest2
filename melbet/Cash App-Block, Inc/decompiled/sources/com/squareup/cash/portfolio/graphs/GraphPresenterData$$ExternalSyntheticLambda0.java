package com.squareup.cash.portfolio.graphs;

import android.view.ViewGroup;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.view.OneShotPreDrawListener;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.BasicGovIdReviewCaptureViewController;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GraphPresenterData$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ GraphPresenterData$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                return BaselineShiftKt.formattedTime(((GraphPresenterData) obj3).range, this.f$1, TimeUnit.MILLISECONDS, (AndroidClock) obj2, (AndroidDateFormatManager) obj);
            default:
                Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = (Pi2GovernmentidReviewBinding) obj3;
                BasicGovIdReviewCaptureViewController basicGovIdReviewCaptureViewController = (BasicGovIdReviewCaptureViewController) obj2;
                Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding2 = basicGovIdReviewCaptureViewController.binding;
                StyleElements.Axis axis = (StyleElements.Axis) obj;
                PersonaMaterialButton personaMaterialButton = pi2GovernmentidReviewBinding.acceptButton;
                Flow flow = pi2GovernmentidReviewBinding.flowLayout;
                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidReviewBinding.retryButton;
                boolean z = (personaMaterialButton.getLineCount() == 0 || personaMaterialButton2.getLineCount() == 0) ? false : true;
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f$1;
                boolean z2 = currentTimeMillis - j > 300;
                if (!z && !z2) {
                    ah.addOneShotPreDrawListenerAndDiscardFrame(pi2GovernmentidReviewBinding2.acceptButton, new GraphPresenterData$$ExternalSyntheticLambda0(pi2GovernmentidReviewBinding2, basicGovIdReviewCaptureViewController, j, axis, 1));
                    return Unit.INSTANCE;
                }
                if (z && (personaMaterialButton.getLineCount() > 1 || personaMaterialButton2.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
                    ViewGroup.LayoutParams layoutParams = personaMaterialButton.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = flow.getWidth();
                        personaMaterialButton.setLayoutParams(layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = personaMaterialButton2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = flow.getWidth();
                            personaMaterialButton2.setLayoutParams(layoutParams2);
                            flow.setReferencedIds(new int[]{personaMaterialButton.getId(), personaMaterialButton2.getId()});
                            pi2GovernmentidReviewBinding2.navigationBar.setAccessibilityTraversalAfter(R.id.retry_button);
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    return null;
                }
                OneShotPreDrawListener.add(personaMaterialButton, new Task$$ExternalSyntheticLambda0(basicGovIdReviewCaptureViewController, 9));
                return Unit.INSTANCE;
        }
    }
}
