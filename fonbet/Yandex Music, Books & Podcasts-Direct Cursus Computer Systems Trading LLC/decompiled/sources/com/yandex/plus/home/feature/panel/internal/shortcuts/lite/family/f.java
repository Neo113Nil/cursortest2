package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.k;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jk6;
import defpackage.s9f;
import defpackage.u75;
import defpackage.v75;
import defpackage.wdu;
import defpackage.xz0;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f {
    public static final /* synthetic */ s9f[] s = {new yxm(f.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, f.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "arrowIconImageView", "getArrowIconImageView()Landroid/widget/ImageView;", 0), new yxm(f.class, "addInFamilyView", "getAddInFamilyView()Landroid/view/View;", 0), new yxm(f.class, "membersAvatarsLayout", "getMembersAvatarsLayout()Landroid/view/ViewGroup;", 0)};
    public final com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a a;
    public final Function0 b;
    public final l c;
    public g d;
    public a e;
    public com.yandex.plus.home.repository.api.model.user.d f;
    public final com.yandex.plus.bdui.plus.content.controller.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;
    public final com.yandex.plus.bdui.plus.content.controller.f i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final com.yandex.plus.bdui.plus.content.controller.f k;
    public final ArrayList l;
    public final float m;
    public final float n;
    public final int o;
    public String p;
    public String q;
    public String r;

    public f(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar, Function0 function0, l lVar, b bVar) {
        function0.getClass();
        this.a = aVar;
        this.b = function0;
        this.c = lVar;
        this.d = new g(bVar.b, bVar.d, bVar.i);
        this.e = bVar.h;
        this.g = new com.yandex.plus.bdui.plus.content.controller.f(new e(aVar, 0));
        this.h = new com.yandex.plus.bdui.plus.content.controller.f(new e(aVar, 1));
        this.i = new com.yandex.plus.bdui.plus.content.controller.f(new e(aVar, 2));
        this.j = new com.yandex.plus.bdui.plus.content.controller.f(new e(aVar, 3));
        this.k = new com.yandex.plus.bdui.plus.content.controller.f(new e(aVar, 4));
        this.l = new ArrayList();
        this.m = aVar.getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.n = aVar.getResources().getDimension(R.dimen.plus_sdk_panel_family_action_button_corner_radius);
        this.o = aVar.getResources().getDimensionPixelSize(R.dimen.plus_sdk_panel_family_avatar_margin);
        wdu.q(aVar, new eb(10));
        e(bVar);
    }

    public static final void a(f fVar, k kVar) {
        Drawable drawable;
        ImageView imageView = (ImageView) fVar.i.g(s[2]);
        if (kVar != null) {
            Context context = fVar.a.getContext();
            context.getClass();
            drawable = com.yandex.plus.bdui.plus.analytics.b.F(kVar, context, R.drawable.plus_sdk_panel_ic_arrow_forward);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public static final void b(f fVar, com.yandex.plus.home.repository.api.model.user.d dVar, com.yandex.plus.core.imageloader.b bVar) {
        String str;
        ArrayList arrayList = fVar.l;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar = fVar.a;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = fVar.h;
        int i = dVar.a;
        ArrayList arrayList2 = dVar.c;
        boolean z = i > arrayList2.size() + 1;
        fVar.c().setVisibility(z ? 0 : 8);
        if (z) {
            fVar.d();
        }
        int size = (i - arrayList2.size()) - 1;
        if (size < 0) {
            size = 0;
        }
        l lVar = fVar.c;
        Map map = fVar.d.c;
        Resources resources = (Resources) lVar.a;
        if (size > 0) {
            String quantityString = resources.getQuantityString(R.plurals.plus_sdk_family_subtitle_plurals, size);
            quantityString.getClass();
            if (map == null || (str = (String) map.get(quantityString)) == null) {
                r11 = map != null ? (String) map.get(resources.getString(R.string.plus_sdk_plural_key_one)) : null;
                if (r11 == null) {
                    r11 = "";
                }
            } else {
                r11 = str;
            }
        }
        String format = r11 != null ? String.format(r11, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1)) : fVar.d.a;
        s9f[] s9fVarArr = s;
        ((TextView) fVar2.g(s9fVarArr[1])).setVisibility(StringsKt.U(format) ? 8 : 0);
        ((TextView) fVar2.g(s9fVarArr[1])).setText(format);
        com.yandex.plus.bdui.flex.ui.a.D((TextView) fVar2.g(s9fVarArr[1]), fVar.d.b, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        fVar.q = format;
        fVar.g();
        if (arrayList.isEmpty()) {
            if (i <= 0) {
                i = arrayList2.size() + 1;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                View p = r1.p(aVar, R.layout.plus_sdk_panel_family_avatar_view, false);
                p.setId(View.generateViewId());
                p.setZ(i - i2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (i2 != 0) {
                    layoutParams.setMarginStart(fVar.o);
                }
                p.setLayoutParams(layoutParams);
                ((ViewGroup) fVar.k.g(s9fVarArr[4])).addView(p);
                arrayList3.add(p);
            }
            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(new c((View) it.next(), new jk6(0, 10, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a.class, aVar, "themedContext", "getThemedContext()Landroid/content/Context;"), fVar.b, bVar));
                arrayList4.add(Unit.a);
            }
        }
        fVar.f(dVar);
    }

    public final View c() {
        return (View) this.j.g(s[3]);
    }

    public final void d() {
        float f;
        a aVar = this.e;
        if (aVar != null) {
            if (this.a.q) {
                View c = c();
                AppCompatImageView appCompatImageView = c instanceof AppCompatImageView ? (AppCompatImageView) c : null;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(com.yandex.plus.bdui.plus.analytics.b.P(aVar.d)));
                    appCompatImageView.requestLayout();
                }
                f = 0.0f;
            } else {
                View c2 = c();
                AppCompatTextView appCompatTextView = c2 instanceof AppCompatTextView ? (AppCompatTextView) c2 : null;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(aVar.a);
                    com.yandex.plus.bdui.flex.ui.a.D(appCompatTextView, aVar.b, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                }
                f = this.n;
            }
            float f2 = f;
            c().setBackground(com.yandex.plus.bdui.plus.analytics.b.C(aVar.c, aVar.e, f2, f2, f2, f2));
        }
    }

    public final void e(b bVar) {
        String str = bVar.a;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar = this.a;
        if (!aVar.isLaidOut() || aVar.isLayoutRequested()) {
            aVar.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.b(1, this, bVar));
            return;
        }
        com.yandex.plus.core.theme.c cVar = bVar.c;
        s9f[] s9fVarArr = s;
        s9f s9fVar = s9fVarArr[0];
        com.yandex.plus.bdui.plus.content.controller.f fVar = this.g;
        ((TextView) fVar.g(s9fVar)).setText(str);
        com.yandex.plus.bdui.flex.ui.a.D((TextView) fVar.g(s9fVarArr[0]), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        a(this, bVar.e);
        k kVar = bVar.f;
        int i = bVar.g;
        float f = this.m;
        Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(kVar, i, f, f, f, f);
        int b = com.yandex.plus.home.common.utils.a.b(aVar.getThemedContext(), R.attr.plus_sdk_panelDefaultRippleColor);
        float f2 = this.m;
        aVar.setBackground(u.I(C, b, f2, f2, f2, f2));
        com.yandex.plus.home.repository.api.model.user.d dVar = this.f;
        if (dVar != null) {
            if (c().getVisibility() == 0) {
                d();
            }
            f(dVar);
        }
        this.p = str;
        a aVar2 = bVar.h;
        this.r = aVar2 != null ? aVar2.a : null;
        g();
    }

    public final void f(com.yandex.plus.home.repository.api.model.user.d dVar) {
        ArrayList arrayList = this.l;
        c cVar = (c) CollectionsKt.firstOrNull(arrayList);
        if (cVar != null) {
            cVar.b(dVar.b.b, true);
        }
        int i = 0;
        for (Object obj : CollectionsKt.L(arrayList, 1)) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            c cVar2 = (c) obj;
            com.yandex.plus.home.repository.api.model.user.c cVar3 = (com.yandex.plus.home.repository.api.model.user.c) CollectionsKt.S(dVar.c, i);
            if (cVar3 != null) {
                cVar2.b(cVar3.b, cVar3.c);
            } else {
                ((com.yandex.plus.coil.b) cVar2.c).a(cVar2.a());
                cVar2.a().setShapeAppearanceModel(cVar2.e);
                cVar2.a().setImageDrawable(com.yandex.plus.home.common.utils.a.e((Context) cVar2.a.get(), R.drawable.plus_sdk_ic_family_empty));
                cVar2.a().setBackground(null);
            }
            i = i2;
        }
    }

    public final void g() {
        this.a.setContentDescription(CollectionsKt.X(xz0.w(new String[]{this.p, this.q, this.r}), null, null, null, null, 63));
    }
}
