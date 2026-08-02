package com.yandex.passport.internal.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.api.exception.j;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.analytics.v;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.methods.a1;
import com.yandex.passport.internal.methods.a2;
import com.yandex.passport.internal.methods.a3;
import com.yandex.passport.internal.methods.b1;
import com.yandex.passport.internal.methods.b2;
import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.methods.c1;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.methods.c3;
import com.yandex.passport.internal.methods.d1;
import com.yandex.passport.internal.methods.d2;
import com.yandex.passport.internal.methods.e1;
import com.yandex.passport.internal.methods.e2;
import com.yandex.passport.internal.methods.f1;
import com.yandex.passport.internal.methods.f2;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.g2;
import com.yandex.passport.internal.methods.h1;
import com.yandex.passport.internal.methods.h2;
import com.yandex.passport.internal.methods.i0;
import com.yandex.passport.internal.methods.i1;
import com.yandex.passport.internal.methods.i2;
import com.yandex.passport.internal.methods.j0;
import com.yandex.passport.internal.methods.j1;
import com.yandex.passport.internal.methods.j2;
import com.yandex.passport.internal.methods.k0;
import com.yandex.passport.internal.methods.k1;
import com.yandex.passport.internal.methods.k2;
import com.yandex.passport.internal.methods.l0;
import com.yandex.passport.internal.methods.l1;
import com.yandex.passport.internal.methods.l2;
import com.yandex.passport.internal.methods.m0;
import com.yandex.passport.internal.methods.m1;
import com.yandex.passport.internal.methods.m2;
import com.yandex.passport.internal.methods.n0;
import com.yandex.passport.internal.methods.n1;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.o0;
import com.yandex.passport.internal.methods.o1;
import com.yandex.passport.internal.methods.o2;
import com.yandex.passport.internal.methods.p0;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.p2;
import com.yandex.passport.internal.methods.performer.y0;
import com.yandex.passport.internal.methods.q0;
import com.yandex.passport.internal.methods.q1;
import com.yandex.passport.internal.methods.q2;
import com.yandex.passport.internal.methods.r0;
import com.yandex.passport.internal.methods.r1;
import com.yandex.passport.internal.methods.r2;
import com.yandex.passport.internal.methods.s0;
import com.yandex.passport.internal.methods.s1;
import com.yandex.passport.internal.methods.s2;
import com.yandex.passport.internal.methods.t0;
import com.yandex.passport.internal.methods.t1;
import com.yandex.passport.internal.methods.t2;
import com.yandex.passport.internal.methods.u0;
import com.yandex.passport.internal.methods.u1;
import com.yandex.passport.internal.methods.u2;
import com.yandex.passport.internal.methods.v0;
import com.yandex.passport.internal.methods.v1;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w0;
import com.yandex.passport.internal.methods.w1;
import com.yandex.passport.internal.methods.w2;
import com.yandex.passport.internal.methods.w5;
import com.yandex.passport.internal.methods.x0;
import com.yandex.passport.internal.methods.x1;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.y1;
import com.yandex.passport.internal.methods.y2;
import com.yandex.passport.internal.methods.z0;
import com.yandex.passport.internal.methods.z1;
import com.yandex.passport.internal.methods.z2;
import com.yandex.pulse.metrics.o;
import defpackage.b6e;
import defpackage.hav;
import defpackage.hrg;
import defpackage.ouj;
import defpackage.uah;
import defpackage.xz0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InternalProvider extends ContentProvider {
    public static volatile boolean d;
    public y0 a;
    public w b;
    public boolean c;

    public final void a(long j, String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, p.e + ": method=" + str + " time=" + elapsedRealtime, 8);
        }
        Map n = uah.n(xz0.w(Arrays.copyOf(new Pair[]{new Pair("method", str), new Pair("execution_time", String.valueOf(elapsedRealtime)), str2 != null ? new Pair(Constants.KEY_EXCEPTION, str2) : null}, 3)));
        w wVar = this.b;
        if (wVar != null) {
            wVar.e(p.e, n);
        } else {
            Intrinsics.j("appAnalyticsTracker");
            throw null;
        }
    }

    public final Bundle b(String str, String str2, Bundle bundle) {
        Function1 function1;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "call: isInPassportProcess=" + d + " method='" + str + "' arg='" + str2 + "' extras=" + bundle, 8);
        }
        if (!this.c) {
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            this.a = a.getMethodPerformDispatcher();
            this.b = a.getAnalyticsTrackerWrapper();
            this.c = true;
        }
        try {
            w5 valueOf = w5.valueOf(str);
            if (bundle == null) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, hrg.q("call: method='", str, "': extras is null"), 8);
                }
                t tVar = new t(ouj.k('\'', "Extra is null for method '", str));
                w wVar = this.b;
                if (wVar != null) {
                    wVar.d(v.a, tVar);
                    return com.yandex.plus.pay.ui.core.b.v(tVar);
                }
                Intrinsics.j("appAnalyticsTracker");
                throw null;
            }
            bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Going to performMethod " + valueOf, 8);
            }
            y0 y0Var = this.a;
            if (y0Var == null) {
                Intrinsics.j("methodPerformDispatcher");
                throw null;
            }
            valueOf.getClass();
            switch (valueOf.ordinal()) {
                case 0:
                    function1 = s0.a;
                    break;
                case 1:
                    function1 = s2.a;
                    break;
                case 2:
                    function1 = d1.a;
                    break;
                case 3:
                    function1 = m1.a;
                    break;
                case 4:
                    function1 = x1.a;
                    break;
                case 5:
                    function1 = h2.a;
                    break;
                case 6:
                    function1 = p2.a;
                    break;
                case 7:
                    function1 = new r(14);
                    break;
                case 8:
                    function1 = b3.a;
                    break;
                case 9:
                    function1 = c3.a;
                    break;
                case 10:
                    function1 = i0.a;
                    break;
                case 11:
                    function1 = j0.a;
                    break;
                case 12:
                    function1 = k0.a;
                    break;
                case 13:
                    function1 = l0.a;
                    break;
                case 14:
                    function1 = m0.a;
                    break;
                case 15:
                    function1 = n0.a;
                    break;
                case 16:
                    function1 = r0.a;
                    break;
                case 17:
                    function1 = o0.a;
                    break;
                case 18:
                    function1 = p0.a;
                    break;
                case 19:
                    function1 = q0.a;
                    break;
                case 20:
                    function1 = t0.a;
                    break;
                case 21:
                    function1 = u0.a;
                    break;
                case 22:
                    function1 = v0.a;
                    break;
                case 23:
                    function1 = w0.a;
                    break;
                case 24:
                    function1 = x0.a;
                    break;
                case 25:
                    function1 = com.yandex.passport.internal.methods.y0.a;
                    break;
                case 26:
                    function1 = z0.a;
                    break;
                case 27:
                    function1 = a1.a;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    function1 = b1.a;
                    break;
                case 29:
                    function1 = e1.a;
                    break;
                case 30:
                    function1 = w2.a;
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    function1 = f1.a;
                    break;
                case 32:
                    function1 = g1.a;
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    function1 = y2.a;
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    function1 = new r(15);
                    break;
                case 35:
                    function1 = h1.a;
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    function1 = new r(16);
                    break;
                case 37:
                    function1 = i1.a;
                    break;
                case 38:
                    function1 = j1.a;
                    break;
                case 39:
                    function1 = k1.a;
                    break;
                case 40:
                    function1 = l1.a;
                    break;
                case 41:
                    function1 = n1.a;
                    break;
                case 42:
                    function1 = c1.a;
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    function1 = o1.a;
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    function1 = p1.a;
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    function1 = q1.a;
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    function1 = r1.a;
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    function1 = s1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    function1 = t1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    function1 = u1.a;
                    break;
                case 50:
                    function1 = v1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    function1 = w1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    function1 = y1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    function1 = z1.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    function1 = a2.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    function1 = b2.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    function1 = c2.a;
                    break;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    function1 = new r(17);
                    break;
                case 58:
                    function1 = d2.a;
                    break;
                case 59:
                    function1 = e2.a;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    function1 = f2.a;
                    break;
                case 61:
                    function1 = g2.a;
                    break;
                case 62:
                    function1 = i2.a;
                    break;
                case 63:
                    function1 = j2.a;
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    function1 = k2.a;
                    break;
                case 65:
                    function1 = l2.a;
                    break;
                case 66:
                    function1 = m2.a;
                    break;
                case 67:
                    function1 = new r(18);
                    break;
                case 68:
                    function1 = n2.a;
                    break;
                case 69:
                    function1 = o2.a;
                    break;
                case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                    function1 = new r(19);
                    break;
                case 71:
                    function1 = new r(20);
                    break;
                case 72:
                    function1 = q2.a;
                    break;
                case 73:
                    function1 = r2.a;
                    break;
                case 74:
                    function1 = t2.a;
                    break;
                case 75:
                    function1 = u2.a;
                    break;
                case 76:
                    function1 = v2.a;
                    break;
                case 77:
                    function1 = x2.a;
                    break;
                case 78:
                    function1 = z2.a;
                    break;
                case 79:
                    function1 = a3.a;
                    break;
                default:
                    b6e.s();
                    return null;
            }
            v5 v5Var = (v5) function1.invoke(bundle);
            v5Var.getClass();
            Object obj = ((z7o) new hav(21, y0Var, v5Var).invoke()).a;
            Throwable a2 = z7o.a(obj);
            if (a2 == null) {
                Bundle bundle2 = new Bundle();
                v5Var.b().g(bundle2, obj);
                return bundle2;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable(Constants.KEY_EXCEPTION, a2);
            return bundle3;
        } catch (IllegalArgumentException e) {
            d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, ouj.k('\'', "call: unknown method '", str), e);
            }
            w wVar2 = this.b;
            if (wVar2 != null) {
                wVar2.d(v.a, e);
                return com.yandex.plus.pay.ui.core.b.v(new t(ouj.k('\'', "Unknown provider method '", str)));
            }
            Intrinsics.j("appAnalyticsTracker");
            throw null;
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        long j;
        str.getClass();
        try {
            try {
                j = SystemClock.elapsedRealtime();
                try {
                    return b(str, str2, bundle);
                } catch (Throwable th) {
                    th = th;
                    d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "call", th);
                    }
                    Exception exc = th instanceof Exception ? th : new Exception(th);
                    if (this.c) {
                        try {
                            if (j != 0) {
                                a(j, str, th.getMessage());
                            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "reportExecutionTimeWithException: startTime is not initialized", 8);
                            }
                        } catch (Throwable th2) {
                            d dVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "reportExecutionTimeWithException", th2);
                            }
                        }
                        w wVar = this.b;
                        if (wVar == null) {
                            Intrinsics.j("appAnalyticsTracker");
                            throw null;
                        }
                        wVar.d(v.a, exc);
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "appAnalyticsTracker is not injected on " + th + " catch", 8);
                    }
                    return com.yandex.plus.pay.ui.core.b.v(exc);
                }
            } catch (Throwable th3) {
                th = th3;
                j = 0;
            }
        } catch (j e) {
            d dVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "call", e);
            }
            return com.yandex.plus.pay.ui.core.b.v(e);
        } catch (com.yandex.passport.api.exception.p e2) {
            d dVar4 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "call", e2);
            }
            return com.yandex.plus.pay.ui.core.b.v(e2);
        } catch (SecurityException e3) {
            d dVar5 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "call", e3);
            }
            throw e3;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCreate", 8);
        }
        d = true;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException();
    }
}
