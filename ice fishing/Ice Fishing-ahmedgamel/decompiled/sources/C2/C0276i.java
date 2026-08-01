package C2;

import com.google.android.gms.internal.ads.UA;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: C2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0276i implements UA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0276i f338b = new C0276i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0276i f339c = new C0276i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340a;

    public /* synthetic */ C0276i(int i) {
        this.f340a = i;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f340a) {
            case 0:
                ArrayList arrayList = BinderC0278k.f344n0;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = BinderC0278k.f344n0;
                int i = u2.z.f41322b;
                v2.i.d("", (Exception) obj);
                return null;
        }
    }
}
