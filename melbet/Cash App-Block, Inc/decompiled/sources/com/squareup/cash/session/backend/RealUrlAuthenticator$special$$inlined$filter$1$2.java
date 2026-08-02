package com.squareup.cash.session.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.WebLoginConfig;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$special$$inlined$filter$2$2$1;
import com.squareup.cash.recipients.backend.api.RecipientSearchResults;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$SuggestionType;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.recipients.backend.real.RealRecipientSearchController$search$$inlined$map$1$2$1;
import com.squareup.cash.recipients.backend.real.RealRecipientSearchController$search$$inlined$map$2$2$1;
import com.squareup.cash.recipients.backend.real.RealRecipientSearchController$search$$inlined$map$3$2$1;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$2$2$1;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$special$$inlined$map$1$2$1;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$special$$inlined$map$2$2$1;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$special$$inlined$map$3$2$1;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.savings.backend.api.ActiveGoalProvider;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.db.GetGeneralSavingsBalance;
import com.squareup.cash.savings.db.GetSavingsBalance;
import com.squareup.cash.savings.presenters.LoadedSavingsModel;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.securityhub.viewmodels.SecurityHubViewEvent;
import com.squareup.cash.sharesheet.RealShareTargetsManager$buildTargets$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1;
import com.squareup.cash.sharesheet.ShareableAssetsManager$DownloadedImage;
import com.squareup.cash.sharesheet.ShareableAssetsManager$ShareableAssets;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.cash.Cashtags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealUrlAuthenticator$special$$inlined$filter$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2$1, reason: invalid class name */
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
            return RealUrlAuthenticator$special$$inlined$filter$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealUrlAuthenticator$special$$inlined$filter$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CashtagQrScanPresenter$special$$inlined$filter$1$2$1 cashtagQrScanPresenter$special$$inlined$filter$1$2$1;
        int i2;
        CashtagQrScanPresenter$special$$inlined$filter$2$2$1 cashtagQrScanPresenter$special$$inlined$filter$2$2$1;
        int i3;
        RealRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1 realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1;
        int i4;
        RealRecipientSearchController$search$$inlined$map$1$2$1 realRecipientSearchController$search$$inlined$map$1$2$1;
        int i5;
        RealRecipientSearchController$search$$inlined$map$2$2$1 realRecipientSearchController$search$$inlined$map$2$2$1;
        int i6;
        RealRecipientSearchController$search$$inlined$map$3$2$1 realRecipientSearchController$search$$inlined$map$3$2$1;
        int i7;
        RealCustomerStore$getCustomerForId$$inlined$map$1$2$1 realCustomerStore$getCustomerForId$$inlined$map$1$2$1;
        int i8;
        RealRecipientRepository$suggestions$$inlined$map$1$2$1 realRecipientRepository$suggestions$$inlined$map$1$2$1;
        int i9;
        RealRecipientRepository$suggestions$$inlined$map$2$2$1 realRecipientRepository$suggestions$$inlined$map$2$2$1;
        int i10;
        RealSavingsAppletTileRepository$special$$inlined$map$1$2$1 realSavingsAppletTileRepository$special$$inlined$map$1$2$1;
        int i11;
        RealSavingsAppletTileRepository$special$$inlined$map$2$2$1 realSavingsAppletTileRepository$special$$inlined$map$2$2$1;
        int i12;
        RealSavingsAppletTileRepository$special$$inlined$map$3$2$1 realSavingsAppletTileRepository$special$$inlined$map$3$2$1;
        int i13;
        SavingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1 savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1;
        int i14;
        SavingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1 savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1;
        int i15;
        SavingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1 savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1;
        int i16;
        SavingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1 savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1;
        int i17;
        SavingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1 savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1;
        int i18;
        SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1 savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1;
        int i19;
        ScoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1 scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1;
        int i20;
        SecurityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
        int i21;
        SecurityHubPresenter$models$lambda$6$$inlined$map$1$2$1 securityHubPresenter$models$lambda$6$$inlined$map$1$2$1;
        int i22;
        TimeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1 timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1;
        int i23;
        RealShareTargetsManager$buildTargets$$inlined$map$1$2$1 realShareTargetsManager$buildTargets$$inlined$map$1$2$1;
        int i24;
        RealShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1 realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1;
        int i25;
        RealShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1 realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1;
        int i26;
        RealShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1 realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1;
        int i27;
        RealShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1 realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1;
        int i28;
        RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1 realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1;
        int i29;
        RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1 realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1;
        int i30;
        int i31 = this.$r8$classId;
        boolean z = false;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            if (((WebLoginConfig) obj).token != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == obj3) {
                                    break;
                                }
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
                Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof CashtagQrScanPresenter$special$$inlined$filter$1$2$1) {
                    cashtagQrScanPresenter$special$$inlined$filter$1$2$1 = (CashtagQrScanPresenter$special$$inlined$filter$1$2$1) continuation;
                    int i33 = cashtagQrScanPresenter$special$$inlined$filter$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        cashtagQrScanPresenter$special$$inlined$filter$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj4 = cashtagQrScanPresenter$special$$inlined$filter$1$2$1.result;
                        Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cashtagQrScanPresenter$special$$inlined$filter$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (Intrinsics.areEqual((String) obj, "android.permission.CAMERA")) {
                                cashtagQrScanPresenter$special$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cashtagQrScanPresenter$special$$inlined$filter$1$2$1) == obj5) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                cashtagQrScanPresenter$special$$inlined$filter$1$2$1 = new CashtagQrScanPresenter$special$$inlined$filter$1$2$1(this, continuation);
                Object obj42 = cashtagQrScanPresenter$special$$inlined$filter$1$2$1.result;
                Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cashtagQrScanPresenter$special$$inlined$filter$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof CashtagQrScanPresenter$special$$inlined$filter$2$2$1) {
                    cashtagQrScanPresenter$special$$inlined$filter$2$2$1 = (CashtagQrScanPresenter$special$$inlined$filter$2$2$1) continuation;
                    int i34 = cashtagQrScanPresenter$special$$inlined$filter$2$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        cashtagQrScanPresenter$special$$inlined$filter$2$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj6 = cashtagQrScanPresenter$special$$inlined$filter$2$2$1.result;
                        Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = cashtagQrScanPresenter$special$$inlined$filter$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            ActivityEvent activityEvent = (ActivityEvent) obj;
                            if (activityEvent == ActivityEvent.RESUME || activityEvent == ActivityEvent.PAUSE) {
                                cashtagQrScanPresenter$special$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, cashtagQrScanPresenter$special$$inlined$filter$2$2$1) == obj7) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                cashtagQrScanPresenter$special$$inlined$filter$2$2$1 = new CashtagQrScanPresenter$special$$inlined$filter$2$2$1(this, continuation);
                Object obj62 = cashtagQrScanPresenter$special$$inlined$filter$2$2$1.result;
                Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = cashtagQrScanPresenter$special$$inlined$filter$2$2$1.label;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof RealRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1) {
                    realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1 = (RealRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i35 = realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            Object l = new Long(((InstrumentLinkingConfig) obj).credit_card_fee_bps);
                            realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(l, realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1) == obj9) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1 = new RealRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj82 = realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.result;
                Object obj92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realRecipientFinder$findByCashtag$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealRecipientSearchController$search$$inlined$map$1$2$1) {
                    realRecipientSearchController$search$$inlined$map$1$2$1 = (RealRecipientSearchController$search$$inlined$map$1$2$1) continuation;
                    int i36 = realRecipientSearchController$search$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientSearchController$search$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realRecipientSearchController$search$$inlined$map$1$2$1.result;
                        Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realRecipientSearchController$search$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            ArrayList arrayList = new ArrayList();
                            for (Recipient recipient : (List) obj) {
                                if (recipient.merchantData == null) {
                                    recipient = recipient.lookupKey != null ? Recipient.copy$default(recipient) : null;
                                }
                                if (recipient != null) {
                                    arrayList.add(recipient);
                                }
                            }
                            realRecipientSearchController$search$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList, realRecipientSearchController$search$$inlined$map$1$2$1) == obj11) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                realRecipientSearchController$search$$inlined$map$1$2$1 = new RealRecipientSearchController$search$$inlined$map$1$2$1(this, continuation);
                Object obj102 = realRecipientSearchController$search$$inlined$map$1$2$1.result;
                Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realRecipientSearchController$search$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealRecipientSearchController$search$$inlined$map$2$2$1) {
                    realRecipientSearchController$search$$inlined$map$2$2$1 = (RealRecipientSearchController$search$$inlined$map$2$2$1) continuation;
                    int i37 = realRecipientSearchController$search$$inlined$map$2$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientSearchController$search$$inlined$map$2$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj12 = realRecipientSearchController$search$$inlined$map$2$2$1.result;
                        Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realRecipientSearchController$search$$inlined$map$2$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj14 : (List) obj) {
                                if (((Recipient) obj14).lookupKey != null) {
                                    arrayList2.add(obj14);
                                }
                            }
                            List sorted = CollectionsKt.sorted(arrayList2);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sorted, 10));
                            Iterator it = sorted.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(Recipient.copy$default((Recipient) it.next()));
                            }
                            realRecipientSearchController$search$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(arrayList3, realRecipientSearchController$search$$inlined$map$2$2$1) == obj13) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                realRecipientSearchController$search$$inlined$map$2$2$1 = new RealRecipientSearchController$search$$inlined$map$2$2$1(this, continuation);
                Object obj122 = realRecipientSearchController$search$$inlined$map$2$2$1.result;
                Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realRecipientSearchController$search$$inlined$map$2$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof RealRecipientSearchController$search$$inlined$map$3$2$1) {
                    realRecipientSearchController$search$$inlined$map$3$2$1 = (RealRecipientSearchController$search$$inlined$map$3$2$1) continuation;
                    int i38 = realRecipientSearchController$search$$inlined$map$3$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientSearchController$search$$inlined$map$3$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj15 = realRecipientSearchController$search$$inlined$map$3$2$1.result;
                        Object obj16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realRecipientSearchController$search$$inlined$map$3$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            Object localContacts = new RecipientSearchResults.LocalContacts((List) obj);
                            realRecipientSearchController$search$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(localContacts, realRecipientSearchController$search$$inlined$map$3$2$1) == obj16) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                realRecipientSearchController$search$$inlined$map$3$2$1 = new RealRecipientSearchController$search$$inlined$map$3$2$1(this, continuation);
                Object obj152 = realRecipientSearchController$search$$inlined$map$3$2$1.result;
                Object obj162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realRecipientSearchController$search$$inlined$map$3$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof RealCustomerStore$getCustomerForId$$inlined$map$1$2$1) {
                    realCustomerStore$getCustomerForId$$inlined$map$1$2$1 = (RealCustomerStore$getCustomerForId$$inlined$map$1$2$1) continuation;
                    int i39 = realCustomerStore$getCustomerForId$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        realCustomerStore$getCustomerForId$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj17 = realCustomerStore$getCustomerForId$$inlined$map$1$2$1.result;
                        Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realCustomerStore$getCustomerForId$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            ActivityRecipient activityRecipient = (ActivityRecipient) obj;
                            Object createRecipient = activityRecipient != null ? RecipientUtil.createRecipient(activityRecipient, false) : null;
                            realCustomerStore$getCustomerForId$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(createRecipient, realCustomerStore$getCustomerForId$$inlined$map$1$2$1) == obj18) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                realCustomerStore$getCustomerForId$$inlined$map$1$2$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1$2$1(this, continuation);
                Object obj172 = realCustomerStore$getCustomerForId$$inlined$map$1$2$1.result;
                Object obj182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realCustomerStore$getCustomerForId$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof RealRecipientRepository$suggestions$$inlined$map$1$2$1) {
                    realRecipientRepository$suggestions$$inlined$map$1$2$1 = (RealRecipientRepository$suggestions$$inlined$map$1$2$1) continuation;
                    int i40 = realRecipientRepository$suggestions$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientRepository$suggestions$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj19 = realRecipientRepository$suggestions$$inlined$map$1$2$1.result;
                        Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realRecipientRepository$suggestions$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
                            Object obj21 = recipientSuggestions != null ? recipientSuggestions.suggestions : null;
                            if (obj21 == null) {
                                obj21 = EmptyList.INSTANCE;
                            }
                            realRecipientRepository$suggestions$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj21, realRecipientRepository$suggestions$$inlined$map$1$2$1) == obj20) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                realRecipientRepository$suggestions$$inlined$map$1$2$1 = new RealRecipientRepository$suggestions$$inlined$map$1$2$1(this, continuation);
                Object obj192 = realRecipientRepository$suggestions$$inlined$map$1$2$1.result;
                Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realRecipientRepository$suggestions$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof RealRecipientRepository$suggestions$$inlined$map$2$2$1) {
                    realRecipientRepository$suggestions$$inlined$map$2$2$1 = (RealRecipientRepository$suggestions$$inlined$map$2$2$1) continuation;
                    int i41 = realRecipientRepository$suggestions$$inlined$map$2$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientRepository$suggestions$$inlined$map$2$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realRecipientRepository$suggestions$$inlined$map$2$2$1.result;
                        Object obj24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realRecipientRepository$suggestions$$inlined$map$2$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            Object obj25 = (List) ((Map) obj).get(RecipientSuggestionsProvider$SuggestionType.CONTACTS);
                            if (obj25 == null) {
                                obj25 = EmptyList.INSTANCE;
                            }
                            realRecipientRepository$suggestions$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj25, realRecipientRepository$suggestions$$inlined$map$2$2$1) == obj24) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                realRecipientRepository$suggestions$$inlined$map$2$2$1 = new RealRecipientRepository$suggestions$$inlined$map$2$2$1(this, continuation);
                Object obj232 = realRecipientRepository$suggestions$$inlined$map$2$2$1.result;
                Object obj242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = realRecipientRepository$suggestions$$inlined$map$2$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof RealSavingsAppletTileRepository$special$$inlined$map$1$2$1) {
                    realSavingsAppletTileRepository$special$$inlined$map$1$2$1 = (RealSavingsAppletTileRepository$special$$inlined$map$1$2$1) continuation;
                    int i42 = realSavingsAppletTileRepository$special$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        realSavingsAppletTileRepository$special$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realSavingsAppletTileRepository$special$$inlined$map$1$2$1.result;
                        Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realSavingsAppletTileRepository$special$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            Object savingsConfigState = new SavingsRepositoryModel.SavingsConfigState(4);
                            realSavingsAppletTileRepository$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(savingsConfigState, realSavingsAppletTileRepository$special$$inlined$map$1$2$1) == obj27) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realSavingsAppletTileRepository$special$$inlined$map$1$2$1 = new RealSavingsAppletTileRepository$special$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realSavingsAppletTileRepository$special$$inlined$map$1$2$1.result;
                Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realSavingsAppletTileRepository$special$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof RealSavingsAppletTileRepository$special$$inlined$map$2$2$1) {
                    realSavingsAppletTileRepository$special$$inlined$map$2$2$1 = (RealSavingsAppletTileRepository$special$$inlined$map$2$2$1) continuation;
                    int i43 = realSavingsAppletTileRepository$special$$inlined$map$2$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        realSavingsAppletTileRepository$special$$inlined$map$2$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj28 = realSavingsAppletTileRepository$special$$inlined$map$2$2$1.result;
                        Object obj29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realSavingsAppletTileRepository$special$$inlined$map$2$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            SavingsBalance savingsBalance = (SavingsBalance) obj;
                            Object savingsBalanceState = new SavingsRepositoryModel.SavingsBalanceState(savingsBalance != null ? savingsBalance.balance : null, savingsBalance != null ? Boolean.valueOf(savingsBalance.isAdopted) : null, false);
                            realSavingsAppletTileRepository$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(savingsBalanceState, realSavingsAppletTileRepository$special$$inlined$map$2$2$1) == obj29) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                realSavingsAppletTileRepository$special$$inlined$map$2$2$1 = new RealSavingsAppletTileRepository$special$$inlined$map$2$2$1(this, continuation);
                Object obj282 = realSavingsAppletTileRepository$special$$inlined$map$2$2$1.result;
                Object obj292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realSavingsAppletTileRepository$special$$inlined$map$2$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof RealSavingsAppletTileRepository$special$$inlined$map$3$2$1) {
                    realSavingsAppletTileRepository$special$$inlined$map$3$2$1 = (RealSavingsAppletTileRepository$special$$inlined$map$3$2$1) continuation;
                    int i44 = realSavingsAppletTileRepository$special$$inlined$map$3$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        realSavingsAppletTileRepository$special$$inlined$map$3$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj30 = realSavingsAppletTileRepository$special$$inlined$map$3$2$1.result;
                        Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realSavingsAppletTileRepository$special$$inlined$map$3$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            Set set = (Set) obj;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it2 = set.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (ArraysKt___ArraysKt.toSet(new EligibleFeature[]{EligibleFeature.DDA_TAB, EligibleFeature.MONEY_BTC_APPLET, EligibleFeature.MONEY_TAXES_APPLET, EligibleFeature.MONEY_FAMILIES_APPLET, EligibleFeature.MONEY_INVESTING_APPLET, EligibleFeature.MONEY_GLOBAL_BORROW_APPLET}).contains((EligibleFeature) it2.next())) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            Object valueOf = Boolean.valueOf(!z);
                            realSavingsAppletTileRepository$special$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(valueOf, realSavingsAppletTileRepository$special$$inlined$map$3$2$1) == obj31) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                realSavingsAppletTileRepository$special$$inlined$map$3$2$1 = new RealSavingsAppletTileRepository$special$$inlined$map$3$2$1(this, continuation);
                Object obj302 = realSavingsAppletTileRepository$special$$inlined$map$3$2$1.result;
                Object obj312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realSavingsAppletTileRepository$special$$inlined$map$3$2$1.label;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1) {
                    savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1 = (SavingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1) continuation;
                    int i45 = savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj33 = savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                        Object obj34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            GetSavingsBalance getSavingsBalance = (GetSavingsBalance) obj;
                            Object loadedSavingsModel = new LoadedSavingsModel(getSavingsBalance != null ? getSavingsBalance.balance : null);
                            savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loadedSavingsModel, savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1) == obj34) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1 = new SavingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1(this, continuation);
                Object obj332 = savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                Object obj342 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = savingsScreenPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1) {
                    savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1 = (SavingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1) continuation;
                    int i46 = savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj35 = savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.result;
                        Object obj36 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj35);
                            GetGeneralSavingsBalance getGeneralSavingsBalance = (GetGeneralSavingsBalance) obj;
                            Object loadedSavingsModel2 = new LoadedSavingsModel(getGeneralSavingsBalance != null ? getGeneralSavingsBalance.generalBalance : null);
                            savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(loadedSavingsModel2, savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1) == obj36) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj35);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1 = new SavingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1(this, continuation);
                Object obj352 = savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.result;
                Object obj362 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = savingsScreenPresenter$models$lambda$13$$inlined$map$2$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1) {
                    savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1 = (SavingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1) continuation;
                    int i47 = savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj37 = savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.result;
                        Object obj38 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            SavingsScreenViewEvent savingsScreenViewEvent = (SavingsScreenViewEvent) obj;
                            if ((savingsScreenViewEvent instanceof SavingsScreenViewEvent.SavingsCardEvent) && ((SavingsScreenViewEvent.SavingsCardEvent) savingsScreenViewEvent).f1198type == SavingsScreenViewEvent.SavingsCardEvent.CardType.FULL) {
                                savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1) == obj38) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1 = new SavingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1(this, continuation);
                Object obj372 = savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.result;
                Object obj382 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = savingsScreenPresenter$models$lambda$26$$inlined$filter$1$2$1.label;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1) {
                    savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1 = (SavingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1) continuation;
                    int i48 = savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj39 = savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.result;
                        Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj39);
                            SavingsScreenViewEvent savingsScreenViewEvent2 = (SavingsScreenViewEvent) obj;
                            savingsScreenViewEvent2.getClass();
                            Object obj41 = ((SavingsScreenViewEvent.SavingsCardEvent) savingsScreenViewEvent2).event;
                            savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj41, savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1) == obj40) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj39);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1 = new SavingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1(this, continuation);
                Object obj392 = savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.result;
                Object obj402 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = savingsScreenPresenter$models$lambda$26$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1) {
                    savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1 = (SavingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1) continuation;
                    int i49 = savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj43 = savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.result;
                        Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj43);
                            ActiveGoalProvider activeGoalProvider = (ActiveGoalProvider) obj;
                            Object loadedSavingsModel3 = new LoadedSavingsModel(activeGoalProvider != null ? activeGoalProvider.get() : null);
                            savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loadedSavingsModel3, savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1) == obj44) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj43);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1 = new SavingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1(this, continuation);
                Object obj432 = savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.result;
                Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = savingsScreenPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1) {
                    savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1 = (SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1) continuation;
                    int i50 = savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj45 = savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.result;
                        Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj45);
                            ActiveGoalProvider activeGoalProvider2 = (ActiveGoalProvider) obj;
                            Object loadedSavingsModel4 = new LoadedSavingsModel(activeGoalProvider2 != null ? activeGoalProvider2.get() : null);
                            savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(loadedSavingsModel4, savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1) == obj46) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj45);
                        }
                        break;
                    }
                }
                savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1 = new SavingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1(this, continuation);
                Object obj452 = savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.result;
                Object obj462 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = savingsScreenPresenter$models$lambda$8$$inlined$map$2$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof ScoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1) {
                    scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1 = (ScoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1) continuation;
                    int i51 = scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj47 = scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.result;
                        Object obj48 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj47);
                            Object valueOf2 = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                            scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1) == obj48) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj47);
                        }
                        break;
                    }
                }
                scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1 = new ScoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1(this, continuation);
                Object obj472 = scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.result;
                Object obj482 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = scoreAppletViewsModule$scoreApplet$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof SecurityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) {
                    securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = (SecurityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) continuation;
                    int i52 = securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj49 = securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                        Object obj50 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj49);
                            if (obj instanceof SecurityHubViewEvent.ProtectionsEvent) {
                                securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) == obj50) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj49);
                        }
                        break;
                    }
                }
                securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = new SecurityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj492 = securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                Object obj502 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = securityHubPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof SecurityHubPresenter$models$lambda$6$$inlined$map$1$2$1) {
                    securityHubPresenter$models$lambda$6$$inlined$map$1$2$1 = (SecurityHubPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                    int i53 = securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj51 = securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                        Object obj53 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj51);
                            Object obj54 = ((SecurityHubViewEvent.ProtectionsEvent) obj).event;
                            securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj54, securityHubPresenter$models$lambda$6$$inlined$map$1$2$1) == obj53) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj51);
                        }
                        break;
                    }
                }
                securityHubPresenter$models$lambda$6$$inlined$map$1$2$1 = new SecurityHubPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj512 = securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                Object obj532 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = securityHubPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof TimeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1) {
                    timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1 = (TimeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i54 = timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj55 = timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj55);
                            if (((SyncState$Progress) obj) != SyncState$Progress.IN_FLIGHT) {
                                timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1) == obj56) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj55);
                        }
                        break;
                    }
                }
                timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1 = new TimeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj552 = timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = timeToLiveSyncState$performSync$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof RealShareTargetsManager$buildTargets$$inlined$map$1$2$1) {
                    realShareTargetsManager$buildTargets$$inlined$map$1$2$1 = (RealShareTargetsManager$buildTargets$$inlined$map$1$2$1) continuation;
                    int i55 = realShareTargetsManager$buildTargets$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareTargetsManager$buildTargets$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj57 = realShareTargetsManager$buildTargets$$inlined$map$1$2$1.result;
                        Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = realShareTargetsManager$buildTargets$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj57);
                            Set set2 = Cashtags.SUPPORTED_SYMBOLS;
                            Object symbol = Moneys.symbol(Cashtags.guessCashtagCurrency(((Profile) obj).region));
                            realShareTargetsManager$buildTargets$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(symbol, realShareTargetsManager$buildTargets$$inlined$map$1$2$1) == obj58) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj57);
                        }
                        break;
                    }
                }
                realShareTargetsManager$buildTargets$$inlined$map$1$2$1 = new RealShareTargetsManager$buildTargets$$inlined$map$1$2$1(this, continuation);
                Object obj572 = realShareTargetsManager$buildTargets$$inlined$map$1$2$1.result;
                Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = realShareTargetsManager$buildTargets$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof RealShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1) {
                    realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1 = (RealShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1) continuation;
                    int i56 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj59 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.result;
                        Object obj60 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj59);
                            Object obj61 = ((ShareableAssetsManager$ShareableAssets) obj).cashtagUrl;
                            if (obj61 != null) {
                                realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj61, realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1) == obj60) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj59);
                        }
                        break;
                    }
                }
                realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1 = new RealShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj592 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.result;
                Object obj602 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof RealShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1) {
                    realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1 = (RealShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1) continuation;
                    int i57 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj63 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.result;
                        Object obj64 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj63);
                            Object obj65 = ((ShareableAssetsManager$ShareableAssets) obj).printableCashtagQrImage;
                            if (obj65 != null) {
                                realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.label = 1;
                                if (flowCollector.emit(obj65, realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1) == obj64) {
                                    break;
                                }
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj63);
                        }
                        break;
                    }
                }
                realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1 = new RealShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1(this, continuation);
                Object obj632 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.result;
                Object obj642 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realShareTargetsManager$buildTargets$$inlined$mapNotNull$2$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof RealShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1) {
                    realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1 = (RealShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1) continuation;
                    int i58 = realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj66 = realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.result;
                        Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj66);
                            Object shareableAssetsManager$ShareableAssets = new ShareableAssetsManager$ShareableAssets((String) obj, null, 2);
                            realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(shareableAssetsManager$ShareableAssets, realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1) == obj67) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj66);
                        }
                        break;
                    }
                }
                realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1 = new RealShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1(this, continuation);
                Object obj662 = realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.result;
                Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realShareableAssetsManager$loadShareableAssets$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof RealShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1) {
                    realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1 = (RealShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1) continuation;
                    int i59 = realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj68 = realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.result;
                        Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj68);
                            Object shareableAssetsManager$ShareableAssets2 = new ShareableAssetsManager$ShareableAssets(null, (ShareableAssetsManager$DownloadedImage) obj, 1);
                            realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(shareableAssetsManager$ShareableAssets2, realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1) == obj69) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj68);
                        }
                        break;
                    }
                }
                realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1 = new RealShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1(this, continuation);
                Object obj682 = realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.result;
                Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = realShareableAssetsManager$loadShareableAssets$$inlined$map$2$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1) {
                    realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1 = (RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1) continuation;
                    int i60 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj70 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.result;
                        Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj70);
                            FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                            Object obj73 = fullCashtag != null ? fullCashtag.cashtag_url : null;
                            if (obj73 != null) {
                                realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj73, realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1) == obj71) {
                                    break;
                                }
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj70);
                        }
                        break;
                    }
                }
                realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1 = new RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj702 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.result;
                Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1) {
                    realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1 = (RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1) continuation;
                    int i61 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj74 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.result;
                        Object obj75 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj74);
                            FullCashtag fullCashtag2 = ((PublicProfile) obj).fullCashtag;
                            Object obj76 = fullCashtag2 != null ? fullCashtag2.printable_cashtag_qr_image_url : null;
                            if (obj76 != null) {
                                realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.label = 1;
                                if (flowCollector.emit(obj76, realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1) == obj75) {
                                    break;
                                }
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj74);
                        }
                        break;
                    }
                }
                realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1 = new RealShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1(this, continuation);
                Object obj742 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.result;
                Object obj752 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = realShareableAssetsManager$loadShareableAssets$$inlined$mapNotNull$2$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
