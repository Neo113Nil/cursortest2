package defpackage;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class qa7 extends lq2 {
    public nb7 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        f(nb7Var);
        this.e = nb7Var;
        Uri uri = nb7Var.a;
        long j = nb7Var.g;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        vq1.u("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = dvt.a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw new r7k(k5r.k(normalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new r7k(f1d.g("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = nb7Var.f;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new hb7(2008);
        }
        int i2 = (int) j2;
        this.g = i2;
        int length = bArr.length - i2;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        g(nb7Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.db7
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        nb7 nb7Var = this.e;
        if (nb7Var != null) {
            return nb7Var.a;
        }
        return null;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = dvt.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }
}
