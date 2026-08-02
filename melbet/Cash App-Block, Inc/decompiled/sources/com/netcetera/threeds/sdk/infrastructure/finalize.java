package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class finalize {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        Object obj;
        int i;
        Class cls = (Class) objArr[0];
        String str = (String) objArr[1];
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 9;
        get = (((~i3) & (i2 | 9)) + (i3 << 1)) % 128;
        if (str == null) {
            get = Thread$State$EnumUnboxingLocalUtility.m(i2 & 34, i2 | 34, 1, 128);
            return null;
        }
        Object[] objArr2 = (Enum[]) cls.getEnumConstants();
        int length = objArr2.length - 1;
        int i4 = get;
        int i5 = i4 & 115;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i5, ~(-(-((i4 ^ 115) | i5))), 1, 128);
        while (length >= 0) {
            int i6 = ThreeDS2ServiceInstance;
            int i7 = ((i6 | 101) << 1) - (i6 ^ 101);
            get = i7 % 128;
            if (i7 % 2 != 0) {
                obj = objArr2[length];
                int i8 = 45 / 0;
                if (ne.getWarnings(str, ((notify) obj).getWarnings())) {
                    int i9 = ThreeDS2ServiceInstance;
                    int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i9 | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) << 1, i9 ^ EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 1, 128);
                    get = m$1;
                    i = m$1 + 27;
                    ThreeDS2ServiceInstance = i % 128;
                    if (i % 2 == 0) {
                        return obj;
                    }
                    throw null;
                }
                length--;
                int i10 = ThreeDS2ServiceInstance + 36;
                get = ((i10 ^ (-1)) + (i10 << 1)) % 128;
            } else {
                obj = objArr2[length];
                if (ne.getWarnings(str, ((notify) obj).getWarnings())) {
                    int i92 = ThreeDS2ServiceInstance;
                    int m$12 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i92 | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) << 1, i92 ^ EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 1, 128);
                    get = m$12;
                    i = m$12 + 27;
                    ThreeDS2ServiceInstance = i % 128;
                    if (i % 2 == 0) {
                    }
                } else {
                    length--;
                    int i102 = ThreeDS2ServiceInstance + 36;
                    get = ((i102 ^ (-1)) + (i102 << 1)) % 128;
                }
            }
        }
        int i11 = ThreeDS2ServiceInstance;
        int i12 = ((i11 ^ 69) | (i11 & 69)) << 1;
        int i13 = -(((~i11) & 69) | (i11 & (-70)));
        int i14 = (i12 & i13) + (i13 | i12);
        get = i14 % 128;
        if (i14 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/netcetera/threeds/sdk/infrastructure/notify;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)TT; */
    public static Enum initialize(Class cls, String str) {
        return (Enum) initialize(new Object[]{cls, str}, -1922987640, 1922987640, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }
}
