package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class getErrorMessage {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    private final Map<String, ButtonCustomization> get;
    private final Map<String, ButtonCustomization> getWarnings;

    private getErrorMessage(initialize initializeVar) {
        this.getWarnings = Collections.unmodifiableMap((Map) initialize.initialize(new Object[]{initializeVar}, -427338455, 427338455, (int) System.currentTimeMillis()));
        this.get = Collections.unmodifiableMap((Map) initialize.initialize(new Object[]{initializeVar}, 952096354, -952096353, (int) System.currentTimeMillis()));
    }

    public static initialize ThreeDS2Service() {
        return (initialize) get(new Object[0], -966811835, 966811835, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        initialize initializeVar = new initialize();
        int i = ThreeDS2Service;
        int i2 = (i | 91) << 1;
        int i3 = -(i ^ 91);
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return initializeVar;
        }
        throw null;
    }

    public Map<String, ButtonCustomization> ThreeDS2ServiceInstance() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        Map<String, ButtonCustomization> map = this.get;
        int i = ThreeDS2Service;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 102) << 1, i ^ 102, 1, 128);
        return map;
    }

    public Map<String, ButtonCustomization> initialize() {
        int i = ThreeDS2Service;
        Map<String, ButtonCustomization> map = this.getWarnings;
        ThreeDS2ServiceInstance = ((-2) - ((i + 102) ^ (-1))) % 128;
        return map;
    }

    public static final class initialize {
        private static int ThreeDS2ServiceInstance = 0;
        private static int get = 1;
        private final Map<String, ButtonCustomization> ThreeDS2Service;
        private final Map<String, ButtonCustomization> getWarnings;

        private initialize() {
            this.ThreeDS2Service = new HashMap();
            this.getWarnings = new HashMap();
        }

        private static /* synthetic */ Object get(Object[] objArr) {
            initialize initializeVar = (initialize) objArr[0];
            int i = get;
            int i2 = i + 88;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            ThreeDS2ServiceInstance = i3 % 128;
            int i4 = i3 % 2;
            Map<String, ButtonCustomization> map = initializeVar.getWarnings;
            if (i4 != 0) {
                int i5 = 29 / 0;
            }
            int i6 = i & 71;
            int i7 = ((i ^ 71) | i6) << 1;
            int i8 = -((i | 71) & (~i6));
            ThreeDS2ServiceInstance = ((i7 & i8) + (i7 | i8)) % 128;
            return map;
        }

        public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
            int i4 = ((i | i3) * (-859)) + (i2 * (-858)) + (i * 860);
            int i5 = ~i3;
            int i6 = ~(i5 | i);
            int i7 = ~i;
            int i8 = ~i2;
            if ((((~(i | i8)) | (~(i8 | i5))) * 859) + (((~(i3 | i7 | i8)) | i6) * 859) + i4 == 1) {
                return get(objArr);
            }
            initialize initializeVar = (initialize) objArr[0];
            int i9 = (ThreeDS2ServiceInstance + 41) % 128;
            get = i9;
            Map<String, ButtonCustomization> map = initializeVar.ThreeDS2Service;
            int i10 = i9 & 1;
            int i11 = -(-(i9 | 1));
            ThreeDS2ServiceInstance = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
            return map;
        }

        public void ThreeDS2Service(String str, ButtonCustomization buttonCustomization) {
            int i = get;
            int i2 = ((i ^ 37) - (~((i & 37) << 1))) - 1;
            ThreeDS2ServiceInstance = i2 % 128;
            int i3 = i2 % 2;
            Map<String, ButtonCustomization> map = this.getWarnings;
            if (i3 != 0) {
                map.put(str, buttonCustomization);
                throw null;
            }
            map.put(str, buttonCustomization);
            int i4 = get;
            int i5 = (i4 & (-28)) | ((~i4) & 27);
            int i6 = (i4 & 27) << 1;
            ThreeDS2ServiceInstance = ((i5 & i6) + (i6 | i5)) % 128;
        }

        public void ThreeDS2ServiceInstance(String str, ButtonCustomization buttonCustomization) {
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 1;
            int i3 = ((i ^ 1) | i2) << 1;
            int i4 = -((i | 1) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            get = i5 % 128;
            int i6 = i5 % 2;
            Map<String, ButtonCustomization> map = this.ThreeDS2Service;
            if (i6 != 0) {
                map.put(str, buttonCustomization);
            } else {
                map.put(str, buttonCustomization);
                int i7 = 6 / 0;
            }
        }

        public getErrorMessage get() {
            getErrorMessage geterrormessage = new getErrorMessage(this);
            int i = ThreeDS2ServiceInstance + 117;
            get = i % 128;
            if (i % 2 == 0) {
                int i2 = 53 / 0;
            }
            return geterrormessage;
        }
    }
}
