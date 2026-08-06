package a1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import u0.AbstractC1050a;

/* renamed from: a1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092h implements InterfaceC0094j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0092h f2033a = new C0092h();

    @Override // a1.InterfaceC0094j
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            C0100p.f2038b.getClass();
            JSONTokener jSONTokener = new JSONTokener(C0100p.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // a1.InterfaceC0094j
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object F2 = AbstractC1050a.F(obj);
        if (F2 instanceof String) {
            C0100p c0100p = C0100p.f2038b;
            String quote = JSONObject.quote((String) F2);
            c0100p.getClass();
            return C0100p.b(quote);
        }
        C0100p c0100p2 = C0100p.f2038b;
        String obj2 = F2.toString();
        c0100p2.getClass();
        return C0100p.b(obj2);
    }
}
