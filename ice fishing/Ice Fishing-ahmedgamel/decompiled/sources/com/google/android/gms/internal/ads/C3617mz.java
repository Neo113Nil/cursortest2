package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3617mz extends AbstractC3833qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33413f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f33414g;

    public C3617mz(C4002u6 c4002u6, C3241fz c3241fz, C2972ay c2972ay, C4006uA c4006uA) {
        super("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", c4002u6, c3241fz, c4006uA.a(116));
        this.f33414g = c2972ay;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3833qz
    public final void a(Method method, C4002u6 c4002u6) {
        switch (this.f33413f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((C2972ay) this.f33414g).R());
                objArr.getClass();
                synchronized (c4002u6) {
                    String str = (String) objArr[0];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).F0(str);
                    String str2 = (String) objArr[1];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).l0(str2);
                }
                return;
            default:
                Map map = (Map) this.f33414g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (c4002u6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).J0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    if (longValue2 >= 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).h0(longValue2);
                    }
                    long longValue3 = ((Long) objArr2[2]).longValue();
                    if (longValue3 >= 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).i0(longValue3);
                    }
                }
                return;
        }
    }

    public C3617mz(C4002u6 c4002u6, C3241fz c3241fz, Map map, C4006uA c4006uA) {
        super("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", c4002u6, c3241fz, c4006uA.a(118));
        this.f33414g = map;
    }
}
