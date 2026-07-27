package C2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C2739Qe;
import com.google.android.gms.internal.ads.C4285zp;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.UA;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;
import q2.C4900p;

/* renamed from: C2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0273f implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f333b;

    public /* synthetic */ C0273f(int i, Object obj) {
        this.f332a = i;
        this.f333b = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        switch (this.f332a) {
            case 0:
                BinderC0278k binderC0278k = (BinderC0278k) this.f333b;
                return QC.u(binderC0278k.a4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C0274g(0, binderC0278k, (ArrayList) obj), binderC0278k.f377z);
            case 1:
                final Uri uri = (Uri) obj;
                BinderC0278k binderC0278k2 = (BinderC0278k) this.f333b;
                return QC.u(binderC0278k2.a4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new UA() { // from class: C2.h
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !isEmpty ? BinderC0278k.b4(uri2, "nas", str) : uri2;
                    }
                }, binderC0278k2.f377z);
            default:
                C4285zp c4285zp = (C4285zp) obj;
                t tVar = new t(new JsonReader(new InputStreamReader(c4285zp.f35457a)), c4285zp.f35458b);
                try {
                    tVar.f408b = C4900p.f40196g.f40197a.n(((C2739Qe) this.f333b).f27041n).toString();
                } catch (JSONException unused) {
                    tVar.f408b = "{}";
                }
                return QC.c(tVar);
        }
    }
}
