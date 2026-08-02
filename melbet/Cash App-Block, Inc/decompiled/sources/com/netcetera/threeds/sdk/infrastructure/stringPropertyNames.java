package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class stringPropertyNames extends loadFromXML<LinearLayout> implements containsValue {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    protected final loadFromXML<View> ThreeDS2Service;
    protected final loadFromXML<View> get;

    public stringPropertyNames(Context context, loadFromXML loadfromxml, loadFromXML loadfromxml2) {
        super(context);
        this.ThreeDS2Service = loadfromxml;
        this.get = loadfromxml2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r2 instanceof com.netcetera.threeds.sdk.infrastructure.containsValue) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((r2 instanceof com.netcetera.threeds.sdk.infrastructure.containsValue) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r7.get((com.netcetera.threeds.sdk.infrastructure.containsValue) r2);
        r7 = com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.ThreeDS2ServiceInstance = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1(((r7 ^ 39) | (r7 & 39)) << 1, ~(-(((~r7) & 39) | (r7 & (-40)))), 1, 128);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        writeReplace writereplace = (loadFromXML) objArr[1];
        nr nrVar = (nr) objArr[2];
        int i = ThreeDS2ServiceInstance;
        int i2 = i | 95;
        int i3 = ((i2 << 1) - (~(-((~(i & 95)) & i2)))) - 1;
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        getWarnings = (ThreeDS2ServiceInstance + 111) % 128;
        return null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (((~(i5 | i3)) | (~(i4 | i5)) | (~(i4 | i3))) * (-880)) + (i2 * 881) + (i * 881);
        int i7 = i2 | (~(i4 | (~i3)));
        int i8 = ~(i | i3);
        int i9 = (i8 * 880) + ((i7 | i8) * (-880)) + i6;
        if (i9 == 1) {
            eq eqVar = (eq) objArr[0];
            containsValue containsvalue = (containsValue) objArr[1];
            getWarnings = (ThreeDS2ServiceInstance + 47) % 128;
            containsvalue.getWarnings(eqVar);
            int i10 = getWarnings;
            ThreeDS2ServiceInstance = ((i10 ^ 107) + ((i10 & 107) << 1)) % 128;
            return null;
        }
        if (i9 == 2) {
            return ThreeDS2ServiceInstance(objArr);
        }
        if (i9 != 3) {
            return i9 != 4 ? ThreeDS2Service(objArr) : get(objArr);
        }
        eq eqVar2 = (eq) objArr[0];
        containsValue containsvalue2 = (containsValue) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        containsvalue2.getWarnings(eqVar2);
        int i11 = getWarnings;
        ThreeDS2ServiceInstance = ((i11 & 85) + (i11 | 85)) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service(setScroller setscroller) {
        int i;
        int i2;
        int i3 = ThreeDS2ServiceInstance;
        int i4 = i3 | 73;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 73)) & i4);
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        getWarnings = i7 % 128;
        int i8 = i7 % 2;
        loadFromXML<View> loadfromxml = this.ThreeDS2Service;
        if (i8 != 0) {
            loadfromxml.ThreeDS2Service(setscroller);
            this.get.ThreeDS2Service(setscroller);
            ThreeDS2ServiceInstance(this.ThreeDS2Service);
            throw null;
        }
        loadfromxml.ThreeDS2Service(setscroller);
        this.get.ThreeDS2Service(setscroller);
        if (!ThreeDS2ServiceInstance(this.ThreeDS2Service)) {
            int i9 = getWarnings;
            int i10 = i9 ^ 97;
            int i11 = (i9 & 97) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            ThreeDS2ServiceInstance = i12 % 128;
            int i13 = i12 % 2;
            loadFromXML<View> loadfromxml2 = this.get;
            if (i13 == 0) {
                ThreeDS2ServiceInstance(loadfromxml2);
                throw null;
            }
            if (!ThreeDS2ServiceInstance(loadfromxml2)) {
                int i14 = getWarnings;
                int i15 = i14 | 115;
                int i16 = ((i15 << 1) - ((~(i14 & 115)) & i15)) % 128;
                ThreeDS2ServiceInstance = i16;
                getWarnings = ((i16 & 3) + (i16 | 3)) % 128;
                i = 8;
                ThreeDS2Service().setVisibility(i);
                int i17 = getWarnings;
                int i18 = i17 & 93;
                i2 = i18 + ((i17 ^ 93) | i18);
                ThreeDS2ServiceInstance = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        int i19 = ThreeDS2ServiceInstance;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i19 | 64) << 1, i19 ^ 64, 1, 128);
        getWarnings = m$1;
        ThreeDS2ServiceInstance = ((m$1 ^ 59) + ((m$1 & 59) << 1)) % 128;
        i = 0;
        ThreeDS2Service().setVisibility(i);
        int i172 = getWarnings;
        int i182 = i172 & 93;
        i2 = i182 + ((i172 ^ 93) | i182);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    public abstract LinearLayout aV_(Context context);

    public abstract LinearLayout aW_(Context context);

    public LinearLayout af_(Context context) {
        int i = getWarnings + 4;
        ThreeDS2ServiceInstance = ((i ^ (-1)) + (i << 1)) % 128;
        LinearLayout aV_ = aV_(context);
        LinearLayout aW_ = aW_(context);
        aW_.addView(this.ThreeDS2Service.ThreeDS2Service());
        aV_.addView(aW_);
        LinearLayout aW_2 = aW_(context);
        aW_2.addView(this.get.ThreeDS2Service());
        aV_.addView(aW_2);
        int i2 = getWarnings;
        int i3 = i2 & 53;
        int i4 = ((i2 | 53) & (~i3)) + (i3 << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return aV_;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        get(new Object[]{this, this.ThreeDS2Service, new aa(erVar)}, -1159389784, 1159389786, System.identityHashCode(this));
        get(new Object[]{this, this.get, new ab(erVar)}, -1159389784, 1159389786, System.identityHashCode(this));
        int i = getWarnings;
        int i2 = i & 115;
        int i3 = -(-((i ^ 115) | i2));
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        get(new Object[]{this, this.ThreeDS2Service, new list(eqVar)}, -1159389784, 1159389786, System.identityHashCode(this));
        get(new Object[]{this, this.get, new z(eqVar)}, -1159389784, 1159389786, System.identityHashCode(this));
        int i = getWarnings + 83;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r2 = com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.ThreeDS2ServiceInstance;
        r3 = r2 & 37;
        com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.getWarnings = (r3 + ((r2 ^ 37) | r3)) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r3.ThreeDS2Service().getVisibility() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        r2 = com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.ThreeDS2ServiceInstance;
        com.netcetera.threeds.sdk.infrastructure.stringPropertyNames.getWarnings = (((r2 | 1) << 1) - (r2 ^ 1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ThreeDS2ServiceInstance(loadFromXML<View> loadfromxml) {
        int i = ThreeDS2ServiceInstance + 113;
        getWarnings = i % 128;
        boolean z = false;
        if (i % 2 != 0) {
            int visibility = loadfromxml.ThreeDS2Service().getVisibility();
            int i2 = 66 / 0;
        }
        int i3 = getWarnings;
        int i4 = (i3 ^ 34) + ((i3 & 34) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = getWarnings;
        int i2 = i ^ 9;
        int i3 = (i & 9) << 1;
        ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        LinearLayout af_ = af_(context);
        int i4 = getWarnings;
        int i5 = ((i4 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)) - 1;
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            return af_;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        er erVar = (er) objArr[0];
        containsValue containsvalue = (containsValue) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & (-18)) | ((~i) & 17);
        int i3 = (i & 17) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        containsvalue.getWarnings(erVar);
        if (i5 != 0) {
            int i6 = 63 / 0;
        }
        int i7 = getWarnings;
        int i8 = i7 & 49;
        int i9 = ((i7 | 49) & (~i8)) + (i8 << 1);
        ThreeDS2ServiceInstance = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        er erVar = (er) objArr[0];
        containsValue containsvalue = (containsValue) objArr[1];
        int i = ThreeDS2ServiceInstance;
        getWarnings = (((i | 99) << 1) - (i ^ 99)) % 128;
        containsvalue.getWarnings(erVar);
        int i2 = getWarnings;
        int i3 = (((i2 & (-68)) | ((~i2) & 67)) - (~((i2 & 67) << 1))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return null;
    }
}
