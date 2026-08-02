package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.security.KeyPair;

/* loaded from: classes5.dex */
public final class iv implements com.netcetera.threeds.sdk.api.transaction.Transaction {
    private static int ConfigParameters = 1;
    private static int onError;
    private final ih ThreeDS2Service;
    private nc ThreeDS2ServiceInitializationCallback;
    private final KeyPair ThreeDS2ServiceInstance;
    private setLetterSpacing addParam;
    private final fu cleanup;
    private final nh createTransaction;
    private final CompletionEvent get;
    private final je getSDKInfo;
    private jm getSDKVersion;
    private final String getWarnings;
    private final setUseBoundsForWidth initialize;

    public iv(CompletionEvent completionEvent, setUseBoundsForWidth setuseboundsforwidth, String str, fu fuVar, KeyPair keyPair, ih ihVar, jm jmVar, nc ncVar, je jeVar, nh nhVar) {
        this.get = completionEvent;
        this.initialize = setuseboundsforwidth;
        this.getWarnings = str;
        this.cleanup = fuVar;
        this.ThreeDS2ServiceInstance = keyPair;
        this.ThreeDS2Service = ihVar;
        this.getSDKVersion = jmVar;
        this.ThreeDS2ServiceInitializationCallback = ncVar;
        this.getSDKInfo = jeVar;
        this.createTransaction = nhVar;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        iv ivVar = (iv) objArr[0];
        Activity activity = (Activity) objArr[1];
        com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters = (com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters) objArr[2];
        ChallengeStatusReceiver challengeStatusReceiver = (ChallengeStatusReceiver) objArr[3];
        int intValue = ((Number) objArr[4]).intValue();
        onError = (ConfigParameters + 91) % 128;
        ivVar.ThreeDS2ServiceInitializationCallback.initialize();
        ivVar.getSDKVersion.get(activity);
        ih ihVar = ivVar.ThreeDS2Service;
        jm jmVar = ivVar.getSDKVersion;
        nh nhVar = ivVar.createTransaction;
        je jeVar = ivVar.getSDKInfo;
        setLetterSpacing ThreeDS2Service = ihVar.ThreeDS2Service(activity, challengeParameters, challengeStatusReceiver, intValue, jmVar, nhVar, jeVar, jeVar);
        ivVar.addParam = ThreeDS2Service;
        ThreeDS2Service.ThreeDS2ServiceInstance();
        int i = ConfigParameters;
        int i2 = i & 1;
        int i3 = (i ^ 1) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onError = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void close() {
        int i = ConfigParameters;
        int i2 = i ^ 119;
        int i3 = (i & 119) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        onError = i4 % 128;
        int i5 = i4 % 2;
        nc ncVar = this.ThreeDS2ServiceInitializationCallback;
        if (i5 == 0) {
            ncVar.getWarnings();
            this.getSDKVersion.getWarnings();
            this.getSDKInfo.ThreeDS2Service();
            this.ThreeDS2ServiceInitializationCallback = null;
            this.getSDKVersion = null;
            return;
        }
        ncVar.getWarnings();
        this.getSDKVersion.getWarnings();
        this.getSDKInfo.ThreeDS2Service();
        this.ThreeDS2ServiceInitializationCallback = null;
        this.getSDKVersion = null;
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void doChallenge(Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i) {
        setTouchscreenBlocksFocus.get(challengeStatusReceiver).get(new ix(this, activity, challengeParameters, challengeStatusReceiver, i));
        int i2 = onError;
        int i3 = (i2 | 55) << 1;
        int i4 = -(i2 ^ 55);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ConfigParameters = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters getAuthenticationRequestParameters() {
        int i = ConfigParameters;
        int i2 = i ^ 97;
        int i3 = ((((i & 97) | i2) << 1) - (~(-i2))) - 1;
        onError = i3 % 128;
        int i4 = i3 % 2;
        setUseBoundsForWidth setuseboundsforwidth = this.initialize;
        if (i4 != 0) {
            setuseboundsforwidth.getWarnings(this.get, this.getWarnings, this.ThreeDS2ServiceInstance, this.cleanup.initialize());
            throw null;
        }
        com.netcetera.threeds.sdk.api.transaction.AuthenticationRequestParameters warnings = setuseboundsforwidth.getWarnings(this.get, this.getWarnings, this.ThreeDS2ServiceInstance, this.cleanup.initialize());
        int i5 = onError;
        ConfigParameters = (((i5 | 73) << 1) - (i5 ^ 73)) % 128;
        return warnings;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public com.netcetera.threeds.sdk.api.ui.ProgressView getProgressView(Activity activity) {
        this.getSDKVersion.get(activity);
        jk jkVar = new jk(this.getSDKVersion, this.ThreeDS2ServiceInitializationCallback);
        int i = ConfigParameters;
        int i2 = i & 23;
        int i3 = -(-((i ^ 23) | i2));
        onError = ((i2 & i3) + (i3 | i2)) % 128;
        return jkVar;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.Transaction
    public void useBridgingExtension(Transaction.BridgingMessageExtensionVersion bridgingMessageExtensionVersion) {
        int i = ConfigParameters;
        int i2 = i & 121;
        onError = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~(-(-((i ^ 121) | i2))), 1, 128);
        this.getSDKInfo.ThreeDS2Service(setTitleMarginStart.get.getWarnings(bridgingMessageExtensionVersion.getValue()));
        int i3 = ConfigParameters;
        int i4 = i3 ^ 47;
        int i5 = (i3 & 47) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        onError = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }
}
