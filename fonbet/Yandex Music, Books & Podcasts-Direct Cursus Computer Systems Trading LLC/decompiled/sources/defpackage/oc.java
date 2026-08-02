package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ oc(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                gbv gbvVar = (gbv) obj;
                if (!(gbvVar instanceof fbv)) {
                    if (!Intrinsics.d(gbvVar, ebv.a)) {
                        b6e.s();
                        break;
                    }
                } else {
                    WebView webView = (WebView) this.b.getValue();
                    if (webView != null) {
                        fbv fbvVar = (fbv) gbvVar;
                        webView.loadUrl(fbvVar.a, fbvVar.b);
                    }
                }
                break;
            case 1:
                this.b.setValue(obj);
                break;
            case 2:
                this.b.setValue((ylu) obj);
                break;
            case 3:
                int intValue = ((Number) obj).intValue();
                o3k o3kVar = (o3k) this.b.getValue();
                if (o3kVar == null || (r2 = o3k.v(intValue, o3kVar, continuation)) != nm6.a) {
                    break;
                }
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.b.setValue(bool);
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    this.b.setValue(lmf.a);
                }
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.b.setValue(bool2);
                break;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.b.setValue(bool3);
                break;
            default:
                this.b.setValue((ylu) obj);
                break;
        }
        return Unit.a;
    }
}
