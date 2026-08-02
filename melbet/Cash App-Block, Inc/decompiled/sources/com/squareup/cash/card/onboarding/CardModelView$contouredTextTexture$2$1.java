package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.os.Parcelable;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.PasscodeVerifyTypeTransformer;
import com.squareup.cash.blockers.presenters.PasscodeVerifyTypeTransformer$transform$1$2$result$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.protos.cash.data.Expiration;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CardModelView$contouredTextTexture$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $contouredText;
    public final /* synthetic */ int $r8$classId;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Serializable L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$contouredTextTexture$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$contouredText = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$contouredText;
        switch (i) {
            case 0:
                CardModelView$contouredTextTexture$2$1 cardModelView$contouredTextTexture$2$1 = new CardModelView$contouredTextTexture$2$1((CardContouredText) obj3, (CardModelView) obj2, continuation, 0);
                cardModelView$contouredTextTexture$2$1.L$0 = obj;
                return cardModelView$contouredTextTexture$2$1;
            default:
                CardModelView$contouredTextTexture$2$1 cardModelView$contouredTextTexture$2$12 = new CardModelView$contouredTextTexture$2$1((ProducerScope) obj3, (PasscodeVerifyTypeTransformer) obj2, continuation, 1);
                cardModelView$contouredTextTexture$2$12.L$0 = obj;
                return cardModelView$contouredTextTexture$2$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CardModelView$contouredTextTexture$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CardModelView$contouredTextTexture$2$1) create((PasscodeViewEvent.VerifyPasscode) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0365, code lost:
    
        if (r1.emit(r4, r62) == r3) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0118, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r5)._channel.send(r1, r62) != r13) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0255, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r5)._channel.send(com.squareup.cash.blockers.viewmodels.PasscodeViewModel.VerifyPasscodeModel.PasscodeVerificationFailed.INSTANCE, r62) == r13) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0086, code lost:
    
        if (r2 == r13) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0073, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r5)._channel.send(com.squareup.cash.blockers.viewmodels.PasscodeViewModel.VerifyPasscodeModel.VerifyingPasscode.INSTANCE, r62) == r13) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        Pair pair;
        Pair pair2;
        Texture texture;
        Texture texture2;
        CardContouredText cardContouredText;
        Integer num;
        int i;
        Pair pair3;
        Object withContext;
        Pair pair4;
        int i2;
        Texture createTexture;
        CardTextureState cardTextureState;
        Object until;
        VerifyPasscodeResponse verifyPasscodeResponse;
        int i3;
        Serializable serializable;
        int i4;
        ?? r12;
        BlockersData copy$default;
        Screen next;
        String str;
        VerifyPasscodeResponse.ProtectedData protectedData;
        String str2;
        Screen screen;
        BlockersData blockersData;
        VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo;
        VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo;
        BlockersData blockersData2;
        Screen screen2;
        String str3;
        ?? r122;
        int i5 = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$contouredText;
        Continuation continuation = null;
        switch (i5) {
            case 0:
                CardModelView cardModelView = (CardModelView) obj2;
                CardContouredText cardContouredText2 = (CardContouredText) obj3;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                Continuation continuation2 = null;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    intValue = (cardContouredText2 == null || (num = cardContouredText2.color) == null) ? -16777216 : num.intValue();
                    pair = cardContouredText2 != null ? new Pair(cardContouredText2.text, new Integer(intValue)) : null;
                    CardTextureState cardTextureState2 = cardModelView.textureState;
                    if (cardTextureState2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState2.contouredTextTexture);
                    pair2 = (Pair) access$nullableItems.first;
                    texture = (Texture) access$nullableItems.second;
                    if (texture != null) {
                        this.L$0 = flowCollector;
                        this.L$1 = pair;
                        this.L$2 = pair2;
                        this.L$3 = texture;
                        this.L$4 = cardContouredText2;
                        this.I$0 = intValue;
                        this.label = 1;
                        if (flowCollector.emit(texture, this) != coroutineSingletons) {
                            texture2 = texture;
                            cardContouredText = cardContouredText2;
                        }
                        return coroutineSingletons;
                    }
                    i = intValue;
                    pair3 = pair;
                    if (Intrinsics.areEqual(pair2, pair3) || texture == null) {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2(cardContouredText2, cardModelView, i, continuation2, 15);
                        this.L$0 = flowCollector;
                        this.L$1 = pair3;
                        this.L$2 = null;
                        this.L$3 = texture;
                        this.L$4 = null;
                        this.I$0 = i;
                        this.label = 2;
                        withContext = JobKt.withContext(defaultIoScheduler, anonymousClass2, this);
                        if (withContext != coroutineSingletons) {
                            pair4 = pair3;
                            i2 = i;
                            TextureType textureType = TextureType.COLOR;
                            createTexture = cardModelView.createTexture(255, (Bitmap) withContext, TextureType.COLOR);
                            cardTextureState = cardModelView.textureState;
                            if (cardTextureState != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return Unit.INSTANCE;
                }
                if (i6 == 1) {
                    intValue = this.I$0;
                    cardContouredText = (CardContouredText) this.L$4;
                    texture2 = (Texture) this.L$3;
                    pair2 = (Pair) this.L$2;
                    pair = (Pair) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    i2 = this.I$0;
                    Texture texture3 = (Texture) this.L$3;
                    Pair pair5 = (Pair) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    pair4 = pair5;
                    texture = texture3;
                    withContext = obj;
                    TextureType textureType2 = TextureType.COLOR;
                    createTexture = cardModelView.createTexture(255, (Bitmap) withContext, TextureType.COLOR);
                    cardTextureState = cardModelView.textureState;
                    if (cardTextureState != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    cardTextureState.contouredTextTexture = new Pair(pair4, createTexture);
                    if (texture != null) {
                        cardModelView.getEngine().destroyTexture(texture);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = i2;
                    this.label = 3;
                    break;
                }
                if (cardContouredText == null) {
                    return Unit.INSTANCE;
                }
                texture = texture2;
                i = intValue;
                pair3 = pair;
                if (Intrinsics.areEqual(pair2, pair3)) {
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                PlaidLinkView.AnonymousClass2 anonymousClass22 = new PlaidLinkView.AnonymousClass2(cardContouredText2, cardModelView, i, continuation2, 15);
                this.L$0 = flowCollector;
                this.L$1 = pair3;
                this.L$2 = null;
                this.L$3 = texture;
                this.L$4 = null;
                this.I$0 = i;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler2, anonymousClass22, this);
                if (withContext != coroutineSingletons) {
                }
                return coroutineSingletons;
            default:
                ProducerScope producerScope = (ProducerScope) obj3;
                PasscodeVerifyTypeTransformer passcodeVerifyTypeTransformer = (PasscodeVerifyTypeTransformer) obj2;
                AndroidBiometricsStore androidBiometricsStore = passcodeVerifyTypeTransformer.biometricsStore;
                BlockersDataNavigator blockersDataNavigator = passcodeVerifyTypeTransformer.blockersNavigator;
                BetterNavigator.ScreenNavigator screenNavigator = passcodeVerifyTypeTransformer.navigator;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeVerifyTypeTransformer.args;
                PasscodeViewEvent.VerifyPasscode verifyPasscode = (PasscodeViewEvent.VerifyPasscode) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = 0;
                int i8 = 4;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = verifyPasscode;
                        this.label = 1;
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        Signal signal = passcodeVerifyTypeTransformer.signOut;
                        PasscodeVerifyTypeTransformer$transform$1$2$result$1 passcodeVerifyTypeTransformer$transform$1$2$result$1 = new PasscodeVerifyTypeTransformer$transform$1$2$result$1(passcodeVerifyTypeTransformer, verifyPasscode, continuation, i7);
                        this.L$0 = verifyPasscode;
                        this.label = 2;
                        until = StateFlowKt.until(signal, passcodeVerifyTypeTransformer$transform$1$2$result$1, this);
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        until = obj;
                        ApiResult apiResult = (ApiResult) until;
                        if (apiResult == null) {
                            return Unit.INSTANCE;
                        }
                        if (apiResult instanceof ApiResult.Success) {
                            verifyPasscodeResponse = (VerifyPasscodeResponse) ((ApiResult.Success) apiResult).response;
                            boolean z = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint;
                            VerifyPasscodeResponse.Status status = verifyPasscodeResponse.status;
                            if (status == null) {
                                status = ProtoDefaults.VERIFY_PASSCODE_STATUS;
                            }
                            ResponseContext responseContext = verifyPasscodeResponse.response_context;
                            int ordinal = status.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    passcodeVerifyTypeTransformer.appLockState.sendEvent(RealAppLockState.AppLockEvent.AppUnlocked.INSTANCE);
                                    String str4 = passcodeScreen.verificationInstrumentToken;
                                    r12 = z;
                                    r12 = z;
                                    if (str4 != null && !z) {
                                        String str5 = verifyPasscodeResponse.passcode_token;
                                        this.L$0 = null;
                                        this.L$1 = verifyPasscodeResponse;
                                        this.I$0 = z ? 1 : 0;
                                        this.label = 3;
                                        if (androidBiometricsStore.write(str4, str5, this) != coroutineSingletons2) {
                                            i3 = z ? 1 : 0;
                                            r12 = i3;
                                        }
                                    }
                                    BlockersData blockersData3 = passcodeScreen.blockersData;
                                    ResponseContext responseContext2 = verifyPasscodeResponse.response_context;
                                    responseContext2.getClass();
                                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                                    copy$default = BlockersData.copy$default(blockersData3.updateFromResponseContext(responseContext2, false), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, new RedactedString(verifyPasscodeResponse.full_name), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -2097153, 65535);
                                    next = blockersDataNavigator.getNext(passcodeScreen, copy$default);
                                    ResponseContext responseContext3 = verifyPasscodeResponse.response_context;
                                    str = responseContext3 == null ? responseContext3.dialog_message : null;
                                    protectedData = verifyPasscodeResponse.protected_data;
                                    if (protectedData != null || (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = protectedData.f1367type) == null || (cashCardInfo = verifyPasscodeResponse$ProtectedData$Type$CashCardInfo.value) == null) {
                                        str2 = str;
                                        screen = next;
                                        blockersData = copy$default;
                                        if (str2 != null && !StringsKt.isBlank(str2)) {
                                            screen = new BlockersScreens.SuccessMessageScreen(blockersData, screen, str2, null, 8);
                                        }
                                        screenNavigator.goTo(screen);
                                    } else {
                                        Expiration expiration = cashCardInfo.expiration;
                                        expiration.getClass();
                                        Integer num2 = expiration.year;
                                        num2.getClass();
                                        Integer num3 = expiration.month;
                                        num3.getClass();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(num2);
                                        sb.append(num3);
                                        String sb2 = sb.toString();
                                        IssuedCardManager issuedCardManager = passcodeVerifyTypeTransformer.issuedCardManager;
                                        String str6 = cashCardInfo.pan;
                                        str6.getClass();
                                        String str7 = cashCardInfo.cvv;
                                        str7.getClass();
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = copy$default;
                                        this.L$3 = next;
                                        this.L$4 = str;
                                        this.I$0 = r12;
                                        this.label = 4;
                                        if (((RealIssuedCardManager) issuedCardManager).saveSensitiveData(str6, str7, sb2, this) != coroutineSingletons2) {
                                            blockersData2 = copy$default;
                                            screen2 = next;
                                            str3 = str;
                                            blockersData = blockersData2;
                                            str2 = str3;
                                            screen = screen2;
                                            if (str2 != null) {
                                                screen = new BlockersScreens.SuccessMessageScreen(blockersData, screen, str2, null, 8);
                                            }
                                            screenNavigator.goTo(screen);
                                        }
                                    }
                                } else if (ordinal == 2) {
                                    String str8 = passcodeScreen.verificationInstrumentToken;
                                    serializable = null;
                                    r122 = z;
                                    if (str8 != null) {
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.I$0 = z ? 1 : 0;
                                        this.label = 5;
                                        if (androidBiometricsStore.write(str8, null, this) != coroutineSingletons2) {
                                            i4 = z ? 1 : 0;
                                            r122 = i4;
                                        }
                                    }
                                    PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(r122 != 0);
                                    this.L$0 = serializable;
                                    this.L$1 = serializable;
                                    this.I$0 = r122;
                                    this.label = 6;
                                    break;
                                } else {
                                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    BlockersData blockersData4 = passcodeScreen.blockersData;
                                    responseContext.getClass();
                                    Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                                    BlockersData updateFromResponseContext = blockersData4.updateFromResponseContext(responseContext, false);
                                    Screen next2 = blockersDataNavigator.getNext(passcodeScreen, updateFromResponseContext);
                                    String str9 = responseContext.dialog_message;
                                    if (str9 != null && !StringsKt.isBlank(str9)) {
                                        next2 = new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, next2, str9, null, 8);
                                    }
                                    screenNavigator.goTo(next2);
                                }
                                return coroutineSingletons2;
                            }
                            return Unit.INSTANCE;
                        }
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new FailureMessageBlockerScreen(passcodeScreen.blockersData, TextUtilsCompat.errorMessaging(passcodeVerifyTypeTransformer.stringManager, (ApiResult.Failure) apiResult, null).message, null, i8));
                        this.L$0 = null;
                        this.label = 7;
                        break;
                    case 3:
                        i3 = this.I$0;
                        verifyPasscodeResponse = (VerifyPasscodeResponse) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        r12 = i3;
                        BlockersData blockersData32 = passcodeScreen.blockersData;
                        ResponseContext responseContext22 = verifyPasscodeResponse.response_context;
                        responseContext22.getClass();
                        Parcelable.Creator<BlockersData> creator3 = BlockersData.CREATOR;
                        copy$default = BlockersData.copy$default(blockersData32.updateFromResponseContext(responseContext22, false), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, new RedactedString(verifyPasscodeResponse.full_name), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -2097153, 65535);
                        next = blockersDataNavigator.getNext(passcodeScreen, copy$default);
                        ResponseContext responseContext32 = verifyPasscodeResponse.response_context;
                        if (responseContext32 == null) {
                        }
                        protectedData = verifyPasscodeResponse.protected_data;
                        if (protectedData != null) {
                            break;
                        }
                        str2 = str;
                        screen = next;
                        blockersData = copy$default;
                        if (str2 != null) {
                        }
                        screenNavigator.goTo(screen);
                        return Unit.INSTANCE;
                    case 4:
                        str3 = (String) this.L$4;
                        screen2 = (Screen) this.L$3;
                        blockersData2 = (BlockersData) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        blockersData = blockersData2;
                        str2 = str3;
                        screen = screen2;
                        if (str2 != null) {
                        }
                        screenNavigator.goTo(screen);
                        return Unit.INSTANCE;
                    case 5:
                        i4 = this.I$0;
                        SafeTrace.throwOnFailure(obj);
                        serializable = null;
                        r122 = i4;
                        PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode2 = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(r122 != 0);
                        this.L$0 = serializable;
                        this.L$1 = serializable;
                        this.I$0 = r122;
                        this.label = 6;
                        break;
                    case 6:
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }
}
