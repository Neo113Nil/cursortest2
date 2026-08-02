package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.flex.common.ui.DefaultFlexPopupModalView;
import com.yandex.go.flex.common.ui.FlexFramingPopupModalView;
import com.yandex.go.flex.common.ui.inner.FlexInnerView;
import flex.engine.a;
import java.util.Map;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes12.dex */
public final class wbh implements o3l0 {
    public final Context a;
    public final i130 b;
    public final ou c;
    public final vbh w;

    public wbh(Context context, i130 i130Var, ou ouVar, vbh vbhVar) {
        this.a = context;
        this.b = i130Var;
        this.c = ouVar;
        this.w = vbhVar;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        return this.b.a().p();
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        h00 h00Var;
        i130 i130Var = this.b;
        u45 e = i130Var.a().e();
        if (e == null) {
            return false;
        }
        w030 a = i130Var.a();
        zvg zvgVar = null;
        if (krVar != null && (h00Var = (h00) i130Var.a().r(true, h00.class)) != null) {
            zvgVar = new zvg(5, h00Var, krVar);
        }
        a.f(e, zvgVar);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        i130 i130Var = this.b;
        u45 e = i130Var.a().e();
        FlexInnerView flexInnerView = e instanceof FlexInnerView ? (FlexInnerView) e : null;
        i130Var.a().s(new FlexInnerView(this.a, (a) this.c.invoke(), new ijr(true, flexInnerView != null ? flexInnerView.getFullscreen() : false, ywlVar, u1mVar)), true);
        return true;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        this.b.a().s(new FlexInnerView(this.a, (a) this.c.invoke(), new ijr(false, z2, ywlVar, u1mVar)), true);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, final kr krVar) {
        final h00 h00Var;
        ykr ykrVar = new ykr(z, z2, z3, z4, ywlVar, u1mVar);
        a aVar = (a) this.c.invoke();
        boolean z6 = this.w.a;
        Context context = this.a;
        final SlideableBindingModalView defaultFlexPopupModalView = z6 ? new DefaultFlexPopupModalView(context, aVar, ykrVar) : new FlexFramingPopupModalView(context, aVar, ykrVar);
        i130 i130Var = this.b;
        i130Var.a().s(defaultFlexPopupModalView, true);
        if (krVar != null && (h00Var = (h00) i130Var.a().r(true, h00.class)) != null) {
            if (!defaultFlexPopupModalView.isAttachedToWindow()) {
                h00Var.dispatchAction(krVar);
                return true;
            }
            defaultFlexPopupModalView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.common.router.DefaultFlexRouteHandler$showPopup$lambda$0$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    defaultFlexPopupModalView.removeOnAttachStateChangeListener(this);
                    h00Var.dispatchAction(krVar);
                }
            });
        }
        return true;
    }
}
