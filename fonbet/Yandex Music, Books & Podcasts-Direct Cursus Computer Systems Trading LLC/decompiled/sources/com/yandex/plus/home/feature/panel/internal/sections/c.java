package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.vdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c extends a {
    public static final /* synthetic */ int H0 = 0;
    public final jyr F0;
    public final int G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull com.yandex.plus.core.imageloader.b bVar, @NotNull com.yandex.plus.core.strings.a aVar, @NotNull vdr vdrVar, @NotNull com.yandex.plus.core.theme.e eVar, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar2, com.yandex.plus.home.feature.panel.internalapi.b bVar3, boolean z, @NotNull com.yandex.plus.log.api.b bVar4, @NotNull kotlinx.coroutines.a aVar2, @NotNull kotlinx.coroutines.a aVar3, @NotNull Function1<? super d0, Unit> function1, @NotNull Function1<? super com.yandex.plus.home.feature.panel.internalapi.analytics.f, Unit> function12) {
        super(context, bVar, aVar, vdrVar, eVar, cVar, bVar2, bVar3, z, aVar2, aVar3, bVar4, function1, function12);
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        vdrVar.getClass();
        eVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        bVar4.getClass();
        aVar2.getClass();
        aVar3.getClass();
        function1.getClass();
        function12.getClass();
        this.F0 = btf.b(new com.yandex.plus.bdui.plus.checkout.h(28, this));
        this.G0 = context.getResources().getDimensionPixelSize(R.dimen.plus_sdk_panel_daily_top_layout_height);
    }

    @Override // com.yandex.plus.home.feature.panel.internal.sections.l
    @NotNull
    public com.yandex.plus.home.feature.panel.internal.stub.a getStubConfig() {
        return (com.yandex.plus.home.feature.panel.internal.stub.a) this.F0.getValue();
    }
}
