package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public class an extends loadFromXML<LinearLayout> implements containsValue, getServices {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final aj ThreeDS2ServiceInstance;
    private final aj getWarnings;

    private an(Context context, jr jrVar, jq jqVar) {
        this(context, aj.ThreeDS2ServiceInstance(context, jrVar, jqVar), aj.initialize(context, jrVar, jqVar));
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        an anVar = new an((Context) objArr[0], (jr) objArr[1], (jq) objArr[2]);
        int i = get;
        int i2 = i & 77;
        int i3 = (i2 - (~((i ^ 77) | i2))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            return anVar;
        }
        throw null;
    }

    public static an initialize(Context context, jr jrVar, jq jqVar) {
        return (an) ThreeDS2Service(new Object[]{context, jrVar, jqVar}, -1112037314, 1112037314, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = ThreeDS2Service;
        get = ((i & 105) + (i | 105)) % 128;
        this.ThreeDS2ServiceInstance.ThreeDS2Service(setscroller);
        this.getWarnings.ThreeDS2Service(setscroller);
        int i2 = get;
        int i3 = (i2 & 2) + (i2 | 2);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public LinearLayout aw_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = es.getSDKVersion;
        layoutParams.setMargins(i, es.ThreeDS2Service, i, es.initialize);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.ThreeDS2ServiceInstance.ThreeDS2Service());
        linearLayout.addView(this.getWarnings.ThreeDS2Service());
        int i2 = ThreeDS2Service;
        int i3 = i2 & 17;
        get = (((i2 | 17) & (~i3)) + (i3 << 1)) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        int i = get;
        int i2 = i & 117;
        int i3 = i | 117;
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        aj ajVar = this.ThreeDS2ServiceInstance;
        if (i5 == 0) {
            ajVar.getWarnings(eqVar);
            this.getWarnings.getWarnings(eqVar);
            int i6 = 58 / 0;
        } else {
            ajVar.getWarnings(eqVar);
            this.getWarnings.getWarnings(eqVar);
        }
        int i7 = ThreeDS2Service + 39;
        get = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 95 / 0;
        }
    }

    public an(Context context, aj ajVar, aj ajVar2) {
        super(context);
        this.ThreeDS2ServiceInstance = ajVar;
        this.getWarnings = ajVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = get;
        int i2 = ((i ^ 104) + ((i & 104) << 1)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return aw_(context);
        }
        aw_(context);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getServices
    public size ThreeDS2ServiceInstance() {
        ao aoVar = new ao(this.ThreeDS2ServiceInstance.getWarnings(), this.getWarnings.getWarnings());
        int i = get;
        int i2 = i & 59;
        int i3 = (i ^ 59) | i2;
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return aoVar;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        int i = ThreeDS2Service;
        int i2 = (((i ^ 109) | (i & 109)) << 1) - (((~i) & 109) | (i & (-110)));
        get = i2 % 128;
        int i3 = i2 % 2;
        aj ajVar = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            ajVar.getWarnings(erVar);
            this.getWarnings.getWarnings(erVar);
            int i4 = 15 / 0;
        } else {
            ajVar.getWarnings(erVar);
            this.getWarnings.getWarnings(erVar);
        }
    }
}
