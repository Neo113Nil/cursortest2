package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8173a = "DefaultDataSource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8174b = "asset";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8175c = "content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8176d = "rtmp";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8177e = "rawresource";

    /* renamed from: f, reason: collision with root package name */
    private final Context f8178f;

    /* renamed from: g, reason: collision with root package name */
    private final aa<? super h> f8179g;

    /* renamed from: h, reason: collision with root package name */
    private final h f8180h;
    private h i;

    /* renamed from: j, reason: collision with root package name */
    private h f8181j;

    /* renamed from: k, reason: collision with root package name */
    private h f8182k;

    /* renamed from: l, reason: collision with root package name */
    private h f8183l;

    /* renamed from: m, reason: collision with root package name */
    private h f8184m;

    /* renamed from: n, reason: collision with root package name */
    private h f8185n;

    /* renamed from: o, reason: collision with root package name */
    private h f8186o;

    private n(Context context, aa<? super h> aaVar, String str, boolean z3) {
        this(context, aaVar, str, z3, (byte) 0);
    }

    private h c() {
        if (this.i == null) {
            this.i = new r(this.f8179g);
        }
        return this.i;
    }

    private h d() {
        if (this.f8181j == null) {
            this.f8181j = new c(this.f8178f, this.f8179g);
        }
        return this.f8181j;
    }

    private h e() {
        if (this.f8182k == null) {
            this.f8182k = new e(this.f8178f, this.f8179g);
        }
        return this.f8182k;
    }

    private h f() {
        if (this.f8183l == null) {
            try {
                this.f8183l = (h) Class.forName("com.anythink.expressad.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(f8173a, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating RTMP extension", e9);
            }
            if (this.f8183l == null) {
                this.f8183l = this.f8180h;
            }
        }
        return this.f8183l;
    }

    private h g() {
        if (this.f8184m == null) {
            this.f8184m = new f();
        }
        return this.f8184m;
    }

    private h h() {
        if (this.f8185n == null) {
            this.f8185n = new y(this.f8178f, this.f8179g);
        }
        return this.f8185n;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f8186o == null);
        String scheme = kVar.f8137c.getScheme();
        if (af.a(kVar.f8137c)) {
            if (kVar.f8137c.getPath().startsWith("/android_asset/")) {
                this.f8186o = d();
            } else {
                if (this.i == null) {
                    this.i = new r(this.f8179g);
                }
                this.f8186o = this.i;
            }
        } else if (f8174b.equals(scheme)) {
            this.f8186o = d();
        } else if ("content".equals(scheme)) {
            if (this.f8182k == null) {
                this.f8182k = new e(this.f8178f, this.f8179g);
            }
            this.f8186o = this.f8182k;
        } else if (f8176d.equals(scheme)) {
            this.f8186o = f();
        } else if ("data".equals(scheme)) {
            if (this.f8184m == null) {
                this.f8184m = new f();
            }
            this.f8186o = this.f8184m;
        } else if ("rawresource".equals(scheme)) {
            if (this.f8185n == null) {
                this.f8185n = new y(this.f8178f, this.f8179g);
            }
            this.f8186o = this.f8185n;
        } else {
            this.f8186o = this.f8180h;
        }
        return this.f8186o.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        h hVar = this.f8186o;
        if (hVar != null) {
            try {
                hVar.b();
            } finally {
                this.f8186o = null;
            }
        }
    }

    private n(Context context, aa<? super h> aaVar, String str, boolean z3, byte b9) {
        this(context, aaVar, new p(str, null, aaVar, 8000, 8000, z3, null));
    }

    public n(Context context, aa<? super h> aaVar, h hVar) {
        this.f8178f = context.getApplicationContext();
        this.f8179g = aaVar;
        this.f8180h = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        return this.f8186o.a(bArr, i, i6);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        h hVar = this.f8186o;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
