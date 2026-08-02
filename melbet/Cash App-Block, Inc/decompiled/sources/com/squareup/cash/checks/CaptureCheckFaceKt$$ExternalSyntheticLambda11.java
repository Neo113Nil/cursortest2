package com.squareup.cash.checks;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.LifecycleOwner;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayEvent$Submit;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorResult$Positive;
import com.squareup.cash.blockers.viewmodels.FilesetUploadLoadingResult$Negative;
import com.squareup.cash.blockers.viewmodels.FilesetUploadOptionsSheetResult;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$ContouredText;
import com.squareup.cash.card.onboarding.core.ContouredTextOverlay$dispose$1$1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.GridInteractionController;
import com.squareup.cash.cdf.contact.ContactUpdateAdded;
import com.squareup.cash.cdf.contact.ContactUpdateRemoved;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.CheckDepositAmountViewEvent;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.persistence.ShadowedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.SqlSyncRangeStore;
import com.squareup.cash.clientsync.pipeline.InvitationSyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidUseJanusContactAliases;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.scrubbing.MoneyScrubber;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.NotificationPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.InstrumentLinkingOption;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.franklin.ui.ScenarioPlanEntry;
import com.squareup.protos.franklin.ui.ScenarioPlanMap;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.android.ToastKt;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda11(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object invoke$com$squareup$cash$data$transfers$RealTransferManager$transferFunds$2$$ExternalSyntheticLambda0(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel;
        int i;
        Iterator it;
        Object obj2;
        Region region;
        Object obj3;
        int i2 = this.$r8$classId;
        int i3 = 6;
        int i4 = 1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                CaptureCheckFaceViewModel.Loaded.ShowMiSnap showMiSnap = (CaptureCheckFaceViewModel.Loaded.ShowMiSnap) obj5;
                ((Context) obj).getClass();
                MiSnapView miSnapView = (MiSnapView) ((MutableState) obj6).getValue();
                MiSnapSettings miSnapSettings = new MiSnapSettings(showMiSnap.miSnapUseCase, showMiSnap.miSnapLicense);
                miSnapSettings.analysis.document.e = MiSnapSettings.Analysis.Document.Trigger.AUTO;
                miSnapSettings.camera.b = MiSnapSettings.Camera.Profile.DOCUMENT_BACK_CAMERA;
                MiSnapView.startMiSnapSession$default(miSnapView, miSnapSettings, (LifecycleOwner) obj4, null, 8);
                return miSnapView;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                int i5 = 0;
                for (Object obj7 : (ArrayList) obj6) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    int i7 = 0;
                    for (Object obj8 : (List) obj7) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        placementScope.place(((Measurable) obj8).mo833measureBRTryo0(ConstraintsKt.Constraints(((Number) arrayList.get(i7)).intValue(), ((Number) arrayList.get(i7)).intValue(), ((Number) arrayList2.get(i5)).intValue(), ((Number) arrayList2.get(i5)).intValue())), CollectionsKt.sumOfInt(CollectionsKt.take(arrayList, i7)), CollectionsKt.sumOfInt(CollectionsKt.take(arrayList2, i5)), RecyclerView.DECELERATION_RATE);
                        i7 = i8;
                    }
                    i5 = i6;
                }
                return Unit.INSTANCE;
            case 2:
                BitcoinHomeViewModel bitcoinHomeViewModel = (BitcoinHomeViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                zzc zzcVar = (zzc) obj4;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                if (!(bitcoinHomeViewModel instanceof BitcoinHomeViewModel.Loading)) {
                    if (!(bitcoinHomeViewModel instanceof BitcoinHomeViewModel.Ready)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new BankingDialogKt$$ExternalSyntheticLambda8(bitcoinHomeViewModel, 22), true, -531673817), 3);
                    BitcoinHomeViewModel.Ready ready = (BitcoinHomeViewModel.Ready) bitcoinHomeViewModel;
                    int i9 = 0;
                    for (Object obj9 : ready.getWidgets()) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel2 = (BitcoinHomeWidgetViewModel) ready.getWidgetViewModels().get((BitcoinWidget) obj9);
                        if (bitcoinHomeWidgetViewModel2 instanceof BitcoinBalanceWidgetViewModel) {
                            BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel = (BitcoinBalanceWidgetViewModel) bitcoinHomeWidgetViewModel2;
                            bitcoinHomeWidgetViewModel = new BitcoinBalanceWidgetViewModel(bitcoinBalanceWidgetViewModel.amount, bitcoinBalanceWidgetViewModel.subAmount, bitcoinHomeViewModel.getToolbarViewModel().title, bitcoinBalanceWidgetViewModel.rawAmount);
                        } else {
                            bitcoinHomeWidgetViewModel = bitcoinHomeWidgetViewModel2;
                        }
                        LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new BitcoinHomeViewKt$$ExternalSyntheticLambda9(bitcoinHomeWidgetViewModel, lazyScaffoldContentScope, zzcVar, function1, i9, bitcoinHomeViewModel), true, -1206255964), 3);
                        i9 = i10;
                    }
                    LazyListScope.item$default(lazyScaffoldContentScope, null, null, BitcoinHomeViewKt.lambda$1452471184, 3);
                }
                return Unit.INSTANCE;
            case 3:
                Function0 function0 = (Function0) obj4;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((BitcoinSettingsWidgetOption) obj6).getPrimaryText() + ", " + ((String) obj5));
                if (function0 != null) {
                    SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                }
                return Unit.INSTANCE;
            case 4:
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj6;
                Function1 function12 = (Function1) obj4;
                LazyScaffoldContentScope lazyScaffoldContentScope2 = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope2.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope2, "page-header", null, new ComposableLambdaImpl(new BorrowHomeKt$$ExternalSyntheticLambda0(11, filesetUploadViewModel, (Function0) obj5), true, 1266536118), 2);
                if (!filesetUploadViewModel.attachedFiles.isEmpty()) {
                    LazyListScope.item$default(lazyScaffoldContentScope2, "files-header", null, new ComposableLambdaImpl(new SsnViewKt$$ExternalSyntheticLambda2(filesetUploadViewModel, 9), true, -361934703), 2);
                    for (FilesetUploadViewModel.FileViewModel fileViewModel : filesetUploadViewModel.attachedFiles) {
                        LazyListScope.item$default(lazyScaffoldContentScope2, fileViewModel.id, null, new ComposableLambdaImpl(new BorrowHomeKt$$ExternalSyntheticLambda0(function12, fileViewModel, false, 12), true, 790695778), 2);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Function1 function13 = (Function1) obj6;
                ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) obj5;
                Context context = (Context) obj4;
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    Object obj10 = onDialogResult.result;
                    Screen screen = onDialogResult.screen;
                    if (screen instanceof BlockersScreens.FilesetUploadLoadingDialog) {
                        if (Intrinsics.areEqual(obj10, FilesetUploadLoadingResult$Negative.INSTANCE)) {
                            function13.invoke(FilesetUploadViewEvent.CancelUpload.INSTANCE);
                        }
                    } else if (screen instanceof BlockersScreens.FilesetUploadErrorDialog) {
                        if (Intrinsics.areEqual(obj10, FilesetUploadErrorResult$Positive.INSTANCE)) {
                            function13.invoke(FilesetUploadViewEvent.RetryUpload.INSTANCE);
                        }
                    } else if (screen instanceof BlockersScreens.FilesetUploadOptionsBottomSheet) {
                        FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult = obj10 instanceof FilesetUploadOptionsSheetResult ? (FilesetUploadOptionsSheetResult) obj10 : null;
                        if (filesetUploadOptionsSheetResult != null) {
                            function13.invoke(new FilesetUploadViewEvent.UploadingOptionSelected(filesetUploadOptionsSheetResult));
                            if (filesetUploadOptionsSheetResult == FilesetUploadOptionsSheetResult.UPLOAD_A_FILE) {
                                try {
                                    managedActivityResultLauncher.launch("*/*");
                                } catch (ActivityNotFoundException unused) {
                                    ToastKt.toast(context, R.string.no_intent_handler, 1);
                                } catch (SecurityException unused2) {
                                    ToastKt.toast(context, R.string.no_intent_handler, 1);
                                }
                            }
                        }
                    }
                } else if (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).screen instanceof BlockersScreens.FilesetUploadOptionsBottomSheet) {
                    function13.invoke(new FilesetUploadViewEvent.UploadingOptionSelected(FilesetUploadOptionsSheetResult.CLOSE));
                }
                return Unit.INSTANCE;
            case 6:
                BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj5;
                MutableState mutableState = (MutableState) obj6;
                MutableState mutableState2 = (MutableState) obj4;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                String str = textFieldValue.annotatedString.text;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String take = StringsKt___StringsKt.take(bankAccountLinkingViewModel.maxDigits, sb.toString());
                mutableState.setValue(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue, take, 0L, 6));
                mutableState2.setValue(Boolean.valueOf(new IntRange(bankAccountLinkingViewModel.minDigits, bankAccountLinkingViewModel.maxDigits, 1).contains(take.length())));
                return Unit.INSTANCE;
            case 7:
                ((KeyboardActionScope) obj).getClass();
                ((Function1) obj5).invoke(new BirthdayEvent$Submit(((TextFieldValue) ((MutableState) obj6).getValue()).annotatedString.text, ((TouchRecorder) obj4).getSignalsContext()));
                return Unit.INSTANCE;
            case 8:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function1 function14 = (Function1) obj4;
                MutableState mutableState3 = (MutableState) obj6;
                ((KeyboardActionScope) obj).getClass();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function14.invoke(new ReferralCodeViewEvent.SubmitAction((String) mutableState3.getValue()));
                return Unit.INSTANCE;
            case 9:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj6;
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj5;
                Function1 function15 = (Function1) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4(expandedLoanHistoryListModel, 0), true, 995559683), 3);
                boolean z = ((ItemSnapshotList) lazyPagingItems.itemSnapshotList$delegate.getValue()).getSize() != 0;
                LazyListScope.items$default(lazyListScope, z ? ((ItemSnapshotList) lazyPagingItems.itemSnapshotList$delegate.getValue()).getSize() : expandedLoanHistoryListModel.initialLoans.size(), null, new ComposableLambdaImpl(new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(z, lazyPagingItems, expandedLoanHistoryListModel, function15), true, 1758858650), 6);
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new SectionKt$$ExternalSyntheticLambda2(12, (CombinedLoadStates) lazyPagingItems.loadState$delegate.getValue(), expandedLoanHistoryListModel, lazyPagingItems), true, -260918036), 3);
                return Unit.INSTANCE;
            case 10:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj5)).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates).top);
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj4)).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates).top - ((Density) obj6).mo236toPx0680j_4(12.0f));
                return Unit.INSTANCE;
            case 11:
                CompletableDeferred completableDeferred = (CompletableDeferred) obj6;
                WriteOperation writeOperation = (WriteOperation) obj5;
                CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = (CardAssetManager$AssetKey$ContouredText) obj4;
                if (completableDeferred.isCompleted() && !completableDeferred.isCancelled()) {
                    ((Engine) writeOperation.sdkCore).launch(new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, null, 3));
                }
                return Unit.INSTANCE;
            case 12:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj4;
                long j = ((IntSize) obj).packedValue;
                int i12 = (int) (j >> 32);
                if (i12 > 0 && (i = (int) (j & BodyPartID.bodyIdMax)) > 0) {
                    parcelableSnapshotMutableIntState.setIntValue(i12);
                    parcelableSnapshotMutableIntState2.setIntValue(i);
                    float f = i12;
                    float f2 = i;
                    cardDesignLibraryScene.screenWidth = f;
                    cardDesignLibraryScene.screenHeight = f2;
                    float f3 = f / f2;
                    cardDesignLibraryScene.screenAspectRatio = f3;
                    GridInteractionController gridInteractionController = cardDesignLibraryScene.interactionController;
                    gridInteractionController.screenAspectRatio = f3;
                    cardDesignLibraryScene.camera.setAspectRatio(f3);
                    if (cardDesignLibraryScene.isInitialized) {
                        gridInteractionController.applyFarRestOffset();
                    }
                    if (cardDesignLibraryScene.gridConfig != null) {
                        cardDesignLibraryScene.updateCamera(gridInteractionController.currentRenderParams$views());
                    }
                    cardDesignLibraryScene.updateVisibleCards(RecyclerView.DECELERATION_RATE);
                    cardDesignLibraryScene.markDirty();
                }
                return Unit.INSTANCE;
            case 13:
                Set set = (Set) obj6;
                String str2 = (String) obj5;
                Function1 function16 = (Function1) obj4;
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                if (!set.contains(str2)) {
                    LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(layoutCoordinates2);
                    Rect localBoundingBoxOf = ValueInsets.findRootCoordinates(layoutCoordinates2).localBoundingBoxOf(layoutCoordinates2, true);
                    if (localBoundingBoxOf.top < ((int) (findRootCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) && localBoundingBoxOf.bottom > RecyclerView.DECELERATION_RATE) {
                        set.add(str2);
                        function16.invoke(str2);
                    }
                }
                return Unit.INSTANCE;
            case 14:
                MoneyScrubber moneyScrubber = (MoneyScrubber) obj5;
                MutableState mutableState4 = (MutableState) obj6;
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                TextFieldValue textFieldValue3 = (TextFieldValue) mutableState4.getValue();
                moneyScrubber.getClass();
                textFieldValue3.getClass();
                mutableState4.setValue(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue2, moneyScrubber.scrub(textFieldValue3.annotatedString.text, textFieldValue2.annotatedString.text), 0L, 6));
                ((Function1) obj4).invoke(new CheckDepositAmountViewEvent.AmountChanged(((TextFieldValue) mutableState4.getValue()).annotatedString.text));
                return Unit.INSTANCE;
            case 15:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj6);
                ((zzb) ((LocalTabContentQueries) obj5).local_tab_contentAdapter).getClass();
                ((SyncEntityType) obj4).getClass();
                androidStatement.bindLong(1, Long.valueOf(r10.value));
                return Unit.INSTANCE;
            case 16:
                InstrumentQueries instrumentQueries = (InstrumentQueries) ((SqlSyncRangeStore) obj5).syncRangeQueries;
                List<SyncRange> list = (List) obj4;
                ((TransactionWrapper) obj).getClass();
                List list2 = (List) obj6;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((SyncRange) it2.next()).bytes);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    byte[] bArr = (byte[]) it3.next();
                    instrumentQueries.driver.execute(null, re$$ExternalSyntheticOutline0.m("\n        |DELETE FROM entity_range\n        |WHERE range ", bArr == null ? "IS" : "=", " ?\n        "), new OfflineQueries$$ExternalSyntheticLambda0(bArr, 3));
                    instrumentQueries.notifyQueries(-532169858, new ContactQueries$$ExternalSyntheticLambda1(20));
                }
                for (SyncRange syncRange : list) {
                    instrumentQueries.driver.execute(-718547088, "INSERT OR IGNORE INTO entity_range\nVALUES (?, ?)", new PoolGoalMetKt$$ExternalSyntheticLambda6(syncRange.bytes, instrumentQueries, syncRange.topic.value, 11));
                    instrumentQueries.notifyQueries(-718547088, new ContactQueries$$ExternalSyntheticLambda1(19));
                }
                return Unit.INSTANCE;
            case 17:
                ShadowedSyncRangeStore shadowedSyncRangeStore = (ShadowedSyncRangeStore) obj6;
                List list3 = (List) obj5;
                List list4 = (List) obj4;
                int i13 = shadowedSyncRangeStore.operationIdGenerator;
                shadowedSyncRangeStore.operationIdGenerator = i13 + 1;
                shadowedSyncRangeStore.audit(i13, "replaceRanges:before");
                shadowedSyncRangeStore.mainStore.replaceRanges(list3, list4);
                try {
                    shadowedSyncRangeStore.shadowStore.replaceRanges(list3, list4);
                } catch (Throwable th) {
                    shadowedSyncRangeStore.reportError("There was an error while trying to perform replaceRanges.", th);
                }
                shadowedSyncRangeStore.audit(i13, "replaceRanges:after");
                return Unit.INSTANCE;
            case 18:
                List<SyncRange> list5 = (List) obj4;
                ((TransactionWrapper) obj).getClass();
                final LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) ((SqlSyncRangeStore) obj5).syncRangeQueries;
                for (SyncRange syncRange2 : (List) obj6) {
                    localTabContentQueries.getClass();
                    syncRange2.getClass();
                    final SyncTopic syncTopic = syncRange2.topic;
                    final byte[] bArr2 = syncRange2.bytes;
                    syncTopic.getClass();
                    bArr2.getClass();
                    final int i14 = 1;
                    localTabContentQueries.driver.execute(2001368313, "DELETE FROM sync_range\nWHERE topic = ? AND bytes = ?", new Function1() { // from class: com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            int i15 = i14;
                            byte[] bArr3 = bArr2;
                            SyncTopic syncTopic2 = syncTopic;
                            LocalTabContentQueries localTabContentQueries2 = localTabContentQueries;
                            AndroidStatement androidStatement2 = (AndroidStatement) obj11;
                            androidStatement2.getClass();
                            switch (i15) {
                                case 0:
                                    ((com.google.mlkit.common.internal.zzc) localTabContentQueries2.local_tab_contentAdapter).getClass();
                                    syncTopic2.getClass();
                                    androidStatement2.bindLong(0, Long.valueOf(syncTopic2.value));
                                    androidStatement2.bindBytes(1, bArr3);
                                    break;
                                default:
                                    ((com.google.mlkit.common.internal.zzc) localTabContentQueries2.local_tab_contentAdapter).getClass();
                                    syncTopic2.getClass();
                                    androidStatement2.bindLong(0, Long.valueOf(syncTopic2.value));
                                    androidStatement2.bindBytes(1, bArr3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    localTabContentQueries.notifyQueries(2001368313, new SyncRangeQueries$$ExternalSyntheticLambda1(14));
                }
                for (SyncRange syncRange3 : list5) {
                    localTabContentQueries.getClass();
                    syncRange3.getClass();
                    final SyncTopic syncTopic2 = syncRange3.topic;
                    final byte[] bArr3 = syncRange3.bytes;
                    syncTopic2.getClass();
                    bArr3.getClass();
                    final int i15 = 0;
                    localTabContentQueries.driver.execute(-2141933049, "INSERT OR IGNORE INTO sync_range\nVALUES (?, ?)", new Function1() { // from class: com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            int i152 = i15;
                            byte[] bArr32 = bArr3;
                            SyncTopic syncTopic22 = syncTopic2;
                            LocalTabContentQueries localTabContentQueries2 = localTabContentQueries;
                            AndroidStatement androidStatement2 = (AndroidStatement) obj11;
                            androidStatement2.getClass();
                            switch (i152) {
                                case 0:
                                    ((com.google.mlkit.common.internal.zzc) localTabContentQueries2.local_tab_contentAdapter).getClass();
                                    syncTopic22.getClass();
                                    androidStatement2.bindLong(0, Long.valueOf(syncTopic22.value));
                                    androidStatement2.bindBytes(1, bArr32);
                                    break;
                                default:
                                    ((com.google.mlkit.common.internal.zzc) localTabContentQueries2.local_tab_contentAdapter).getClass();
                                    syncTopic22.getClass();
                                    androidStatement2.bindLong(0, Long.valueOf(syncTopic22.value));
                                    androidStatement2.bindBytes(1, bArr32);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    localTabContentQueries.notifyQueries(-2141933049, new SyncRangeQueries$$ExternalSyntheticLambda1(13));
                }
                return Unit.INSTANCE;
            case 19:
                InvitationSyncEntityStorageObserver invitationSyncEntityStorageObserver = (InvitationSyncEntityStorageObserver) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries = (SessionQueries) invitationSyncEntityStorageObserver.invitationEntityQueries;
                sessionQueries.getClass();
                str3.getClass();
                sessionQueries.driver.execute(-1684991471, "INSERT OR REPLACE INTO invitationEntity\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str3, str4, 11));
                sessionQueries.notifyQueries(-1684991471, new InstrumentQueries$$ExternalSyntheticLambda2(6, false));
                ContactQueries contactQueries = (ContactQueries) invitationSyncEntityStorageObserver.contactQueries;
                contactQueries.getClass();
                str4.getClass();
                contactQueries.driver.execute(390475014, "UPDATE contact\nSET already_invited=0\nWHERE EXISTS (\n\tSELECT hashed_alias FROM contact_alias\n\tWHERE hashed_alias=?\n\t\tAND contact.lookup_key=contact_alias.lookup_key\n)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str4, 8));
                contactQueries.notifyQueries(390475014, new WebLoginConfigQueries$$ExternalSyntheticLambda2(28, false));
                return Unit.INSTANCE;
            case 20:
                Function1 function17 = (Function1) obj6;
                RealSyncValueReaderV2 realSyncValueReaderV2 = (RealSyncValueReaderV2) obj5;
                SyncValueSpec syncValueSpec = (SyncValueSpec) obj4;
                List list6 = (List) obj;
                list6.getClass();
                List list7 = list6;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                Iterator it4 = list7.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(function17.invoke(syncValueSpec.getPayload(realSyncValueReaderV2.entityDecryptor.decryptEntity((SyncEntity) it4.next()).entityProto)));
                }
                return arrayList4;
            case 21:
                View view = (View) obj;
                view.getClass();
                ((Function1) obj5).invoke(view);
                ((MutableState) obj6).setValue((String) ((Function1) obj4).invoke(view));
                return Unit.INSTANCE;
            case 22:
                RealContactRepository realContactRepository = (RealContactRepository) obj6;
                SelectRegion selectRegion = (SelectRegion) obj4;
                ((TransactionWrapper) obj).getClass();
                Analytics analytics = realContactRepository.analytics;
                ContactQueries contactQueries2 = realContactRepository.contactQueries;
                SqlDriver sqlDriver = contactQueries2.driver;
                SqlDriver sqlDriver2 = contactQueries2.driver;
                sqlDriver.execute(1929873432, "UPDATE contact\nSET in_address_book = 0", null);
                contactQueries2.notifyQueries(1929873432, new ContactQueries$$ExternalSyntheticLambda1(0));
                SessionQueries sessionQueries2 = realContactRepository.contactAliasQueries;
                SqlDriver sqlDriver3 = sessionQueries2.driver;
                SqlDriver sqlDriver4 = sessionQueries2.driver;
                sqlDriver3.execute(994819982, "UPDATE contact_alias\nSET in_address_book = 0", null);
                sessionQueries2.notifyQueries(994819982, new WebLoginConfigQueries$$ExternalSyntheticLambda2(16, false));
                InstrumentQueries instrumentQueries2 = realContactRepository.aliasQueries;
                AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                instrumentQueries2.driver.execute(-2129978948, "UPDATE alias\nSET sync_state = ?", new AliasQueries$$ExternalSyntheticLambda0(instrumentQueries2, 1));
                instrumentQueries2.notifyQueries(-2129978948, new WebLoginConfigQueries$$ExternalSyntheticLambda2(5, false));
                Iterator it5 = ((List) obj5).iterator();
                int i16 = 0;
                while (it5.hasNext()) {
                    ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) it5.next();
                    String str5 = contactBook$Contact$DetailedContact.displayName;
                    String str6 = contactBook$Contact$DetailedContact.displayName;
                    List list8 = contactBook$Contact$DetailedContact.phoneNumbers;
                    List list9 = contactBook$Contact$DetailedContact.emailAddresses;
                    String str7 = contactBook$Contact$DetailedContact.lookupKey;
                    if (str5 == null || str5.length() == 0) {
                        it = it5;
                    } else {
                        Iterator it6 = list9.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj2 = it6.next();
                                String str8 = ((ContactBook$Contact$DetailedContact.LabeledData) obj2).value;
                                if (str8 == null || str8.length() <= 0) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            Iterator it7 = list8.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj3 = it7.next();
                                    it = it5;
                                    String str9 = ((ContactBook$Contact$DetailedContact.LabeledData) obj3).value;
                                    if (str9 == null || str9.length() <= 0) {
                                        it5 = it;
                                    }
                                } else {
                                    it = it5;
                                    obj3 = null;
                                }
                            }
                            if (obj3 == null) {
                            }
                        } else {
                            it = it5;
                        }
                        Iterator it8 = list8.iterator();
                        while (it8.hasNext()) {
                            String normalize = PhoneNumbers.normalize(((ContactBook$Contact$DetailedContact.LabeledData) it8.next()).value, (selectRegion == null || (region = selectRegion.region) == null) ? null : Regions.toCountry(region).name());
                            if (normalize != null) {
                                i16 = RealContactRepository.upsertAliasRequireTransaction$default(realContactRepository, str7, normalize, null, 4) + i16;
                            }
                        }
                        Iterator it9 = list9.iterator();
                        while (it9.hasNext()) {
                            String normalize2 = Emails.normalize(((ContactBook$Contact$DetailedContact.LabeledData) it9.next()).value);
                            if (normalize2 != null) {
                                i16 = RealContactRepository.upsertAliasRequireTransaction$default(realContactRepository, str7, null, normalize2, 2) + i16;
                            }
                        }
                        str7.getClass();
                        sqlDriver.execute(-1044407996, "UPDATE contact\nSET in_address_book = 1,\n    display_name = ?\nWHERE lookup_key = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str6, str7, 17));
                        contactQueries2.notifyQueries(-1044407996, new ContactQueries$$ExternalSyntheticLambda1(3));
                        if (realContactRepository.noRowsWereModified()) {
                            str7.getClass();
                            sqlDriver.execute(-59965100, "INSERT INTO contact (lookup_key, display_name)\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str7, str6, 18));
                            contactQueries2.notifyQueries(-59965100, new ContactQueries$$ExternalSyntheticLambda1(4));
                        }
                    }
                    it5 = it;
                }
                WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2 = new WebLoginConfigQueries$$ExternalSyntheticLambda2(20, false);
                sqlDriver4.getClass();
                long longValue = ((Number) new SimpleQuery(-1238387061, new String[]{"contact_alias"}, sqlDriver4, "ContactAlias.sq", "countContactAliasNotInAddressBook", "SELECT COUNT(*)\nFROM contact_alias\nWHERE in_address_book = 0", webLoginConfigQueries$$ExternalSyntheticLambda2).executeAsOne()).longValue();
                sqlDriver2.execute(-127263985, "DELETE FROM contact\nWHERE in_address_book = 0", null);
                contactQueries2.notifyQueries(-127263985, new WebLoginConfigQueries$$ExternalSyntheticLambda2(27, false));
                sqlDriver4.execute(1401198354, "DELETE FROM contact_alias\nWHERE in_address_book = 0", null);
                sessionQueries2.notifyQueries(1401198354, new WebLoginConfigQueries$$ExternalSyntheticLambda2(19, false));
                sqlDriver2.execute(1079844937, "UPDATE contact SET has_multiple_customers = lookup_key IN customer_contact", null);
                contactQueries2.notifyQueries(1079844937, new ContactQueries$$ExternalSyntheticLambda1(2));
                if (i16 > 0) {
                    analytics.track(new ContactUpdateAdded(Integer.valueOf(i16)), null);
                }
                if (longValue > 0) {
                    analytics.track(new ContactUpdateRemoved(Integer.valueOf((int) longValue)), null);
                }
                return new ContactsSyncResponse.Success(i16 == 0 && longValue == 0, 1);
            case 23:
                final RealProfileSyncer realProfileSyncer = (RealProfileSyncer) obj6;
                final Profile profile = (Profile) obj5;
                String str10 = (String) obj4;
                ((TransactionWrapper) obj).getClass();
                realProfileSyncer.blockingUpdateProfilePhoto(profile.photo_url);
                InstrumentQueries instrumentQueries3 = realProfileSyncer.profileQueries;
                String str11 = profile.full_name;
                String str12 = profile.customer_token;
                Boolean bool = profile.direct_deposit_account_enabled;
                IncomingRequestPolicy incomingRequestPolicy = profile.incoming_request_policy;
                CurrencyCode currencyCode = profile.default_currency;
                Integer num = profile.require_minimum_initiator_notes_length_for_requests;
                Boolean bool2 = profile.app_message_notifications_enabled;
                Boolean bool3 = profile.is_verified_account;
                Boolean bool4 = profile.can_upgrade_to_business;
                RatePlan ratePlan = profile.rate_plan;
                Boolean bool5 = profile.cashtag_url_enabled;
                NearbyVisibility nearbyVisibility = profile.nearby_visibility;
                Boolean bool6 = profile.has_passcode;
                String str13 = profile.photo_url;
                Boolean bool7 = profile.require_passcode_confirmation;
                boolean booleanValue = bool7 != null ? bool7.booleanValue() : false;
                boolean booleanValue2 = bool6 != null ? bool6.booleanValue() : false;
                NearbyVisibility nearbyVisibility2 = nearbyVisibility == null ? ProtoDefaults.PROFILE_NEARBY_VISIBILITY : nearbyVisibility;
                String str14 = profile.cashtag;
                String str15 = profile.cashtag_url;
                String str16 = profile.cashtag_url_display_text;
                boolean booleanValue3 = bool5 != null ? bool5.booleanValue() : false;
                RatePlan ratePlan2 = ratePlan == null ? ProtoDefaults.PROFILE_RATE_PLAN : ratePlan;
                boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                boolean booleanValue5 = bool3 != null ? bool3.booleanValue() : false;
                boolean booleanValue6 = bool2 != null ? bool2.booleanValue() : false;
                String str17 = profile.verification_instrument_token;
                DepositPreference depositPreference = profile.deposit_preference;
                GlobalAddress globalAddress = profile.postal_address;
                DepositPreferenceData depositPreferenceData = profile.deposit_preference_data;
                int intValue = num != null ? num.intValue() : 0;
                Country country = profile.country_code;
                CurrencyCode currencyCode2 = currencyCode == null ? CurrencyCode.USD : currencyCode;
                Long l = profile.customer_since;
                IncomingRequestPolicy incomingRequestPolicy2 = incomingRequestPolicy == null ? ProtoDefaults.PROFILE_INCOMING_REQUEST_POLICY : incomingRequestPolicy;
                String str18 = profile.cashtag_qr_image_url;
                String str19 = profile.cashtag_with_currency_symbol;
                List list10 = profile.available_p2p_target_regions;
                String str20 = profile.printable_cashtag_qr_image_url;
                Region region2 = profile.region;
                boolean booleanValue7 = bool != null ? bool.booleanValue() : false;
                str12.getClass();
                BitcoinDisplayUnits bitcoinDisplayUnits = profile.bitcoin_display_units;
                instrumentQueries3.getClass();
                SqlDriver sqlDriver5 = instrumentQueries3.driver;
                nearbyVisibility2.getClass();
                ratePlan2.getClass();
                currencyCode2.getClass();
                sqlDriver5.execute(-1515168858, "UPDATE profile\nSET full_name = ?,\n    photo_url = ?,\n    require_passcode_confirmation = ?,\n    has_passcode = ?,\n    nearby_visibility = ?,\n    cashtag = ?,\n    cashtag_url = ?,\n    cashtag_url_display_text = ?,\n    cashtag_url_enabled = ?,\n    rate_plan = ?,\n    can_upgrade_to_business = ?,\n    is_verified_account = ?,\n    app_message_notifications_enabled = ?,\n    verification_instrument_token = ?,\n    deposit_preference = ?,\n    address = ?,\n    deposit_preference_data = ?,\n    request_minimum_note_length = ?,\n    country_code = ?,\n    default_currency = ?,\n    customer_since = ?,\n    profile_token = ?,\n    incoming_request_policy = ?,\n    has_passed_idv = ?,\n    cashtag_qr_image_url = ?,\n    cashtag_with_currency_symbol = ?,\n    available_p2p_target_regions = ?,\n    printable_cashtag_qr_image_url = ?,\n    region = ?,\n    direct_deposit_account_enabled = ?,\n    bitcoin_display_units = ?\nWHERE profile_id = ?", new ProfileQueries$$ExternalSyntheticLambda8(str11, str13, booleanValue, booleanValue2, instrumentQueries3, nearbyVisibility2, str14, str15, str16, booleanValue3, ratePlan2, booleanValue4, booleanValue5, booleanValue6, str17, depositPreference, globalAddress, depositPreferenceData, intValue, country, currencyCode2, l, str10, incomingRequestPolicy2, str18, str19, list10, str20, region2, booleanValue7, bitcoinDisplayUnits, str12));
                instrumentQueries3.notifyQueries(-1515168858, new ProfileQueries$$ExternalSyntheticLambda4(10));
                if (((Number) realProfileSyncer.databaseQueries.changes().executeAsOne()).longValue() != 1) {
                    sqlDriver5.execute(1184598373, "DELETE FROM profile", null);
                    instrumentQueries3.notifyQueries(1184598373, new WebLoginConfigQueries$$ExternalSyntheticLambda0(8));
                    String str21 = profile.full_name;
                    String str22 = profile.photo_url;
                    boolean booleanValue8 = bool7 != null ? bool7.booleanValue() : false;
                    boolean booleanValue9 = bool6 != null ? bool6.booleanValue() : false;
                    if (nearbyVisibility == null) {
                        nearbyVisibility = ProtoDefaults.PROFILE_NEARBY_VISIBILITY;
                    }
                    NearbyVisibility nearbyVisibility3 = nearbyVisibility;
                    String str23 = profile.cashtag;
                    String str24 = profile.cashtag_url;
                    String str25 = profile.cashtag_url_display_text;
                    boolean booleanValue10 = bool5 != null ? bool5.booleanValue() : false;
                    if (ratePlan == null) {
                        ratePlan = ProtoDefaults.PROFILE_RATE_PLAN;
                    }
                    RatePlan ratePlan3 = ratePlan;
                    boolean booleanValue11 = bool4 != null ? bool4.booleanValue() : false;
                    boolean booleanValue12 = bool3 != null ? bool3.booleanValue() : false;
                    boolean booleanValue13 = bool2 != null ? bool2.booleanValue() : false;
                    String str26 = profile.verification_instrument_token;
                    DepositPreference depositPreference2 = profile.deposit_preference;
                    GlobalAddress globalAddress2 = profile.postal_address;
                    DepositPreferenceData depositPreferenceData2 = profile.deposit_preference_data;
                    int intValue2 = num != null ? num.intValue() : 0;
                    Country country2 = profile.country_code;
                    if (currencyCode == null) {
                        currencyCode = CurrencyCode.USD;
                    }
                    CurrencyCode currencyCode3 = currencyCode;
                    Long l2 = profile.customer_since;
                    if (incomingRequestPolicy == null) {
                        incomingRequestPolicy = ProtoDefaults.PROFILE_INCOMING_REQUEST_POLICY;
                    }
                    IncomingRequestPolicy incomingRequestPolicy3 = incomingRequestPolicy;
                    String str27 = profile.cashtag_qr_image_url;
                    String str28 = profile.cashtag_with_currency_symbol;
                    List list11 = profile.available_p2p_target_regions;
                    String str29 = profile.printable_cashtag_qr_image_url;
                    Region region3 = profile.region;
                    boolean booleanValue14 = bool != null ? bool.booleanValue() : false;
                    BitcoinDisplayUnits bitcoinDisplayUnits2 = profile.bitcoin_display_units;
                    nearbyVisibility3.getClass();
                    ratePlan3.getClass();
                    currencyCode3.getClass();
                    sqlDriver5.execute(-530725962, "INSERT INTO profile\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ProfileQueries$$ExternalSyntheticLambda8(str12, str21, str22, booleanValue8, booleanValue9, instrumentQueries3, nearbyVisibility3, str23, str24, str25, booleanValue10, ratePlan3, booleanValue11, booleanValue12, booleanValue13, str26, depositPreference2, globalAddress2, depositPreferenceData2, intValue2, country2, currencyCode3, l2, str10, incomingRequestPolicy3, str27, str28, list11, str29, region3, booleanValue14, bitcoinDisplayUnits2));
                    instrumentQueries3.notifyQueries(-530725962, new ProfileQueries$$ExternalSyntheticLambda4(5));
                }
                final int i17 = 3;
                realProfileSyncer.notificationPreferenceQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.profile.RealProfileSyncer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        List<ScenarioPlanEntry> list12;
                        int i18 = i17;
                        int i19 = 1;
                        Profile profile2 = profile;
                        RealProfileSyncer realProfileSyncer2 = realProfileSyncer;
                        ((TransactionWrapper) obj11).getClass();
                        switch (i18) {
                            case 0:
                                InstrumentQueries instrumentQueries4 = realProfileSyncer2.profileAliasQueries;
                                instrumentQueries4.driver.execute(2125192189, "DELETE FROM profileAlias", null);
                                instrumentQueries4.notifyQueries(2125192189, new ProfileQueries$$ExternalSyntheticLambda4(3));
                                for (ProfileAlias profileAlias : profile2.aliases) {
                                    UiAlias uiAlias = profileAlias.alias;
                                    uiAlias.getClass();
                                    String str30 = uiAlias.canonical_text;
                                    str30.getClass();
                                    Boolean bool8 = profileAlias.verified;
                                    bool8.getClass();
                                    boolean booleanValue15 = bool8.booleanValue();
                                    UiAlias uiAlias2 = profileAlias.alias;
                                    uiAlias2.getClass();
                                    UiAlias.Type type2 = uiAlias2.f1363type;
                                    type2.getClass();
                                    instrumentQueries4.insert(type2, str30, booleanValue15);
                                }
                                break;
                            case 1:
                                InstrumentQueries instrumentQueries5 = realProfileSyncer2.instrumentLinkingQueries;
                                instrumentQueries5.driver.execute(-1087769326, "DELETE FROM instrumentLinkingOption", null);
                                instrumentQueries5.notifyQueries(-1087769326, new OfflineQueries$$ExternalSyntheticLambda1(27));
                                for (InstrumentLinkingOption instrumentLinkingOption : profile2.instrument_linking_options) {
                                    List list13 = instrumentLinkingOption.instrument_types;
                                    String str31 = instrumentLinkingOption.title;
                                    String str32 = instrumentLinkingOption.description;
                                    Long l3 = instrumentLinkingOption.fee_bps;
                                    long longValue2 = l3 != null ? l3.longValue() : 0L;
                                    Boolean bool9 = instrumentLinkingOption.show_in_instrument_selector;
                                    boolean booleanValue16 = bool9 != null ? bool9.booleanValue() : false;
                                    instrumentQueries5.getClass();
                                    list13.getClass();
                                    instrumentQueries5.driver.execute(-936103392, "INSERT OR REPLACE INTO instrumentLinkingOption\nVALUES (?, ?, ?, ?, ?)", new InvestingDiscoveryQueries$$ExternalSyntheticLambda0(instrumentQueries5, list13, str31, str32, longValue2, booleanValue16));
                                    instrumentQueries5.notifyQueries(-936103392, new OfflineQueries$$ExternalSyntheticLambda1(28));
                                }
                                break;
                            case 2:
                                InstrumentQueries instrumentQueries6 = realProfileSyncer2.scenarioPlanQueries;
                                instrumentQueries6.driver.execute(1345819183, "DELETE FROM scenarioPlan", null);
                                instrumentQueries6.notifyQueries(1345819183, new ProfileQueries$$ExternalSyntheticLambda4(11));
                                ScenarioPlanMap scenarioPlanMap = profile2.scenario_plan_map;
                                if (scenarioPlanMap != null && (list12 = scenarioPlanMap.scenario_plans) != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj12 : list12) {
                                        if (((ScenarioPlanEntry) obj12).client_scenario != null) {
                                            arrayList5.add(obj12);
                                        }
                                    }
                                    Iterator it10 = arrayList5.iterator();
                                    while (it10.hasNext()) {
                                        ScenarioPlanEntry scenarioPlanEntry = (ScenarioPlanEntry) it10.next();
                                        ClientScenario clientScenario = scenarioPlanEntry.client_scenario;
                                        clientScenario.getClass();
                                        ScenarioPlan scenarioPlan = scenarioPlanEntry.scenario_plan;
                                        scenarioPlan.getClass();
                                        instrumentQueries6.getClass();
                                        instrumentQueries6.driver.execute(1497485117, "INSERT INTO scenarioPlan\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(i19, instrumentQueries6, clientScenario, scenarioPlan));
                                        instrumentQueries6.notifyQueries(1497485117, new ProfileQueries$$ExternalSyntheticLambda4(12));
                                    }
                                }
                                break;
                            default:
                                InstrumentQueries instrumentQueries7 = realProfileSyncer2.notificationPreferenceQueries;
                                instrumentQueries7.driver.execute(669588220, "DELETE FROM notificationPreference", null);
                                instrumentQueries7.notifyQueries(669588220, new OfflineQueries$$ExternalSyntheticLambda1(29));
                                for (NotificationPreference notificationPreference : profile2.notification_preferences) {
                                    UiAlias uiAlias3 = notificationPreference.alias;
                                    uiAlias3.getClass();
                                    String str33 = uiAlias3.canonical_text;
                                    str33.getClass();
                                    Boolean bool10 = notificationPreference.enabled;
                                    bool10.getClass();
                                    boolean booleanValue17 = bool10.booleanValue();
                                    UiAlias uiAlias4 = notificationPreference.alias;
                                    uiAlias4.getClass();
                                    UiAlias.Type type3 = uiAlias4.f1363type;
                                    type3.getClass();
                                    instrumentQueries7.getClass();
                                    instrumentQueries7.driver.execute(821254154, "INSERT INTO notificationPreference\nVALUES (?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str33, booleanValue17, (TransacterImpl) instrumentQueries7, type3, 9));
                                    instrumentQueries7.notifyQueries(821254154, new ProfileQueries$$ExternalSyntheticLambda4(1));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i18 = 2;
                realProfileSyncer.scenarioPlanQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.profile.RealProfileSyncer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        List<ScenarioPlanEntry> list12;
                        int i182 = i18;
                        int i19 = 1;
                        Profile profile2 = profile;
                        RealProfileSyncer realProfileSyncer2 = realProfileSyncer;
                        ((TransactionWrapper) obj11).getClass();
                        switch (i182) {
                            case 0:
                                InstrumentQueries instrumentQueries4 = realProfileSyncer2.profileAliasQueries;
                                instrumentQueries4.driver.execute(2125192189, "DELETE FROM profileAlias", null);
                                instrumentQueries4.notifyQueries(2125192189, new ProfileQueries$$ExternalSyntheticLambda4(3));
                                for (ProfileAlias profileAlias : profile2.aliases) {
                                    UiAlias uiAlias = profileAlias.alias;
                                    uiAlias.getClass();
                                    String str30 = uiAlias.canonical_text;
                                    str30.getClass();
                                    Boolean bool8 = profileAlias.verified;
                                    bool8.getClass();
                                    boolean booleanValue15 = bool8.booleanValue();
                                    UiAlias uiAlias2 = profileAlias.alias;
                                    uiAlias2.getClass();
                                    UiAlias.Type type2 = uiAlias2.f1363type;
                                    type2.getClass();
                                    instrumentQueries4.insert(type2, str30, booleanValue15);
                                }
                                break;
                            case 1:
                                InstrumentQueries instrumentQueries5 = realProfileSyncer2.instrumentLinkingQueries;
                                instrumentQueries5.driver.execute(-1087769326, "DELETE FROM instrumentLinkingOption", null);
                                instrumentQueries5.notifyQueries(-1087769326, new OfflineQueries$$ExternalSyntheticLambda1(27));
                                for (InstrumentLinkingOption instrumentLinkingOption : profile2.instrument_linking_options) {
                                    List list13 = instrumentLinkingOption.instrument_types;
                                    String str31 = instrumentLinkingOption.title;
                                    String str32 = instrumentLinkingOption.description;
                                    Long l3 = instrumentLinkingOption.fee_bps;
                                    long longValue2 = l3 != null ? l3.longValue() : 0L;
                                    Boolean bool9 = instrumentLinkingOption.show_in_instrument_selector;
                                    boolean booleanValue16 = bool9 != null ? bool9.booleanValue() : false;
                                    instrumentQueries5.getClass();
                                    list13.getClass();
                                    instrumentQueries5.driver.execute(-936103392, "INSERT OR REPLACE INTO instrumentLinkingOption\nVALUES (?, ?, ?, ?, ?)", new InvestingDiscoveryQueries$$ExternalSyntheticLambda0(instrumentQueries5, list13, str31, str32, longValue2, booleanValue16));
                                    instrumentQueries5.notifyQueries(-936103392, new OfflineQueries$$ExternalSyntheticLambda1(28));
                                }
                                break;
                            case 2:
                                InstrumentQueries instrumentQueries6 = realProfileSyncer2.scenarioPlanQueries;
                                instrumentQueries6.driver.execute(1345819183, "DELETE FROM scenarioPlan", null);
                                instrumentQueries6.notifyQueries(1345819183, new ProfileQueries$$ExternalSyntheticLambda4(11));
                                ScenarioPlanMap scenarioPlanMap = profile2.scenario_plan_map;
                                if (scenarioPlanMap != null && (list12 = scenarioPlanMap.scenario_plans) != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj12 : list12) {
                                        if (((ScenarioPlanEntry) obj12).client_scenario != null) {
                                            arrayList5.add(obj12);
                                        }
                                    }
                                    Iterator it10 = arrayList5.iterator();
                                    while (it10.hasNext()) {
                                        ScenarioPlanEntry scenarioPlanEntry = (ScenarioPlanEntry) it10.next();
                                        ClientScenario clientScenario = scenarioPlanEntry.client_scenario;
                                        clientScenario.getClass();
                                        ScenarioPlan scenarioPlan = scenarioPlanEntry.scenario_plan;
                                        scenarioPlan.getClass();
                                        instrumentQueries6.getClass();
                                        instrumentQueries6.driver.execute(1497485117, "INSERT INTO scenarioPlan\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(i19, instrumentQueries6, clientScenario, scenarioPlan));
                                        instrumentQueries6.notifyQueries(1497485117, new ProfileQueries$$ExternalSyntheticLambda4(12));
                                    }
                                }
                                break;
                            default:
                                InstrumentQueries instrumentQueries7 = realProfileSyncer2.notificationPreferenceQueries;
                                instrumentQueries7.driver.execute(669588220, "DELETE FROM notificationPreference", null);
                                instrumentQueries7.notifyQueries(669588220, new OfflineQueries$$ExternalSyntheticLambda1(29));
                                for (NotificationPreference notificationPreference : profile2.notification_preferences) {
                                    UiAlias uiAlias3 = notificationPreference.alias;
                                    uiAlias3.getClass();
                                    String str33 = uiAlias3.canonical_text;
                                    str33.getClass();
                                    Boolean bool10 = notificationPreference.enabled;
                                    bool10.getClass();
                                    boolean booleanValue17 = bool10.booleanValue();
                                    UiAlias uiAlias4 = notificationPreference.alias;
                                    uiAlias4.getClass();
                                    UiAlias.Type type3 = uiAlias4.f1363type;
                                    type3.getClass();
                                    instrumentQueries7.getClass();
                                    instrumentQueries7.driver.execute(821254154, "INSERT INTO notificationPreference\nVALUES (?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str33, booleanValue17, (TransacterImpl) instrumentQueries7, type3, 9));
                                    instrumentQueries7.notifyQueries(821254154, new ProfileQueries$$ExternalSyntheticLambda4(1));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) realProfileSyncer.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidUseJanusContactAliases.INSTANCE)).enabled()) {
                    final int i19 = 0;
                    realProfileSyncer.profileAliasQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.profile.RealProfileSyncer$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            List<ScenarioPlanEntry> list12;
                            int i182 = i19;
                            int i192 = 1;
                            Profile profile2 = profile;
                            RealProfileSyncer realProfileSyncer2 = realProfileSyncer;
                            ((TransactionWrapper) obj11).getClass();
                            switch (i182) {
                                case 0:
                                    InstrumentQueries instrumentQueries4 = realProfileSyncer2.profileAliasQueries;
                                    instrumentQueries4.driver.execute(2125192189, "DELETE FROM profileAlias", null);
                                    instrumentQueries4.notifyQueries(2125192189, new ProfileQueries$$ExternalSyntheticLambda4(3));
                                    for (ProfileAlias profileAlias : profile2.aliases) {
                                        UiAlias uiAlias = profileAlias.alias;
                                        uiAlias.getClass();
                                        String str30 = uiAlias.canonical_text;
                                        str30.getClass();
                                        Boolean bool8 = profileAlias.verified;
                                        bool8.getClass();
                                        boolean booleanValue15 = bool8.booleanValue();
                                        UiAlias uiAlias2 = profileAlias.alias;
                                        uiAlias2.getClass();
                                        UiAlias.Type type2 = uiAlias2.f1363type;
                                        type2.getClass();
                                        instrumentQueries4.insert(type2, str30, booleanValue15);
                                    }
                                    break;
                                case 1:
                                    InstrumentQueries instrumentQueries5 = realProfileSyncer2.instrumentLinkingQueries;
                                    instrumentQueries5.driver.execute(-1087769326, "DELETE FROM instrumentLinkingOption", null);
                                    instrumentQueries5.notifyQueries(-1087769326, new OfflineQueries$$ExternalSyntheticLambda1(27));
                                    for (InstrumentLinkingOption instrumentLinkingOption : profile2.instrument_linking_options) {
                                        List list13 = instrumentLinkingOption.instrument_types;
                                        String str31 = instrumentLinkingOption.title;
                                        String str32 = instrumentLinkingOption.description;
                                        Long l3 = instrumentLinkingOption.fee_bps;
                                        long longValue2 = l3 != null ? l3.longValue() : 0L;
                                        Boolean bool9 = instrumentLinkingOption.show_in_instrument_selector;
                                        boolean booleanValue16 = bool9 != null ? bool9.booleanValue() : false;
                                        instrumentQueries5.getClass();
                                        list13.getClass();
                                        instrumentQueries5.driver.execute(-936103392, "INSERT OR REPLACE INTO instrumentLinkingOption\nVALUES (?, ?, ?, ?, ?)", new InvestingDiscoveryQueries$$ExternalSyntheticLambda0(instrumentQueries5, list13, str31, str32, longValue2, booleanValue16));
                                        instrumentQueries5.notifyQueries(-936103392, new OfflineQueries$$ExternalSyntheticLambda1(28));
                                    }
                                    break;
                                case 2:
                                    InstrumentQueries instrumentQueries6 = realProfileSyncer2.scenarioPlanQueries;
                                    instrumentQueries6.driver.execute(1345819183, "DELETE FROM scenarioPlan", null);
                                    instrumentQueries6.notifyQueries(1345819183, new ProfileQueries$$ExternalSyntheticLambda4(11));
                                    ScenarioPlanMap scenarioPlanMap = profile2.scenario_plan_map;
                                    if (scenarioPlanMap != null && (list12 = scenarioPlanMap.scenario_plans) != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj12 : list12) {
                                            if (((ScenarioPlanEntry) obj12).client_scenario != null) {
                                                arrayList5.add(obj12);
                                            }
                                        }
                                        Iterator it10 = arrayList5.iterator();
                                        while (it10.hasNext()) {
                                            ScenarioPlanEntry scenarioPlanEntry = (ScenarioPlanEntry) it10.next();
                                            ClientScenario clientScenario = scenarioPlanEntry.client_scenario;
                                            clientScenario.getClass();
                                            ScenarioPlan scenarioPlan = scenarioPlanEntry.scenario_plan;
                                            scenarioPlan.getClass();
                                            instrumentQueries6.getClass();
                                            instrumentQueries6.driver.execute(1497485117, "INSERT INTO scenarioPlan\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(i192, instrumentQueries6, clientScenario, scenarioPlan));
                                            instrumentQueries6.notifyQueries(1497485117, new ProfileQueries$$ExternalSyntheticLambda4(12));
                                        }
                                    }
                                    break;
                                default:
                                    InstrumentQueries instrumentQueries7 = realProfileSyncer2.notificationPreferenceQueries;
                                    instrumentQueries7.driver.execute(669588220, "DELETE FROM notificationPreference", null);
                                    instrumentQueries7.notifyQueries(669588220, new OfflineQueries$$ExternalSyntheticLambda1(29));
                                    for (NotificationPreference notificationPreference : profile2.notification_preferences) {
                                        UiAlias uiAlias3 = notificationPreference.alias;
                                        uiAlias3.getClass();
                                        String str33 = uiAlias3.canonical_text;
                                        str33.getClass();
                                        Boolean bool10 = notificationPreference.enabled;
                                        bool10.getClass();
                                        boolean booleanValue17 = bool10.booleanValue();
                                        UiAlias uiAlias4 = notificationPreference.alias;
                                        uiAlias4.getClass();
                                        UiAlias.Type type3 = uiAlias4.f1363type;
                                        type3.getClass();
                                        instrumentQueries7.getClass();
                                        instrumentQueries7.driver.execute(821254154, "INSERT INTO notificationPreference\nVALUES (?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str33, booleanValue17, (TransacterImpl) instrumentQueries7, type3, 9));
                                        instrumentQueries7.notifyQueries(821254154, new ProfileQueries$$ExternalSyntheticLambda4(1));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                BalanceData balanceData = profile.balance_data;
                if (balanceData != null) {
                    realProfileSyncer.balanceDataQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(29, realProfileSyncer, balanceData));
                }
                final int i20 = 1;
                realProfileSyncer.instrumentLinkingQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.profile.RealProfileSyncer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        List<ScenarioPlanEntry> list12;
                        int i182 = i20;
                        int i192 = 1;
                        Profile profile2 = profile;
                        RealProfileSyncer realProfileSyncer2 = realProfileSyncer;
                        ((TransactionWrapper) obj11).getClass();
                        switch (i182) {
                            case 0:
                                InstrumentQueries instrumentQueries4 = realProfileSyncer2.profileAliasQueries;
                                instrumentQueries4.driver.execute(2125192189, "DELETE FROM profileAlias", null);
                                instrumentQueries4.notifyQueries(2125192189, new ProfileQueries$$ExternalSyntheticLambda4(3));
                                for (ProfileAlias profileAlias : profile2.aliases) {
                                    UiAlias uiAlias = profileAlias.alias;
                                    uiAlias.getClass();
                                    String str30 = uiAlias.canonical_text;
                                    str30.getClass();
                                    Boolean bool8 = profileAlias.verified;
                                    bool8.getClass();
                                    boolean booleanValue15 = bool8.booleanValue();
                                    UiAlias uiAlias2 = profileAlias.alias;
                                    uiAlias2.getClass();
                                    UiAlias.Type type2 = uiAlias2.f1363type;
                                    type2.getClass();
                                    instrumentQueries4.insert(type2, str30, booleanValue15);
                                }
                                break;
                            case 1:
                                InstrumentQueries instrumentQueries5 = realProfileSyncer2.instrumentLinkingQueries;
                                instrumentQueries5.driver.execute(-1087769326, "DELETE FROM instrumentLinkingOption", null);
                                instrumentQueries5.notifyQueries(-1087769326, new OfflineQueries$$ExternalSyntheticLambda1(27));
                                for (InstrumentLinkingOption instrumentLinkingOption : profile2.instrument_linking_options) {
                                    List list13 = instrumentLinkingOption.instrument_types;
                                    String str31 = instrumentLinkingOption.title;
                                    String str32 = instrumentLinkingOption.description;
                                    Long l3 = instrumentLinkingOption.fee_bps;
                                    long longValue2 = l3 != null ? l3.longValue() : 0L;
                                    Boolean bool9 = instrumentLinkingOption.show_in_instrument_selector;
                                    boolean booleanValue16 = bool9 != null ? bool9.booleanValue() : false;
                                    instrumentQueries5.getClass();
                                    list13.getClass();
                                    instrumentQueries5.driver.execute(-936103392, "INSERT OR REPLACE INTO instrumentLinkingOption\nVALUES (?, ?, ?, ?, ?)", new InvestingDiscoveryQueries$$ExternalSyntheticLambda0(instrumentQueries5, list13, str31, str32, longValue2, booleanValue16));
                                    instrumentQueries5.notifyQueries(-936103392, new OfflineQueries$$ExternalSyntheticLambda1(28));
                                }
                                break;
                            case 2:
                                InstrumentQueries instrumentQueries6 = realProfileSyncer2.scenarioPlanQueries;
                                instrumentQueries6.driver.execute(1345819183, "DELETE FROM scenarioPlan", null);
                                instrumentQueries6.notifyQueries(1345819183, new ProfileQueries$$ExternalSyntheticLambda4(11));
                                ScenarioPlanMap scenarioPlanMap = profile2.scenario_plan_map;
                                if (scenarioPlanMap != null && (list12 = scenarioPlanMap.scenario_plans) != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj12 : list12) {
                                        if (((ScenarioPlanEntry) obj12).client_scenario != null) {
                                            arrayList5.add(obj12);
                                        }
                                    }
                                    Iterator it10 = arrayList5.iterator();
                                    while (it10.hasNext()) {
                                        ScenarioPlanEntry scenarioPlanEntry = (ScenarioPlanEntry) it10.next();
                                        ClientScenario clientScenario = scenarioPlanEntry.client_scenario;
                                        clientScenario.getClass();
                                        ScenarioPlan scenarioPlan = scenarioPlanEntry.scenario_plan;
                                        scenarioPlan.getClass();
                                        instrumentQueries6.getClass();
                                        instrumentQueries6.driver.execute(1497485117, "INSERT INTO scenarioPlan\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(i192, instrumentQueries6, clientScenario, scenarioPlan));
                                        instrumentQueries6.notifyQueries(1497485117, new ProfileQueries$$ExternalSyntheticLambda4(12));
                                    }
                                }
                                break;
                            default:
                                InstrumentQueries instrumentQueries7 = realProfileSyncer2.notificationPreferenceQueries;
                                instrumentQueries7.driver.execute(669588220, "DELETE FROM notificationPreference", null);
                                instrumentQueries7.notifyQueries(669588220, new OfflineQueries$$ExternalSyntheticLambda1(29));
                                for (NotificationPreference notificationPreference : profile2.notification_preferences) {
                                    UiAlias uiAlias3 = notificationPreference.alias;
                                    uiAlias3.getClass();
                                    String str33 = uiAlias3.canonical_text;
                                    str33.getClass();
                                    Boolean bool10 = notificationPreference.enabled;
                                    bool10.getClass();
                                    boolean booleanValue17 = bool10.booleanValue();
                                    UiAlias uiAlias4 = notificationPreference.alias;
                                    uiAlias4.getClass();
                                    UiAlias.Type type3 = uiAlias4.f1363type;
                                    type3.getClass();
                                    instrumentQueries7.getClass();
                                    instrumentQueries7.driver.execute(821254154, "INSERT INTO notificationPreference\nVALUES (?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str33, booleanValue17, (TransacterImpl) instrumentQueries7, type3, 9));
                                    instrumentQueries7.notifyQueries(821254154, new ProfileQueries$$ExternalSyntheticLambda4(1));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$data$transfers$RealTransferManager$transferFunds$2$$ExternalSyntheticLambda0(obj);
            case 25:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list12 = ((DateFilterBarViewModel) obj5).filterOptions;
                lazyListScope2.items(list12.size(), new VerifyCheckDepositPresenter$models$3$2(i4, new RealAppConfigManager$$ExternalSyntheticLambda6(24), list12), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list12, 15), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list12, (MutableState) obj6, (Function1) obj4, i3), true, 2039820996));
                return Unit.INSTANCE;
            case 26:
                List list13 = (List) obj6;
                List list14 = (List) obj5;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj4;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, list13 != null ? (byte[]) ((WireRepeatedAdapter) ((KeysetHandle) localTabContentQueries2.local_tab_contentAdapter).entries).encode(list13) : null);
                androidStatement2.bindBytes(1, list14 != null ? (byte[]) ((WireRepeatedAdapter) ((KeysetHandle) localTabContentQueries2.local_tab_contentAdapter).annotationsMap).encode(list14) : null);
                return Unit.INSTANCE;
            case 27:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) obj6);
                androidStatement3.bindLong(1, (Long) obj5);
                androidStatement3.bindString(2, (String) obj4);
                return Unit.INSTANCE;
            case 28:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindBytes(0, (byte[]) ((WireAdapter) ((zzlj) ((InstrumentQueries) obj6).instrumentAdapter).zza).encode((InitiatePaymentRequest) obj5));
                androidStatement4.bindString(1, (String) obj4);
                return Unit.INSTANCE;
            default:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) obj6);
                androidStatement5.bindBytes(1, (byte[]) ((BlockersConfig.Adapter) ((InstrumentQueries) obj5).instrumentAdapter).target_balance_amountAdapter.encode((GetProfileDetailsResponse) obj4));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda11(Object obj, MutableState mutableState, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = mutableState;
        this.f$2 = obj2;
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda11(Object obj, Object obj2, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = mutableState;
    }
}
