package ru.yandex.video.m3.ott.data.dto;

import defpackage.e5b;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

/* loaded from: classes6.dex */
public final class c {
    public final String a;
    public String b;
    public Long c;
    public DrmProxy d;
    public String e;
    public String f;
    public Boolean g;
    public String h;
    public Boolean i;
    public String j;
    public String k;
    public String l;
    public Ott.TrackingData m;

    public c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final VhVideoData a() {
        Ott.TrackingData trackingData;
        Ott.TrackingData trackingData2 = this.m;
        if (trackingData2 == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            trackingData = new Ott.TrackingData(e5bVar, false, null, null, null, Ott.DeviceType.App);
        } else {
            trackingData = trackingData2;
        }
        String str = this.b;
        Long l = this.c;
        long longValue = l != null ? l.longValue() : -9223372036854775807L;
        DrmProxy drmProxy = this.d;
        String str2 = this.e;
        String str3 = this.f;
        Boolean bool = this.g;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str4 = this.h;
        Boolean bool2 = this.i;
        return new VhVideoData(this.a, str, longValue, drmProxy, str2, str3, booleanValue, str4, bool2 != null ? bool2.booleanValue() : false, this.j, this.k, this.l, trackingData, !trackingData.getTrackings().isEmpty(), null);
    }
}
