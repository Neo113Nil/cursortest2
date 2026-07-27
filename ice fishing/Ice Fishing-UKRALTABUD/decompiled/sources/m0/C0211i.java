package m0;

import L.Q;
import a.AbstractC0069a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211i implements InterfaceC0214l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0211i f2770a = new C0211i();

    @Override // m0.InterfaceC0214l
    public ByteBuffer a(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0069a.M(str)).put(JSONObject.NULL).put(AbstractC0069a.M(str2));
        if (put == null) {
            return null;
        }
        Object M2 = AbstractC0069a.M(put);
        if (M2 instanceof String) {
            C0218p c0218p = C0218p.f2776b;
            String quote = JSONObject.quote((String) M2);
            c0218p.getClass();
            return C0218p.d(quote);
        }
        C0218p c0218p2 = C0218p.f2776b;
        String obj = M2.toString();
        c0218p2.getClass();
        return C0218p.d(obj);
    }

    @Override // m0.InterfaceC0214l
    public ByteBuffer b(Q q2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) q2.f597g);
            jSONObject.put("args", AbstractC0069a.M(q2.f598h));
            Object M2 = AbstractC0069a.M(jSONObject);
            if (M2 instanceof String) {
                C0218p c0218p = C0218p.f2776b;
                String quote = JSONObject.quote((String) M2);
                c0218p.getClass();
                return C0218p.d(quote);
            }
            C0218p c0218p2 = C0218p.f2776b;
            String obj = M2.toString();
            c0218p2.getClass();
            return C0218p.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // m0.InterfaceC0214l
    public ByteBuffer c(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0069a.M(str2)).put(AbstractC0069a.M(obj));
        if (put == null) {
            return null;
        }
        Object M2 = AbstractC0069a.M(put);
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

    @Override // m0.InterfaceC0214l
    public ByteBuffer d(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0069a.M(obj));
        if (put == null) {
            return null;
        }
        Object M2 = AbstractC0069a.M(put);
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

    @Override // m0.InterfaceC0214l
    public Q e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    C0218p.f2776b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(C0218p.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) nextValue;
            Object obj2 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj = opt;
            }
            if (obj2 instanceof String) {
                return new Q(22, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // m0.InterfaceC0214l
    public Object f(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    C0218p.f2776b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(C0218p.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                Object opt = jSONArray.opt(0);
                if (opt == JSONObject.NULL) {
                    return null;
                }
                return opt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object opt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                    throw new C0209g((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }
}
