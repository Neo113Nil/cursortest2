package com.squareup.cash.pdf.presenter;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.instruments.views.CardArtImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.pdf.backend.real.PdfBitmapRender;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingPresenter;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolGoalMetKt$PoolGoalMet$1$1$1;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$FetchDeviceResult;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$FetchDevicesResult;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.Cache;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PdfPreviewPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $pdfRender$delegate;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPreviewPresenter$models$1$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.this$0 = localEditorialPresenter;
        this.L$0 = mutableState;
        this.$pdfRender$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new PdfPreviewPresenter$models$1$1((PdfPreviewPresenter) obj2, (MutableState) this.$pdfRender$delegate, continuation, 0);
            case 1:
                return new PdfPreviewPresenter$models$1$1((CoreFlowRealSheetState) this.L$0, (AnimatedVisibilityScope) this.$pdfRender$delegate, (Function0) obj2, continuation);
            case 2:
                return new PdfPreviewPresenter$models$1$1(2, (MutableState) this.L$0, (Text) this.$pdfRender$delegate, (FocusRequester) obj2, continuation);
            case 3:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$1 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (LocalHomePresenter) obj2, 3);
                pdfPreviewPresenter$models$1$1.L$0 = obj;
                return pdfPreviewPresenter$models$1$1;
            case 4:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$12 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (WorkHomePresenter) obj2, 4);
                pdfPreviewPresenter$models$1$12.L$0 = obj;
                return pdfPreviewPresenter$models$1$12;
            case 5:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$13 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (PhonePlansNewLineLoadingPresenter) obj2, 5);
                pdfPreviewPresenter$models$1$13.L$0 = obj;
                return pdfPreviewPresenter$models$1$13;
            case 6:
                return new PdfPreviewPresenter$models$1$1(6, (MutableState) this.L$0, (WirelessProviderListPresenter) this.$pdfRender$delegate, (String) obj2, continuation);
            case 7:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$14 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (WorkHomePresenter) obj2, 7);
                pdfPreviewPresenter$models$1$14.L$0 = obj;
                return pdfPreviewPresenter$models$1$14;
            case 8:
                return new PdfPreviewPresenter$models$1$1(8, (MutableState) this.L$0, (StartPoolViewModel.Name) this.$pdfRender$delegate, (StartPoolPresenter) obj2, continuation);
            case 9:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$15 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (PrepurchaseCashCardFAQPresenter) obj2, 9);
                pdfPreviewPresenter$models$1$15.L$0 = obj;
                return pdfPreviewPresenter$models$1$15;
            case 10:
                return new PdfPreviewPresenter$models$1$1((LocalEditorialPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$pdfRender$delegate, continuation);
            case 11:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$16 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (AddAliasPresenter) obj2, 11);
                pdfPreviewPresenter$models$1$16.L$0 = obj;
                return pdfPreviewPresenter$models$1$16;
            case 12:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$17 = new PdfPreviewPresenter$models$1$1((PdfPreviewPresenter) obj2, continuation);
                pdfPreviewPresenter$models$1$17.$pdfRender$delegate = obj;
                return pdfPreviewPresenter$models$1$17;
            case 13:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$18 = new PdfPreviewPresenter$models$1$1((PdfPreviewPresenter) this.$pdfRender$delegate, (ParcelableSnapshotMutableIntState) obj2, continuation);
                pdfPreviewPresenter$models$1$18.L$0 = obj;
                return pdfPreviewPresenter$models$1$18;
            case 14:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$19 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (TaxReturnsPresenter) obj2, 14);
                pdfPreviewPresenter$models$1$19.L$0 = obj;
                return pdfPreviewPresenter$models$1$19;
            case 15:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$110 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 15);
                pdfPreviewPresenter$models$1$110.L$0 = obj;
                return pdfPreviewPresenter$models$1$110;
            case 16:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$111 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (AddAliasPresenter) obj2, 16);
                pdfPreviewPresenter$models$1$111.L$0 = obj;
                return pdfPreviewPresenter$models$1$111;
            case 17:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$112 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 17);
                pdfPreviewPresenter$models$1$112.L$0 = obj;
                return pdfPreviewPresenter$models$1$112;
            case 18:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$113 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 18);
                pdfPreviewPresenter$models$1$113.L$0 = obj;
                return pdfPreviewPresenter$models$1$113;
            case 19:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$114 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 19);
                pdfPreviewPresenter$models$1$114.L$0 = obj;
                return pdfPreviewPresenter$models$1$114;
            case 20:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$115 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (WorkHomePresenter) obj2, 20);
                pdfPreviewPresenter$models$1$115.L$0 = obj;
                return pdfPreviewPresenter$models$1$115;
            case 21:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$116 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (AddAliasPresenter) obj2, 21);
                pdfPreviewPresenter$models$1$116.L$0 = obj;
                return pdfPreviewPresenter$models$1$116;
            case 22:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$117 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (InviteErrorPresenter) obj2, 22);
                pdfPreviewPresenter$models$1$117.L$0 = obj;
                return pdfPreviewPresenter$models$1$117;
            case 23:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$118 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 23);
                pdfPreviewPresenter$models$1$118.L$0 = obj;
                return pdfPreviewPresenter$models$1$118;
            case 24:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$119 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (InviteErrorPresenter) obj2, 24);
                pdfPreviewPresenter$models$1$119.L$0 = obj;
                return pdfPreviewPresenter$models$1$119;
            case 25:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$120 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 25);
                pdfPreviewPresenter$models$1$120.L$0 = obj;
                return pdfPreviewPresenter$models$1$120;
            case 26:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$121 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (ErrorPresenter) obj2, 26);
                pdfPreviewPresenter$models$1$121.L$0 = obj;
                return pdfPreviewPresenter$models$1$121;
            case 27:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$122 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (CardStudioUndoDialogPresenter) obj2, 27);
                pdfPreviewPresenter$models$1$122.L$0 = obj;
                return pdfPreviewPresenter$models$1$122;
            case 28:
                return new PdfPreviewPresenter$models$1$1((ProfilePrivacyPresenter) obj2, (MutableState) this.$pdfRender$delegate, continuation, 28);
            default:
                PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$123 = new PdfPreviewPresenter$models$1$1((Flow) this.$pdfRender$delegate, continuation, (TabToolbarPresenter) obj2, 29);
                pdfPreviewPresenter$models$1$123.L$0 = obj;
                return pdfPreviewPresenter$models$1$123;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((PdfPreviewPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        ParcelFileDescriptor open;
        PdfRenderer pdfRenderer;
        DataLoadingState.DataLoaded dataLoaded;
        MutableState mutableState2;
        int i = this.$r8$classId;
        int i2 = 8;
        int i3 = 10;
        int i4 = 9;
        Object[] objArr = 0;
        Object obj2 = this.this$0;
        int i5 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) this.$pdfRender$delegate;
                    File file = (File) ((Lazy) ((PdfPreviewPresenter) obj2).pdfFile$delegate).getValue();
                    this.L$0 = mutableState3;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    try {
                        open = ParcelFileDescriptor.open(file, 268435456);
                        try {
                            pdfRenderer = new PdfRenderer(open);
                        } finally {
                        }
                    } catch (Exception e) {
                        if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl.resumeWith(new Result.Failure(e));
                        }
                    }
                    try {
                        IntRange until = RangesKt___RangesKt.until(0, pdfRenderer.getPageCount());
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                        IntProgressionIterator it = until.iterator();
                        while (it.hasNext) {
                            PdfRenderer.Page openPage = pdfRenderer.openPage(it.nextInt());
                            try {
                                Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.getClass();
                                openPage.render(createBitmap, null, null, 1);
                                Cache.Companion.closeFinally(openPage, null);
                                arrayList.add(createBitmap);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    Cache.Companion.closeFinally(openPage, th);
                                    throw th2;
                                }
                            }
                        }
                        Cache.Companion.closeFinally(pdfRenderer, null);
                        Utf8.closeFinally(open, null);
                        if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                            Result.Companion companion2 = Result.Companion;
                            cancellableContinuationImpl.resumeWith(new PdfBitmapRender(arrayList));
                        }
                        Object result = cancellableContinuationImpl.getResult();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (result == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = result;
                        mutableState = mutableState3;
                    } finally {
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((PdfBitmapRender) obj);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) this.L$0;
                    BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 = new BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0((AnimatedVisibilityScope) this.$pdfRender$delegate, (Function0) obj2, 1);
                    this.label = 1;
                    if (coreFlowRealSheetState.awaitDismissal(basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(100L, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                MutableState mutableState4 = (MutableState) this.L$0;
                String str = ((Text) this.$pdfRender$delegate).value;
                int length = str.length();
                mutableState4.setValue(new TextFieldValue(str, SizeKt.TextRange(length, length), 4));
                FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$pdfRender$delegate;
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(coroutineScope, (LocalHomePresenter) obj2, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$pdfRender$delegate;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(29, coroutineScope2, (WorkHomePresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$pdfRender$delegate;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(i5, coroutineScope3, (PhonePlansNewLineLoadingPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                WirelessProviderListPresenter wirelessProviderListPresenter = (WirelessProviderListPresenter) this.$pdfRender$delegate;
                MutableState mutableState5 = (MutableState) this.L$0;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState5.setValue(Boolean.TRUE);
                    RealBlockersHelper realBlockersHelper = wirelessProviderListPresenter.blockersHelper;
                    WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen = wirelessProviderListPresenter.args;
                    BlockersData blockersData = wirelessProviderListBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    SafeFlow selectOption = realBlockersHelper.selectOption(wirelessProviderListBlockerScreen, (String) obj2, blockersData, clientScenario);
                    FlowCollector wirelessProviderListPresenter$models$1$1$12 = new WirelessProviderListPresenter$models$1$1$1(objArr == true ? 1 : 0, wirelessProviderListPresenter, mutableState5);
                    this.label = 1;
                    if (selectOption.collect(wirelessProviderListPresenter$models$1$1$12, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$1 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope4, (WorkHomePresenter) obj2, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(poolGoalMetKt$PoolGoalMet$1$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState6 = (MutableState) this.L$0;
                    StartPoolViewModel.Name name = (StartPoolViewModel.Name) this.$pdfRender$delegate;
                    String str2 = name.name;
                    Money money = name.amount;
                    this.label = 1;
                    if (StartPoolPresenter.access$models$createPool((StartPoolPresenter) obj2, mutableState6, str2, money, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$pdfRender$delegate;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$13 = new WirelessProviderListPresenter$models$1$1$1(7, coroutineScope5, (PrepurchaseCashCardFAQPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(wirelessProviderListPresenter$models$1$1$13, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                    CardArtImageKt$$ExternalSyntheticLambda0 cardArtImageKt$$ExternalSyntheticLambda0 = new CardArtImageKt$$ExternalSyntheticLambda0(localEditorialPresenter, (MutableState) this.L$0, (MutableState) this.$pdfRender$delegate);
                    BottomSheet$$ExternalSyntheticLambda2 bottomSheet$$ExternalSyntheticLambda2 = new BottomSheet$$ExternalSyntheticLambda2(localEditorialPresenter, 8);
                    this.label = 1;
                    if (LocalEditorialPresenter.access$syncPrepurchaseCashCard(localEditorialPresenter, cardArtImageKt$$ExternalSyntheticLambda0, bottomSheet$$ExternalSyntheticLambda2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$12 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope6, (AddAliasPresenter) obj2, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(poolGoalMetKt$PoolGoalMet$1$1$12, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$pdfRender$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj2;
                    RealDeviceManagerRepo realDeviceManagerRepo = (RealDeviceManagerRepo) pdfPreviewPresenter.args;
                    String str3 = ((DeviceManagerDeviceDetailsScreen) pdfPreviewPresenter.pdfFile$delegate).deviceAppToken;
                    this.$pdfRender$delegate = null;
                    this.L$0 = produceStateScope;
                    this.label = 1;
                    obj = realDeviceManagerRepo.getDeviceById(str3, this);
                    if (obj == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                DeviceManagerRepo$FetchDeviceResult deviceManagerRepo$FetchDeviceResult = (DeviceManagerRepo$FetchDeviceResult) obj;
                if (Intrinsics.areEqual(deviceManagerRepo$FetchDeviceResult, DeviceManagerRepo$FetchDeviceResult.DeviceError.INSTANCE)) {
                    dataLoaded = new DataLoadingState.DataLoaded(null);
                } else {
                    if (!(deviceManagerRepo$FetchDeviceResult instanceof DeviceManagerRepo$FetchDeviceResult.DeviceLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    dataLoaded = new DataLoadingState.DataLoaded(((DeviceManagerRepo$FetchDeviceResult.DeviceLoaded) deviceManagerRepo$FetchDeviceResult).device);
                }
                produceStateScope.setValue(dataLoaded);
                return Unit.INSTANCE;
            case 13:
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) this.$pdfRender$delegate;
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDeviceManagerRepo realDeviceManagerRepo2 = (RealDeviceManagerRepo) pdfPreviewPresenter2.args;
                    boolean z = ((ParcelableSnapshotMutableIntState) obj2).getIntValue() > 0;
                    this.L$0 = produceStateScope2;
                    this.label = 1;
                    obj = realDeviceManagerRepo2.getAllDevices(z, this);
                    if (obj == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DeviceManagerRepo$FetchDevicesResult deviceManagerRepo$FetchDevicesResult = (DeviceManagerRepo$FetchDevicesResult) obj;
                if (Intrinsics.areEqual(deviceManagerRepo$FetchDevicesResult, DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE)) {
                    pdfPreviewPresenter2.navigator.goTo(Back.INSTANCE);
                } else {
                    if (!(deviceManagerRepo$FetchDevicesResult instanceof DeviceManagerRepo$FetchDevicesResult.DevicesLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    produceStateScope2.setValue(new DataLoadingState.DataLoaded(((DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) deviceManagerRepo$FetchDevicesResult).devices));
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$13 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope7, (TaxReturnsPresenter) obj2, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(poolGoalMetKt$PoolGoalMet$1$1$13, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$14 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope8, (ErrorPresenter) obj2, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(poolGoalMetKt$PoolGoalMet$1$1$14, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$15 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope9, (AddAliasPresenter) obj2, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(poolGoalMetKt$PoolGoalMet$1$1$15, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$16 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope10, (ErrorPresenter) obj2, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(poolGoalMetKt$PoolGoalMet$1$1$16, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$17 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope11, (ErrorPresenter) obj2, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(poolGoalMetKt$PoolGoalMet$1$1$17, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$18 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope12, (ErrorPresenter) obj2, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(poolGoalMetKt$PoolGoalMet$1$1$18, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$19 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope13, (WorkHomePresenter) obj2, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(poolGoalMetKt$PoolGoalMet$1$1$19, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$110 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope14, (AddAliasPresenter) obj2, 15);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(poolGoalMetKt$PoolGoalMet$1$1$110, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$111 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope15, (InviteErrorPresenter) obj2, 16);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(poolGoalMetKt$PoolGoalMet$1$1$111, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$112 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope16, (ErrorPresenter) obj2, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(poolGoalMetKt$PoolGoalMet$1$1$112, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$113 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope17, (InviteErrorPresenter) obj2, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow17.collect(poolGoalMetKt$PoolGoalMet$1$1$113, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$114 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope18, (ErrorPresenter) obj2, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow18.collect(poolGoalMetKt$PoolGoalMet$1$1$114, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow19 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$115 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope19, (ErrorPresenter) obj2, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow19.collect(poolGoalMetKt$PoolGoalMet$1$1$115, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow20 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$116 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope20, (CardStudioUndoDialogPresenter) obj2, 21);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow20.collect(poolGoalMetKt$PoolGoalMet$1$1$116, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj2;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState7 = (MutableState) this.$pdfRender$delegate;
                    Flow flowOn = FlowKt.flowOn(new CashQrScannerPresenter$special$$inlined$filter$1(profilePrivacyPresenter.p2pSettingsManager.select(), i4), profilePrivacyPresenter.ioDispatcher);
                    this.L$0 = mutableState7;
                    this.label = 1;
                    Object firstOrNull = FlowKt.firstOrNull(flowOn, this);
                    if (firstOrNull == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                    obj = firstOrNull;
                    mutableState2 = mutableState7;
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState2 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                int i35 = ProfilePrivacyPresenter.$r8$clinit;
                mutableState2.setValue((ProfilePrivacyReadyViewModel$ProfileSecurityPolicy) obj);
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow21 = (Flow) this.$pdfRender$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$117 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope21, (TabToolbarPresenter) obj2, 23);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow21.collect(poolGoalMetKt$PoolGoalMet$1$1$117, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PdfPreviewPresenter$models$1$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$pdfRender$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PdfPreviewPresenter$models$1$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$pdfRender$delegate = obj;
        this.this$0 = obj2;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPreviewPresenter$models$1$1(CoreFlowRealSheetState coreFlowRealSheetState, AnimatedVisibilityScope animatedVisibilityScope, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$0 = coreFlowRealSheetState;
        this.$pdfRender$delegate = animatedVisibilityScope;
        this.this$0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPreviewPresenter$models$1$1(PdfPreviewPresenter pdfPreviewPresenter, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.$pdfRender$delegate = pdfPreviewPresenter;
        this.this$0 = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPreviewPresenter$models$1$1(PdfPreviewPresenter pdfPreviewPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.this$0 = pdfPreviewPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PdfPreviewPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$pdfRender$delegate = flow;
        this.this$0 = moleculePresenter;
    }
}
