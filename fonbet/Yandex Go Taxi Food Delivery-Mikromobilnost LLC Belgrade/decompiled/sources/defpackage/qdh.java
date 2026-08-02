package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.JSONSerializerError;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qdh {
    public final Moshi a = new Moshi.Builder().build();

    public final tyj0 a(String str) {
        y3x b;
        try {
            boolean x = cvu0.x(evu0.o0(str).toString(), "{", false);
            Moshi moshi = this.a;
            if (x) {
                Map map = (Map) moshi.adapter(Map.class).fromJson(str);
                if (map != null) {
                    b = hab1.b(map);
                }
                b = null;
            } else {
                List list = (List) moshi.adapter(List.class).fromJson(str);
                if (list != null) {
                    b = hab1.b(list);
                }
                b = null;
            }
            if (b != null) {
                return new tyj0(b, null);
            }
            return new tyj0(null, new JSONSerializerError("Unable to JSON-deserialize object \"" + str + "\"", null));
        } catch (Throwable th) {
            return new tyj0(null, new JSONSerializerError(oyr.p("Unable to JSON-deserialize object \"", str, "\""), th));
        }
    }

    public final tyj0 b(y3x y3xVar) {
        JSONItemKind jSONItemKind = y3xVar.a;
        if (jSONItemKind != JSONItemKind.map && jSONItemKind != JSONItemKind.array) {
            return new tyj0(null, new JSONSerializerError(g8e.o("Unable to JSON-deserialize object: ", jSONItemKind.name()), null));
        }
        try {
            return new tyj0(c(hab1.a(y3xVar)), null);
        } catch (Throwable th) {
            return new tyj0(null, new JSONSerializerError("Unable to JSON-serialize object", new Throwable(th.getMessage())));
        }
    }

    public final String c(Serializable serializable) {
        if (serializable == null) {
            return "null";
        }
        boolean z = serializable instanceof Integer;
        Moshi moshi = this.a;
        if (z) {
            return moshi.adapter(Integer.TYPE).toJson(serializable);
        }
        if (serializable instanceof Long) {
            return moshi.adapter(Long.TYPE).toJson(serializable);
        }
        if (serializable instanceof Double) {
            return moshi.adapter(Double.TYPE).toJson(serializable);
        }
        if (serializable instanceof String) {
            return moshi.adapter(String.class).toJson(serializable);
        }
        if (serializable instanceof Boolean) {
            return moshi.adapter(Boolean.TYPE).toJson(serializable);
        }
        if (serializable instanceof List) {
            return moshi.adapter(List.class).serializeNulls().toJson(serializable);
        }
        if (serializable instanceof Map) {
            return moshi.adapter(Map.class).serializeNulls().toJson(serializable);
        }
        kbs.g("Unknown object type to serialize: ".concat(serializable.getClass().getSimpleName()));
        return null;
    }
}
