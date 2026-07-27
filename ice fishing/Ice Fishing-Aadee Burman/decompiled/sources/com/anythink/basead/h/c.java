package com.anythink.basead.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.c.c;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public abstract class c implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f9000h = "extra_request_id";
    public static final String i = "extra_scenario";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9001j = "extra_orientation";

    /* renamed from: b, reason: collision with root package name */
    public String f9002b = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    protected Context f9003c;

    /* renamed from: d, reason: collision with root package name */
    protected x f9004d;

    /* renamed from: e, reason: collision with root package name */
    protected String f9005e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f9006f;

    /* renamed from: g, reason: collision with root package name */
    protected ay f9007g;

    public c(Context context, x xVar, String str, boolean z3) {
        this.f9003c = context.getApplicationContext();
        this.f9004d = xVar;
        this.f9005e = str;
        this.f9006f = z3;
    }

    private com.anythink.basead.d.f b() {
        if (TextUtils.isEmpty(this.f9005e) || TextUtils.isEmpty(this.f9004d.f14156b)) {
            return com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6146A);
        }
        ay a9 = com.anythink.basead.h.a.a.a(this.f9003c).a(this.f9004d.f14156b, this.f9005e);
        this.f9007g = a9;
        if (a9 == null) {
            return com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6149D);
        }
        if (this.f9004d.f14168o == null) {
            return com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6178j, com.anythink.basead.d.g.f6150E);
        }
        return null;
    }

    @Override // com.anythink.basead.h.a
    public boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.h.a.a.a(this.f9003c).a(this.f9007g, this.f9004d, this.f9006f);
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public void c() {
    }

    public final boolean d() {
        if (this.f9003c == null || TextUtils.isEmpty(this.f9004d.f14156b) || TextUtils.isEmpty(this.f9005e)) {
            return false;
        }
        if (this.f9007g != null) {
            return true;
        }
        ay a9 = com.anythink.basead.h.a.a.a(this.f9003c).a(this.f9004d.f14156b, this.f9005e);
        this.f9007g = a9;
        return a9 != null;
    }

    public final ay e() {
        return this.f9007g;
    }

    public final int f() {
        return com.anythink.basead.b.e.d(this.f9007g, this.f9004d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:12:0x004b, B:15:0x004f, B:17:0x0032, B:19:0x0038, B:21:0x0043), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:12:0x004b, B:15:0x004f, B:17:0x0032, B:19:0x0038, B:21:0x0043), top: B:1:0x0000 }] */
    @Override // com.anythink.basead.h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final com.anythink.basead.g.c cVar) {
        com.anythink.basead.d.f a9;
        try {
            if (!TextUtils.isEmpty(this.f9005e) && !TextUtils.isEmpty(this.f9004d.f14156b)) {
                ay a10 = com.anythink.basead.h.a.a.a(this.f9003c).a(this.f9004d.f14156b, this.f9005e);
                this.f9007g = a10;
                if (a10 == null) {
                    a9 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6149D);
                } else {
                    a9 = this.f9004d.f14168o == null ? com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6178j, com.anythink.basead.d.g.f6150E) : null;
                }
                if (a9 == null) {
                    cVar.onAdLoadFailed(a9);
                    return;
                }
                com.anythink.basead.h.a.a a11 = com.anythink.basead.h.a.a.a(this.f9003c);
                x xVar = this.f9004d;
                a11.a(xVar.f14156b, this.f9007g, xVar, new c.b() { // from class: com.anythink.basead.h.c.1
                    @Override // com.anythink.basead.b.c.c.b
                    public final void a() {
                        s c9 = t.b().c();
                        if (c9 != null && c9.a()) {
                            c cVar2 = c.this;
                            c9.fillDataFetchStatus(cVar2.f9003c, cVar2.f9007g, cVar2.f9004d);
                        }
                        com.anythink.basead.g.c cVar3 = cVar;
                        if (cVar3 != null) {
                            cVar3.onAdCacheLoaded();
                        }
                    }

                    @Override // com.anythink.basead.b.c.c.b
                    public final void a(com.anythink.basead.d.f fVar) {
                        com.anythink.basead.g.c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.onAdLoadFailed(fVar);
                        }
                    }
                });
                return;
            }
            a9 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6146A);
            if (a9 == null) {
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            cVar.onAdLoadFailed(com.anythink.basead.d.g.a("-9999", e9.getMessage()));
        }
    }
}
