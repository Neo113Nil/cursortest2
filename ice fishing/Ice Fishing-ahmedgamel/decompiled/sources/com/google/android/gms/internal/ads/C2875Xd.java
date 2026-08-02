package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2875Xd extends S0.s {

    /* renamed from: A, reason: collision with root package name */
    public final long f29308A;

    /* renamed from: B, reason: collision with root package name */
    public final String f29309B;

    /* renamed from: C, reason: collision with root package name */
    public final String f29310C;

    /* renamed from: w, reason: collision with root package name */
    public final Map f29311w;

    /* renamed from: x, reason: collision with root package name */
    public final Activity f29312x;

    /* renamed from: y, reason: collision with root package name */
    public final String f29313y;

    /* renamed from: z, reason: collision with root package name */
    public final long f29314z;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2875Xd(InterfaceC4084vh interfaceC4084vh, Map map) {
        super(13, interfaceC4084vh, "createCalendarEvent");
        long parseLong;
        String str;
        this.f29311w = map;
        this.f29312x = interfaceC4084vh.j();
        this.f29313y = B("description");
        this.f29309B = B("summary");
        String str2 = (String) map.get("start_ticks");
        long j6 = -1;
        if (str2 != null) {
            try {
                parseLong = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
            this.f29314z = parseLong;
            str = (String) this.f29311w.get("end_ticks");
            if (str != null) {
                try {
                    j6 = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.f29308A = j6;
            this.f29310C = B("location");
        }
        parseLong = -1;
        this.f29314z = parseLong;
        str = (String) this.f29311w.get("end_ticks");
        if (str != null) {
        }
        this.f29308A = j6;
        this.f29310C = B("location");
    }

    public final String B(String str) {
        Map map = this.f29311w;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
