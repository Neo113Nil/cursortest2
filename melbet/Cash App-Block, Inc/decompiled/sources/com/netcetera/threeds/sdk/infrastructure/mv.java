package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class mv {
    private static int getWarnings = 1;
    private static int initialize;

    public interface initialize<T> {
        boolean ThreeDS2ServiceInstance(T t);
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        Collection collection = (Collection) objArr[0];
        initialize initializeVar = (initialize) objArr[1];
        int i = getWarnings;
        int i2 = i & 23;
        int i3 = -(-((i ^ 23) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            collection.iterator();
            throw null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int i5 = getWarnings;
            int i6 = ((i5 & 30) + (i5 | 30)) - 1;
            initialize = i6 % 128;
            if (i6 % 2 != 0) {
                initializeVar.ThreeDS2ServiceInstance(it.next());
                throw null;
            }
            if (!initializeVar.ThreeDS2ServiceInstance(it.next())) {
                it.remove();
                int i7 = initialize;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m(i7 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (i7 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1, -1, 128);
            }
        }
        int i8 = initialize;
        int i9 = i8 ^ 97;
        int i10 = ((i8 & 97) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        getWarnings = i12 % 128;
        if (i12 % 2 != 0) {
            return collection;
        }
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-864)) + (i * 866);
        int i5 = ~i2;
        int i6 = ~i;
        int i7 = ~i3;
        if ((((~(i | i7)) | (~(i5 | i7))) * 865) + ((~(i3 | i)) * 865) + (((~(i6 | i7)) | i5) * (-865)) + i4 == 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        Collection collection = (Collection) objArr[0];
        List list = (List) ((Collection) getWarnings(new Object[]{new ArrayList(collection), (initialize) objArr[1]}, 1719949542, -1719949541, (int) System.currentTimeMillis()));
        int i8 = initialize;
        int i9 = i8 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i10 = i8 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i11 = (i9 | i10) << 1;
        int i12 = -((i8 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i10));
        getWarnings = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
        return list;
    }

    public static <T> List<T> ThreeDS2ServiceInstance(Collection<T> collection, initialize<T> initializeVar) {
        return (List) getWarnings(new Object[]{collection, initializeVar}, -1875516693, 1875516693, (int) System.currentTimeMillis());
    }
}
