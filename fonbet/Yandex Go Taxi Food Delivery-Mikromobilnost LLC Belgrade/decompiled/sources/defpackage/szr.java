package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.widget.menu.a;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class szr extends xok {
    public final /* synthetic */ int a = 0;
    public final Context b;
    public final ut31 c;
    public final pzf d;
    public final Object e;

    public szr(Context context, ut31 ut31Var, pzf pzfVar, final syk sykVar) {
        final int i = 1;
        bei beiVar = bei.C;
        this.b = context;
        this.c = ut31Var;
        this.d = pzfVar;
        this.e = beiVar;
        ut31Var.d("TitleDivBlockViewBuilder.TITLE", new zq31() { // from class: rzr
            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                syk sykVar2 = sykVar;
                szr szrVar = (szr) this;
                switch (i2) {
                    case 0:
                        return xok.d(sykVar2, szrVar.b, gng0.legacyFooterStyle, ogh0.div_footer);
                    default:
                        return xok.d(sykVar2, szrVar.b, gng0.legacyTitleStyle, ogh0.div_title_text);
                }
            }
        }, 8);
    }

    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        int i = this.a;
        pzf pzfVar = this.d;
        ut31 ut31Var = this.c;
        switch (i) {
            case 0:
                hrk hrkVar = (hrk) n15Var;
                HtmlString htmlString = hrkVar.y;
                ctk ctkVar = hrkVar.x;
                if (!xdb1.f(htmlString, ctkVar) && !xdb1.d(ctkVar)) {
                    z83.j("Unexpected element [" + hrkVar + "]");
                    return null;
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) ut31Var.b("FooterDivViewBuilder.FOOTER");
                pzfVar.d(hrkVar.z).b(appCompatTextView);
                if (xdb1.f(htmlString, ctkVar)) {
                    appCompatTextView.setText(htmlString);
                } else {
                    if (!xdb1.d(ctkVar)) {
                        z83.j("How come? Check that #isValidBlock method code is up to date!");
                        return null;
                    }
                    h2b h2bVar = (h2b) this.e;
                    ctk ctkVar2 = hrkVar.x;
                    int i2 = atg0.div_horizontal_padding;
                    int i3 = atg0.div_footer_image_size;
                    xok.c(divView, h2bVar, appCompatTextView, htmlString, ctkVar2, i2, i2, i3, i3);
                }
                return appCompatTextView;
            default:
                eil eilVar = (eil) n15Var;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ut31Var.b("TitleDivBlockViewBuilder.TITLE");
                HtmlString htmlString2 = eilVar.z;
                boolean z = htmlString2 != null;
                if (z) {
                    xok.f(appCompatTextView2, htmlString2, pzfVar.d(eilVar.A));
                }
                ArrayList arrayList = eilVar.y;
                if (arrayList == null || arrayList.isEmpty()) {
                    return appCompatTextView2;
                }
                divView.getConfig().getClass();
                int i4 = eilVar.x;
                Context context = this.b;
                int i5 = atg0.div_title_menu_padding;
                a aVar = new a(context, appCompatTextView2, i5, i5);
                aVar.e = fzg0.overflow_menu_button;
                aVar.d = i4;
                aVar.f = new uiz0(this, divView, arrayList);
                aVar.c = 53;
                if (z) {
                    aVar.g = new View[]{appCompatTextView2};
                }
                divView.subscribe(new tiz0(aVar));
                return aVar.a();
        }
    }

    public szr(Context context, ut31 ut31Var, h2b h2bVar, pzf pzfVar, final syk sykVar) {
        final int i = 0;
        this.b = context;
        this.c = ut31Var;
        this.e = h2bVar;
        this.d = pzfVar;
        ut31Var.d("FooterDivViewBuilder.FOOTER", new zq31() { // from class: rzr
            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                syk sykVar2 = sykVar;
                szr szrVar = (szr) this;
                switch (i2) {
                    case 0:
                        return xok.d(sykVar2, szrVar.b, gng0.legacyFooterStyle, ogh0.div_footer);
                    default:
                        return xok.d(sykVar2, szrVar.b, gng0.legacyTitleStyle, ogh0.div_title_text);
                }
            }
        }, 8);
    }
}
