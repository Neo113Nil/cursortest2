package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852Xd extends S0.s {

    /* renamed from: A, reason: collision with root package name */
    public final long f28536A;

    /* renamed from: B, reason: collision with root package name */
    public final String f28537B;

    /* renamed from: C, reason: collision with root package name */
    public final String f28538C;

    /* renamed from: w, reason: collision with root package name */
    public final Map f28539w;

    /* renamed from: x, reason: collision with root package name */
    public final Activity f28540x;

    /* renamed from: y, reason: collision with root package name */
    public final String f28541y;

    /* renamed from: z, reason: collision with root package name */
    public final long f28542z;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2852Xd(InterfaceC4061vh interfaceC4061vh, Map map) {
        super(11, interfaceC4061vh, "createCalendarEvent");
        long parseLong;
        String str;
        this.f28539w = map;
        this.f28540x = interfaceC4061vh.j();
        this.f28541y = C("description");
        this.f28537B = C("summary");
        String str2 = (String) map.get("start_ticks");
        long j6 = -1;
        if (str2 != null) {
            try {
                parseLong = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
            this.f28542z = parseLong;
            str = (String) this.f28539w.get("end_ticks");
            if (str != null) {
                try {
                    j6 = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.f28536A = j6;
            this.f28538C = C("location");
        }
        parseLong = -1;
        this.f28542z = parseLong;
        str = (String) this.f28539w.get("end_ticks");
        if (str != null) {
        }
        this.f28536A = j6;
        this.f28538C = C("location");
    }

    public final String C(String str) {
        Map map = this.f28539w;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
