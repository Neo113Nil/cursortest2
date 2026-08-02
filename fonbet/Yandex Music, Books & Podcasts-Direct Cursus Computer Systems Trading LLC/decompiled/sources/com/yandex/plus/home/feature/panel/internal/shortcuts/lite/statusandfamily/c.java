package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.home.feature.panel.internalapi.model.e;
import defpackage.eb;
import defpackage.eeh;
import defpackage.epa;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.u75;
import defpackage.wdu;
import defpackage.y2x;
import defpackage.yxm;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] q = {new yxm(c.class, "statusContainer", "getStatusContainer()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, c.class, "familyContainer", "getFamilyContainer()Landroid/view/ViewGroup;", 0), new yxm(c.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "arrowIconImageView", "getArrowIconImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "familyBackground", "getFamilyBackground()Landroid/view/View;", 0), new yxm(c.class, "familyPlusImageView", "getFamilyPlusImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "addFamilyTextView", "getAddFamilyTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "avatarsContainer", "getAvatarsContainer()Landroid/view/ViewGroup;", 0)};
    public final com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b a;
    public final Function0 b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;
    public final float k;
    public final float l;
    public final int m;
    public final ArrayList n;
    public d o;
    public com.yandex.plus.home.repository.api.model.user.d p;

    public c(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar, Function0 function0) {
        function0.getClass();
        this.a = bVar;
        this.b = function0;
        this.c = new f(new b(bVar, 0));
        this.d = new f(new b(bVar, 1));
        this.e = new f(new b(bVar, 2));
        this.f = new f(new b(bVar, 3));
        this.g = new f(new b(bVar, 4));
        this.h = new f(new b(bVar, 5));
        this.i = new f(new b(bVar, 6));
        this.j = new f(new b(bVar, 7));
        this.k = bVar.getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.l = bVar.getResources().getDimension(R.dimen.plus_sdk_panel_family_action_button_corner_radius);
        this.m = eeh.b(bVar.getResources().getDimension(R.dimen.plus_sdk_mu_0_75));
        this.n = new ArrayList();
    }

    public static final void a(c cVar, e eVar, com.yandex.plus.core.imageloader.b bVar) {
        d dVar = cVar.o;
        if (dVar == null) {
            return;
        }
        com.yandex.plus.home.repository.api.model.user.d dVar2 = eVar.b;
        if (dVar2 == null) {
            cVar.f().setVisibility(8);
            cVar.p = null;
            return;
        }
        cVar.p = dVar2;
        cVar.h(g(dVar2), dVar);
        boolean g = g(dVar2);
        ViewGroup viewGroup = (ViewGroup) cVar.j.g(q[7]);
        boolean z = g || cVar.a.f;
        epa epaVar = new epa(cVar, g, dVar2, bVar, 4);
        viewGroup.getClass();
        if (!z) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            epaVar.invoke(viewGroup);
        }
    }

    public static final void b(c cVar, String str, String str2) {
        f fVar = cVar.c;
        s9f[] s9fVarArr = q;
        ((ViewGroup) fVar.g(s9fVarArr[0])).setContentDescription(str);
        wdu.q((ViewGroup) cVar.c.g(s9fVarArr[0]), new eb(11));
        cVar.f().setContentDescription(str2);
        wdu.q(cVar.f(), new eb(12));
    }

    public static final void c(c cVar, k kVar) {
        ((ImageView) cVar.f.g(q[3])).setImageDrawable(kVar != null ? com.yandex.plus.bdui.plus.analytics.b.F(kVar, cVar.a.getThemedContext(), R.drawable.plus_sdk_panel_ic_arrow_forward) : null);
    }

    public static final void d(c cVar, k kVar, int i) {
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar = cVar.a;
        float f = cVar.k;
        bVar.setBackground(com.yandex.plus.bdui.plus.analytics.b.C(kVar, i, f, f, f, f));
        ViewGroup viewGroup = (ViewGroup) cVar.c.g(q[0]);
        float f2 = cVar.k;
        viewGroup.setBackground(e(cVar, f2, 0.0f, 2));
        cVar.f().setBackground(e(cVar, 0.0f, f2, 1));
    }

    public static RippleDrawable e(c cVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        ColorStateList valueOf = ColorStateList.valueOf(com.yandex.plus.home.common.utils.a.b(cVar.a.getThemedContext(), R.attr.plus_sdk_panelDefaultRippleColor));
        valueOf.getClass();
        return new RippleDrawable(valueOf, null, new ShapeDrawable(u.a(f, f, f2, f2)));
    }

    public static boolean g(com.yandex.plus.home.repository.api.model.user.d dVar) {
        return dVar.a == dVar.c.size() + 1 || dVar.a == 0;
    }

    public final ViewGroup f() {
        return (ViewGroup) this.d.g(q[1]);
    }

    public final void h(boolean z, d dVar) {
        Drawable drawable;
        com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a aVar = dVar.f;
        k kVar = aVar != null ? aVar.c : null;
        s9f[] s9fVarArr = q;
        View view = (View) this.g.g(s9fVarArr[4]);
        if (kVar != null) {
            float f = this.l;
            drawable = com.yandex.plus.bdui.plus.analytics.b.B(kVar, f, f, f, f);
        } else {
            drawable = null;
        }
        if (z) {
            drawable = null;
        }
        view.setBackground(drawable);
        k kVar2 = aVar != null ? aVar.d : null;
        ImageView imageView = (ImageView) this.h.g(s9fVarArr[5]);
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar = this.a;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageDrawable(kVar2 != null ? com.yandex.plus.bdui.plus.analytics.b.F(kVar2, bVar.getThemedContext(), R.drawable.plus_sdk_panel_ic_add) : null);
            }
        }
        String str = aVar != null ? aVar.a : null;
        com.yandex.plus.core.theme.c cVar = aVar != null ? aVar.b : null;
        TextView textView = (TextView) this.i.g(s9fVarArr[6]);
        if (textView != null) {
            if (!((z || bVar.f) ? false : true)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(str);
            if (cVar != null) {
                com.yandex.plus.bdui.flex.ui.a.D(textView, cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
            }
        }
    }

    public final void i(boolean z, com.yandex.plus.home.repository.api.model.user.d dVar) {
        ArrayList arrayList = this.n;
        a aVar = (a) CollectionsKt.firstOrNull(arrayList);
        if (aVar != null) {
            aVar.a(dVar.b.b, z, true);
        }
        int i = 0;
        for (Object obj : CollectionsKt.L(arrayList, 1)) {
            int i2 = i + 1;
            Drawable drawable = null;
            if (i < 0) {
                u75.n();
                throw null;
            }
            a aVar2 = (a) obj;
            com.yandex.plus.home.repository.api.model.user.c cVar = (com.yandex.plus.home.repository.api.model.user.c) CollectionsKt.S(dVar.c, i);
            if (cVar != null) {
                aVar2.a(cVar.b, z, cVar.c);
            } else {
                com.yandex.plus.core.imageloader.b bVar = aVar2.c;
                ImageView imageView = aVar2.a;
                ((com.yandex.plus.coil.b) bVar).a(imageView);
                int i3 = !((Boolean) aVar2.b.invoke()).booleanValue() ? R.color.plus_sdk_family_avatar_color_light : R.color.plus_sdk_family_avatar_color_dark;
                Drawable w = y2x.w(imageView.getContext(), R.drawable.plus_sdk_ic_family_empty_new);
                if (w != null) {
                    w.setTint(r1.i(i3, imageView));
                    drawable = w;
                }
                imageView.setImageDrawable(drawable);
            }
            i = i2;
        }
    }
}
