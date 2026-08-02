package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class dk extends dd {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int getSDKVersion = 1;
    private boolean cleanup;
    private final setShadowLayer get;
    private final setMaxLines initialize;

    public dk(Context context, ju juVar, setShadowLayer setshadowlayer, setMaxLines setmaxlines, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.cleanup = false;
        this.get = setshadowlayer;
        this.initialize = setmaxlines;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        dk dkVar = (dk) objArr[0];
        dkVar.ThreeDS2Service(new dg(setCacheColorHint.getWarnings.ThreeDS2ServiceInstance, (String) objArr[1], (String) objArr[2], dkVar.cleanup));
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (((i | 48) << 1) - (i ^ 48)) - 1;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (r0.cleanup != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * EnumC0170g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE) + (i * (-523));
        int i5 = ~((~i) | i2);
        int i6 = ~i2;
        int i7 = ~(i | i6);
        int i8 = ((i7 | (~(i6 | (~i3))) | i5) * EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i7 * (-786)) + ((i5 | i7 | (~(i6 | i3))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + i4;
        if (i8 == 1) {
            return get(objArr);
        }
        if (i8 == 2) {
            dk dkVar = new dk((Context) objArr[0], (ju) objArr[1], (setShadowLayer) objArr[5], (setMaxLines) objArr[2], (fq) objArr[3], (fw) objArr[4], (fv) objArr[6]);
            int i9 = ThreeDS2ServiceInitializationCallback;
            int i10 = i9 | 99;
            getSDKVersion = ((i10 << 1) - ((~(i9 & 99)) & i10)) % 128;
            return dkVar;
        }
        if (i8 != 3) {
            if (i8 != 4) {
                return i8 != 5 ? getWarnings(objArr) : ThreeDS2Service(objArr);
            }
            dk dkVar2 = (dk) objArr[0];
            int i11 = getSDKVersion;
            ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i11 ^ 31) | (i11 & 31)) << 1, ~(-(((~i11) & 31) | (i11 & (-32)))), 1, 128);
            getWarnings(new Object[]{dkVar2, ev.ThreeDS2ServiceInstance.getWarnings.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, 1382265130, -1382265129, System.identityHashCode(dkVar2));
            int i12 = ThreeDS2ServiceInitializationCallback;
            getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1((i12 | 111) << 1, ~(-(i12 ^ 111)), 1, 128);
            return null;
        }
        dk dkVar3 = (dk) objArr[0];
        keys keysVar = (keys) objArr[1];
        int i13 = getSDKVersion;
        int i14 = i13 & 89;
        int i15 = -(-((i13 ^ 89) | i14));
        ThreeDS2ServiceInitializationCallback = ((i14 & i15) + (i15 | i14)) % 128;
        if (!dkVar3.initialize.v_(keysVar.S_())) {
            getSDKVersion = (ThreeDS2ServiceInitializationCallback + 79) % 128;
        }
        getWarnings(new Object[]{dkVar3, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, 1382265130, -1382265129, System.identityHashCode(dkVar3));
        int i16 = getSDKVersion;
        int i17 = i16 ^ 33;
        int i18 = ((i16 & 33) | i17) << 1;
        int i19 = -i17;
        ThreeDS2ServiceInitializationCallback = ((i18 ^ i19) + ((i18 & i19) << 1)) % 128;
        int i20 = getSDKVersion;
        int i21 = i20 & 125;
        int i22 = -(-((i20 ^ 125) | i21));
        ThreeDS2ServiceInitializationCallback = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
        return null;
    }

    public static remove initialize(Context context, ju juVar, setMaxLines setmaxlines, fq fqVar, fw fwVar, setShadowLayer setshadowlayer, fv fvVar) {
        return (remove) getWarnings(new Object[]{context, juVar, setmaxlines, fqVar, fwVar, setshadowlayer, fvVar}, -461114212, 461114214, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        br brVar = new br(context, initialize().ThreeDS2Service());
        contains warnings = contains.getWarnings(context, initialize());
        warnings.getWarnings(new dm(this));
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, initialize()}, -1745958251, 1745958252, (int) System.currentTimeMillis());
        containsVar.getWarnings(new dj(this, context));
        writeReplace beVar = new be(new dn(this), context);
        writeReplace writereplace = (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, warnings}}, -435122388, 435122389, (int) System.currentTimeMillis());
        getWarnings((computeIfPresent) brVar);
        getWarnings(writereplace);
        getWarnings((writeReplace) brVar);
        getWarnings(beVar);
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 13) % 128;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        dk dkVar = (dk) objArr[0];
        Context context = (Context) objArr[1];
        dkVar.get.getWarnings(context, new dp(dkVar));
        int i = getSDKVersion + 35;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 32 / 0;
        }
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv, com.netcetera.threeds.sdk.infrastructure.remove
    public void ThreeDS2Service(compute computeVar, setScroller setscroller) {
        int i = getSDKVersion;
        int i2 = i & 95;
        int i3 = i2 + ((i ^ 95) | i2);
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 == 0) {
            super.ThreeDS2Service(computeVar, setscroller);
            this.cleanup = ((Boolean) setContentInsetsRelative.get(new Object[]{setscroller}, -1604622809, 1604622812, (int) System.currentTimeMillis())).booleanValue();
        } else {
            super.ThreeDS2Service(computeVar, setscroller);
            this.cleanup = ((Boolean) setContentInsetsRelative.get(new Object[]{setscroller}, -1604622809, 1604622812, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        dk dkVar = (dk) objArr[0];
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i & (-38)) | ((~i) & 37);
        int i3 = (i & 37) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSDKVersion = i4 % 128;
        if (i4 % 2 != 0) {
            getWarnings(new Object[]{dkVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.initialize.initialize()}, 1382265130, -1382265129, System.identityHashCode(dkVar));
            return null;
        }
        getWarnings(new Object[]{dkVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.initialize.initialize()}, 1382265130, -1382265129, System.identityHashCode(dkVar));
        throw null;
    }
}
