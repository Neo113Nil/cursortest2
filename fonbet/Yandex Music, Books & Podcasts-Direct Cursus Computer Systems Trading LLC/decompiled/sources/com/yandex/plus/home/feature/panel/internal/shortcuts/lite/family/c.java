package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.eup;
import defpackage.h1b;
import defpackage.h5;
import defpackage.jk6;
import defpackage.s9f;
import defpackage.vgo;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] f;
    public final jk6 a;
    public final Function0 b;
    public final com.yandex.plus.core.imageloader.b c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final eup e;

    static {
        yxm yxmVar = new yxm(c.class, "avatarImage", "getAvatarImage()Lcom/google/android/material/imageview/ShapeableImageView;", 0);
        ern.a.getClass();
        f = new s9f[]{yxmVar};
    }

    public c(View view, jk6 jk6Var, Function0 function0, com.yandex.plus.core.imageloader.b bVar) {
        view.getClass();
        function0.getClass();
        this.a = jk6Var;
        this.b = function0;
        this.c = bVar;
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(view, 11));
        eup shapeAppearanceModel = a().getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        this.e = shapeAppearanceModel;
    }

    public final ShapeableImageView a() {
        return (ShapeableImageView) this.d.g(f[0]);
    }

    public final void b(String str, boolean z) {
        Function0 function0 = this.b;
        if (z) {
            a().setShapeAppearanceModel(this.e);
            a().setBackgroundColor(((Boolean) function0.invoke()).booleanValue() ? r1.i(R.color.plus_sdk_family_avatar_color_dark, a()) : r1.i(R.color.plus_sdk_family_avatar_color_light, a()));
            ((com.yandex.plus.coil.b) this.c).b(str).i(a());
            return;
        }
        ShapeableImageView a = a();
        vgo vgoVar = new vgo();
        vgo vgoVar2 = new vgo();
        vgo vgoVar3 = new vgo();
        vgo vgoVar4 = new vgo();
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        h1b h1bVar4 = new h1b();
        h5 h5Var = new h5(0.0f);
        h5 h5Var2 = new h5(0.0f);
        h5 h5Var3 = new h5(0.0f);
        h5 h5Var4 = new h5(0.0f);
        eup eupVar = new eup();
        eupVar.a = vgoVar;
        eupVar.b = vgoVar2;
        eupVar.c = vgoVar3;
        eupVar.d = vgoVar4;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var3;
        eupVar.h = h5Var4;
        eupVar.i = h1bVar;
        eupVar.j = h1bVar2;
        eupVar.k = h1bVar3;
        eupVar.l = h1bVar4;
        a.setShapeAppearanceModel(eupVar);
        a().setImageResource(((Boolean) function0.invoke()).booleanValue() ? R.drawable.plus_sdk_ic_family_not_accepted_dark : R.drawable.plus_sdk_ic_family_not_accepted_light);
    }
}
