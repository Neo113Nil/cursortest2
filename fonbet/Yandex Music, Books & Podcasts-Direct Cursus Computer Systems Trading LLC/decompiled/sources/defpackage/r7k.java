package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.IOException;

/* loaded from: classes.dex */
public class r7k extends IOException {
    public final boolean a;
    public final int b;

    public r7k(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static r7k a(RuntimeException runtimeException, String str) {
        return new r7k(str, runtimeException, true, 1);
    }

    public static r7k b(String str, Exception exc) {
        return new r7k(str, exc, true, 4);
    }

    public static r7k c(String str) {
        return new r7k(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(StringUtil.SPACE) : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return f1d.i(sb, this.b, "}");
    }
}
