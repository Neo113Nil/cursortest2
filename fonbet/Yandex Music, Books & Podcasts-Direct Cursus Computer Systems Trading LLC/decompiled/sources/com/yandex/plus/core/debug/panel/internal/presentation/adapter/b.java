package com.yandex.plus.core.debug.panel.internal.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.debug.panel.internal.model.ui.c;
import com.yandex.plus.core.debug.panel.internal.model.ui.d;
import com.yandex.plus.core.debug.panel.internal.model.ui.g;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.e;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.f;
import defpackage.ezc;
import defpackage.fkn;
import defpackage.fq2;
import defpackage.k8g;
import defpackage.m8f;
import defpackage.opn;
import defpackage.s7f;
import defpackage.s9f;
import defpackage.syc;
import defpackage.v75;
import defpackage.xal;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.ych;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class b extends k8g {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final Object g;
    public final syc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar, Function1 function1, Function0 function0) {
        super(new a(1));
        function1.getClass();
        function0.getClass();
        this.f = aVar;
        this.g = function1;
        this.h = function0;
    }

    @Override // defpackage.qon
    public int f(int i) {
        switch (this.e) {
            case 0:
                com.yandex.plus.core.debug.panel.internal.model.ui.b bVar = (com.yandex.plus.core.debug.panel.internal.model.ui.b) u(i);
                if (!(bVar instanceof c)) {
                    if (bVar instanceof com.yandex.plus.core.debug.panel.internal.model.ui.a) {
                        return 1;
                    }
                    if (bVar instanceof g) {
                        return 2;
                    }
                    if (bVar instanceof d) {
                        return 3;
                    }
                    xq0.x("Unknown type");
                }
                return 0;
            case 1:
            default:
                return super.f(i);
            case 2:
                return !((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.a) u(i)).f ? 1 : 0;
        }
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        switch (this.e) {
            case 0:
                com.yandex.plus.core.debug.panel.internal.model.ui.b bVar = (com.yandex.plus.core.debug.panel.internal.model.ui.b) u(i);
                if (!(opnVar instanceof e)) {
                    if (!(opnVar instanceof f)) {
                        if (!(opnVar instanceof com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b)) {
                            if (opnVar instanceof com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g) {
                                com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g gVar = (com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g) opnVar;
                                com.yandex.plus.bdui.plus.content.controller.f fVar = gVar.v;
                                bVar.getClass();
                                int w = w(i);
                                s9f[] s9fVarArr = com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g.w;
                                ((TextView) fVar.g(s9fVarArr[0])).setText(((d) bVar).a);
                                TextView textView = (TextView) fVar.g(s9fVarArr[0]);
                                Context context = gVar.a.getContext();
                                context.getClass();
                                textView.setBackground(y2x.w(context, w));
                                r1.E((TextView) fVar.g(s9fVarArr[0]), new xal(26, gVar));
                                break;
                            }
                        } else {
                            com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b bVar2 = (com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b) opnVar;
                            com.yandex.plus.bdui.plus.content.controller.f fVar2 = bVar2.v;
                            bVar.getClass();
                            int w2 = w(i);
                            s9f[] s9fVarArr2 = com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b.w;
                            ((TextView) fVar2.g(s9fVarArr2[0])).setText((CharSequence) null);
                            TextView textView2 = (TextView) fVar2.g(s9fVarArr2[0]);
                            Context context2 = bVar2.a.getContext();
                            context2.getClass();
                            textView2.setBackground(y2x.w(context2, w2));
                            r1.E((TextView) fVar2.g(s9fVarArr2[0]), new xal(bVar2, (com.yandex.plus.core.debug.panel.internal.model.ui.a) bVar));
                            break;
                        }
                    } else {
                        bVar.getClass();
                        ((TextView) ((f) opnVar).u.g(f.v[0])).setText(((g) bVar).b);
                        break;
                    }
                } else {
                    e eVar = (e) opnVar;
                    bVar.getClass();
                    c cVar = (c) bVar;
                    int w3 = w(i);
                    TextView t = eVar.t();
                    Context context3 = eVar.a.getContext();
                    context3.getClass();
                    t.setBackground(y2x.w(context3, w3));
                    eVar.t().setText(cVar.b);
                    r1.E(eVar.t(), new fq2(13, eVar, cVar));
                    break;
                }
                break;
            case 1:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.d dVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.d) opnVar;
                Object u = u(i);
                u.getClass();
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d dVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d) u;
                dVar.u = dVar2;
                ((TextView) dVar.v.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.d.x[0])).setText(dVar2.a);
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.d dVar3 = dVar.w;
                dVar3.c(dVar2.b);
                dVar3.a.setVisibility(0);
                break;
            default:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c cVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c) opnVar;
                Object u2 = u(i);
                u2.getClass();
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.a aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.a) u2;
                ((TextView) cVar2.x.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c.B[3])).setText(aVar.b);
                m8f m8fVar = cVar2.z;
                List list = aVar.c;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.c((CharSequence) it.next()));
                }
                m8fVar.v(arrayList);
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = cVar2.u;
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c.B;
                ((Button) fVar3.g(s9fVarArr3[0])).setText(aVar.d);
                r1.F((TextView) cVar2.y.g(s9fVarArr3[5]), aVar.e);
                b bVar3 = cVar2.A;
                s7f s7fVar = new s7f((com.yandex.plus.ui.core.theme.a) bVar3.f, (com.yandex.plus.core.imageloader.b) bVar3.g, Integer.valueOf(((MaterialCardView) cVar2.v.g(s9fVarArr3[1])).getCardBackgroundColor().getDefaultColor()));
                RecyclerView recyclerView = (RecyclerView) cVar2.w.g(s9fVarArr3[2]);
                recyclerView.setAdapter(s7fVar);
                recyclerView.s(new ych());
                recyclerView.setChildDrawingOrderCallback(new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a(2));
                List list2 = aVar.a;
                list2.getClass();
                ArrayList arrayList2 = (ArrayList) s7fVar.h;
                arrayList2.clear();
                arrayList2.addAll(list2);
                s7fVar.g();
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        int i2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c cVar = null;
        switch (this.e) {
            case 0:
                if (i == 0) {
                    return new e(r1.p(viewGroup, R.layout.plus_debug_panel_item_general_info, false), (com.yandex.plus.core.debug.panel.internal.presentation.controller.a) this.f);
                }
                if (i == 1) {
                    return new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.b(r1.p(viewGroup, R.layout.plus_debug_panel_item_custom_info, false), (Function1) this.g);
                }
                if (i == 2) {
                    return new f(r1.p(viewGroup, R.layout.plus_debug_panel_item_header, false));
                }
                if (i == 3) {
                    return new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.g(r1.p(viewGroup, R.layout.plus_debug_panel_item_custom_info, false), (Function0) this.h);
                }
                xq0.x("Unknown viewType");
                return null;
            case 1:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_onsale, viewGroup, false);
                inflate.getClass();
                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.d(this, inflate);
            default:
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                if (i == 0) {
                    i2 = R.layout.pay_sdk_item_counter_offer_prioritized;
                } else {
                    if (i != 1) {
                        xq0.k(i, "Unexpected viewType for counter offers adapter: ");
                        return cVar;
                    }
                    i2 = R.layout.pay_sdk_item_counter_offer_default;
                }
                View inflate2 = from.inflate(i2, viewGroup, false);
                inflate2.getClass();
                cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c(this, inflate2, i == 0);
                r1.E((Button) cVar.u.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.c.B[0]), new fq2(17, this, cVar));
                return cVar;
        }
    }

    public int w(int i) {
        boolean z = i == 0 || f(i + (-1)) == 2;
        boolean z2 = i == c() - 1 || f(i + 1) == 2;
        return (z && z2) ? R.drawable.plus_debug_panel_bg_all_corners_rounded : z ? R.drawable.plus_debug_panel_bg_top_corners_rounded : z2 ? R.drawable.plus_debug_panel_bg_bottom_corners_rounded : R.drawable.plus_debug_panel_bg_rectangle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.yandex.plus.core.imageloader.b bVar, fkn fknVar, Function2 function2) {
        super(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.c.p);
        bVar.getClass();
        this.f = bVar;
        this.g = fknVar;
        this.h = (ezc) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, Function1 function1) {
        super(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.b.p);
        aVar.getClass();
        bVar.getClass();
        this.f = aVar;
        this.g = bVar;
        this.h = (ezc) function1;
    }
}
