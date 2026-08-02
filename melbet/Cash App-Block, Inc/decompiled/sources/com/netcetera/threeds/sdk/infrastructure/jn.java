package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class jn implements ju {
    private static int getWarnings = 1;
    private static int initialize;
    private final ju ThreeDS2Service;
    private final ju ThreeDS2ServiceInstance;
    private final me get;

    public jn(ju juVar, ju juVar2, me meVar) {
        this.ThreeDS2Service = juVar;
        this.ThreeDS2ServiceInstance = juVar2;
        this.get = meVar;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        jn jnVar = (jn) objArr[0];
        int i = initialize;
        int i2 = (((i | 20) << 1) - (i ^ 20)) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            jnVar.get.ThreeDS2Service();
            throw null;
        }
        if (!jnVar.get.ThreeDS2Service()) {
            ju juVar = jnVar.ThreeDS2Service;
            int i3 = getWarnings;
            int i4 = (i3 & (-20)) | ((~i3) & 19);
            int i5 = (i3 & 19) << 1;
            initialize = ((i4 & i5) + (i5 | i4)) % 128;
            return juVar;
        }
        int i6 = getWarnings;
        initialize = ((i6 & 117) + (i6 | 117)) % 128;
        ju juVar2 = jnVar.ThreeDS2ServiceInstance;
        int i7 = i6 & 81;
        int i8 = (i6 | 81) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 28 / 0;
        }
        return juVar2;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jr ThreeDS2Service() {
        jr ThreeDS2Service;
        int i = getWarnings;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            ThreeDS2Service = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).ThreeDS2Service();
            int i3 = 16 / 0;
        } else {
            ThreeDS2Service = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).ThreeDS2Service();
        }
        int i4 = initialize;
        int i5 = i4 & 63;
        int i6 = -(-((i4 ^ 63) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        getWarnings = i7 % 128;
        if (i7 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jq ThreeDS2ServiceInstance() {
        int i = initialize;
        getWarnings = ((i ^ 25) + ((i & 25) << 1)) % 128;
        jq ThreeDS2ServiceInstance = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).ThreeDS2ServiceInstance();
        int i2 = getWarnings;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i2 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1, ~(-(((~i2) & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i2 & (-124)))), 1, 128);
        return ThreeDS2ServiceInstance;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jw get() {
        jw jwVar;
        int i = initialize;
        int i2 = i ^ 25;
        int i3 = -(-((i & 25) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            jwVar = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).get();
            int i5 = 23 / 0;
        } else {
            jwVar = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).get();
        }
        int i6 = getWarnings;
        int i7 = i6 & 9;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i6 | 9) & (~i7), ~(-(-(i7 << 1))), 1, 128);
        return jwVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jo get(UiCustomization.ButtonType buttonType) {
        int i = getWarnings;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 84) << 1, i ^ 84, 1, 128);
        jo joVar = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).get(buttonType);
        getWarnings = (initialize + 29) % 128;
        return joVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jt getWarnings() {
        int i = initialize;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 119) | (i & 119)) << 1, ~(-(((~i) & 119) | (i & (-120)))), 1, 128);
        jt warnings = ((ju) initialize(new Object[]{this}, 466830593, -466830593, System.identityHashCode(this))).getWarnings();
        int i2 = initialize;
        getWarnings = ((i2 ^ 103) + ((i2 & 103) << 1)) % 128;
        return warnings;
    }
}
