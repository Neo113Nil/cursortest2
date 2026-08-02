package E2;

import com.google.android.gms.internal.ads.UA;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: E2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0312i implements UA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0312i f798b = new C0312i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0312i f799c = new C0312i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f800a;

    public /* synthetic */ C0312i(int i) {
        this.f800a = i;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f800a) {
            case 0:
                ArrayList arrayList = BinderC0314k.f804i0;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = BinderC0314k.f804i0;
                int i = w2.z.f41712b;
                x2.i.d("", (Exception) obj);
                return null;
        }
    }
}
