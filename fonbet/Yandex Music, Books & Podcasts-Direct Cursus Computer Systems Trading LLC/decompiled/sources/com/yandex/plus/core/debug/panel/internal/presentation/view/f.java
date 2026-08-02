package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.o8n;
import defpackage.s9f;
import defpackage.xal;
import defpackage.yxm;
import defpackage.zne;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f extends LinearLayoutCompat {
    public static final /* synthetic */ s9f[] t = {new yxm(f.class, "infoRecyclerView", "getInfoRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), f1d.c(ern.a, f.class, "closeImageButton", "getCloseImageButton()Landroid/widget/ImageButton;", 0)};
    public final Function0 p;
    public final com.yandex.plus.bdui.plus.content.controller.f q;
    public final com.yandex.plus.bdui.plus.content.controller.f r;
    public final com.yandex.plus.core.debug.panel.internal.presentation.adapter.b s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull zne zneVar, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(context);
        context.getClass();
        zneVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        this.p = function02;
        this.q = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 0));
        this.r = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 1));
        com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar = new com.yandex.plus.core.debug.panel.internal.presentation.adapter.b(new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, f.class, "onInfoClicked", "onInfoClicked(Ljava/lang/String;)V", 0, 2), function1, function0);
        this.s = bVar;
        LayoutInflater.from(context).inflate(R.layout.plus_debug_panel_information, (ViewGroup) this, true);
        setPadding(zneVar.a, zneVar.b, zneVar.c, getPaddingBottom());
        RecyclerView infoRecyclerView = getInfoRecyclerView();
        infoRecyclerView.setPadding(infoRecyclerView.getPaddingLeft(), infoRecyclerView.getPaddingTop(), infoRecyclerView.getPaddingRight(), zneVar.d);
        r1.E(getCloseImageButton(), new xal(23, this));
        getInfoRecyclerView().setAdapter(bVar);
        RecyclerView infoRecyclerView2 = getInfoRecyclerView();
        Context context2 = getContext();
        context2.getClass();
        infoRecyclerView2.s(new o8n(context2));
    }

    private final ImageButton getCloseImageButton() {
        return (ImageButton) this.r.g(t[1]);
    }

    private final RecyclerView getInfoRecyclerView() {
        return (RecyclerView) this.q.g(t[0]);
    }
}
