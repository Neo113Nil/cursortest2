package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import com.netcetera.threeds.sdk.infrastructure.getErrorMessage;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class ProgressView {
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private final isProgressShown ThreeDS2Service;
    private final AtomicReference<setCacheColorHint.get> ThreeDS2ServiceInstance;
    private final getErrorMessage.initialize get;
    private final setOutlineAmbientShadowColor getWarnings;
    private Set<String> initialize = new HashSet();
    private Locale cleanup = Locale.getDefault();

    public ProgressView(isProgressShown isprogressshown, setOutlineAmbientShadowColor setoutlineambientshadowcolor, AtomicReference<setCacheColorHint.get> atomicReference, getErrorMessage.initialize initializeVar) {
        this.ThreeDS2Service = isprogressshown;
        this.getWarnings = setoutlineambientshadowcolor;
        this.get = initializeVar;
        this.ThreeDS2ServiceInstance = atomicReference;
    }

    public static ProgressView ThreeDS2Service(Context context, setOnItemClickListener setonitemclicklistener, setCacheColorHint setcachecolorhint) {
        return (ProgressView) ThreeDS2ServiceInstance(new Object[]{context, setonitemclicklistener, setcachecolorhint}, 223487183, -223487182, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        r1.get.ThreeDS2ServiceInstance(r7.ThreeDS2ServiceInstance(), r4);
        com.netcetera.threeds.sdk.infrastructure.ProgressView.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.ProgressView.getSDKInfo + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (r4.ThreeDS2ServiceInitializationCallback() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        if (r4.ThreeDS2ServiceInitializationCallback() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        r1.get.ThreeDS2Service(r7.ThreeDS2ServiceInstance(), r4);
        r4 = com.netcetera.threeds.sdk.infrastructure.ProgressView.getSDKInfo;
        com.netcetera.threeds.sdk.infrastructure.ProgressView.getSDKVersion = ((r4 & 43) + (r4 | 43)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        hideProgress hideprogress;
        ButtonCustomization buttonCustomization;
        ProgressView progressView = (ProgressView) objArr[0];
        Map map = (Map) objArr[1];
        int i = getSDKVersion;
        getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m(i ^ 96, (i & 96) << 1, -1, 128);
        Iterator it = map.keySet().iterator();
        System.identityHashCode(progressView);
        System.identityHashCode(progressView);
        while (it.hasNext()) {
            int i2 = getSDKInfo;
            int i3 = i2 & 109;
            int i4 = (i2 | 109) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            getSDKVersion = i6 % 128;
            if (i6 % 2 == 0) {
                hideprogress = (hideProgress) it.next();
                buttonCustomization = (ButtonCustomization) ThreeDS2ServiceInstance(new Object[]{progressView, hideprogress, map}, 528691161, -528691159, System.identityHashCode(progressView));
                int i7 = 24 / 0;
            } else {
                hideprogress = (hideProgress) it.next();
                buttonCustomization = (ButtonCustomization) ThreeDS2ServiceInstance(new Object[]{progressView, hideprogress, map}, 528691161, -528691159, System.identityHashCode(progressView));
            }
            int i8 = getSDKInfo;
            int i9 = i8 & 29;
            int i10 = -(-((i8 ^ 29) | i9));
            getSDKVersion = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
        }
        int i11 = getSDKVersion;
        int i12 = i11 & 53;
        int i13 = i11 | 53;
        getSDKInfo = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        ProgressView progressView = new ProgressView((isProgressShown) isProgressShown.get(new Object[]{(Context) objArr[0], (setOnItemClickListener) objArr[1]}, -793846580, 793846583, (int) System.currentTimeMillis()), new setOutlineAmbientShadowColor(), new AtomicReference(((setCacheColorHint) objArr[2]).ThreeDS2ServiceInstance()), (getErrorMessage.initialize) getErrorMessage.get(new Object[0], -966811835, 966811835, (int) System.currentTimeMillis()));
        int i = getSDKInfo;
        int i2 = (i & 9) + (i | 9);
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return progressView;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ButtonCustomization buttonCustomization;
        ProgressView progressView = (ProgressView) objArr[0];
        hideProgress hideprogress = (hideProgress) objArr[1];
        Map map = (Map) objArr[2];
        int i = getSDKVersion;
        int i2 = (i ^ 54) + ((i & 54) << 1);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        getSDKInfo = i3 % 128;
        try {
            try {
                if (i3 % 2 != 0) {
                    progressView.initialize.contains(hideprogress.ThreeDS2ServiceInstance());
                    throw null;
                }
                if (progressView.initialize.contains(hideprogress.ThreeDS2ServiceInstance())) {
                    ButtonCustomization buttonCustomization2 = ButtonCustomization.get();
                    int i4 = getSDKInfo;
                    int i5 = i4 & 67;
                    int i6 = ((i4 ^ 67) | i5) << 1;
                    int i7 = -((i4 | 67) & (~i5));
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    getSDKVersion = i8 % 128;
                    if (i8 % 2 != 0) {
                        return buttonCustomization2;
                    }
                    throw null;
                }
                getCornerRadius.get getVar = (getCornerRadius.get) map.get(hideprogress);
                if (getVar != null) {
                    getSDKInfo = (getSDKVersion + 33) % 128;
                    buttonCustomization = getVar.getWarnings();
                    getSDKInfo = (getSDKVersion + 103) % 128;
                } else {
                    buttonCustomization = (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
                    int i9 = getSDKInfo;
                    getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(i9 & 51, ~(i9 | 51), 1, 128);
                }
                int i10 = getSDKVersion;
                int i11 = i10 & 95;
                int i12 = -(-(i10 | 95));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                getSDKInfo = i13 % 128;
                if (i13 % 2 == 0) {
                    return buttonCustomization;
                }
                throw null;
            } catch (RuntimeException unused) {
                return (ButtonCustomization) ButtonCustomization.ThreeDS2Service(new Object[0], -2002911815, 2002911816, (int) System.currentTimeMillis());
            }
        } catch (SecurityException unused2) {
            return ButtonCustomization.ThreeDS2Service();
        }
    }

    public void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, Locale locale) {
        int i = getSDKVersion;
        int i2 = (((i ^ 105) | (i & 105)) << 1) - (((~i) & 105) | (i & (-106)));
        getSDKInfo = i2 % 128;
        int i3 = i2 % 2;
        setOutlineAmbientShadowColor setoutlineambientshadowcolor = this.getWarnings;
        if (i3 != 0) {
            this.initialize = setoutlineambientshadowcolor.ThreeDS2ServiceInstance(configParameters);
            this.cleanup = locale;
            ThreeDS2ServiceInstance(new Object[]{this, this.ThreeDS2Service.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance.get(), this.cleanup)}, -1842280296, 1842280296, System.identityHashCode(this));
            int i4 = 5 / 0;
            return;
        }
        this.initialize = setoutlineambientshadowcolor.ThreeDS2ServiceInstance(configParameters);
        this.cleanup = locale;
        ThreeDS2ServiceInstance(new Object[]{this, this.ThreeDS2Service.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance.get(), this.cleanup)}, -1842280296, 1842280296, System.identityHashCode(this));
    }

    public void ThreeDS2ServiceInstance(setCacheColorHint.getWarnings getwarnings, setCacheColorHint.get getVar, String str, String str2) {
        int i = getSDKVersion;
        getSDKInfo = (((i | 89) << 1) - (i ^ 89)) % 128;
        if (!this.ThreeDS2ServiceInstance.get().equals(getVar)) {
            int i2 = getSDKInfo;
            int i3 = (i2 & 78) + (i2 | 78);
            getSDKVersion = ((i3 ^ (-1)) + (i3 << 1)) % 128;
            this.ThreeDS2ServiceInstance.set(getVar);
            ThreeDS2ServiceInstance(new Object[]{this, this.ThreeDS2Service.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance.get(), this.cleanup)}, -1842280296, 1842280296, System.identityHashCode(this));
            int i4 = getSDKInfo;
            int i5 = i4 & 73;
            getSDKVersion = (((i4 | 73) & (~i5)) + (i5 << 1)) % 128;
        }
        ThreeDS2ServiceInstance(new Object[]{this, this.ThreeDS2Service.getWarnings(this.ThreeDS2ServiceInstance.get(), getwarnings, str, str2)}, -1842280296, 1842280296, System.identityHashCode(this));
        getSDKInfo = ((-2) - ((getSDKVersion + 74) ^ (-1))) % 128;
    }

    public getErrorMessage ThreeDS2ServiceInstance() {
        int i = getSDKVersion;
        int i2 = i & 17;
        getSDKInfo = (((i | 17) & (~i2)) + (i2 << 1)) % 128;
        getErrorMessage geterrormessage = this.get.get();
        int i3 = getSDKVersion;
        getSDKInfo = ((-2) - (((i3 & 48) + (i3 | 48)) ^ (-1))) % 128;
        return geterrormessage;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        int i7 = (i6 * 446) + (((~(i | i5 | i3)) | (~(i2 | i4))) * 446) + (((~((~i3) | i5)) | i6) * 446) + (i2 * (-445)) + (i * (-445));
        return i7 != 1 ? i7 != 2 ? ThreeDS2ServiceInstance(objArr) : initialize(objArr) : getWarnings(objArr);
    }
}
