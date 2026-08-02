package ru.yandex.taxi.logistics.ndd_route_selector.view.filters;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aoi;
import defpackage.bvf0;
import defpackage.dci;
import defpackage.dt9;
import defpackage.f6r;
import defpackage.gjz;
import defpackage.hwy0;
import defpackage.jqh0;
import defpackage.mrg0;
import defpackage.n3w;
import defpackage.nrw;
import defpackage.ny61;
import defpackage.p9i;
import defpackage.q4g;
import defpackage.q5z;
import defpackage.q9i;
import defpackage.qcp0;
import defpackage.qdb1;
import defpackage.r9i;
import defpackage.t9i;
import defpackage.tje;
import defpackage.u5r;
import defpackage.uxh;
import defpackage.v130;
import defpackage.w5r;
import defpackage.x5r;
import defpackage.xni;
import defpackage.y8g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u00060\u001aR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/ndd_route_selector/view/filters/DeliveryFilterModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lr9i;", "Landroid/content/Context;", "context", "Lt9i;", "presenter", "<init>", "(Landroid/content/Context;Lt9i;)V", "Lv130;", "insetsType", "()Lv130;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr9i;", "Lt9i;", "Lxni;", "engine", "Lxni;", "Lp9i;", "mvp", "Lp9i;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryFilterModalView extends SlideableBindingModalView<r9i> {
    private xni engine;
    private final p9i mvp;
    private t9i presenter;

    public DeliveryFilterModalView(Context context, t9i t9iVar) {
        super(context);
        this.presenter = t9iVar;
        this.mvp = new p9i();
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setArrowState(ArrowsView.State.GONE);
        qdb1.c(this, new uxh(8, this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public r9i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(jqh0.delivery_filter_modal_view, getCardContentContainer(), false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new r9i(frameLayout, frameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCardCornerRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Application application;
        hwy0 c;
        dci b;
        n3w a;
        super.onAttachedToWindow();
        q9i q9iVar = new q9i(this);
        t9i t9iVar = this.presenter;
        x5r a2 = t9iVar.y.a();
        List list = (List) e.d(t9iVar.x.a).a.getValue();
        if (list == null) {
            list = EmptyList.a;
        }
        w5r w5rVar = new w5r(a2, list);
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            gjz gjzVar = y8gVar.a;
            application = (Application) gjzVar.b.c;
            q5z.h(application);
            c = gjzVar.c();
            new qcp0();
            b = gjzVar.b();
            q5z.h(b);
            a = n3w.a(new f6r(new dt9(nrw.a)));
        }
        aoi aoiVar = new aoi(new q4g(application, c, new u5r(), (f6r) a.a, b, 19), w5rVar, q9iVar);
        this.engine = aoiVar;
        aoiVar.b(getBinding().b);
        this.presenter.Bg(this.mvp);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xni xniVar = this.engine;
        if (xniVar != null) {
            xniVar.a();
        }
        this.engine = null;
        this.presenter.Cg();
    }
}
