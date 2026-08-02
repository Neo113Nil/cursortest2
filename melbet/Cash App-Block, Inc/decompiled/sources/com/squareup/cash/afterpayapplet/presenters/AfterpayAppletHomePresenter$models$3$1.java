package com.squareup.cash.afterpayapplet.presenters;

import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Error;
import com.squareup.cash.afterpayapplet.viewmodels.FooterImageContent;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpayAppletHomePresenter$models$3$1(AfterpayAppletHomePresenter afterpayAppletHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = afterpayAppletHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new AfterpayAppletHomePresenter$models$3$1(afterpayAppletHomePresenter, continuation, 0);
            default:
                return new AfterpayAppletHomePresenter$models$3$1(afterpayAppletHomePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpayAppletHomePresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AfterpayAppletHomePresenter afterpayAppletHomePresenter;
        ListIterator listIterator;
        boolean z;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent;
        int i = this.$r8$classId;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                AfterpayAppletHomeViewModel homeState = afterpayAppletHomePresenter2.getHomeState();
                StyledCardViewModel styledCardViewModel = (StyledCardViewModel) afterpayAppletHomePresenter2.styledCardViewModel$delegate.getValue();
                AndroidStringManager androidStringManager = afterpayAppletHomePresenter2.stringManager;
                if ((homeState instanceof AfterpayAppletHomeContentViewModel) && styledCardViewModel != null) {
                    AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) homeState;
                    AbstractPersistentList abstractPersistentList = afterpayAppletHomeContentViewModel.homeSections;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList, 10));
                    boolean z2 = false;
                    ListIterator listIterator2 = abstractPersistentList.listIterator(0);
                    while (listIterator2.hasNext()) {
                        AfterpayAppletHomeContentViewModel.HomeSection homeSection = (AfterpayAppletHomeContentViewModel.HomeSection) listIterator2.next();
                        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = homeSection.content;
                        if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) {
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) sectionContent;
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter2 = afterpayCardSection.footer;
                            if (cardFooter2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter) {
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter tappableFooter = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter) cardFooter2;
                                FooterImageContent footerImageContent = tappableFooter.imageContent;
                                if (footerImageContent instanceof FooterImageContent.CardThumbnail) {
                                    FooterImageContent.CardThumbnail cardThumbnail = (FooterImageContent.CardThumbnail) footerImageContent;
                                    if (cardThumbnail.styledCardViewModel == null) {
                                        FooterImageContent.CardThumbnail cardThumbnail2 = new FooterImageContent.CardThumbnail(cardThumbnail.displayStyle, styledCardViewModel);
                                        String str = tappableFooter.titleText;
                                        String str2 = tappableFooter.subtitleText;
                                        Tap tap = tappableFooter.tapAction;
                                        str.getClass();
                                        tappableFooter = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(cardThumbnail2, str, str2, tap);
                                    }
                                }
                                cardFooter = tappableFooter;
                            } else {
                                cardFooter = cardFooter2;
                            }
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent2 = afterpayCardSection.content;
                            if (afterpayCardContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) {
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent imageTextContent = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) afterpayCardContent2;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CashCardThumbnail cashCardThumbnail = imageTextContent.cashCard;
                                if (cashCardThumbnail == null || cashCardThumbnail.styledCardViewModel != null) {
                                    afterpayAppletHomePresenter = afterpayAppletHomePresenter2;
                                    afterpayCardContent = afterpayCardContent2;
                                    listIterator = listIterator2;
                                    afterpayCardContent2 = imageTextContent;
                                } else {
                                    afterpayAppletHomePresenter = afterpayAppletHomePresenter2;
                                    listIterator = listIterator2;
                                    afterpayCardContent = afterpayCardContent2;
                                    afterpayCardContent2 = AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent.copy$default(imageTextContent, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CashCardThumbnail(cashCardThumbnail.displayStyle, StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, new CardContouredText(androidStringManager.get(R.string.afterpay_applet_prepurchase_contour_text), null, RecyclerView.DECELERATION_RATE, 14, 0), 63487)), 30);
                                }
                            } else {
                                afterpayAppletHomePresenter = afterpayAppletHomePresenter2;
                                afterpayCardContent = afterpayCardContent2;
                                listIterator = listIterator2;
                            }
                            if (!Intrinsics.areEqual(cardFooter, cardFooter2) || !Intrinsics.areEqual(afterpayCardContent2, afterpayCardContent)) {
                                homeSection = AfterpayAppletHomeContentViewModel.HomeSection.copy$default(homeSection, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(afterpayCardSection.header, afterpayCardContent2, cardFooter));
                            }
                        } else {
                            afterpayAppletHomePresenter = afterpayAppletHomePresenter2;
                            listIterator = listIterator2;
                            if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) {
                                z = false;
                                homeSection = AfterpayAppletHomeContentViewModel.HomeSection.copy$default(homeSection, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.copy$default((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) sectionContent, StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, new CardContouredText(androidStringManager.get(R.string.afterpay_applet_prepurchase_contour_text), null, RecyclerView.DECELERATION_RATE, 14, 0), 63487), null, false, 27));
                                arrayList.add(homeSection);
                                listIterator2 = listIterator;
                                z2 = z;
                                afterpayAppletHomePresenter2 = afterpayAppletHomePresenter;
                            }
                        }
                        z = false;
                        arrayList.add(homeSection);
                        listIterator2 = listIterator;
                        z2 = z;
                        afterpayAppletHomePresenter2 = afterpayAppletHomePresenter;
                    }
                    homeState = AfterpayAppletHomeContentViewModel.copy$default(afterpayAppletHomeContentViewModel, z2, Tags.toPersistentList(arrayList), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
                    afterpayAppletHomePresenter2 = afterpayAppletHomePresenter2;
                }
                afterpayAppletHomePresenter2.setHomeState(homeState);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map2 = AfterpayAppletHomePresenter.refreshAttributeHome;
                if (afterpayAppletHomePresenter2.getHomeState() instanceof Error) {
                    afterpayAppletHomePresenter2.analytics.trackErrorAnalyticEvent(AfterpayAppletScreen.HOME);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
