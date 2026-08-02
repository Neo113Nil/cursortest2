package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class kl implements ju {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int createTransaction;
    private final Map<String, jo> ThreeDS2Service;
    private final jq ThreeDS2ServiceInstance;
    private final jt cleanup;
    private final jr get;
    private final jw getWarnings;
    private final jo initialize;

    public kl(Map<String, jo> map, jw jwVar, jq jqVar, jr jrVar, jo joVar, jt jtVar) {
        this.ThreeDS2Service = map;
        this.getWarnings = jwVar;
        this.ThreeDS2ServiceInstance = jqVar;
        this.get = jrVar;
        this.initialize = joVar;
        this.cleanup = jtVar;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        HashMap hashMap = new HashMap();
        ki kiVar = new ki();
        kc kcVar = new kc();
        kf kfVar = new kf();
        jo onError = kd.onError();
        jo sDKInfo = kd.getSDKInfo();
        jo createTransaction2 = kd.createTransaction();
        jo sDKVersion = kd.getSDKVersion();
        jo ThreeDS2ServiceInitializationCallback2 = kd.ThreeDS2ServiceInitializationCallback();
        jo joVar = (jo) kd.get(new Object[0], 1626606383, -1626606383, (int) System.currentTimeMillis());
        jo onCompleted = kd.onCompleted();
        jo paramValue = kd.getParamValue();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), createTransaction2);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), ThreeDS2ServiceInitializationCallback2);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), joVar);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), onCompleted);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), paramValue);
        kl klVar = new kl(hashMap, kiVar, kcVar, kfVar, onError, new kk());
        int i = createTransaction;
        int i2 = i & 81;
        int i3 = (i | 81) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2ServiceInitializationCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return klVar;
        }
        throw null;
    }

    public static ju initialize() {
        return (ju) ThreeDS2Service(new Object[0], 1005207549, -1005207549, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jr ThreeDS2Service() {
        int i = createTransaction;
        int i2 = ((i ^ 35) | (i & 35)) << 1;
        int i3 = -(((~i) & 35) | (i & (-36)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        int i5 = i4 % 2;
        jr jrVar = this.get;
        if (i5 != 0) {
            return jrVar;
        }
        throw null;
    }

    public jo ThreeDS2ServiceInstance(String str) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i & (-42)) | ((~i) & 41);
        int i3 = (i & 41) << 1;
        createTransaction = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        jo joVar = (jo) og.ThreeDS2Service(this.ThreeDS2Service.get(str), this.initialize);
        int i4 = ThreeDS2ServiceInitializationCallback;
        createTransaction = Thread$State$EnumUnboxingLocalUtility.m(i4 ^ 114, (i4 & 114) << 1, 1, 128);
        return joVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jo get(UiCustomization.ButtonType buttonType) {
        int i = createTransaction;
        int i2 = (i & 5) + (i | 5);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (buttonType != null) {
            int i3 = ((i ^ 75) | (i & 75)) << 1;
            int i4 = -(((~i) & 75) | (i & (-76)));
            ThreeDS2ServiceInitializationCallback = ((i3 & i4) + (i4 | i3)) % 128;
            str = buttonType.name();
            int i5 = ThreeDS2ServiceInitializationCallback;
            int i6 = i5 ^ 5;
            createTransaction = ((((i5 & 5) | i6) << 1) - i6) % 128;
        } else {
            ThreeDS2ServiceInitializationCallback = (((i & (-48)) | ((~i) & 47)) + ((i & 47) << 1)) % 128;
        }
        jo ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str);
        int i7 = createTransaction + 50;
        ThreeDS2ServiceInitializationCallback = ((i7 ^ (-1)) + (i7 << 1)) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jq ThreeDS2ServiceInstance() {
        int i = createTransaction;
        jq jqVar = this.ThreeDS2ServiceInstance;
        int i2 = i & 87;
        ThreeDS2ServiceInitializationCallback = (i2 + ((i ^ 87) | i2)) % 128;
        return jqVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jw get() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        createTransaction = i4;
        jw jwVar = this.getWarnings;
        int i5 = (i4 ^ 82) + ((i4 & 82) << 1);
        ThreeDS2ServiceInitializationCallback = ((i5 ^ (-1)) + (i5 << 1)) % 128;
        return jwVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jt getWarnings() {
        int i = createTransaction;
        jt jtVar = this.cleanup;
        int i2 = i & 53;
        int i3 = (i ^ 53) | i2;
        ThreeDS2ServiceInitializationCallback = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return jtVar;
    }
}
