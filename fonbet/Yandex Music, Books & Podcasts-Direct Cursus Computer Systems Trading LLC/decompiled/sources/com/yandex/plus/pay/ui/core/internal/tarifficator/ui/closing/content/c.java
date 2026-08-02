package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.internal.d;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.h;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.i;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.e;
import defpackage.btf;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.nkf;
import defpackage.s9f;
import defpackage.y2x;
import defpackage.yxm;
import defpackage.zne;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] s = {new yxm(c.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, c.class, "linearRoot", "getLinearRoot()Landroid/view/ViewGroup;", 0), new yxm(c.class, "backgroundImageView", "getBackgroundImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new yxm(c.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "itemRecyclerView", "getItemRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(c.class, "acceptButton", "getAcceptButton()Landroid/widget/Button;", 0), new yxm(c.class, "rejectButton", "getRejectButton()Landroid/widget/Button;", 0), new yxm(c.class, "conditionTextView", "getConditionTextView()Landroid/widget/TextView;", 0)};
    public final ClosingOfferContentView a;
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;
    public final f k;
    public final f l;
    public final jyr m;
    public final nkf n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    public c(ClosingOfferContentView closingOfferContentView, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, Function0 function0, Function0 function02, Function0 function03) {
        closingOfferContentView.getClass();
        bVar.getClass();
        aVar.getClass();
        this.a = closingOfferContentView;
        this.b = bVar;
        this.c = aVar;
        this.d = new f(new i(closingOfferContentView, 24));
        this.e = new f(new i(closingOfferContentView, 25));
        this.f = new f(new i(closingOfferContentView, 26));
        this.g = new f(new i(closingOfferContentView, 27));
        this.h = new f(new i(closingOfferContentView, 28));
        this.i = new f(new i(closingOfferContentView, 29));
        f fVar = new f(new b(closingOfferContentView, 0));
        f fVar2 = new f(new b(closingOfferContentView, 1));
        this.j = fVar2;
        f fVar3 = new f(new b(closingOfferContentView, 2));
        this.k = fVar3;
        this.l = new f(new i(closingOfferContentView, 23));
        this.m = btf.b(new d(this, function0));
        nkf nkfVar = new nkf((com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a.a.getValue(), bVar);
        this.n = nkfVar;
        this.o = c().getPaddingLeft();
        this.p = c().getPaddingTop();
        this.q = c().getPaddingRight();
        this.r = c().getPaddingBottom();
        s9f[] s9fVarArr = s;
        Context context = ((RecyclerView) fVar.g(s9fVarArr[6])).getContext();
        context.getClass();
        Drawable w = y2x.w(context, R.drawable.pay_sdk_ic_divider_rounded);
        if (w != null) {
            Context context2 = closingOfferContentView.getContext();
            context2.getClass();
            w.setTint(com.yandex.plus.home.common.utils.a.b(context2, R.attr.pay_sdk_primaryTextColor));
        }
        RecyclerView recyclerView = (RecyclerView) fVar.g(s9fVarArr[6]);
        recyclerView.setAdapter(nkfVar);
        recyclerView.s(new e(w, r1.k(R.dimen.pay_sdk_closing_item_spacing_size, recyclerView), r1.k(R.dimen.pay_sdk_closing_item_edge_radius, recyclerView), r1.k(R.dimen.pay_sdk_small_corner_size, recyclerView)));
        r1.E((Button) fVar2.g(s9fVarArr[7]), new h(1, function02));
        r1.E((Button) fVar3.g(s9fVarArr[8]), new h(2, function03));
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        ((ViewGroup) this.e.g(s[1])).setPadding(this.o + zneVar.a, this.p + zneVar.b, this.q + zneVar.c, this.r + zneVar.d);
    }

    public final ImageView b() {
        return (ImageView) this.f.g(s[2]);
    }

    public final ViewGroup c() {
        return (ViewGroup) this.d.g(s[0]);
    }

    public final void d(a aVar) {
        aVar.getClass();
        y yVar = aVar.a;
        ImageView b = b();
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.b;
        bVar.a(b);
        com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) this.c).a.a.getValue();
        Context context = b().getContext();
        context.getClass();
        bVar.b(u.r(context, aVar2) ? yVar.b : yVar.a).i(b());
        s9f[] s9fVarArr = s;
        ((TextView) this.h.g(s9fVarArr[4])).setText(aVar.b);
        r1.F((TextView) this.i.g(s9fVarArr[5]), aVar.c);
        this.n.v(aVar.d);
        ((Button) this.j.g(s9fVarArr[7])).setText(aVar.e);
        ((Button) this.k.g(s9fVarArr[8])).setText(aVar.f);
        r1.F((TextView) this.l.g(s9fVarArr[9]), aVar.g);
        this.a.setVisibility(0);
    }
}
