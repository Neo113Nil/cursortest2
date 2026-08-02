package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import n0.C4763d;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712Ni {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27294a;

    /* renamed from: b, reason: collision with root package name */
    public final C5140B f27295b;

    /* renamed from: c, reason: collision with root package name */
    public final C3286gq f27296c;

    /* renamed from: d, reason: collision with root package name */
    public final C2700Mn f27297d;

    /* renamed from: e, reason: collision with root package name */
    public final C3383ig f27298e;

    /* renamed from: f, reason: collision with root package name */
    public final RD f27299f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f27300g;

    public C2712Ni(Context context, C5140B c5140b, C3286gq c3286gq, C2700Mn c2700Mn, C3383ig c3383ig, RD rd, ScheduledExecutorService scheduledExecutorService) {
        this.f27294a = context;
        this.f27295b = c5140b;
        this.f27296c = c3286gq;
        this.f27297d = c2700Mn;
        this.f27298e = c3383ig;
        this.f27299f = rd;
        this.f27300g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cb));
    }

    public final P3.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? QC.c(str) : QC.r(c(str, this.f27297d.f27117a, random), Throwable.class, new C3164ec(this, str, 1), this.f27298e);
    }

    public final P3.a c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        P3.a k9;
        try {
            C3324ha c3324ha = AbstractC3592ma.Cb;
            s2.r rVar = s2.r.f40506e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
            try {
                if (!str.contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)) || this.f27295b.t()) {
                    return QC.c(str);
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.Db), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (motionEvent == null) {
                    try {
                        buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.Eb), "11");
                        return QC.c(buildUpon.toString());
                    } catch (Exception e9) {
                        exc = e9;
                        return QC.k(exc);
                    }
                }
                C3286gq c3286gq = this.f27296c;
                c3286gq.getClass();
                try {
                    C4763d b9 = C4763d.b(c3286gq.f31431b);
                    c3286gq.f31430a = b9;
                    k9 = b9 == null ? QC.k(new IllegalStateException("MeasurementManagerFutures is null")) : b9.c();
                } catch (Exception e10) {
                    k9 = QC.k(e10);
                }
                return QC.r(QC.t(ID.s(k9), new C3219fd((Object) this, (Object) buildUpon, str, (Object) motionEvent, 1), this.f27299f), Throwable.class, new E2.r(3, this, buildUpon), this.f27298e);
            } catch (Exception e11) {
                e = e11;
                exc = e;
                return QC.k(exc);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
