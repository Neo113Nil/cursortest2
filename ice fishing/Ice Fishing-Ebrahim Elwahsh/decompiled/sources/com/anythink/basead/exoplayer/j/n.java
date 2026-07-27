package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8330a = "DefaultDataSource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8331b = "asset";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8332c = "content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8333d = "rtmp";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8334e = "rawresource";

    /* renamed from: f, reason: collision with root package name */
    private final Context f8335f;

    /* renamed from: g, reason: collision with root package name */
    private final aa<? super h> f8336g;

    /* renamed from: h, reason: collision with root package name */
    private final h f8337h;
    private h i;

    /* renamed from: j, reason: collision with root package name */
    private h f8338j;

    /* renamed from: k, reason: collision with root package name */
    private h f8339k;

    /* renamed from: l, reason: collision with root package name */
    private h f8340l;

    /* renamed from: m, reason: collision with root package name */
    private h f8341m;

    /* renamed from: n, reason: collision with root package name */
    private h f8342n;

    /* renamed from: o, reason: collision with root package name */
    private h f8343o;

    private n(Context context, aa<? super h> aaVar, String str, boolean z8) {
        this(context, aaVar, str, z8, (byte) 0);
    }

    private h c() {
        if (this.i == null) {
            this.i = new r(this.f8336g);
        }
        return this.i;
    }

    private h d() {
        if (this.f8338j == null) {
            this.f8338j = new c(this.f8335f, this.f8336g);
        }
        return this.f8338j;
    }

    private h e() {
        if (this.f8339k == null) {
            this.f8339k = new e(this.f8335f, this.f8336g);
        }
        return this.f8339k;
    }

    private h f() {
        if (this.f8340l == null) {
            try {
                this.f8340l = (h) Class.forName("com.anythink.expressad.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(f8330a, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating RTMP extension", e6);
            }
            if (this.f8340l == null) {
                this.f8340l = this.f8337h;
            }
        }
        return this.f8340l;
    }

    private h g() {
        if (this.f8341m == null) {
            this.f8341m = new f();
        }
        return this.f8341m;
    }

    private h h() {
        if (this.f8342n == null) {
            this.f8342n = new y(this.f8335f, this.f8336g);
        }
        return this.f8342n;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        C0544a.b(this.f8343o == null);
        String scheme = kVar.f8294c.getScheme();
        if (af.a(kVar.f8294c)) {
            if (kVar.f8294c.getPath().startsWith("/android_asset/")) {
                this.f8343o = d();
            } else {
                if (this.i == null) {
                    this.i = new r(this.f8336g);
                }
                this.f8343o = this.i;
            }
        } else if (f8331b.equals(scheme)) {
            this.f8343o = d();
        } else if ("content".equals(scheme)) {
            if (this.f8339k == null) {
                this.f8339k = new e(this.f8335f, this.f8336g);
            }
            this.f8343o = this.f8339k;
        } else if (f8333d.equals(scheme)) {
            this.f8343o = f();
        } else if ("data".equals(scheme)) {
            if (this.f8341m == null) {
                this.f8341m = new f();
            }
            this.f8343o = this.f8341m;
        } else if ("rawresource".equals(scheme)) {
            if (this.f8342n == null) {
                this.f8342n = new y(this.f8335f, this.f8336g);
            }
            this.f8343o = this.f8342n;
        } else {
            this.f8343o = this.f8337h;
        }
        return this.f8343o.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        h hVar = this.f8343o;
        if (hVar != null) {
            try {
                hVar.b();
            } finally {
                this.f8343o = null;
            }
        }
    }

    private n(Context context, aa<? super h> aaVar, String str, boolean z8, byte b9) {
        this(context, aaVar, new p(str, null, aaVar, 8000, 8000, z8, null));
    }

    public n(Context context, aa<? super h> aaVar, h hVar) {
        this.f8335f = context.getApplicationContext();
        this.f8336g = aaVar;
        this.f8337h = (h) C0544a.a(hVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        return this.f8343o.a(bArr, i, i4);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        h hVar = this.f8343o;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
