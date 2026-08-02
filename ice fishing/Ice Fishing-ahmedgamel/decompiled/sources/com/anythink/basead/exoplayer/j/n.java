package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8959a = "DefaultDataSource";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8960b = "asset";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8961c = "content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8962d = "rtmp";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8963e = "rawresource";

    /* renamed from: f, reason: collision with root package name */
    private final Context f8964f;

    /* renamed from: g, reason: collision with root package name */
    private final aa<? super h> f8965g;

    /* renamed from: h, reason: collision with root package name */
    private final h f8966h;
    private h i;

    /* renamed from: j, reason: collision with root package name */
    private h f8967j;

    /* renamed from: k, reason: collision with root package name */
    private h f8968k;

    /* renamed from: l, reason: collision with root package name */
    private h f8969l;

    /* renamed from: m, reason: collision with root package name */
    private h f8970m;

    /* renamed from: n, reason: collision with root package name */
    private h f8971n;

    /* renamed from: o, reason: collision with root package name */
    private h f8972o;

    private n(Context context, aa<? super h> aaVar, String str, boolean z6) {
        this(context, aaVar, str, z6, (byte) 0);
    }

    private h c() {
        if (this.i == null) {
            this.i = new r(this.f8965g);
        }
        return this.i;
    }

    private h d() {
        if (this.f8967j == null) {
            this.f8967j = new c(this.f8964f, this.f8965g);
        }
        return this.f8967j;
    }

    private h e() {
        if (this.f8968k == null) {
            this.f8968k = new e(this.f8964f, this.f8965g);
        }
        return this.f8968k;
    }

    private h f() {
        if (this.f8969l == null) {
            try {
                this.f8969l = (h) Class.forName("com.anythink.expressad.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(f8959a, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating RTMP extension", e9);
            }
            if (this.f8969l == null) {
                this.f8969l = this.f8966h;
            }
        }
        return this.f8969l;
    }

    private h g() {
        if (this.f8970m == null) {
            this.f8970m = new f();
        }
        return this.f8970m;
    }

    private h h() {
        if (this.f8971n == null) {
            this.f8971n = new y(this.f8964f, this.f8965g);
        }
        return this.f8971n;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f8972o == null);
        String scheme = kVar.f8923c.getScheme();
        if (af.a(kVar.f8923c)) {
            if (kVar.f8923c.getPath().startsWith("/android_asset/")) {
                this.f8972o = d();
            } else {
                if (this.i == null) {
                    this.i = new r(this.f8965g);
                }
                this.f8972o = this.i;
            }
        } else if (f8960b.equals(scheme)) {
            this.f8972o = d();
        } else if ("content".equals(scheme)) {
            if (this.f8968k == null) {
                this.f8968k = new e(this.f8964f, this.f8965g);
            }
            this.f8972o = this.f8968k;
        } else if (f8962d.equals(scheme)) {
            this.f8972o = f();
        } else if ("data".equals(scheme)) {
            if (this.f8970m == null) {
                this.f8970m = new f();
            }
            this.f8972o = this.f8970m;
        } else if ("rawresource".equals(scheme)) {
            if (this.f8971n == null) {
                this.f8971n = new y(this.f8964f, this.f8965g);
            }
            this.f8972o = this.f8971n;
        } else {
            this.f8972o = this.f8966h;
        }
        return this.f8972o.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        h hVar = this.f8972o;
        if (hVar != null) {
            try {
                hVar.b();
            } finally {
                this.f8972o = null;
            }
        }
    }

    private n(Context context, aa<? super h> aaVar, String str, boolean z6, byte b9) {
        this(context, aaVar, new p(str, null, aaVar, 8000, 8000, z6, null));
    }

    public n(Context context, aa<? super h> aaVar, h hVar) {
        this.f8964f = context.getApplicationContext();
        this.f8965g = aaVar;
        this.f8966h = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        return this.f8972o.a(bArr, i, i4);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        h hVar = this.f8972o;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
