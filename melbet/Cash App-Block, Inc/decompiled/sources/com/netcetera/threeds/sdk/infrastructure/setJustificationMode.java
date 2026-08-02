package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.api.transaction.challenge.ErrorMessage;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setJustificationMode {
    private static int cleanup = 1;
    private static int getSDKVersion;
    private final setLayoutTransition ThreeDS2Service;
    private final setCacheColorHint.getWarnings ThreeDS2ServiceInitializationCallback;
    private final String get;
    private final ChallengeStatusReceiver getWarnings;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setJustificationMode.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final String initialize = "";

    public setJustificationMode(setLayoutTransition setlayouttransition, ChallengeStatusReceiver challengeStatusReceiver, String str, setCacheColorHint.getWarnings getwarnings) {
        this.ThreeDS2Service = setlayouttransition;
        this.getWarnings = challengeStatusReceiver;
        this.get = str;
        this.ThreeDS2ServiceInitializationCallback = getwarnings;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-344)) + (i * (-344));
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = ((~(i7 | i3)) * 345) + (((~(i | i6)) | (~(i5 | (~i3)))) * 345) + (((~i7) | (~(i5 | i3))) * 345) + i4;
        if (i8 == 1) {
            setJustificationMode setjustificationmode = new setJustificationMode(new setLayoutTransition(new setLayoutAnimation()), (ChallengeStatusReceiver) objArr[0], (String) objArr[1], (setCacheColorHint.getWarnings) objArr[2]);
            int i9 = getSDKVersion;
            cleanup = ((-2) - (((i9 ^ 14) + ((i9 & 14) << 1)) ^ (-1))) % 128;
            return setjustificationmode;
        }
        if (i8 == 2) {
            return get(objArr);
        }
        String str = (String) objArr[1];
        int i10 = getSDKVersion;
        int i11 = i10 & 47;
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1((i10 | 47) & (~i11), ~(i11 << 1), 1, 128);
        String str2 = (String) oj.getWarnings(str, "");
        int i12 = cleanup;
        int i13 = i12 & 97;
        getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i12 ^ 97) | i13) << 1, ~(-((i12 | 97) & (~i13))), 1, 128);
        return str2;
    }

    public void ThreeDS2Service(setScrollCaptureCallback setscrollcapturecallback) {
        int i = getSDKVersion;
        cleanup = ((i & 105) + (i | 105)) % 128;
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent warnings = this.ThreeDS2Service.getWarnings(setscrollcapturecallback);
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(warnings.getErrorMessage(), setscrollcapturecallback.getCause());
        this.getWarnings.runtimeError(warnings);
        int i2 = getSDKVersion;
        int i3 = (i2 & 53) + (i2 | 53);
        cleanup = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void get(setCursorVisible setcursorvisible) {
        String str = (String) ThreeDS2ServiceInstance(new Object[]{this, setcursorvisible.ids()}, -558504954, 558504956, System.identityHashCode(this));
        String str2 = (String) ThreeDS2ServiceInstance(new Object[]{this, setcursorvisible.encryptionPublicKey()}, -558504954, 558504956, System.identityHashCode(this));
        String str3 = (String) ThreeDS2ServiceInstance(new Object[]{this, setcursorvisible.encryptionPublicKeyFromAssetCertificate()}, -558504954, 558504956, System.identityHashCode(this));
        this.getWarnings.protocolError(new com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent(this.get, new ErrorMessage(this.get, str, (String) ThreeDS2ServiceInstance(new Object[]{this, setcursorvisible.rootPublicKey()}, 818161613, -818161613, System.identityHashCode(this)), (String) ThreeDS2ServiceInstance(new Object[]{this, setcursorvisible.logoDark()}, 818161613, -818161613, System.identityHashCode(this)), str2, str3, this.ThreeDS2ServiceInitializationCallback.getWarnings())));
        int i = cleanup;
        getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, ~((i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1), 1, 128);
    }

    public void initialize() {
        int i = getSDKVersion;
        int i2 = ((i | 75) << 1) - (i ^ 75);
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        ChallengeStatusReceiver challengeStatusReceiver = this.getWarnings;
        if (i3 == 0) {
            challengeStatusReceiver.cancelled();
            int i4 = 27 / 0;
        } else {
            challengeStatusReceiver.cancelled();
        }
        int i5 = cleanup;
        getSDKVersion = ((i5 & 115) + (i5 | 115)) % 128;
    }

    public void ThreeDS2Service(setAllCaps setallcaps) {
        this.getWarnings.completed(new com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent(this.get, setallcaps.getSchemeEncryptionPublicKeyId().getWarnings()));
        int i = getSDKVersion;
        int i2 = i & 117;
        int i3 = (((i | 117) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        cleanup = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void ThreeDS2ServiceInstance() {
        int i = getSDKVersion;
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 74) << 1, i ^ 74, 1, 128);
        this.getWarnings.timedout();
        int i2 = getSDKVersion;
        cleanup = ((i2 & 77) + (i2 | 77)) % 128;
    }

    public void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = cleanup;
        int i2 = i & 31;
        int i3 = ((i ^ 31) | i2) << 1;
        int i4 = -((i | 31) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getSDKVersion = i5 % 128;
        int i6 = i5 % 2;
        no noVar = this.ThreeDS2ServiceInstance;
        if (i6 != 0) {
            noVar.initialize(runtimeErrorEvent.getErrorMessage());
            this.getWarnings.runtimeError(runtimeErrorEvent);
            int i7 = 15 / 0;
        } else {
            noVar.initialize(runtimeErrorEvent.getErrorMessage());
            this.getWarnings.runtimeError(runtimeErrorEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3 = r2 & 67;
        com.netcetera.threeds.sdk.infrastructure.setJustificationMode.getSDKVersion = (((r2 | 67) & (~r3)) + (r3 << 1)) % 128;
        r7 = r7.getWarnings();
        com.netcetera.threeds.sdk.infrastructure.setJustificationMode.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.setJustificationMode.cleanup + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        r7 = r3 & 37;
        r1 = -(-((r3 ^ 37) | r7));
        com.netcetera.threeds.sdk.infrastructure.setJustificationMode.cleanup = ((r7 & r1) + (r7 | r1)) % 128;
        r7 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object get(Object[] objArr) {
        String warnings;
        notify notifyVar = (notify) objArr[1];
        int i = cleanup;
        int i2 = ((i ^ 83) | (i & 83)) << 1;
        int i3 = -((i & (-84)) | ((~i) & 83));
        int i4 = (i2 & i3) + (i2 | i3);
        int i5 = i4 % 128;
        getSDKVersion = i5;
        if (i4 % 2 != 0) {
            int i6 = 0 / 0;
        }
        int i7 = getSDKVersion;
        int i8 = i7 & 59;
        int i9 = (i7 ^ 59) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        cleanup = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return warnings;
    }

    public static setJustificationMode ThreeDS2ServiceInstance(ChallengeStatusReceiver challengeStatusReceiver, String str, setCacheColorHint.getWarnings getwarnings) {
        return (setJustificationMode) ThreeDS2ServiceInstance(new Object[]{challengeStatusReceiver, str, getwarnings}, 1793143546, -1793143545, (int) System.currentTimeMillis());
    }
}
