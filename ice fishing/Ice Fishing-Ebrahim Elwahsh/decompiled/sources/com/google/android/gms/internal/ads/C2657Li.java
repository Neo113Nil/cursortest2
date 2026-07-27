package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import n0.C4804d;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2657Li {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26190a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.E f26191b;

    /* renamed from: c, reason: collision with root package name */
    public final C3383iq f26192c;

    /* renamed from: d, reason: collision with root package name */
    public final C2679Mn f26193d;

    /* renamed from: e, reason: collision with root package name */
    public final C3157eg f26194e;

    /* renamed from: f, reason: collision with root package name */
    public final SD f26195f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f26196g;

    public C2657Li(Context context, t2.E e6, C3383iq c3383iq, C2679Mn c2679Mn, C3157eg c3157eg, SD sd, ScheduledExecutorService scheduledExecutorService) {
        this.f26190a = context;
        this.f26191b = e6;
        this.f26192c = c3383iq;
        this.f26193d = c2679Mn;
        this.f26194e = c3157eg;
        this.f26195f = sd;
        this.f26196g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cb));
    }

    public final J3.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? C3686oN.c(str) : C3686oN.v(c(str, this.f26193d.f26374a, random), Throwable.class, new C2888Zb(this, str, 1), this.f26194e);
    }

    public final J3.a c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        J3.a l9;
        try {
            C3151ea c3151ea = AbstractC3368ia.Cb;
            q2.r rVar = q2.r.f40116e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
            try {
                if (!str.contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)) || this.f26191b.t()) {
                    return C3686oN.c(str);
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.Db), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (motionEvent == null) {
                    try {
                        buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.Eb), "11");
                        return C3686oN.c(buildUpon.toString());
                    } catch (Exception e6) {
                        exc = e6;
                        return C3686oN.l(exc);
                    }
                }
                C3383iq c3383iq = this.f26192c;
                c3383iq.getClass();
                try {
                    C4804d b9 = C4804d.b(c3383iq.f32009b);
                    c3383iq.f32008a = b9;
                    l9 = b9 == null ? C3686oN.l(new IllegalStateException("MeasurementManagerFutures is null")) : b9.c();
                } catch (Exception e9) {
                    l9 = C3686oN.l(e9);
                }
                return C3686oN.v(C3686oN.y(JD.s(l9), new C2889Zc((Object) this, (Object) buildUpon, str, (Object) motionEvent, 1), this.f26195f), Throwable.class, new C2936ad(2, this, buildUpon), this.f26194e);
            } catch (Exception e10) {
                e = e10;
                exc = e;
                return C3686oN.l(exc);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
