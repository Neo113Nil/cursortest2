package com.squareup.cash.limits.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.stockdetails.Loaded;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewEvent$KeyStatsDetailsClicked;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewEvent;
import com.squareup.cash.investingcrypto.presenters.InvestingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1$2$1;
import com.squareup.cash.invitations.InviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1;
import com.squareup.cash.invitations.InviteContactsPresenter$includingEmail$$inlined$map$1$2$1;
import com.squareup.cash.invitations.InviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.limits.viewmodels.LimitsInlineMessageViewEvent;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.maps.presenter.CashMapPresenter$currentLocationModel$$inlined$filter$1$2$1;
import com.squareup.cash.maps.presenter.CashMapPresenter$locationDenials$$inlined$filter$1$2$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewEvent;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.util.android.Emails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LimitsPresenter$models$lambda$2$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return LimitsPresenter$models$lambda$2$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public LimitsPresenter$models$lambda$2$$inlined$map$1$2(FlowCollector flowCollector, InvestingSearchPresenter investingSearchPresenter) {
        this.$r8$classId = 1;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        InvestingSearchPresenter$models$lambda$1$$inlined$map$1$2$1 investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i2;
        InvestingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i3;
        InvestingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1;
        int i4;
        InvestingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1;
        int i5;
        InvestingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1;
        int i6;
        InvestingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1;
        int i7;
        InvestingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1;
        int i8;
        InvestingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1;
        int i9;
        InvestingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1;
        int i10;
        InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1;
        int i11;
        InvestingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1;
        int i12;
        InvestingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1;
        int i13;
        InvestingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1;
        int i14;
        InvestingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1;
        int i15;
        InvestingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1 investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1;
        int i16;
        InvestingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1 investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1;
        int i17;
        InvestingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1 investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1;
        int i18;
        InviteContactsPresenter$filterContacts$$inlined$map$1$2$1 inviteContactsPresenter$filterContacts$$inlined$map$1$2$1;
        int i19;
        InviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1 inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1;
        int i20;
        InviteContactsPresenter$includingEmail$$inlined$map$1$2$1 inviteContactsPresenter$includingEmail$$inlined$map$1$2$1;
        int i21;
        InviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1 inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1;
        int i22;
        LanguageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1 languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1;
        int i23;
        LanguageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1 languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1;
        int i24;
        GoogleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1 googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i25;
        CashMapPresenter$currentLocationModel$$inlined$filter$1$2$1 cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1;
        int i26;
        CashMapPresenter$locationDenials$$inlined$filter$1$2$1 cashMapPresenter$locationDenials$$inlined$filter$1$2$1;
        int i27;
        MerchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i28;
        MerchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1 merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1;
        int i29;
        MerchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1 merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1;
        int i30;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            LimitsInlineMessageViewEvent limitsInlineMessageViewEvent = ((LimitsViewEvent.LimitsInlineMessageEvent) obj).event;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(limitsInlineMessageViewEvent, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof InvestingSearchPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1 = (InvestingSearchPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i33 = investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj3 = investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Color color = ((CategoryDetails) obj).category.color;
                            Object accented = color != null ? new ColorModel.Accented(color) : ColorModel.Investing.INSTANCE;
                            investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(accented, investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1 = new InvestingSearchPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj32 = investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = investingSearchPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i34 = investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj4 = investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Boolean valueOf = Boolean.valueOf(((ActivityEvent) obj).started);
                            investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj42 = investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = investingStockDetailsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1) continuation;
                    int i35 = investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj5 = investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Loaded loaded = new Loaded((Investment_holding) obj);
                            investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loaded, investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1(this, continuation);
                Object obj52 = investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = investingStockDetailsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1) continuation;
                    int i36 = investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj6 = investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            Loaded loaded2 = new Loaded((Recurring_preference) obj);
                            investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loaded2, investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1(this, continuation);
                Object obj62 = investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = investingStockDetailsPresenter$models$lambda$15$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1) continuation;
                    int i37 = investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj7 = investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            if (obj instanceof InvestingStockDetailsViewEvent.FinancialEvent) {
                                investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj72 = investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = investingStockDetailsPresenter$models$lambda$31$$inlined$filterIsInstance$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1) continuation;
                    int i38 = investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj8 = investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            InvestingFinancialViewEvent investingFinancialViewEvent = ((InvestingStockDetailsViewEvent.FinancialEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingFinancialViewEvent, investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1) == coroutineSingletons8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1(this, continuation);
                Object obj82 = investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = investingStockDetailsPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1) continuation;
                    int i39 = investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj9 = investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            if (obj instanceof InvestingStockDetailsViewEvent.EarningsEvent) {
                                investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj92 = investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = investingStockDetailsPresenter$models$lambda$33$$inlined$filterIsInstance$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1) continuation;
                    int i40 = investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj10 = investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            InvestingEarningsViewEvent$MoreInfoClicked investingEarningsViewEvent$MoreInfoClicked = ((InvestingStockDetailsViewEvent.EarningsEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingEarningsViewEvent$MoreInfoClicked, investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1(this, continuation);
                Object obj102 = investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = investingStockDetailsPresenter$models$lambda$33$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1) continuation;
                    int i41 = investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj11 = investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            if (obj instanceof InvestingStockDetailsViewEvent.KeyStatEvent) {
                                investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj112 = investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = investingStockDetailsPresenter$models$lambda$35$$inlined$filterIsInstance$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1) continuation;
                    int i42 = investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj12 = investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            InvestingDetailTileViewEvent$KeyStatsDetailsClicked investingDetailTileViewEvent$KeyStatsDetailsClicked = ((InvestingStockDetailsViewEvent.KeyStatEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingDetailTileViewEvent$KeyStatsDetailsClicked, investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1) == coroutineSingletons12) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1(this, continuation);
                Object obj122 = investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = investingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1) continuation;
                    int i43 = investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj13 = investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            if (obj instanceof InvestingStockDetailsViewEvent.AnalystOpinionsEvent) {
                                investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj132 = investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = investingStockDetailsPresenter$models$lambda$37$$inlined$filterIsInstance$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1) continuation;
                    int i44 = investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj14 = investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            InvestingAnalystOpinionsViewEvent$MoreInfoClicked investingAnalystOpinionsViewEvent$MoreInfoClicked = ((InvestingStockDetailsViewEvent.AnalystOpinionsEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingAnalystOpinionsViewEvent$MoreInfoClicked, investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1(this, continuation);
                Object obj142 = investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = investingStockDetailsPresenter$models$lambda$37$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1) continuation;
                    int i45 = investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj15 = investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            if (obj instanceof InvestingStockDetailsViewEvent.NewsEvent) {
                                investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj152 = investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = investingStockDetailsPresenter$models$lambda$38$$inlined$filterIsInstance$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1) continuation;
                    int i46 = investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj16 = investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = ((InvestingStockDetailsViewEvent.NewsEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingCryptoNewsViewEvent, investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1) == coroutineSingletons16) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1(this, continuation);
                Object obj162 = investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = investingStockDetailsPresenter$models$lambda$38$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1) continuation;
                    int i47 = investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj17 = investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            if (obj instanceof InvestingStockDetailsViewEvent.EtfHoldingsEvent) {
                                investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1) == coroutineSingletons17) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj172 = investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = investingStockDetailsPresenter$models$lambda$41$$inlined$filterIsInstance$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof InvestingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1) {
                    investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1) continuation;
                    int i48 = investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj18 = investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            InvestingEtfHoldingsViewEvent investingEtfHoldingsViewEvent = ((InvestingStockDetailsViewEvent.EtfHoldingsEvent) obj).event;
                            investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(investingEtfHoldingsViewEvent, investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1(this, continuation);
                Object obj182 = investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = investingStockDetailsPresenter$models$lambda$41$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof InvestingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1) {
                    investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1 = (InvestingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1) continuation;
                    int i49 = investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj19 = investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            ActivityEvent activityEvent = (ActivityEvent) obj;
                            if (activityEvent == ActivityEvent.START || activityEvent == ActivityEvent.STOP) {
                                investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1) == coroutineSingletons19) {
                                    break;
                                }
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1 = new InvestingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1(this, continuation);
                Object obj192 = investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = investingPresenterUtilsKt$collectOnlyWhileOnScreen$$inlined$filter$1$2$1.label;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof InviteContactsPresenter$filterContacts$$inlined$map$1$2$1) {
                    inviteContactsPresenter$filterContacts$$inlined$map$1$2$1 = (InviteContactsPresenter$filterContacts$$inlined$map$1$2$1) continuation;
                    int i50 = inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj20 = inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            String str = ((InviteContactsViewEvent.TextChanged) obj).newText;
                            inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, inviteContactsPresenter$filterContacts$$inlined$map$1$2$1) == coroutineSingletons20) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                inviteContactsPresenter$filterContacts$$inlined$map$1$2$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1$2$1(this, continuation);
                Object obj202 = inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = inviteContactsPresenter$filterContacts$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof InviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1) {
                    inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1 = (InviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1) continuation;
                    int i51 = inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj21 = inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            String str2 = ((InviteContactsViewEvent.TextChanged) obj).newText;
                            inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str2, inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1 = new InviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1(this, continuation);
                Object obj212 = inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = inviteContactsPresenter$filterRecommendedContacts$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof InviteContactsPresenter$includingEmail$$inlined$map$1$2$1) {
                    inviteContactsPresenter$includingEmail$$inlined$map$1$2$1 = (InviteContactsPresenter$includingEmail$$inlined$map$1$2$1) continuation;
                    int i52 = inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj23 = inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            String normalize = Emails.normalize(((InviteContactsViewEvent.TextChanged) obj).newText);
                            inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(normalize, inviteContactsPresenter$includingEmail$$inlined$map$1$2$1) == coroutineSingletons22) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                inviteContactsPresenter$includingEmail$$inlined$map$1$2$1 = new InviteContactsPresenter$includingEmail$$inlined$map$1$2$1(this, continuation);
                Object obj232 = inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = inviteContactsPresenter$includingEmail$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof InviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                    inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1 = (InviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i53 = inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj24 = inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            if (((Boolean) obj).booleanValue()) {
                                inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1 = new InviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj242 = inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = inviteContactsPresenter$models$2$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof LanguageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1) {
                    languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1 = (LanguageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1) continuation;
                    int i54 = languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj25 = languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            if (obj instanceof OnboardedAccountStatus.Onboarded) {
                                languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1 = new LanguageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj252 = languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = languageDisclosureSetupTeardown$checkDisclosure$$inlined$filterIsInstance$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof LanguageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1) {
                    languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1 = (LanguageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                    int i55 = languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj26 = languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            LocalizationConfig localizationConfig = ((com.squareup.cash.localization.db.LocalizationConfig) obj).config;
                            LocalizationConfig.LanguageDisclosure languageDisclosure = localizationConfig != null ? localizationConfig.language_disclosure : null;
                            languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(languageDisclosure, languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1) == coroutineSingletons25) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1 = new LanguageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                Object obj262 = languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = languageDisclosurePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof GoogleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                    googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1 = (GoogleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i56 = googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj27 = googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            if (!((Boolean) obj).booleanValue()) {
                                googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons26) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1 = new GoogleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj272 = googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = googleMapEngine$Map$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof CashMapPresenter$currentLocationModel$$inlined$filter$1$2$1) {
                    cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1 = (CashMapPresenter$currentLocationModel$$inlined$filter$1$2$1) continuation;
                    int i57 = cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj28 = cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            if (((Boolean) obj).booleanValue()) {
                                cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1) == coroutineSingletons27) {
                                    break;
                                }
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1 = new CashMapPresenter$currentLocationModel$$inlined$filter$1$2$1(this, continuation);
                Object obj282 = cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = cashMapPresenter$currentLocationModel$$inlined$filter$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof CashMapPresenter$locationDenials$$inlined$filter$1$2$1) {
                    cashMapPresenter$locationDenials$$inlined$filter$1$2$1 = (CashMapPresenter$locationDenials$$inlined$filter$1$2$1) continuation;
                    int i58 = cashMapPresenter$locationDenials$$inlined$filter$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        cashMapPresenter$locationDenials$$inlined$filter$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj29 = cashMapPresenter$locationDenials$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = cashMapPresenter$locationDenials$$inlined$filter$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            if (!((Boolean) obj).booleanValue()) {
                                cashMapPresenter$locationDenials$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cashMapPresenter$locationDenials$$inlined$filter$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                cashMapPresenter$locationDenials$$inlined$filter$1$2$1 = new CashMapPresenter$locationDenials$$inlined$filter$1$2$1(this, continuation);
                Object obj292 = cashMapPresenter$locationDenials$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = cashMapPresenter$locationDenials$$inlined$filter$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof MerchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (MerchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i59 = merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj30 = merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            if (obj instanceof BoostAction.Blockers) {
                                merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons29) {
                                    break;
                                }
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new MerchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj302 = merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = merchantProfilePresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof MerchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1) {
                    merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1 = (MerchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1) continuation;
                    int i60 = merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj31 = merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            if (obj instanceof MerchantProfileViewEvent.MerchantGenericTreeElementsViewEvent) {
                                merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1) == coroutineSingletons30) {
                                    break;
                                }
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1 = new MerchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj312 = merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = merchantProfilePresenter$models$lambda$26$$inlined$filterIsInstance$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof MerchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1) {
                    merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1 = (MerchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1) continuation;
                    int i61 = merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj33 = merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            GenericTreeElementsViewEvent genericTreeElementsViewEvent = ((MerchantProfileViewEvent.MerchantGenericTreeElementsViewEvent) obj).event;
                            merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(genericTreeElementsViewEvent, merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1) == coroutineSingletons31) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1 = new MerchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1(this, continuation);
                Object obj332 = merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = merchantProfilePresenter$models$lambda$26$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LimitsPresenter$models$lambda$2$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
