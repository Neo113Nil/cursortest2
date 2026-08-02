package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import defpackage.xqn;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0109a8 {
    public final Context a;
    public final int b;
    public final Hr c;
    public final H9 d;
    public final C0447m0 e;
    public final R9 f;
    public final C0196d8 g;
    public final H6 h;

    public C0109a8(Context context, Vn vn, int i, Hr hr, H9 h9, C0447m0 c0447m0, R9 r9, C0196d8 c0196d8) {
        this.a = context;
        this.b = i;
        this.c = hr;
        this.d = h9;
        this.e = c0447m0;
        this.f = r9;
        this.g = c0196d8;
        this.h = h9.a;
    }

    public final W7 a() {
        Sr sr;
        Integer valueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        Long valueOf2 = Long.valueOf(this.c.a(this.b));
        C0196d8 c0196d8 = this.g;
        c0196d8.getClass();
        InterfaceC0402kd m = C0747wb.I.m();
        Location userLocation = m.getUserLocation();
        if (userLocation != null) {
            int i = Sr.b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            sr = new Sr(location, provider);
        } else {
            Location systemLocation = m.getSystemLocation();
            sr = systemLocation != null ? new Sr(new Location(systemLocation), "") : null;
        }
        boolean z = c0196d8.a.d;
        Double valueOf3 = sr != null ? Double.valueOf(sr.getLatitude()) : null;
        Double valueOf4 = sr != null ? Double.valueOf(sr.getLongitude()) : null;
        Long valueOf5 = sr != null ? Long.valueOf(sr.getTime()) : null;
        Integer valueOf6 = sr != null ? Integer.valueOf((int) sr.getAccuracy()) : null;
        Integer valueOf7 = sr != null ? Integer.valueOf((int) sr.getBearing()) : null;
        Integer valueOf8 = sr != null ? Integer.valueOf((int) sr.getSpeed()) : null;
        C0138b8 c0138b8 = new C0138b8(Boolean.valueOf(z), valueOf4, valueOf3, sr != null ? Integer.valueOf((int) sr.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, sr != null ? sr.getProvider() : null, sr != null ? sr.a : null);
        String str = this.h.c;
        C0447m0 c0447m0 = this.e;
        String str2 = c0447m0.a;
        Long valueOf9 = Long.valueOf(c0447m0.b);
        Integer valueOf10 = Integer.valueOf(this.h.g);
        Context context = this.a;
        Zg zg = AbstractC0205dh.a;
        Integer num = (Integer) AbstractC0205dh.c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new C0176ch()));
        num.intValue();
        xqn xqnVar = new xqn();
        C0675tq C = C0747wb.I.C();
        Z7 z7 = new Z7(xqnVar);
        synchronized (C) {
            C.b.a(z7);
        }
        String str3 = (String) xqnVar.a;
        Q9 q9 = this.d.b;
        H6 h6 = this.h;
        return new W7(valueOf, name, value, valueOf2, c0138b8, str, str2, valueOf9, valueOf10, num, str3, q9, h6.h, h6.k, h6.l, h6.n, h6.o, this.f.fromModel(h6.p));
    }

    public /* synthetic */ C0109a8(Context context, Vn vn, int i, Hr hr, H9 h9, Nj nj, C0447m0 c0447m0) {
        this(context, vn, i, hr, h9, c0447m0, new R9(), new C0196d8(nj));
    }
}
