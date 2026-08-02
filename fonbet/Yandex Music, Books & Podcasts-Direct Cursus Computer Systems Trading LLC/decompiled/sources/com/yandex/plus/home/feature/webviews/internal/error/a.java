package com.yandex.plus.home.feature.webviews.internal.error;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.xal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a extends FrameLayout {
    public final Function0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull com.yandex.plus.resources.core.a aVar, @NotNull Function0<Unit> function0) {
        super(context);
        context.getClass();
        aVar.getClass();
        function0.getClass();
        this.a = function0;
        r1.p(this, R.layout.plus_sdk_web_view_error_view, true);
        View findViewById = findViewById(R.id.retry_button);
        findViewById.getClass();
        new d(findViewById, aVar);
        r1.E(findViewById, new xal(29, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(2, this)));
    }
}
