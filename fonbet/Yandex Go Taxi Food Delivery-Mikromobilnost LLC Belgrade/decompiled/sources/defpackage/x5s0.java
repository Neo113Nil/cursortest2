package defpackage;

import android.view.View;
import com.yandex.go.address.search.common.presenter.d;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$ThumbStackView;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.go.taxi.order.chat.ui.chat.a;
import com.yandex.runtime.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.stories.presentation.story.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class x5s0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5s0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r4 = ((ru.yandex.taxi.widget.toggle_buttons.ToggleButtonsView) r4.a).buttonToggledListener;
     */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        ej1 b;
        jkz0 jkz0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y5s0 y5s0Var = (y5s0) obj2;
                pjc pjcVar = y5s0Var.a;
                pjcVar.a.setValue(pjcVar, pjc.b[0], Boolean.TRUE);
                u8w u8wVar = y5s0Var.c.b;
                u8wVar.getClass();
                u8wVar.a.a("PeopleCombo.Promo.Shown", new HashMap(), 1, new HashMap());
                break;
            case 1:
                qht0 qht0Var = (qht0) ((r) obj2).v;
                qht0Var.getClass();
                qht0Var.h(new rce0((uqb0) obj), new bgc(12));
                break;
            case 2:
                uet0 uet0Var = (uet0) obj2;
                ((pep0) uet0Var.c).f((m950) uet0Var.e.get(), p4i.b, hxx.a);
                break;
            case 3:
                SourcePointFragment.networkListener$lambda$0((SourcePointFragment) obj2, (Boolean) obj);
                break;
            case 4:
                s sVar = (s) obj2;
                CameraAnimationUpdateType cameraAnimationUpdateType = (CameraAnimationUpdateType) obj;
                if (cameraAnimationUpdateType != null) {
                    sVar.j.b(cameraAnimationUpdateType);
                    break;
                }
                break;
            case 5:
                ((eht0) obj2).j0.a((zzs) obj, null);
                break;
            case 6:
                StackItemViewFactory$ThumbStackView.clear$lambda$0((ArrayList) obj2, (View) obj);
                break;
            case 7:
                b.c((y6f0) obj2, (List) obj);
                break;
            case 8:
                String str = (String) obj;
                boolean J = evu0.J(str);
                Object obj3 = ((g) obj2).a;
                if (!J) {
                    ((gpu0) obj3).showNotification(str);
                    break;
                } else {
                    ((gpu0) obj3).hideNotification();
                    break;
                }
            case 9:
                ((bqu0) obj2).n(((Float) obj).floatValue());
                break;
            case 10:
                d dVar = (d) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    dVar.B0.b = true;
                    oep0 oep0Var = dVar.w0;
                    b = ((pc60) dVar.t0).b(false);
                    ((pep0) oep0Var).f(b, new nc60((String) null), hxx.a);
                    break;
                } else {
                    dVar.Jh();
                    break;
                }
            case 11:
                ((s5w0) obj2).invoke((String) obj);
                break;
            case 12:
                ((TaxiOrderChatModalView) obj2).onNewMessage(((Boolean) obj).booleanValue());
                break;
            case 13:
                TaxiOrderChatModalView._init_$retry((a) obj2, (jv10) obj);
                break;
            case 14:
                ((ListItemComponent) obj2).setTitle((CharSequence) obj);
                break;
            case 15:
                xvy0.a(c.c(xng0.bgMain, ((com.yandex.go.taxi.order.superapp.orders.ui.b) obj2).a), (View) obj);
                break;
            case 16:
                pkz0 pkz0Var = (pkz0) obj;
                jhu0 jhu0Var = ((ikz0) obj2).c;
                if (jhu0Var != null && jkz0Var != null) {
                    jkz0Var.m(pkz0Var);
                    break;
                }
                break;
            case 17:
                xvy0.a(c.c(xng0.bgMain, ((v501) obj2).a), (View) obj);
                break;
            case 18:
                ((wp01) obj2).invoke();
                break;
            default:
                ((v080) obj2).invoke((Error) obj);
                break;
        }
    }
}
