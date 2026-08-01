package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import n0.C4749d;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2692Ni {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26511a;

    /* renamed from: b, reason: collision with root package name */
    public final C5069B f26512b;

    /* renamed from: c, reason: collision with root package name */
    public final C3263gq f26513c;

    /* renamed from: d, reason: collision with root package name */
    public final C2663Ln f26514d;

    /* renamed from: e, reason: collision with root package name */
    public final C3360ig f26515e;

    /* renamed from: f, reason: collision with root package name */
    public final RD f26516f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f26517g;

    public C2692Ni(Context context, C5069B c5069b, C3263gq c3263gq, C2663Ln c2663Ln, C3360ig c3360ig, RD rd, ScheduledExecutorService scheduledExecutorService) {
        this.f26511a = context;
        this.f26512b = c5069b;
        this.f26513c = c3263gq;
        this.f26514d = c2663Ln;
        this.f26515e = c3360ig;
        this.f26516f = rd;
        this.f26517g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) q2.r.f40207e.f40210c.a(AbstractC3569ma.Cb));
    }

    public final N3.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? QC.c(str) : QC.r(c(str, this.f26514d.f26171a, random), Throwable.class, new C3141ec(this, str, 1), this.f26515e);
    }

    public final N3.a c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        N3.a k9;
        try {
            C3301ha c3301ha = AbstractC3569ma.Cb;
            q2.r rVar = q2.r.f40207e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40210c;
            try {
                if (!str.contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)) || this.f26512b.t()) {
                    return QC.c(str);
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.Db), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (motionEvent == null) {
                    try {
                        buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.Eb), "11");
                        return QC.c(buildUpon.toString());
                    } catch (Exception e9) {
                        exc = e9;
                        return QC.k(exc);
                    }
                }
                C3263gq c3263gq = this.f26513c;
                c3263gq.getClass();
                try {
                    C4749d b9 = C4749d.b(c3263gq.f30662b);
                    c3263gq.f30661a = b9;
                    k9 = b9 == null ? QC.k(new IllegalStateException("MeasurementManagerFutures is null")) : b9.c();
                } catch (Exception e10) {
                    k9 = QC.k(e10);
                }
                return QC.r(QC.t(ID.s(k9), new C3196fd((Object) this, (Object) buildUpon, str, (Object) motionEvent, 1), this.f26516f), Throwable.class, new C2.s(3, this, buildUpon), this.f26515e);
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
