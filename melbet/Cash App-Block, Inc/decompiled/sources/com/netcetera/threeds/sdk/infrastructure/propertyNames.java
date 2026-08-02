package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class propertyNames extends bi<LinearLayout> {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    LinearLayout ThreeDS2Service;
    LinearLayout ThreeDS2ServiceInstance;
    private final contains[] get;

    public propertyNames(Context context, contains[] containsVarArr) {
        super(context);
        this.get = containsVarArr;
    }

    public static propertyNames ThreeDS2Service(Context context, contains... containsVarArr) {
        return (propertyNames) get(new Object[]{context, containsVarArr}, -435122388, 435122389, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        LinearLayout linearLayout = new LinearLayout((Context) objArr[1]);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = es.getSDKVersion;
        layoutParams.setMargins(i, es.ThreeDS2Service, i, es.initialize);
        linearLayout.setLayoutParams(layoutParams);
        int i2 = getSDKVersion;
        int i3 = i2 & 117;
        int i4 = (((i2 ^ 117) | i3) << 1) - ((i2 | 117) & (~i3));
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return linearLayout;
    }

    public LinearLayout ab_(Context context) {
        int length;
        int i;
        contains[] containsVarArr;
        int i2 = getWarnings;
        int i3 = (i2 & 97) + (i2 | 97);
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            LinearLayout linearLayout = (LinearLayout) get(new Object[]{this, context}, -276927951, 276927951, System.identityHashCode(this));
            this.ThreeDS2Service = linearLayout;
            linearLayout.setOrientation(0);
            containsVarArr = this.get;
            length = containsVarArr.length;
            i = 1;
        } else {
            LinearLayout linearLayout2 = (LinearLayout) get(new Object[]{this, context}, -276927951, 276927951, System.identityHashCode(this));
            this.ThreeDS2Service = linearLayout2;
            linearLayout2.setOrientation(1);
            contains[] containsVarArr2 = this.get;
            length = containsVarArr2.length;
            i = 0;
            containsVarArr = containsVarArr2;
        }
        int i4 = getSDKVersion;
        getWarnings = ((i4 & 117) + (i4 | 117)) % 128;
        while (i < length) {
            contains containsVar = containsVarArr[i];
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.addView(containsVar.ThreeDS2Service());
            this.ThreeDS2Service.addView(linearLayout3);
            int i5 = i & (-25);
            int i6 = -(-((i ^ (-25)) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            i = ((i7 ^ 26) - (~((i7 & 26) << 1))) - 1;
            int i8 = getWarnings;
            int i9 = i8 & 25;
            getSDKVersion = (i9 + ((i8 ^ 25) | i9)) % 128;
        }
        LinearLayout linearLayout4 = this.ThreeDS2Service;
        int i10 = getSDKVersion;
        int i11 = i10 & 99;
        getWarnings = (((i10 | 99) & (~i11)) + (i11 << 1)) % 128;
        return linearLayout4;
    }

    public LinearLayout ac_(Context context) {
        int i;
        int i2;
        LinearLayout linearLayout = (LinearLayout) get(new Object[]{this, context}, -276927951, 276927951, System.identityHashCode(this));
        this.ThreeDS2Service = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        contains[] containsVarArr = this.get;
        int length = containsVarArr.length;
        int i3 = getSDKVersion;
        int i4 = i3 ^ 33;
        int i5 = (i3 & 33) << 1;
        getWarnings = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = getSDKVersion;
            int i9 = (i8 & (-102)) | ((~i8) & 101);
            int i10 = -(-((i8 & 101) << 1));
            getWarnings = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
            contains containsVar = containsVarArr[i6];
            if (i7 == 0) {
                int i11 = (i8 & (-112)) | ((~i8) & 111);
                int i12 = -(-((i8 & 111) << 1));
                getWarnings = ((i11 & i12) + (i12 | i11)) % 128;
                i = 0;
            } else {
                i = es.ThreeDS2Service;
                int i13 = getWarnings;
                getSDKVersion = Thread$State$EnumUnboxingLocalUtility.m(i13 ^ 26, (i13 & 26) << 1, 1, 128);
            }
            int length2 = this.get.length;
            if (i7 == length2 + ((length2 ^ (-1)) | length2)) {
                int i14 = getSDKVersion;
                int i15 = ((i14 | 113) << 1) - (i14 ^ 113);
                getWarnings = i15 % 128;
                i2 = i15 % 2 != 0 ? 1 : 0;
                getWarnings = (i14 + 99) % 128;
            } else {
                i2 = es.ThreeDS2Service;
                int i16 = getWarnings;
                int i17 = i16 & 97;
                int i18 = i16 | 97;
                getSDKVersion = ((i17 & i18) + (i18 | i17)) % 128;
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setPadding(i, 0, i2, 0);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.addView(containsVar.ThreeDS2Service());
            this.ThreeDS2Service.addView(linearLayout2);
            int i19 = i7 ^ 60;
            int i20 = -(-((i7 & 60) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 & (-59);
            i7 = i22 + ((i21 ^ (-59)) | i22);
            i6 = (((i6 | 2) << 1) - (i6 ^ 2)) - 1;
            int i23 = getSDKVersion;
            getWarnings = Thread$State$EnumUnboxingLocalUtility.m(i23 & 116, i23 | 116, 1, 128);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.ThreeDS2ServiceInstance = linearLayout3;
        linearLayout3.setLayoutParams(layoutParams);
        this.ThreeDS2ServiceInstance.setVisibility(8);
        this.ThreeDS2Service.addView(this.ThreeDS2ServiceInstance);
        LinearLayout linearLayout4 = this.ThreeDS2Service;
        int i24 = getWarnings;
        int i25 = (i24 & (-90)) | ((~i24) & 89);
        int i26 = -(-((i24 & 89) << 1));
        getSDKVersion = (((i25 | i26) << 1) - (i26 ^ i25)) % 128;
        return linearLayout4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public void get(setScroller setscroller) {
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = getWarnings;
        int i6 = i5 & 51;
        int i7 = (((i5 | 51) & (~i6)) - (~(i6 << 1))) - 1;
        getSDKVersion = i7 % 128;
        int i8 = i7 % 2;
        contains[] containsVarArr = this.get;
        if (i8 == 0) {
            length = containsVarArr.length;
            i = 1;
        } else {
            length = containsVarArr.length;
            i = 0;
        }
        while (i < length) {
            int i9 = getWarnings;
            int i10 = ((i9 & 118) + (i9 | 118)) - 1;
            getSDKVersion = i10 % 128;
            if (i10 % 2 == 0) {
                containsVarArr[i].ThreeDS2Service(setscroller);
                int i11 = i & 86;
                i2 = ((i ^ 86) | i11) << 1;
                i3 = ~i11;
                i4 = i | 86;
            } else {
                containsVarArr[i].ThreeDS2Service(setscroller);
                int i12 = i & 1;
                i2 = ((i ^ 1) | i12) << 1;
                i3 = ~i12;
                i4 = i | 1;
            }
            i = i2 - (i4 & i3);
            int i13 = getWarnings;
            int i14 = i13 & 121;
            getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i13 ^ 121) | i14) << 1, ~(-((i13 | 121) & (~i14))), 1, 128);
        }
        getWarnings = (getSDKVersion + 101) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public void getWarnings(setScroller setscroller) {
        int i = getWarnings;
        int i2 = (i & 104) + (i | 104);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        getSDKVersion = i3;
        contains[] containsVarArr = this.get;
        int length = containsVarArr.length;
        int i4 = (i3 & 52) + (i3 | 52);
        getWarnings = ((i4 ^ (-1)) + (i4 << 1)) % 128;
        int i5 = 0;
        while (i5 < length) {
            int i6 = getWarnings;
            int i7 = ((i6 ^ 121) | (i6 & 121)) << 1;
            int i8 = -(((~i6) & 121) | (i6 & (-122)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            getSDKVersion = i9 % 128;
            if (i9 % 2 == 0) {
                containsVarArr[i5].ThreeDS2Service(setscroller);
                i5 = (i5 ^ 50) + ((i5 & 50) << 1);
            } else {
                containsVarArr[i5].ThreeDS2Service(setscroller);
                int i10 = i5 & 1;
                int i11 = -(-(i5 | 1));
                i5 = (i10 & i11) + (i11 | i10);
            }
            int i12 = getSDKVersion;
            getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i12 & 59, ~(-(-(i12 | 59))), 1, 128);
        }
        int length2 = this.get.length;
        int i13 = getSDKVersion;
        getWarnings = (((i13 & (-18)) | ((~i13) & 17)) + ((i13 & 17) << 1)) % 128;
        int i14 = 0;
        while (i14 < this.get.length) {
            getWarnings = (getSDKVersion + 9) % 128;
            if (this.ThreeDS2Service.getChildAt(i14).getVisibility() == 8) {
                int i15 = getWarnings;
                int i16 = ((i15 ^ 50) + ((i15 & 50) << 1)) - 1;
                getSDKVersion = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = ((length2 | (-75)) << 1) - (length2 ^ (-75));
                    length2 = (i17 & 97) + (i17 | 97);
                } else {
                    int i18 = (length2 | (-73)) << 1;
                    int i19 = -(length2 ^ (-73));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    length2 = (-2) - (((i20 & 73) + (i20 | 73)) ^ (-1));
                }
            }
            int i21 = i14 & (-63);
            int i22 = (i14 ^ (-63)) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            int i24 = i23 & 64;
            int i25 = -(-(i23 | 64));
            i14 = (i24 | i25) + (i24 & i25);
            int i26 = getSDKVersion;
            getWarnings = ((-2) - (((i26 & 28) + (i26 | 28)) ^ (-1))) % 128;
        }
        if (length2 == 1) {
            int i27 = getWarnings;
            int i28 = i27 & 23;
            int i29 = i27 | 23;
            getSDKVersion = ((i28 ^ i29) + ((i29 & i28) << 1)) % 128;
            this.ThreeDS2ServiceInstance.setVisibility(0);
            int i30 = getSDKVersion;
            int i31 = i30 ^ 27;
            getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i30 & 27) | i31) << 1, ~(-i31), 1, 128);
        }
        int i32 = getSDKVersion + 97;
        getWarnings = i32 % 128;
        if (i32 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public /* synthetic */ LinearLayout initialize(Context context) {
        int i = getWarnings;
        getSDKVersion = (((i | 1) << 1) - (i ^ 1)) % 128;
        LinearLayout ac_ = ac_(context);
        getWarnings = (getSDKVersion + 69) % 128;
        return ac_;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        if ((((~(i | i3)) | (~(i4 | i3)) | (~i5)) * 623) + (((~(i2 | (~i))) | (~i3)) * (-623)) + ((~(i5 | i3)) * 623) + (i2 * (-622)) + (i * 624) != 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        propertyNames propertynames = new propertyNames((Context) objArr[0], (contains[]) objArr[1]);
        int i6 = getWarnings;
        int i7 = i6 & 97;
        getSDKVersion = (i7 + ((i6 ^ 97) | i7)) % 128;
        return propertynames;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public /* synthetic */ LinearLayout getWarnings(Context context) {
        int i = getSDKVersion;
        int i2 = i & 117;
        int i3 = -(-((i ^ 117) | i2));
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        LinearLayout ab_ = ab_(context);
        int i4 = getWarnings;
        int i5 = i4 & 73;
        int i6 = ((i4 ^ 73) | i5) << 1;
        int i7 = -((i4 | 73) & (~i5));
        getSDKVersion = ((i6 & i7) + (i7 | i6)) % 128;
        return ab_;
    }
}
