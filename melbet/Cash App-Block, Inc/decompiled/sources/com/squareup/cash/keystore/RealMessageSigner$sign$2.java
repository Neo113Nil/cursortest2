package com.squareup.cash.keystore;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.offers.presenters.OfferDetailsFooterStateV2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.security.mri.api.v1.AttestedKeySigningData;
import com.squareup.wire.Message;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealMessageSigner$sign$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $attestedKeyService;
    public final /* synthetic */ boolean $generateKey;
    public final /* synthetic */ Object $message;
    public final /* synthetic */ boolean $populateOriginalFields;
    public final /* synthetic */ int $r8$classId = 0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMessageSigner$sign$2(boolean z, boolean z2, CardLockPresenter cardLockPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$generateKey = z;
        this.$populateOriginalFields = z2;
        this.L$1 = cardLockPresenter;
        this.this$0 = mutableState;
        this.$message = mutableState2;
        this.$attestedKeyService = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$attestedKeyService;
        Object obj3 = this.$message;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                boolean z = this.$populateOriginalFields;
                return new RealMessageSigner$sign$2((RealMessageSigner) obj4, (Message) obj3, this.$generateKey, (AttestedKeyService) obj2, z, continuation);
            default:
                return new RealMessageSigner$sign$2(this.$generateKey, this.$populateOriginalFields, (CardLockPresenter) this.L$1, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealMessageSigner$sign$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r13) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r13) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0183, code lost:
    
        if (r14 != r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r14 == r9) goto L64;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Field field;
        byte[] encode;
        AttestedKeyService attestedKeyService;
        Object m3588prepareIoAF18A;
        byte[] bArr;
        Object m3589signgIAlus;
        int i = this.$r8$classId;
        Object obj2 = this.$attestedKeyService;
        Object obj3 = this.this$0;
        boolean z = this.$generateKey;
        Object obj4 = this.$message;
        switch (i) {
            case 0:
                RealMessageSigner realMessageSigner = (RealMessageSigner) obj3;
                AttestedKeyService attestedKeyService2 = (AttestedKeyService) obj2;
                Message message = (Message) obj4;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        field = message.getClass().getDeclaredField("signing_data_");
                    } catch (NoSuchFieldException unused) {
                        field = null;
                    }
                    if (field != null) {
                        if (field.get(message) == null) {
                            encode = message.adapter().encode(message);
                            if (!z) {
                                attestedKeyService = attestedKeyService2;
                                if (((RealAttestedKeyService) attestedKeyService).state == null) {
                                    Result.Companion companion = Result.Companion;
                                    return new Result(new Result.Failure(new KeyNotReadyException("Key is not ready and generateKey is false. Skipping signing.", null)));
                                }
                                bArr = encode;
                                this.L$1 = bArr;
                                this.label = 2;
                                m3589signgIAlus = ((RealAttestedKeyService) attestedKeyService).m3589signgIAlus(bArr);
                                break;
                            } else {
                                this.L$1 = encode;
                                this.label = 1;
                                m3588prepareIoAF18A = ((RealAttestedKeyService) attestedKeyService2).m3588prepareIoAF18A(this);
                                break;
                            }
                        } else {
                            Result.Companion companion2 = Result.Companion;
                            return new Result(new Result.Failure(new MessageAlreadySignedException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Proto class ", Reflection.factory.getOrCreateKotlinClass(message.getClass()).getQualifiedName(), " already has signing_data_ populated. We don't allow resigning an already signed message."), null)));
                        }
                    } else {
                        Result.Companion companion3 = Result.Companion;
                        return new Result(new Result.Failure(new MissingSigningDataFieldException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Proto class ", Reflection.factory.getOrCreateKotlinClass(message.getClass()).getQualifiedName(), " does not have a 'signing_data_' field. Add an 'optional SigningData signing_data_' to the proto definition."), null)));
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bArr = (byte[]) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        m3589signgIAlus = ((Result) obj).value;
                        byte[] bArr2 = bArr;
                        Message message2 = (Message) obj4;
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m3589signgIAlus);
                        if (m4120exceptionOrNullimpl != null) {
                            return new Result(RealMessageSigner.m3591addSigningDataToMessageyxL6bBk$default(realMessageSigner, message2, bArr2, this.$populateOriginalFields, null, AttestedKeyClientErrorMapper.toClientError(m4120exceptionOrNullimpl), 8));
                        }
                        return new Result(RealMessageSigner.m3591addSigningDataToMessageyxL6bBk$default(realMessageSigner, (Message) obj4, bArr2, this.$populateOriginalFields, (AttestedKeySigningData) m3589signgIAlus, null, 16));
                    }
                    encode = (byte[]) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m3588prepareIoAF18A = ((Result) obj).value;
                }
                attestedKeyService = attestedKeyService2;
                Message message3 = (Message) obj4;
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(m3588prepareIoAF18A);
                if (m4120exceptionOrNullimpl2 != null) {
                    return new Result(RealMessageSigner.m3591addSigningDataToMessageyxL6bBk$default(realMessageSigner, message3, encode, this.$populateOriginalFields, null, AttestedKeyClientErrorMapper.toClientError(m4120exceptionOrNullimpl2), 8));
                }
                bArr = encode;
                this.L$1 = bArr;
                this.label = 2;
                m3589signgIAlus = ((RealAttestedKeyService) attestedKeyService).m3589signgIAlus(bArr);
            default:
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                boolean z2 = this.$populateOriginalFields;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState.getValue()).booleanValue() && !z && z2) {
                        mutableState2.setValue(OfferDetailsFooterStateV2.OFFER_ADD_CONFIRMATION_ANIMATION);
                        this.label = 1;
                        break;
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue() && !z && !z2) {
                        mutableState2.setValue(OfferDetailsFooterStateV2.OFFER_REMOVE_CONFIRMATION_ANIMATION);
                        this.label = 2;
                        break;
                    }
                    mutableState.setValue(Boolean.valueOf(z));
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(OfferDetailsFooterStateV2.BUTTONS);
                    if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        ((CardLockPresenter) this.L$1).navigator.goTo(Back.INSTANCE);
                    }
                    mutableState.setValue(Boolean.valueOf(z));
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(OfferDetailsFooterStateV2.BUTTONS);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState2.setValue(OfferDetailsFooterStateV2.OFFER_REMOVE_CONFIRMATION_ANIMATION);
                    this.label = 2;
                }
                mutableState.setValue(Boolean.valueOf(z));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMessageSigner$sign$2(RealMessageSigner realMessageSigner, Message message, boolean z, AttestedKeyService attestedKeyService, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realMessageSigner;
        this.$message = message;
        this.$generateKey = z;
        this.$attestedKeyService = attestedKeyService;
        this.$populateOriginalFields = z2;
    }
}
