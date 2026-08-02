package com.squareup.cash.profile.presenters.notifications;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.local.backend.CartBuilder;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.primitives.BrandSpotSyncTokens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewPushDisabledAlert;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.CategoryListViewEvent;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CategoryListPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $category$delegate;
    public final /* synthetic */ MutableState $currentIsGroupDisabled$delegate;
    public final /* synthetic */ Object $event;
    public final /* synthetic */ State $isLoading$delegate;
    public final /* synthetic */ Object $ownerAccountToken;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $showPermissionsDialog$delegate;
    public final /* synthetic */ State $versions$delegate;
    public Object L$0;
    public Object L$1;
    public MutableState L$2;
    public MutableState L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListPresenter$models$2$2(Flow flow, Continuation continuation, LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter, CartBuilder cartBuilder, BrandSpotSyncTokens brandSpotSyncTokens, State state, State state2, State state3, State state4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        super(2, continuation);
        this.this$0 = flow;
        this.L$1 = localBrandLocationMenuPresenter;
        this.$event = cartBuilder;
        this.$showPermissionsDialog$delegate = brandSpotSyncTokens;
        this.$isLoading$delegate = state;
        this.$versions$delegate = state2;
        this.L$4 = state3;
        this.$ownerAccountToken = state4;
        this.L$2 = mutableState;
        this.L$3 = mutableState2;
        this.$category$delegate = mutableState3;
        this.$currentIsGroupDisabled$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$ownerAccountToken;
        Object obj3 = this.$showPermissionsDialog$delegate;
        Object obj4 = this.$event;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) this.$isLoading$delegate;
                MutableState mutableState2 = (MutableState) this.$versions$delegate;
                return new CategoryListPresenter$models$2$2(this.$category$delegate, (PaymentLoadingPresenter) obj5, (String) obj2, (CategoryListViewEvent) obj4, this.$currentIsGroupDisabled$delegate, (MutableState) obj3, mutableState, mutableState2, continuation);
            default:
                CategoryListPresenter$models$2$2 categoryListPresenter$models$2$2 = new CategoryListPresenter$models$2$2((Flow) obj5, continuation, (LocalBrandLocationMenuPresenter) this.L$1, (CartBuilder) obj4, (BrandSpotSyncTokens) obj3, this.$isLoading$delegate, this.$versions$delegate, (State) this.L$4, (State) obj2, this.L$2, this.L$3, this.$category$delegate, this.$currentIsGroupDisabled$delegate);
                categoryListPresenter$models$2$2.L$0 = obj;
                return categoryListPresenter$models$2$2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CategoryListPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList;
        Object access$sendParentCategoryToggleUpdate;
        CoroutineSingletons coroutineSingletons2;
        PaymentLoadingPresenter paymentLoadingPresenter;
        Category category;
        CategoryListViewEvent categoryListViewEvent;
        MutableState mutableState2;
        List list;
        int i = this.$r8$classId;
        Object obj2 = this.$ownerAccountToken;
        Object obj3 = this.$showPermissionsDialog$delegate;
        Object obj4 = this.$event;
        Object obj5 = this.this$0;
        boolean z2 = true;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = this.$category$delegate;
                    Category category2 = (Category) mutableState.getValue();
                    if (category2 != null) {
                        PaymentLoadingPresenter paymentLoadingPresenter2 = (PaymentLoadingPresenter) obj5;
                        Analytics analytics = (Analytics) paymentLoadingPresenter2.analytics;
                        String str = (String) obj2;
                        CategoryListViewEvent categoryListViewEvent2 = (CategoryListViewEvent) obj4;
                        MutableState mutableState3 = (MutableState) obj3;
                        MutableState mutableState4 = (MutableState) this.$isLoading$delegate;
                        MutableState mutableState5 = (MutableState) this.$versions$delegate;
                        ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) paymentLoadingPresenter2.flowToken;
                        CategoryListType categoryListType = categoryListScreen.categoryListType;
                        CategoryListType categoryListType2 = categoryListScreen.categoryListType;
                        String categoryListSettingsPage = zzaky.getCategoryListSettingsPage(categoryListType);
                        CategoryListViewEvent.ParentToggleClicked parentToggleClicked = (CategoryListViewEvent.ParentToggleClicked) categoryListViewEvent2;
                        boolean z3 = parentToggleClicked.toggledValue;
                        boolean z4 = parentToggleClicked.toggledValue;
                        zzaky.trackChangeNotificationSettingToggle(analytics, str, categoryListSettingsPage, z3, null);
                        boolean check = ((AndroidPermissionManager) paymentLoadingPresenter2.observabilityManager).create("android.permission.POST_NOTIFICATIONS").$readonly.check();
                        List list2 = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
                        Category.CategoryType categoryType = category2.categoryType;
                        Category.CategoryType.CategoryList categoryList = categoryType instanceof Category.CategoryType.CategoryList ? (Category.CategoryType.CategoryList) categoryType : null;
                        if (categoryList == null || (list = categoryList.children) == null) {
                            z = check;
                            coroutineSingletons = coroutineSingletons3;
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                boolean z5 = check;
                                Object next = it.next();
                                Iterator it2 = it;
                                Category.CategoryType categoryType2 = ((Category) next).categoryType;
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                                if ((categoryType2 instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType2 : null) != null) {
                                    arrayList.add(next);
                                }
                                check = z5;
                                it = it2;
                                coroutineSingletons3 = coroutineSingletons4;
                            }
                            z = check;
                            coroutineSingletons = coroutineSingletons3;
                        }
                        if (arrayList != null) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(((Category.CategoryType.ChannelList) ((Category) it3.next()).categoryType).channels, 1), new OpenSourceKt$$ExternalSyntheticLambda8(4)));
                                while (filteringSequence$iterator$1.hasNext()) {
                                    if (ProfileNotificationsHelperKt.canToggle((Channel) filteringSequence$iterator$1.next(), z4)) {
                                        mutableState.setValue(PaymentLoadingPresenter.access$updateParentToggleState(paymentLoadingPresenter2, category2, z4));
                                        mutableState4.setValue(Boolean.TRUE);
                                        boolean z6 = parentToggleClicked.toggledValue;
                                        boolean z7 = (z && z6) ? false : true;
                                        String str2 = (categoryListType2 != CategoryListType.INVESTING || categoryListType2 == CategoryListType.ACTIVITY) ? str : null;
                                        Map map = (Map) mutableState5.getValue();
                                        this.L$0 = paymentLoadingPresenter2;
                                        this.L$1 = categoryListViewEvent2;
                                        this.L$2 = mutableState;
                                        this.L$3 = mutableState4;
                                        this.L$4 = category2;
                                        z2 = true;
                                        this.label = 1;
                                        access$sendParentCategoryToggleUpdate = PaymentLoadingPresenter.access$sendParentCategoryToggleUpdate(paymentLoadingPresenter2, category2, z6, str2, z7, map, this);
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (access$sendParentCategoryToggleUpdate != coroutineSingletons2) {
                                            break;
                                        } else {
                                            paymentLoadingPresenter = paymentLoadingPresenter2;
                                            category = category2;
                                            categoryListViewEvent = categoryListViewEvent2;
                                            mutableState2 = mutableState4;
                                        }
                                    }
                                }
                            }
                        }
                        if (paymentLoadingPresenter2.isRequest && z4 && (!z || ((Boolean) this.$currentIsGroupDisabled$delegate.getValue()).booleanValue())) {
                            analytics.track(new NotificationsSettingsViewPushDisabledAlert(str, zzaky.getCategoryListSettingsPage(categoryListType2)), null);
                            mutableState3.setValue(Boolean.TRUE);
                            break;
                        }
                        mutableState.setValue(PaymentLoadingPresenter.access$updateParentToggleState(paymentLoadingPresenter2, category2, z4));
                        mutableState4.setValue(Boolean.TRUE);
                        boolean z62 = parentToggleClicked.toggledValue;
                        if (z) {
                        }
                        if (categoryListType2 != CategoryListType.INVESTING) {
                        }
                        Map map2 = (Map) mutableState5.getValue();
                        this.L$0 = paymentLoadingPresenter2;
                        this.L$1 = categoryListViewEvent2;
                        this.L$2 = mutableState;
                        this.L$3 = mutableState4;
                        this.L$4 = category2;
                        z2 = true;
                        this.label = 1;
                        access$sendParentCategoryToggleUpdate = PaymentLoadingPresenter.access$sendParentCategoryToggleUpdate(paymentLoadingPresenter2, category2, z62, str2, z7, map2, this);
                        coroutineSingletons2 = coroutineSingletons;
                        if (access$sendParentCategoryToggleUpdate != coroutineSingletons2) {
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    category = (Category) this.L$4;
                    mutableState2 = this.L$3;
                    MutableState mutableState6 = this.L$2;
                    categoryListViewEvent = (CategoryListViewEvent) this.L$1;
                    paymentLoadingPresenter = (PaymentLoadingPresenter) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState6;
                    access$sendParentCategoryToggleUpdate = obj;
                }
                if (!((Boolean) access$sendParentCategoryToggleUpdate).booleanValue()) {
                    mutableState.setValue(PaymentLoadingPresenter.access$updateParentToggleState(paymentLoadingPresenter, category, ((CategoryListViewEvent.ParentToggleClicked) categoryListViewEvent).toggledValue ^ z2));
                }
                mutableState2.setValue(Boolean.FALSE);
                break;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 paymentConfigurationPresenter$models$$inlined$CollectEffect$1$1 = new PaymentConfigurationPresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (LocalBrandLocationMenuPresenter) this.L$1, (CartBuilder) obj4, (BrandSpotSyncTokens) obj3, this.$isLoading$delegate, this.$versions$delegate, (State) this.L$4, (State) obj2, this.L$2, this.L$3, this.$category$delegate, this.$currentIsGroupDisabled$delegate);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj5).collect(paymentConfigurationPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListPresenter$models$2$2(MutableState mutableState, PaymentLoadingPresenter paymentLoadingPresenter, String str, CategoryListViewEvent categoryListViewEvent, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.$category$delegate = mutableState;
        this.this$0 = paymentLoadingPresenter;
        this.$ownerAccountToken = str;
        this.$event = categoryListViewEvent;
        this.$currentIsGroupDisabled$delegate = mutableState2;
        this.$showPermissionsDialog$delegate = mutableState3;
        this.$isLoading$delegate = mutableState4;
        this.$versions$delegate = mutableState5;
    }
}
