package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.btf;
import defpackage.g1e;
import defpackage.jyr;
import defpackage.qpj;
import defpackage.rpj;
import defpackage.uwf;
import defpackage.v75;
import defpackage.zne;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class d extends FrameLayout implements com.yandex.plus.core.debug.panel.internal.presentation.controller.c {
    public static final /* synthetic */ int o = 0;
    public final zne a;
    public final com.yandex.plus.core.debug.panel.api.a b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function1 g;
    public final Stack h;
    public final g1e i;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a j;
    public final com.yandex.plus.bdui.plus.content.controller.f k;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a l;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a m;
    public final jyr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull zne zneVar, @NotNull com.yandex.plus.core.debug.panel.api.a aVar, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function1<? super Boolean, Unit> function12) {
        super(context);
        context.getClass();
        zneVar.getClass();
        aVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function12.getClass();
        this.a = zneVar;
        this.b = aVar;
        this.c = function1;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = function12;
        this.h = new Stack();
        this.i = new g1e(new com.yandex.plus.bdui.plus.checkout.h(14, this));
        this.j = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        this.k = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.core.debug.panel.internal.utils.resource.a(context, 0));
        this.l = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        this.m = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        this.n = btf.b(new com.yandex.plus.bdui.content.b(8, context, this));
        setBackgroundColor(r1.i(R.color.home_sdk_semantic_bg_primary_page, this));
        setClickable(true);
        setFocusable(true);
    }

    private final f getInfoView() {
        return (f) this.n.getValue();
    }

    public final void a() {
        Stack stack = this.h;
        Object peek = stack.peek();
        if ((peek instanceof c ? (c) peek : null) != null) {
            removeView((View) stack.pop());
        }
    }

    public final void b(com.yandex.plus.core.debug.panel.internal.presentation.state.b bVar) {
        bVar.getClass();
        Stack stack = this.h;
        if (stack.size() > 1) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            stack.push(getInfoView());
        }
        removeAllViews();
        addView(getInfoView());
        f infoView = getInfoView();
        ArrayList arrayList = new ArrayList();
        String m = r1.m(R.string.plus_sdk_debug_panel_general_information_title, this);
        arrayList.add(new com.yandex.plus.core.debug.panel.internal.model.ui.g(m, m));
        List list = bVar.a;
        List list2 = bVar.b;
        this.m.getClass();
        list.getClass();
        List<com.yandex.plus.core.debug.panel.internal.model.ui.f> list3 = list;
        ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
        for (com.yandex.plus.core.debug.panel.internal.model.ui.f fVar : list3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = fVar.b;
            int S = StringsKt.S(str, '\n', 0, 6);
            Integer valueOf = Integer.valueOf(S);
            if (S == -1) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : str.length();
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str.substring(0, intValue));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) str.substring(intValue));
            arrayList2.add(new com.yandex.plus.core.debug.panel.internal.model.ui.c(fVar.a, new SpannedString(spannableStringBuilder)));
        }
        arrayList.addAll(arrayList2);
        String m2 = r1.m(R.string.plus_sdk_debug_panel_logs_screen_title, this);
        arrayList.add(new com.yandex.plus.core.debug.panel.internal.model.ui.g(m2, m2));
        String m3 = r1.m(R.string.plus_sdk_debug_panel_general_screen_logs_item_title, this);
        arrayList.add(new com.yandex.plus.core.debug.panel.internal.model.ui.d(m3, new SpannedString(m3)));
        List list4 = list2;
        if (!list4.isEmpty()) {
            String m4 = r1.m(R.string.plus_sdk_debug_panel_specified_information_title, this);
            arrayList.add(new com.yandex.plus.core.debug.panel.internal.model.ui.g(m4, m4));
            arrayList.addAll(list4);
        }
        infoView.getClass();
        infoView.s.v(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        qpj onBackPressedDispatcher;
        super.onAttachedToWindow();
        rpj o2 = uwf.o(this);
        if (o2 == null || (onBackPressedDispatcher = o2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        g1e g1eVar = this.i;
        g1eVar.getClass();
        onBackPressedDispatcher.b(g1eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.remove();
    }
}
