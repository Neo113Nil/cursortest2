package a1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import u0.AbstractC1050a;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093i implements InterfaceC0096l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0093i f2034a = new C0093i();

    @Override // a1.InterfaceC0096l
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC1050a.F(obj));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC1050a.F(put);
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

    @Override // a1.InterfaceC0096l
    public x0.e b(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    C0100p.f2038b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(C0100p.a(byteBuffer));
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
                return new x0.e(19, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // a1.InterfaceC0096l
    public Object c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    C0100p.f2038b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(C0100p.a(byteBuffer));
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
                    throw new C0091g((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // a1.InterfaceC0096l
    public ByteBuffer d(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC1050a.F(str)).put(JSONObject.NULL).put(AbstractC1050a.F(str2));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC1050a.F(put);
        if (F2 instanceof String) {
            C0100p c0100p = C0100p.f2038b;
            String quote = JSONObject.quote((String) F2);
            c0100p.getClass();
            return C0100p.b(quote);
        }
        C0100p c0100p2 = C0100p.f2038b;
        String obj = F2.toString();
        c0100p2.getClass();
        return C0100p.b(obj);
    }

    @Override // a1.InterfaceC0096l
    public ByteBuffer e(x0.e eVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) eVar.f8530b);
            jSONObject.put("args", AbstractC1050a.F(eVar.f8531c));
            Object F2 = AbstractC1050a.F(jSONObject);
            if (F2 instanceof String) {
                C0100p c0100p = C0100p.f2038b;
                String quote = JSONObject.quote((String) F2);
                c0100p.getClass();
                return C0100p.b(quote);
            }
            C0100p c0100p2 = C0100p.f2038b;
            String obj = F2.toString();
            c0100p2.getClass();
            return C0100p.b(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // a1.InterfaceC0096l
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC1050a.F(str2)).put(AbstractC1050a.F(obj));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC1050a.F(put);
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
