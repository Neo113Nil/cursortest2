package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.h;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.i;
import com.yandex.plus.pay.ui.design.api.api.a;
import defpackage.c5b;
import defpackage.ern;
import defpackage.f1d;
import defpackage.gtm;
import defpackage.s7f;
import defpackage.s9f;
import defpackage.xz0;
import defpackage.ych;
import defpackage.yxm;
import defpackage.zne;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] n = {new yxm(c.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), f1d.c(ern.a, c.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), new yxm(c.class, "logosRecyclerView", "getLogosRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(c.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "descriptionTextView", "getDescriptionTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "button", "getButton()Landroid/widget/Button;", 0), new yxm(c.class, "confettiView", "getConfettiView()Lcom/yandex/plus/pay/ui/core/mobile/view/confetti/PlusPayConfettiView;", 0)};
    public final SuccessNativeContentView a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final i g;
    public final j h;
    public final s7f i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public c(SuccessNativeContentView successNativeContentView, a aVar, b bVar, Integer num, Function0 function0, Function0 function02) {
        successNativeContentView.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = successNativeContentView;
        this.b = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(successNativeContentView, 27));
        this.c = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(successNativeContentView, 28));
        this.d = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(successNativeContentView, 29));
        f fVar = new f(new b(successNativeContentView, 0));
        this.e = fVar;
        this.f = new f(new b(successNativeContentView, 1));
        s9f[] s9fVarArr = n;
        s9f s9fVar = s9fVarArr[0];
        s9fVar.getClass();
        try {
            View findViewById = successNativeContentView.findViewById(R.id.checkout_toolbar);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
            }
            this.g = new i((PlusPayToolbarView) findViewById, aVar, bVar, function0);
            j jVar = new j();
            jVar.b = new com.yandex.plus.home.plaque.animator.internal.utils.a();
            jVar.c = new LinkedHashSet();
            jVar.d = c5b.a;
            this.h = jVar;
            s7f s7fVar = new s7f((com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a.a.getValue(), bVar, num);
            this.i = s7fVar;
            this.j = b().getPaddingLeft();
            this.k = b().getPaddingTop();
            this.l = b().getPaddingRight();
            this.m = b().getPaddingBottom();
            s9f s9fVar2 = s9fVarArr[2];
            s9fVar2.getClass();
            try {
                View findViewById2 = successNativeContentView.findViewById(R.id.success_logos_recycler);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
                RecyclerView recyclerView = (RecyclerView) findViewById2;
                recyclerView.setAdapter(s7fVar);
                recyclerView.s(new ych());
                recyclerView.setChildDrawingOrderCallback(new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a(3));
                r1.E((Button) fVar.g(s9fVarArr[5]), new h(5, function02));
            } catch (ClassCastException e) {
                com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e);
                throw null;
            }
        } catch (ClassCastException e2) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e2);
            throw null;
        }
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        b().setPadding(this.j + zneVar.a, this.k + zneVar.b, this.l + zneVar.c, this.m + zneVar.d);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.b.g(n[1]);
    }

    public final void c(a aVar) {
        List list = aVar.a;
        s7f s7fVar = this.i;
        s7fVar.getClass();
        list.getClass();
        ArrayList arrayList = (ArrayList) s7fVar.h;
        arrayList.clear();
        arrayList.addAll(list);
        s7fVar.g();
        s9f[] s9fVarArr = n;
        ((TextView) this.c.g(s9fVarArr[3])).setText(aVar.b);
        r1.F((TextView) this.d.g(s9fVarArr[4]), aVar.c);
        ((Button) this.e.g(s9fVarArr[5])).setText(aVar.d);
    }

    public final void d() {
        Context context = ((PlusPayConfettiView) this.f.g(n[6])).getContext();
        context.getClass();
        IntRange intRange = com.yandex.plus.pay.ui.core.mobile.view.confetti.a.a;
        j jVar = this.h;
        jVar.getClass();
        int[] intArray = context.getResources().getIntArray(R.array.pay_sdk_confetti_colors);
        intArray.getClass();
        com.yandex.plus.pay.ui.core.mobile.view.confetti.b bVar = new com.yandex.plus.pay.ui.core.mobile.view.confetti.b(xz0.W(intArray), com.yandex.plus.pay.ui.core.mobile.view.confetti.a.a, com.yandex.plus.pay.ui.core.mobile.view.confetti.a.b, context.getResources().getDimensionPixelSize(R.dimen.pay_sdk_confetti_size));
        PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) jVar.a;
        if (plusPayConfettiView != null) {
            jVar.o();
            plusPayConfettiView.post(new gtm(18, jVar, plusPayConfettiView, bVar));
        }
    }
}
