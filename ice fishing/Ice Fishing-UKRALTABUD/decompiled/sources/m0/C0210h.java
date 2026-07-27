package m0;

import a.AbstractC0069a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: m0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210h implements InterfaceC0212j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0210h f2769a = new C0210h();

    @Override // m0.InterfaceC0212j
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            C0218p.f2776b.getClass();
            JSONTokener jSONTokener = new JSONTokener(C0218p.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // m0.InterfaceC0212j
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object M2 = AbstractC0069a.M(obj);
        if (M2 instanceof String) {
            C0218p c0218p = C0218p.f2776b;
            String quote = JSONObject.quote((String) M2);
            c0218p.getClass();
            return C0218p.d(quote);
        }
        C0218p c0218p2 = C0218p.f2776b;
        String obj2 = M2.toString();
        c0218p2.getClass();
        return C0218p.d(obj2);
    }
}
