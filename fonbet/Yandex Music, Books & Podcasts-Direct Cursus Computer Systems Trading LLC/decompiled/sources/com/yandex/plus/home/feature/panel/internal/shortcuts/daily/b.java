package com.yandex.plus.home.feature.panel.internal.shortcuts.daily;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.ThumbnailUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.pay.ui.common.internal.error.content.h;
import com.yandex.plus.plaquesdk.plaque.adapter.j;
import com.yandex.plus.plaquesdk.plaque.api.models.display.g;
import com.yandex.plus.plaquesdk.plaque.api.models.display.i;
import com.yandex.plus.plaquesdk.plaque.api.models.display.n;
import com.yandex.plus.plaquesdk.plaque.api.models.display.o;
import com.yandex.plus.plaquesdk.plaque.api.models.display.p;
import com.yandex.plus.plaquesdk.plaque.api.models.display.q;
import com.yandex.plus.plaquesdk.plaque.api.models.display.r;
import com.yandex.plus.plaquesdk.plaque.api.models.display.s;
import defpackage.aa5;
import defpackage.b6e;
import defpackage.eup;
import defpackage.s9f;
import defpackage.vq2;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092  */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer valueOf;
        ColorStateList valueOf2;
        ShapeDrawable.ShaderFactory shaderFactory;
        Object obj;
        PaintDrawable paintDrawable;
        int i9 = this.a;
        int i10 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ((ShapeableImageView) obj3).setShapeAppearanceModel((eup) obj2);
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f fVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f) obj3;
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.b bVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.b) obj2;
                String str = bVar.a;
                com.yandex.plus.core.theme.c cVar = bVar.c;
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = fVar.g;
                s9f[] s9fVarArr = com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f.s;
                ((TextView) fVar2.g(s9fVarArr[0])).setText(str);
                com.yandex.plus.bdui.flex.ui.a.D((TextView) fVar2.g(s9fVarArr[0]), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f.a(fVar, bVar.e);
                k kVar = bVar.f;
                int i11 = bVar.g;
                float f = fVar.m;
                Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(kVar, i11, f, f, f, f);
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar = fVar.a;
                int b = com.yandex.plus.home.common.utils.a.b(aVar.getThemedContext(), R.attr.plus_sdk_panelDefaultRippleColor);
                float f2 = fVar.m;
                aVar.setBackground(u.I(C, b, f2, f2, f2, f2));
                com.yandex.plus.home.repository.api.model.user.d dVar = fVar.f;
                if (dVar != null) {
                    if (fVar.c().getVisibility() == 0) {
                        fVar.d();
                    }
                    fVar.f(dVar);
                }
                fVar.p = str;
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a aVar2 = bVar.h;
                fVar.r = aVar2 != null ? aVar2.a : null;
                fVar.g();
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c cVar2 = (com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c) obj3;
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.d dVar2 = (com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.d) obj2;
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.b(cVar2, dVar2.g, dVar2.h);
                String str2 = dVar2.a;
                com.yandex.plus.core.theme.c cVar3 = dVar2.b;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = cVar2.e;
                s9f[] s9fVarArr2 = com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.q;
                ((TextView) fVar3.g(s9fVarArr2[2])).setText(str2);
                com.yandex.plus.bdui.flex.ui.a.D((TextView) fVar3.g(s9fVarArr2[2]), cVar3, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.d(cVar2, dVar2.d, dVar2.e);
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.c(cVar2, dVar2.c);
                com.yandex.plus.home.repository.api.model.user.d dVar3 = cVar2.p;
                if (dVar3 != null) {
                    cVar2.h(com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.g(dVar3), dVar2);
                    cVar2.i(com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.g(dVar3), dVar3);
                    return;
                }
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f fVar4 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f) obj3;
                if (fVar4.getWidth() <= 0 || fVar4.getHeight() <= 0) {
                    return;
                }
                Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(vq2.N((Drawable) obj2, 0, 0, 7), fVar4.getWidth(), fVar4.getHeight());
                extractThumbnail.getClass();
                Resources resources = fVar4.getContext().getResources();
                resources.getClass();
                fVar4.setBackgroundDrawableWithRippleEffect(com.yandex.plus.bdui.plus.analytics.b.y(new BitmapDrawable(resources, extractThumbnail), fVar4.x));
                return;
            case 4:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) obj2;
                view.removeOnLayoutChangeListener(this);
                h hVar = (h) obj3;
                String str3 = hVar.a;
                if (str3 != null && !StringsKt.U(str3)) {
                    bVar2.e().scrollTo(bVar2.d().getScrollX(), bVar2.g().getTop());
                    return;
                }
                String str4 = hVar.b;
                if (str4 == null || StringsKt.U(str4)) {
                    return;
                }
                bVar2.e().scrollTo(bVar2.d().getScrollX(), bVar2.f().getTop());
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                Context context = ((j) obj3).d().getContext();
                context.getClass();
                p pVar = (p) obj2;
                int height = view.getHeight();
                context.getClass();
                pVar.getClass();
                o oVar = pVar.b;
                com.yandex.plus.plaquesdk.plaque.api.models.display.j jVar = pVar.a;
                if (!pVar.c) {
                    valueOf2 = ColorStateList.valueOf(0);
                    valueOf2.getClass();
                } else if (jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.d) {
                    com.yandex.plus.plaquesdk.plaque.api.models.display.d dVar4 = (com.yandex.plus.plaquesdk.plaque.api.models.display.d) jVar;
                    if (!dVar4.a().isEmpty()) {
                        int i12 = ((n) CollectionsKt.Q(dVar4.a())).a;
                        int size = dVar4.a().size();
                        for (int i13 = 1; i13 < size; i13++) {
                            if (((n) dVar4.a().get(i13)).a == i12) {
                            }
                        }
                        valueOf = Integer.valueOf(i12);
                        if (valueOf != null) {
                            valueOf2 = ColorStateList.valueOf(0);
                            valueOf2.getClass();
                        } else {
                            valueOf2 = ColorStateList.valueOf(aa5.l(~valueOf.intValue(), Math.abs(((int) 25.5f) & KotlinVersion.MAX_COMPONENT_VALUE)));
                            valueOf2.getClass();
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                } else {
                    if (jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.h) {
                        valueOf = Integer.valueOf(((com.yandex.plus.plaquesdk.plaque.api.models.display.h) jVar).a);
                        if (valueOf != null) {
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                }
                int i14 = 3;
                if (jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.h) {
                    shaderFactory = new r(i14, (com.yandex.plus.plaquesdk.plaque.api.models.display.h) jVar);
                } else if (jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.e) {
                    shaderFactory = s.b((com.yandex.plus.plaquesdk.plaque.api.models.display.e) jVar);
                } else if (jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.f) {
                    shaderFactory = s.c((com.yandex.plus.plaquesdk.plaque.api.models.display.f) jVar);
                } else {
                    boolean z = jVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.c;
                    i iVar = i.a;
                    if (z) {
                        ArrayList<g> arrayList = ((com.yandex.plus.plaquesdk.plaque.api.models.display.c) jVar).a;
                        ArrayList arrayList2 = new ArrayList();
                        for (g gVar : arrayList) {
                            if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.h) {
                                obj = new r(i14, (com.yandex.plus.plaquesdk.plaque.api.models.display.h) gVar);
                            } else if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.e) {
                                obj = s.b((com.yandex.plus.plaquesdk.plaque.api.models.display.e) gVar);
                            } else if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.display.f) {
                                obj = s.c((com.yandex.plus.plaquesdk.plaque.api.models.display.f) gVar);
                            } else {
                                if (!Intrinsics.d(gVar, iVar)) {
                                    b6e.s();
                                    throw null;
                                }
                                obj = null;
                            }
                            if (obj != null) {
                                arrayList2.add(obj);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            shaderFactory = new r(i10, arrayList2);
                        }
                    } else if (!Intrinsics.d(jVar, iVar)) {
                        b6e.s();
                        throw null;
                    }
                    shaderFactory = null;
                }
                if (shaderFactory == null) {
                    paintDrawable = null;
                } else {
                    paintDrawable = new PaintDrawable();
                    paintDrawable.setShape(new RoundRectShape(s.d(context, oVar, height), null, null));
                    paintDrawable.setShaderFactory(shaderFactory);
                }
                q qVar = new q(valueOf2, paintDrawable, null);
                if (qVar.getNumberOfLayers() != 0) {
                    qVar.getDrawable(0);
                }
                s.d(context, oVar, height);
                view.setBackground(qVar);
                return;
        }
    }
}
