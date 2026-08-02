package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class iw {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int ThreeDS2ServiceInstance;
    private final iz ThreeDS2Service;
    private final setFontFeatureSettings get;
    private final fu getWarnings;
    private final setAnimationCacheEnabled initialize;

    public iw(setFontFeatureSettings setfontfeaturesettings, setAnimationCacheEnabled setanimationcacheenabled, fu fuVar, iz izVar) {
        this.get = setfontfeaturesettings;
        this.initialize = setanimationcacheenabled;
        this.getWarnings = fuVar;
        this.ThreeDS2Service = izVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        iw iwVar = (iw) objArr[0];
        setMinEms.initialize warnings = new setMinEms.initialize(iwVar.get.get(), iwVar.get.initialize(), (put) ((Enum) finalize.initialize(new Object[]{put.class, iwVar.get.ThreeDS2ServiceInitializationCallback().getWarnings()}, -1922987640, 1922987640, (int) System.currentTimeMillis())), iwVar.get.createTransaction(), iwVar.get.getSDKInfo(), iwVar.get.cleanup(), iwVar.ThreeDS2Service).getWarnings(new setTitleMarginStart());
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 15;
        int i3 = (i2 - (~(-(-((i ^ 15) | i2))))) - 1;
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        iw iwVar = new iw((setFontFeatureSettings) objArr[0], new setAnimationCacheEnabled(), (fu) objArr[1], (iz) objArr[2]);
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i & (-38)) | ((~i) & 37);
        int i3 = -(-((i & 37) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return iwVar;
    }

    public setCursorVisible get(setScrollCaptureCallback setscrollcapturecallback) {
        int i = ThreeDS2ServiceInstance + 111;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        setAnimationCacheEnabled setanimationcacheenabled = this.initialize;
        if (i2 == 0) {
            setanimationcacheenabled.initialize(setscrollcapturecallback.getWarnings());
            throw null;
        }
        clear initialize = setanimationcacheenabled.initialize(setscrollcapturecallback.getWarnings());
        if (initialize == null) {
            int i3 = (-2) - ((ThreeDS2ServiceInstance + 42) ^ (-1));
            ThreeDS2ServiceInitializationCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 92 / 0;
            }
            return null;
        }
        String ThreeDS2Service = initialize.ThreeDS2Service();
        setLogo setlogo = new setLogo(load.initialize, this.get.get(), this.get.createTransaction(), put.ThreeDS2ServiceInstance(this.getWarnings.initialize()), this.get.initialize(), null, initialize, getSuppressed.getWarnings, ThreeDS2Service, (String) oj.ThreeDS2ServiceInitializationCallback(setscrollcapturecallback.getMessage(), ThreeDS2Service), load.getWarnings);
        int i5 = ThreeDS2ServiceInstance;
        ThreeDS2ServiceInitializationCallback = (((i5 & (-86)) | ((~i5) & 85)) + ((i5 & 85) << 1)) % 128;
        return setlogo;
    }

    public setMinEms ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i | 33) << 1;
        int i3 = -(((~i) & 33) | (i & (-34)));
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        setMinEms ThreeDS2Service = ((setMinEms.initialize) get(new Object[]{this}, 820111269, -820111269, System.identityHashCode(this))).ThreeDS2Service();
        int i4 = ThreeDS2ServiceInstance;
        ThreeDS2ServiceInitializationCallback = Thread$State$EnumUnboxingLocalUtility.m(i4 & 46, i4 | 46, 1, 128);
        return ThreeDS2Service;
    }

    public setMinEms get(replace replaceVar) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i & (-112)) | ((~i) & 111);
        int i3 = (i & 111) << 1;
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        setMinEms.initialize initializeVar = (setMinEms.initialize) get(new Object[]{this}, 820111269, -820111269, System.identityHashCode(this));
        replaceVar.ThreeDS2Service(initializeVar);
        setMinEms ThreeDS2Service = initializeVar.ThreeDS2Service();
        int i4 = ThreeDS2ServiceInstance + 23;
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return ThreeDS2Service;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        return ((~(i | i5)) * 69) + ((((~(i2 | i3)) | ((~(i4 | i3)) | (~(i4 | i2)))) * (-69)) + ((((~((i4 | i5) | i3)) | (~((i | i2) | i3))) * 69) + ((i2 * (-68)) + (i * 70)))) != 1 ? ThreeDS2Service(objArr) : getWarnings(objArr);
    }
}
