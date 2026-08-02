package defpackage;

import android.os.Handler;
import androidx.compose.foundation.gestures.y;
import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a;
import com.yandex.go.routestops.v2.ui.c;
import com.yandex.go.scooters.ignition.panel.d;
import com.yandex.go.scooters.passes.purchase.packages.f;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.g0;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;

/* loaded from: classes11.dex */
public final /* synthetic */ class qeg0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ qeg0(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, tls tlsVar) {
        this.a = 17;
        this.b = scootersFinishInfoCard;
        this.w = pavVar;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 createV2RecyclerViewAdapter$lambda$2$1;
        zy11 createV2RecyclerViewAdapter$lambda$2$2;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b((yeg0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(385));
                break;
            case 1:
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj5;
                rai0 rai0Var = (rai0) obj4;
                UserReaction[] userReactionArr = (UserReaction[]) obj3;
                int intValue = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                kv10 kv10Var = new kv10(serverMessageRef, intValue, booleanValue ? 1 : 2, cha1.e(rai0Var.C, booleanValue ? 0 : intValue, userReactionArr, rai0Var.D));
                g0 g0Var = rai0Var.w;
                g0Var.getClass();
                tje.e();
                b00 b00Var = g0Var.a;
                ((Handler) b00Var.a.get()).post(new lz(i2, b00Var, g0Var.b, kv10Var));
                bu10 bu10Var = rai0Var.J;
                if (bu10Var != null) {
                    bu10Var.close();
                    break;
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                wha1.a((f530) obj3, (dhi0) obj5, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jla1.a((jej0) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ula1.f((f530) obj3, (lhj0) obj5, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                zla1.c((amj0) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                apa1.d((r7k0) obj5, (s7k0) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                apa1.b((f530) obj3, (r7k0) obj5, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.order.details.v2.ui.compose.driver.a.h((ygk0) obj5, (tls) obj4, (zls) obj3, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                lqa1.b((utk0) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                cra1.d((wuk0) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ut91.k((txq0) obj5, (sls) obj4, (f530) obj3, (fid) obj, vng.O(24577));
                break;
            case 12:
                ((Integer) obj2).getClass();
                c.e((lx40) obj5, (zdl0) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                nwa1.a((iwl0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                twa1.a((exl0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                com.yandex.go.scooters.passes.active.v3.c.i((fum0) obj5, (eum0) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 16:
                createV2RecyclerViewAdapter$lambda$2$1 = ScootersFinishInfoCard.createV2RecyclerViewAdapter$lambda$2$1((ScootersFinishInfoCard) obj5, (pav) obj4, (wls) obj3, (ListItemComponent) obj, (bmn0) obj2);
                break;
            case 17:
                createV2RecyclerViewAdapter$lambda$2$2 = ScootersFinishInfoCard.createV2RecyclerViewAdapter$lambda$2$2((ScootersFinishInfoCard) obj5, (pav) obj3, (tls) obj4, (ListItemComponent) obj, (cmn0) obj2);
                break;
            case 18:
                ((Integer) obj2).getClass();
                d.a((vrn0) obj5, (sls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                f.a((d8o0) obj5, (ety0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton.a.b((hhp0) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                d5b1.a((qip0) obj5, (Anchor) obj4, (f530) obj3, (fid) obj, vng.O(49));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.a.c((f530) obj3, (byk0) obj5, (ldc) obj4, (fid) obj, vng.O(7));
                break;
            case 23:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                y yVar = (y) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h = yVar.h(yVar.d(floatValue - ref$FloatRef.element));
                y yVar2 = ((clp0) obj3).a;
                ref$FloatRef.element += yVar.d(yVar.g(yVar2.c(yVar2.k, h, 1)));
                break;
            case 24:
                ((Integer) obj2).getClass();
                yos0.b((aps0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(385));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.l((fvs0) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.c((wus0) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.m((gvs0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.k((evs0) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.i((cvs0) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ qeg0(f530 f530Var, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.w = f530Var;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ qeg0(Object obj, Object obj2, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = obj2;
        this.c = tlsVar;
    }

    public /* synthetic */ qeg0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ qeg0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
