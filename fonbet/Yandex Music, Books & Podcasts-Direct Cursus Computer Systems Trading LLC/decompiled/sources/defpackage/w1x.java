package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w1x {
    public static final String w;
    public final msg a;
    public final String b;
    public yks c;
    public final List d;
    public long e;
    public owh f;
    public Long g;
    public gao h;
    public int i;
    public final j2x j;
    public final j2x k;
    public final j2x l;
    public final j2x m;
    public final j2x n;
    public final j2x o;
    public final j2x p;
    public final j2x q;
    public final j2x r;
    public final j2x s;
    public final j2x t;
    public final j2x u;
    public final j2x v;

    static {
        Pattern pattern = d94.a;
        w = "urn:x-cast:com.google.cast.media";
    }

    public w1x() {
        String str = w;
        d94.b(str);
        this.b = str;
        this.a = new msg("MediaControlChannel", null);
        this.d = Collections.synchronizedList(new ArrayList());
        this.i = -1;
        j2x j2xVar = new j2x(86400000L, "load");
        this.j = j2xVar;
        j2x j2xVar2 = new j2x(86400000L, "pause");
        this.k = j2xVar2;
        j2x j2xVar3 = new j2x(86400000L, "play");
        this.l = j2xVar3;
        j2x j2xVar4 = new j2x(86400000L, "stop");
        this.m = j2xVar4;
        j2x j2xVar5 = new j2x(10000L, "seek");
        this.n = j2xVar5;
        j2x j2xVar6 = new j2x(86400000L, "volume");
        this.o = j2xVar6;
        j2x j2xVar7 = new j2x(86400000L, "mute");
        this.p = j2xVar7;
        j2x j2xVar8 = new j2x(86400000L, "status");
        this.q = j2xVar8;
        j2x j2xVar9 = new j2x(86400000L, "activeTracks");
        j2x j2xVar10 = new j2x(86400000L, "trackStyle");
        j2x j2xVar11 = new j2x(86400000L, "queueInsert");
        j2x j2xVar12 = new j2x(86400000L, "queueUpdate");
        this.r = j2xVar12;
        j2x j2xVar13 = new j2x(86400000L, "queueRemove");
        j2x j2xVar14 = new j2x(86400000L, "queueReorder");
        j2x j2xVar15 = new j2x(86400000L, "queueFetchItemIds");
        this.s = j2xVar15;
        j2x j2xVar16 = new j2x(86400000L, "queueFetchItemRange");
        this.u = j2xVar16;
        this.t = new j2x(86400000L, "queueFetchItems");
        j2x j2xVar17 = new j2x(86400000L, "setPlaybackRate");
        this.v = j2xVar17;
        j2x j2xVar18 = new j2x(86400000L, "skipAd");
        k(j2xVar);
        k(j2xVar2);
        k(j2xVar3);
        k(j2xVar4);
        k(j2xVar5);
        k(j2xVar6);
        k(j2xVar7);
        k(j2xVar8);
        k(j2xVar9);
        k(j2xVar10);
        k(j2xVar11);
        k(j2xVar12);
        k(j2xVar13);
        k(j2xVar14);
        k(j2xVar15);
        k(j2xVar16);
        k(j2xVar16);
        k(j2xVar17);
        k(j2xVar18);
        d();
    }

    public static ybl c(JSONObject jSONObject) {
        MediaError.a(jSONObject);
        ybl yblVar = new ybl();
        Pattern pattern = d94.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return yblVar;
    }

    public static int[] j(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final void a(c2x c2xVar, int i) {
        JSONObject jSONObject = new JSONObject();
        long l = l();
        try {
            jSONObject.put("requestId", l);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", o());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        m(l, jSONObject.toString());
        this.r.a(l, new atn(this, c2xVar, false, 22));
    }

    public final long b(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void d() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((j2x) it.next()).f(2002);
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            msg msgVar = this.a;
            Log.w(msgVar.a, msgVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void f() {
        gao gaoVar = this.h;
        if (gaoVar != null) {
            xun xunVar = (xun) gaoVar.a;
            Iterator it = xunVar.h.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            Iterator it2 = xunVar.i.iterator();
            while (it2.hasNext()) {
                ((wun) it2.next()).b();
            }
        }
    }

    public final void g() {
        gao gaoVar = this.h;
        if (gaoVar != null) {
            xun xunVar = (xun) gaoVar.a;
            Iterator it = xunVar.h.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            Iterator it2 = xunVar.i.iterator();
            while (it2.hasNext()) {
                ((wun) it2.next()).c();
            }
        }
    }

    public final void h() {
        gao gaoVar = this.h;
        if (gaoVar != null) {
            xun xunVar = (xun) gaoVar.a;
            Iterator it = xunVar.h.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            Iterator it2 = xunVar.i.iterator();
            while (it2.hasNext()) {
                ((wun) it2.next()).d();
            }
        }
    }

    public final void i() {
        gao gaoVar = this.h;
        if (gaoVar != null) {
            xun xunVar = (xun) gaoVar.a;
            for (v3x v3xVar : xunVar.k.values()) {
                if (xunVar.h() && !v3xVar.d) {
                    xun xunVar2 = v3xVar.e;
                    fsn fsnVar = xunVar2.b;
                    fbr fbrVar = v3xVar.c;
                    fsnVar.removeCallbacks(fbrVar);
                    v3xVar.d = true;
                    xunVar2.b.postDelayed(fbrVar, v3xVar.b);
                } else if (!xunVar.h() && v3xVar.d) {
                    v3xVar.e.b.removeCallbacks(v3xVar.c);
                    v3xVar.d = false;
                }
                if (v3xVar.d && (xunVar.i() || xunVar.w() || xunVar.l() || xunVar.k())) {
                    xunVar.x(v3xVar.a);
                }
            }
            Iterator it = xunVar.h.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            Iterator it2 = xunVar.i.iterator();
            while (it2.hasNext()) {
                ((wun) it2.next()).f();
            }
        }
    }

    public final void k(j2x j2xVar) {
        this.d.add(j2xVar);
    }

    public final long l() {
        yks yksVar = this.c;
        if (yksVar != null) {
            return ((AtomicLong) yksVar.c).getAndIncrement();
        }
        msg msgVar = this.a;
        Log.e(msgVar.a, msgVar.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void m(long j, String str) {
        Object[] objArr = {str, null};
        msg msgVar = this.a;
        String str2 = msgVar.a;
        if (!Build.TYPE.equals("user") && msgVar.b && Log.isLoggable(str2, 2)) {
            Log.v(str2, msgVar.d("Sending text message: %s to: %s", objArr));
        }
        yks yksVar = this.c;
        if (yksVar == null) {
            Log.e(msgVar.a, msgVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        h4x h4xVar = (h4x) yksVar.b;
        if (h4xVar == null) {
            xq0.q("Device is not connected");
            return;
        }
        String str3 = this.b;
        d94.b(str3);
        if (TextUtils.isEmpty(str)) {
            xq0.x("The message payload cannot be null or empty");
            return;
        }
        if (str.length() > 524288) {
            msg msgVar2 = h4x.G;
            Log.w(msgVar2.a, msgVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            xq0.x("Message exceeds maximum size524288");
        } else {
            q5i a = h8s.a();
            a.c = new yks(16, h4xVar, str3, str);
            a.b = 8405;
            h4xVar.c(1, a.c()).n(new au1(yksVar, j, 16));
        }
    }

    public final long n() {
        aoh aohVar;
        owh owhVar = this.f;
        MediaInfo mediaInfo = owhVar == null ? null : owhVar.a;
        if (mediaInfo != null && owhVar != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    owh owhVar2 = this.f;
                    if (owhVar2.u != null) {
                        long longValue = l.longValue();
                        owh owhVar3 = this.f;
                        if (owhVar3 != null && (aohVar = owhVar3.u) != null) {
                            long j = aohVar.b;
                            r3 = !aohVar.d ? b(1.0d, j, -1L) : j;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = owhVar2 == null ? null : owhVar2.a;
                    if ((mediaInfo2 != null ? mediaInfo2.e : 0L) >= 0) {
                        long longValue2 = l.longValue();
                        owh owhVar4 = this.f;
                        MediaInfo mediaInfo3 = owhVar4 != null ? owhVar4.a : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.e : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.e != 0) {
                double d = owhVar.d;
                long j2 = owhVar.g;
                return (d == 0.0d || owhVar.e != 2) ? j2 : b(d, j2, mediaInfo.e);
            }
        }
        return 0L;
    }

    public final long o() {
        owh owhVar = this.f;
        if (owhVar != null) {
            return owhVar.b;
        }
        throw new s1x();
    }
}
