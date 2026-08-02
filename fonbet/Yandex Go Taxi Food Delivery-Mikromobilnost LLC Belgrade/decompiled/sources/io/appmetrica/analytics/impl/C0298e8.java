package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0298e8 {
    public final Context a;
    public final int b;
    public final as c;
    public final N9 d;
    public final C0579o0 e;
    public final Y9 f;
    public final C0385h8 g;
    public final K6 h;

    public C0298e8(Context context, C0661qo c0661qo, int i, as asVar, N9 n9, C0579o0 c0579o0, Y9 y9, C0385h8 c0385h8) {
        this.a = context;
        this.b = i;
        this.c = asVar;
        this.d = n9;
        this.e = c0579o0;
        this.f = y9;
        this.g = c0385h8;
        this.h = n9.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0183a8 a() {
        ms msVar;
        Integer valueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        Long valueOf2 = Long.valueOf(this.c.a(this.b));
        C0385h8 c0385h8 = this.g;
        c0385h8.getClass();
        Ad m = Jb.I.m();
        Location userLocation = m.getUserLocation();
        if (userLocation != null) {
            int i = ms.b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            msVar = new ms(location, provider);
        } else {
            Location systemLocation = m.getSystemLocation();
            msVar = systemLocation != null ? new ms(new Location(systemLocation), "") : null;
        }
        boolean z = c0385h8.a.d;
        Double valueOf3 = msVar != null ? Double.valueOf(msVar.getLatitude()) : null;
        Double valueOf4 = msVar != null ? Double.valueOf(msVar.getLongitude()) : null;
        Long valueOf5 = msVar != null ? Long.valueOf(msVar.getTime()) : null;
        Integer valueOf6 = msVar != null ? Integer.valueOf((int) msVar.getAccuracy()) : null;
        Integer valueOf7 = msVar != null ? Integer.valueOf((int) msVar.getBearing()) : null;
        Integer valueOf8 = msVar != null ? Integer.valueOf((int) msVar.getSpeed()) : null;
        C0327f8 c0327f8 = new C0327f8(Boolean.valueOf(z), valueOf4, valueOf3, msVar != null ? Integer.valueOf((int) msVar.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, msVar != null ? msVar.getProvider() : null, msVar != null ? msVar.a : null);
        String str = this.h.c;
        C0579o0 c0579o0 = this.e;
        String str2 = c0579o0.a;
        Long valueOf9 = Long.valueOf(c0579o0.b);
        Integer valueOf10 = Integer.valueOf(this.h.g);
        Context context = this.a;
        C0625ph c0625ph = AbstractC0740th.a;
        Integer num = (Integer) AbstractC0740th.c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new C0711sh()));
        num.intValue();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Kq C = Jb.I.C();
        C0270d8 c0270d8 = new C0270d8(ref$ObjectRef);
        synchronized (C) {
            C.b.a(c0270d8);
        }
        String str3 = (String) ref$ObjectRef.element;
        X9 x9 = this.d.b;
        K6 k6 = this.h;
        return new C0183a8(valueOf, name, value, valueOf2, c0327f8, str, str2, valueOf9, valueOf10, num, str3, x9, k6.h, k6.k, k6.l, k6.n, k6.o, this.f.fromModel(k6.p));
    }

    public /* synthetic */ C0298e8(Context context, C0661qo c0661qo, int i, as asVar, N9 n9, Xj xj, C0579o0 c0579o0) {
        this(context, c0661qo, i, asVar, n9, c0579o0, new Y9(), new C0385h8(xj));
    }
}
