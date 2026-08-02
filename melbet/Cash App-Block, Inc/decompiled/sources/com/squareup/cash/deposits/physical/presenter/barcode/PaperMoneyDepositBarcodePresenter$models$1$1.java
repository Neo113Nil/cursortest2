package com.squareup.cash.deposits.physical.presenter.barcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.MutableState;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e;
import com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda3;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.squareup.cash.R;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewBarcode;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeGenerator$BarcodeType$Code128;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeInfo;
import com.squareup.cash.deposits.physical.backend.api.barcode.android.AndroidBarcode;
import com.squareup.cash.deposits.physical.backend.real.barcode.AndroidBarcodeGenerator$$ExternalSyntheticLambda2;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashLimitReachedScreen;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.IntBuffer;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositBarcodePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PaperMoneyDepositBarcodeEvent $event;
    public final /* synthetic */ MutableState $state$delegate;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SelectCustomerPresenter this$0;

    /* renamed from: com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodePresenter$models$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ BarcodeInfo.Success $barcodeInfo;
        public int label;
        public final /* synthetic */ SelectCustomerPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BarcodeInfo.Success success, SelectCustomerPresenter selectCustomerPresenter, Continuation continuation) {
            super(2, continuation);
            this.$barcodeInfo = success;
            this.this$0 = selectCustomerPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$barcodeInfo, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SelectCustomerPresenter selectCustomerPresenter = this.this$0;
            PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen = (PaperMoneyDepositBarcodeScreen) selectCustomerPresenter.profileManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                long max = Math.max(0L, this.$barcodeInfo.expiresAt - ((AndroidClock) selectCustomerPresenter.inputFieldTextSaver).millis());
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(max, DurationUnit.MILLISECONDS);
                this.label = 1;
                if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            PaperCashDepositBlocker.BarcodeExpiredScreen barcodeExpiredScreen = paperMoneyDepositBarcodeScreen.paperCashDepositBlocker.barcode_expired_screen;
            barcodeExpiredScreen.getClass();
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) selectCustomerPresenter.navigator;
            String str = barcodeExpiredScreen.title_text;
            str.getClass();
            String str2 = barcodeExpiredScreen.detail_text;
            str2.getClass();
            String str3 = barcodeExpiredScreen.reload_barcode_button_text;
            str3.getClass();
            screenNavigator.goTo(new PaperMoneyDepositBarcodeFailedScreen(str, str2, str3, true, paperMoneyDepositBarcodeScreen.paperCashDepositBlocker, paperMoneyDepositBarcodeScreen.blockersData));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperMoneyDepositBarcodePresenter$models$1$1(SelectCustomerPresenter selectCustomerPresenter, PaperMoneyDepositBarcodeEvent paperMoneyDepositBarcodeEvent, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = selectCustomerPresenter;
        this.$event = paperMoneyDepositBarcodeEvent;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaperMoneyDepositBarcodePresenter$models$1$1 paperMoneyDepositBarcodePresenter$models$1$1 = new PaperMoneyDepositBarcodePresenter$models$1$1(this.this$0, this.$event, this.$state$delegate, continuation);
        paperMoneyDepositBarcodePresenter$models$1$1.L$0 = obj;
        return paperMoneyDepositBarcodePresenter$models$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaperMoneyDepositBarcodePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object first;
        Screen paperMoneyDepositBarcodeFailedScreen;
        SelectCustomerPresenter selectCustomerPresenter = this.this$0;
        PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen = (PaperMoneyDepositBarcodeScreen) selectCustomerPresenter.profileManager;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SafeFlow barcodeInfo = ((RealCashDepositBarcodeManager) selectCustomerPresenter.args).barcodeInfo();
            this.L$0 = coroutineScope;
            this.label = 1;
            first = FlowKt.first(barcodeInfo, this);
            if (first == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            first = obj;
        }
        BarcodeInfo barcodeInfo2 = (BarcodeInfo) first;
        if (barcodeInfo2 instanceof BarcodeInfo.Success) {
            BarcodeInfo.Success success = (BarcodeInfo.Success) barcodeInfo2;
            GetPaperCashDepositBarcodeResponse.Success success2 = success.response;
            JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(success, selectCustomerPresenter, null), 3);
            Analytics analytics = (Analytics) selectCustomerPresenter.currentCustomerToken;
            String str = success2.deposit_token;
            int ordinal = paperMoneyDepositBarcodeScreen.origin.ordinal();
            analytics.track(new PaperMoneyDepositViewBarcode(str, ordinal != 1 ? ordinal != 2 ? null : PaperMoneyDepositViewBarcode.AppLocation.MERCHANT_DETAILS : PaperMoneyDepositViewBarcode.AppLocation.MAP), null);
            zzr zzrVar = (zzr) selectCustomerPresenter.familyProfileManager;
            String str2 = success2.barcode_number;
            str2.getClass();
            PaperMoneyDepositBarcodeEvent.BarcodeParams barcodeParams = (PaperMoneyDepositBarcodeEvent.BarcodeParams) this.$event;
            int i2 = barcodeParams.height;
            int i3 = barcodeParams.width;
            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(EncodeHintType.MARGIN, 1));
            e eVar = (e) zzrVar.zza;
            BarcodeGenerator$BarcodeType$Code128 barcodeGenerator$BarcodeType$Code128 = BarcodeGenerator$BarcodeType$Code128.INSTANCE;
            if (!barcodeGenerator$BarcodeType$Code128.equals(barcodeGenerator$BarcodeType$Code128)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            final BitMatrix encode = eVar.encode(str2, BarcodeFormat.CODE_128, i3, i2, mapOf);
            encode.getClass();
            int i4 = encode.height;
            Bitmap createBitmap = Bitmap.createBitmap(((IntBuffer) IntStream.range(0, i4).flatMap(new IntFunction() { // from class: com.squareup.cash.deposits.physical.backend.real.barcode.AndroidBarcodeGenerator$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(final int i5) {
                    final BitMatrix bitMatrix = BitMatrix.this;
                    return IntStream.range(0, bitMatrix.width).map(new IntUnaryOperator() { // from class: com.squareup.cash.deposits.physical.backend.real.barcode.AndroidBarcodeGenerator$$ExternalSyntheticLambda4
                        @Override // java.util.function.IntUnaryOperator
                        public final int applyAsInt(int i6) {
                            return BitMatrix.this.get(i6, i5) ? -16777216 : -1;
                        }
                    });
                }
            }).collect(new Supplier() { // from class: com.squareup.cash.deposits.physical.backend.real.barcode.AndroidBarcodeGenerator$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    BitMatrix bitMatrix = BitMatrix.this;
                    return IntBuffer.allocate(bitMatrix.width * bitMatrix.height);
                }
            }, new AndroidBarcodeGenerator$$ExternalSyntheticLambda2(), new CollectCollectors$$ExternalSyntheticLambda3(3))).array(), encode.width, i4, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            AndroidBarcode androidBarcode = new AndroidBarcode(createBitmap);
            String str3 = success2.terms_text;
            str3.getClass();
            AndroidStringManager androidStringManager = (AndroidStringManager) selectCustomerPresenter.stringManager;
            String format2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(LocalDateTime.ofInstant(Instant.ofEpochMilli(success.expiresAt), ZoneId.systemDefault()));
            format2.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.barcode_expires)).format(new Object[]{format2});
            format3.getClass();
            this.$state$delegate.setValue(new PaperMoneyDepositBarcodeViewModel.Ready(success2, format3, androidBarcode, str3, selectCustomerPresenter.isFeatureFlagEnabled));
        } else if (barcodeInfo2 instanceof BarcodeInfo.Failure) {
            PaperCashDepositBlocker paperCashDepositBlocker = paperMoneyDepositBarcodeScreen.paperCashDepositBlocker;
            PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog = paperCashDepositBlocker.limits_reached_dialog;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) selectCustomerPresenter.navigator;
            if (limitsReachedDialog != null) {
                paperMoneyDepositBarcodeFailedScreen = new PhysicalCashLimitReachedScreen(limitsReachedDialog, paperMoneyDepositBarcodeScreen.blockersData);
            } else {
                GetPaperCashDepositBarcodeResponse.Failure failure = ((BarcodeInfo.Failure) barcodeInfo2).response;
                paperMoneyDepositBarcodeFailedScreen = new PaperMoneyDepositBarcodeFailedScreen(failure != null ? failure.title_text : null, failure != null ? failure.detail_text : null, failure != null ? failure.close_button_text : null, false, paperCashDepositBlocker, paperMoneyDepositBarcodeScreen.blockersData);
            }
            screenNavigator.goTo(paperMoneyDepositBarcodeFailedScreen);
        }
        return Unit.INSTANCE;
    }
}
