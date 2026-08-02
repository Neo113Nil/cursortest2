package defpackage;

import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.debug.panel.internal.model.ui.e;
import com.yandex.plus.core.debug.panel.internal.presentation.adapter.a;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.d;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.h;
import java.util.List;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mxt extends k8g {
    public final /* synthetic */ int e = 2;
    public final syc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxt(Function2 function2) {
        super(new a(0));
        function2.getClass();
        this.f = function2;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, final int i) {
        switch (this.e) {
            case 0:
                lxt lxtVar = (lxt) opnVar;
                txt txtVar = (txt) this.d.f.get(i);
                ayt aytVar = lxtVar.u;
                TextView textView = aytVar.a;
                EditText editText = aytVar.c;
                String str = txtVar.b;
                String str2 = txtVar.c;
                String str3 = txtVar.a;
                if (str.length() > 0) {
                    str3 = txtVar.b + '/' + str3;
                }
                textView.setText(str3);
                aytVar.b.setText(str2);
                editText.setText(txtVar.d);
                editText.setInputType(str2.equals("number") ? true : str2.equals(PListParser.TAG_INTEGER) ? 2 : 1);
                aytVar.d = new gcp(24, lxtVar, txtVar);
                break;
            case 1:
                final d dVar = (d) opnVar;
                Object u = u(i);
                u.getClass();
                e eVar = (e) u;
                TextView textView2 = (TextView) dVar.v.g(d.x[0]);
                View view = dVar.a;
                view.getClass();
                textView2.setText(r1.m(eVar.a, view));
                dVar.t().setChecked(eVar.b);
                dVar.t().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.c
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        compoundButton.getClass();
                        d.this.u.invoke(Integer.valueOf(i), Boolean.valueOf(z));
                    }
                });
                r1.E(view, new cbl(dVar, i, 1));
                break;
            default:
                h hVar = (h) opnVar;
                SpannedString spannedString = ((com.yandex.plus.core.debug.panel.internal.model.ui.d) u(i)).b;
                f fVar = hVar.v;
                s9f[] s9fVarArr = h.w;
                ((TextView) fVar.g(s9fVarArr[0])).setText(spannedString);
                r1.E((TextView) fVar.g(s9fVarArr[0]), new fq2(14, hVar, spannedString));
                break;
        }
    }

    @Override // defpackage.qon
    public void k(opn opnVar, int i, List list) {
        switch (this.e) {
            case 2:
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    com.yandex.plus.core.debug.panel.internal.model.ui.d dVar = obj instanceof com.yandex.plus.core.debug.panel.internal.model.ui.d ? (com.yandex.plus.core.debug.panel.internal.model.ui.d) obj : null;
                    if (dVar != null) {
                        h hVar = (h) opnVar;
                        SpannedString spannedString = dVar.b;
                        f fVar = hVar.v;
                        s9f[] s9fVarArr = h.w;
                        ((TextView) fVar.g(s9fVarArr[0])).setText(spannedString);
                        r1.E((TextView) fVar.g(s9fVarArr[0]), new fq2(14, hVar, spannedString));
                        break;
                    }
                } else {
                    j(opnVar, i);
                    break;
                }
                break;
            default:
                super.k(opnVar, i, list);
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        int i2 = this.e;
        syc sycVar = this.f;
        switch (i2) {
            case 0:
                return new lxt(new ayt(viewGroup.getContext()), (w40) sycVar);
            case 1:
                return new d(r1.p(viewGroup, R.layout.plus_debug_panel_item_field_choice, false), (Function2) sycVar);
            default:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plus_debug_panel_item_log, viewGroup, false);
                inflate.getClass();
                return new h(inflate, (com.yandex.plus.core.debug.panel.internal.presentation.controller.a) sycVar);
        }
    }

    public mxt(com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar) {
        super(new a(2));
        this.f = aVar;
    }

    public mxt(w40 w40Var) {
        super(new l8f(4));
        this.f = w40Var;
    }
}
