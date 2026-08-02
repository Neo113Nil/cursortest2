package ru.yandex.taxi.preorder.source.points;

import android.content.Context;
import com.yandex.runtime.image.ImageProvider;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.czo0;
import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.f1h0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hgr0;
import defpackage.k7x0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.rgu0;
import defpackage.tje;
import defpackage.u0c0;
import defpackage.vng;
import defpackage.wiq0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zuj0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import ru.yandex.taxi.address.repository.f;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final zuj0 b;
    public final ru.yandex.taxi.design.utils.a c;
    public final f d;
    public final wiq0 e;
    public final f1c0 f;
    public final pav g;
    public final k7x0 h;
    public final h3y i;
    public final pwy0 j;
    public e1c0 m;
    public final LinkedHashMap k = new LinkedHashMap();
    public u0c0 l = u0c0.d;
    public final hbp0 n = new hbp0(new czo0(14), "StopPointsImageProviderInteractor", null);

    public a(Context context, zuj0 zuj0Var, ru.yandex.taxi.design.utils.a aVar, f fVar, wiq0 wiq0Var, f1c0 f1c0Var, pav pavVar, k7x0 k7x0Var, h3y h3yVar, pwy0 pwy0Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = aVar;
        this.d = fVar;
        this.e = wiq0Var;
        this.f = f1c0Var;
        this.g = pavVar;
        this.h = k7x0Var;
        this.i = h3yVar;
        this.j = pwy0Var;
    }

    public final void a() {
        hbp0 hbp0Var = this.n;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new StopPointsImageProviderInteractor$attach$1(this, null), 3);
    }

    public final ImageProvider b() {
        rgu0 rgu0Var = new rgu0(null, null, this.j.getThemeType());
        LinkedHashMap linkedHashMap = this.k;
        WeakReference weakReference = (WeakReference) linkedHashMap.get(rgu0Var);
        ImageProvider imageProvider = weakReference != null ? (ImageProvider) weakReference.get() : null;
        if (imageProvider != null) {
            return imageProvider;
        }
        Context context = this.a;
        MapPointWithDrawableFrameLayout mapPointWithDrawableFrameLayout = new MapPointWithDrawableFrameLayout(context, gtq0.v(this.c, context, tje.u(10, context), new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom)), 0, 24));
        mapPointWithDrawableFrameLayout.render(vng.t(f1h0.ic_destination_pin_two_flag_24, ((avj0) this.b).a), new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor));
        xw31.r(mapPointWithDrawableFrameLayout);
        ImageProvider fromBitmap = ImageProvider.fromBitmap(xw31.t(mapPointWithDrawableFrameLayout));
        linkedHashMap.put(rgu0Var, new WeakReference(fromBitmap));
        return fromBitmap;
    }
}
