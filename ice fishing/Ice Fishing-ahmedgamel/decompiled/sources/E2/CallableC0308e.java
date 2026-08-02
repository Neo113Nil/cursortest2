package E2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2861Wf;
import com.google.android.gms.internal.ads.C3236fu;
import com.google.android.gms.internal.ads.C3518l7;
import com.google.android.gms.internal.ads.InterfaceC3358i7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: E2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0308e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f791d;

    public /* synthetic */ CallableC0308e(int i, Object obj, Object obj2, Object obj3) {
        this.f788a = i;
        this.f789b = obj;
        this.f791d = obj2;
        this.f790c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C3236fu c3236fu;
        Object obj = this.f791d;
        Object obj2 = this.f789b;
        Object obj3 = this.f790c;
        switch (this.f788a) {
            case 0:
                BinderC0314k binderC0314k = (BinderC0314k) obj2;
                InterfaceC3358i7 interfaceC3358i7 = binderC0314k.f834w.f32160b;
                String i = interfaceC3358i7 != null ? interfaceC3358i7.i(binderC0314k.f833v, (View) Y2.b.D0((Y2.a) obj3), null) : "";
                if (TextUtils.isEmpty(i)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (ArrayList) obj) {
                    if (BinderC0314k.Y3(uri, binderC0314k.f825S, binderC0314k.f826T)) {
                        arrayList.add(BinderC0314k.b4(uri, "ms", i));
                    } else {
                        String valueOf = String.valueOf(uri);
                        int i4 = w2.z.f41712b;
                        x2.i.f("Not a Google URL: ".concat(valueOf));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                Uri uri2 = (Uri) obj;
                BinderC0314k binderC0314k2 = (BinderC0314k) obj2;
                binderC0314k2.getClass();
                try {
                    Y2.a aVar = (Y2.a) obj3;
                    uri2 = (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vd)).booleanValue() || (c3236fu = binderC0314k2.f835x) == null) ? binderC0314k2.f834w.b(uri2, binderC0314k2.f833v, (View) Y2.b.D0(aVar), null) : c3236fu.a(uri2, binderC0314k2.f833v, (View) Y2.b.D0(aVar), null);
                } catch (C3518l7 e9) {
                    int i6 = w2.z.f41712b;
                    x2.i.g("", e9);
                }
                if (uri2.getQueryParameter("ms") != null) {
                    return uri2;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                BinderC0314k binderC0314k3 = (BinderC0314k) obj2;
                C2861Wf c2861Wf = (C2861Wf) obj;
                return binderC0314k3.Z3(binderC0314k3.f833v, c2861Wf.f29162n, c2861Wf.f29163u, c2861Wf.f29164v, c2861Wf.f29165w, (Bundle) obj3);
            case 3:
                H2.a.a(((C) obj2).f720c, m2.b.BANNER, (m2.g) obj, (D) obj3);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((com.google.android.gms.internal.consent_sdk.D) obj2).a((String) obj, (JSONObject) obj3));
        }
    }
}
