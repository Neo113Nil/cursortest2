package defpackage;

import android.util.JsonReader;
import android.view.contentcapture.ContentCaptureSession;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import com.connectsdk.service.webos.lgcast.common.connection.LGCastCommandListener;
import com.google.gson.JsonIOException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final /* synthetic */ class jj4 implements c9a, n0f, LGCastCommandListener, ObjectConstructor, rq6 {
    public final /* synthetic */ int a;

    public /* synthetic */ jj4(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession d(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void e(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void g(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void j(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // defpackage.rq6
    public Object a(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "libraryName":
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        j("Null libraryName");
                        return null;
                    }
                    break;
                case "arch":
                    str = jsonReader.nextString();
                    if (str == null) {
                        j("Null arch");
                        return null;
                    }
                    break;
                case "buildId":
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        j("Null buildId");
                        return null;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null && str3 != null) {
            return new ub2(str, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" arch");
        }
        if (str2 == null) {
            sb.append(" libraryName");
        }
        if (str3 == null) {
            sb.append(" buildId");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }

    @Override // defpackage.n0f
    public Integer b(Object obj) {
        return Integer.valueOf(R.id.action);
    }

    @Override // defpackage.c9a
    public double c(double d) {
        switch (this.a) {
            case 5:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 6:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 7:
                float[] fArr = n95.a;
                return n95.b(n95.c, d);
            case 8:
                float[] fArr2 = n95.a;
                return n95.a(n95.c, d);
            case 9:
                float[] fArr3 = n95.a;
                return n95.d(n95.d, d);
            default:
                float[] fArr4 = n95.a;
                return n95.c(n95.d, d);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object f() {
        switch (this.a) {
            case 15:
                return new LinkedTreeMap(true);
            case 16:
                return new LinkedHashMap();
            case 17:
                return new TreeMap();
            case 18:
                return new ConcurrentHashMap();
            case 19:
                return new ConcurrentSkipListMap();
            case 20:
                return new ArrayList();
            case 21:
                return new LinkedHashSet();
            case 22:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.connectsdk.service.webos.lgcast.common.connection.LGCastCommandListener
    public void onReceive(JSONObject jSONObject) {
        ConnectionManager.lambda$subscribe$7(jSONObject);
    }
}
