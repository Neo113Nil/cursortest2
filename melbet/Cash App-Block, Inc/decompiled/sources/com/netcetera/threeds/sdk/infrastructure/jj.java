package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class jj {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int ThreeDS2ServiceInstance;
    private final me ThreeDS2Service;
    private final setRenderEffect get;
    private final setTextDirection getWarnings;
    private final setRenderEffect initialize;

    public interface initialize {
        void bB_(Drawable drawable);
    }

    public jj(setTextDirection settextdirection, setRenderEffect setrendereffect, setRenderEffect setrendereffect2, me meVar) {
        this.ThreeDS2Service = meVar;
        this.getWarnings = settextdirection;
        this.initialize = setrendereffect;
        this.get = setrendereffect2;
    }

    public static jj initialize(setLayerType setlayertype, setTextDirection settextdirection, me meVar) {
        return (jj) ThreeDS2ServiceInstance(new Object[]{setlayertype, settextdirection, meVar}, -1884160052, 1884160052, (int) System.currentTimeMillis());
    }

    public void ThreeDS2ServiceInstance(initialize initializeVar) {
        int i = ThreeDS2ServiceInstance + 65;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        me meVar = this.ThreeDS2Service;
        if (i2 == 0) {
            meVar.ThreeDS2Service();
            throw null;
        }
        if (meVar.ThreeDS2Service()) {
            int i3 = ThreeDS2ServiceInitializationCallback + 10;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            ThreeDS2ServiceInstance = i4 % 128;
            int i5 = i4 % 2;
            setRenderEffect setrendereffect = this.get;
            if (i5 != 0) {
                setrendereffect.ThreeDS2Service();
                throw null;
            }
            if (setrendereffect.ThreeDS2Service()) {
                this.getWarnings.ThreeDS2Service(this.get, initializeVar);
                int i6 = ThreeDS2ServiceInstance;
                ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1((i6 | 106) << 1, i6 ^ 106, 1, 128);
                int i7 = ThreeDS2ServiceInitializationCallback;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i7 | 92) << 1, i7 ^ 92, 1, 128);
            }
        }
        this.getWarnings.ThreeDS2Service(this.initialize, initializeVar);
        int i8 = ThreeDS2ServiceInstance;
        ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1(i8 & 17, ~(i8 | 17), 1, 128);
        int i72 = ThreeDS2ServiceInitializationCallback;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i72 | 92) << 1, i72 ^ 92, 1, 128);
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setLayerType setlayertype = (setLayerType) objArr[0];
        jj jjVar = new jj((setTextDirection) objArr[1], setlayertype.getWarnings(), setlayertype.get(), (me) objArr[2]);
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & (-104)) | ((~i) & 103);
        int i3 = -(-((i & 103) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return jjVar;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }
}
