package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setImeOptions implements setSearchResultHighlights {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final nn initialize;

    public setImeOptions(nn nnVar) {
        this.initialize = nnVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setImeOptions setimeoptions = (setImeOptions) objArr[0];
        String str = (String) objArr[1];
        int i = (-2) - ((getWarnings + 14) ^ (-1));
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            oj.initialize(str);
            throw null;
        }
        if (oj.initialize(str)) {
            str = setimeoptions.initialize.get(str);
            int i2 = getWarnings;
            int i3 = i2 & 77;
            ThreeDS2ServiceInstance = ((((i2 ^ 77) | i3) << 1) - ((i2 | 77) & (~i3))) % 128;
        }
        int i4 = ThreeDS2ServiceInstance;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m(i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, i4 | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, -1, 128);
        return str;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setImeOptions setimeoptions = (setImeOptions) objArr[0];
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        nl nlVar = (nl) objArr[2];
        getWarnings = (ThreeDS2ServiceInstance + 85) % 128;
        String str = (String) initialize(new Object[]{setimeoptions, setpopuptheme, nlVar}, -1439608883, 1439608887, System.identityHashCode(setimeoptions));
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 41) << 1) - (i ^ 41);
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setImeOptions setimeoptions = new setImeOptions(new nn());
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return setimeoptions;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setImeOptions setimeoptions = (setImeOptions) objArr[0];
        String str = (String) objArr[1];
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        String str2 = (String) initialize(new Object[]{setimeoptions, str}, -1814522642, 1814522642, System.identityHashCode(setimeoptions));
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 & 71;
        int i6 = ((i4 | 71) & (~i5)) + (i5 << 1);
        getWarnings = i6 % 128;
        if (i6 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        nl nlVar = (nl) objArr[2];
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 99;
        getWarnings = ((((i ^ 99) | i2) << 1) - ((~i2) & (i | 99))) % 128;
        if (setpopuptheme != null) {
            getWarnings = (((i | 27) << 1) - (i ^ 27)) % 128;
            if (setpopuptheme.initialize() != null) {
                String str = (String) nlVar.get(setpopuptheme);
                int i3 = getWarnings;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3 & 59, ~(i3 | 59), 1, 128);
                return str;
            }
        }
        int i4 = ThreeDS2ServiceInstance;
        int i5 = (i4 & 15) + (i4 | 15);
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return null;
    }

    public static setSearchResultHighlights getWarnings() {
        return (setSearchResultHighlights) initialize(new Object[0], -1131532117, 1131532120, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights
    public setSearchResultHighlights.getWarnings ThreeDS2Service(setPopupTheme setpopuptheme) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(setpopuptheme);
        ThreeDS2ServiceInstance = (getWarnings + 5) % 128;
        return anonymousClass4;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (((~(i2 | i3)) | (~(i4 | i5 | i6))) * 520) + (i2 * 521) + (i * (-519));
        int i8 = ~(i5 | i6);
        int i9 = ~(i3 | i);
        int i10 = (((~(i | i5)) | (~(i4 | i6)) | i9) * 520) + ((i8 | i9) * (-1040)) + i7;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? ThreeDS2Service(objArr) : initialize(objArr) : get(objArr) : ThreeDS2ServiceInstance(objArr) : getWarnings(objArr);
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setImeOptions$4, reason: invalid class name */
    public class AnonymousClass4 implements setSearchResultHighlights.getWarnings {
        private static int ThreeDS2Service = 0;
        private static int initialize = 1;
        final /* synthetic */ setPopupTheme getWarnings;

        public AnonymousClass4(setPopupTheme setpopuptheme) {
            this.getWarnings = setpopuptheme;
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            setPopupTheme setpopuptheme = (setPopupTheme) objArr[0];
            int i = ThreeDS2Service;
            int i2 = i ^ 77;
            int i3 = ((i & 77) | i2) << 1;
            int i4 = -i2;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            initialize = i5 % 128;
            int i6 = i5 % 2;
            String ThreeDS2ServiceInitializationCallback = setpopuptheme.initialize().ThreeDS2ServiceInitializationCallback();
            if (i6 == 0) {
                int i7 = 14 / 0;
            }
            return ThreeDS2ServiceInitializationCallback;
        }

        public static /* synthetic */ String getWarnings(setPopupTheme setpopuptheme) {
            return (String) ThreeDS2Service(new Object[]{setpopuptheme}, -618257587, 618257588, (int) System.currentTimeMillis());
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights.getWarnings
        public String ThreeDS2Service() {
            int i = ThreeDS2Service;
            int i2 = (i | 95) << 1;
            int i3 = -(i ^ 95);
            int i4 = (i2 & i3) + (i3 | i2);
            initialize = i4 % 128;
            int i5 = i4 % 2;
            setImeOptions setimeoptions = setImeOptions.this;
            if (i5 != 0) {
                return (String) setImeOptions.initialize(new Object[]{setImeOptions.this, (String) setImeOptions.initialize(new Object[]{setimeoptions, this.getWarnings, setError.get}, -1820322984, 1820322986, (int) System.currentTimeMillis())}, -1423691033, 1423691034, (int) System.currentTimeMillis());
            }
            throw null;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights.getWarnings
        public String get() {
            int i = ThreeDS2Service + 41;
            initialize = i % 128;
            int i2 = i % 2;
            setImeOptions setimeoptions = setImeOptions.this;
            if (i2 == 0) {
                throw null;
            }
            String str = (String) setImeOptions.initialize(new Object[]{setImeOptions.this, (String) setImeOptions.initialize(new Object[]{setimeoptions, this.getWarnings, setOnEditorActionListener.initialize}, -1820322984, 1820322986, (int) System.currentTimeMillis())}, -1423691033, 1423691034, (int) System.currentTimeMillis());
            int i3 = ThreeDS2Service + 37;
            initialize = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 12 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
            setPopupTheme setpopuptheme = (setPopupTheme) objArr[0];
            int i = initialize;
            ThreeDS2Service = ((i ^ 23) + ((i & 23) << 1)) % 128;
            String sDKVersion = setpopuptheme.initialize().getSDKVersion();
            int i2 = initialize;
            int i3 = (((i2 | 120) << 1) - (i2 ^ 120)) - 1;
            ThreeDS2Service = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return sDKVersion;
        }

        public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ((~(i4 | i2)) * (-1182)) + (i2 * (-590)) + (i * 592);
            int i6 = ~i2;
            return (((i3 | i4) | i6) * 591) + ((((~(i | i2)) | (~((i4 | i6) | (~i3)))) * (-591)) + i5) != 1 ? ThreeDS2Service(objArr) : ThreeDS2ServiceInstance(objArr);
        }

        public static /* synthetic */ String ThreeDS2Service(setPopupTheme setpopuptheme) {
            return (String) ThreeDS2Service(new Object[]{setpopuptheme}, -1567927163, 1567927163, (int) System.currentTimeMillis());
        }
    }
}
