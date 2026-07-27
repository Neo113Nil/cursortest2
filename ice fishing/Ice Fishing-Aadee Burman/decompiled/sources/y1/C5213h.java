package y1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5213h implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final C5217l f41797b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f41798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41799d;

    /* renamed from: e, reason: collision with root package name */
    public String f41800e;

    /* renamed from: f, reason: collision with root package name */
    public URL f41801f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f41802g;

    /* renamed from: h, reason: collision with root package name */
    public int f41803h;

    public C5213h(URL url) {
        C5217l c5217l = InterfaceC5214i.f41804a;
        N1.g.c(url, "Argument must not be null");
        this.f41798c = url;
        this.f41799d = null;
        N1.g.c(c5217l, "Argument must not be null");
        this.f41797b = c5217l;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        if (this.f41802g == null) {
            this.f41802g = c().getBytes(InterfaceC4970e.f40448a);
        }
        messageDigest.update(this.f41802g);
    }

    public final String c() {
        String str = this.f41799d;
        if (str != null) {
            return str;
        }
        URL url = this.f41798c;
        N1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f41801f == null) {
            if (TextUtils.isEmpty(this.f41800e)) {
                String str = this.f41799d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f41798c;
                    N1.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f41800e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f41801f = new URL(this.f41800e);
        }
        return this.f41801f;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5213h)) {
            return false;
        }
        C5213h c5213h = (C5213h) obj;
        return c().equals(c5213h.c()) && this.f41797b.equals(c5213h.f41797b);
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        if (this.f41803h == 0) {
            int hashCode = c().hashCode();
            this.f41803h = hashCode;
            this.f41803h = this.f41797b.f41807b.hashCode() + (hashCode * 31);
        }
        return this.f41803h;
    }

    public final String toString() {
        return c();
    }

    public C5213h(String str) {
        C5217l c5217l = InterfaceC5214i.f41804a;
        this.f41798c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f41799d = str;
            N1.g.c(c5217l, "Argument must not be null");
            this.f41797b = c5217l;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
