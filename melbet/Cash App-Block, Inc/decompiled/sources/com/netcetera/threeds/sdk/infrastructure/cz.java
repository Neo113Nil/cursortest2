package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public abstract class cz extends da {
    private static int get = 0;
    private static int initialize = 1;

    public cz(Context context, ju juVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
    }

    public void ThreeDS2Service(Context context, propertyNames propertynames) {
        jr ThreeDS2Service = initialize().ThreeDS2Service();
        bp bpVar = new bp(context, ThreeDS2Service);
        getWarnings((computeIfPresent) bpVar);
        al alVar = new al(context, ThreeDS2Service);
        getWarnings((computeIfPresent) alVar);
        getWarnings((bm) bm.ThreeDS2Service(new Object[]{context, propertynames, bpVar, alVar, aq.ThreeDS2ServiceInstance(context, ((da) this).ThreeDS2ServiceInstance.ThreeDS2Service(), ((da) this).getWarnings), aq.get(context, ((da) this).ThreeDS2ServiceInstance.ThreeDS2Service(), ((da) this).getWarnings)}, 589595032, -589595031, (int) System.currentTimeMillis()));
        int i = get + 45;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    public contains ThreeDS2ServiceInitializationCallback(Context context) {
        contains containsVar = contains.get(context, initialize());
        containsVar.getWarnings(new dc(this));
        int i = initialize;
        int i2 = ((i & 111) - (~(-(-(i | 111))))) - 1;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return containsVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public void getWarnings(Context context) {
        int i = get;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        initialize = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        initialize(context);
        get(context);
        ThreeDS2Service(context);
        int i4 = initialize;
        int i5 = ((i4 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i4 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        cz czVar = (cz) objArr[0];
        czVar.ThreeDS2Service(new ca(initCause.get));
        int i4 = get;
        int i5 = i4 & 19;
        int i6 = -(-(i4 | 19));
        initialize = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return null;
    }
}
