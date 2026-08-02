package E2;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2759Qe;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f866a;

    /* renamed from: b, reason: collision with root package name */
    public String f867b;

    /* renamed from: c, reason: collision with root package name */
    public final C2759Qe f868c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f869d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public final long f870e;

    /* renamed from: f, reason: collision with root package name */
    public final long f871f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public s(JsonReader jsonReader, C2759Qe c2759Qe) {
        Bundle bundle;
        char c9;
        this.f870e = -1L;
        this.f871f = -1L;
        this.f868c = c2759Qe;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals(com.anythink.core.common.d.g.f13115a)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals(com.anythink.core.common.d.g.f13116b)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 == 0) {
                str = jsonReader.nextString();
            } else if (c9 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c9 == 2) {
                this.f870e = jsonReader.nextLong();
            } else if (c9 != 3) {
                jsonReader.skipValue();
            } else {
                this.f871f = jsonReader.nextLong();
            }
        }
        this.f866a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f869d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() || c2759Qe == null || (bundle = c2759Qe.f27825F) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f870e);
        bundle.putLong("get-signals-sdkcore-end", this.f871f);
    }
}
