package C2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2838Wf;
import com.google.android.gms.internal.ads.C3213fu;
import com.google.android.gms.internal.ads.C3495l7;
import com.google.android.gms.internal.ads.InterfaceC3335i7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: C2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0272e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f331d;

    public /* synthetic */ CallableC0272e(int i, Object obj, Object obj2, Object obj3) {
        this.f328a = i;
        this.f329b = obj;
        this.f331d = obj2;
        this.f330c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C3213fu c3213fu;
        Object obj = this.f331d;
        Object obj2 = this.f329b;
        Object obj3 = this.f330c;
        switch (this.f328a) {
            case 0:
                BinderC0278k binderC0278k = (BinderC0278k) obj2;
                InterfaceC3335i7 interfaceC3335i7 = binderC0278k.f374w.f31381b;
                String i = interfaceC3335i7 != null ? interfaceC3335i7.i(binderC0278k.f373v, (View) W2.b.F0((W2.a) obj3), null) : "";
                if (TextUtils.isEmpty(i)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (ArrayList) obj) {
                    if (BinderC0278k.Y3(uri, binderC0278k.f365S, binderC0278k.f366T)) {
                        arrayList.add(BinderC0278k.b4(uri, "ms", i));
                    } else {
                        String valueOf = String.valueOf(uri);
                        int i6 = u2.z.f41322b;
                        v2.i.f("Not a Google URL: ".concat(valueOf));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                Uri uri2 = (Uri) obj;
                BinderC0278k binderC0278k2 = (BinderC0278k) obj2;
                binderC0278k2.getClass();
                try {
                    W2.a aVar = (W2.a) obj3;
                    uri2 = (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.vd)).booleanValue() || (c3213fu = binderC0278k2.f375x) == null) ? binderC0278k2.f374w.b(uri2, binderC0278k2.f373v, (View) W2.b.F0(aVar), null) : c3213fu.a(uri2, binderC0278k2.f373v, (View) W2.b.F0(aVar), null);
                } catch (C3495l7 e9) {
                    int i9 = u2.z.f41322b;
                    v2.i.g("", e9);
                }
                if (uri2.getQueryParameter("ms") != null) {
                    return uri2;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                BinderC0278k binderC0278k3 = (BinderC0278k) obj2;
                C2838Wf c2838Wf = (C2838Wf) obj;
                return binderC0278k3.Z3(binderC0278k3.f373v, c2838Wf.f28363n, c2838Wf.f28364u, c2838Wf.f28365v, c2838Wf.f28366w, (Bundle) obj3);
            case 3:
                F2.a.a(((D) obj2).f260c, k2.b.BANNER, (k2.g) obj, (E) obj3);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((com.google.android.gms.internal.consent_sdk.D) obj2).a((String) obj, (JSONObject) obj3));
        }
    }
}
