package com.yandex.plus.home.api.panel;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.plus.home.feature.panel.internal.sections.h;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.vdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class g extends LinearLayoutCompat {
    public final Function1 A;
    public final Function2 B;
    public final Function1 C;
    public final int D;
    public final vdr p;
    public final com.yandex.plus.core.theme.e q;
    public final com.yandex.plus.home.feature.panel.internalapi.b r;
    public final com.yandex.plus.core.imageloader.b s;
    public final com.yandex.plus.home.feature.panel.internalapi.c t;
    public final com.yandex.plus.core.strings.a u;
    public final com.yandex.plus.home.feature.panel.internalapi.analytics.b v;
    public final boolean w;
    public final kotlinx.coroutines.a x;
    public final kotlinx.coroutines.a y;
    public final com.yandex.plus.log.api.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, @NotNull vdr vdrVar, @NotNull com.yandex.plus.core.theme.e eVar, com.yandex.plus.home.feature.panel.internalapi.b bVar, @NotNull com.yandex.plus.core.imageloader.b bVar2, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull com.yandex.plus.core.strings.a aVar, @NotNull com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar3, boolean z, @NotNull kotlinx.coroutines.a aVar2, @NotNull kotlinx.coroutines.a aVar3, @NotNull com.yandex.plus.log.api.b bVar4, @NotNull Function1<? super d0, Unit> function1, @NotNull Function2<? super d0, ? super Boolean, Unit> function2, @NotNull Function1<? super com.yandex.plus.home.feature.panel.internalapi.analytics.f, Unit> function12) {
        super(new ContextThemeWrapper(context, R.style.PlusSDK_Widget_Panel));
        context.getClass();
        vdrVar.getClass();
        eVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        aVar.getClass();
        bVar3.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar4.getClass();
        function1.getClass();
        function2.getClass();
        function12.getClass();
        this.p = vdrVar;
        this.q = eVar;
        this.r = bVar;
        this.s = bVar2;
        this.t = cVar;
        this.u = aVar;
        this.v = bVar3;
        this.w = z;
        this.x = aVar2;
        this.y = aVar3;
        this.z = bVar4;
        this.A = function1;
        this.B = function2;
        this.C = function12;
        this.D = getResources().getDimensionPixelSize(R.dimen.plus_sdk_panel_flow_gap);
        setId(R.id.plus_sdk_plus_panel_view);
        setOrientation(1);
        setImportantForAccessibility(2);
    }

    public final h j() {
        Context context = getContext();
        context.getClass();
        return new h(context, this.s, this.u, this.p, this.q, this.r, this.t, this.x, this.z, this.A, this.B, this.C);
    }
}
