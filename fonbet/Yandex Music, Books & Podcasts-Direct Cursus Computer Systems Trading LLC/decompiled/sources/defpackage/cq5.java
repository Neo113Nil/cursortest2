package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class cq5 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cq5(fk0 fk0Var, aqi aqiVar, int i, int i2, Function0 function0, aqi aqiVar2) {
        this.d = fk0Var;
        this.e = aqiVar;
        this.b = i;
        this.c = i2;
        this.f = function0;
        this.g = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                WebView webView = (WebView) this.d;
                Function1 function1 = (Function1) this.e;
                kev kevVar = (kev) this.f;
                lev levVar = (lev) this.g;
                Context context = (Context) obj;
                context.getClass();
                function1.invoke(webView);
                int i = this.b;
                int i2 = this.c;
                webView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
                webView.setWebChromeClient(kevVar);
                webView.setWebViewClient(levVar);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
                frameLayout.addView(webView);
                return frameLayout;
            default:
                fk0 fk0Var = (fk0) this.d;
                aqi aqiVar = (aqi) this.e;
                Function0 function0 = (Function0) this.f;
                aqi aqiVar2 = (aqi) this.g;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float d = nmq.d(jpaVar.e()) / 2.0f;
                float b = nmq.b(jpaVar.e()) / 2.0f;
                float f = eeh.b(nmq.d(jpaVar.e())) % 2 != 0 ? 0.5f : 0.0f;
                spl splVar = (spl) aqiVar.getValue();
                int i3 = this.b;
                int i4 = this.c;
                if (splVar != null) {
                    float floatValue = 0.5f - ((Number) fk0Var.e()).floatValue();
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    r2v.b(i3, i4, d, f, b, function0, jpaVar, splVar, 2 * floatValue);
                }
                spl splVar2 = (spl) aqiVar2.getValue();
                float floatValue2 = ((Number) fk0Var.e()).floatValue() - 0.5f;
                r2v.b(i3, i4, d, f, b, function0, jpaVar, splVar2, (floatValue2 >= 0.0f ? floatValue2 : 0.0f) * 2);
                return Unit.a;
        }
    }

    public /* synthetic */ cq5(WebView webView, int i, int i2, Function1 function1, kev kevVar, lev levVar) {
        this.d = webView;
        this.b = i;
        this.c = i2;
        this.e = function1;
        this.f = kevVar;
        this.g = levVar;
    }
}
