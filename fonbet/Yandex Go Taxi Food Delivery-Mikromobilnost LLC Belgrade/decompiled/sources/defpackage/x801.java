package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class x801 implements p8w {
    public final awa0 a;

    public x801(awa0 awa0Var) {
        this.a = awa0Var;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        if (jl40.l(d5j0Var.c(String.class), "SKIP_PERFORMANCE")) {
            return zci0Var.b(d5j0Var);
        }
        kvj0 b = zci0Var.b(d5j0Var);
        String[] strArr = b.y.a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        rvj0 rvj0Var = b.z;
        long contentLength = length + (rvj0Var != null ? rvj0Var.contentLength() : 0L);
        String format = String.format("Url.%s", Arrays.copyOf(new Object[]{d5j0Var.a.b()}, 1));
        if (contentLength > 2147483647L) {
            contentLength = 2147483647L;
        }
        int i = (int) contentLength;
        String concat = "Traffic.".concat(format);
        awa0 awa0Var = this.a;
        awa0Var.getClass();
        Object obj = ComponentHistograms.b;
        vez0.A("com.yandex.yb.sdk").b(0, 104857600, 50, concat).b(i);
        awa0Var.a.b(concat, b.i(new Pair("bytes", Integer.valueOf(i)), new Pair("process_name", awa0Var.b)));
        i5z0.a.g(qv10.i(i, "Reported traffic for ", concat, Extension.COLON_SPACE, " bytes"), new Object[0]);
        return b;
    }
}
