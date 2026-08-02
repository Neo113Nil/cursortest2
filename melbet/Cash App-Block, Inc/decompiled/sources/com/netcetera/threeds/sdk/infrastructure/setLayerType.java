package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setLayerType {
    private static int cleanup = 1;
    private static int createTransaction;
    private final setRenderEffect ThreeDS2Service;
    private final setBackgroundResource ThreeDS2ServiceInitializationCallback;
    private final setBackground ThreeDS2ServiceInstance;
    private final setDrawingCacheEnabled get;
    private final setLayerPaint getWarnings;
    private final setRenderEffect initialize;

    private setLayerType(setBackground setbackground, setDrawingCacheEnabled setdrawingcacheenabled, setRenderEffect setrendereffect, setRenderEffect setrendereffect2, setLayerPaint setlayerpaint, setBackgroundResource setbackgroundresource) {
        this.ThreeDS2ServiceInstance = setbackground;
        this.get = setdrawingcacheenabled;
        this.ThreeDS2Service = setrendereffect;
        this.initialize = setrendereffect2;
        this.getWarnings = setlayerpaint;
        this.ThreeDS2ServiceInitializationCallback = setbackgroundresource;
    }

    public static setLayerType ThreeDS2ServiceInstance() {
        return (setLayerType) getWarnings(new Object[0], 1264136772, -1264136771, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + (i2 * (-751)) + (i * (-751));
        int i7 = i2 | i4;
        if ((((~(i | i5)) | (~i7)) * 752) + ((~(i3 | i7)) * (-1504)) + i6 != 1) {
            return getWarnings(objArr);
        }
        setLayerType setlayertype = new setLayerType((setBackground) setBackground.initialize(new Object[0], -2004014802, 2004014802, (int) System.currentTimeMillis()), (setDrawingCacheEnabled) setDrawingCacheEnabled.get(new Object[0], 1448993882, -1448993881, (int) System.currentTimeMillis()), (setRenderEffect) setRenderEffect.initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis()), (setRenderEffect) setRenderEffect.initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis()), (setLayerPaint) setLayerPaint.initialize(new Object[0], 472579362, -472579362, (int) System.currentTimeMillis()), (setBackgroundResource) setBackgroundResource.ThreeDS2ServiceInstance(new Object[0], 1335949815, -1335949812, (int) System.currentTimeMillis()));
        cleanup = (createTransaction + 89) % 128;
        return setlayertype;
    }

    public setDrawingCacheEnabled ThreeDS2Service() {
        int i = cleanup;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        createTransaction = i2 % 128;
        int i3 = i2 % 2;
        setDrawingCacheEnabled setdrawingcacheenabled = this.get;
        if (i3 == 0) {
            return setdrawingcacheenabled;
        }
        throw null;
    }

    public setRenderEffect get() {
        int i = createTransaction;
        setRenderEffect setrendereffect = this.initialize;
        int i2 = (((i & (-22)) | ((~i) & 21)) - (~((i & 21) << 1))) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return setrendereffect;
        }
        throw null;
    }

    public setBackgroundResource getSDKInfo() {
        int i = createTransaction;
        setBackgroundResource setbackgroundresource = this.ThreeDS2ServiceInitializationCallback;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return setbackgroundresource;
    }

    public setLayerPaint getSDKVersion() {
        int i = (createTransaction + 1) % 128;
        cleanup = i;
        setLayerPaint setlayerpaint = this.getWarnings;
        int i2 = (((i & (-96)) | ((~i) & 95)) - (~((i & 95) << 1))) - 1;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return setlayerpaint;
    }

    public setBackground initialize() {
        int i = (cleanup + 85) % 128;
        createTransaction = i;
        setBackground setbackground = this.ThreeDS2ServiceInstance;
        int i2 = (-2) - ((((i | 2) << 1) - (i ^ 2)) ^ (-1));
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return setbackground;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setLayerType setlayertype = new setLayerType((setBackground) objArr[0], (setDrawingCacheEnabled) objArr[1], (setRenderEffect) objArr[2], (setRenderEffect) objArr[3], (setLayerPaint) objArr[4], (setBackgroundResource) objArr[5]);
        int i = cleanup;
        int i2 = i & 37;
        int i3 = (i ^ 37) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            return setlayertype;
        }
        throw null;
    }

    public setRenderEffect getWarnings() {
        int i = createTransaction;
        int i2 = i ^ 87;
        int i3 = (i & 87) << 1;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        setRenderEffect setrendereffect = this.ThreeDS2Service;
        if (i5 == 0) {
            int i6 = 87 / 0;
        }
        cleanup = ((i ^ 111) + ((i & 111) << 1)) % 128;
        return setrendereffect;
    }

    public static setLayerType getWarnings(setBackground setbackground, setDrawingCacheEnabled setdrawingcacheenabled, setRenderEffect setrendereffect, setRenderEffect setrendereffect2, setLayerPaint setlayerpaint, setBackgroundResource setbackgroundresource) {
        return (setLayerType) getWarnings(new Object[]{setbackground, setdrawingcacheenabled, setrendereffect, setrendereffect2, setlayerpaint, setbackgroundresource}, -1347106739, 1347106739, (int) System.currentTimeMillis());
    }
}
