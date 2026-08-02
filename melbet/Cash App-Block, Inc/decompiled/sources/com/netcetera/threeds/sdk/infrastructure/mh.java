package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.FragmentManager;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.UUID;

/* loaded from: classes5.dex */
public class mh implements mj<AppCompatActivity> {
    private static int get = 1;
    private static int getWarnings;
    private String ThreeDS2Service;

    /* renamed from: ThreeDS2ServiceInstance, reason: avoid collision after fix types in other method */
    public void ThreeDS2ServiceInstance2(AppCompatActivity appCompatActivity, mu muVar) {
        mp mpVar = new mp();
        mpVar.initialize(muVar);
        mpVar.ThreeDS2Service((mk) mt.ThreeDS2ServiceInstance(new Object[0], 1394921779, -1394921779, (int) System.currentTimeMillis()));
        mpVar.ThreeDS2ServiceInitializationCallback();
        muVar.initialize(mpVar);
        this.ThreeDS2Service = UUID.randomUUID().toString();
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
        backStackRecord.doAddOp(0, mpVar, this.ThreeDS2Service, 1);
        backStackRecord.commitInternal(true, true);
        int i = get + 87;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    public /* synthetic */ boolean getWarnings(AppCompatActivity appCompatActivity) {
        int i = getWarnings;
        get = Thread$State$EnumUnboxingLocalUtility.m(i & 30, i | 30, 1, 128);
        boolean initialize = initialize(appCompatActivity);
        int i2 = get;
        int i3 = i2 ^ 99;
        int i4 = (i2 & 99) << 1;
        getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
        return initialize;
    }

    public boolean initialize(AppCompatActivity appCompatActivity) {
        boolean z;
        int i = getWarnings;
        int i2 = i & 109;
        int i3 = -(-(i | 109));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            appCompatActivity.getSupportFragmentManager().findFragmentByTag((String) oj.getWarnings(this.ThreeDS2Service, ""));
            throw null;
        }
        if (appCompatActivity.getSupportFragmentManager().findFragmentByTag((String) oj.getWarnings(this.ThreeDS2Service, "")) != null) {
            int i5 = getWarnings;
            int i6 = i5 & 21;
            int i7 = ((i5 ^ 21) | i6) << 1;
            int i8 = -((i5 | 21) & (~i6));
            get = ((i7 & i8) + (i8 | i7)) % 128;
            z = true;
        } else {
            int i9 = getWarnings;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i9 ^ 113, ~(-(-((i9 & 113) << 1))), 1, 128);
            z = false;
        }
        int identityHashCode = System.identityHashCode(this);
        int i10 = 623194671 & identityHashCode;
        int i11 = (~i10) & (623194671 | identityHashCode);
        int i12 = ~identityHashCode;
        int i13 = 623194671 ^ i12;
        int i14 = (i10 & i11) | (i11 ^ i10);
        int i15 = -(-(((i14 | (~i14)) & (~i14)) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
        int i16 = (-491725219) & i15;
        int i17 = (i15 | (-491725219)) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        int i20 = 1740501743 & i12;
        int i21 = (1740501743 | i12) & (~i20);
        int i22 = ((i21 & i20) | (i21 ^ i20)) * (-216);
        int i23 = ((~i22) & i19) | ((~i19) & i22);
        int i24 = (i22 & i19) << 1;
        int i25 = (i23 & i24) + (i24 | i23);
        int i26 = i12 & 623194671;
        int i27 = ~((i26 & i13) | (i13 ^ i26));
        int i28 = ((~i27) & (-1186590954)) | (1186590953 & i27);
        int i29 = i27 & (-1186590954);
        int i30 = -(-(((i29 & i28) | (i28 ^ i29)) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
        int i31 = (i25 & i30) + (i30 | i25);
        int identityHashCode2 = System.identityHashCode(this);
        int i32 = ~identityHashCode2;
        int i33 = ~identityHashCode2;
        int i34 = i32 & (i33 | identityHashCode2);
        int i35 = (-810152689) & i34;
        int i36 = (i34 | (-810152689)) & (~i35);
        int i37 = ~((i36 & i35) | (i36 ^ i35));
        int i38 = 4227792 ^ i37;
        int i39 = i37 & 4227792;
        int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
        int i41 = ((~i40) & (-557492433)) | (557492432 & i40);
        int i42 = -(-((i40 & (-557492433)) << 1));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        int i44 = (-4227793) & identityHashCode2;
        int i45 = (((-4227793) | identityHashCode2) & (~i44)) | i44;
        int i46 = ((i45 | (~i45)) & (~i45)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i47 = i43 & i46;
        int i48 = (i47 - (~((i46 ^ i43) | i47))) - 1;
        int i49 = 832532776 ^ i33;
        int i50 = 832532776 & i33;
        int i51 = ~((i50 & i49) | (i49 ^ i50));
        int i52 = (i51 & (-836760569)) | (i51 ^ (-836760569));
        int i53 = (-805924897) ^ identityHashCode2;
        int i54 = identityHashCode2 & (-805924897);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = (i55 | (~i55)) & (~i55);
        int i57 = ((i56 & i52) | ((~i56) & i52) | ((~i52) & i56)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i58 = ((i48 ^ i57) | (i48 & i57)) << 1;
        int i59 = -((i57 & (~i48)) | ((~i57) & i48));
        if (i31 <= (i58 ^ i59) + ((i59 & i58) << 1)) {
            return z;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    public /* synthetic */ void ThreeDS2ServiceInstance(AppCompatActivity appCompatActivity, mu muVar) {
        int i = get;
        int i2 = (-2) - (((i & 30) + (i | 30)) ^ (-1));
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        ThreeDS2ServiceInstance2(appCompatActivity, muVar);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = get + 57;
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
