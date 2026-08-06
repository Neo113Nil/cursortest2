package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6120b;

    /* renamed from: c, reason: collision with root package name */
    public final C0883xo f6121c;

    /* renamed from: d, reason: collision with root package name */
    public final C0919z8 f6122d;

    /* renamed from: e, reason: collision with root package name */
    public final C0471i0 f6123e;

    /* renamed from: f, reason: collision with root package name */
    public final J8 f6124f;

    /* renamed from: g, reason: collision with root package name */
    public final C0529k7 f6125g;

    /* renamed from: h, reason: collision with root package name */
    public final P5 f6126h;

    public C0452h7(Context context, Tk tk, int i2, C0883xo c0883xo, C0919z8 c0919z8, C0471i0 c0471i0, J8 j8, C0529k7 c0529k7) {
        this.f6119a = context;
        this.f6120b = i2;
        this.f6121c = c0883xo;
        this.f6122d = c0919z8;
        this.f6123e = c0471i0;
        this.f6124f = j8;
        this.f6125g = c0529k7;
        this.f6126h = c0919z8.f7268a;
    }

    public static String b() {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        C0649on C2 = C0610na.f6575I.C();
        C0426g7 c0426g7 = new C0426g7(pVar);
        synchronized (C2) {
            C2.f6697b.a(c0426g7);
        }
        return (String) pVar.f8076a;
    }

    public final C0349d7 a() {
        long optLong;
        Io io2;
        Integer valueOf = Integer.valueOf(this.f6126h.f4908e);
        String name = this.f6126h.getName();
        String value = this.f6126h.getValue();
        C0883xo c0883xo = this.f6121c;
        int i2 = this.f6120b;
        synchronized (c0883xo) {
            try {
                JSONObject a2 = c0883xo.f7214a.a();
                JSONObject optJSONObject = a2.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optLong = optJSONObject.optLong(String.valueOf(i2));
                optJSONObject.put(String.valueOf(i2), 1 + optLong);
                c0883xo.f7214a.a(a2.put("numbers_of_type", optJSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
        Long valueOf2 = Long.valueOf(optLong);
        C0529k7 c0529k7 = this.f6125g;
        c0529k7.getClass();
        Kb m2 = C0610na.f6575I.m();
        Location userLocation = m2.getUserLocation();
        if (userLocation != null) {
            int i3 = Io.f4555b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            io2 = new Io(location, provider);
        } else {
            Location systemLocation = m2.getSystemLocation();
            io2 = systemLocation != null ? new Io(new Location(systemLocation), "") : null;
        }
        boolean z2 = c0529k7.f6351a.f6375d;
        Double valueOf3 = io2 != null ? Double.valueOf(io2.getLatitude()) : null;
        Double valueOf4 = io2 != null ? Double.valueOf(io2.getLongitude()) : null;
        Long valueOf5 = io2 != null ? Long.valueOf(io2.getTime()) : null;
        Integer valueOf6 = io2 != null ? Integer.valueOf((int) io2.getAccuracy()) : null;
        Integer valueOf7 = io2 != null ? Integer.valueOf((int) io2.getBearing()) : null;
        Integer valueOf8 = io2 != null ? Integer.valueOf((int) io2.getSpeed()) : null;
        C0478i7 c0478i7 = new C0478i7(Boolean.valueOf(z2), valueOf4, valueOf3, io2 != null ? Integer.valueOf((int) io2.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, io2 != null ? io2.getProvider() : null, io2 != null ? io2.f4556a : null);
        String str = this.f6126h.f4906c;
        C0471i0 c0471i0 = this.f6123e;
        String str2 = c0471i0.f6158a;
        Long valueOf9 = Long.valueOf(c0471i0.f6159b);
        Integer valueOf10 = Integer.valueOf(this.f6126h.f4910g);
        Context context = this.f6119a;
        Ce ce = Ge.f4420a;
        Integer num = (Integer) Ge.f4422c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
        num.intValue();
        String b2 = b();
        I8 i8 = this.f6122d.f7269b;
        P5 p5 = this.f6126h;
        return new C0349d7(valueOf, name, value, valueOf2, c0478i7, str, str2, valueOf9, valueOf10, num, b2, i8, p5.f4911h, p5.f4914k, p5.f4915l, p5.f4917n, p5.f4918o, this.f6124f.fromModel(p5.f4919p));
    }

    public /* synthetic */ C0452h7(Context context, Tk tk, int i2, C0883xo c0883xo, C0919z8 c0919z8, C0539kh c0539kh, C0471i0 c0471i0) {
        this(context, tk, i2, c0883xo, c0919z8, c0471i0, new J8(), new C0529k7(c0539kh));
    }
}
