package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class old implements daf {
    public final bwd b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public old(String str, bwd bwdVar) {
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            xq0.x("Must not be null or empty");
            throw null;
        }
        this.d = str;
        w1g.s(bwdVar, "Argument must not be null");
        this.b = bwdVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(daf.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        w1g.s(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    w1g.s(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof old) {
            old oldVar = (old) obj;
            if (c().equals(oldVar.c()) && this.b.equals(oldVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public old(URL url) {
        zsf zsfVar = bwd.a;
        w1g.s(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        w1g.s(zsfVar, "Argument must not be null");
        this.b = zsfVar;
    }
}
