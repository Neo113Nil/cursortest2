package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import kotlin.text.Regex;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class v830 implements zme {
    public static final wg10 b;
    public final JsonAdapter a;

    static {
        Regex regex = wg10.e;
        b = qje.o("application/json; charset=UTF-8");
    }

    public v830(JsonAdapter jsonAdapter) {
        this.a = jsonAdapter;
    }

    @Override // defpackage.zme
    public final Object l(Object obj) {
        yp6 yp6Var = new yp6();
        this.a.toJson(JsonWriter.of(yp6Var), (JsonWriter) obj);
        ByteString l0 = yp6Var.l0(yp6Var.b);
        int i = m5j0.a;
        return new k5j0(b, l0);
    }
}
