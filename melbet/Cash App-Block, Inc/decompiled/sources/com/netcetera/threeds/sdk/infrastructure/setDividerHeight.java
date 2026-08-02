package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class setDividerHeight {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int getSDKInfo = 1;
    private final setFooterDividersEnabled ThreeDS2Service;
    private final List<setOverscrollHeader> ThreeDS2ServiceInstance;
    private final setIndeterminateDrawable get;
    private final String getWarnings;
    private final Boolean initialize;

    public setDividerHeight(List<setOverscrollHeader> list, setIndeterminateDrawable setindeterminatedrawable, setFooterDividersEnabled setfooterdividersenabled, String str, Boolean bool) {
        this.ThreeDS2ServiceInstance = list;
        this.get = setindeterminatedrawable;
        this.ThreeDS2Service = setfooterdividersenabled;
        this.getWarnings = str;
        this.initialize = bool;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        setDividerHeight setdividerheight = new setDividerHeight(Collections.EMPTY_LIST, (setIndeterminateDrawable) setIndeterminateDrawable.ThreeDS2ServiceInstance(new Object[0], -381530957, 381530957, (int) System.currentTimeMillis()), (setFooterDividersEnabled) setFooterDividersEnabled.getWarnings(new Object[0], 32598357, -32598357, (int) System.currentTimeMillis()), "", Boolean.TRUE);
        int i4 = getSDKInfo;
        ThreeDS2ServiceInitializationCallback = (((i4 | 111) << 1) - (i4 ^ 111)) % 128;
        return setdividerheight;
    }

    public static setDividerHeight getSDKVersion() {
        return (setDividerHeight) ThreeDS2Service(new Object[0], -1248382382, 1248382382, (int) System.currentTimeMillis());
    }

    public List<setOverscrollHeader> ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 81;
        int i3 = i | 81;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getSDKInfo = i4;
        List<setOverscrollHeader> list = this.ThreeDS2ServiceInstance;
        int i5 = i4 | 117;
        ThreeDS2ServiceInitializationCallback = ((i5 << 1) - (i5 & (~(i4 & 117)))) % 128;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cleanup() {
        boolean z;
        int i;
        int i2 = ThreeDS2ServiceInitializationCallback;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getSDKInfo = i5 % 128;
        int i6 = i5 % 2;
        List<setOverscrollHeader> list = this.ThreeDS2ServiceInstance;
        if (i6 == 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty() && oj.get(this.get.get())) {
            int i7 = ThreeDS2ServiceInitializationCallback;
            getSDKInfo = ((-2) - ((((i7 | 32) << 1) - (i7 ^ 32)) ^ (-1))) % 128;
            if (oj.get(this.getWarnings)) {
                getSDKInfo = (ThreeDS2ServiceInitializationCallback + 27) % 128;
                z = true;
                int i8 = getSDKInfo;
                i = (-2) - (((i8 ^ 50) + ((i8 & 50) << 1)) ^ (-1));
                ThreeDS2ServiceInitializationCallback = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        int i9 = getSDKInfo;
        int i10 = i9 ^ 85;
        int i11 = ((i9 & 85) | i10) << 1;
        int i12 = -i10;
        ThreeDS2ServiceInitializationCallback = ((i11 ^ i12) + ((i11 & i12) << 1)) % 128;
        z = false;
        int i82 = getSDKInfo;
        i = (-2) - (((i82 ^ 50) + ((i82 & 50) << 1)) ^ (-1));
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
        }
    }

    public setFooterDividersEnabled get() {
        int i = getSDKInfo;
        int i2 = ((i ^ 125) | (i & 125)) << 1;
        int i3 = -(((~i) & 125) | (i & (-126)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        ThreeDS2ServiceInitializationCallback = i4;
        setFooterDividersEnabled setfooterdividersenabled = this.ThreeDS2Service;
        int i5 = i4 & 79;
        int i6 = i5 + ((i4 ^ 79) | i5);
        getSDKInfo = i6 % 128;
        if (i6 % 2 != 0) {
            return setfooterdividersenabled;
        }
        throw null;
    }

    public String getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback;
        String str = this.getWarnings;
        getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m$1(i & 81, ~(-(-(i | 81))), 1, 128);
        return str;
    }

    public setIndeterminateDrawable initialize() {
        int i = ThreeDS2ServiceInitializationCallback;
        setIndeterminateDrawable setindeterminatedrawable = this.get;
        int i2 = (i & 94) + (i | 94);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        getSDKInfo = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return setindeterminatedrawable;
    }

    public Boolean ThreeDS2Service() {
        int i = getSDKInfo;
        Boolean bool = this.initialize;
        int i2 = i & 109;
        int i3 = -(-((i ^ 109) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }
}
