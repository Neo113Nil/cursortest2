package defpackage;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class jc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ jc(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        aqi aqiVar = this.b;
        switch (i) {
            case 0:
                WebView webView = (WebView) aqiVar.getValue();
                if (webView != null) {
                    webView.goBack();
                }
                break;
            case 2:
                aqiVar.setValue(Boolean.TRUE);
                break;
            case 3:
                Boolean bool = (Boolean) aqiVar.getValue();
                bool.getClass();
                break;
            case 6:
                Boolean bool2 = (Boolean) aqiVar.getValue();
                bool2.getClass();
                break;
            case 7:
                ((Function0) aqiVar.getValue()).invoke();
                break;
            case 8:
                ((Function0) aqiVar.getValue()).invoke();
                break;
            case 9:
                aqiVar.setValue(Boolean.TRUE);
                break;
            case 12:
                wbi wbiVar = new wbi();
                ((Function1) aqiVar.getValue()).invoke(wbiVar);
                break;
            case 13:
                int i2 = kii.p;
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 14:
                Boolean bool3 = (Boolean) aqiVar.getValue();
                bool3.getClass();
                break;
            case 15:
                aqiVar.setValue(Boolean.TRUE);
                break;
            case 16:
                aqiVar.setValue(Boolean.TRUE);
                break;
            case 17:
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 18:
                Boolean bool4 = (Boolean) aqiVar.getValue();
                bool4.getClass();
                break;
            case 20:
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 22:
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 23:
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 24:
                aqiVar.setValue(Boolean.FALSE);
                break;
            case 25:
                aqiVar.setValue(Boolean.TRUE);
                break;
            case 26:
                float f = w8u.a;
                break;
        }
        return Float.valueOf(((Number) aqiVar.getValue()).intValue());
    }
}
