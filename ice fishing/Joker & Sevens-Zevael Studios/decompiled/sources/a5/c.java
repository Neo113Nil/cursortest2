package a5;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import androidx.work.OverwritingInputMerger;
import b6.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import d6.f;
import d8.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import m0.w2;
import m7.g;
import org.fortheloss.st.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;
import p6.u;
import pc.j;
import q3.p;
import q3.s;
import s.g0;
import s.q;
import s.v;
import t5.d;
import u0.l;
import v1.a0;
import w5.i;
import w5.k;
import x1.c1;
import x1.m1;
import x1.t;
import x1.v1;
import x4.n;
import y1.r;
import z2.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements a, g7.c, m0.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f261g;

    /* renamed from: h, reason: collision with root package name */
    public Object f262h;

    /* renamed from: i, reason: collision with root package name */
    public Object f263i;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f262h = obj;
        this.f261g = obj2;
        this.f263i = obj3;
    }

    public static c C(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public boolean A() {
        return !(((v1) ((g) this.f262h).f4957h).isEmpty() && ((v1) ((g) this.f263i).f4957h).isEmpty() && ((v1) ((g) this.f261g).f4957h).isEmpty());
    }

    public boolean B() {
        if (((w2) this.f262h).getValue() != this.f263i) {
            return true;
        }
        c cVar = (c) this.f261g;
        return cVar != null && cVar.B();
    }

    public void D(o oVar) {
        s0 s0Var = (s0) this.f263i;
        if (s0Var != null) {
            s0Var.run();
        }
        s0 s0Var2 = new s0((w) this.f262h, oVar);
        this.f263i = s0Var2;
        ((Handler) this.f261g).postAtFrontOfQueue(s0Var2);
    }

    public Object E(CharSequence charSequence, int i10, int i11, int i12, boolean z10, q3.o oVar) {
        int i13;
        char c3;
        p pVar = new p((s) ((n) this.f261g).f8318c);
        int codePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean z11 = true;
        int i15 = i10;
        loop0: while (true) {
            i13 = i15;
            while (i15 < i11 && i14 < i12 && z11) {
                SparseArray sparseArray = pVar.f5774c.f5790a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(codePointAt);
                if (pVar.f5772a == 2) {
                    if (sVar != null) {
                        pVar.f5774c = sVar;
                        pVar.f5777f++;
                    } else {
                        if (codePointAt == 65038) {
                            pVar.a();
                        } else if (codePointAt != 65039) {
                            s sVar2 = pVar.f5774c;
                            if (sVar2.f5791b != null) {
                                if (pVar.f5777f != 1) {
                                    pVar.f5775d = sVar2;
                                    pVar.a();
                                } else if (pVar.b()) {
                                    pVar.f5775d = pVar.f5774c;
                                    pVar.a();
                                } else {
                                    pVar.a();
                                }
                                c3 = 3;
                            } else {
                                pVar.a();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                } else if (sVar == null) {
                    pVar.a();
                    c3 = 1;
                } else {
                    pVar.f5772a = 2;
                    pVar.f5774c = sVar;
                    pVar.f5777f = 1;
                    c3 = 2;
                }
                pVar.f5776e = codePointAt;
                if (c3 == 1) {
                    i15 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                    if (i15 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i15);
                    }
                } else if (c3 == 2) {
                    int charCount = Character.charCount(codePointAt) + i15;
                    if (charCount < i11) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i15 = charCount;
                } else if (c3 == 3) {
                    if (z10 || !z(charSequence, i13, i15, pVar.f5775d.f5791b)) {
                        z11 = oVar.a(charSequence, i13, i15, pVar.f5775d.f5791b);
                        i14++;
                    }
                }
            }
        }
        if (pVar.f5772a == 2 && pVar.f5774c.f5791b != null && ((pVar.f5777f > 1 || pVar.b()) && i14 < i12 && z11 && (z10 || !z(charSequence, i13, i15, pVar.f5774c.f5791b)))) {
            oVar.a(charSequence, i13, i15, pVar.f5774c.f5791b);
        }
        return oVar.getResult();
    }

    public void F() {
        ((TypedArray) this.f261g).recycle();
    }

    public void G(Collection collection) {
        j.e(collection, "workSpecs");
        synchronized (this.f263i) {
            try {
                for (u4.b bVar : (u4.b[]) this.f261g) {
                    if (bVar.f6693e != null) {
                        bVar.f6693e = null;
                        bVar.d(null, bVar.f6692d);
                    }
                }
                for (u4.b bVar2 : (u4.b[]) this.f261g) {
                    bVar2.c(collection);
                }
                for (u4.b bVar3 : (u4.b[]) this.f261g) {
                    if (bVar3.f6693e != this) {
                        bVar3.f6693e = this;
                        bVar3.d(this, bVar3.f6692d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H() {
        synchronized (this.f263i) {
            for (u4.b bVar : (u4.b[]) this.f261g) {
                ArrayList arrayList = bVar.f6690b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f6689a.b(bVar);
                }
            }
        }
    }

    public void I(i iVar, int i10, boolean z10) {
        c6.b bVar = (c6.b) this.f263i;
        Context context = (Context) this.f262h;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f7687a;
        String str2 = iVar.f7687a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        d dVar = iVar.f7689c;
        adler32.update(allocate.putInt(g6.a.a(dVar)).array());
        byte[] bArr = iVar.f7688b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        a.a.r("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((d6.j) ((d6.d) this.f261g)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(g6.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, longValue, i10));
            Set set = ((c6.c) bVar.f1237b.get(dVar)).f1240c;
            if (set.contains(c6.d.f1241g)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(c6.d.f1243i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(c6.d.f1242h)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", g6.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i10)), valueOf, Integer.valueOf(i10)};
            String concat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void J(t5.a aVar) {
        f fVar = new f(29);
        w5.o oVar = (w5.o) this.f263i;
        i iVar = (i) this.f262h;
        t5.c cVar = (t5.c) this.f261g;
        e eVar = oVar.f7706c;
        c a6 = i.a();
        a6.L(iVar.f7687a);
        a6.f263i = d.f6527g;
        a6.f261g = iVar.f7688b;
        i n7 = a6.n();
        m mVar = new m();
        mVar.f1802f = new HashMap();
        mVar.f1800d = Long.valueOf(oVar.f7704a.a());
        mVar.f1801e = Long.valueOf(oVar.f7705b.a());
        mVar.f1797a = "FCM_CLIENT_EVENT_LOGGING";
        e8.e eVar2 = aVar.f6523a;
        c cVar2 = d8.p.f1807a;
        cVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar2.r(eVar2, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        mVar.f1799c = new k(cVar, byteArrayOutputStream.toByteArray());
        mVar.f1798b = null;
        b6.c cVar3 = (b6.c) eVar;
        cVar3.f1027b.execute(new b6.a(cVar3, n7, fVar, mVar.h()));
    }

    public void K(Object obj) {
        long c3 = u0.e.c();
        if (c3 == l.f6683a) {
            this.f263i = obj;
            return;
        }
        synchronized (this.f261g) {
            u0.k kVar = (u0.k) ((AtomicReference) this.f262h).get();
            int a6 = kVar.a(c3);
            if (a6 < 0) {
                ((AtomicReference) this.f262h).set(kVar.b(c3, obj));
            } else {
                kVar.f6682c[a6] = obj;
            }
        }
    }

    public void L(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f262h = str;
    }

    public void M(f1.o oVar) {
        ((h1.b) this.f263i).f2595g.f2593c = oVar;
    }

    public void N(s2.c cVar) {
        ((h1.b) this.f263i).f2595g.f2591a = cVar;
    }

    public void O(long j3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j.e(timeUnit, "timeUnit");
        ((x4.p) this.f261g).f8328g = timeUnit.toMillis(j3);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((x4.p) this.f261g).f8328g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void P(s2.l lVar) {
        ((h1.b) this.f263i).f2595g.f2592b = lVar;
    }

    public void Q(long j3) {
        ((h1.b) this.f263i).f2595g.f2594d = j3;
    }

    public void R() {
        g0 g0Var = (g0) this.f262h;
        String str = (String) this.f261g;
        List list = (List) g0Var.k(str);
        if (list != null) {
            list.remove((oc.a) this.f263i);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        g0Var.m(str, list);
    }

    public void b(x1.g0 g0Var, t tVar) {
        g gVar = (g) this.f262h;
        g gVar2 = (g) this.f261g;
        g gVar3 = (g) this.f263i;
        int ordinal = tVar.ordinal();
        if (ordinal == 0) {
            gVar.i(g0Var);
            gVar3.i(g0Var);
            return;
        }
        if (ordinal == 1) {
            gVar2.i(g0Var);
            gVar3.i(g0Var);
            return;
        }
        if (ordinal == 2) {
            if (g0Var.f8047m != null) {
                gVar3.i(g0Var);
                return;
            } else {
                gVar.i(g0Var);
                return;
            }
        }
        if (ordinal != 3) {
            throw new ac.d();
        }
        if (g0Var.f8047m != null) {
            gVar3.i(g0Var);
        } else {
            gVar2.i(g0Var);
        }
    }

    @Override // m0.c
    public void c(int i10, Object obj) {
        ((x1.g0) this.f263i).z(i10, (x1.g0) obj);
    }

    @Override // m0.c
    public void d(Object obj) {
        ((ArrayList) this.f261g).add(this.f263i);
        this.f263i = obj;
    }

    @Override // m0.c
    public void f() {
        x1.g0 g0Var = (x1.g0) this.f263i;
        c1 c1Var = g0Var.I;
        if (!g0Var.G()) {
            u1.a.a("onReuse is only expected on attached node");
        }
        a0 a0Var = g0Var.K;
        if (a0Var != null) {
            a0Var.e(false);
        }
        g0Var.f8058x = false;
        if (g0Var.R) {
            g0Var.R = false;
        } else {
            y0.m mVar = g0Var.I.f7990e;
            for (y0.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f8447k) {
                if (mVar2.f8456t) {
                    mVar2.m0();
                }
            }
            for (y0.m mVar3 = mVar; mVar3 != null; mVar3 = mVar3.f8447k) {
                if (mVar3.f8456t) {
                    mVar3.o0();
                }
            }
            while (mVar != null) {
                if (mVar.f8456t) {
                    mVar.i0();
                }
                mVar = mVar.f8447k;
            }
        }
        int i10 = g0Var.f8042h;
        g0Var.f8042h = e2.k.f1989a.addAndGet(1);
        m1 m1Var = g0Var.f8053s;
        if (m1Var != null) {
            r rVar = (r) m1Var;
            rVar.getLayoutNodes().g(i10);
            rVar.getLayoutNodes().h(g0Var.f8042h, g0Var);
        }
        for (y0.m mVar4 = c1Var.f7991f; mVar4 != null; mVar4 = mVar4.f8448l) {
            mVar4.h0();
        }
        c1Var.e();
        if (c1Var.d(8)) {
            g0Var.E();
        }
        x1.g0.U(g0Var);
        m1 m1Var2 = g0Var.f8053s;
        if (m1Var2 != null) {
            r rVar2 = (r) m1Var2;
            z0.b bVar = rVar2.K;
            if (bVar != null) {
                r rVar3 = bVar.f9052c;
                g gVar = bVar.f9050a;
                v vVar = bVar.f9056g;
                if (vVar.e(i10)) {
                    gVar.q(rVar3, i10, false);
                }
                e2.j u10 = g0Var.u();
                if (u10 != null && u10.f1985g.b(e2.s.f2041q)) {
                    vVar.a(g0Var.f8042h);
                    gVar.q(rVar3, g0Var.f8042h, true);
                }
            }
            rVar2.getRectManager().f(g0Var, true);
        }
    }

    @Override // m0.c
    public /* bridge */ /* synthetic */ void g(int i10, Object obj) {
    }

    @Override // m0.c
    public Object getCurrent() {
        return this.f263i;
    }

    @Override // m0.c
    public void h() {
        m1 m1Var = ((x1.g0) this.f262h).f8053s;
        if (m1Var != null) {
            ((r) m1Var).w();
        }
    }

    @Override // m0.c
    public void i(int i10, int i11, int i12) {
        ((x1.g0) this.f263i).K(i10, i11, i12);
    }

    @Override // m0.c
    public void j(int i10, int i11) {
        ((x1.g0) this.f263i).O(i10, i11);
    }

    @Override // g7.c
    public void k(g7.o oVar) {
        l6.a aVar = (l6.a) this.f262h;
        String str = (String) this.f261g;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f263i;
        synchronized (aVar.f4167a) {
            aVar.f4167a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public boolean l(String str) {
        u4.b bVar;
        boolean z10;
        j.e(str, "workSpecId");
        synchronized (this.f263i) {
            try {
                u4.b[] bVarArr = (u4.b[]) this.f261g;
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i10];
                    bVar.getClass();
                    Object obj = bVar.f6692d;
                    if (obj != null && bVar.b(obj) && bVar.f6691c.contains(str)) {
                        break;
                    }
                    i10++;
                }
                if (bVar != null) {
                    o4.o.d().a(t4.c.f6522a, "Work " + str + " constrained by " + bVar.getClass().getSimpleName());
                }
                z10 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public o4.p m() {
        o4.p pVar = new o4.p((UUID) this.f262h, (x4.p) this.f261g, (LinkedHashSet) this.f263i);
        o4.d dVar = ((x4.p) this.f261g).f8331j;
        boolean z10 = !dVar.f5203h.isEmpty() || dVar.f5199d || dVar.f5197b || dVar.f5198c;
        x4.p pVar2 = (x4.p) this.f261g;
        if (pVar2.f8338q) {
            if (z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar2.f8328g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        j.d(randomUUID, "randomUUID()");
        this.f262h = randomUUID;
        String uuid = randomUUID.toString();
        j.d(uuid, "id.toString()");
        x4.p pVar3 = (x4.p) this.f261g;
        j.e(pVar3, "other");
        String str = pVar3.f8324c;
        int i10 = pVar3.f8323b;
        String str2 = pVar3.f8325d;
        o4.e eVar = new o4.e(pVar3.f8326e);
        o4.e eVar2 = new o4.e(pVar3.f8327f);
        long j3 = pVar3.f8328g;
        long j6 = pVar3.f8329h;
        long j10 = pVar3.f8330i;
        o4.d dVar2 = pVar3.f8331j;
        j.e(dVar2, "other");
        this.f261g = new x4.p(uuid, i10, str, str2, eVar, eVar2, j3, j6, j10, new o4.d(dVar2.f5196a, dVar2.f5197b, dVar2.f5198c, dVar2.f5199d, dVar2.f5200e, dVar2.f5201f, dVar2.f5202g, dVar2.f5203h), pVar3.f8332k, pVar3.f8333l, pVar3.f8334m, pVar3.f8335n, pVar3.f8336o, pVar3.f8337p, pVar3.f8338q, pVar3.f8339r, pVar3.f8340s, 524288, 0);
        return pVar;
    }

    public i n() {
        String str = ((String) this.f262h) == null ? " backendName" : "";
        if (((d) this.f263i) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.f262h, (byte[]) this.f261g, (d) this.f263i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // m0.c
    public void o() {
        this.f263i = ((ArrayList) this.f261g).remove(r0.size() - 1);
    }

    public void p() {
        ((ArrayList) this.f261g).clear();
        this.f263i = this.f262h;
        ((x1.g0) this.f262h).N();
    }

    public boolean q(x1.g0 g0Var) {
        return !(g0Var.f8047m == null) && (((v1) ((g) this.f262h).f4957h).contains(g0Var) || ((v1) ((g) this.f261g).f4957h).contains(g0Var));
    }

    public void r(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f262h;
        s7.f fVar = new s7.f(byteArrayOutputStream, hashMap, (HashMap) this.f261g, (p7.d) this.f263i);
        p7.d dVar = (p7.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new p7.b("No encoder for " + obj.getClass());
        }
    }

    public Object s() {
        long c3 = u0.e.c();
        if (c3 == l.f6683a) {
            return this.f263i;
        }
        u0.k kVar = (u0.k) ((AtomicReference) this.f262h).get();
        int a6 = kVar.a(c3);
        if (a6 >= 0) {
            return kVar.f6682c[a6];
        }
        return null;
    }

    public f1.o t() {
        return ((h1.b) this.f263i).f2595g.f2593c;
    }

    public ColorStateList u(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f261g;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            Context context = (Context) this.f262h;
            Object obj = j.a.f3284a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable v(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f261g;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : j.a.a((Context) this.f262h, resourceId);
    }

    public Typeface w(int i10, int i11, m.s sVar) {
        int resourceId = ((TypedArray) this.f261g).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f263i) == null) {
                this.f263i = new TypedValue();
            }
            Context context = (Context) this.f262h;
            TypedValue typedValue = (TypedValue) this.f263i;
            Object obj = h.f9087a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    sVar.a(-3);
                    return null;
                }
                int i12 = typedValue.assetCookie;
                q qVar = a3.d.f200b;
                Typeface typeface = (Typeface) qVar.a(a3.d.b(resources, resourceId, charSequence2, i12, i11));
                int i13 = 14;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.d(i13, sVar, typeface));
                    return typeface;
                }
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        z2.d f10 = z2.b.f(resources.getXml(resourceId), resources);
                        if (f10 != null) {
                            return a3.d.a(context, f10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, sVar, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        sVar.a(-3);
                        return null;
                    }
                    int i14 = typedValue.assetCookie;
                    Typeface w3 = a3.d.f199a.w(context, resources, resourceId, charSequence2, i11);
                    if (w3 != null) {
                        qVar.b(a3.d.b(resources, resourceId, charSequence2, i14, i11), w3);
                    }
                    if (w3 != null) {
                        new Handler(Looper.getMainLooper()).post(new a1.d(i13, sVar, w3));
                    } else {
                        sVar.a(-3);
                    }
                    return w3;
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e10);
                    sVar.a(-3);
                    return null;
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e11);
                    sVar.a(-3);
                    return null;
                }
            }
        }
        return null;
    }

    public long x() {
        return ((h1.b) this.f263i).f2595g.f2594d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(84:274|275|(1:24)|25|26|27|(1:29)|271|31|32|33|34|35|(75:250|(68:252|(1:254)|38|(1:40)|41|(1:43)|44|(2:46|(1:234)(58:50|51|(1:53)|54|(1:56)(2:224|(1:229)(1:228))|(1:58)|59|(1:61)(5:212|(1:214)|215|(1:217)(1:223)|(1:219)(2:220|(1:222)))|62|(1:64)(6:194|(4:197|(2:205|206)(1:203)|204|195)|207|208|(1:210)|211)|65|(1:67)(1:193)|(1:69)|70|(42:189|190|(1:76)|77|(1:79)|80|(36:180|(1:184)|(1:84)|85|(32:175|(1:179)|(1:89)|90|(28:172|(1:174)|(1:94)|95|(24:168|169|(1:99)|100|(3:158|159|(21:161|(1:163)|164|(1:104)|105|(4:143|144|145|(2:147|(15:149|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:142)|123|(4:131|132|(1:134)(1:137)|135)|125|126|(1:128)|129|130)(2:150|151))(2:152|153))|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)(2:165|166))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|72|(42:185|186|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130))(1:249)|235|(2:244|245)|(1:243)(1:242)|51|(0)|54|(0)(0)|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|255|(71:257|(1:259)|38|(0)|41|(0)|44|(0)(0)|235|(1:237)|244|245|(1:240)|243|51|(0)|54|(0)(0)|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)(1:267)|260|(3:262|(1:264)(1:266)|265)|38|(0)|41|(0)|44|(0)(0)|235|(0)|244|245|(0)|243|51|(0)|54|(0)(0)|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|37|38|(0)|41|(0)|44|(0)(0)|235|(0)|244|245|(0)|243|51|(0)|54|(0)(0)|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130)|22|(0)|25|26|27|(0)|271|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)(0)|235|(0)|244|245|(0)|243|51|(0)|54|(0)(0)|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|123|(0)|125|126|(0)|129|130) */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0208, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0209, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00c2, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0483 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0374 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: NameNotFoundException -> 0x00c1, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x00c1, blocks: (B:27:0x00b5, B:29:0x00bb), top: B:26:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y() {
        d8.n nVar;
        FirebaseMessagingService firebaseMessagingService;
        d8.o oVar;
        Bundle bundle;
        AtomicInteger atomicInteger;
        String packageName;
        PackageManager packageManager;
        String d10;
        String d11;
        String e10;
        int i10;
        int i11;
        int i12;
        String e11;
        Uri defaultUri;
        String e12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String e13;
        Integer valueOf;
        String e14;
        Integer b2;
        Integer b10;
        Integer b11;
        String e15;
        Long valueOf2;
        JSONArray c3;
        long[] jArr;
        JSONArray c7;
        int[] iArr;
        String e16;
        IconCompat iconCompat;
        boolean z10;
        int i13;
        String string;
        ApplicationInfo applicationInfo;
        if (((d8.o) this.f263i).a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f261g;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String e17 = ((d8.o) this.f263i).e("gcm.n.image");
        if (!TextUtils.isEmpty(e17)) {
            try {
                nVar = new d8.n(new URL(e17));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + e17);
            }
            if (nVar != null) {
                ExecutorService executorService = (ExecutorService) this.f262h;
                g7.h hVar = new g7.h();
                nVar.f1804h = executorService.submit(new a1.d(5, nVar, hVar));
                nVar.f1805i = hVar.f2537a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f261g;
            oVar = (d8.o) this.f263i;
            AtomicInteger atomicInteger2 = d8.e.f1766a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String e18 = oVar.e("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e18 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    atomicInteger = d8.e.f1766a;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    x2.i iVar = new x2.i(firebaseMessagingService, e18);
                    d10 = oVar.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d10)) {
                        iVar.f8240e = x2.i.b(d10);
                    }
                    d11 = oVar.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d11)) {
                        iVar.f8241f = x2.i.b(d11);
                        x2.g gVar = new x2.g(0);
                        gVar.f8235f = x2.i.b(d11);
                        iVar.g(gVar);
                    }
                    e10 = oVar.e("gcm.n.icon");
                    if (TextUtils.isEmpty(e10)) {
                        i10 = 1;
                    } else {
                        i12 = resources.getIdentifier(e10, "drawable", packageName);
                        if ((i12 != 0 && d8.e.a(resources, i12)) || ((i12 = resources.getIdentifier(e10, "mipmap", packageName)) != 0 && d8.e.a(resources, i12))) {
                            i10 = 1;
                            iVar.f8257v.icon = i12;
                            e11 = oVar.e("gcm.n.sound2");
                            if (TextUtils.isEmpty(e11)) {
                                e11 = oVar.e("gcm.n.sound");
                            }
                            if (!TextUtils.isEmpty(e11)) {
                                defaultUri = null;
                            } else if ("default".equals(e11) || resources.getIdentifier(e11, "raw", packageName) == 0) {
                                defaultUri = RingtoneManager.getDefaultUri(2);
                            } else {
                                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e11);
                            }
                            if (defaultUri != null) {
                                iVar.f(defaultUri);
                            }
                            e12 = oVar.e("gcm.n.click_action");
                            if (TextUtils.isEmpty(e12)) {
                                launchIntentForPackage = new Intent(e12);
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setFlags(268435456);
                            } else {
                                String e19 = oVar.e("gcm.n.link_android");
                                if (TextUtils.isEmpty(e19)) {
                                    e19 = oVar.e("gcm.n.link");
                                }
                                Uri parse = !TextUtils.isEmpty(e19) ? Uri.parse(e19) : null;
                                if (parse != null) {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setData(parse);
                                } else {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
                            if (launchIntentForPackage != null) {
                                activity = null;
                            } else {
                                launchIntentForPackage.addFlags(67108864);
                                Bundle bundle3 = oVar.f1806a;
                                Bundle bundle4 = new Bundle(bundle3);
                                for (String str : bundle3.keySet()) {
                                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                        bundle4.remove(str);
                                    }
                                }
                                launchIntentForPackage.putExtras(bundle4);
                                if (oVar.a("google.c.a.e")) {
                                    launchIntentForPackage.putExtra("gcm.n.analytics_data", oVar.g());
                                }
                                activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
                            iVar.f8242g = activity;
                            broadcast = oVar.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(oVar.g())), 1140850688);
                            if (broadcast != null) {
                                iVar.f8257v.deleteIntent = broadcast;
                            }
                            e13 = oVar.e("gcm.n.color");
                            if (!TextUtils.isEmpty(e13)) {
                                try {
                                    valueOf = Integer.valueOf(Color.parseColor(e13));
                                } catch (IllegalArgumentException unused2) {
                                    Log.w("FirebaseMessaging", "Color is invalid: " + e13 + ". Notification will use default color.");
                                }
                                if (valueOf != null) {
                                    iVar.f8252q = valueOf.intValue();
                                }
                                iVar.d(16, !oVar.a("gcm.n.sticky"));
                                iVar.f8250o = oVar.a("gcm.n.local_only");
                                e14 = oVar.e("gcm.n.ticker");
                                if (e14 != null) {
                                    iVar.f8257v.tickerText = x2.i.b(e14);
                                }
                                b2 = oVar.b("gcm.n.notification_priority");
                                if (b2 != null) {
                                    if (b2.intValue() < -2 || b2.intValue() > 2) {
                                        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b2 + ". Skipping setting notificationPriority.");
                                    }
                                    if (b2 != null) {
                                        iVar.f8245j = b2.intValue();
                                    }
                                    b10 = oVar.b("gcm.n.visibility");
                                    if (b10 != null) {
                                        if (b10.intValue() < -1 || b10.intValue() > i10) {
                                            Log.w("NotificationParams", "visibility is invalid: " + b10 + ". Skipping setting visibility.");
                                        }
                                        if (b10 != null) {
                                            iVar.f8253r = b10.intValue();
                                        }
                                        b11 = oVar.b("gcm.n.notification_count");
                                        if (b11 != null) {
                                            if (b11.intValue() < 0) {
                                                Log.w("FirebaseMessaging", "notificationCount is invalid: " + b11 + ". Skipping setting notificationCount.");
                                            }
                                            if (b11 != null) {
                                                iVar.f8244i = b11.intValue();
                                            }
                                            e15 = oVar.e("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(e15)) {
                                                try {
                                                    valueOf2 = Long.valueOf(Long.parseLong(e15));
                                                } catch (NumberFormatException unused3) {
                                                    Log.w("NotificationParams", "Couldn't parse value of " + d8.o.h("gcm.n.event_time") + "(" + e15 + ") into a long");
                                                }
                                                if (valueOf2 != null) {
                                                    iVar.f8246k = true;
                                                    iVar.f8257v.when = valueOf2.longValue();
                                                }
                                                c3 = oVar.c("gcm.n.vibrate_timings");
                                                if (c3 != null) {
                                                    try {
                                                    } catch (NumberFormatException | JSONException unused4) {
                                                        Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c3 + ". Skipping setting vibrateTimings.");
                                                    }
                                                    if (c3.length() <= 1) {
                                                        throw new JSONException("vibrateTimings have invalid length");
                                                    }
                                                    int length = c3.length();
                                                    jArr = new long[length];
                                                    for (int i14 = 0; i14 < length; i14++) {
                                                        jArr[i14] = c3.optLong(i14);
                                                    }
                                                    if (jArr != null) {
                                                        iVar.f8257v.vibrate = jArr;
                                                    }
                                                    c7 = oVar.c("gcm.n.light_settings");
                                                    if (c7 != null) {
                                                        iArr = new int[3];
                                                        try {
                                                        } catch (IllegalArgumentException e20) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + c7 + ". " + e20.getMessage() + ". Skipping setting LightSettings");
                                                        } catch (JSONException unused5) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + c7 + ". Skipping setting LightSettings");
                                                        }
                                                        if (c7.length() != 3) {
                                                            throw new JSONException("lightSettings don't have all three fields");
                                                        }
                                                        int parseColor = Color.parseColor(c7.optString(0));
                                                        if (parseColor == -16777216) {
                                                            throw new IllegalArgumentException("Transparent color is invalid");
                                                        }
                                                        iArr[0] = parseColor;
                                                        iArr[1] = c7.optInt(1);
                                                        iArr[2] = c7.optInt(2);
                                                        if (iArr != null) {
                                                            int i15 = iArr[0];
                                                            int i16 = iArr[1];
                                                            int i17 = iArr[2];
                                                            Notification notification = iVar.f8257v;
                                                            notification.ledARGB = i15;
                                                            notification.ledOnMS = i16;
                                                            notification.ledOffMS = i17;
                                                            notification.flags = ((i16 == 0 || i17 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                        }
                                                        boolean a6 = oVar.a("gcm.n.default_sound");
                                                        boolean z11 = a6;
                                                        if (oVar.a("gcm.n.default_vibrate_timings")) {
                                                            z11 = (a6 ? 1 : 0) | 2;
                                                        }
                                                        int i18 = z11;
                                                        if (oVar.a("gcm.n.default_light_settings")) {
                                                            i18 = (z11 ? 1 : 0) | 4;
                                                        }
                                                        iVar.c(i18);
                                                        e16 = oVar.e("gcm.n.tag");
                                                        if (TextUtils.isEmpty(e16)) {
                                                            e16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                        }
                                                        String str2 = e16;
                                                        if (nVar != null) {
                                                            try {
                                                                g7.o oVar2 = nVar.f1805i;
                                                                u.g(oVar2);
                                                                Bitmap bitmap = (Bitmap) i7.b.m(oVar2, 5L, TimeUnit.SECONDS);
                                                                iVar.e(bitmap);
                                                                x2.f fVar = new x2.f();
                                                                if (bitmap == null) {
                                                                    iconCompat = null;
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = true;
                                                                    iconCompat = new IconCompat(1);
                                                                    iconCompat.f619b = bitmap;
                                                                }
                                                                fVar.f8231e = iconCompat;
                                                                fVar.f8232f = null;
                                                                fVar.f8233g = z10;
                                                                iVar.g(fVar);
                                                            } catch (InterruptedException unused6) {
                                                                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                nVar.close();
                                                                Thread.currentThread().interrupt();
                                                            } catch (ExecutionException e21) {
                                                                Log.w("FirebaseMessaging", "Failed to download image: " + e21.getCause());
                                                            } catch (TimeoutException unused7) {
                                                                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                nVar.close();
                                                            }
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                            Log.d("FirebaseMessaging", "Showing notification");
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str2, 0, iVar.a());
                                                        return true;
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean a62 = oVar.a("gcm.n.default_sound");
                                                    boolean z112 = a62;
                                                    if (oVar.a("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i182 = z112;
                                                    if (oVar.a("gcm.n.default_light_settings")) {
                                                    }
                                                    iVar.c(i182);
                                                    e16 = oVar.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e16)) {
                                                    }
                                                    String str22 = e16;
                                                    if (nVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str22, 0, iVar.a());
                                                    return true;
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                c7 = oVar.c("gcm.n.light_settings");
                                                if (c7 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean a622 = oVar.a("gcm.n.default_sound");
                                                boolean z1122 = a622;
                                                if (oVar.a("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i1822 = z1122;
                                                if (oVar.a("gcm.n.default_light_settings")) {
                                                }
                                                iVar.c(i1822);
                                                e16 = oVar.e("gcm.n.tag");
                                                if (TextUtils.isEmpty(e16)) {
                                                }
                                                String str222 = e16;
                                                if (nVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str222, 0, iVar.a());
                                                return true;
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            c3 = oVar.c("gcm.n.vibrate_timings");
                                            if (c3 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c7 = oVar.c("gcm.n.light_settings");
                                            if (c7 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a6222 = oVar.a("gcm.n.default_sound");
                                            boolean z11222 = a6222;
                                            if (oVar.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i18222 = z11222;
                                            if (oVar.a("gcm.n.default_light_settings")) {
                                            }
                                            iVar.c(i18222);
                                            e16 = oVar.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e16)) {
                                            }
                                            String str2222 = e16;
                                            if (nVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str2222, 0, iVar.a());
                                            return true;
                                        }
                                        b11 = null;
                                        if (b11 != null) {
                                        }
                                        e15 = oVar.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e15)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c3 = oVar.c("gcm.n.vibrate_timings");
                                        if (c3 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c7 = oVar.c("gcm.n.light_settings");
                                        if (c7 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a62222 = oVar.a("gcm.n.default_sound");
                                        boolean z112222 = a62222;
                                        if (oVar.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i182222 = z112222;
                                        if (oVar.a("gcm.n.default_light_settings")) {
                                        }
                                        iVar.c(i182222);
                                        e16 = oVar.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e16)) {
                                        }
                                        String str22222 = e16;
                                        if (nVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str22222, 0, iVar.a());
                                        return true;
                                    }
                                    b10 = null;
                                    if (b10 != null) {
                                    }
                                    b11 = oVar.b("gcm.n.notification_count");
                                    if (b11 != null) {
                                    }
                                    b11 = null;
                                    if (b11 != null) {
                                    }
                                    e15 = oVar.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c3 = oVar.c("gcm.n.vibrate_timings");
                                    if (c3 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c7 = oVar.c("gcm.n.light_settings");
                                    if (c7 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a622222 = oVar.a("gcm.n.default_sound");
                                    boolean z1122222 = a622222;
                                    if (oVar.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i1822222 = z1122222;
                                    if (oVar.a("gcm.n.default_light_settings")) {
                                    }
                                    iVar.c(i1822222);
                                    e16 = oVar.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e16)) {
                                    }
                                    String str222222 = e16;
                                    if (nVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str222222, 0, iVar.a());
                                    return true;
                                }
                                b2 = null;
                                if (b2 != null) {
                                }
                                b10 = oVar.b("gcm.n.visibility");
                                if (b10 != null) {
                                }
                                b10 = null;
                                if (b10 != null) {
                                }
                                b11 = oVar.b("gcm.n.notification_count");
                                if (b11 != null) {
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                e15 = oVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c3 = oVar.c("gcm.n.vibrate_timings");
                                if (c3 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c7 = oVar.c("gcm.n.light_settings");
                                if (c7 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a6222222 = oVar.a("gcm.n.default_sound");
                                boolean z11222222 = a6222222;
                                if (oVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                int i18222222 = z11222222;
                                if (oVar.a("gcm.n.default_light_settings")) {
                                }
                                iVar.c(i18222222);
                                e16 = oVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e16)) {
                                }
                                String str2222222 = e16;
                                if (nVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str2222222, 0, iVar.a());
                                return true;
                            }
                            i13 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i13 != 0) {
                                try {
                                    valueOf = Integer.valueOf(firebaseMessagingService.getColor(i13));
                                } catch (Resources.NotFoundException unused8) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                                if (valueOf != null) {
                                }
                                iVar.d(16, !oVar.a("gcm.n.sticky"));
                                iVar.f8250o = oVar.a("gcm.n.local_only");
                                e14 = oVar.e("gcm.n.ticker");
                                if (e14 != null) {
                                }
                                b2 = oVar.b("gcm.n.notification_priority");
                                if (b2 != null) {
                                }
                                b2 = null;
                                if (b2 != null) {
                                }
                                b10 = oVar.b("gcm.n.visibility");
                                if (b10 != null) {
                                }
                                b10 = null;
                                if (b10 != null) {
                                }
                                b11 = oVar.b("gcm.n.notification_count");
                                if (b11 != null) {
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                e15 = oVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c3 = oVar.c("gcm.n.vibrate_timings");
                                if (c3 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c7 = oVar.c("gcm.n.light_settings");
                                if (c7 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a62222222 = oVar.a("gcm.n.default_sound");
                                boolean z112222222 = a62222222;
                                if (oVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                int i182222222 = z112222222;
                                if (oVar.a("gcm.n.default_light_settings")) {
                                }
                                iVar.c(i182222222);
                                e16 = oVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e16)) {
                                }
                                String str22222222 = e16;
                                if (nVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str22222222, 0, iVar.a());
                                return true;
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            iVar.d(16, !oVar.a("gcm.n.sticky"));
                            iVar.f8250o = oVar.a("gcm.n.local_only");
                            e14 = oVar.e("gcm.n.ticker");
                            if (e14 != null) {
                            }
                            b2 = oVar.b("gcm.n.notification_priority");
                            if (b2 != null) {
                            }
                            b2 = null;
                            if (b2 != null) {
                            }
                            b10 = oVar.b("gcm.n.visibility");
                            if (b10 != null) {
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = oVar.b("gcm.n.notification_count");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            e15 = oVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c3 = oVar.c("gcm.n.vibrate_timings");
                            if (c3 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c7 = oVar.c("gcm.n.light_settings");
                            if (c7 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a622222222 = oVar.a("gcm.n.default_sound");
                            boolean z1122222222 = a622222222;
                            if (oVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            int i1822222222 = z1122222222;
                            if (oVar.a("gcm.n.default_light_settings")) {
                            }
                            iVar.c(i1822222222);
                            e16 = oVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e16)) {
                            }
                            String str222222222 = e16;
                            if (nVar != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str222222222, 0, iVar.a());
                            return true;
                        }
                        i10 = 1;
                        Log.w("FirebaseMessaging", "Icon resource " + e10 + " not found. Notification will use default icon.");
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i11 != 0 || !d8.e.a(resources, i11)) {
                        i11 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    i12 = (i11 == 0 && d8.e.a(resources, i11)) ? i11 : 17301651;
                    iVar.f8257v.icon = i12;
                    e11 = oVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (!TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = oVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e12)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    iVar.f8242g = activity;
                    if (oVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = oVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i13 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i13 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    iVar.d(16, !oVar.a("gcm.n.sticky"));
                    iVar.f8250o = oVar.a("gcm.n.local_only");
                    e14 = oVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b2 = oVar.b("gcm.n.notification_priority");
                    if (b2 != null) {
                    }
                    b2 = null;
                    if (b2 != null) {
                    }
                    b10 = oVar.b("gcm.n.visibility");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = oVar.b("gcm.n.notification_count");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    e15 = oVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c3 = oVar.c("gcm.n.vibrate_timings");
                    if (c3 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c7 = oVar.c("gcm.n.light_settings");
                    if (c7 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a6222222222 = oVar.a("gcm.n.default_sound");
                    boolean z11222222222 = a6222222222;
                    if (oVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i18222222222 = z11222222222;
                    if (oVar.a("gcm.n.default_light_settings")) {
                    }
                    iVar.c(i18222222222);
                    e16 = oVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    String str2222222222 = e16;
                    if (nVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str2222222222, 0, iVar.a());
                    return true;
                }
                e18 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    atomicInteger = d8.e.f1766a;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    x2.i iVar2 = new x2.i(firebaseMessagingService, e18);
                    d10 = oVar.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d10)) {
                    }
                    d11 = oVar.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d11)) {
                    }
                    e10 = oVar.e("gcm.n.icon");
                    if (TextUtils.isEmpty(e10)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i11 != 0) {
                    }
                    i11 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i11 == 0) {
                    }
                    iVar2.f8257v.icon = i12;
                    e11 = oVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (!TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = oVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e12)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    iVar2.f8242g = activity;
                    if (oVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = oVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i13 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i13 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    iVar2.d(16, !oVar.a("gcm.n.sticky"));
                    iVar2.f8250o = oVar.a("gcm.n.local_only");
                    e14 = oVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b2 = oVar.b("gcm.n.notification_priority");
                    if (b2 != null) {
                    }
                    b2 = null;
                    if (b2 != null) {
                    }
                    b10 = oVar.b("gcm.n.visibility");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = oVar.b("gcm.n.notification_count");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    e15 = oVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c3 = oVar.c("gcm.n.vibrate_timings");
                    if (c3 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c7 = oVar.c("gcm.n.light_settings");
                    if (c7 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a62222222222 = oVar.a("gcm.n.default_sound");
                    boolean z112222222222 = a62222222222;
                    if (oVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i182222222222 = z112222222222;
                    if (oVar.a("gcm.n.default_light_settings")) {
                    }
                    iVar2.c(i182222222222);
                    e16 = oVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    String str22222222222 = e16;
                    if (nVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str22222222222, 0, iVar2.a());
                    return true;
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e18 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                atomicInteger = d8.e.f1766a;
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                x2.i iVar22 = new x2.i(firebaseMessagingService, e18);
                d10 = oVar.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d10)) {
                }
                d11 = oVar.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d11)) {
                }
                e10 = oVar.e("gcm.n.icon");
                if (TextUtils.isEmpty(e10)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i11 != 0) {
                }
                i11 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i11 == 0) {
                }
                iVar22.f8257v.icon = i12;
                e11 = oVar.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e11)) {
                }
                if (!TextUtils.isEmpty(e11)) {
                }
                if (defaultUri != null) {
                }
                e12 = oVar.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e12)) {
                }
                if (launchIntentForPackage != null) {
                }
                iVar22.f8242g = activity;
                if (oVar.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e13 = oVar.e("gcm.n.color");
                if (!TextUtils.isEmpty(e13)) {
                }
                i13 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i13 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                iVar22.d(16, !oVar.a("gcm.n.sticky"));
                iVar22.f8250o = oVar.a("gcm.n.local_only");
                e14 = oVar.e("gcm.n.ticker");
                if (e14 != null) {
                }
                b2 = oVar.b("gcm.n.notification_priority");
                if (b2 != null) {
                }
                b2 = null;
                if (b2 != null) {
                }
                b10 = oVar.b("gcm.n.visibility");
                if (b10 != null) {
                }
                b10 = null;
                if (b10 != null) {
                }
                b11 = oVar.b("gcm.n.notification_count");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                e15 = oVar.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e15)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c3 = oVar.c("gcm.n.vibrate_timings");
                if (c3 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c7 = oVar.c("gcm.n.light_settings");
                if (c7 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a622222222222 = oVar.a("gcm.n.default_sound");
                boolean z1122222222222 = a622222222222;
                if (oVar.a("gcm.n.default_vibrate_timings")) {
                }
                int i1822222222222 = z1122222222222;
                if (oVar.a("gcm.n.default_light_settings")) {
                }
                iVar22.c(i1822222222222);
                e16 = oVar.e("gcm.n.tag");
                if (TextUtils.isEmpty(e16)) {
                }
                String str222222222222 = e16;
                if (nVar != null) {
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str222222222222, 0, iVar22.a());
                return true;
            }
            e18 = null;
            atomicInteger = d8.e.f1766a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            x2.i iVar222 = new x2.i(firebaseMessagingService, e18);
            d10 = oVar.d(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(d10)) {
            }
            d11 = oVar.d(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(d11)) {
            }
            e10 = oVar.e("gcm.n.icon");
            if (TextUtils.isEmpty(e10)) {
            }
            i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i11 != 0) {
            }
            i11 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i11 == 0) {
            }
            iVar222.f8257v.icon = i12;
            e11 = oVar.e("gcm.n.sound2");
            if (TextUtils.isEmpty(e11)) {
            }
            if (!TextUtils.isEmpty(e11)) {
            }
            if (defaultUri != null) {
            }
            e12 = oVar.e("gcm.n.click_action");
            if (TextUtils.isEmpty(e12)) {
            }
            if (launchIntentForPackage != null) {
            }
            iVar222.f8242g = activity;
            if (oVar.a("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            e13 = oVar.e("gcm.n.color");
            if (!TextUtils.isEmpty(e13)) {
            }
            i13 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i13 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            iVar222.d(16, !oVar.a("gcm.n.sticky"));
            iVar222.f8250o = oVar.a("gcm.n.local_only");
            e14 = oVar.e("gcm.n.ticker");
            if (e14 != null) {
            }
            b2 = oVar.b("gcm.n.notification_priority");
            if (b2 != null) {
            }
            b2 = null;
            if (b2 != null) {
            }
            b10 = oVar.b("gcm.n.visibility");
            if (b10 != null) {
            }
            b10 = null;
            if (b10 != null) {
            }
            b11 = oVar.b("gcm.n.notification_count");
            if (b11 != null) {
            }
            b11 = null;
            if (b11 != null) {
            }
            e15 = oVar.e("gcm.n.event_time");
            if (!TextUtils.isEmpty(e15)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            c3 = oVar.c("gcm.n.vibrate_timings");
            if (c3 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            c7 = oVar.c("gcm.n.light_settings");
            if (c7 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean a6222222222222 = oVar.a("gcm.n.default_sound");
            boolean z11222222222222 = a6222222222222;
            if (oVar.a("gcm.n.default_vibrate_timings")) {
            }
            int i18222222222222 = z11222222222222;
            if (oVar.a("gcm.n.default_light_settings")) {
            }
            iVar222.c(i18222222222222);
            e16 = oVar.e("gcm.n.tag");
            if (TextUtils.isEmpty(e16)) {
            }
            String str2222222222222 = e16;
            if (nVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str2222222222222, 0, iVar222.a());
            return true;
        }
        nVar = null;
        if (nVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f261g;
        oVar = (d8.o) this.f263i;
        AtomicInteger atomicInteger22 = d8.e.f1766a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String e182 = oVar.e("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        e182 = null;
        atomicInteger = d8.e.f1766a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        x2.i iVar2222 = new x2.i(firebaseMessagingService, e182);
        d10 = oVar.d(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d10)) {
        }
        d11 = oVar.d(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d11)) {
        }
        e10 = oVar.e("gcm.n.icon");
        if (TextUtils.isEmpty(e10)) {
        }
        i11 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i11 != 0) {
        }
        i11 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i11 == 0) {
        }
        iVar2222.f8257v.icon = i12;
        e11 = oVar.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e11)) {
        }
        if (!TextUtils.isEmpty(e11)) {
        }
        if (defaultUri != null) {
        }
        e12 = oVar.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e12)) {
        }
        if (launchIntentForPackage != null) {
        }
        iVar2222.f8242g = activity;
        if (oVar.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e13 = oVar.e("gcm.n.color");
        if (!TextUtils.isEmpty(e13)) {
        }
        i13 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i13 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        iVar2222.d(16, !oVar.a("gcm.n.sticky"));
        iVar2222.f8250o = oVar.a("gcm.n.local_only");
        e14 = oVar.e("gcm.n.ticker");
        if (e14 != null) {
        }
        b2 = oVar.b("gcm.n.notification_priority");
        if (b2 != null) {
        }
        b2 = null;
        if (b2 != null) {
        }
        b10 = oVar.b("gcm.n.visibility");
        if (b10 != null) {
        }
        b10 = null;
        if (b10 != null) {
        }
        b11 = oVar.b("gcm.n.notification_count");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        e15 = oVar.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c3 = oVar.c("gcm.n.vibrate_timings");
        if (c3 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c7 = oVar.c("gcm.n.light_settings");
        if (c7 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a62222222222222 = oVar.a("gcm.n.default_sound");
        boolean z112222222222222 = a62222222222222;
        if (oVar.a("gcm.n.default_vibrate_timings")) {
        }
        int i182222222222222 = z112222222222222;
        if (oVar.a("gcm.n.default_light_settings")) {
        }
        iVar2222.c(i182222222222222);
        e16 = oVar.e("gcm.n.tag");
        if (TextUtils.isEmpty(e16)) {
        }
        String str22222222222222 = e16;
        if (nVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f261g).getSystemService("notification")).notify(str22222222222222, 0, iVar2222.a());
        return true;
    }

    public boolean z(CharSequence charSequence, int i10, int i11, q3.t tVar) {
        if ((tVar.f5795c & 3) == 0) {
            q3.g gVar = (q3.g) this.f263i;
            r3.a b2 = tVar.b();
            int a6 = b2.a(8);
            if (a6 != 0) {
                ((ByteBuffer) b2.f1313j).getShort(a6 + b2.f1310g);
            }
            q3.d dVar = (q3.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = q3.d.f5751b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f5752a;
            String sb2 = sb.toString();
            int i12 = a3.c.f198a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i13 = tVar.f5795c & 4;
            tVar.f5795c = hasGlyph ? i13 | 2 : i13 | 1;
        }
        return (tVar.f5795c & 3) == 2;
    }

    public c(int i10) {
        switch (i10) {
            case 11:
                this.f262h = new WeakHashMap();
                this.f261g = new WeakHashMap();
                this.f263i = new WeakHashMap();
                break;
            case 13:
                List list = Collections.EMPTY_LIST;
                this.f262h = list;
                this.f261g = list;
                break;
            case 15:
                this.f262h = bc.n.L(new ac.i("_2", Integer.valueOf(R.drawable._2)), new ac.i("_3", Integer.valueOf(R.drawable._3)), new ac.i("_4", Integer.valueOf(R.drawable._4)), new ac.i("_5", Integer.valueOf(R.drawable._5)), new ac.i("_6", Integer.valueOf(R.drawable._6)), new ac.i("_8", Integer.valueOf(R.drawable._8)), new ac.i("_9", Integer.valueOf(R.drawable._9)), new ac.i("_10", Integer.valueOf(R.drawable._10)), new ac.i("_a", Integer.valueOf(R.drawable._a)), new ac.i("_k", Integer.valueOf(R.drawable._k)), new ac.i("_q", Integer.valueOf(R.drawable._q)));
                this.f261g = new ac.i("_7", Integer.valueOf(R.drawable._7));
                this.f263i = new ac.i("_j", Integer.valueOf(R.drawable._j));
                break;
            case 19:
                this.f262h = new AtomicReference(u0.e.f6670c);
                this.f261g = new Object();
                break;
            case 24:
                this.f262h = new g(22);
                this.f261g = new g(22);
                this.f263i = new g(22);
                break;
            default:
                this.f263i = new m6.i(11);
                break;
        }
    }

    public c(Context context, TypedArray typedArray) {
        this.f262h = context;
        this.f261g = typedArray;
    }

    public c(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        j.d(randomUUID, "randomUUID()");
        this.f262h = randomUUID;
        String uuid = ((UUID) this.f262h).toString();
        j.d(uuid, "id.toString()");
        this.f261g = new x4.p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(bc.a0.B(1));
        linkedHashSet.add(strArr[0]);
        this.f263i = linkedHashSet;
        ((x4.p) this.f261g).f8325d = OverwritingInputMerger.class.getName();
    }

    public c(n nVar, t4.b bVar) {
        j.e(nVar, "trackers");
        v4.e eVar = (v4.e) nVar.f8316a;
        j.e(eVar, "tracker");
        u4.a aVar = new u4.a(eVar, 0);
        v4.a aVar2 = (v4.a) nVar.f8317b;
        j.e(aVar2, "tracker");
        u4.a aVar3 = new u4.a(aVar2, 1);
        v4.e eVar2 = (v4.e) nVar.f8319d;
        j.e(eVar2, "tracker");
        u4.a aVar4 = new u4.a(eVar2, 4);
        v4.e eVar3 = (v4.e) nVar.f8318c;
        j.e(eVar3, "tracker");
        u4.a aVar5 = new u4.a(eVar3, 2);
        j.e(eVar3, "tracker");
        u4.a aVar6 = new u4.a(eVar3, 3);
        j.e(eVar3, "tracker");
        u4.d dVar = new u4.d(eVar3);
        j.e(eVar3, "tracker");
        u4.b[] bVarArr = {aVar, aVar3, aVar4, aVar5, aVar6, dVar, new u4.c(eVar3)};
        this.f262h = bVar;
        this.f261g = bVarArr;
        this.f263i = new Object();
    }

    public c(k2.t tVar, c cVar) {
        this.f262h = tVar;
        this.f261g = cVar;
        this.f263i = tVar.f3625g;
    }

    public c(x1.g0 g0Var) {
        this.f262h = g0Var;
        this.f261g = new ArrayList();
        this.f263i = g0Var;
    }
}
