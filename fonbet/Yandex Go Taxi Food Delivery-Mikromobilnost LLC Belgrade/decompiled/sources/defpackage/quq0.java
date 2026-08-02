package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.state.ToggleableState;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.settings.mvp.SettingsModalView;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.d;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.c;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;
import ru.yandex.taxi.settings.presentation.list.viewholder.a;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes12.dex */
public final /* synthetic */ class quq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ quq0(a aVar, ListItemComponent listItemComponent) {
        this.a = 2;
        this.b = listItemComponent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        boolean _init_$lambda$0;
        zy11 insetsType$lambda$02;
        boolean _init_$lambda$2;
        zy11 onViewCreated$lambda$2;
        List W;
        zy11 insetsType$lambda$03;
        zy11 insetsType$lambda$04;
        zy11 renderLead$lambda$1;
        int i = this.a;
        int i2 = 2;
        int i3 = 6;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((pgk0) obj2).b = (ywl) obj;
                break;
            case 1:
                bvq0 bvq0Var = (bvq0) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new com.yandex.go.information.a(bvq0Var, new avq0(bvq0Var), i4);
                pgk0 pgk0Var = bvq0Var.H;
                agd agdVar = (agd) yfdVar;
                ouq0 ouq0Var = (ouq0) agdVar.a;
                pgk0Var.getClass();
                vtv vtvVar = new vtv(ouq0Var);
                nw8 nw8Var = (nw8) pgk0Var.b;
                c1p0 c1p0Var = new c1p0(i3, ouq0Var, pgk0Var);
                nw8Var.getClass();
                agdVar.c = new g92(i2, nw8.d(ouq0Var, vtvVar, c1p0Var));
                bdd.a.getClass();
                agdVar.g = bdd.b;
                break;
            case 2:
                ListItemComponent listItemComponent = (ListItemComponent) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    listItemComponent.setTrailImage((Drawable) null);
                    break;
                } else {
                    listItemComponent.setTrailImage(bitmap);
                    break;
                }
            case 3:
                insetsType$lambda$0 = SettingsModalView.insetsType$lambda$0((SettingsModalView) obj2, (t1w) obj);
                break;
            case 4:
                ComposeView composeView = new ComposeView((Context) obj, null, 0, 6, null);
                composeView.setLayerType(2, new Paint());
                composeView.setContent((androidx.compose.runtime.internal.a) obj2);
                break;
            case 5:
                ((lgt0) ((d) obj2).h).a((zzs) obj, "manual.panorama_pickup_point");
                break;
            case 6:
                ((c) obj2).d.a((b151) obj);
                break;
            case 7:
                _init_$lambda$0 = ShortcutsMainScreen._init_$lambda$0((ShortcutsMainScreen) obj2, (t1w) obj);
                break;
            case 8:
                insetsType$lambda$02 = ShortcutsModalView.insetsType$lambda$0((ShortcutsModalView) obj2, (t1w) obj);
                break;
            case 9:
                _init_$lambda$2 = ShortcutsView._init_$lambda$2((ShortcutsView) obj2, (t1w) obj);
                break;
            case 10:
                break;
            case 11:
                onViewCreated$lambda$2 = SilentPaymentFragment.onViewCreated$lambda$2((SilentPaymentFragment) obj2, (mx60) obj);
                break;
            case 12:
                boolean z = ((cks0) obj2).a;
                try {
                    W = evu0.W((String) obj, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                    break;
                } catch (Exception unused) {
                    return z ? "#FFEDEFF2" : "#FF393B40";
                }
            case 13:
                insetsType$lambda$03 = SlidableFlexView.insetsType$lambda$0((SlidableFlexView) obj2, (t1w) obj);
                break;
            case 14:
                insetsType$lambda$04 = SlideableFlexModalView.insetsType$lambda$0((SlideableFlexModalView) obj2, (t1w) obj);
                break;
            case 15:
                ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.c) obj2).b.a((b151) obj);
                break;
            case 16:
                ((m2k0) obj).b(((Number) ((ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c) obj2).h.getValue()).floatValue());
                break;
            case 17:
                renderLead$lambda$1 = SlotItemViewComponent.renderLead$lambda$1((SlotItemViewComponent) obj2, (Drawable) obj);
                break;
            case 18:
                mnq0 mnq0Var = (mnq0) obj;
                gus0 gus0Var = (gus0) ((hus0) obj2);
                f.p(mnq0Var, gus0Var.a);
                f.u(mnq0Var, gus0Var.c ? ToggleableState.On : ToggleableState.Off);
                if (!gus0Var.b) {
                    f.a(mnq0Var);
                    break;
                }
                break;
            case 19:
                break;
            case 20:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 0);
                String str = ((vus0) obj2).b;
                f.l(mnq0Var2, str != null ? str : "");
                break;
            case 21:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.p(mnq0Var3, 0);
                String str2 = ((gvs0) obj2).b;
                f.l(mnq0Var3, str2 != null ? str2 : "");
                break;
            case 22:
                ((Snackbar) obj2).dismissNow();
                break;
            case 23:
                break;
            case 24:
                n70 n70Var = (n70) obj;
                ((m361) n70Var.N).c.setOnTouchListener((View.OnTouchListener) obj2);
                n70Var.W(new ns3(n70Var, 17));
                break;
            case 25:
                ((u2t0) obj2).setDoubleValue(((Double) obj).doubleValue());
                break;
            case 26:
                ((w2t0) obj2).setFloatValue(((Float) obj).floatValue());
                break;
            case 27:
                ((y2t0) obj2).setIntValue(((Integer) obj).intValue());
                break;
            case 28:
                ((a3t0) obj2).setLongValue(((Long) obj).longValue());
                break;
            default:
                ((d3t0) obj2).setValue(obj);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ quq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
