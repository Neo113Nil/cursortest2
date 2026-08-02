package com.yandex.music.shared.plus.features.plaque.api;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.yandex.plus.home.plaque.plugin.internal.proxy.h;
import com.yandex.plus.home.plaque.plugin.internal.proxy.j;
import com.yandex.plus.plaquesdk.plaque.c;
import defpackage.btf;
import defpackage.etk;
import defpackage.g9m;
import defpackage.iik;
import defpackage.ysk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class PlusPlaqueContainerView extends FrameLayout {
    public /* synthetic */ PlusPlaqueContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void a(Context context, g9m g9mVar) {
        context.getClass();
        g9mVar.getClass();
        if (getChildCount() > 0) {
            return;
        }
        ysk yskVar = (ysk) g9mVar.l.getValue();
        ((etk) yskVar.c.getValue()).getClass();
        setTransitionName(context.getString(R.string.plaque_sdk_plaque_scene_root_transition_name));
        h hVar = (h) yskVar.b.getValue();
        hVar.getClass();
        c cVar = (c) ((j) btf.b(new iik(4, hVar, context)).getValue()).a.f;
        context.getClass();
        int i = context.getResources().getConfiguration().screenHeightDp;
        int applyDimension = (int) TypedValue.applyDimension(1, 16, context.getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics());
        setPadding(applyDimension2, i < 480 ? applyDimension2 / 2 : applyDimension2, applyDimension, applyDimension);
        addView(cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPlaqueContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPlaqueContainerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPlaqueContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
