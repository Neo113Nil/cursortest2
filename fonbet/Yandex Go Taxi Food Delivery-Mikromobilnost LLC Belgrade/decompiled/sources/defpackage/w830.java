package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class w830 implements zme {
    public static final ByteString b = cvw.r("EFBBBF");
    public final JsonAdapter a;

    public w830(JsonAdapter jsonAdapter) {
        this.a = jsonAdapter;
    }

    @Override // defpackage.zme
    public final Object l(Object obj) {
        rvj0 rvj0Var = (rvj0) obj;
        qq6 source = rvj0Var.source();
        try {
            if (source.Q(0L, b)) {
                source.skip(r1.h());
            }
            JsonReader of = JsonReader.of(source);
            Object fromJson = this.a.fromJson(of);
            if (of.peek() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            rvj0Var.close();
            return fromJson;
        } catch (Throwable th) {
            rvj0Var.close();
            throw th;
        }
    }
}
