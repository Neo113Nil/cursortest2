package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class setCollapsible {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int getWarnings;
    private final compareTo ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final clone get;
    private final List<setCollapsible> initialize;

    public setCollapsible(String str, clone cloneVar, compareTo compareto, List<setCollapsible> list) {
        this.ThreeDS2ServiceInstance = str;
        this.get = cloneVar;
        this.ThreeDS2Service = compareto;
        this.initialize = list;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        int i = 0;
        setCollapsible setcollapsible = (setCollapsible) objArr[0];
        nq nqVar = (nq) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = ThreeDS2ServiceInitializationCallback;
        int i3 = (i2 ^ 71) + ((i2 & 71) << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            nqVar.addParam(setcollapsible.ThreeDS2ServiceInstance);
            throw null;
        }
        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
        if (nqVar.addParam(setcollapsible.ThreeDS2ServiceInstance)) {
            int i4 = ThreeDS2ServiceInitializationCallback;
            int i5 = (i4 & (-62)) | ((~i4) & 61);
            int i6 = -(-((i4 & 61) << 1));
            getWarnings = ((i5 & i6) + (i6 | i5)) % 128;
            ns ThreeDS2ServiceInitializationCallback2 = nqVar.ThreeDS2ServiceInitializationCallback(setcollapsible.ThreeDS2ServiceInstance);
            int i7 = ThreeDS2ServiceInitializationCallback;
            int i8 = i7 & 23;
            getWarnings = (((i7 | 23) & (~i8)) + (i8 << 1)) % 128;
            while (i < ThreeDS2ServiceInitializationCallback2.getWarnings()) {
                int i9 = getWarnings;
                ThreeDS2ServiceInitializationCallback = (((i9 & (-6)) | ((~i9) & 5)) + ((i9 & 5) << 1)) % 128;
                nq nqVar2 = ThreeDS2ServiceInitializationCallback2.get(i);
                int i10 = getWarnings;
                int i11 = ((i10 ^ 21) | (i10 & 21)) << 1;
                int i12 = -(((~i10) & 21) | (i10 & (-22)));
                ThreeDS2ServiceInitializationCallback = ((i11 & i12) + (i12 | i11)) % 128;
                for (setCollapsible setcollapsible2 : setcollapsible.initialize) {
                    int i13 = getWarnings;
                    int i14 = (i13 & (-116)) | ((~i13) & 115);
                    int i15 = -(-((i13 & 115) << 1));
                    ThreeDS2ServiceInitializationCallback = ((i14 & i15) + (i15 | i14)) % 128;
                    if (setcollapsible2.get.ThreeDS2ServiceInstance(nqVar2, setcollapsible2.ThreeDS2ServiceInstance, booleanValue)) {
                        int i16 = ThreeDS2ServiceInitializationCallback;
                        int i17 = (i16 & (-90)) | ((~i16) & 89);
                        int i18 = -(-((i16 & 89) << 1));
                        int i19 = (i17 & i18) + (i18 | i17);
                        getWarnings = i19 % 128;
                        if (i19 % 2 != 0) {
                            findfragmentbyid.get(setcollapsible2.getWarnings(nqVar2, booleanValue));
                            throw null;
                        }
                        findfragmentbyid.get(setcollapsible2.getWarnings(nqVar2, booleanValue));
                    }
                    int i20 = getWarnings;
                    ThreeDS2ServiceInitializationCallback = ((i20 & 105) + (i20 | 105)) % 128;
                }
                int i21 = (i | (-112)) << 1;
                int i22 = -(((~i) & (-112)) | (i & 111));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = i23 & 113;
                i = (i24 - (~(-(-((i23 ^ 113) | i24))))) - 1;
                int i25 = getWarnings;
                int i26 = (i25 | 35) << 1;
                int i27 = -(i25 ^ 35);
                ThreeDS2ServiceInitializationCallback = ((i26 & i27) + (i27 | i26)) % 128;
            }
            int i28 = ThreeDS2ServiceInitializationCallback;
            getWarnings = ((((i28 ^ 45) | (i28 & 45)) << 1) - (((~i28) & 45) | (i28 & (-46)))) % 128;
        } else {
            nq sDKVersion = nqVar.getSDKVersion(setcollapsible.ThreeDS2ServiceInstance);
            int i29 = getWarnings;
            ThreeDS2ServiceInitializationCallback = Thread$State$EnumUnboxingLocalUtility.m(i29 & 44, i29 | 44, 1, 128);
            for (setCollapsible setcollapsible3 : setcollapsible.initialize) {
                int i30 = ThreeDS2ServiceInitializationCallback;
                getWarnings = ((i30 & 19) + (i30 | 19)) % 128;
                if (setcollapsible3.get.ThreeDS2ServiceInstance(sDKVersion, setcollapsible3.ThreeDS2ServiceInstance, booleanValue)) {
                    int i31 = ThreeDS2ServiceInitializationCallback;
                    getWarnings = Thread$State$EnumUnboxingLocalUtility.m(i31 ^ 48, (i31 & 48) << 1, 1, 128);
                    findfragmentbyid.get(setcollapsible3.getWarnings(sDKVersion, booleanValue));
                    int i32 = getWarnings;
                    int i33 = (i32 & (-98)) | ((~i32) & 97);
                    int i34 = -(-((i32 & 97) << 1));
                    ThreeDS2ServiceInitializationCallback = (((i33 | i34) << 1) - (i34 ^ i33)) % 128;
                }
                int i35 = ThreeDS2ServiceInitializationCallback;
                getWarnings = ((i35 ^ 45) + ((i35 & 45) << 1)) % 128;
            }
        }
        int i36 = getWarnings;
        int i37 = i36 & 85;
        int i38 = -(-((i36 ^ 85) | i37));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        ThreeDS2ServiceInitializationCallback = i39 % 128;
        if (i39 % 2 != 0) {
            return findfragmentbyid;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        int i = 0;
        setCollapsible setcollapsible = (setCollapsible) objArr[0];
        nq nqVar = (nq) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = ThreeDS2ServiceInitializationCallback;
        int i3 = i2 & 25;
        int i4 = i3 + ((i2 ^ 25) | i3);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            nqVar.addParam(setcollapsible.ThreeDS2ServiceInstance);
            throw null;
        }
        if (nqVar.addParam(setcollapsible.ThreeDS2ServiceInstance)) {
            ThreeDS2ServiceInitializationCallback = (getWarnings + 49) % 128;
            ns ThreeDS2ServiceInitializationCallback2 = nqVar.ThreeDS2ServiceInitializationCallback(setcollapsible.ThreeDS2ServiceInstance);
            int i5 = ThreeDS2ServiceInitializationCallback;
            int i6 = i5 & 87;
            getWarnings = (((i5 | 87) & (~i6)) + (i6 << 1)) % 128;
            while (i < ThreeDS2ServiceInitializationCallback2.getWarnings()) {
                int i7 = ThreeDS2ServiceInitializationCallback;
                int i8 = i7 & 115;
                int i9 = ((i7 ^ 115) | i8) << 1;
                int i10 = -((i7 | 115) & (~i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                getWarnings = i11 % 128;
                if (i11 % 2 != 0) {
                    ThreeDS2ServiceInitializationCallback2.get(i);
                    setcollapsible.initialize.iterator();
                    throw null;
                }
                nq nqVar2 = ThreeDS2ServiceInitializationCallback2.get(i);
                Iterator<setCollapsible> it = setcollapsible.initialize.iterator();
                while (it.hasNext()) {
                    int i12 = ThreeDS2ServiceInitializationCallback;
                    int i13 = ((i12 ^ 107) | (i12 & 107)) << 1;
                    int i14 = -(((~i12) & 107) | (i12 & (-108)));
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    getWarnings = i15 % 128;
                    if (i15 % 2 != 0) {
                        setCollapsible next = it.next();
                        next.get.ThreeDS2ServiceInstance(nqVar2, next.ThreeDS2ServiceInstance, booleanValue);
                        throw null;
                    }
                    setCollapsible next2 = it.next();
                    if (next2.get.ThreeDS2ServiceInstance(nqVar2, next2.ThreeDS2ServiceInstance, booleanValue)) {
                        getWarnings = (ThreeDS2ServiceInitializationCallback + 7) % 128;
                        nqVar2 = next2.ThreeDS2ServiceInstance(nqVar2, booleanValue);
                        int i16 = getWarnings;
                        ThreeDS2ServiceInitializationCallback = ((((i16 ^ 5) | (i16 & 5)) << 1) - (((~i16) & 5) | (i16 & (-6)))) % 128;
                    }
                    ThreeDS2ServiceInitializationCallback2.getWarnings(i, nqVar2);
                    getWarnings = (ThreeDS2ServiceInitializationCallback + 77) % 128;
                }
                i = (((i | 2) << 1) - (i ^ 2)) - 1;
                getWarnings = (ThreeDS2ServiceInitializationCallback + 5) % 128;
            }
            nqVar.ThreeDS2Service(setcollapsible.ThreeDS2ServiceInstance, ThreeDS2ServiceInitializationCallback2);
            int i17 = getWarnings;
            int i18 = i17 & 77;
            int i19 = ((i17 ^ 77) | i18) << 1;
            int i20 = -((i17 | 77) & (~i18));
            ThreeDS2ServiceInitializationCallback = ((i19 & i20) + (i20 | i19)) % 128;
        } else {
            nq sDKVersion = nqVar.getSDKVersion(setcollapsible.ThreeDS2ServiceInstance);
            int i21 = getWarnings;
            ThreeDS2ServiceInitializationCallback = ((i21 ^ 119) + ((i21 & 119) << 1)) % 128;
            for (setCollapsible setcollapsible2 : setcollapsible.initialize) {
                int i22 = getWarnings;
                ThreeDS2ServiceInitializationCallback = ((-2) - (((i22 & 66) + (i22 | 66)) ^ (-1))) % 128;
                if (setcollapsible2.get.ThreeDS2ServiceInstance(sDKVersion, setcollapsible2.ThreeDS2ServiceInstance, booleanValue)) {
                    int i23 = getWarnings;
                    int i24 = (i23 & (-14)) | ((~i23) & 13);
                    int i25 = -(-((i23 & 13) << 1));
                    ThreeDS2ServiceInitializationCallback = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                    sDKVersion = setcollapsible2.ThreeDS2ServiceInstance(sDKVersion, booleanValue);
                    int i26 = getWarnings;
                    ThreeDS2ServiceInitializationCallback = ((i26 ^ 1) + ((i26 & 1) << 1)) % 128;
                }
                nqVar.initialize(setcollapsible.ThreeDS2ServiceInstance, sDKVersion);
                ThreeDS2ServiceInitializationCallback = (getWarnings + 3) % 128;
            }
        }
        int i27 = ThreeDS2ServiceInitializationCallback;
        int i28 = (-2) - ((((i27 | 112) << 1) - (i27 ^ 112)) ^ (-1));
        getWarnings = i28 % 128;
        if (i28 % 2 == 0) {
            return nqVar;
        }
        throw null;
    }

    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (-2) - ((i + 46) ^ (-1));
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        getWarnings = (i + 117) % 128;
        return str;
    }

    public nq ThreeDS2ServiceInstance(nq nqVar, boolean z) {
        int i = getWarnings + 69;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        clone cloneVar = this.get;
        if (i2 == 0) {
            cloneVar.ThreeDS2ServiceInstance(nqVar, this.ThreeDS2ServiceInstance, z);
            throw null;
        }
        if (!cloneVar.ThreeDS2ServiceInstance(nqVar, this.ThreeDS2ServiceInstance, z)) {
            int i3 = ThreeDS2ServiceInitializationCallback;
            int i4 = (i3 ^ 125) + ((i3 & 125) << 1);
            getWarnings = i4 % 128;
            if (i4 % 2 == 0) {
                return nqVar;
            }
            throw null;
        }
        List<setCollapsible> list = this.initialize;
        if (list != null) {
            int i5 = ThreeDS2ServiceInitializationCallback;
            int i6 = i5 | 89;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 89)) & i6);
            getWarnings = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            if (list.size() > 0) {
                int i9 = ThreeDS2ServiceInitializationCallback;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i9 ^ 21) | (i9 & 21)) << 1, ~(-(((~i9) & 21) | (i9 & (-22)))), 1, 128);
                nq nqVar2 = (nq) get(new Object[]{this, nqVar, Boolean.valueOf(z)}, 242710388, -242710387, System.identityHashCode(this));
                int i10 = ThreeDS2ServiceInitializationCallback;
                int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
                getWarnings = i11 % 128;
                if (i11 % 2 == 0) {
                    return nqVar2;
                }
                throw null;
            }
        }
        nq warnings = this.ThreeDS2Service.getWarnings(nqVar, this.ThreeDS2ServiceInstance, z);
        int i12 = ThreeDS2ServiceInitializationCallback;
        int i13 = i12 & 103;
        int i14 = i12 | 103;
        getWarnings = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        return warnings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r0.get(r7.ThreeDS2Service.get(r8, r7.ThreeDS2ServiceInstance, r9));
        r1 = r7.initialize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r2 = com.netcetera.threeds.sdk.infrastructure.setCollapsible.ThreeDS2ServiceInitializationCallback;
        r3 = (r2 & 44) + (r2 | 44);
        com.netcetera.threeds.sdk.infrastructure.setCollapsible.getWarnings = ((r3 ^ (-1)) + (r3 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r1.size() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.setCollapsible.getWarnings;
        r2 = r1 & 101;
        com.netcetera.threeds.sdk.infrastructure.setCollapsible.ThreeDS2ServiceInitializationCallback = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1((r1 | 101) & (~r2), ~(-(-(r2 << 1))), 1, 128);
        r0.get((com.netcetera.threeds.sdk.infrastructure.findFragmentById) get(new java.lang.Object[]{r7, r8, java.lang.Boolean.valueOf(r9)}, 944544470, -944544470, java.lang.System.identityHashCode(r7)));
        com.netcetera.threeds.sdk.infrastructure.setCollapsible.getWarnings = ((-2) - ((com.netcetera.threeds.sdk.infrastructure.setCollapsible.ThreeDS2ServiceInitializationCallback + 76) ^ (-1))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r7.get.ThreeDS2ServiceInstance(r8, r7.ThreeDS2ServiceInstance, r9) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r7.get.ThreeDS2ServiceInstance(r8, r7.ThreeDS2ServiceInstance, r9) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public findFragmentById getWarnings(nq nqVar, boolean z) {
        findFragmentById findfragmentbyid;
        int i = ThreeDS2ServiceInitializationCallback + 71;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
            int i2 = 24 / 0;
        } else {
            findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
        }
        int i3 = getWarnings;
        int i4 = i3 & 19;
        int i5 = ((i3 | 19) & (~i4)) + (i4 << 1);
        ThreeDS2ServiceInitializationCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return findfragmentbyid;
        }
        throw null;
    }

    public static class ThreeDS2ServiceInstance {
        private static int ThreeDS2ServiceInstance = 0;
        private static int getSDKInfo = 1;
        private List<setCollapsible> ThreeDS2Service;
        private clone get;
        private compareTo getWarnings;
        private final String initialize;

        private ThreeDS2ServiceInstance(String str) {
            this.initialize = str;
        }

        public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
            ThreeDS2ServiceInstance threeDS2ServiceInstance = new ThreeDS2ServiceInstance((String) objArr[0]);
            int i4 = ThreeDS2ServiceInstance;
            getSDKInfo = ((((i4 | 2) << 1) - (i4 ^ 2)) - 1) % 128;
            return threeDS2ServiceInstance;
        }

        public static ThreeDS2ServiceInstance initialize(String str) {
            return (ThreeDS2ServiceInstance) ThreeDS2ServiceInstance(new Object[]{str}, -430024577, 430024577, (int) System.currentTimeMillis());
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(List<setCollapsible> list) {
            int i = ThreeDS2ServiceInstance;
            this.ThreeDS2Service = list;
            getSDKInfo = ((i ^ 95) + ((i & 95) << 1)) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance get(clone cloneVar) {
            int i = getSDKInfo;
            this.get = cloneVar;
            int i2 = i & 121;
            int i3 = -(-((i ^ 121) | i2));
            int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
            ThreeDS2ServiceInstance = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r1 = new com.netcetera.threeds.sdk.infrastructure.setCollapsible(r4.initialize, r4.get, r0, r4.ThreeDS2Service);
            r4 = com.netcetera.threeds.sdk.infrastructure.setCollapsible.ThreeDS2ServiceInstance.getSDKInfo;
            r0 = (r4 & 91) + (r4 | 91);
            com.netcetera.threeds.sdk.infrastructure.setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            if ((r0 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        
            if (r1 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r0 = r4.getWarnings;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            if (r0 == null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public setCollapsible getWarnings() {
            int i = ThreeDS2ServiceInstance + 77;
            getSDKInfo = i % 128;
            int i2 = i % 2;
            clone cloneVar = this.get;
            if (i2 == 0) {
                int i3 = 82 / 0;
            }
            throw setTextAlignment.getEncryptionCertificate.initialize(new Object[0]);
        }

        public ThreeDS2ServiceInstance getWarnings(compareTo compareto) {
            int i = getSDKInfo;
            this.getWarnings = compareto;
            int i2 = ((i ^ 54) + ((i & 54) << 1)) - 1;
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-475)) + (i * 477);
        int i5 = ~((~i) | i2);
        int i6 = ~i2;
        int i7 = ~(i6 | i | i3);
        return ((~(i | (i6 | (~i3)))) * 476) + ((i7 * 952) + (((i5 | i7) * (-476)) + i4)) != 1 ? get(objArr) : initialize(objArr);
    }
}
