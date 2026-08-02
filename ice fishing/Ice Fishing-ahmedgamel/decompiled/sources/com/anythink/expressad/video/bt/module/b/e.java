package com.anythink.expressad.video.bt.module.b;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21853a = "ProxyShowRewardListener";

    /* renamed from: d, reason: collision with root package name */
    private h f21854d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f21855e;

    /* renamed from: f, reason: collision with root package name */
    private String f21856f;

    /* renamed from: g, reason: collision with root package name */
    private String f21857g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21858h;
    private Context i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21859j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21860k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21861l = false;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x002f, B:9:0x0038, B:10:0x0041, B:12:0x004b, B:14:0x0051, B:16:0x0057, B:18:0x0061, B:21:0x0065, B:23:0x0069), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x002f, B:9:0x0038, B:10:0x0041, B:12:0x004b, B:14:0x0051, B:16:0x0057, B:18:0x0061, B:21:0x0065, B:23:0x0069), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, boolean z6, com.anythink.expressad.videocommon.e.d dVar, com.anythink.expressad.foundation.d.d dVar2, h hVar, String str, String str2) {
        long j6;
        this.f21854d = hVar;
        this.f21855e = dVar;
        this.f21856f = str2;
        this.f21857g = str;
        this.f21858h = z6;
        this.i = context;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.c().f())) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                if (b9 == null) {
                    com.anythink.expressad.f.b.a();
                    b9 = com.anythink.expressad.f.b.c();
                }
                if (b9 != null) {
                    j6 = b9.l() * 1000;
                    com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c9 = b10 != null ? b10.c() : 0L;
                    if (dVar2 == null) {
                        if (!dVar2.a(c9, j6)) {
                            dVar2.g(0);
                            dVar2.o(0);
                            return;
                        }
                        dVar2.g(1);
                        if (dVar.M() == 1) {
                            dVar2.o(1);
                            return;
                        } else {
                            dVar2.o(0);
                            return;
                        }
                    }
                    return;
                }
            }
            j6 = 0;
            com.anythink.expressad.videocommon.e.a b102 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b102 != null) {
            }
            if (dVar2 == null) {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0022, B:9:0x002b, B:11:0x0035, B:13:0x003b, B:15:0x0042, B:17:0x004c, B:20:0x0050, B:22:0x0054), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0022, B:9:0x002b, B:11:0x0035, B:13:0x003b, B:15:0x0042, B:17:0x004c, B:20:0x0050, B:22:0x0054), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(com.anythink.expressad.videocommon.e.d dVar, com.anythink.expressad.foundation.d.d dVar2) {
        long j6;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.c().f())) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                if (b9 == null) {
                    com.anythink.expressad.f.b.a();
                    b9 = com.anythink.expressad.f.b.c();
                }
                if (b9 != null) {
                    j6 = b9.l() * 1000;
                    com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c9 = b10 != null ? b10.c() : 0L;
                    if (dVar2 == null) {
                        if (!dVar2.a(c9, j6)) {
                            dVar2.g(0);
                            dVar2.o(0);
                            return;
                        }
                        dVar2.g(1);
                        if (dVar.M() == 1) {
                            dVar2.o(1);
                            return;
                        } else {
                            dVar2.o(0);
                            return;
                        }
                    }
                    return;
                }
            }
            j6 = 0;
            com.anythink.expressad.videocommon.e.a b102 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b102 != null) {
            }
            if (dVar2 == null) {
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void b() {
        super.b();
        h hVar = this.f21854d;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void c() {
        super.c();
        h hVar = this.f21854d;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a() {
        super.a();
        h hVar = this.f21854d;
        if (hVar == null || this.f21859j) {
            return;
        }
        this.f21859j = true;
        hVar.a();
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z6, com.anythink.expressad.videocommon.c.c cVar) {
        super.a(z6, cVar);
        h hVar = this.f21854d;
        if (hVar == null || this.f21861l) {
            return;
        }
        this.f21861l = true;
        hVar.a(z6, cVar);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z6, int i) {
        super.a(z6, i);
        h hVar = this.f21854d;
        if (hVar == null || this.f21861l) {
            return;
        }
        hVar.a(z6, i);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(String str) {
        super.a(str);
        h hVar = this.f21854d;
        if (hVar == null || this.f21860k) {
            return;
        }
        this.f21860k = true;
        hVar.a(str);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        super.a(dVar);
        h hVar = this.f21854d;
        if (hVar != null) {
            hVar.a(dVar);
        }
    }
}
