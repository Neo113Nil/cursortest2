package com.gamericefishpro.space.a8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import androidx.work.OverwritingInputMerger;
import com.gamericefishpro.space.b1.n;
import com.gamericefishpro.space.b1.p;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.c8.h;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.c8.m;
import com.gamericefishpro.space.c8.r;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.y1;
import com.gamericefishpro.space.jb.f;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.n.z;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.n9.d4;
import com.gamericefishpro.space.n9.e0;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.n4;
import com.gamericefishpro.space.n9.o3;
import com.gamericefishpro.space.n9.r0;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.t0;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.v2;
import com.gamericefishpro.space.n9.x0;
import com.gamericefishpro.space.n9.z0;
import com.gamericefishpro.space.n9.z2;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.r9.i;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.p0;
import com.gamericefishpro.space.tb.o;
import com.gamericefishpro.space.v8.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.zip.Adler32;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.e8.b, com.gamericefishpro.space.e1.e, MatchResult, v2, x0 {
    public static c w;
    public final /* synthetic */ int d;
    public Object e;
    public Object i;
    public Object v;

    public /* synthetic */ c(int i, boolean z) {
        this.d = i;
    }

    public static c t(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A(com.gamericefishpro.space.z7.a aVar) {
        s sVar = new s(1);
        r rVar = (r) this.v;
        j jVar = (j) this.e;
        com.gamericefishpro.space.z7.c cVar = (com.gamericefishpro.space.z7.c) this.i;
        com.gamericefishpro.space.h8.c cVar2 = rVar.c;
        c cVarA = j.a();
        cVarA.C(jVar.a);
        cVarA.i = com.gamericefishpro.space.z7.d.d;
        cVarA.e = jVar.b;
        j jVarE = cVarA.e();
        h hVar = new h();
        hVar.f = new HashMap();
        hVar.d = Long.valueOf(rVar.a.d());
        hVar.e = Long.valueOf(rVar.b.d());
        hVar.a = "FCM_CLIENT_EVENT_LOGGING";
        com.gamericefishpro.space.ub.e eVar = aVar.a;
        c cVar3 = o.a;
        cVar3.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar3.h(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        hVar.c = new m(cVar, byteArrayOutputStream.toByteArray());
        hVar.b = null;
        com.gamericefishpro.space.h8.b bVar = (com.gamericefishpro.space.h8.b) cVar2;
        bVar.b.execute(new com.appsflyer.internal.d(bVar, jVarE, sVar, hVar.h()));
    }

    public void B(Object obj) {
        long jB = n.b();
        if (jB == p.a) {
            this.v = obj;
            return;
        }
        synchronized (this.i) {
            com.gamericefishpro.space.b1.o oVar = (com.gamericefishpro.space.b1.o) ((AtomicReference) this.e).get();
            int iA = oVar.a(jB);
            if (iA >= 0) {
                oVar.c[iA] = obj;
            } else {
                ((AtomicReference) this.e).set(oVar.b(jB, obj));
                Unit unit = Unit.a;
            }
        }
    }

    public void C(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.v = str;
    }

    public void D(q qVar) {
        ((com.gamericefishpro.space.q1.b) this.v).d.c = qVar;
    }

    public void E(com.gamericefishpro.space.c3.c cVar) {
        ((com.gamericefishpro.space.q1.b) this.v).d.a = cVar;
    }

    public void F(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ((com.gamericefishpro.space.u6.p) this.i).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((com.gamericefishpro.space.u6.p) this.i).g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void G(l lVar) {
        ((com.gamericefishpro.space.q1.b) this.v).d.b = lVar;
    }

    public void H(long j) {
        ((com.gamericefishpro.space.q1.b) this.v).d.d = j;
    }

    public void I(com.gamericefishpro.space.k3.e eVar, int i, int i2, int i3) {
        int i4 = eVar.a0;
        int i5 = eVar.b0;
        eVar.a0 = 0;
        eVar.b0 = 0;
        eVar.J(i2);
        eVar.G(i3);
        if (i4 < 0) {
            eVar.a0 = 0;
        } else {
            eVar.a0 = i4;
        }
        if (i5 < 0) {
            eVar.b0 = 0;
        } else {
            eVar.b0 = i5;
        }
        com.gamericefishpro.space.k3.e eVar2 = (com.gamericefishpro.space.k3.e) this.v;
        eVar2.s0 = i;
        eVar2.P();
    }

    public void J() {
        h0 h0Var = (h0) this.e;
        String str = (String) this.v;
        List list = (List) h0Var.k(str);
        if (list != null) {
            list.remove((Function0) this.i);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.m(str, list);
    }

    public void K(com.gamericefishpro.space.k3.e eVar) {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        int size = eVar.p0.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) eVar.p0.get(i);
            int[] iArr = dVar.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.r0.b = true;
    }

    public synchronized void L(int i, int i2, long j, long j2) {
        ((r1) this.e).D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.v;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        com.gamericefishpro.space.r9.o oVarB = ((com.gamericefishpro.space.x8.b) this.i).b(new com.gamericefishpro.space.v8.n(0, Arrays.asList(new k(36301, i, 0, j, j2, null, null, 0, i2))));
        r0 r0Var = new r0(this, jElapsedRealtime, 0);
        oVarB.getClass();
        oVarB.c(i.a, r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r9
      0x0033: PHI (r9v9 int) = (r9v1 int), (r9v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // com.gamericefishpro.space.n9.v2
    public void a(int i, Throwable th, byte[] bArr) {
        z2 z2Var;
        t2 t2Var = (t2) this.e;
        t2Var.r();
        d4 d4Var = (d4) this.v;
        if (i == 200 || i == 204) {
            if (th == null) {
                v0 v0Var = ((r1) t2Var.d).y;
                r1.l(v0Var);
                v0Var.G.b(Long.valueOf(d4Var.d), "[sgtm] Upload succeeded for row_id");
                z2Var = z2.SUCCESS;
            } else {
                v0 v0Var2 = ((r1) t2Var.d).y;
                r1.l(v0Var2);
                v0Var2.B.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(d4Var.d), Integer.valueOf(i), th);
                if (Arrays.asList(((String) e0.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    z2Var = z2.BACKOFF;
                } else {
                    z2Var = z2.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                v0 v0Var3 = ((r1) t2Var.d).y;
                r1.l(v0Var3);
                v0Var3.G.b(Long.valueOf(d4Var.d), "[sgtm] Upload succeeded for row_id");
                z2Var = z2.SUCCESS;
            } else {
                v0 v0Var4 = ((r1) t2Var.d).y;
                r1.l(v0Var4);
                v0Var4.B.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(d4Var.d), Integer.valueOf(i), th);
                if (Arrays.asList(((String) e0.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    z2Var = z2.BACKOFF;
                } else {
                    z2Var = z2.FAILURE;
                }
            }
        } else {
            v0 v0Var5 = ((r1) t2Var.d).y;
            r1.l(v0Var5);
            v0Var5.B.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(d4Var.d), Integer.valueOf(i), th);
            if (Arrays.asList(((String) e0.u.a(null)).split(",")).contains(String.valueOf(i))) {
                z2Var = z2.BACKOFF;
            } else {
                z2Var = z2.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.i;
        o3 o3VarO = ((r1) t2Var.d).o();
        long j = d4Var.d;
        com.gamericefishpro.space.n9.d dVar = new com.gamericefishpro.space.n9.d(z2Var.d, j, d4Var.y);
        o3VarO.r();
        o3VarO.s();
        o3VarO.F(new com.gamericefishpro.space.m6.e((Object) o3VarO, (Object) o3VarO.H(true), (Object) dVar, 8));
        v0 v0Var6 = ((r1) t2Var.d).y;
        r1.l(v0Var6);
        v0Var6.G.c("[sgtm] Updated status for row_id", Long.valueOf(j), z2Var);
        synchronized (atomicReference) {
            atomicReference.set(z2Var);
            atomicReference.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r9
      0x006b: PHI (r9v8 int) = (r9v2 int), (r9v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.gamericefishpro.space.n9.x0
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        z0 z0Var;
        com.gamericefishpro.space.n9.m mVar;
        String strSubstring;
        Object obj;
        switch (this.d) {
            case 23:
                ((m4) this.i).y(true, i, th, bArr, (String) this.v, (ArrayList) this.e);
                return;
            default:
                long j = ((n4) this.e).a;
                m4 m4Var = (m4) this.i;
                String str2 = (String) this.v;
                m4Var.c().r();
                m4Var.k0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        m4Var.N = false;
                        m4Var.O();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        com.gamericefishpro.space.n9.m mVar2 = m4Var.i;
                        m4.T(mVar2);
                        mVar2.y(Long.valueOf(j));
                        m4Var.a().G.c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                        z0Var = m4Var.e;
                        m4.T(z0Var);
                        if (z0Var.L()) {
                            mVar = m4Var.i;
                            m4.T(mVar);
                            if (mVar.x(str2)) {
                                m4Var.t(str2);
                            } else {
                                m4Var.N();
                            }
                        } else {
                            m4Var.N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        t0 t0Var = m4Var.a().D;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        t0Var.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        com.gamericefishpro.space.n9.m mVar3 = m4Var.i;
                        m4.T(mVar3);
                        mVar3.D(Long.valueOf(j));
                        m4Var.N();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        com.gamericefishpro.space.n9.m mVar4 = m4Var.i;
                        m4.T(mVar4);
                        mVar4.y(Long.valueOf(j));
                        m4Var.a().G.c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                        z0Var = m4Var.e;
                        m4.T(z0Var);
                        if (z0Var.L()) {
                            mVar = m4Var.i;
                            m4.T(mVar);
                            if (mVar.x(str2)) {
                                m4Var.t(str2);
                            } else {
                                m4Var.N();
                            }
                        } else {
                            m4Var.N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        t0 t0Var2 = m4Var.a().D;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        t0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        com.gamericefishpro.space.n9.m mVar5 = m4Var.i;
                        m4.T(mVar5);
                        mVar5.D(Long.valueOf(j));
                        m4Var.N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    t0 t0Var3 = m4Var.a().D;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    t0Var3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    com.gamericefishpro.space.n9.m mVar6 = m4Var.i;
                    m4.T(mVar6);
                    mVar6.D(Long.valueOf(j));
                    m4Var.N();
                }
                return;
        }
    }

    public void c(f0 f0Var, com.gamericefishpro.space.h2.s sVar) {
        com.gamericefishpro.space.vb.c cVar = (com.gamericefishpro.space.vb.c) this.e;
        com.gamericefishpro.space.vb.c cVar2 = (com.gamericefishpro.space.vb.c) this.i;
        com.gamericefishpro.space.vb.c cVar3 = (com.gamericefishpro.space.vb.c) this.v;
        int iOrdinal = sVar.ordinal();
        if (iOrdinal == 0) {
            cVar.g(f0Var);
            cVar3.g(f0Var);
            return;
        }
        if (iOrdinal == 1) {
            cVar2.g(f0Var);
            cVar3.g(f0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (f0Var.B != null) {
                cVar3.g(f0Var);
                return;
            } else {
                cVar.g(f0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new com.gamericefishpro.space.oh.k();
        }
        if (f0Var.B != null) {
            cVar3.g(f0Var);
        } else {
            cVar2.g(f0Var);
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.d) {
            case 13:
                c cVar = new c(((com.gamericefishpro.space.i9.b) this.e).clone());
                ArrayList arrayList = (ArrayList) this.v;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) cVar.v).add(((com.gamericefishpro.space.i9.b) obj).clone());
                }
                return cVar;
            default:
                return super.clone();
        }
    }

    public boolean d(String workSpecId) {
        com.gamericefishpro.space.r6.b bVar;
        boolean z;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.v) {
            try {
                com.gamericefishpro.space.r6.b[] bVarArr = (com.gamericefishpro.space.r6.b[]) this.i;
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i];
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                    Object obj = bVar.d;
                    if (obj != null && bVar.b(obj) && bVar.c.contains(workSpecId)) {
                        break;
                    }
                    i++;
                }
                if (bVar != null) {
                    com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                    int i2 = com.gamericefishpro.space.q6.c.a;
                    qVarC.getClass();
                }
                z = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public j e() {
        String strConcat = ((String) this.v) == null ? " backendName" : "";
        if (((com.gamericefishpro.space.z7.d) this.i) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new j((String) this.v, (byte[]) this.e, (com.gamericefishpro.space.z7.d) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public com.gamericefishpro.space.l6.s f() {
        Intrinsics.checkNotNullParameter(this, "builder");
        com.gamericefishpro.space.l6.s sVar = new com.gamericefishpro.space.l6.s((UUID) this.e, (com.gamericefishpro.space.u6.p) this.i, (LinkedHashSet) this.v);
        com.gamericefishpro.space.l6.e eVar = ((com.gamericefishpro.space.u6.p) this.i).j;
        boolean z = !eVar.h.isEmpty() || eVar.d || eVar.b || eVar.c;
        com.gamericefishpro.space.u6.p pVar = (com.gamericefishpro.space.u6.p) this.i;
        if (pVar.q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID id = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID()");
        Intrinsics.checkNotNullParameter(id, "id");
        this.e = id;
        String newId = id.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
        com.gamericefishpro.space.u6.p other = (com.gamericefishpro.space.u6.p) this.i;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        String str = other.c;
        y yVar = other.b;
        String str2 = other.d;
        g gVar = new g(other.e);
        g gVar2 = new g(other.f);
        long j = other.g;
        long j2 = other.h;
        long j3 = other.i;
        com.gamericefishpro.space.l6.e other2 = other.j;
        Intrinsics.checkNotNullParameter(other2, "other");
        this.i = new com.gamericefishpro.space.u6.p(newId, yVar, str, str2, gVar, gVar2, j, j2, j3, new com.gamericefishpro.space.l6.e(other2.a, other2.b, other2.c, other2.d, other2.e, other2.f, other2.g, other2.h), other.k, other.l, other.m, other.n, other.o, other.p, other.q, other.r, other.s, 524288, 0);
        return sVar;
    }

    public boolean g(f0 f0Var) {
        return !(f0Var.B == null) && (((y1) ((com.gamericefishpro.space.vb.c) this.e).e).contains(f0Var) || ((y1) ((com.gamericefishpro.space.vb.c) this.i).e).contains(f0Var));
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        switch (this.d) {
            case 1:
                long jB = n.b();
                if (jB == p.a) {
                    return this.v;
                }
                com.gamericefishpro.space.b1.o oVar = (com.gamericefishpro.space.b1.o) ((AtomicReference) this.e).get();
                int iA = oVar.a(jB);
                if (iA >= 0) {
                    return oVar.c[iA];
                }
                return null;
            case 4:
                int i = 8;
                return new r(new com.gamericefishpro.space.v8.l(i), new com.gamericefishpro.space.lb.e(i), (com.gamericefishpro.space.h8.c) ((com.gamericefishpro.space.b1.d) this.e).get(), (com.gamericefishpro.space.i8.h) ((com.gamericefishpro.space.b8.k) this.i).get(), (com.gamericefishpro.space.u6.n) ((com.gamericefishpro.space.tb.s) this.v).get());
            default:
                return new c((Context) ((com.gamericefishpro.space.nh.a) this.e).get(), (com.gamericefishpro.space.j8.d) ((com.gamericefishpro.space.nh.a) this.i).get(), (com.gamericefishpro.space.i8.a) ((com.gamericefishpro.space.v8.l) this.v).get(), 12);
        }
    }

    public void h(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.e;
        f fVar = new f(byteArrayOutputStream, map, (HashMap) this.i, (com.gamericefishpro.space.gb.d) this.v);
        com.gamericefishpro.space.gb.d dVar = (com.gamericefishpro.space.gb.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new com.gamericefishpro.space.gb.b("No encoder for " + obj.getClass());
        }
    }

    public int i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.v;
        int size = arrayList.size();
        while (i2 < size) {
            ((com.gamericefishpro.space.r5.a) arrayList.get(i2)).getClass();
            i2++;
        }
        return i;
    }

    public q j() {
        return ((com.gamericefishpro.space.q1.b) this.v).d.c;
    }

    public ColorStateList k(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = com.gamericefishpro.space.s3.a.c((Context) this.e, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public Drawable l(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.gamericefishpro.space.u6.f.x((Context) this.e, resourceId);
    }

    public Typeface m(int i, int i2, z zVar) {
        int resourceId = ((TypedArray) this.i).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.v) == null) {
            this.v = new TypedValue();
        }
        Context context = (Context) this.e;
        TypedValue typedValue = (TypedValue) this.v;
        ThreadLocal threadLocal = com.gamericefishpro.space.t3.j.a;
        if (context.isRestricted()) {
            return null;
        }
        return com.gamericefishpro.space.t3.j.a(context, resourceId, typedValue, i2, zVar, true, false);
    }

    public IntRange n() {
        Matcher matcher = (Matcher) this.e;
        return com.gamericefishpro.space.ji.f.f(matcher.start(), matcher.end());
    }

    public long o() {
        return ((com.gamericefishpro.space.q1.b) this.v).d.d;
    }

    public boolean p() {
        return ((ArrayList) this.i).size() > 0;
    }

    public boolean q() {
        return !(((y1) ((com.gamericefishpro.space.vb.c) this.e).e).isEmpty() && ((y1) ((com.gamericefishpro.space.vb.c) this.v).e).isEmpty() && ((y1) ((com.gamericefishpro.space.vb.c) this.i).e).isEmpty());
    }

    public boolean r(int i, com.gamericefishpro.space.k3.d dVar, com.gamericefishpro.space.n3.f fVar) {
        com.gamericefishpro.space.l3.b bVar = (com.gamericefishpro.space.l3.b) this.i;
        int[] iArr = dVar.o0;
        int[] iArr2 = dVar.s;
        bVar.a = iArr[0];
        bVar.b = iArr[1];
        bVar.c = dVar.n();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.j = i;
        boolean z = bVar.a == 3;
        boolean z2 = bVar.b == 3;
        boolean z3 = z && dVar.V > 0.0f;
        boolean z4 = z2 && dVar.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            bVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            bVar.b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
        bVar.j = 0;
        return bVar.i;
    }

    public c s() {
        CharSequence charSequence = (CharSequence) this.i;
        Matcher matcher = (Matcher) this.e;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new c(matcher2, charSequence);
        }
        return null;
    }

    public String toString() {
        switch (this.d) {
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) this.i;
                String str2 = (String) this.v;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.e;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public void u() {
        ((TypedArray) this.i).recycle();
    }

    public void v(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.r5.a aVar = (com.gamericefishpro.space.r5.a) arrayList.get(i);
            aVar.getClass();
            ((com.gamericefishpro.space.c4.b) this.e).c(aVar);
        }
        arrayList.clear();
    }

    public void w(Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.v) {
            try {
                for (com.gamericefishpro.space.r6.b bVar : (com.gamericefishpro.space.r6.b[]) this.i) {
                    if (bVar.e != null) {
                        bVar.e = null;
                        bVar.d(null, bVar.d);
                    }
                }
                for (com.gamericefishpro.space.r6.b bVar2 : (com.gamericefishpro.space.r6.b[]) this.i) {
                    bVar2.c(workSpecs);
                }
                for (com.gamericefishpro.space.r6.b bVar3 : (com.gamericefishpro.space.r6.b[]) this.i) {
                    if (bVar3.e != this) {
                        bVar3.e = this;
                        bVar3.d(this, bVar3.d);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.v) {
            try {
                for (com.gamericefishpro.space.r6.b bVar : (com.gamericefishpro.space.r6.b[]) this.i) {
                    ArrayList arrayList = bVar.b;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        bVar.a.d(bVar);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object y(com.gamericefishpro.space.ei.g clazz, com.gamericefishpro.space.mj.a scopeQualifier, com.gamericefishpro.space.b1.d instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        com.gamericefishpro.space.hj.b bVar = (com.gamericefishpro.space.hj.b) ((ConcurrentHashMap) this.i).get(com.gamericefishpro.space.qj.a.a(clazz) + "::" + scopeQualifier);
        Object objB = bVar != null ? bVar.b(instanceContext) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    public void z(j jVar, int i, boolean z) {
        com.gamericefishpro.space.i8.a aVar = (com.gamericefishpro.space.i8.a) this.v;
        Context context = (Context) this.e;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.a;
        String str2 = jVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        com.gamericefishpro.space.z7.d dVar = jVar.c;
        adler32.update(byteBufferAllocate.putInt(com.gamericefishpro.space.m8.a.a(dVar)).array());
        byte[] bArr = jVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    com.gamericefishpro.space.wa.b.r("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) this.i)).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(com.gamericefishpro.space.m8.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i));
            Set set = ((com.gamericefishpro.space.i8.b) aVar.b.get(dVar)).c;
            if (set.contains(com.gamericefishpro.space.i8.c.d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(com.gamericefishpro.space.i8.c.i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(com.gamericefishpro.space.i8.c.e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", com.gamericefishpro.space.m8.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public /* synthetic */ c(m4 m4Var, String str, Object obj, int i) {
        this.d = i;
        this.v = str;
        this.e = obj;
        this.i = m4Var;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }

    public /* synthetic */ c(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.e = obj;
        this.v = str;
        this.i = obj2;
    }

    public c(Context context, r1 r1Var) {
        this.d = 21;
        this.v = new AtomicLong(-1L);
        this.i = new com.gamericefishpro.space.x8.b(context, com.gamericefishpro.space.x8.b.i, new com.gamericefishpro.space.v8.o("measurement:api"), com.gamericefishpro.space.t8.e.b);
        this.e = r1Var;
    }

    public c(com.gamericefishpro.space.i9.b bVar) {
        this.d = 13;
        this.e = bVar;
        this.i = bVar.clone();
        this.v = new ArrayList();
    }

    public c(int i) {
        this.d = i;
        switch (i) {
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                long[] jArr = p0.a;
                this.e = new h0();
                break;
            case 9:
                this.e = new com.gamericefishpro.space.vb.c(18);
                this.i = new com.gamericefishpro.space.vb.c(18);
                this.v = new com.gamericefishpro.space.vb.c(18);
                break;
            case 13:
                this.e = new com.gamericefishpro.space.i9.b("", 0L, null);
                this.i = new com.gamericefishpro.space.i9.b("", 0L, null);
                this.v = new ArrayList();
                break;
            case 17:
                List list = Collections.EMPTY_LIST;
                this.e = list;
                this.i = list;
                break;
            default:
                this.e = new AtomicReference(n.b);
                this.i = new Object();
                break;
        }
    }

    public c(j jVar, com.gamericefishpro.space.z7.c cVar, com.gamericefishpro.space.tb.j jVar2, r rVar) {
        this.d = 3;
        this.e = jVar;
        this.i = cVar;
        this.v = rVar;
    }

    public c(Class workerClass) {
        this.d = 16;
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this.e = uuidRandomUUID;
        String id = ((UUID) this.e).toString();
        Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.i = new com.gamericefishpro.space.u6.p(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
        String[] elements = {name};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet(l0.a(1));
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.add(elements[0]);
        this.v = destination;
        ((com.gamericefishpro.space.u6.p) this.i).d = OverwritingInputMerger.class.getName();
    }

    public c(com.gamericefishpro.space.b1.d _koin) {
        this.d = 25;
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.e = _koin;
        this.i = new ConcurrentHashMap();
        this.v = new ConcurrentHashMap();
    }

    public c(com.gamericefishpro.space.q1.b bVar) {
        this.d = 27;
        this.v = bVar;
        this.e = new com.gamericefishpro.space.m.d(23, this);
    }

    public c(Context context, TypedArray typedArray) {
        this.d = 19;
        this.e = context;
        this.i = typedArray;
    }

    public c(com.gamericefishpro.space.k3.e eVar) {
        this.d = 15;
        this.e = new ArrayList();
        this.i = new com.gamericefishpro.space.l3.b();
        this.v = eVar;
    }

    public c(com.gamericefishpro.space.u6.i trackers, com.gamericefishpro.space.q6.b bVar) {
        this.d = 28;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        com.gamericefishpro.space.s6.a tracker = (com.gamericefishpro.space.s6.a) trackers.a;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        com.gamericefishpro.space.r6.a aVar = new com.gamericefishpro.space.r6.a(tracker, 0);
        com.gamericefishpro.space.s6.a tracker2 = (com.gamericefishpro.space.s6.a) trackers.b;
        Intrinsics.checkNotNullParameter(tracker2, "tracker");
        com.gamericefishpro.space.r6.a aVar2 = new com.gamericefishpro.space.r6.a(tracker2, 1);
        com.gamericefishpro.space.s6.a tracker3 = (com.gamericefishpro.space.s6.a) trackers.d;
        Intrinsics.checkNotNullParameter(tracker3, "tracker");
        com.gamericefishpro.space.r6.a aVar3 = new com.gamericefishpro.space.r6.a(tracker3, 4);
        com.gamericefishpro.space.s6.g tracker4 = (com.gamericefishpro.space.s6.g) trackers.c;
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        com.gamericefishpro.space.r6.a aVar4 = new com.gamericefishpro.space.r6.a(tracker4, 2);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        com.gamericefishpro.space.r6.a aVar5 = new com.gamericefishpro.space.r6.a(tracker4, 3);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        com.gamericefishpro.space.r6.d dVar = new com.gamericefishpro.space.r6.d(tracker4);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        com.gamericefishpro.space.r6.b[] constraintControllers = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new com.gamericefishpro.space.r6.c(tracker4)};
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.e = bVar;
        this.i = constraintControllers;
        this.v = new Object();
    }

    public c(a0 a0Var) {
        this.d = 29;
        this.e = new com.gamericefishpro.space.c4.b(30);
        this.i = new ArrayList();
        this.v = new ArrayList();
        new com.gamericefishpro.space.n9.y(this);
    }

    public c(Matcher matcher, CharSequence input) {
        this.d = 18;
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.e = matcher;
        this.i = input;
        this.v = new com.gamericefishpro.space.mi.d(0, this);
    }
}
