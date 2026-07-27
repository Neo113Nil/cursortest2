package y1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import s1.InterfaceC4992e;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5234i implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final C5238m f41837b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f41838c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41839d;

    /* renamed from: e, reason: collision with root package name */
    public String f41840e;

    /* renamed from: f, reason: collision with root package name */
    public URL f41841f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f41842g;

    /* renamed from: h, reason: collision with root package name */
    public int f41843h;

    public C5234i(URL url) {
        C5238m c5238m = InterfaceC5235j.f41844a;
        N1.g.c(url, "Argument must not be null");
        this.f41838c = url;
        this.f41839d = null;
        N1.g.c(c5238m, "Argument must not be null");
        this.f41837b = c5238m;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        if (this.f41842g == null) {
            this.f41842g = c().getBytes(InterfaceC4992e.f40420a);
        }
        messageDigest.update(this.f41842g);
    }

    public final String c() {
        String str = this.f41839d;
        if (str != null) {
            return str;
        }
        URL url = this.f41838c;
        N1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f41841f == null) {
            if (TextUtils.isEmpty(this.f41840e)) {
                String str = this.f41839d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f41838c;
                    N1.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f41840e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f41841f = new URL(this.f41840e);
        }
        return this.f41841f;
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5234i)) {
            return false;
        }
        C5234i c5234i = (C5234i) obj;
        return c().equals(c5234i.c()) && this.f41837b.equals(c5234i.f41837b);
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        if (this.f41843h == 0) {
            int hashCode = c().hashCode();
            this.f41843h = hashCode;
            this.f41843h = this.f41837b.f41847b.hashCode() + (hashCode * 31);
        }
        return this.f41843h;
    }

    public final String toString() {
        return c();
    }

    public C5234i(String str) {
        C5238m c5238m = InterfaceC5235j.f41844a;
        this.f41838c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f41839d = str;
            N1.g.c(c5238m, "Argument must not be null");
            this.f41837b = c5238m;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
