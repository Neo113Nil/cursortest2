package defpackage;

import android.net.Uri;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class nb7 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        ynh.a("media3.datasource");
    }

    public nb7(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        vq1.v(j + j2 >= 0);
        vq1.v(j2 >= 0);
        vq1.v(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return ServiceCommand.TYPE_GET;
        }
        if (i == 2) {
            return ServiceCommand.TYPE_POST;
        }
        if (i == 3) {
            return "HEAD";
        }
        e7o.n();
        return null;
    }

    public final mb7 a() {
        mb7 mb7Var = new mb7();
        mb7Var.a = this.a;
        mb7Var.b = this.b;
        mb7Var.c = this.c;
        mb7Var.d = this.d;
        mb7Var.e = this.e;
        mb7Var.f = this.f;
        mb7Var.g = this.g;
        mb7Var.h = this.h;
        mb7Var.i = this.i;
        return mb7Var;
    }

    public final boolean c(int i) {
        return (this.i & i) == i;
    }

    public final nb7 d(long j) {
        long j2 = this.g;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final nb7 e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new nb7(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(StringUtil.SPACE);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return f1d.i(sb, this.i, "]");
    }

    public nb7(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0);
    }

    public nb7(Uri uri) {
        this(uri, 0L, -1L);
    }
}
