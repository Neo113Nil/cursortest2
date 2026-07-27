package com.anythink.core.common.n.b.a.a;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ad f15034a;

    /* renamed from: b, reason: collision with root package name */
    public final af f15035b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f15036a;

        /* renamed from: b, reason: collision with root package name */
        final ad f15037b;

        /* renamed from: c, reason: collision with root package name */
        final af f15038c;

        /* renamed from: d, reason: collision with root package name */
        private Date f15039d;

        /* renamed from: e, reason: collision with root package name */
        private String f15040e;

        /* renamed from: f, reason: collision with root package name */
        private Date f15041f;

        /* renamed from: g, reason: collision with root package name */
        private String f15042g;

        /* renamed from: h, reason: collision with root package name */
        private Date f15043h;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private long f15044j;

        /* renamed from: k, reason: collision with root package name */
        private String f15045k;

        /* renamed from: l, reason: collision with root package name */
        private int f15046l;

        public a(long j9, ad adVar, af afVar) {
            this.f15046l = -1;
            this.f15036a = j9;
            this.f15037b = adVar;
            this.f15038c = afVar;
            if (afVar != null) {
                this.i = afVar.l();
                this.f15044j = afVar.m();
                u f6 = afVar.f();
                int a9 = f6.a();
                for (int i = 0; i < a9; i++) {
                    String a10 = f6.a(i);
                    String b9 = f6.b(i);
                    if ("Date".equalsIgnoreCase(a10)) {
                        this.f15039d = com.anythink.core.common.n.b.a.c.d.a(b9);
                        this.f15040e = b9;
                    } else if ("Expires".equalsIgnoreCase(a10)) {
                        this.f15043h = com.anythink.core.common.n.b.a.c.d.a(b9);
                    } else if ("Last-Modified".equalsIgnoreCase(a10)) {
                        this.f15041f = com.anythink.core.common.n.b.a.c.d.a(b9);
                        this.f15042g = b9;
                    } else if ("ETag".equalsIgnoreCase(a10)) {
                        this.f15045k = b9;
                    } else if ("Age".equalsIgnoreCase(a10)) {
                        this.f15046l = com.anythink.core.common.n.b.a.c.e.b(b9, -1);
                    }
                }
            }
        }

        private static boolean a(ad adVar) {
            return (adVar.a("If-Modified-Since") == null && adVar.a("If-None-Match") == null) ? false : true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x00c0, code lost:
        
            if (r6 > 0) goto L54;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private c b() {
            long j9;
            if (this.f15038c == null) {
                return new c(this.f15037b, null);
            }
            if (this.f15037b.g() && this.f15038c.e() == null) {
                return new c(this.f15037b, null);
            }
            if (!c.a(this.f15038c, this.f15037b)) {
                return new c(this.f15037b, null);
            }
            com.anythink.core.common.n.b.d f6 = this.f15037b.f();
            if (!f6.a()) {
                ad adVar = this.f15037b;
                String str = "If-Modified-Since";
                if (adVar.a("If-Modified-Since") == null && adVar.a("If-None-Match") == null) {
                    com.anythink.core.common.n.b.d k6 = this.f15038c.k();
                    Date date = this.f15039d;
                    long max = date != null ? Math.max(0L, this.f15044j - date.getTime()) : 0L;
                    int i = this.f15046l;
                    if (i != -1) {
                        max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
                    }
                    long j10 = this.f15044j;
                    long j11 = 0;
                    long j12 = max + (j10 - this.i) + (this.f15036a - j10);
                    if (this.f15038c.k().c() != -1) {
                        j9 = TimeUnit.SECONDS.toMillis(r6.c());
                    } else if (this.f15043h != null) {
                        Date date2 = this.f15039d;
                        j9 = this.f15043h.getTime() - (date2 != null ? date2.getTime() : this.f15044j);
                    } else {
                        if (this.f15041f != null && this.f15038c.a().a().k() == null) {
                            Date date3 = this.f15039d;
                            long time = (date3 != null ? date3.getTime() : this.i) - this.f15041f.getTime();
                            if (time > 0) {
                                j9 = time / 10;
                            }
                        }
                        j9 = 0;
                    }
                    if (f6.c() != -1) {
                        j9 = Math.min(j9, TimeUnit.SECONDS.toMillis(f6.c()));
                    }
                    long millis = f6.h() != -1 ? TimeUnit.SECONDS.toMillis(f6.h()) : 0L;
                    if (!k6.f() && f6.g() != -1) {
                        j11 = TimeUnit.SECONDS.toMillis(f6.g());
                    }
                    if (!k6.a()) {
                        long j13 = millis + j12;
                        if (j13 < j9 + j11) {
                            af.a h9 = this.f15038c.h();
                            if (j13 >= j9) {
                                h9.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j12 > 86400000 && this.f15038c.k().c() == -1 && this.f15043h == null) {
                                h9.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new c(null, h9.a());
                        }
                    }
                    String str2 = this.f15045k;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (this.f15041f != null) {
                        str2 = this.f15042g;
                    } else {
                        if (this.f15039d == null) {
                            return new c(this.f15037b, null);
                        }
                        str2 = this.f15040e;
                    }
                    u.a b9 = this.f15037b.c().b();
                    com.anythink.core.common.n.b.a.a.f15027a.a(b9, str, str2);
                    return new c(this.f15037b.e().a(b9.a()).b(), this.f15038c);
                }
            }
            return new c(this.f15037b, null);
        }

        private long c() {
            if (this.f15038c.k().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            if (this.f15043h != null) {
                Date date = this.f15039d;
                long time = this.f15043h.getTime() - (date != null ? date.getTime() : this.f15044j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f15041f != null && this.f15038c.a().a().k() == null) {
                Date date2 = this.f15039d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f15041f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private long d() {
            Date date = this.f15039d;
            long max = date != null ? Math.max(0L, this.f15044j - date.getTime()) : 0L;
            int i = this.f15046l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j9 = this.f15044j;
            return max + (j9 - this.i) + (this.f15036a - j9);
        }

        private boolean e() {
            return this.f15038c.k().c() == -1 && this.f15043h == null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
        
            if (r6 > 0) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c a() {
            c cVar;
            long j9;
            c cVar2;
            if (this.f15038c == null) {
                cVar = new c(this.f15037b, null);
            } else if (this.f15037b.g() && this.f15038c.e() == null) {
                cVar = new c(this.f15037b, null);
            } else if (c.a(this.f15038c, this.f15037b)) {
                com.anythink.core.common.n.b.d f6 = this.f15037b.f();
                if (!f6.a()) {
                    ad adVar = this.f15037b;
                    String str = "If-Modified-Since";
                    if (adVar.a("If-Modified-Since") == null && adVar.a("If-None-Match") == null) {
                        com.anythink.core.common.n.b.d k6 = this.f15038c.k();
                        Date date = this.f15039d;
                        long max = date != null ? Math.max(0L, this.f15044j - date.getTime()) : 0L;
                        int i = this.f15046l;
                        if (i != -1) {
                            max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
                        }
                        long j10 = this.f15044j;
                        long j11 = 0;
                        long j12 = max + (j10 - this.i) + (this.f15036a - j10);
                        if (this.f15038c.k().c() != -1) {
                            j9 = TimeUnit.SECONDS.toMillis(r6.c());
                        } else if (this.f15043h != null) {
                            Date date2 = this.f15039d;
                            j9 = this.f15043h.getTime() - (date2 != null ? date2.getTime() : this.f15044j);
                        } else {
                            if (this.f15041f != null && this.f15038c.a().a().k() == null) {
                                Date date3 = this.f15039d;
                                long time = (date3 != null ? date3.getTime() : this.i) - this.f15041f.getTime();
                                if (time > 0) {
                                    j9 = time / 10;
                                }
                            }
                            j9 = 0;
                        }
                        if (f6.c() != -1) {
                            j9 = Math.min(j9, TimeUnit.SECONDS.toMillis(f6.c()));
                        }
                        long millis = f6.h() != -1 ? TimeUnit.SECONDS.toMillis(f6.h()) : 0L;
                        if (!k6.f() && f6.g() != -1) {
                            j11 = TimeUnit.SECONDS.toMillis(f6.g());
                        }
                        if (!k6.a()) {
                            long j13 = millis + j12;
                            if (j13 < j9 + j11) {
                                af.a h9 = this.f15038c.h();
                                if (j13 >= j9) {
                                    h9.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j12 > 86400000 && this.f15038c.k().c() == -1 && this.f15043h == null) {
                                    h9.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                cVar2 = new c(null, h9.a());
                                cVar = cVar2;
                            }
                        }
                        String str2 = this.f15045k;
                        if (str2 != null) {
                            str = "If-None-Match";
                        } else if (this.f15041f != null) {
                            str2 = this.f15042g;
                        } else if (this.f15039d != null) {
                            str2 = this.f15040e;
                        } else {
                            cVar = new c(this.f15037b, null);
                        }
                        u.a b9 = this.f15037b.c().b();
                        com.anythink.core.common.n.b.a.a.f15027a.a(b9, str, str2);
                        cVar2 = new c(this.f15037b.e().a(b9.a()).b(), this.f15038c);
                        cVar = cVar2;
                    }
                }
                cVar = new c(this.f15037b, null);
            } else {
                cVar = new c(this.f15037b, null);
            }
            return (cVar.f15034a == null || !this.f15037b.f().i()) ? cVar : new c(null, null);
        }
    }

    public c(ad adVar, af afVar) {
        this.f15034a = adVar;
        this.f15035b = afVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.k().d() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(af afVar, ad adVar) {
        int c4 = afVar.c();
        if (c4 != 200 && c4 != 410 && c4 != 414 && c4 != 501 && c4 != 203 && c4 != 204) {
            if (c4 != 307) {
                if (c4 != 308 && c4 != 404 && c4 != 405) {
                    switch (c4) {
                        case 300:
                        case BaseATView.a.f9932L /* 301 */:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (afVar.a("Expires") == null) {
                if (afVar.k().c() == -1) {
                    if (!afVar.k().e()) {
                    }
                }
            }
        }
        return (afVar.k().b() || adVar.f().b()) ? false : true;
    }
}
