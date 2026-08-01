package C2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.BinderC3248gb;
import com.google.android.gms.internal.ads.C3045cn;
import com.google.android.gms.internal.ads.InterfaceC2867Yc;
import com.google.android.gms.internal.ads.InterfaceC3249gc;
import com.google.android.gms.internal.ads.UA;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: C2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0274g implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f336c;

    public /* synthetic */ C0274g(int i, Object obj, Object obj2) {
        this.f334a = i;
        this.f335b = obj;
        this.f336c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f334a) {
            case 0:
                String str = (String) obj;
                BinderC0278k binderC0278k = (BinderC0278k) this.f335b;
                binderC0278k.getClass();
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (ArrayList) this.f336c) {
                    if (!BinderC0278k.Y3(uri, binderC0278k.f365S, binderC0278k.f366T) || TextUtils.isEmpty(str)) {
                        arrayList.add(uri);
                    } else {
                        arrayList.add(BinderC0278k.b4(uri, "nas", str));
                    }
                }
                return arrayList;
            case 1:
                InterfaceC2867Yc interfaceC2867Yc = (InterfaceC2867Yc) obj;
                interfaceC2867Yc.h((String) this.f335b, (InterfaceC3249gc) this.f336c);
                return interfaceC2867Yc;
            default:
                List list = (List) obj;
                C3045cn c3045cn = (C3045cn) this.f335b;
                c3045cn.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) this.f336c;
                String optString = jSONObject.optString(com.anythink.basead.exoplayer.k.o.f8446c);
                Integer c9 = C3045cn.c("bg_color", jSONObject);
                Integer c10 = C3045cn.c("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                return new BinderC3248gb(optString, list, c9, c10, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("animation_ms", 1000) + jSONObject.optInt("presentation_ms", 4000), c3045cn.f29588h.f31475x);
        }
    }
}
