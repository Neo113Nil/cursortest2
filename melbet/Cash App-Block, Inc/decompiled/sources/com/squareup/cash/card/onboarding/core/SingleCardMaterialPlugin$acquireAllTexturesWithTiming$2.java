package com.squareup.cash.card.onboarding.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTextureKeys $keys;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public int I$8;
    public /* synthetic */ Object L$0;
    public Map L$1;
    public Deferred L$10;
    public Deferred L$11;
    public DeferredCoroutine L$3;
    public Deferred L$4;
    public Deferred L$5;
    public Deferred L$6;
    public Deferred L$7;
    public Deferred L$8;
    public Deferred L$9;
    public int label;
    public final /* synthetic */ SingleCardMaterialPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2(SingleCardMaterialPlugin singleCardMaterialPlugin, CardTextureKeys cardTextureKeys, Continuation continuation) {
        super(2, continuation);
        this.this$0 = singleCardMaterialPlugin;
        this.$keys = cardTextureKeys;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$invokeSuspend$timed(LinkedHashMap linkedHashMap, String str, Function1 function1, Continuation continuation) {
        SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1 singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1;
        int i;
        long currentTimeMillis;
        if (continuation instanceof SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1) {
            singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1 = (SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1) continuation;
            int i2 = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.L$0 = linkedHashMap;
                    singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.L$1 = str;
                    singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.J$0 = currentTimeMillis;
                    singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.label = 1;
                    obj = function1.invoke(singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.J$0;
                    String str2 = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.L$1;
                    LinkedHashMap linkedHashMap2 = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    currentTimeMillis = j;
                    str = str2;
                    linkedHashMap = linkedHashMap2;
                }
                int intValue = ((Number) obj).intValue();
                linkedHashMap.put(str, new Long(System.currentTimeMillis() - currentTimeMillis));
                return new Integer(intValue);
            }
        }
        singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1 = new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1(continuation);
        Object obj3 = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleCardMaterialPlugin$acquireAllTexturesWithTiming$2$timed$1.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj3).intValue();
        linkedHashMap.put(str, new Long(System.currentTimeMillis() - currentTimeMillis));
        return new Integer(intValue2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2 singleCardMaterialPlugin$acquireAllTexturesWithTiming$2 = new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2(this.this$0, this.$keys, continuation);
        singleCardMaterialPlugin$acquireAllTexturesWithTiming$2.L$0 = obj;
        return singleCardMaterialPlugin$acquireAllTexturesWithTiming$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0262  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v16, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.Deferred] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        DeferredCoroutine async$default;
        Deferred async$default2;
        DeferredCoroutine async$default3;
        DeferredCoroutine async$default4;
        DeferredCoroutine async$default5;
        DeferredCoroutine async$default6;
        Deferred async$default7;
        DeferredCoroutine deferredCoroutine;
        Object awaitInternal;
        CoroutineSingletons coroutineSingletons;
        Deferred deferred;
        Object await;
        Deferred deferred2;
        int i;
        Deferred deferred3;
        Deferred deferred4;
        LinkedHashMap linkedHashMap2;
        Deferred deferred5;
        Deferred deferred6;
        DeferredCoroutine deferredCoroutine2;
        Deferred deferred7;
        Deferred deferred8;
        Object await2;
        DeferredCoroutine deferredCoroutine3;
        Deferred deferred9;
        int i2;
        Deferred deferred10;
        Deferred deferred11;
        Deferred deferred12;
        Object await3;
        int i3;
        int i4;
        Deferred deferred13;
        Deferred deferred14;
        Object await4;
        int i5;
        int i6;
        int i7;
        int i8;
        Deferred deferred15;
        Deferred deferred16;
        Deferred deferred17;
        Object await5;
        int i9;
        int i10;
        Deferred deferred18;
        Deferred deferred19;
        Deferred deferred20;
        Object await6;
        int i11;
        int i12;
        int i13;
        Deferred deferred21;
        int i14;
        int i15;
        int i16;
        Deferred deferred22;
        Deferred deferred23;
        Object await7;
        int i17;
        int i18;
        Deferred deferred24;
        Object await8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Deferred deferred25;
        int i25;
        int i26;
        Object await9;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Continuation continuation = null;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                linkedHashMap = new LinkedHashMap();
                SingleCardMaterialPlugin singleCardMaterialPlugin = this.this$0;
                CardTextureKeys cardTextureKeys = this.$keys;
                DeferredCoroutine async$default8 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 1), 3);
                async$default = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 7), 3);
                async$default2 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 6), 3);
                async$default3 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 2), 3);
                async$default4 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 3), 3);
                DeferredCoroutine async$default9 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 8), 3);
                async$default5 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 4), 3);
                async$default6 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 5), 3);
                DeferredCoroutine async$default10 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 0), 3);
                async$default7 = JobKt.async$default(coroutineScope, null, null, new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(singleCardMaterialPlugin, cardTextureKeys, linkedHashMap, continuation, 9), 3);
                this.L$0 = null;
                this.L$1 = linkedHashMap;
                this.L$3 = async$default;
                this.L$4 = async$default2;
                this.L$5 = async$default3;
                this.L$6 = async$default4;
                this.L$7 = async$default9;
                this.L$8 = async$default5;
                this.L$9 = async$default6;
                deferredCoroutine = async$default10;
                this.L$10 = deferredCoroutine;
                this.L$11 = async$default7;
                this.label = 1;
                awaitInternal = async$default8.awaitInternal(this);
                coroutineSingletons = coroutineSingletons2;
                if (awaitInternal != coroutineSingletons) {
                    deferred = async$default9;
                    int intValue = ((Number) awaitInternal).intValue();
                    this.L$0 = null;
                    this.L$1 = linkedHashMap;
                    this.L$3 = null;
                    this.L$4 = async$default2;
                    this.L$5 = async$default3;
                    this.L$6 = async$default4;
                    this.L$7 = deferred;
                    this.L$8 = async$default5;
                    this.L$9 = async$default6;
                    this.L$10 = deferredCoroutine;
                    this.L$11 = async$default7;
                    this.I$0 = intValue;
                    this.label = 2;
                    await = async$default.await(this);
                    if (await != coroutineSingletons) {
                        DeferredCoroutine deferredCoroutine4 = async$default6;
                        deferred2 = async$default7;
                        i = intValue;
                        deferred3 = deferredCoroutine;
                        deferred4 = async$default4;
                        linkedHashMap2 = linkedHashMap;
                        deferred5 = deferred;
                        deferred6 = async$default5;
                        deferredCoroutine2 = deferredCoroutine4;
                        DeferredCoroutine deferredCoroutine5 = async$default3;
                        deferred7 = async$default2;
                        deferred8 = deferredCoroutine5;
                        int intValue2 = ((Number) await).intValue();
                        this.L$0 = null;
                        this.L$1 = linkedHashMap2;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = deferred8;
                        this.L$6 = deferred4;
                        this.L$7 = deferred5;
                        this.L$8 = deferred6;
                        this.L$9 = deferredCoroutine2;
                        this.L$10 = deferred3;
                        this.L$11 = deferred2;
                        this.I$0 = i;
                        this.I$1 = intValue2;
                        this.label = 3;
                        await2 = deferred7.await(this);
                        if (await2 != coroutineSingletons) {
                            Deferred deferred26 = deferred3;
                            deferredCoroutine3 = deferredCoroutine2;
                            deferred9 = deferred2;
                            i2 = intValue2;
                            deferred10 = deferred4;
                            deferred11 = deferred6;
                            deferred12 = deferred26;
                            int intValue3 = ((Number) await2).intValue();
                            this.L$0 = null;
                            this.L$1 = linkedHashMap2;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = deferred10;
                            this.L$7 = deferred5;
                            this.L$8 = deferred11;
                            this.L$9 = deferredCoroutine3;
                            this.L$10 = deferred12;
                            this.L$11 = deferred9;
                            this.I$0 = i;
                            this.I$1 = i2;
                            this.I$2 = intValue3;
                            this.label = 4;
                            await3 = deferred8.await(this);
                            if (await3 != coroutineSingletons) {
                                i3 = i;
                                i4 = intValue3;
                                Deferred deferred27 = deferred11;
                                deferred13 = deferred5;
                                deferred14 = deferred27;
                                int intValue4 = ((Number) await3).intValue();
                                this.L$0 = null;
                                this.L$1 = linkedHashMap2;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = deferred13;
                                this.L$8 = deferred14;
                                this.L$9 = deferredCoroutine3;
                                this.L$10 = deferred12;
                                this.L$11 = deferred9;
                                this.I$0 = i3;
                                this.I$1 = i2;
                                this.I$2 = i4;
                                this.I$3 = intValue4;
                                this.label = 5;
                                await4 = deferred10.await(this);
                                if (await4 != coroutineSingletons) {
                                    int i36 = i3;
                                    i5 = i4;
                                    i6 = i36;
                                    DeferredCoroutine deferredCoroutine6 = deferredCoroutine3;
                                    i7 = i2;
                                    i8 = intValue4;
                                    deferred15 = deferred13;
                                    deferred16 = deferred14;
                                    deferred17 = deferredCoroutine6;
                                    int intValue5 = ((Number) await4).intValue();
                                    this.L$0 = null;
                                    this.L$1 = linkedHashMap2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = deferred16;
                                    this.L$9 = deferred17;
                                    this.L$10 = deferred12;
                                    this.L$11 = deferred9;
                                    this.I$0 = i6;
                                    this.I$1 = i7;
                                    this.I$2 = i5;
                                    this.I$3 = i8;
                                    this.I$4 = intValue5;
                                    this.label = 6;
                                    await5 = deferred15.await(this);
                                    if (await5 != coroutineSingletons) {
                                        Deferred deferred28 = deferred9;
                                        i9 = i6;
                                        i10 = intValue5;
                                        deferred18 = deferred17;
                                        deferred19 = deferred12;
                                        deferred20 = deferred28;
                                        int intValue6 = ((Number) await5).intValue();
                                        this.L$0 = null;
                                        this.L$1 = linkedHashMap2;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = deferred18;
                                        this.L$10 = deferred19;
                                        this.L$11 = deferred20;
                                        this.I$0 = i9;
                                        this.I$1 = i7;
                                        this.I$2 = i5;
                                        this.I$3 = i8;
                                        this.I$4 = i10;
                                        this.I$5 = intValue6;
                                        this.label = 7;
                                        await6 = deferred16.await(this);
                                        if (await6 != coroutineSingletons) {
                                            int i37 = i5;
                                            i11 = i10;
                                            i12 = i37;
                                            Deferred deferred29 = deferred19;
                                            i13 = i9;
                                            deferred21 = deferred20;
                                            i14 = i7;
                                            i15 = i8;
                                            i16 = intValue6;
                                            deferred22 = deferred18;
                                            deferred23 = deferred29;
                                            int intValue7 = ((Number) await6).intValue();
                                            this.L$0 = null;
                                            this.L$1 = linkedHashMap2;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = null;
                                            this.L$9 = null;
                                            this.L$10 = deferred23;
                                            this.L$11 = deferred21;
                                            this.I$0 = i13;
                                            this.I$1 = i14;
                                            this.I$2 = i12;
                                            this.I$3 = i15;
                                            this.I$4 = i11;
                                            this.I$5 = i16;
                                            this.I$6 = intValue7;
                                            this.label = 8;
                                            await7 = deferred22.await(this);
                                            if (await7 != coroutineSingletons) {
                                                Deferred deferred30 = deferred21;
                                                i17 = i12;
                                                i18 = intValue7;
                                                deferred24 = deferred30;
                                                int intValue8 = ((Number) await7).intValue();
                                                this.L$0 = null;
                                                this.L$1 = linkedHashMap2;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = null;
                                                this.L$8 = null;
                                                this.L$9 = null;
                                                this.L$10 = null;
                                                this.L$11 = deferred24;
                                                this.I$0 = i13;
                                                this.I$1 = i14;
                                                this.I$2 = i17;
                                                this.I$3 = i15;
                                                this.I$4 = i11;
                                                this.I$5 = i16;
                                                this.I$6 = i18;
                                                this.I$7 = intValue8;
                                                this.label = 9;
                                                await8 = deferred23.await(this);
                                                if (await8 != coroutineSingletons) {
                                                    int i38 = i16;
                                                    i19 = i18;
                                                    i20 = i15;
                                                    i21 = i11;
                                                    i22 = i38;
                                                    int i39 = i14;
                                                    i23 = i17;
                                                    i24 = intValue8;
                                                    deferred25 = deferred24;
                                                    i25 = i13;
                                                    i26 = i39;
                                                    int intValue9 = ((Number) await8).intValue();
                                                    this.L$0 = null;
                                                    this.L$1 = linkedHashMap2;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.L$7 = null;
                                                    this.L$8 = null;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.L$11 = null;
                                                    this.I$0 = i25;
                                                    this.I$1 = i26;
                                                    this.I$2 = i23;
                                                    this.I$3 = i20;
                                                    this.I$4 = i21;
                                                    this.I$5 = i22;
                                                    this.I$6 = i19;
                                                    this.I$7 = i24;
                                                    this.I$8 = intValue9;
                                                    this.label = 10;
                                                    await9 = deferred25.await(this);
                                                    if (await9 != coroutineSingletons) {
                                                        int i40 = i26;
                                                        i27 = i19;
                                                        i28 = i40;
                                                        int i41 = i23;
                                                        i29 = i22;
                                                        i30 = i41;
                                                        i31 = i24;
                                                        i32 = i21;
                                                        i33 = i25;
                                                        i34 = intValue9;
                                                        i35 = i20;
                                                        return new Pair(new CardTextureIds(i33, i28, i30, i35, i32, i29, i27, i31, i34, ((Number) await9).intValue()), MapsKt__MapsKt.toMap(linkedHashMap2));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                async$default7 = this.L$11;
                ?? r3 = this.L$10;
                ?? r5 = this.L$9;
                ?? r6 = this.L$8;
                deferred = this.L$7;
                ?? r8 = this.L$6;
                ?? r10 = this.L$5;
                async$default2 = this.L$4;
                async$default = this.L$3;
                Map map = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                async$default5 = r6;
                async$default4 = r8;
                linkedHashMap = map;
                async$default3 = r10;
                deferredCoroutine = r3;
                async$default6 = r5;
                awaitInternal = obj;
                int intValue10 = ((Number) awaitInternal).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap;
                this.L$3 = null;
                this.L$4 = async$default2;
                this.L$5 = async$default3;
                this.L$6 = async$default4;
                this.L$7 = deferred;
                this.L$8 = async$default5;
                this.L$9 = async$default6;
                this.L$10 = deferredCoroutine;
                this.L$11 = async$default7;
                this.I$0 = intValue10;
                this.label = 2;
                await = async$default.await(this);
                if (await != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                i = this.I$0;
                deferred2 = this.L$11;
                deferred3 = this.L$10;
                ?? r62 = this.L$9;
                deferred6 = this.L$8;
                deferred5 = this.L$7;
                deferred4 = this.L$6;
                deferred8 = this.L$5;
                Deferred deferred31 = this.L$4;
                Map map2 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                deferredCoroutine2 = r62;
                linkedHashMap2 = map2;
                deferred7 = deferred31;
                await = obj;
                int intValue22 = ((Number) await).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = deferred8;
                this.L$6 = deferred4;
                this.L$7 = deferred5;
                this.L$8 = deferred6;
                this.L$9 = deferredCoroutine2;
                this.L$10 = deferred3;
                this.L$11 = deferred2;
                this.I$0 = i;
                this.I$1 = intValue22;
                this.label = 3;
                await2 = deferred7.await(this);
                if (await2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                int i42 = this.I$1;
                int i43 = this.I$0;
                Deferred deferred32 = this.L$11;
                Deferred deferred33 = this.L$10;
                ?? r63 = this.L$9;
                Deferred deferred34 = this.L$8;
                deferred5 = this.L$7;
                Deferred deferred35 = this.L$6;
                deferred8 = this.L$5;
                Map map3 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i2 = i42;
                i = i43;
                linkedHashMap2 = map3;
                deferred10 = deferred35;
                deferred11 = deferred34;
                deferred12 = deferred33;
                deferredCoroutine3 = r63;
                coroutineSingletons = coroutineSingletons2;
                deferred9 = deferred32;
                await2 = obj;
                int intValue32 = ((Number) await2).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = deferred10;
                this.L$7 = deferred5;
                this.L$8 = deferred11;
                this.L$9 = deferredCoroutine3;
                this.L$10 = deferred12;
                this.L$11 = deferred9;
                this.I$0 = i;
                this.I$1 = i2;
                this.I$2 = intValue32;
                this.label = 4;
                await3 = deferred8.await(this);
                if (await3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                i4 = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                Deferred deferred36 = this.L$11;
                Deferred deferred37 = this.L$10;
                ?? r7 = this.L$9;
                deferred14 = this.L$8;
                deferred13 = this.L$7;
                Deferred deferred38 = this.L$6;
                Map map4 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                deferred9 = deferred36;
                deferredCoroutine3 = r7;
                deferred12 = deferred37;
                linkedHashMap2 = map4;
                deferred10 = deferred38;
                await3 = obj;
                int intValue42 = ((Number) await3).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = deferred13;
                this.L$8 = deferred14;
                this.L$9 = deferredCoroutine3;
                this.L$10 = deferred12;
                this.L$11 = deferred9;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i4;
                this.I$3 = intValue42;
                this.label = 5;
                await4 = deferred10.await(this);
                if (await4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                int i44 = this.I$3;
                int i45 = this.I$2;
                int i46 = this.I$1;
                int i47 = this.I$0;
                Deferred deferred39 = this.L$11;
                deferred12 = this.L$10;
                deferred17 = this.L$9;
                deferred16 = this.L$8;
                deferred15 = this.L$7;
                Map map5 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i8 = i44;
                i6 = i47;
                i7 = i46;
                i5 = i45;
                coroutineSingletons = coroutineSingletons2;
                deferred9 = deferred39;
                linkedHashMap2 = map5;
                await4 = obj;
                int intValue52 = ((Number) await4).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = deferred16;
                this.L$9 = deferred17;
                this.L$10 = deferred12;
                this.L$11 = deferred9;
                this.I$0 = i6;
                this.I$1 = i7;
                this.I$2 = i5;
                this.I$3 = i8;
                this.I$4 = intValue52;
                this.label = 6;
                await5 = deferred15.await(this);
                if (await5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i10 = this.I$4;
                i8 = this.I$3;
                i5 = this.I$2;
                i7 = this.I$1;
                int i48 = this.I$0;
                deferred20 = this.L$11;
                deferred19 = this.L$10;
                Deferred deferred40 = this.L$9;
                Deferred deferred41 = this.L$8;
                Map map6 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                i9 = i48;
                linkedHashMap2 = map6;
                deferred18 = deferred40;
                deferred16 = deferred41;
                await5 = obj;
                int intValue62 = ((Number) await5).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = deferred18;
                this.L$10 = deferred19;
                this.L$11 = deferred20;
                this.I$0 = i9;
                this.I$1 = i7;
                this.I$2 = i5;
                this.I$3 = i8;
                this.I$4 = i10;
                this.I$5 = intValue62;
                this.label = 7;
                await6 = deferred16.await(this);
                if (await6 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                int i49 = this.I$5;
                int i50 = this.I$4;
                int i51 = this.I$3;
                int i52 = this.I$2;
                int i53 = this.I$1;
                int i54 = this.I$0;
                Deferred deferred42 = this.L$11;
                Deferred deferred43 = this.L$10;
                deferred22 = this.L$9;
                Map map7 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i16 = i49;
                i12 = i52;
                i15 = i51;
                i11 = i50;
                coroutineSingletons = coroutineSingletons2;
                deferred21 = deferred42;
                i13 = i54;
                i14 = i53;
                linkedHashMap2 = map7;
                deferred23 = deferred43;
                await6 = obj;
                int intValue72 = ((Number) await6).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = deferred23;
                this.L$11 = deferred21;
                this.I$0 = i13;
                this.I$1 = i14;
                this.I$2 = i12;
                this.I$3 = i15;
                this.I$4 = i11;
                this.I$5 = i16;
                this.I$6 = intValue72;
                this.label = 8;
                await7 = deferred22.await(this);
                if (await7 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                i18 = this.I$6;
                i16 = this.I$5;
                i11 = this.I$4;
                i15 = this.I$3;
                int i55 = this.I$2;
                i14 = this.I$1;
                i13 = this.I$0;
                deferred24 = this.L$11;
                Deferred deferred44 = this.L$10;
                Map map8 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                i17 = i55;
                linkedHashMap2 = map8;
                deferred23 = deferred44;
                await7 = obj;
                int intValue82 = ((Number) await7).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = deferred24;
                this.I$0 = i13;
                this.I$1 = i14;
                this.I$2 = i17;
                this.I$3 = i15;
                this.I$4 = i11;
                this.I$5 = i16;
                this.I$6 = i18;
                this.I$7 = intValue82;
                this.label = 9;
                await8 = deferred23.await(this);
                if (await8 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 9:
                int i56 = this.I$7;
                i19 = this.I$6;
                i22 = this.I$5;
                i21 = this.I$4;
                int i57 = this.I$3;
                i23 = this.I$2;
                i26 = this.I$1;
                i25 = this.I$0;
                deferred25 = this.L$11;
                Map map9 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i24 = i56;
                i20 = i57;
                coroutineSingletons = coroutineSingletons2;
                linkedHashMap2 = map9;
                await8 = obj;
                int intValue92 = ((Number) await8).intValue();
                this.L$0 = null;
                this.L$1 = linkedHashMap2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.I$0 = i25;
                this.I$1 = i26;
                this.I$2 = i23;
                this.I$3 = i20;
                this.I$4 = i21;
                this.I$5 = i22;
                this.I$6 = i19;
                this.I$7 = i24;
                this.I$8 = intValue92;
                this.label = 10;
                await9 = deferred25.await(this);
                if (await9 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 10:
                int i58 = this.I$8;
                int i59 = this.I$7;
                int i60 = this.I$6;
                int i61 = this.I$5;
                int i62 = this.I$4;
                int i63 = this.I$3;
                int i64 = this.I$2;
                int i65 = this.I$1;
                int i66 = this.I$0;
                Map map10 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i31 = i59;
                i33 = i66;
                i27 = i60;
                i28 = i65;
                i29 = i61;
                i30 = i64;
                i32 = i62;
                i35 = i63;
                linkedHashMap2 = map10;
                i34 = i58;
                await9 = obj;
                return new Pair(new CardTextureIds(i33, i28, i30, i35, i32, i29, i27, i31, i34, ((Number) await9).intValue()), MapsKt__MapsKt.toMap(linkedHashMap2));
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
