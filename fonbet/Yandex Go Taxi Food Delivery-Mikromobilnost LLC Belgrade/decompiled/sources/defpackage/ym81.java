package defpackage;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import yads.gm1;

/* loaded from: classes7.dex */
public final class ym81 extends vd71 {
    public final i681 d;
    public final vd71 e;
    public final vn61 f;
    public final r581 g;
    public final r581 h;
    public final oji i;
    public static final /* synthetic */ kgx[] k = {new MutablePropertyReference1Impl("weakMediaView", 0, "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", ym81.class), oyr.B(qoi0.a, ym81.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0), new MutablePropertyReference1Impl("currentViewAdapter", 0, "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", ym81.class)};
    public static final y981 j = new y981();

    public ym81(CustomizableMediaView customizableMediaView, i681 i681Var, vd71 vd71Var, j981 j981Var, vn61 vn61Var) {
        super(customizableMediaView, j981Var);
        this.d = i681Var;
        this.e = vd71Var;
        this.f = vn61Var;
        this.g = new r581(null);
        this.h = new r581(null);
        this.i = new oji(i681Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_internalRelease(new ld81(new WeakReference(this)));
    }

    @Override // defpackage.ia71
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.a(customizableMediaView);
        this.e.a(customizableMediaView);
    }

    @Override // defpackage.ia71
    public final void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        d171 d171Var = (d171) obj;
        this.d.b(uy71Var, pj71Var, d171Var);
        this.e.b(uy71Var, pj71Var, d171Var);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        return ((vd71) this.i.getValue(this, k[2])).c((CustomizableMediaView) view, (d171) obj);
    }

    @Override // defpackage.vd71
    public final void g(CustomizableMediaView customizableMediaView) {
        this.d.d.y();
        this.e.g(customizableMediaView);
    }

    @Override // defpackage.vd71
    /* renamed from: h */
    public final void e(CustomizableMediaView customizableMediaView, d171 d171Var) {
        kgx[] kgxVarArr = k;
        kgx kgxVar = kgxVarArr[0];
        r581 r581Var = this.g;
        r581Var.getClass();
        r581Var.a = new WeakReference(customizableMediaView);
        kgx kgxVar2 = kgxVarArr[1];
        r581 r581Var2 = this.h;
        r581Var2.getClass();
        r581Var2.a = new WeakReference(d171Var);
        ((vd71) this.i.getValue(this, kgxVarArr[2])).e(customizableMediaView, d171Var);
    }

    @Override // defpackage.vd71
    public final void i(d171 d171Var) {
        ((vd71) this.i.getValue(this, k[2])).i(d171Var);
    }

    @Override // defpackage.vd71
    public final gm1 j() {
        return ((vd71) this.i.getValue(this, k[2])).j();
    }
}
