package app.cash.local.presenters.wallet;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.views.home.LocalHomeGeoViewKt;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoryViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.education.stories.backend.api.EducationStory;
import com.squareup.cash.education.stories.backend.api.GetStoriesResult;
import com.squareup.cash.education.stories.backend.api.SceneBackground;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TabContentPresenter$models$4$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeOrders$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabContentPresenter$models$4$1$1$1(Object obj, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.L$0 = obj;
        this.$activeOrders$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$activeOrders$delegate;
        switch (i) {
            case 0:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 0);
                tabContentPresenter$models$4$1$1$1.L$0 = obj;
                return tabContentPresenter$models$4$1$1$1;
            case 1:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 1);
                tabContentPresenter$models$4$1$1$12.L$0 = obj;
                return tabContentPresenter$models$4$1$1$12;
            case 2:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$13 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 2);
                tabContentPresenter$models$4$1$1$13.L$0 = obj;
                return tabContentPresenter$models$4$1$1$13;
            case 3:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$14 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 3);
                tabContentPresenter$models$4$1$1$14.L$0 = obj;
                return tabContentPresenter$models$4$1$1$14;
            case 4:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$15 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 4);
                tabContentPresenter$models$4$1$1$15.L$0 = obj;
                return tabContentPresenter$models$4$1$1$15;
            case 5:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$16 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 5);
                tabContentPresenter$models$4$1$1$16.L$0 = obj;
                return tabContentPresenter$models$4$1$1$16;
            case 6:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$17 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 6);
                tabContentPresenter$models$4$1$1$17.L$0 = obj;
                return tabContentPresenter$models$4$1$1$17;
            case 7:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$18 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 7);
                tabContentPresenter$models$4$1$1$18.L$0 = obj;
                return tabContentPresenter$models$4$1$1$18;
            case 8:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$19 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 8);
                tabContentPresenter$models$4$1$1$19.L$0 = obj;
                return tabContentPresenter$models$4$1$1$19;
            case 9:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$110 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 9);
                tabContentPresenter$models$4$1$1$110.L$0 = obj;
                return tabContentPresenter$models$4$1$1$110;
            case 10:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$111 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 10);
                tabContentPresenter$models$4$1$1$111.L$0 = obj;
                return tabContentPresenter$models$4$1$1$111;
            case 11:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$112 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 11);
                tabContentPresenter$models$4$1$1$112.L$0 = obj;
                return tabContentPresenter$models$4$1$1$112;
            case 12:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$113 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 12);
                tabContentPresenter$models$4$1$1$113.L$0 = obj;
                return tabContentPresenter$models$4$1$1$113;
            case 13:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$114 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 13);
                tabContentPresenter$models$4$1$1$114.L$0 = obj;
                return tabContentPresenter$models$4$1$1$114;
            case 14:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$115 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 14);
                tabContentPresenter$models$4$1$1$115.L$0 = obj;
                return tabContentPresenter$models$4$1$1$115;
            case 15:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$116 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 15);
                tabContentPresenter$models$4$1$1$116.L$0 = obj;
                return tabContentPresenter$models$4$1$1$116;
            case 16:
                return new TabContentPresenter$models$4$1$1$1(this.L$0, mutableState, continuation);
            case 17:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$117 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 17);
                tabContentPresenter$models$4$1$1$117.L$0 = obj;
                return tabContentPresenter$models$4$1$1$117;
            case 18:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$118 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 18);
                tabContentPresenter$models$4$1$1$118.L$0 = obj;
                return tabContentPresenter$models$4$1$1$118;
            case 19:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$119 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 19);
                tabContentPresenter$models$4$1$1$119.L$0 = obj;
                return tabContentPresenter$models$4$1$1$119;
            case 20:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$120 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 20);
                tabContentPresenter$models$4$1$1$120.L$0 = obj;
                return tabContentPresenter$models$4$1$1$120;
            case 21:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$121 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 21);
                tabContentPresenter$models$4$1$1$121.L$0 = obj;
                return tabContentPresenter$models$4$1$1$121;
            case 22:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$122 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 22);
                tabContentPresenter$models$4$1$1$122.L$0 = obj;
                return tabContentPresenter$models$4$1$1$122;
            case 23:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$123 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 23);
                tabContentPresenter$models$4$1$1$123.L$0 = obj;
                return tabContentPresenter$models$4$1$1$123;
            case 24:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$124 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 24);
                tabContentPresenter$models$4$1$1$124.L$0 = obj;
                return tabContentPresenter$models$4$1$1$124;
            case 25:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$125 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 25);
                tabContentPresenter$models$4$1$1$125.L$0 = obj;
                return tabContentPresenter$models$4$1$1$125;
            case 26:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$126 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 26);
                tabContentPresenter$models$4$1$1$126.L$0 = obj;
                return tabContentPresenter$models$4$1$1$126;
            case 27:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$127 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 27);
                tabContentPresenter$models$4$1$1$127.L$0 = obj;
                return tabContentPresenter$models$4$1$1$127;
            default:
                TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$128 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 28);
                tabContentPresenter$models$4$1$1$128.L$0 = obj;
                return tabContentPresenter$models$4$1$1$128;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((TabContentPresenter$models$4$1$1$1) create((Quat) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        CustomerProfileDetails customerProfileDetails;
        int i2 = this.$r8$classId;
        CustomerProfileData customerProfileData = null;
        MutableState mutableState = this.$activeOrders$delegate;
        switch (i2) {
            case 0:
                List list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(list);
                break;
            case 1:
                Object obj3 = (List) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (obj3 == null) {
                    obj3 = EmptyList.INSTANCE;
                }
                mutableState.setValue(obj3);
                break;
            case 2:
                LocalBrand localBrand = (LocalBrand) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(localBrand);
                break;
            case 3:
                GetSuggestedReordersResponse.SuggestedReorders suggestedReorders = (GetSuggestedReordersResponse.SuggestedReorders) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(suggestedReorders.reorders);
                break;
            case 4:
                SheetPosition sheetPosition = (SheetPosition) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (sheetPosition == SheetPosition.Hidden) {
                    int i3 = LocalHomeGeoViewKt.$r8$clinit;
                    mutableState.setValue(null);
                }
                break;
            case 5:
                UpdateSearchQuery updateSearchQuery = (UpdateSearchQuery) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(updateSearchQuery.newQuery);
                break;
            case 6:
                AfterpaySearchViewEvent.QueryUpdated queryUpdated = (AfterpaySearchViewEvent.QueryUpdated) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(queryUpdated.query);
                break;
            case 7:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GetStoriesResult getStoriesResult = (GetStoriesResult) mutableState.getValue();
                if (getStoriesResult == null) {
                    obj2 = new BitcoinStoriesWidgetViewModel.Loading();
                } else if (getStoriesResult instanceof GetStoriesResult.Success) {
                    ArrayList<EducationStory> arrayList = ((GetStoriesResult.Success) getStoriesResult).stories;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (EducationStory educationStory : arrayList) {
                        String str = educationStory.url;
                        String str2 = educationStory.thumbnail;
                        Integer num = educationStory.primaryColor;
                        int intValue = num != null ? num.intValue() : -16777216;
                        String str3 = educationStory.title;
                        ArrayList<SceneBackground> arrayList3 = educationStory.sceneBackgrounds;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                        for (SceneBackground sceneBackground : arrayList3) {
                            if (sceneBackground instanceof SceneBackground.Color) {
                                i = ((SceneBackground.Color) sceneBackground).color;
                            } else if (!Intrinsics.areEqual(sceneBackground, SceneBackground.None.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                i = -16777216;
                            }
                            arrayList4.add(Integer.valueOf(i));
                        }
                        arrayList2.add(new BitcoinStoryViewModel(intValue, str, str3, str2, arrayList4));
                    }
                    obj2 = new BitcoinStoriesWidgetViewModel.Content(arrayList2);
                } else if (!(getStoriesResult instanceof GetStoriesResult.HttpFailure) && !(getStoriesResult instanceof GetStoriesResult.NetworkFailure) && !(getStoriesResult instanceof GetStoriesResult.UnknownFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    obj2 = BitcoinStoriesWidgetViewModel.Failure.INSTANCE;
                }
                produceStateScope.setValue(obj2);
                break;
            case 8:
                InvestingGraphViewEvent.SelectRange selectRange = (InvestingGraphViewEvent.SelectRange) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(selectRange.range);
                break;
            case 9:
                InvestingGraphViewEvent.ScrubPoint scrubPoint = (InvestingGraphViewEvent.ScrubPoint) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(scrubPoint);
                break;
            case 10:
                Quat quat = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr = CardSceneEffectKt.X_AXIS;
                mutableState.setValue(quat);
                break;
            case 11:
                String str4 = (String) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(new InputFieldText.Simple(str4));
                break;
            case 12:
                GlobalSearchViewEvent.QueryUpdateEvent queryUpdateEvent = (GlobalSearchViewEvent.QueryUpdateEvent) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(queryUpdateEvent.query);
                break;
            case 13:
                InvestingSearchViewModel investingSearchViewModel = (InvestingSearchViewModel) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(investingSearchViewModel);
                break;
            case 14:
                AllowlistSelectionViewEvent.ChangeSearchText changeSearchText = (AllowlistSelectionViewEvent.ChangeSearchText) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(changeSearchText.text);
                break;
            case 15:
                SelectCustomerViewEvent.ChangeSearchText changeSearchText2 = (SelectCustomerViewEvent.ChangeSearchText) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (changeSearchText2.text.getValue().length() <= 50) {
                    mutableState.setValue(changeSearchText2.text);
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj4 = this.L$0;
                if (!obj4.equals(mutableState.getValue())) {
                    mutableState.setValue(obj4);
                }
                break;
            case 17:
                List list2 = (List) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(list2);
                break;
            case 18:
                AsyncResult asyncResult = (AsyncResult) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AsyncResult.Success success = asyncResult instanceof AsyncResult.Success ? (AsyncResult.Success) asyncResult : null;
                if (success != null && (customerProfileDetails = (CustomerProfileDetails) success.response) != null) {
                    customerProfileData = customerProfileDetails.customerProfileData;
                }
                mutableState.setValue(customerProfileData);
                break;
            case 19:
                PublicProfile publicProfile = (PublicProfile) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(publicProfile.photoUrl);
                break;
            case 20:
                Quat quat2 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                mutableState.setValue(quat2);
                break;
            case 21:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat4 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                mutableState.setValue(heroCardDetails);
                break;
            case 22:
                Quat quat5 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat6 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                mutableState.setValue(quat5);
                break;
            case 23:
                Quat quat7 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                mutableState.setValue(quat7);
                break;
            case 24:
                CardModelView.PanEntity panEntity = (CardModelView.PanEntity) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView = (CardModelView) mutableState.getValue();
                if (cardModelView != null) {
                    cardModelView.setChildrenLocal(CollectionsKt__CollectionsJVMKt.listOf(panEntity));
                }
                break;
            case 25:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = (CardSchemeViewModel.Module.HeroCardDetails) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                mutableState.setValue(heroCardDetails2);
                break;
            case 26:
                Quat quat8 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr5 = Hero3DCardViewKt.X_AXIS;
                mutableState.setValue(quat8);
                break;
            case 27:
                Quat quat9 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(quat9);
                break;
            default:
                Quat quat10 = (Quat) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(quat10);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabContentPresenter$models$4$1$1$1(MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$activeOrders$delegate = mutableState;
    }
}
