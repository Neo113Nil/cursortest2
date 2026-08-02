package A1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class m implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final q f68b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f69c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70d;

    /* renamed from: e, reason: collision with root package name */
    public String f71e;

    /* renamed from: f, reason: collision with root package name */
    public URL f72f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f73g;

    /* renamed from: h, reason: collision with root package name */
    public int f74h;

    public m(URL url) {
        q qVar = n.f75a;
        P1.g.c(url, "Argument must not be null");
        this.f69c = url;
        this.f70d = null;
        P1.g.c(qVar, "Argument must not be null");
        this.f68b = qVar;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        if (this.f73g == null) {
            this.f73g = c().getBytes(InterfaceC5066e.f41005a);
        }
        messageDigest.update(this.f73g);
    }

    public final String c() {
        String str = this.f70d;
        if (str != null) {
            return str;
        }
        URL url = this.f69c;
        P1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f72f == null) {
            if (TextUtils.isEmpty(this.f71e)) {
                String str = this.f70d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f69c;
                    P1.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f71e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f72f = new URL(this.f71e);
        }
        return this.f72f;
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return c().equals(mVar.c()) && this.f68b.equals(mVar.f68b);
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        if (this.f74h == 0) {
            int hashCode = c().hashCode();
            this.f74h = hashCode;
            this.f74h = this.f68b.f78b.hashCode() + (hashCode * 31);
        }
        return this.f74h;
    }

    public final String toString() {
        return c();
    }

    public m(String str) {
        q qVar = n.f75a;
        this.f69c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f70d = str;
            P1.g.c(qVar, "Argument must not be null");
            this.f68b = qVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
