package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.squareup.wire.WireJsonAdapterFactory;
import com.yandex.quark.platform.utils.json.DoubleJsonAdapterFactory;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes8.dex */
public final class t830 implements gcx {
    public static final s830 b = new s830();
    public static WeakReference c = new WeakReference(null);
    public final Moshi a;

    /* JADX WARN: Multi-variable type inference failed */
    public t830(Map map, boolean z) {
        Moshi build;
        if (map.isEmpty() && z) {
            synchronized (b) {
                build = (Moshi) c.get();
                if (build == null) {
                    build = new Moshi.Builder().add((JsonAdapter.Factory) new WireJsonAdapterFactory(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0)).add((JsonAdapter.Factory) new DoubleJsonAdapterFactory()).build();
                    c = new WeakReference(build);
                }
            }
        } else {
            build = new Moshi.Builder().add((JsonAdapter.Factory) new WireJsonAdapterFactory(map, z)).add((JsonAdapter.Factory) new DoubleJsonAdapterFactory()).build();
        }
        this.a = build;
    }

    public final syj0 a(Class cls, String str) {
        try {
            Object fromJson = this.a.adapter((Type) cls).fromJson(str);
            return fromJson == null ? new jyj0(new ecx("Received empty value")) : new lyj0(fromJson);
        } catch (JsonDataException e) {
            return new jyj0(new ecx(g8e.o("Invalid json structure: ", e.getMessage())));
        } catch (IOException e2) {
            return new jyj0(new ecx(g8e.o("IO error during conversion: ", e2.getMessage())));
        }
    }

    public final syj0 b(Class cls, Object obj) {
        String json2 = this.a.adapter((Type) cls).toJson(obj);
        if (json2.length() <= 0) {
            json2 = null;
        }
        return json2 == null ? new jyj0(new fcx()) : new lyj0(json2);
    }
}
