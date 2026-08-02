package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
class setSelected implements setForegroundTintBlendMode {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final Map<String, setLayerType> get;

    public setSelected(Map<String, setLayerType> map) {
        this.get = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setForegroundTintBlendMode
    public Set<String> ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 27;
        int i3 = -(-((i & 27) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        Map<String, setLayerType> map = this.get;
        if (i5 != 0) {
            map.keySet();
            throw null;
        }
        Set<String> keySet = map.keySet();
        int i6 = getWarnings;
        ThreeDS2ServiceInstance = (((i6 & (-122)) | ((~i6) & 121)) + ((i6 & 121) << 1)) % 128;
        return keySet;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setForegroundTintBlendMode
    public setLayerType get(String str) {
        int i = getWarnings;
        int i2 = i ^ 43;
        int i3 = (i & 43) << 1;
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (!this.get.containsKey(str)) {
            setLayerType setlayertype = (setLayerType) setLayerType.getWarnings(new Object[0], 1264136772, -1264136771, (int) System.currentTimeMillis());
            int i4 = getWarnings;
            int i5 = i4 & 23;
            ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i5, ~((i4 ^ 23) | i5), 1, 128);
            return setlayertype;
        }
        int i6 = getWarnings;
        ThreeDS2ServiceInstance = ((i6 ^ 55) + ((i6 & 55) << 1)) % 128;
        setLayerType setlayertype2 = this.get.get(str);
        int identityHashCode = System.identityHashCode(this);
        int i7 = (-1669335073) & identityHashCode;
        int i8 = (~i7) & ((-1669335073) | identityHashCode);
        int i9 = (i7 & i8) | (i8 ^ i7);
        int i10 = (i9 | (~i9)) & (~i9);
        int i11 = ~identityHashCode;
        int i12 = (477578767 & i11) | (477578767 ^ i11);
        int i13 = i12 & 2006010410;
        int i14 = (i12 | 2006010410) & (~i13);
        int i15 = ~((i14 & i13) | (i14 ^ i13));
        int i16 = i10 & i15;
        int i17 = (i10 | i15) & (~i16);
        int i18 = -(-(((i17 & i16) | (i17 ^ i16)) * 920));
        int i19 = (-174373206) & i18;
        int i20 = (i19 - (~(-(-((i18 ^ (-174373206)) | i19))))) - 1;
        int i21 = (-2006010411) ^ i11;
        int i22 = (-2006010411) & i11;
        int i23 = ~((i22 & i21) | (i21 ^ i22));
        int i24 = 1669335072 & i23;
        int i25 = (i23 | 1669335072) & (~i24);
        int i26 = ((i25 & i24) | (i25 ^ i24)) * 920;
        int i27 = i20 ^ i26;
        int i28 = (((i26 & i20) | i27) << 1) - i27;
        int i29 = (-1669335073) ^ i11;
        int i30 = (-1669335073) & i11;
        int i31 = ~((i30 & i29) | (i29 ^ i30));
        int i32 = (i11 & (-336675339)) | (336675338 & identityHashCode);
        int i33 = (-336675339) & identityHashCode;
        int i34 = ~((i32 & i33) | (i32 ^ i33));
        int i35 = (i31 & i34) | (i31 ^ i34);
        int i36 = 2146913839 ^ identityHashCode;
        int i37 = identityHashCode & 2146913839;
        int i38 = ~((i37 & i36) | (i36 ^ i37));
        int i39 = i35 & i38;
        int i40 = (i38 | i35) & (~i39);
        int i41 = -(-(((i40 & i39) | (i40 ^ i39)) * 920));
        int i42 = i28 & i41;
        int i43 = i41 | i28;
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int identityHashCode2 = System.identityHashCode(this);
        int i45 = ((~identityHashCode2) & 179628324) | ((-179628325) & identityHashCode2);
        int i46 = 179628324 & identityHashCode2;
        int i47 = ~((i45 & i46) | (i45 ^ i46));
        int i48 = ((i47 & (-1576176455)) | ((-1576176455) ^ i47)) * (-220);
        int i49 = (-1540634162) & i48;
        int i50 = -(-((i48 ^ (-1540634162)) | i49));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        int i52 = ~(((identityHashCode2 | 179628324) & (~i46)) | i46);
        int i53 = ((~i52) & (-1610017639)) | (1610017638 & i52);
        int i54 = i52 & (-1610017639);
        int i55 = -(-(((i54 & i53) | (i53 ^ i54)) * EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
        int i56 = i51 ^ i55;
        int i57 = (((i55 & i51) | i56) << 1) - i56;
        int i58 = (i57 & (-2143402467)) + (i57 | (-2143402467));
        if (i44 <= (i58 ^ (-1)) + (i58 << 1)) {
            return setlayertype2;
        }
        throw null;
    }
}
