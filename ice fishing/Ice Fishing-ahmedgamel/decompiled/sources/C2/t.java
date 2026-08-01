package C2;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2739Qe;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f407a;

    /* renamed from: b, reason: collision with root package name */
    public String f408b;

    /* renamed from: c, reason: collision with root package name */
    public final C2739Qe f409c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f410d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public final long f411e;

    /* renamed from: f, reason: collision with root package name */
    public final long f412f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public t(JsonReader jsonReader, C2739Qe c2739Qe) {
        Bundle bundle;
        char c9;
        this.f411e = -1L;
        this.f412f = -1L;
        this.f409c = c2739Qe;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals(com.anythink.core.common.d.g.f12329a)) {
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
                    if (nextName.equals(com.anythink.core.common.d.g.f12330b)) {
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
                this.f411e = jsonReader.nextLong();
            } else if (c9 != 3) {
                jsonReader.skipValue();
            } else {
                this.f412f = jsonReader.nextLong();
            }
        }
        this.f407a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f410d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.J2)).booleanValue() || c2739Qe == null || (bundle = c2739Qe.f27040F) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f411e);
        bundle.putLong("get-signals-sdkcore-end", this.f412f);
    }
}
