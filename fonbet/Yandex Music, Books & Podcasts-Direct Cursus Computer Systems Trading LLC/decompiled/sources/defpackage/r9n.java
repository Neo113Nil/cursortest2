package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class r9n extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9n(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                ((bg5) this.receiver).d();
                return Unit.a;
            case 1:
                ((bg5) this.receiver).e();
                return Unit.a;
            case 2:
                ((bg5) this.receiver).a();
                return Unit.a;
            case 3:
                ((bg5) this.receiver).d();
                return Unit.a;
            case 4:
                ((bg5) this.receiver).e();
                return Unit.a;
            case 5:
                lin linVar = (lin) this.receiver;
                Context context = linVar.c;
                context.getClass();
                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName())));
                linVar.a.b();
                linVar.b.invoke();
                return Unit.a;
            case 6:
                lin linVar2 = (lin) this.receiver;
                linVar2.a.b();
                linVar2.b.invoke();
                return Unit.a;
            case 7:
                min minVar = (min) this.receiver;
                Context context2 = minVar.b;
                context2.getClass();
                context2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context2.getPackageName())));
                minVar.a.invoke();
                return Unit.a;
            case 8:
                ((min) this.receiver).a.invoke();
                return Unit.a;
            case 9:
                ueo ueoVar = (ueo) this.receiver;
                tf6 tf6Var = ueoVar.b;
                if (tf6Var == null) {
                    Intrinsics.j("coroutineScope");
                    throw null;
                }
                gld.L(tf6Var, null);
                ueoVar.i();
                v97 v97Var = ueoVar.f;
                if (v97Var == null) {
                    Intrinsics.j("connectionManager");
                    throw null;
                }
                ((b66) v97Var.g).close();
                vsr vsrVar = (vsr) v97Var.h;
                if (vsrVar != null) {
                    vsrVar.close();
                }
                return Unit.a;
            case 10:
                rro rroVar = (rro) this.receiver;
                voi voiVar = rroVar.r;
                g0c g0cVar = rroVar.q;
                ArrayList M = rro.M(rroVar.t);
                String str = rroVar.w;
                if (str == null) {
                    str = "";
                }
                String o = ouj.o("Пользователь нажал на кнопку Выбрать другой: ".concat(CollectionsKt.X(M, ", ", null, null, null, 62)), "; выбранный банк: ", str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                my0 my0Var = new my0();
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    my0Var.b.add(new jkr((String) it.next()));
                }
                linkedHashMap.put("bank_list", my0Var);
                linkedHashMap.put("selected_bank", new jkr(str));
                vtm k = su4.k(o, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(k, "event_name", "sbp_installed_bank_list-select_other-tapped", "sbp_installed_bank_list-select_other-tapped", k);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(j);
                Object d = voiVar.d();
                jro jroVar = d instanceof jro ? (jro) d : null;
                if (jroVar == null || !jroVar.c) {
                    LinkedHashMap linkedHashMap2 = sqg.a;
                    uwf.l("Show full nspk list in wrong state");
                    Parcelable.Creator<bfk> creator = bfk.CREATOR;
                    voiVar.l(new lro(y7g.F("Show full nspk list in wrong state"), R.string.paymentsdk_sbp_something_went_wrong, R.string.paymentsdk_sbp_something_went_wrong_description));
                } else {
                    rroVar.L();
                }
                return Unit.a;
            case 11:
                ((wdj) this.receiver).a();
                return Unit.a;
            case 12:
                ((wdj) this.receiver).d();
                return Unit.a;
            case 13:
                ((wdj) this.receiver).e();
                return Unit.a;
            case 14:
                ((wdj) this.receiver).a();
                return Unit.a;
            case 15:
                ((wdj) this.receiver).d();
                return Unit.a;
            case 16:
                ((wdj) this.receiver).e();
                return Unit.a;
            case 17:
                ((bg5) this.receiver).a();
                return Unit.a;
            case 18:
                ((bg5) this.receiver).d();
                return Unit.a;
            case 19:
                ((bg5) this.receiver).e();
                return Unit.a;
            case 20:
                ozo ozoVar = (ozo) this.receiver;
                sfm sfmVar = ozoVar.c;
                ozoVar.b.getClass();
                ((g6p) sfmVar.a).j((f7p) sfmVar.b, ((Number) ((aqi) sfmVar.c).getValue()).intValue());
                return Unit.a;
            case 21:
                a2p a2pVar = (a2p) this.receiver;
                m2p m2pVar = a2pVar.c;
                qyf qyfVar = a2pVar.b.c;
                qyfVar.getClass();
                x97.y(qyfVar, null, null, new s1n((Object) m2pVar, (Continuation) (objArr == true ? 1 : 0), 27), 3);
                return Unit.a;
            case 22:
                ((s2p) this.receiver).a();
                return Unit.a;
            case 23:
                ((s2p) this.receiver).a();
                return Unit.a;
            case 24:
                e3p e3pVar = ((s2p) this.receiver).d;
                e3pVar.getClass();
                x97.y(ot0.F(e3pVar), null, null, new s1n((Object) e3pVar, (Continuation) (objArr2 == true ? 1 : 0), 28), 3);
                return Unit.a;
            case 25:
                ((j6i) this.receiver).i();
                return Unit.a;
            case 26:
                xdr xdrVar = ((b6p) this.receiver).q;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 27:
                ((sai) this.receiver).a();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((r6p) this.receiver).b.S();
                return Unit.a;
            default:
                ((r6p) this.receiver).b.S();
                return Unit.a;
        }
    }
}
