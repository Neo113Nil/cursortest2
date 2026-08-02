package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class dd extends da {
    private static int get = 1;
    private static int initialize;

    public dd(Context context, ju juVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        dd ddVar = (dd) objArr[0];
        Context context = (Context) objArr[1];
        ddVar.getWarnings(new ah(context));
        ddVar.getWarnings(aq.ThreeDS2ServiceInstance(context, ((da) ddVar).ThreeDS2ServiceInstance.ThreeDS2Service(), ((da) ddVar).getWarnings));
        ddVar.getWarnings(aq.get(context, ((da) ddVar).ThreeDS2ServiceInstance.ThreeDS2Service(), ((da) ddVar).getWarnings));
        int i4 = get;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i4 ^ 9, ~(-(-((i4 & 9) << 1))), 1, 128);
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public void getWarnings(Context context) {
        int i = initialize;
        int i2 = (i | 61) << 1;
        int i3 = -(((~i) & 61) | (i & (-62)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            initialize(context);
            get(context);
            ThreeDS2Service(context);
            get(new Object[]{this, context}, -1761630329, 1761630329, System.identityHashCode(this));
            return;
        }
        initialize(context);
        get(context);
        ThreeDS2Service(context);
        get(new Object[]{this, context}, -1761630329, 1761630329, System.identityHashCode(this));
        throw null;
    }
}
