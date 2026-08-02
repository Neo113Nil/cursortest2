package com.yandex.plus.plaquesdk.plaque.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.plus.plaquesdk.plaque.api.models.u;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.d7g;
import defpackage.fu2;
import defpackage.wdu;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class g extends j {
    public final Function1 b;
    public final LinearLayoutCompat c;
    public final com.yandex.plus.plaquesdk.widget.f d;
    public final com.yandex.plus.plaquesdk.design.e e;

    public g(Context context, Function1 function1) {
        context.getClass();
        function1.getClass();
        this.b = function1;
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        this.c = linearLayoutCompat;
        com.yandex.plus.plaquesdk.widget.f fVar = new com.yandex.plus.plaquesdk.widget.f(context, null, 0, 6, null);
        fVar.setTransitionName("plaque_switch_widget_text_transition_name");
        fVar.setImportantForAccessibility(2);
        fVar.setLayoutParams(new d7g(-2, -2));
        Context context2 = fVar.getContext();
        context2.getClass();
        Resources resources = context2.getResources();
        resources.getClass();
        fVar.setMinWidth((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()));
        Context context3 = fVar.getContext();
        context3.getClass();
        fVar.setTextColor(context3.getColor(R.color.plaque_sdk_component_white));
        linearLayoutCompat.addView(fVar);
        this.d = fVar;
        com.yandex.plus.plaquesdk.design.e eVar = new com.yandex.plus.plaquesdk.design.e(context);
        eVar.setTransitionName("plaque_switch_widget_toggle_transition_name");
        eVar.setImportantForAccessibility(2);
        d7g d7gVar = new d7g(-2, -2);
        d7gVar.setMarginStart(com.yandex.plus.bdui.plus.analytics.b.i(R.dimen.plaque_sdk_component_safe_switch_start_margin, eVar));
        eVar.setLayoutParams(d7gVar);
        eVar.setTrackColor(R.color.plaque_sdk_plaque_switch_micro_widget_checked);
        eVar.setUncheckedTrackColor(R.color.plaque_sdk_plaque_switch_micro_widget_unchecked);
        linearLayoutCompat.addView(eVar);
        this.e = eVar;
        linearLayoutCompat.setTransitionName("plaque_switch_widget_group_transition_name");
        linearLayoutCompat.setOrientation(0);
        linearLayoutCompat.setClipChildren(false);
        linearLayoutCompat.setClipToPadding(false);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final void b(x xVar) {
        u uVar = (u) xVar;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar2 = uVar.d;
        this.c.setGravity(xVar2.c);
        int i = xVar2.c;
        com.yandex.plus.plaquesdk.widget.f fVar = this.d;
        fVar.setGravity(i);
        fVar.setText(uVar.e.a);
        this.e.setChecked(uVar.f);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final Function1 c() {
        return this.b;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final View d() {
        return this.c;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final void e(x xVar) {
        wdu.q(this.c, new fu2(10, (u) xVar));
    }

    public final String toString() {
        return "Switch";
    }
}
