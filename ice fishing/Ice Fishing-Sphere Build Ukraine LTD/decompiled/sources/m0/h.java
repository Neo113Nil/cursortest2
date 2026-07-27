package m0;

import a.AbstractC0069a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2777a = new h();

    @Override // m0.j
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            p.f2784b.getClass();
            JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // m0.j
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object M2 = AbstractC0069a.M(obj);
        if (M2 instanceof String) {
            p pVar = p.f2784b;
            String quote = JSONObject.quote((String) M2);
            pVar.getClass();
            return p.d(quote);
        }
        p pVar2 = p.f2784b;
        String obj2 = M2.toString();
        pVar2.getClass();
        return p.d(obj2);
    }
}
