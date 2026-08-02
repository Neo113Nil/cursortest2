package E2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.BinderC3271gb;
import com.google.android.gms.internal.ads.C3122dn;
import com.google.android.gms.internal.ads.InterfaceC2890Yc;
import com.google.android.gms.internal.ads.InterfaceC3272gc;
import com.google.android.gms.internal.ads.UA;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: E2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310g implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f796c;

    public /* synthetic */ C0310g(int i, Object obj, Object obj2) {
        this.f794a = i;
        this.f795b = obj;
        this.f796c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f794a) {
            case 0:
                String str = (String) obj;
                BinderC0314k binderC0314k = (BinderC0314k) this.f795b;
                binderC0314k.getClass();
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (ArrayList) this.f796c) {
                    if (!BinderC0314k.Y3(uri, binderC0314k.f825S, binderC0314k.f826T) || TextUtils.isEmpty(str)) {
                        arrayList.add(uri);
                    } else {
                        arrayList.add(BinderC0314k.b4(uri, "nas", str));
                    }
                }
                return arrayList;
            case 1:
                InterfaceC2890Yc interfaceC2890Yc = (InterfaceC2890Yc) obj;
                interfaceC2890Yc.h((String) this.f795b, (InterfaceC3272gc) this.f796c);
                return interfaceC2890Yc;
            default:
                List list = (List) obj;
                C3122dn c3122dn = (C3122dn) this.f795b;
                c3122dn.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) this.f796c;
                String optString = jSONObject.optString(com.anythink.basead.exoplayer.k.o.f9232c);
                Integer c9 = C3122dn.c("bg_color", jSONObject);
                Integer c10 = C3122dn.c("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                return new BinderC3271gb(optString, list, c9, c10, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("animation_ms", 1000) + jSONObject.optInt("presentation_ms", 4000), c3122dn.f30625h.f32252x);
        }
    }
}
