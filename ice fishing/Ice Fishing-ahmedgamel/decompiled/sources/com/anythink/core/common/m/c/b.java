package com.anythink.core.common.m.c;

import D.y;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.q;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14534e = "AppReqCapInterceptor";

    /* renamed from: f, reason: collision with root package name */
    private static final long f14535f = 24;

    /* renamed from: g, reason: collision with root package name */
    private static final long f14536g = 86400000;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f14537h;
    private volatile long i;

    public b(Context context) {
        super(context);
        this.f14537h = false;
        this.i = 0L;
    }

    private void b(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        fVar.b();
        fVar.d();
        fVar.c();
        try {
            com.anythink.core.common.s.a c9 = af.c(this.f14542b, "anythink_app_pl_cl_retry");
            String a9 = dVar.a();
            String c10 = c(dVar);
            String c11 = c(a9);
            String b9 = b(a9);
            this.f14543c.put(c10, 0L);
            c9.a(c10, 0L);
            c9.a(c11, Long.valueOf(f14535f));
            c9.a(b9, 0L);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static String d(String str) {
        return AbstractC4404f.f(str, "_req_first_timestamp");
    }

    private static String e(String str) {
        return AbstractC4404f.f(str, "_agent_event");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:14:0x002a, B:16:0x004c, B:18:0x0054, B:19:0x0066, B:21:0x006e, B:23:0x0079, B:24:0x0094, B:26:0x009c, B:28:0x00a4, B:29:0x00ab, B:32:0x00b4, B:33:0x00fc, B:37:0x00c3, B:38:0x008b, B:40:0x00cc, B:42:0x00d0, B:44:0x00f2), top: B:13:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:14:0x002a, B:16:0x004c, B:18:0x0054, B:19:0x0066, B:21:0x006e, B:23:0x0079, B:24:0x0094, B:26:0x009c, B:28:0x00a4, B:29:0x00ab, B:32:0x00b4, B:33:0x00fc, B:37:0x00c3, B:38:0x008b, B:40:0x00cc, B:42:0x00d0, B:44:0x00f2), top: B:13:0x002a, outer: #0 }] */
    @Override // com.anythink.core.common.m.c.d, com.anythink.core.common.m.c.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        long j6;
        com.anythink.core.common.m.b.f fVar = null;
        if (!b(dVar)) {
            return null;
        }
        String a9 = dVar.a();
        String c9 = c(dVar);
        String b9 = b(a9);
        String c10 = c(a9);
        String f3 = AbstractC4404f.f(a9, "_req_first_timestamp");
        try {
            com.anythink.core.common.m.b.f a10 = super.a(dVar);
            if (a10 == null) {
                return null;
            }
            try {
                synchronized (this.f14544d) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        com.anythink.core.common.s.a c11 = af.c(this.f14542b, "anythink_app_pl_cl_retry");
                        long longValue = ((Long) c11.b(c10, Long.valueOf(f14535f))).longValue();
                        if (!a10.e()) {
                            long j9 = this.i;
                            long j10 = 0;
                            if (j9 <= 0) {
                                j9 = ((Long) c11.b(f3, 0L)).longValue();
                            }
                            this.i = j9;
                            if (this.i > 0) {
                                j6 = 86400000;
                                if (currentTimeMillis - this.i < 86400000) {
                                    j10 = ((Long) c11.b(b9, 0L)).longValue();
                                    long j11 = 1;
                                    if (j10 < longValue - 1) {
                                        long j12 = this.i + j6;
                                        Map<String, Long> map = this.f14543c;
                                        if (map != null) {
                                            map.put(c9, Long.valueOf(j12));
                                        }
                                        long j13 = longValue / 4;
                                        if (j13 > 1) {
                                            j11 = j13;
                                        }
                                        c11.a(c10, Long.valueOf(j11));
                                        c11.a(c9, Long.valueOf(j12));
                                    } else {
                                        c11.a(b9, Long.valueOf(j10 + 1));
                                    }
                                }
                            } else {
                                j6 = 86400000;
                            }
                            this.i = currentTimeMillis;
                            c11.a(f3, Long.valueOf(currentTimeMillis));
                            long j112 = 1;
                            if (j10 < longValue - 1) {
                            }
                        } else if (!this.f14537h) {
                            this.f14537h = true;
                            String str = a9 + "_agent_event";
                            if (!((Boolean) c11.b(str, Boolean.FALSE)).booleanValue()) {
                                com.anythink.core.common.u.e.a(this.i, longValue);
                                c11.a(str, Boolean.TRUE);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a10;
            } catch (Throwable th2) {
                th = th2;
                fVar = a10;
                th.getMessage();
                return fVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.anythink.core.common.m.c.d
    public final String c(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.a() + "_req_next_time";
    }

    private static String c(String str) {
        return AbstractC4404f.f(str, "_req_count_limit");
    }

    @Override // com.anythink.core.common.m.c.d
    public final boolean b(com.anythink.core.common.m.b.d dVar) {
        return this.f14542b != null && dVar != null && com.anythink.core.common.m.b.g.f14519b.equals(dVar.b()) && a(dVar.a());
    }

    private static String b(String str) {
        return AbstractC4404f.f(str, "_req_count");
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar) || fVar == null) {
            return;
        }
        synchronized (this.f14544d) {
            fVar.b();
            fVar.d();
            fVar.c();
            try {
                com.anythink.core.common.s.a c9 = af.c(this.f14542b, "anythink_app_pl_cl_retry");
                String a9 = dVar.a();
                String c10 = c(dVar);
                String c11 = c(a9);
                String b9 = b(a9);
                this.f14543c.put(c10, 0L);
                c9.a(c10, 0L);
                c9.a(c11, Long.valueOf(f14535f));
                c9.a(b9, 0L);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean a(String str) {
        com.anythink.core.d.b g4 = y.g(com.anythink.core.d.d.a(this.f14542b));
        if (this.f14542b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return (g4 == null || !g4.k()) && q.a(this.f14542b);
    }

    private long a(com.anythink.core.common.s.a aVar, String str) {
        long j6 = this.i;
        return j6 <= 0 ? ((Long) aVar.b(str, 0L)).longValue() : j6;
    }
}
