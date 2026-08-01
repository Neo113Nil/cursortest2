package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3594mz extends AbstractC3810qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32635f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f32636g;

    public C3594mz(C3979u6 c3979u6, C3218fz c3218fz, C2949ay c2949ay, C3983uA c3983uA) {
        super("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", c3979u6, c3218fz, c3983uA.a(116));
        this.f32636g = c2949ay;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        switch (this.f32635f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((C2949ay) this.f32636g).R());
                objArr.getClass();
                synchronized (c3979u6) {
                    String str = (String) objArr[0];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).F0(str);
                    String str2 = (String) objArr[1];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).l0(str2);
                }
                return;
            default:
                Map map = (Map) this.f32636g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (c3979u6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).J0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    if (longValue2 >= 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).h0(longValue2);
                    }
                    long longValue3 = ((Long) objArr2[2]).longValue();
                    if (longValue3 >= 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).i0(longValue3);
                    }
                }
                return;
        }
    }

    public C3594mz(C3979u6 c3979u6, C3218fz c3218fz, Map map, C3983uA c3983uA) {
        super("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", c3979u6, c3218fz, c3983uA.a(118));
        this.f32636g = map;
    }
}
