package E2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C2759Qe;
import com.google.android.gms.internal.ads.C4308zp;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.UA;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;
import s2.C4949p;

/* renamed from: E2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0309f implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f793b;

    public /* synthetic */ C0309f(int i, Object obj) {
        this.f792a = i;
        this.f793b = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        switch (this.f792a) {
            case 0:
                BinderC0314k binderC0314k = (BinderC0314k) this.f793b;
                return QC.u(binderC0314k.a4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C0310g(0, binderC0314k, (ArrayList) obj), binderC0314k.f837z);
            case 1:
                final Uri uri = (Uri) obj;
                BinderC0314k binderC0314k2 = (BinderC0314k) this.f793b;
                return QC.u(binderC0314k2.a4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new UA() { // from class: E2.h
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !isEmpty ? BinderC0314k.b4(uri2, "nas", str) : uri2;
                    }
                }, binderC0314k2.f837z);
            default:
                C4308zp c4308zp = (C4308zp) obj;
                s sVar = new s(new JsonReader(new InputStreamReader(c4308zp.f36226a)), c4308zp.f36227b);
                try {
                    sVar.f867b = C4949p.f40498g.f40499a.n(((C2759Qe) this.f793b).f27826n).toString();
                } catch (JSONException unused) {
                    sVar.f867b = "{}";
                }
                return QC.c(sVar);
        }
    }
}
