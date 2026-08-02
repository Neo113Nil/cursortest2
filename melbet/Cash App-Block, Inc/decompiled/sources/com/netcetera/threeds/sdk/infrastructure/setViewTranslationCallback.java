package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;

/* loaded from: classes5.dex */
public abstract class setViewTranslationCallback implements ChallengeStatusReceiver {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final setScrollCaptureHint ThreeDS2Service;

    public setViewTranslationCallback(ChallengeStatusReceiver challengeStatusReceiver) {
        this.ThreeDS2Service = setTouchscreenBlocksFocus.get(challengeStatusReceiver);
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
        setviewtranslationcallback.ThreeDS2Service.get(new setTransitionGroup(setviewtranslationcallback, (com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent) objArr[1]));
        int i = getWarnings;
        int i2 = (-2) - (((i & 38) + (i | 38)) ^ (-1));
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent = (com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = (i | 13) << 1;
        int i3 = -(i ^ 13);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        setviewtranslationcallback.initialize(runtimeErrorEvent);
        if (i5 != 0) {
            int i6 = 19 / 0;
        }
        int i7 = ThreeDS2ServiceInstance;
        int i8 = (i7 | 27) << 1;
        int i9 = -(i7 ^ 27);
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        getWarnings = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 73 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
        setviewtranslationcallback.ThreeDS2Service.get(new setAutoHandwritingEnabled(setviewtranslationcallback, (com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent) objArr[1]));
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
        setviewtranslationcallback.ThreeDS2Service.get(new setMotionEventSplittingEnabled(setviewtranslationcallback, (com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent) objArr[1]));
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 101;
        int i3 = -(-((i ^ 101) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i3;
        int i6 = (((~(i5 | i2)) | i4) * (-1188)) + (i2 * (-1187)) + (i * 595);
        int i7 = ~i2;
        int i8 = (~(i3 | i7)) | i4;
        int i9 = ~(i5 | i);
        switch ((((~(i | i7)) | (~(i7 | i5)) | i9) * 594) + ((i8 | i9) * 594) + i6) {
            case 1:
                return ThreeDS2ServiceInstance(objArr);
            case 2:
                setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
                com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent = (com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent) objArr[1];
                int i10 = ThreeDS2ServiceInstance;
                int i11 = i10 & 107;
                int i12 = (i10 ^ 107) | i11;
                getWarnings = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                setviewtranslationcallback.ThreeDS2Service(completionEvent);
                int i13 = ThreeDS2ServiceInstance;
                getWarnings = Thread$State$EnumUnboxingLocalUtility.m(i13 & 108, i13 | 108, 1, 128);
                return null;
            case 3:
                return initialize(objArr);
            case 4:
                setViewTranslationCallback setviewtranslationcallback2 = (setViewTranslationCallback) objArr[0];
                setviewtranslationcallback2.ThreeDS2Service.get(new setClipChildren(setviewtranslationcallback2));
                int i14 = getWarnings;
                int i15 = i14 | 57;
                ThreeDS2ServiceInstance = ((i15 << 1) - ((~(i14 & 57)) & i15)) % 128;
                return null;
            case 5:
                return get(objArr);
            case 6:
                return getWarnings(objArr);
            case 7:
                setViewTranslationCallback setviewtranslationcallback3 = (setViewTranslationCallback) objArr[0];
                setviewtranslationcallback3.ThreeDS2Service.get(new setRequestedFrameRate(setviewtranslationcallback3));
                int i16 = ThreeDS2ServiceInstance;
                int i17 = i16 & 17;
                int i18 = ((i16 ^ 17) | i17) << 1;
                int i19 = -((i16 | 17) & (~i17));
                getWarnings = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                return null;
            default:
                return ThreeDS2Service(objArr);
        }
    }

    public abstract void ThreeDS2Service(com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent);

    public abstract void ThreeDS2ServiceInstance();

    public abstract void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent);

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void cancelled() {
        initialize(new Object[]{this}, -975241326, 975241333, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void completed(com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent) {
        initialize(new Object[]{this, completionEvent}, 1883383546, -1883383541, System.identityHashCode(this));
    }

    public abstract void initialize();

    public abstract void initialize(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent);

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void protocolError(com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent) {
        initialize(new Object[]{this, protocolErrorEvent}, -703377053, 703377053, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void runtimeError(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        initialize(new Object[]{this, runtimeErrorEvent}, 200573883, -200573877, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void timedout() {
        initialize(new Object[]{this}, 1775236273, -1775236269, System.identityHashCode(this));
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setViewTranslationCallback setviewtranslationcallback = (setViewTranslationCallback) objArr[0];
        com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent = (com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent) objArr[1];
        int i = getWarnings;
        int i2 = ((i ^ 19) | (i & 19)) << 1;
        int i3 = -(((~i) & 19) | (i & (-20)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        setviewtranslationcallback.ThreeDS2ServiceInstance(protocolErrorEvent);
        if (i5 != 0) {
            return null;
        }
        int i6 = 65 / 0;
        return null;
    }
}
