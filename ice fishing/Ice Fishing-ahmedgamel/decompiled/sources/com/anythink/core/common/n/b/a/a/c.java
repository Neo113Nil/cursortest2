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
    public final ad f15663a;

    /* renamed from: b, reason: collision with root package name */
    public final af f15664b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f15665a;

        /* renamed from: b, reason: collision with root package name */
        final ad f15666b;

        /* renamed from: c, reason: collision with root package name */
        final af f15667c;

        /* renamed from: d, reason: collision with root package name */
        private Date f15668d;

        /* renamed from: e, reason: collision with root package name */
        private String f15669e;

        /* renamed from: f, reason: collision with root package name */
        private Date f15670f;

        /* renamed from: g, reason: collision with root package name */
        private String f15671g;

        /* renamed from: h, reason: collision with root package name */
        private Date f15672h;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private long f15673j;

        /* renamed from: k, reason: collision with root package name */
        private String f15674k;

        /* renamed from: l, reason: collision with root package name */
        private int f15675l;

        public a(long j6, ad adVar, af afVar) {
            this.f15675l = -1;
            this.f15665a = j6;
            this.f15666b = adVar;
            this.f15667c = afVar;
            if (afVar != null) {
                this.i = afVar.l();
                this.f15673j = afVar.m();
                u f2 = afVar.f();
                int a9 = f2.a();
                for (int i = 0; i < a9; i++) {
                    String a10 = f2.a(i);
                    String b9 = f2.b(i);
                    if ("Date".equalsIgnoreCase(a10)) {
                        this.f15668d = com.anythink.core.common.n.b.a.c.d.a(b9);
                        this.f15669e = b9;
                    } else if ("Expires".equalsIgnoreCase(a10)) {
                        this.f15672h = com.anythink.core.common.n.b.a.c.d.a(b9);
                    } else if ("Last-Modified".equalsIgnoreCase(a10)) {
                        this.f15670f = com.anythink.core.common.n.b.a.c.d.a(b9);
                        this.f15671g = b9;
                    } else if ("ETag".equalsIgnoreCase(a10)) {
                        this.f15674k = b9;
                    } else if ("Age".equalsIgnoreCase(a10)) {
                        this.f15675l = com.anythink.core.common.n.b.a.c.e.b(b9, -1);
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
            long j6;
            if (this.f15667c == null) {
                return new c(this.f15666b, null);
            }
            if (this.f15666b.g() && this.f15667c.e() == null) {
                return new c(this.f15666b, null);
            }
            if (!c.a(this.f15667c, this.f15666b)) {
                return new c(this.f15666b, null);
            }
            com.anythink.core.common.n.b.d f2 = this.f15666b.f();
            if (!f2.a()) {
                ad adVar = this.f15666b;
                String str = "If-Modified-Since";
                if (adVar.a("If-Modified-Since") == null && adVar.a("If-None-Match") == null) {
                    com.anythink.core.common.n.b.d k9 = this.f15667c.k();
                    Date date = this.f15668d;
                    long max = date != null ? Math.max(0L, this.f15673j - date.getTime()) : 0L;
                    int i = this.f15675l;
                    if (i != -1) {
                        max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
                    }
                    long j9 = this.f15673j;
                    long j10 = 0;
                    long j11 = max + (j9 - this.i) + (this.f15665a - j9);
                    if (this.f15667c.k().c() != -1) {
                        j6 = TimeUnit.SECONDS.toMillis(r6.c());
                    } else if (this.f15672h != null) {
                        Date date2 = this.f15668d;
                        j6 = this.f15672h.getTime() - (date2 != null ? date2.getTime() : this.f15673j);
                    } else {
                        if (this.f15670f != null && this.f15667c.a().a().k() == null) {
                            Date date3 = this.f15668d;
                            long time = (date3 != null ? date3.getTime() : this.i) - this.f15670f.getTime();
                            if (time > 0) {
                                j6 = time / 10;
                            }
                        }
                        j6 = 0;
                    }
                    if (f2.c() != -1) {
                        j6 = Math.min(j6, TimeUnit.SECONDS.toMillis(f2.c()));
                    }
                    long millis = f2.h() != -1 ? TimeUnit.SECONDS.toMillis(f2.h()) : 0L;
                    if (!k9.f() && f2.g() != -1) {
                        j10 = TimeUnit.SECONDS.toMillis(f2.g());
                    }
                    if (!k9.a()) {
                        long j12 = millis + j11;
                        if (j12 < j6 + j10) {
                            af.a h3 = this.f15667c.h();
                            if (j12 >= j6) {
                                h3.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j11 > 86400000 && this.f15667c.k().c() == -1 && this.f15672h == null) {
                                h3.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new c(null, h3.a());
                        }
                    }
                    String str2 = this.f15674k;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (this.f15670f != null) {
                        str2 = this.f15671g;
                    } else {
                        if (this.f15668d == null) {
                            return new c(this.f15666b, null);
                        }
                        str2 = this.f15669e;
                    }
                    u.a b9 = this.f15666b.c().b();
                    com.anythink.core.common.n.b.a.a.f15656a.a(b9, str, str2);
                    return new c(this.f15666b.e().a(b9.a()).b(), this.f15667c);
                }
            }
            return new c(this.f15666b, null);
        }

        private long c() {
            if (this.f15667c.k().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            if (this.f15672h != null) {
                Date date = this.f15668d;
                long time = this.f15672h.getTime() - (date != null ? date.getTime() : this.f15673j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f15670f != null && this.f15667c.a().a().k() == null) {
                Date date2 = this.f15668d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f15670f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private long d() {
            Date date = this.f15668d;
            long max = date != null ? Math.max(0L, this.f15673j - date.getTime()) : 0L;
            int i = this.f15675l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j6 = this.f15673j;
            return max + (j6 - this.i) + (this.f15665a - j6);
        }

        private boolean e() {
            return this.f15667c.k().c() == -1 && this.f15672h == null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
        
            if (r6 > 0) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c a() {
            c cVar;
            long j6;
            c cVar2;
            if (this.f15667c == null) {
                cVar = new c(this.f15666b, null);
            } else if (this.f15666b.g() && this.f15667c.e() == null) {
                cVar = new c(this.f15666b, null);
            } else if (c.a(this.f15667c, this.f15666b)) {
                com.anythink.core.common.n.b.d f2 = this.f15666b.f();
                if (!f2.a()) {
                    ad adVar = this.f15666b;
                    String str = "If-Modified-Since";
                    if (adVar.a("If-Modified-Since") == null && adVar.a("If-None-Match") == null) {
                        com.anythink.core.common.n.b.d k9 = this.f15667c.k();
                        Date date = this.f15668d;
                        long max = date != null ? Math.max(0L, this.f15673j - date.getTime()) : 0L;
                        int i = this.f15675l;
                        if (i != -1) {
                            max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
                        }
                        long j9 = this.f15673j;
                        long j10 = 0;
                        long j11 = max + (j9 - this.i) + (this.f15665a - j9);
                        if (this.f15667c.k().c() != -1) {
                            j6 = TimeUnit.SECONDS.toMillis(r6.c());
                        } else if (this.f15672h != null) {
                            Date date2 = this.f15668d;
                            j6 = this.f15672h.getTime() - (date2 != null ? date2.getTime() : this.f15673j);
                        } else {
                            if (this.f15670f != null && this.f15667c.a().a().k() == null) {
                                Date date3 = this.f15668d;
                                long time = (date3 != null ? date3.getTime() : this.i) - this.f15670f.getTime();
                                if (time > 0) {
                                    j6 = time / 10;
                                }
                            }
                            j6 = 0;
                        }
                        if (f2.c() != -1) {
                            j6 = Math.min(j6, TimeUnit.SECONDS.toMillis(f2.c()));
                        }
                        long millis = f2.h() != -1 ? TimeUnit.SECONDS.toMillis(f2.h()) : 0L;
                        if (!k9.f() && f2.g() != -1) {
                            j10 = TimeUnit.SECONDS.toMillis(f2.g());
                        }
                        if (!k9.a()) {
                            long j12 = millis + j11;
                            if (j12 < j6 + j10) {
                                af.a h3 = this.f15667c.h();
                                if (j12 >= j6) {
                                    h3.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j11 > 86400000 && this.f15667c.k().c() == -1 && this.f15672h == null) {
                                    h3.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                cVar2 = new c(null, h3.a());
                                cVar = cVar2;
                            }
                        }
                        String str2 = this.f15674k;
                        if (str2 != null) {
                            str = "If-None-Match";
                        } else if (this.f15670f != null) {
                            str2 = this.f15671g;
                        } else if (this.f15668d != null) {
                            str2 = this.f15669e;
                        } else {
                            cVar = new c(this.f15666b, null);
                        }
                        u.a b9 = this.f15666b.c().b();
                        com.anythink.core.common.n.b.a.a.f15656a.a(b9, str, str2);
                        cVar2 = new c(this.f15666b.e().a(b9.a()).b(), this.f15667c);
                        cVar = cVar2;
                    }
                }
                cVar = new c(this.f15666b, null);
            } else {
                cVar = new c(this.f15666b, null);
            }
            return (cVar.f15663a == null || !this.f15666b.f().i()) ? cVar : new c(null, null);
        }
    }

    public c(ad adVar, af afVar) {
        this.f15663a = adVar;
        this.f15664b = afVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.k().d() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(af afVar, ad adVar) {
        int c9 = afVar.c();
        if (c9 != 200 && c9 != 410 && c9 != 414 && c9 != 501 && c9 != 203 && c9 != 204) {
            if (c9 != 307) {
                if (c9 != 308 && c9 != 404 && c9 != 405) {
                    switch (c9) {
                        case 300:
                        case BaseATView.a.f10561L /* 301 */:
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
