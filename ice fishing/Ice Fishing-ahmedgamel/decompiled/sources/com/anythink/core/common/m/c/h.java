package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15340a = "HttpReqLimitInterceptor";

    /* renamed from: b, reason: collision with root package name */
    private final Object f15341b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Context f15342c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Long> f15343d;

    /* renamed from: e, reason: collision with root package name */
    private final a f15344e;

    /* renamed from: f, reason: collision with root package name */
    private long f15345f;

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public long f15347b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15348c = true;

        /* renamed from: a, reason: collision with root package name */
        public int f15346a = 5;

        public a(long j6) {
            this.f15347b = j6;
        }
    }

    public h(Context context, Map<String, Long> map, a aVar) {
        this.f15342c = context;
        this.f15343d = map;
        this.f15344e = aVar;
    }

    private void b(com.anythink.core.common.m.b.d dVar) {
        String a9 = a(dVar);
        String d9 = d(dVar);
        this.f15343d.put(a9, 0L);
        com.anythink.core.common.s.a c9 = af.c(this.f15342c, "anythink_app_pl_cl_retry");
        c9.a(a9, 0L);
        c9.a(d9, 0L);
    }

    private static String c(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.b() + "_req_frist_timestamp";
    }

    private static String d(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.b() + "_req_count";
    }

    private static String e(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.b() + "_data";
    }

    private static String f(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.b() + "_data_timestamp";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x0034, B:14:0x0043, B:17:0x0096, B:19:0x009c, B:21:0x00a2, B:22:0x00b0, B:24:0x00b6, B:26:0x00c0, B:28:0x00e4, B:30:0x00e8, B:31:0x00ec, B:33:0x00f2, B:35:0x00f8, B:36:0x00fa, B:38:0x0105, B:39:0x010c, B:40:0x0114, B:42:0x00cb, B:43:0x00da, B:44:0x011e, B:47:0x004b, B:49:0x006d, B:52:0x007d), top: B:11:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x0034, B:14:0x0043, B:17:0x0096, B:19:0x009c, B:21:0x00a2, B:22:0x00b0, B:24:0x00b6, B:26:0x00c0, B:28:0x00e4, B:30:0x00e8, B:31:0x00ec, B:33:0x00f2, B:35:0x00f8, B:36:0x00fa, B:38:0x0105, B:39:0x010c, B:40:0x0114, B:42:0x00cb, B:43:0x00da, B:44:0x011e, B:47:0x004b, B:49:0x006d, B:52:0x007d), top: B:11:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x0034, B:14:0x0043, B:17:0x0096, B:19:0x009c, B:21:0x00a2, B:22:0x00b0, B:24:0x00b6, B:26:0x00c0, B:28:0x00e4, B:30:0x00e8, B:31:0x00ec, B:33:0x00f2, B:35:0x00f8, B:36:0x00fa, B:38:0x0105, B:39:0x010c, B:40:0x0114, B:42:0x00cb, B:43:0x00da, B:44:0x011e, B:47:0x004b, B:49:0x006d, B:52:0x007d), top: B:11:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x0034, B:14:0x0043, B:17:0x0096, B:19:0x009c, B:21:0x00a2, B:22:0x00b0, B:24:0x00b6, B:26:0x00c0, B:28:0x00e4, B:30:0x00e8, B:31:0x00ec, B:33:0x00f2, B:35:0x00f8, B:36:0x00fa, B:38:0x0105, B:39:0x010c, B:40:0x0114, B:42:0x00cb, B:43:0x00da, B:44:0x011e, B:47:0x004b, B:49:0x006d, B:52:0x007d), top: B:11:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Type inference failed for: r13v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.anythink.core.common.m.b.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar, com.anythink.core.common.m.b.f fVar) {
        String str;
        long j6;
        if (fVar == 0) {
            return null;
        }
        try {
            String a9 = a(dVar);
            if (dVar != null) {
                str = dVar.b() + "_req_frist_timestamp";
            } else {
                str = "";
            }
            String d9 = d(dVar);
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.f15341b) {
                try {
                    com.anythink.core.common.s.a c9 = af.c(this.f15342c, "anythink_app_pl_cl_retry");
                    a aVar = this.f15344e;
                    if (aVar != null) {
                        if (aVar.f15348c) {
                        }
                        if (!fVar.e()) {
                            long j9 = this.f15345f;
                            if (j9 <= 0) {
                                j9 = ((Long) c9.b(str, 0L)).longValue();
                            }
                            this.f15345f = j9;
                            if (j9 <= 0) {
                                this.f15345f = currentTimeMillis;
                                c9.a(str, Long.valueOf(currentTimeMillis));
                            } else if (currentTimeMillis - j9 >= a()) {
                                this.f15345f = currentTimeMillis;
                                c9.a(str, Long.valueOf(currentTimeMillis));
                            } else {
                                j6 = ((Long) c9.b(d9, 0L)).longValue();
                                if (j6 != (this.f15344e == null ? r3.f15346a : 5) - 1) {
                                    if (this.f15345f == 0) {
                                        this.f15345f = currentTimeMillis;
                                    }
                                    long a10 = this.f15345f + a();
                                    Map<String, Long> map = this.f15343d;
                                    if (map != null) {
                                        map.put(a9, Long.valueOf(a10));
                                    }
                                    c9.a(a9, Long.valueOf(a10));
                                } else {
                                    c9.a(d9, Long.valueOf(j6 + 1));
                                }
                            }
                            j6 = 0;
                            if (j6 != (this.f15344e == null ? r3.f15346a : 5) - 1) {
                            }
                        }
                    }
                    long longValue = ((Long) c9.b(f(dVar), 0L)).longValue();
                    String str2 = (String) c9.b(e(dVar), "");
                    boolean z6 = longValue > 0 && System.currentTimeMillis() - longValue <= a();
                    if (!TextUtils.isEmpty(str2) && z6) {
                        try {
                            str2 = new JSONObject(str2);
                        } catch (Throwable unused) {
                        }
                        try {
                            fVar.a(str2);
                            fVar.b(200);
                            fVar.a(true);
                        } catch (Throwable unused2) {
                        }
                    }
                    if (!fVar.e()) {
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return fVar;
    }

    private int b() {
        a aVar = this.f15344e;
        if (aVar != null) {
            return aVar.f15346a;
        }
        return 5;
    }

    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        Object g9 = fVar.g();
        try {
            synchronized (this.f15341b) {
                try {
                    a aVar = this.f15344e;
                    if (aVar != null && aVar.f15348c && g9 != null) {
                        af.b(this.f15342c, "anythink_app_pl_cl_retry", e(dVar), g9.toString());
                        af.a(this.f15342c, "anythink_app_pl_cl_retry", f(dVar), System.currentTimeMillis());
                    }
                    String a9 = a(dVar);
                    String d9 = d(dVar);
                    this.f15343d.put(a9, 0L);
                    com.anythink.core.common.s.a c9 = af.c(this.f15342c, "anythink_app_pl_cl_retry");
                    c9.a(a9, 0L);
                    c9.a(d9, 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static String a(com.anythink.core.common.m.b.d dVar) {
        if (dVar == null) {
            return "";
        }
        return dVar.b() + "_req_next_timestamp";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.anythink.core.common.m.b.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [org.json.JSONObject] */
    private void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar, com.anythink.core.common.s.a aVar) {
        a aVar2 = this.f15344e;
        if (aVar2 == null || aVar2.f15348c) {
            long longValue = ((Long) aVar.b(f(dVar), 0L)).longValue();
            String str = (String) aVar.b(e(dVar), "");
            boolean z6 = longValue > 0 && System.currentTimeMillis() - longValue <= a();
            if (TextUtils.isEmpty(str) || !z6) {
                return;
            }
            try {
                str = new JSONObject(str);
            } catch (Throwable unused) {
            }
            try {
                fVar.a(str);
                fVar.b(200);
                fVar.a(true);
            } catch (Throwable unused2) {
            }
        }
    }

    private long a(com.anythink.core.common.s.a aVar, String str) {
        long j6 = this.f15345f;
        return j6 <= 0 ? ((Long) aVar.b(str, 0L)).longValue() : j6;
    }

    private long a() {
        a aVar = this.f15344e;
        return aVar != null ? aVar.f15347b : com.anythink.core.common.g.c.f14051b;
    }
}
