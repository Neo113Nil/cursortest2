package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setPopupTheme;
import com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class setRawInputType implements setSearchResultHighlights {
    private static int getWarnings = 1;
    private static int initialize;
    private final int ThreeDS2Service;
    private final nn get;

    public setRawInputType(nn nnVar, int i) {
        this.get = nnVar;
        this.ThreeDS2Service = i;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setRawInputType setrawinputtype = new setRawInputType(new nn(), ((Integer) nj.ThreeDS2Service(new Object[0], 173048073, -173048073, (int) System.currentTimeMillis())).intValue());
        int i = getWarnings;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return setrawinputtype;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setRawInputType setrawinputtype = (setRawInputType) objArr[0];
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        int i = getWarnings;
        initialize = ((i ^ 5) + ((i & 5) << 1)) % 128;
        String str = (String) get(new Object[]{setrawinputtype, setpopuptheme}, -730255884, 730255888, System.identityHashCode(setrawinputtype));
        int i2 = initialize;
        int i3 = ((i2 ^ EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) + ((i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) << 1)) - 1;
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i4 | i5);
        int i7 = ~(i4 | i2);
        int i8 = (((~(i5 | i2)) | i6 | i7) * (-397)) + (i2 * (-396)) + (i * 398);
        int i9 = (((~(i | (~i2))) | i3 | i7) * 397) + (i7 * (-397)) + i8;
        if (i9 == 1) {
            return ThreeDS2Service(objArr);
        }
        if (i9 == 2) {
            return ThreeDS2ServiceInstance(objArr);
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return getWarnings(objArr);
            }
            setRawInputType setrawinputtype = (setRawInputType) objArr[0];
            String str = (String) objArr[1];
            int i10 = initialize;
            int i11 = i10 & 63;
            getWarnings = (i11 + ((i10 ^ 63) | i11)) % 128;
            String str2 = (String) get(new Object[]{setrawinputtype, str}, 390014187, -390014184, System.identityHashCode(setrawinputtype));
            int i12 = initialize;
            int i13 = (i12 | 89) << 1;
            int i14 = -(((~i12) & 89) | (i12 & (-90)));
            getWarnings = ((i13 & i14) + (i14 | i13)) % 128;
            return str2;
        }
        setRawInputType setrawinputtype2 = (setRawInputType) objArr[0];
        String str3 = (String) objArr[1];
        int i15 = getWarnings;
        initialize = ((i15 ^ 55) + ((i15 & 55) << 1)) % 128;
        if (oj.initialize(str3)) {
            int i16 = initialize;
            int i17 = i16 & 65;
            getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i17, ~((i16 ^ 65) | i17), 1, 128);
            str3 = setrawinputtype2.get.get(str3);
            int i18 = initialize;
            getWarnings = ((i18 ^ 41) + ((i18 & 41) << 1)) % 128;
        }
        int i19 = initialize;
        int i20 = i19 & 81;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i20, ~(-(-((i19 ^ 81) | i20))), 1, 128);
        return str3;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        setRawInputType setrawinputtype = (setRawInputType) objArr[0];
        setPopupTheme setpopuptheme = (setPopupTheme) objArr[1];
        int i = initialize;
        int i2 = i & 21;
        int i3 = i | 21;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (setpopuptheme == null || setpopuptheme.getWarnings() == null) {
            int i5 = getWarnings;
            initialize = ((((i5 | 44) << 1) - (i5 ^ 44)) - 1) % 128;
            return null;
        }
        setPopupTheme.initialize warnings = setpopuptheme.getWarnings();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(480, warnings.get());
        linkedHashMap.put(Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), warnings.ThreeDS2ServiceInstance());
        linkedHashMap.put(Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE), warnings.ThreeDS2Service());
        Iterator it = linkedHashMap.entrySet().iterator();
        int i6 = initialize;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i6 & 121, ~(-(-(i6 | 121))), 1, 128);
        String str = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i7 = initialize;
            getWarnings = ((i7 & 63) + (i7 | 63)) % 128;
            Map.Entry entry = (Map.Entry) it.next();
            if (str == null) {
                int i8 = initialize;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i8 ^ 59) | (i8 & 59)) << 1, ~(-(((~i8) & 59) | (i8 & (-60)))), 1, 128);
                str = (String) entry.getValue();
                int i9 = initialize;
                int i10 = i9 & 117;
                getWarnings = (i10 + ((i9 ^ 117) | i10)) % 128;
            } else {
                if (((Integer) entry.getKey()).intValue() >= setrawinputtype.ThreeDS2Service) {
                    int i11 = initialize;
                    int i12 = i11 ^ 125;
                    int i13 = (i11 & 125) << 1;
                    getWarnings = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                    if (entry.getValue() != null) {
                        int i14 = getWarnings;
                        int i15 = i14 & 47;
                        int i16 = (i14 | 47) & (~i15);
                        int i17 = i15 << 1;
                        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                        initialize = i18 % 128;
                        if (i18 % 2 != 0) {
                            throw null;
                        }
                        str = (String) entry.getValue();
                        int i19 = getWarnings;
                        int i20 = (i19 & (-40)) | ((~i19) & 39);
                        int i21 = -(-((i19 & 39) << 1));
                        initialize = ((i20 & i21) + (i21 | i20)) % 128;
                    }
                }
                if (setrawinputtype.ThreeDS2Service > ((Integer) entry.getKey()).intValue()) {
                    int i22 = initialize;
                    int i23 = ((i22 ^ 89) | (i22 & 89)) << 1;
                    int i24 = -(((~i22) & 89) | (i22 & (-90)));
                    getWarnings = ((i23 & i24) + (i24 | i23)) % 128;
                    break;
                }
                int i25 = initialize;
                int i26 = i25 & 105;
                int i27 = -(-(i25 | 105));
                getWarnings = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
            }
        }
        int i28 = getWarnings + 8;
        initialize = ((i28 ^ (-1)) + (i28 << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights
    public setSearchResultHighlights.getWarnings ThreeDS2Service(final setPopupTheme setpopuptheme) {
        setSearchResultHighlights.getWarnings getwarnings = new setSearchResultHighlights.getWarnings() { // from class: com.netcetera.threeds.sdk.infrastructure.setRawInputType.2
            private static int ThreeDS2Service = 0;
            private static int getWarnings = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights.getWarnings
            public String ThreeDS2Service() {
                int i = getWarnings;
                int i2 = i & 59;
                ThreeDS2Service = (((i | 59) & (~i2)) + (i2 << 1)) % 128;
                String str = (String) setRawInputType.get(new Object[]{setRawInputType.this, (String) setRawInputType.get(new Object[]{setRawInputType.this, setpopuptheme}, -2033764224, 2033764226, (int) System.currentTimeMillis())}, 663918708, -663918708, (int) System.currentTimeMillis());
                int i3 = getWarnings;
                int i4 = i3 & 85;
                int i5 = (i4 - (~(-(-((i3 ^ 85) | i4))))) - 1;
                ThreeDS2Service = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return str;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights.getWarnings
            public String get() {
                int i = getWarnings;
                int i2 = (i ^ 117) + ((i & 117) << 1);
                ThreeDS2Service = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        };
        int i = initialize;
        int i2 = i & 125;
        getWarnings = (i2 + ((i ^ 125) | i2)) % 128;
        return getwarnings;
    }

    public static setSearchResultHighlights get() {
        return (setSearchResultHighlights) get(new Object[0], -1598925348, 1598925349, (int) System.currentTimeMillis());
    }
}
