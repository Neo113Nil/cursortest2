package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitle;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.List;

/* loaded from: classes5.dex */
public class jg implements jb, je {
    private static int ThreeDS2Service = 1;
    private static int get;
    private jf getWarnings;
    private jd initialize;

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        jg jgVar = (jg) objArr[0];
        jf jfVar = (jf) objArr[1];
        int i = ThreeDS2Service;
        int i2 = i ^ 93;
        int i3 = (i & 93) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        get = i5;
        if (i4 % 2 != 0) {
            jgVar.getWarnings = jfVar;
            throw null;
        }
        jgVar.getWarnings = jfVar;
        int i6 = i5 & 19;
        int i7 = (((i5 ^ 19) | i6) << 1) - ((~i6) & (i5 | 19));
        ThreeDS2Service = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        jg jgVar = (jg) objArr[0];
        jd jdVar = (jd) objArr[1];
        int i = get;
        ThreeDS2Service = (i + 103) % 128;
        jgVar.initialize = jdVar;
        int i2 = i + 85;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        jg jgVar = new jg();
        getWarnings(new Object[]{jgVar, new jf()}, -507320562, 507320563, System.identityHashCode(jgVar));
        getWarnings(new Object[]{jgVar, new jd(jgVar)}, -1395776489, 1395776489, System.identityHashCode(jgVar));
        int i = get;
        int i2 = i ^ 75;
        int i3 = ((i & 75) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            return jgVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.je
    public void ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i & 5;
        int i3 = (~i2) & (i | 5);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            this.getWarnings = null;
            this.initialize = null;
            throw null;
        }
        this.getWarnings = null;
        this.initialize = null;
        int i6 = i & 81;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 81) & (~i6), ~(-(-(i6 << 1))), 1, 128);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.iz
    public void initialize(setMarqueeRepeatLimit setmarqueerepeatlimit) {
        int i = get;
        int i2 = i & 43;
        int i3 = (i | 43) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        jf jfVar = this.getWarnings;
        if (i6 == 0) {
            jfVar.initialize(setmarqueerepeatlimit);
            throw null;
        }
        jfVar.initialize(setmarqueerepeatlimit);
        int i7 = get + 86;
        ThreeDS2Service = ((i7 ^ (-1)) + (i7 << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jh
    public void get(setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance, put putVar, List<setMarqueeRepeatLimit> list) {
        System.identityHashCode(this);
        System.identityHashCode(this);
        this.initialize.get(threeDS2ServiceInstance, putVar, list);
        int i = get;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }

    public static je get() {
        return (je) getWarnings(new Object[0], 273640014, -273640012, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.je
    public void ThreeDS2Service(setTitleMarginStart.get getVar) {
        int i = get;
        int i2 = i & 85;
        int i3 = (i ^ 85) | i2;
        ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        this.getWarnings.ThreeDS2Service(getVar);
        this.initialize.initialize(getVar);
        get = (ThreeDS2Service + 95) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.iz
    public setMarqueeRepeatLimit ThreeDS2Service(put putVar) {
        int i = get;
        int i2 = ((i ^ 19) | (i & 19)) << 1;
        int i3 = -(((~i) & 19) | (i & (-20)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        jf jfVar = this.getWarnings;
        if (i5 == 0) {
            jfVar.ThreeDS2Service(putVar);
            throw null;
        }
        setMarqueeRepeatLimit ThreeDS2Service2 = jfVar.ThreeDS2Service(putVar);
        System.identityHashCode(this);
        System.identityHashCode(this);
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jh
    public List<setMarqueeRepeatLimit> ThreeDS2Service(ns nsVar) {
        int i = get;
        ThreeDS2Service = ((((i | 8) << 1) - (i ^ 8)) - 1) % 128;
        List<setMarqueeRepeatLimit> ThreeDS2Service2 = this.initialize.ThreeDS2Service(nsVar);
        int i2 = get;
        ThreeDS2Service = ((i2 ^ 87) + ((i2 & 87) << 1)) % 128;
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jb
    public void ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        get = (((i | 59) << 1) - (i ^ 59)) % 128;
        jf jfVar = this.getWarnings;
        setTitleMarginStart.get getVar = setTitleMarginStart.get.ThreeDS2Service;
        jfVar.ThreeDS2Service(getVar);
        this.initialize.initialize(getVar);
        int i2 = ThreeDS2Service;
        int i3 = i2 & 5;
        get = (((i2 | 5) & (~i3)) + (i3 << 1)) % 128;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = i | i2;
        int i5 = (i4 * (-502)) + (i2 * 503) + (i * 503);
        int i6 = ~i;
        int i7 = ~((~i2) | i6);
        int i8 = i6 | (~i3);
        int i9 = i7 | (~i8);
        int i10 = ~(i3 | i4);
        int i11 = (((~(i8 | i2)) | i10) * HttpStatusCode.BAD_GATEWAY_502) + ((i9 | i10) * (-502)) + i5;
        return i11 != 1 ? i11 != 2 ? get(objArr) : getWarnings(objArr) : ThreeDS2ServiceInstance(objArr);
    }
}
