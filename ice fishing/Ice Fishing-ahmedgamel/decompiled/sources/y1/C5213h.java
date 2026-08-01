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
    public final C5217l f41800b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f41801c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41802d;

    /* renamed from: e, reason: collision with root package name */
    public String f41803e;

    /* renamed from: f, reason: collision with root package name */
    public URL f41804f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f41805g;

    /* renamed from: h, reason: collision with root package name */
    public int f41806h;

    public C5213h(URL url) {
        C5217l c5217l = InterfaceC5214i.f41807a;
        N1.g.c(url, "Argument must not be null");
        this.f41801c = url;
        this.f41802d = null;
        N1.g.c(c5217l, "Argument must not be null");
        this.f41800b = c5217l;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        if (this.f41805g == null) {
            this.f41805g = c().getBytes(InterfaceC4970e.f40451a);
        }
        messageDigest.update(this.f41805g);
    }

    public final String c() {
        String str = this.f41802d;
        if (str != null) {
            return str;
        }
        URL url = this.f41801c;
        N1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f41804f == null) {
            if (TextUtils.isEmpty(this.f41803e)) {
                String str = this.f41802d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f41801c;
                    N1.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f41803e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f41804f = new URL(this.f41803e);
        }
        return this.f41804f;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5213h)) {
            return false;
        }
        C5213h c5213h = (C5213h) obj;
        return c().equals(c5213h.c()) && this.f41800b.equals(c5213h.f41800b);
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        if (this.f41806h == 0) {
            int hashCode = c().hashCode();
            this.f41806h = hashCode;
            this.f41806h = this.f41800b.f41810b.hashCode() + (hashCode * 31);
        }
        return this.f41806h;
    }

    public final String toString() {
        return c();
    }

    public C5213h(String str) {
        C5217l c5217l = InterfaceC5214i.f41807a;
        this.f41801c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f41802d = str;
            N1.g.c(c5217l, "Argument must not be null");
            this.f41800b = c5217l;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
