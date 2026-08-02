package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class ag extends ae {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;

    public ag(Context context, jr jrVar, ai aiVar, isEmpty isempty) {
        super(context, jrVar, aiVar, isempty);
    }

    public static ae ThreeDS2ServiceInstance(Context context, jr jrVar, isEmpty isempty) {
        return (ae) get(new Object[]{context, jrVar, isempty}, 639389211, -639389211, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        ag agVar = new ag((Context) objArr[0], (jr) objArr[1], new ai(), (isEmpty) objArr[2]);
        ThreeDS2Service = (getWarnings + 67) % 128;
        return agVar;
    }
}
