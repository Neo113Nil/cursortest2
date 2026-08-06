package J1;

import h1.C0234d;
import i1.AbstractC0253j;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final o f977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f978b;

    /* renamed from: c, reason: collision with root package name */
    public final m f979c;

    /* renamed from: d, reason: collision with root package name */
    public final w f980d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f981e;

    /* renamed from: f, reason: collision with root package name */
    public c f982f;

    public v(o url, String method, m mVar, w wVar, Map map) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(method, "method");
        this.f977a = url;
        this.f978b = method;
        this.f979c = mVar;
        this.f980d = wVar;
        this.f981e = map;
    }

    public final u a() {
        u uVar = new u(false);
        uVar.f976f = new LinkedHashMap();
        uVar.f973c = this.f977a;
        uVar.f972b = this.f978b;
        uVar.f975e = this.f980d;
        Map map = this.f981e;
        uVar.f976f = map.isEmpty() ? new LinkedHashMap() : i1.u.N(map);
        uVar.f974d = this.f979c.c();
        return uVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f978b);
        sb.append(", url=");
        sb.append(this.f977a);
        m mVar = this.f979c;
        if (mVar.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Object obj : mVar) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0253j.D();
                    throw null;
                }
                C0234d c0234d = (C0234d) obj;
                String str = (String) c0234d.f3386a;
                String str2 = (String) c0234d.f3387b;
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i2 = i3;
            }
            sb.append(']');
        }
        Map map = this.f981e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
