package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;

/* loaded from: classes5.dex */
public class dq extends cz {
    private static int createTransaction = 1;
    private static int get;
    private final setShadowLayer initialize;

    public dq(Context context, ju juVar, fq fqVar, fw fwVar, setShadowLayer setshadowlayer, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
        this.initialize = setshadowlayer;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        dq dqVar = (dq) objArr[0];
        int i = get;
        int i2 = (i & 115) + (i | 115);
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            get(new Object[]{dqVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, -772086648, 772086652, System.identityHashCode(dqVar));
            throw null;
        }
        get(new Object[]{dqVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, -772086648, 772086652, System.identityHashCode(dqVar));
        int i3 = createTransaction;
        get = ((i3 ^ 51) + ((i3 & 51) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        dq dqVar = (dq) objArr[0];
        int i = createTransaction;
        int i2 = (i ^ 65) + ((i & 65) << 1);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            get(new Object[]{dqVar, ev.ThreeDS2ServiceInstance.getWarnings.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, -772086648, 772086652, System.identityHashCode(dqVar));
            throw null;
        }
        get(new Object[]{dqVar, ev.ThreeDS2ServiceInstance.getWarnings.ThreeDS2Service(), ev.ThreeDS2Service.ThreeDS2Service.initialize()}, -772086648, 772086652, System.identityHashCode(dqVar));
        int i3 = get;
        int i4 = (i3 & (-100)) | ((~i3) & 99);
        int i5 = (i3 & 99) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        createTransaction = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        dq dqVar = (dq) objArr[0];
        System.identityHashCode(dqVar);
        System.identityHashCode(dqVar);
        get(new Object[]{dqVar, ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service(), ev.ThreeDS2Service.initialize.initialize()}, -772086648, 772086652, System.identityHashCode(dqVar));
        int i = createTransaction;
        int i2 = i ^ 67;
        int i3 = -(-((i & 67) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        Context context = (Context) objArr[0];
        ju juVar = (ju) objArr[1];
        dq dqVar = new dq(context, juVar, (fq) objArr[3], (fw) objArr[4], (setShadowLayer) objArr[5], (fv) objArr[6]);
        int i = createTransaction;
        int i2 = (i & 111) + (i | 111);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return dqVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        contains warnings = contains.getWarnings(context, initialize());
        warnings.getWarnings(new Cdo(this));
        contains containsVar = (contains) contains.getWarnings(new Object[]{context, initialize()}, -1745958251, 1745958252, (int) System.currentTimeMillis());
        containsVar.getWarnings(new dr(this, context));
        be beVar = new be(new ds(this), context);
        ThreeDS2Service(context, (propertyNames) propertyNames.get(new Object[]{context, new contains[]{containsVar, warnings, ThreeDS2ServiceInitializationCallback(context)}}, -435122388, 435122389, (int) System.currentTimeMillis()));
        getWarnings(beVar);
        int i = get;
        int i2 = i ^ 67;
        int i3 = (i & 67) << 1;
        createTransaction = ((i2 & i3) + (i3 | i2)) % 128;
    }

    public static remove getWarnings(Context context, ju juVar, setMaxLines setmaxlines, fq fqVar, fw fwVar, setShadowLayer setshadowlayer, fv fvVar) {
        return (remove) get(new Object[]{context, juVar, setmaxlines, fqVar, fwVar, setshadowlayer, fvVar}, 383180608, -383180605, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        int i7 = i6 * 446;
        int i8 = i7 + (((~(i | i5 | i3)) | (~(i2 | i4))) * 446) + (((~((~i3) | i5)) | i6) * 446) + (i2 * (-445)) + (i * (-445));
        if (i8 == 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        if (i8 == 2) {
            return get(objArr);
        }
        if (i8 == 3) {
            return initialize(objArr);
        }
        if (i8 == 4) {
            return ThreeDS2Service(objArr);
        }
        if (i8 != 5) {
            dq dqVar = (dq) objArr[0];
            Context context = (Context) objArr[1];
            dqVar.initialize.getWarnings(context, new dw(dqVar));
            int i9 = createTransaction;
            get = ((i9 & 115) + (i9 | 115)) % 128;
            return null;
        }
        return getWarnings(objArr);
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        ((dq) objArr[0]).ThreeDS2Service(new dg(setCacheColorHint.getWarnings.get, (String) objArr[1], (String) objArr[2]));
        int i = get;
        int i2 = i & 33;
        int i3 = ((i | 33) & (~i2)) + (i2 << 1);
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return null;
    }
}
