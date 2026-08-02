package com.squareup.cash.account.presenters.documents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.documents.AccountStatementsManager$AccountStatementsInfo;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gcl.InstrumentLinkingPostcodeItem;
import com.squareup.cash.gcl.RealGlobalConfigProvider;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$lambda$0$$inlined$map$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.backend.real.RealTaxesDocumentsTaxReturnsDataProvider;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AccountDocumentsPresenter implements MoleculePresenter {
    public static final Calendar cal;
    public final MarkwonConfiguration accountStatementManager;
    public final RealAfterpayStatementManager afterpayStatementManager;
    public final Analytics analytics;
    public final DocumentsScreen args;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final ToolbarTuckTargets bitcoinTaxesEntryPointDataProvider;
    public final RealClientSyncer clientSyncer;
    public final EglCore cryptoStatementSyncer;
    public final RealDocumentEntitiesMapper documentEntitiesMapper;
    public final ToolbarTuckTargets documentsDisclosureTextProvider;
    public final RealDocumentsManager documentsManager;
    public final String endpoint;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final RealGlobalConfigProvider globalConfigProvider;
    public final IntentLauncher intentLauncher;
    public final MetadataRepo legalDocumentManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final EglCore savingsTaxDocumentManager;
    public final AndroidStringManager stringManager;
    public final RealTaxesDocumentsTaxReturnsDataProvider taxesDocumentsTaxReturnsDataProvider;
    public final RealWagesTaxDocumentManager wagesTaxDocumentManager;
    public final String webPortalBaseUrl;

    /* loaded from: classes5.dex */
    public final class CategoryContent {
        public final AccountStatementsManager$AccountStatementsInfo accountStatementsInfo;
        public final AccountStatementsManager$AccountStatementsInfo cardFeesStatementsInfo;
        public final List categories;
        public final String categoryName;
        public final List documents;
        public final boolean hasAfterpayStatements;
        public final boolean hasLegalDocuments;
        public final boolean hasSavingsTaxDocuments;
        public final boolean hasWagesDocuments;
        public final AccountStatementsManager$AccountStatementsInfo payOverTimeStatementsInfo;
        public final AccountStatementsManager$AccountStatementsInfo savingStatementsInfo;
        public final boolean showBitcoinDocuments;
        public final boolean showInvestingDocuments;
        public final String taxReturnsTitle;

        public CategoryContent(AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo, AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo2, boolean z, AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo3, boolean z2, boolean z3, List list, List list2, String str, String str2, boolean z4, boolean z5, AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo4, boolean z6) {
            accountStatementsManager$AccountStatementsInfo.getClass();
            accountStatementsManager$AccountStatementsInfo2.getClass();
            accountStatementsManager$AccountStatementsInfo3.getClass();
            list.getClass();
            list2.getClass();
            str.getClass();
            accountStatementsManager$AccountStatementsInfo4.getClass();
            this.accountStatementsInfo = accountStatementsManager$AccountStatementsInfo;
            this.savingStatementsInfo = accountStatementsManager$AccountStatementsInfo2;
            this.hasSavingsTaxDocuments = z;
            this.payOverTimeStatementsInfo = accountStatementsManager$AccountStatementsInfo3;
            this.hasAfterpayStatements = z2;
            this.hasLegalDocuments = z3;
            this.categories = list;
            this.documents = list2;
            this.categoryName = str;
            this.taxReturnsTitle = str2;
            this.showInvestingDocuments = z4;
            this.showBitcoinDocuments = z5;
            this.cardFeesStatementsInfo = accountStatementsManager$AccountStatementsInfo4;
            this.hasWagesDocuments = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryContent)) {
                return false;
            }
            CategoryContent categoryContent = (CategoryContent) obj;
            return Intrinsics.areEqual(this.accountStatementsInfo, categoryContent.accountStatementsInfo) && Intrinsics.areEqual(this.savingStatementsInfo, categoryContent.savingStatementsInfo) && this.hasSavingsTaxDocuments == categoryContent.hasSavingsTaxDocuments && Intrinsics.areEqual(this.payOverTimeStatementsInfo, categoryContent.payOverTimeStatementsInfo) && this.hasAfterpayStatements == categoryContent.hasAfterpayStatements && this.hasLegalDocuments == categoryContent.hasLegalDocuments && Intrinsics.areEqual(this.categories, categoryContent.categories) && Intrinsics.areEqual(this.documents, categoryContent.documents) && Intrinsics.areEqual(this.categoryName, categoryContent.categoryName) && Intrinsics.areEqual(this.taxReturnsTitle, categoryContent.taxReturnsTitle) && this.showInvestingDocuments == categoryContent.showInvestingDocuments && this.showBitcoinDocuments == categoryContent.showBitcoinDocuments && Intrinsics.areEqual(this.cardFeesStatementsInfo, categoryContent.cardFeesStatementsInfo) && this.hasWagesDocuments == categoryContent.hasWagesDocuments;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.payOverTimeStatementsInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.savingStatementsInfo.hashCode() + (this.accountStatementsInfo.hashCode() * 31)) * 31, 31, this.hasSavingsTaxDocuments)) * 31, 31, this.hasAfterpayStatements), 31, this.hasLegalDocuments), 31, this.categories), 31, this.documents), 31, this.categoryName);
            String str = this.taxReturnsTitle;
            return Boolean.hashCode(this.hasWagesDocuments) + ((this.cardFeesStatementsInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.showInvestingDocuments), 31, this.showBitcoinDocuments)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CategoryContent(accountStatementsInfo=");
            sb.append(this.accountStatementsInfo);
            sb.append(", savingStatementsInfo=");
            sb.append(this.savingStatementsInfo);
            sb.append(", hasSavingsTaxDocuments=");
            sb.append(this.hasSavingsTaxDocuments);
            sb.append(", payOverTimeStatementsInfo=");
            sb.append(this.payOverTimeStatementsInfo);
            sb.append(", hasAfterpayStatements=");
            re$$ExternalSyntheticOutline0.m(sb, this.hasAfterpayStatements, ", hasLegalDocuments=", this.hasLegalDocuments, ", categories=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.categories, ", documents=", this.documents, ", categoryName=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.categoryName, ", taxReturnsTitle=", this.taxReturnsTitle, ", showInvestingDocuments=");
            re$$ExternalSyntheticOutline0.m(sb, this.showInvestingDocuments, ", showBitcoinDocuments=", this.showBitcoinDocuments, ", cardFeesStatementsInfo=");
            sb.append(this.cardFeesStatementsInfo);
            sb.append(", hasWagesDocuments=");
            sb.append(this.hasWagesDocuments);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatementType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkResult.Companion companion = StatementType.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkResult.Companion companion2 = StatementType.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LinkResult.Companion companion3 = StatementType.Companion;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkResult.Companion companion4 = StatementType.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LinkResult.Companion companion5 = StatementType.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountDocumentsViewEvent.DocumentCategory.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory2 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory3 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory4 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory5 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory6 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory7 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AccountDocumentsViewEvent.DocumentCategory documentCategory8 = AccountDocumentsViewEvent.DocumentCategory.BITCOIN;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.getClass();
        cal = calendar;
    }

    public AccountDocumentsPresenter(AndroidStringManager androidStringManager, EglCore eglCore, MetadataRepo metadataRepo, RealClientSyncer realClientSyncer, RealDocumentsManager realDocumentsManager, MarkwonConfiguration markwonConfiguration, RealDocumentEntitiesMapper realDocumentEntitiesMapper, Analytics analytics, IntentLauncher intentLauncher, String str, RealTaxesDocumentsTaxReturnsDataProvider realTaxesDocumentsTaxReturnsDataProvider, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, FeatureFlagManager featureFlagManager, DocumentsScreen documentsScreen, BetterNavigator.ScreenNavigator screenNavigator, RealGlobalConfigProvider realGlobalConfigProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealAfterpayStatementManager realAfterpayStatementManager, EglCore eglCore2, String str2, ToolbarTuckTargets toolbarTuckTargets, RealWagesTaxDocumentManager realWagesTaxDocumentManager, ToolbarTuckTargets toolbarTuckTargets2, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        documentsScreen.getClass();
        this.stringManager = androidStringManager;
        this.cryptoStatementSyncer = eglCore;
        this.legalDocumentManager = metadataRepo;
        this.clientSyncer = realClientSyncer;
        this.documentsManager = realDocumentsManager;
        this.accountStatementManager = markwonConfiguration;
        this.documentEntitiesMapper = realDocumentEntitiesMapper;
        this.analytics = analytics;
        this.intentLauncher = intentLauncher;
        this.webPortalBaseUrl = str;
        this.taxesDocumentsTaxReturnsDataProvider = realTaxesDocumentsTaxReturnsDataProvider;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.featureFlagManager = featureFlagManager;
        this.args = documentsScreen;
        this.navigator = screenNavigator;
        this.globalConfigProvider = realGlobalConfigProvider;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.afterpayStatementManager = realAfterpayStatementManager;
        this.savingsTaxDocumentManager = eglCore2;
        this.endpoint = str2;
        this.bitcoinTaxesEntryPointDataProvider = toolbarTuckTargets;
        this.wagesTaxDocumentManager = realWagesTaxDocumentManager;
        this.documentsDisclosureTextProvider = toolbarTuckTargets2;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r9.syncTaxDocuments(r1) != r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r10.syncCustomerStatementTypes(r1) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r10.syncStatements(r1) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$syncStatements(AccountDocumentsPresenter accountDocumentsPresenter, ContinuationImpl continuationImpl) {
        AccountDocumentsPresenter$syncStatements$1 accountDocumentsPresenter$syncStatements$1;
        int i;
        RealGlobalConfigProvider realGlobalConfigProvider = accountDocumentsPresenter.globalConfigProvider;
        if (continuationImpl instanceof AccountDocumentsPresenter$syncStatements$1) {
            accountDocumentsPresenter$syncStatements$1 = (AccountDocumentsPresenter$syncStatements$1) continuationImpl;
            int i2 = accountDocumentsPresenter$syncStatements$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountDocumentsPresenter$syncStatements$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountDocumentsPresenter$syncStatements$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDocumentsPresenter$syncStatements$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = accountDocumentsPresenter.cryptoStatementSyncer;
                    accountDocumentsPresenter$syncStatements$1.label = 1;
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$2)).booleanValue()) {
                        MetadataRepo metadataRepo = accountDocumentsPresenter.legalDocumentManager;
                        accountDocumentsPresenter$syncStatements$1.label = 3;
                        Object withContext = JobKt.withContext((CoroutineContext) metadataRepo.mRootNode, new GooglePayPresenter$models$1$1(metadataRepo, continuation, 6), accountDocumentsPresenter$syncStatements$1);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                    }
                    accountDocumentsPresenter.clientSyncer.sync(SyncTrigger.USER_ACTION, SyncScope.Global.INSTANCE);
                    EglCore eglCore2 = accountDocumentsPresenter.savingsTaxDocumentManager;
                    accountDocumentsPresenter$syncStatements$1.label = 4;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    accountDocumentsPresenter.clientSyncer.sync(SyncTrigger.USER_ACTION, SyncScope.Global.INSTANCE);
                    EglCore eglCore22 = accountDocumentsPresenter.savingsTaxDocumentManager;
                    accountDocumentsPresenter$syncStatements$1.label = 4;
                }
                if (((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$1)).booleanValue()) {
                    MarkwonConfiguration markwonConfiguration = accountDocumentsPresenter.accountStatementManager;
                    accountDocumentsPresenter$syncStatements$1.label = 2;
                }
                if (((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$2)).booleanValue()) {
                }
                accountDocumentsPresenter.clientSyncer.sync(SyncTrigger.USER_ACTION, SyncScope.Global.INSTANCE);
                EglCore eglCore222 = accountDocumentsPresenter.savingsTaxDocumentManager;
                accountDocumentsPresenter$syncStatements$1.label = 4;
            }
        }
        accountDocumentsPresenter$syncStatements$1 = new AccountDocumentsPresenter$syncStatements$1(accountDocumentsPresenter, continuationImpl);
        Object obj3 = accountDocumentsPresenter$syncStatements$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDocumentsPresenter$syncStatements$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$1)).booleanValue()) {
        }
        if (((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$2)).booleanValue()) {
        }
        accountDocumentsPresenter.clientSyncer.sync(SyncTrigger.USER_ACTION, SyncScope.Global.INSTANCE);
        EglCore eglCore2222 = accountDocumentsPresenter.savingsTaxDocumentManager;
        accountDocumentsPresenter$syncStatements$1.label = 4;
    }

    public static StatementType toStatementType(DocumentsScreen documentsScreen) {
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE)) {
            return StatementType.STOCK_TAX_FORM;
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE) || (documentsScreen instanceof DocumentsScreen.DocumentsScreenStockMonthlyForMonth)) {
            return StatementType.STOCK_MONTHLY_STATEMENT;
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE)) {
            return StatementType.BTC_TAX_FORM;
        }
        if ((documentsScreen instanceof DocumentsScreen.DocumentsScreenCategory) || (documentsScreen instanceof DocumentsScreen.DocumentsScreenStatements) || (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiStatementAccount) || (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiSavingsAccount) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenLegalDocument.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentScreenPayOverTimeDocuments.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenCardFeesDocuments.INSTANCE) || Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenWages.INSTANCE)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(documentsScreen, "Unexpected documentRecordsScreen: ");
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(688170957);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new AccountDocumentsViewModel(title(this.args), EmptyList.INSTANCE, (StatementType) null, (String) null, 24));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new EditProfilePresenter$models$2$1(flow, continuation, this, 8));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new BlockRunner$cancel$1(this, continuation, 27);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new NetworkFetcher$doFetch$2(this, mutableState, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) mutableState.getValue();
        gapComposer.end(false);
        return accountDocumentsViewModel;
    }

    public final RealShareableAssetsManager$download$lambda$0$$inlined$map$1 multiStatementAccountViewModel(com.squareup.protos.cash.registrar.api.StatementType statementType) {
        return new RealShareableAssetsManager$download$lambda$0$$inlined$map$1((Flow) this.accountStatementManager.customerStatementTypeDetails(statementType), (Object) statementType, (Object) this, title(this.args), 1);
    }

    public final String title(DocumentsScreen documentsScreen) {
        boolean z = documentsScreen instanceof DocumentsScreen.DocumentsScreenCategory;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            return androidStringManager.get(R.string.documents_category_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE)) {
            return androidStringManager.get(R.string.stock_documents_type_selection_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE)) {
            return androidStringManager.get(R.string.documents_tax_stock_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE)) {
            return androidStringManager.get(R.string.documents_tax_savings_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE) || (documentsScreen instanceof DocumentsScreen.DocumentsScreenStockMonthlyForMonth)) {
            return androidStringManager.get(R.string.stock_monthly_statements_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE)) {
            return androidStringManager.get(R.string.documents_tax_bitcoin_title);
        }
        if (documentsScreen instanceof DocumentsScreen.DocumentsScreenStatements) {
            return (String) ((DocumentsScreen.DocumentsScreenStatements) documentsScreen).displayName.getValue();
        }
        if (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiStatementAccount) {
            return androidStringManager.get(R.string.documents_category_statements);
        }
        if (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiSavingsAccount) {
            return androidStringManager.get(R.string.documents_category_savings);
        }
        if (documentsScreen instanceof DocumentsScreen.DocumentsScreenLegalDocument) {
            return androidStringManager.get(R.string.documents_legal_documents_title);
        }
        if (documentsScreen instanceof DocumentsScreen.DocumentScreenPayOverTimeDocuments) {
            return androidStringManager.get(R.string.documents_cash_app_afterpay_documents_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE)) {
            return androidStringManager.get(R.string.documents_afterpay_documents_title);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenCardFeesDocuments.INSTANCE)) {
            return androidStringManager.get(R.string.documents_category_card_fees);
        }
        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenWages.INSTANCE)) {
            return androidStringManager.get(R.string.documents_wages_title);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
