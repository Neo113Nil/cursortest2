package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.view.View;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.c0;
import defpackage.btf;
import defpackage.c7;
import defpackage.jyr;
import defpackage.oh3;
import defpackage.tf6;
import defpackage.vdr;
import defpackage.wdu;
import defpackage.wz0;
import defpackage.z75;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class l extends com.yandex.plus.home.feature.panel.internal.base.b {
    public static final /* synthetic */ int J = 0;
    public final com.yandex.plus.home.feature.panel.internalapi.b A;
    public final com.yandex.plus.home.feature.panel.internalapi.c B;
    public final Function1 C;
    public j D;
    public com.yandex.plus.ui.core.theme.a E;
    public Context F;
    public final com.yandex.plus.home.feature.panel.internal.a G;
    public final jyr H;
    public final tf6 I;
    public final com.yandex.plus.core.imageloader.b w;
    public final vdr x;
    public final com.yandex.plus.core.theme.e y;
    public final com.yandex.plus.core.strings.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, @NotNull com.yandex.plus.core.imageloader.b bVar, @NotNull vdr vdrVar, @NotNull com.yandex.plus.core.theme.e eVar, @NotNull com.yandex.plus.core.strings.a aVar, com.yandex.plus.home.feature.panel.internalapi.b bVar2, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull kotlinx.coroutines.a aVar2, @NotNull Function1<? super com.yandex.plus.home.feature.panel.internalapi.analytics.f, Unit> function1) {
        super(context, null, 0, 0, 14, null);
        context.getClass();
        bVar.getClass();
        vdrVar.getClass();
        eVar.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        function1.getClass();
        this.w = bVar;
        this.x = vdrVar;
        this.y = eVar;
        this.z = aVar;
        this.A = bVar2;
        this.B = cVar;
        this.C = function1;
        this.D = j.a;
        com.yandex.plus.ui.core.theme.a aVar3 = (com.yandex.plus.ui.core.theme.a) vdrVar.getValue();
        this.E = aVar3;
        Context a = eVar.a(context, aVar3);
        this.F = a;
        com.yandex.plus.ui.core.theme.a aVar4 = this.E;
        aVar4.getClass();
        com.yandex.plus.home.feature.panel.internal.a aVar5 = new com.yandex.plus.home.feature.panel.internal.a();
        aVar5.a = aVar4;
        aVar5.b = a;
        this.G = aVar5;
        this.H = btf.b(new i(this, 0));
        this.I = r1.f(this, aVar2);
        setGap(getResources().getDimensionPixelSize(R.dimen.plus_sdk_panel_flow_gap));
        WeakHashMap weakHashMap = wdu.a;
        setImportantForAccessibility(2);
    }

    private final Map<Class<? extends View>, List<View>> getSectionViews() {
        HashMap hashMap = new HashMap();
        c7 c7Var = new c7(8, this);
        while (c7Var.hasNext()) {
            Object next = c7Var.next();
            Class<?> cls = ((View) next).getClass();
            Object obj = hashMap.get(cls);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(cls, obj);
            }
            ((List) obj).add(next);
        }
        return hashMap;
    }

    @NotNull
    public final com.yandex.plus.core.strings.a getBrandType() {
        return this.z;
    }

    @NotNull
    public final com.yandex.plus.core.imageloader.b getImageLoader() {
        return this.w;
    }

    @NotNull
    public final com.yandex.plus.home.feature.panel.internalapi.c getShortcutViewAwarenessDetector() {
        return this.B;
    }

    @NotNull
    public abstract com.yandex.plus.home.feature.panel.internal.stub.a getStubConfig();

    @NotNull
    public final com.yandex.plus.ui.core.theme.a getTheme() {
        return this.E;
    }

    @NotNull
    public final com.yandex.plus.core.theme.e getThemeContextConverter() {
        return this.y;
    }

    @NotNull
    public final com.yandex.plus.home.feature.panel.internal.a getThemeResolver() {
        return this.G;
    }

    @NotNull
    public final vdr getThemeStateFlow() {
        return this.x;
    }

    @NotNull
    public final Context getThemedContext() {
        return this.F;
    }

    public final void setTheme(@NotNull com.yandex.plus.ui.core.theme.a aVar) {
        aVar.getClass();
        this.E = aVar;
    }

    public final void setThemedContext(@NotNull Context context) {
        context.getClass();
        this.F = context;
    }

    public abstract void v(com.yandex.plus.home.repository.api.model.panel.i iVar, b0 b0Var, Map map);

    public final void w(com.yandex.plus.ui.core.theme.a aVar) {
        aVar.getClass();
        this.E = aVar;
        Context context = getContext();
        context.getClass();
        Context a = this.y.a(context, aVar);
        this.F = a;
        com.yandex.plus.home.feature.panel.internal.a aVar2 = this.G;
        aVar2.getClass();
        aVar2.a = aVar;
        aVar2.b = a;
    }

    public final void x(com.yandex.plus.home.repository.api.model.panel.i iVar, b0 b0Var) {
        View view;
        l lVar = this;
        com.yandex.plus.home.repository.api.model.panel.i iVar2 = iVar;
        b0 b0Var2 = b0Var;
        iVar2.getClass();
        b0Var2.getClass();
        lVar.D = j.b;
        Map<Class<? extends View>, List<View>> sectionViews = lVar.getSectionViews();
        lVar.removeAllViews();
        lVar.v(iVar2, b0Var2, sectionViews);
        wz0 F = CollectionsKt.F(b0Var2.e);
        c7 c7Var = new c7(8, lVar);
        Iterator it = ((Iterable) F.b).iterator();
        while (c7Var.hasNext() && it.hasNext()) {
            View view2 = (View) c7Var.next();
            c0 c0Var = (c0) it.next();
            if (view2.isAttachedToWindow()) {
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u = lVar.u(view2);
                c0Var.getClass();
                String str = iVar2.a;
                String str2 = iVar2.b;
                String str3 = b0Var2.a;
                String str4 = b0Var2.b;
                String id = c0Var.getId();
                String name = c0Var.getName();
                if (u == null) {
                    jyr jyrVar = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u = r1.o();
                }
                lVar.C.invoke(new com.yandex.plus.home.feature.panel.internalapi.analytics.e(str, str2, str3, str4, id, name, u));
                view = view2;
            } else {
                l lVar2 = lVar;
                k kVar = new k(view2, lVar2, view2, iVar, b0Var2, c0Var);
                view = view2;
                lVar = lVar2;
                c0Var = c0Var;
                view.addOnAttachStateChangeListener(kVar);
            }
            iVar2 = iVar;
            b0Var2 = b0Var;
            com.yandex.plus.bdui.flex.ui.a.j(((s) lVar.B).y(view, false), lVar.I, new oh3(lVar, view, iVar2, b0Var2, c0Var, null, 10));
        }
    }

    public final void y() {
        j jVar;
        this.D = j.c;
        Map<Class<? extends View>, List<View>> sectionViews = getSectionViews();
        removeAllViews();
        com.yandex.plus.home.feature.panel.internalapi.b bVar = this.A;
        if (bVar != null) {
            for (com.yandex.plus.home.feature.panel.internal.stub.c cVar : getStubConfig().a) {
                List<View> list = sectionViews.get(m.class);
                View view = list != null ? (View) z75.B(list) : null;
                View view2 = (m) (view instanceof m ? view : null);
                if (view2 == null) {
                    y yVar = (y) bVar;
                    view2 = new m(this.F, new com.yandex.plus.home.animation.a(new p((s) yVar.a, (kotlinx.coroutines.a) yVar.b)));
                }
                int i = cVar.b;
                r1.G(view2);
                com.yandex.plus.home.feature.panel.internal.base.a aVar = new com.yandex.plus.home.feature.panel.internal.base.a(i);
                aVar.r0 = cVar.a == com.yandex.plus.home.feature.panel.internal.stub.b.a;
                view2.setLayoutParams(aVar);
                addView(view2);
            }
            jVar = j.c;
        } else {
            jVar = j.a;
        }
        this.D = jVar;
    }
}
