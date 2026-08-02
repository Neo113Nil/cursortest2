package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class bu extends stringPropertyNames {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;

    public bu(Context context, loadFromXML loadfromxml, loadFromXML loadfromxml2) {
        super(context, loadfromxml, loadfromxml2);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.stringPropertyNames
    public LinearLayout aV_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = es.getWarnings;
        layoutParams.setMargins(0, i, 0, i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        int identityHashCode = System.identityHashCode(this);
        int i2 = (-1203130498) ^ identityHashCode;
        int i3 = (-1203130498) & identityHashCode;
        int i4 = ((~(i2 | i3)) | 1166164097) * 992;
        int i5 = (-479247214) & i4;
        int i6 = (i4 | (-479247214)) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        int i9 = ~((i3 & i2) | (i2 ^ i3));
        int i10 = (i9 & 1166164097) | (1166164097 ^ i9);
        int i11 = ~identityHashCode;
        int i12 = i11 & 1203130497;
        int i13 = ((i11 | 1203130497) & (~i12)) | i12;
        int i14 = i13 ^ (-976568079);
        int i15 = i13 & (-976568079);
        int i16 = ~((i15 & i14) | (i14 ^ i15));
        int i17 = ((~i16) & i10) | ((~i10) & i16);
        int i18 = i10 & i16;
        int i19 = ((i18 & i17) | (i17 ^ i18)) * (-496);
        int i20 = i8 ^ i19;
        int i21 = -(-((i19 & i8) << 1));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = (-976568079) ^ identityHashCode;
        int i24 = identityHashCode & (-976568079);
        int i25 = (i22 - (~(((i24 & i23) | (i23 ^ i24)) * 496))) - 1;
        int identityHashCode2 = System.identityHashCode(this);
        int i26 = ~((~identityHashCode2) | 27777662);
        int i27 = ((~i26) & (-1173720177)) | (i26 & 1173720176);
        int i28 = i26 & (-1173720177);
        int i29 = ((i28 & i27) | (i27 ^ i28)) * (-1042);
        int i30 = ((-61091418) & i29) + (i29 | (-61091418));
        int i31 = 27777662 & identityHashCode2;
        int i32 = (~i31) & (27777662 | identityHashCode2);
        int i33 = ~identityHashCode2;
        int i34 = -(~(-(-(((i31 & i32) | (i32 ^ i31)) * 521))));
        int i35 = ((i30 & i34) + (i34 | i30)) - 1;
        int i36 = 1173720176 & identityHashCode2;
        int i37 = (identityHashCode2 | 1173720176) & (~i36);
        int i38 = ~((i37 & i36) | (i37 ^ i36));
        int i39 = 152078 & i38;
        int i40 = (i38 | 152078) & (~i39);
        int i41 = (i40 & i39) | (i40 ^ i39);
        int i42 = (i33 ^ (-1173720177)) | (i33 & (-1173720177));
        int i43 = ((-27777663) & i42) | ((~i42) & 27777662);
        int i44 = i42 & 27777662;
        int i45 = ~((i44 & i43) | (i43 ^ i44));
        int i46 = i41 ^ i45;
        int i47 = i41 & i45;
        int i48 = ((i47 & i46) | (i46 ^ i47)) * 521;
        int i49 = i35 ^ i48;
        int i50 = -(-((i48 & i35) << 1));
        if (i25 <= ((i49 | i50) << 1) - (i50 ^ i49)) {
            int i51 = 4 / 0;
        }
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.stringPropertyNames
    public LinearLayout aW_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i = getWarnings;
        ThreeDS2ServiceInstance = Thread$State$EnumUnboxingLocalUtility.m(i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (i & EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1, 1, 128);
        return linearLayout;
    }
}
