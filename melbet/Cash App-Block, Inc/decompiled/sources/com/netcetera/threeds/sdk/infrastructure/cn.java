package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class cn extends bv {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final setShadowLayer get;
    private final fp initialize;

    public interface ThreeDS2ServiceInstance extends computeIfAbsent {
        void ThreeDS2Service(size sizeVar);

        void getWarnings(size sizeVar);
    }

    public cn(Context context, fp fpVar, setShadowLayer setshadowlayer) {
        super(context);
        this.initialize = fpVar;
        this.get = setshadowlayer;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i3 | i2);
        int i6 = (((~(i | (~i2))) | (~(i4 | i2))) * 110) + ((i5 | (~(i | i2))) * EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + ((i4 | i5) * (-220)) + (i2 * 111) + (i * (-109));
        if (i6 == 1) {
            FrameLayout frameLayout = new FrameLayout((Context) objArr[1]);
            int i7 = ThreeDS2ServiceInstance;
            int i8 = i7 & 11;
            int i9 = -(-((i7 ^ 11) | i8));
            getWarnings = ((i8 & i9) + (i9 | i8)) % 128;
            return frameLayout;
        }
        if (i6 == 2) {
            return get(objArr);
        }
        cn cnVar = (cn) objArr[0];
        size sizeVar = (size) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        ThreeDS2ServiceInstance = (getWarnings + 37) % 128;
        ThreeDS2Service(new Object[]{cnVar, sizeVar, str, str2}, -2128472053, 2128472055, System.identityHashCode(cnVar));
        int i10 = getWarnings;
        int i11 = ((i10 ^ 27) | (i10 & 27)) << 1;
        int i12 = -(((~i10) & 27) | (i10 & (-28)));
        ThreeDS2ServiceInstance = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ((cn) objArr[0]).ThreeDS2Service(new ck((size) objArr[1], (String) objArr[2], (String) objArr[3]));
        int i = getWarnings;
        int i2 = (((i ^ 65) | (i & 65)) << 1) - (((~i) & 65) | (i & (-66)));
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public final ViewGroup bl_(Context context) {
        return (ViewGroup) ThreeDS2Service(new Object[]{this, context}, -1116781322, 1116781323, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public void getWarnings(Context context) {
        ax initialize = this.initialize.initialize(context, this.get);
        initialize.ThreeDS2Service(new ThreeDS2ServiceInstance() { // from class: com.netcetera.threeds.sdk.infrastructure.cn.1
            private static int ThreeDS2Service = 1;
            private static int get;

            @Override // com.netcetera.threeds.sdk.infrastructure.cn.ThreeDS2ServiceInstance
            public void ThreeDS2Service(size sizeVar) {
                int i = get + 46;
                ThreeDS2Service = ((i ^ (-1)) + (i << 1)) % 128;
                cn.ThreeDS2Service(new Object[]{cn.this, sizeVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.initialize.initialize()}, 1545207796, -1545207796, (int) System.currentTimeMillis());
                int i2 = ThreeDS2Service;
                int i3 = (i2 & (-70)) | ((~i2) & 69);
                int i4 = (i2 & 69) << 1;
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                get = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 51 / 0;
                }
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
            public void get(size sizeVar) {
                int i = get;
                int i2 = i & 119;
                ThreeDS2Service = (i2 + ((i ^ 119) | i2)) % 128;
                cn.ThreeDS2Service(new Object[]{cn.this, sizeVar, ev.ThreeDS2ServiceInstance.getWarnings.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, 1545207796, -1545207796, (int) System.currentTimeMillis());
                int i3 = ThreeDS2Service;
                int i4 = i3 & 107;
                int i5 = -(-((i3 ^ 107) | i4));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                get = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.cn.ThreeDS2ServiceInstance
            public void getWarnings(size sizeVar) {
                int i = get;
                ThreeDS2Service = Thread$State$EnumUnboxingLocalUtility.m(i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, i | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 1, 128);
                cn.ThreeDS2Service(new Object[]{cn.this, sizeVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, 1545207796, -1545207796, (int) System.currentTimeMillis());
                int i2 = ThreeDS2Service;
                int i3 = i2 ^ 25;
                int i4 = ((i2 & 25) | i3) << 1;
                int i5 = -i3;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                get = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }
        });
        getWarnings(initialize);
        int i = ThreeDS2ServiceInstance;
        getWarnings = (((i & (-92)) | ((~i) & 91)) + ((i & 91) << 1)) % 128;
    }
}
