package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class bm extends bi<LinearLayout> implements containsValue {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int createTransaction = 1;
    private final propertyNames ThreeDS2Service;
    private final ap ThreeDS2ServiceInstance;
    private final ap cleanup;
    private final bu get;
    private final bu getWarnings;

    public bm(Context context, propertyNames propertynames, bu buVar, bu buVar2, ap apVar, ap apVar2) {
        super(context);
        this.ThreeDS2Service = propertynames;
        this.get = buVar;
        this.getWarnings = buVar2;
        this.ThreeDS2ServiceInstance = apVar;
        this.cleanup = apVar2;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-282)) + (i * EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        int i5 = ~i;
        int i6 = (((~(i5 | i2)) | (~(i5 | i3))) * (-283)) + i4;
        int i7 = ~i2;
        if (((~(i7 | i5 | i3)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE) + ((~(i | i7)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE) + i6 != 1) {
            return initialize(objArr);
        }
        Context context = (Context) objArr[0];
        propertyNames propertynames = (propertyNames) objArr[1];
        bp bpVar = (bp) objArr[2];
        al alVar = (al) objArr[3];
        aq aqVar = (aq) objArr[4];
        aq aqVar2 = (aq) objArr[5];
        bm bmVar = new bm(context, propertynames, new bu(context, bpVar, alVar), new bu(context, aqVar, aqVar2), new ap(context, bpVar, aqVar), new ap(context, alVar, aqVar2));
        ThreeDS2ServiceInitializationCallback = (createTransaction + 107) % 128;
        return bmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (r1.ThreeDS2ServiceInstance() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.bm.createTransaction;
        com.netcetera.threeds.sdk.infrastructure.bm.ThreeDS2ServiceInitializationCallback = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r1 & 70, r1 | 70, 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r1.ThreeDS2ServiceInstance() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object initialize(Object[] objArr) {
        boolean z;
        int i;
        boolean z2 = false;
        bm bmVar = (bm) objArr[0];
        int i2 = createTransaction + 7;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            bmVar.ThreeDS2ServiceInstance.getWarnings();
            throw null;
        }
        if (!bmVar.ThreeDS2ServiceInstance.getWarnings()) {
            int i3 = ThreeDS2ServiceInitializationCallback;
            int i4 = i3 & 85;
            int i5 = (((i3 | 85) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            createTransaction = i5 % 128;
            if (i5 % 2 == 0) {
                bmVar.cleanup.getWarnings();
                throw null;
            }
            if (!bmVar.cleanup.getWarnings()) {
                int i6 = createTransaction;
                int i7 = i6 ^ 109;
                int i8 = ((i6 & 109) | i7) << 1;
                int i9 = -i7;
                ThreeDS2ServiceInitializationCallback = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
                z = false;
                bmVar.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(z);
                bmVar.cleanup.ThreeDS2ServiceInstance(z);
                if (!bmVar.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance()) {
                    int i10 = ThreeDS2ServiceInitializationCallback;
                    int i11 = i10 & 121;
                    int i12 = -(-(i10 | 121));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    createTransaction = i13 % 128;
                    int i14 = i13 % 2;
                    ap apVar = bmVar.cleanup;
                    if (i14 == 0) {
                        int i15 = 26 / 0;
                    }
                    bmVar.ThreeDS2ServiceInstance.ThreeDS2Service(z2);
                    bmVar.cleanup.ThreeDS2Service(z2);
                    int i16 = ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                    i = (i16 ^ (-1)) + (i16 << 1);
                    createTransaction = i % 128;
                    if (i % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i17 = createTransaction;
                int i18 = i17 & 71;
                int i19 = (i17 | 71) & (~i18);
                int i20 = i18 << 1;
                ThreeDS2ServiceInitializationCallback = ((i19 & i20) + (i19 | i20)) % 128;
                z2 = true;
                bmVar.ThreeDS2ServiceInstance.ThreeDS2Service(z2);
                bmVar.cleanup.ThreeDS2Service(z2);
                int i162 = ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                i = (i162 ^ (-1)) + (i162 << 1);
                createTransaction = i % 128;
                if (i % 2 != 0) {
                }
            }
        }
        ThreeDS2ServiceInitializationCallback = (createTransaction + 53) % 128;
        z = true;
        bmVar.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(z);
        bmVar.cleanup.ThreeDS2ServiceInstance(z);
        if (!bmVar.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance()) {
        }
        int i172 = createTransaction;
        int i182 = i172 & 71;
        int i192 = (i172 | 71) & (~i182);
        int i202 = i182 << 1;
        ThreeDS2ServiceInitializationCallback = ((i192 & i202) + (i192 | i202)) % 128;
        z2 = true;
        bmVar.ThreeDS2ServiceInstance.ThreeDS2Service(z2);
        bmVar.cleanup.ThreeDS2Service(z2);
        int i1622 = ThreeDS2ServiceInitializationCallback + EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
        i = (i1622 ^ (-1)) + (i1622 << 1);
        createTransaction = i % 128;
        if (i % 2 != 0) {
        }
    }

    public LinearLayout aQ_(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        int i = createTransaction;
        ThreeDS2ServiceInitializationCallback = ((-2) - ((((i | 96) << 1) - (i ^ 96)) ^ (-1))) % 128;
        return linearLayout;
    }

    public LinearLayout aR_(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        int i = ThreeDS2ServiceInitializationCallback + 91;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public void get(setScroller setscroller) {
        int i;
        ThreeDS2ServiceInitializationCallback = (createTransaction + 3) % 128;
        if (putAll.getWarnings.equals(setscroller.getSchemeName())) {
            int i2 = ThreeDS2ServiceInitializationCallback;
            createTransaction = (((i2 | 81) << 1) - (i2 ^ 81)) % 128;
            ((LinearLayout) ThreeDS2Service()).addView(this.get.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.getWarnings.ThreeDS2Service());
            int i3 = ThreeDS2ServiceInitializationCallback;
            int i4 = (i3 ^ 102) + ((i3 & 102) << 1);
            i = (i4 ^ (-1)) + (i4 << 1);
        } else {
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.get.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.getWarnings.ThreeDS2Service());
            i = ThreeDS2ServiceInitializationCallback + 51;
        }
        createTransaction = i % 128;
        this.ThreeDS2Service.ThreeDS2Service(setscroller);
        this.get.ThreeDS2Service(setscroller);
        this.getWarnings.ThreeDS2Service(setscroller);
        int i5 = ThreeDS2ServiceInitializationCallback;
        int i6 = i5 & 7;
        int i7 = (i5 ^ 7) | i6;
        createTransaction = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public void getWarnings(setScroller setscroller) {
        int i = createTransaction;
        int i2 = i & 77;
        ThreeDS2ServiceInitializationCallback = ((((i ^ 77) | i2) << 1) - ((i | 77) & (~i2))) % 128;
        if (putAll.getWarnings.equals(setscroller.getSchemeName())) {
            int i3 = createTransaction;
            ThreeDS2ServiceInitializationCallback = ((((i3 | 76) << 1) - (i3 ^ 76)) - 1) % 128;
            ((LinearLayout) ThreeDS2Service()).addView(this.get.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.getWarnings.ThreeDS2Service());
            this.ThreeDS2Service.ThreeDS2Service(setscroller);
            this.get.ThreeDS2Service(setscroller);
            this.getWarnings.ThreeDS2Service(setscroller);
            int i4 = ThreeDS2ServiceInitializationCallback;
            int i5 = i4 & 41;
            int i6 = -(-((i4 ^ 41) | i5));
            createTransaction = ((i5 & i6) + (i6 | i5)) % 128;
        } else {
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2ServiceInstance.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.cleanup.ThreeDS2Service());
            this.ThreeDS2Service.ThreeDS2Service(setscroller);
            this.ThreeDS2ServiceInstance.ThreeDS2Service(setscroller);
            this.cleanup.ThreeDS2Service(setscroller);
            ThreeDS2Service(new Object[]{this}, -1332685638, 1332685638, System.identityHashCode(this));
            int i7 = ThreeDS2ServiceInitializationCallback;
            createTransaction = SVG$Unit$EnumUnboxingLocalUtility.m$1((i7 | 54) << 1, i7 ^ 54, 1, 128);
        }
        int i8 = createTransaction;
        int i9 = i8 & 119;
        ThreeDS2ServiceInitializationCallback = (i9 + ((i8 ^ 119) | i9)) % 128;
    }

    public static bm get(Context context, propertyNames propertynames, bp bpVar, al alVar, aq aqVar, aq aqVar2) {
        return (bm) ThreeDS2Service(new Object[]{context, propertynames, bpVar, alVar, aqVar, aqVar2}, 589595032, -589595031, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public /* synthetic */ LinearLayout initialize(Context context) {
        int i = createTransaction + 33;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        LinearLayout aR_ = aR_(context);
        if (i2 != 0) {
            int i3 = 8 / 0;
        }
        int i4 = createTransaction + 101;
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aR_;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bi
    public /* synthetic */ LinearLayout getWarnings(Context context) {
        int i = createTransaction;
        ThreeDS2ServiceInitializationCallback = ((((i | 100) << 1) - (i ^ 100)) - 1) % 128;
        LinearLayout aQ_ = aQ_(context);
        int i2 = ThreeDS2ServiceInitializationCallback;
        int i3 = i2 & 35;
        int i4 = i2 | 35;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        createTransaction = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return aQ_;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        int i = createTransaction + 4;
        int i2 = (i ^ (-1)) + (i << 1);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        bu buVar = this.get;
        if (i3 != 0) {
            buVar.getWarnings(eqVar);
            this.getWarnings.getWarnings(eqVar);
            this.ThreeDS2ServiceInstance.getWarnings(eqVar);
            this.cleanup.getWarnings(eqVar);
            int i4 = 46 / 0;
        } else {
            buVar.getWarnings(eqVar);
            this.getWarnings.getWarnings(eqVar);
            this.ThreeDS2ServiceInstance.getWarnings(eqVar);
            this.cleanup.getWarnings(eqVar);
        }
        int i5 = createTransaction;
        int i6 = i5 & 67;
        int i7 = -(-((i5 ^ 67) | i6));
        ThreeDS2ServiceInitializationCallback = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 13;
        int i3 = (i ^ 13) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        createTransaction = i4 % 128;
        int i5 = i4 % 2;
        bu buVar = this.get;
        if (i5 == 0) {
            buVar.getWarnings(erVar);
            this.getWarnings.getWarnings(erVar);
            this.ThreeDS2ServiceInstance.getWarnings(erVar);
            this.cleanup.getWarnings(erVar);
            int i6 = 41 / 0;
        } else {
            buVar.getWarnings(erVar);
            this.getWarnings.getWarnings(erVar);
            this.ThreeDS2ServiceInstance.getWarnings(erVar);
            this.cleanup.getWarnings(erVar);
        }
        ThreeDS2ServiceInitializationCallback = (createTransaction + 15) % 128;
    }
}
