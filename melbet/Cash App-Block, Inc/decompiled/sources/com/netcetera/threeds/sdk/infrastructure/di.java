package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class di extends dd {
    private static int get = 1;
    private static int initialize;

    public di(Context context, ju juVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context, juVar, fqVar, fwVar, fvVar);
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        di diVar = (di) objArr[0];
        int i = get;
        int i2 = ((i ^ 120) + ((i & 120) << 1)) - 1;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            getWarnings(new Object[]{diVar, ev.initialize.ThreeDS2ServiceInstance.initialize()}, -150695531, 150695532, System.identityHashCode(diVar));
            return null;
        }
        getWarnings(new Object[]{diVar, ev.initialize.ThreeDS2ServiceInstance.initialize()}, -150695531, 150695532, System.identityHashCode(diVar));
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        Context context = (Context) objArr[0];
        ju juVar = (ju) objArr[1];
        fq fqVar = (fq) objArr[3];
        fw fwVar = (fw) objArr[4];
        di diVar = new di(context, juVar, fqVar, fwVar, (fv) objArr[6]);
        int i = get;
        int i2 = (i | 75) << 1;
        int i3 = -(((~i) & 75) | (i & (-76)));
        int i4 = (i2 & i3) + (i3 | i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return diVar;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = ~(i6 | i2);
        int i8 = ~i2;
        int i9 = i5 | i8;
        int i10 = ((i | i2) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~i9) | (~(i4 | i8)) | (~i6)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + ((i7 | (~(i9 | i))) * (-184)) + (i2 * (-183)) + (i * (-183));
        if (i10 != 1) {
            return i10 != 2 ? get(objArr) : ThreeDS2ServiceInstance(objArr);
        }
        ((di) objArr[0]).ThreeDS2Service(new dg(setCacheColorHint.getWarnings.getWarnings, (String) objArr[1]));
        int i11 = initialize;
        int i12 = i11 & 35;
        int i13 = -(-((i11 ^ 35) | i12));
        get = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.da
    public void ThreeDS2Service(Context context) {
        contains warnings = contains.getWarnings(context, initialize());
        warnings.getWarnings(new dl(this));
        getWarnings((propertyNames) propertyNames.get(new Object[]{context, new contains[]{warnings}}, -435122388, 435122389, (int) System.currentTimeMillis()));
        int i = initialize;
        int i2 = i & 15;
        int i3 = (i | 15) & (~i2);
        int i4 = i2 << 1;
        get = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
    }

    public static remove ThreeDS2Service(Context context, ju juVar, setMaxLines setmaxlines, fq fqVar, fw fwVar, setShadowLayer setshadowlayer, fv fvVar) {
        return (remove) getWarnings(new Object[]{context, juVar, setmaxlines, fqVar, fwVar, setshadowlayer, fvVar}, -918292341, 918292341, (int) System.currentTimeMillis());
    }
}
