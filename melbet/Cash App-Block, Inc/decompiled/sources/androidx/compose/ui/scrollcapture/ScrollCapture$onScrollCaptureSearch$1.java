package androidx.compose.ui.scrollcapture;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.lifecycle.ViewModelKt;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollCapture$onScrollCaptureSearch$1(MutableVector mutableVector) {
        super(1, 8, MutableVector.class, mutableVector, "add", "add(Ljava/lang/Object;)Z");
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                ((MutableVector) this.receiver).add((ScrollCaptureCandidate) obj);
                break;
            case 1:
                ActivityFeedCallbackEvent$RefreshFeed activityFeedCallbackEvent$RefreshFeed = (ActivityFeedCallbackEvent$RefreshFeed) obj;
                activityFeedCallbackEvent$RefreshFeed.getClass();
                ((MutableSharedFlow) this.receiver).tryEmit(activityFeedCallbackEvent$RefreshFeed);
                break;
            case 2:
                obj.getClass();
                ((MutableScatterSet) this.receiver).add(obj);
                break;
            case 3:
                Category category = (Category) obj;
                category.getClass();
                NotificationSectionPresenter notificationSectionPresenter = (NotificationSectionPresenter) this.receiver;
                notificationSectionPresenter.openCategory(category, notificationSectionPresenter.accountToken);
                break;
            case 4:
                Category category2 = (Category) obj;
                category2.getClass();
                NotificationSectionPresenter notificationSectionPresenter2 = (NotificationSectionPresenter) this.receiver;
                notificationSectionPresenter2.openCategory(category2, notificationSectionPresenter2.accountToken);
                break;
            case 5:
                Category category3 = (Category) obj;
                category3.getClass();
                NotificationSectionPresenter notificationSectionPresenter3 = (NotificationSectionPresenter) this.receiver;
                notificationSectionPresenter3.openCategory(category3, notificationSectionPresenter3.accountToken);
                break;
            case 6:
                obj.getClass();
                ((MutableScatterSet) this.receiver).add(obj);
                break;
            case 7:
                String str = (String) obj;
                str.getClass();
                AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) this.receiver;
                accountPickerViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(accountPickerViewModel), null, null, new TimerWorker$run$1(accountPickerViewModel, str, continuation, 28), 3);
                break;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                ConsentViewModel consentViewModel = (ConsentViewModel) this.receiver;
                consentViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(consentViewModel), null, null, new TimerWorker$run$1(consentViewModel, str2, continuation, 29), 3);
                break;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) this.receiver;
                linkAccountPickerViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(linkAccountPickerViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(linkAccountPickerViewModel, str3, continuation, 2), 3);
                break;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.receiver;
                networkingLinkSignupViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(networkingLinkSignupViewModel), null, null, new InquiryViewModel.AnonymousClass1(networkingLinkSignupViewModel, str4, continuation, 8), 3);
                break;
            default:
                String str5 = (String) obj;
                str5.getClass();
                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) this.receiver;
                partnerAuthViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(partnerAuthViewModel), null, null, new InquiryViewModel.AnonymousClass1(partnerAuthViewModel, str5, continuation, 10), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollCapture$onScrollCaptureSearch$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
