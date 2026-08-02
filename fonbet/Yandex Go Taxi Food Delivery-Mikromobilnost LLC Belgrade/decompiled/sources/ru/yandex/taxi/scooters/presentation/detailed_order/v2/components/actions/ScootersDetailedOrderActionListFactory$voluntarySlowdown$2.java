package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.hfn0;
import defpackage.lfn0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.nfn0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o8p0;
import defpackage.qoh;
import defpackage.sen0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhfn0;", "<anonymous>", "(Ltse;)Lhfn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory$voluntarySlowdown$2", f = "ScootersDetailedOrderActionListFactory.kt", l = {356, 357}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$voluntarySlowdown$2 extends SuspendLambda implements wls {
    final /* synthetic */ o8p0 $exp;
    final /* synthetic */ List<? extends ScootersSlowdown> $scootersSlowdownsInfo;
    final /* synthetic */ ScootersDetailedOrderAction$ClickType$Toggle$ToggleState $voluntarySlowdownToggleState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$voluntarySlowdown$2(List list, o8p0 o8p0Var, a aVar, ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState, Continuation continuation) {
        super(2, continuation);
        this.$scootersSlowdownsInfo = list;
        this.$exp = o8p0Var;
        this.this$0 = aVar;
        this.$voluntarySlowdownToggleState = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersDetailedOrderActionListFactory$voluntarySlowdown$2 scootersDetailedOrderActionListFactory$voluntarySlowdown$2 = new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2(this.$scootersSlowdownsInfo, this.$exp, this.this$0, this.$voluntarySlowdownToggleState, continuation);
        scootersDetailedOrderActionListFactory$voluntarySlowdown$2.L$0 = obj;
        return scootersDetailedOrderActionListFactory$voluntarySlowdown$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderActionListFactory$voluntarySlowdown$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        noh h;
        String str2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1(this.this$0, this.$exp, null), 3);
            Iterator<T> it = this.$scootersSlowdownsInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ScootersSlowdown) obj2).b == ScootersSlowdown.Reason.TRAINING_MODE) {
                    break;
                }
            }
            ScootersSlowdown scootersSlowdown = (ScootersSlowdown) obj2;
            Integer num = scootersSlowdown != null ? new Integer(scootersSlowdown.a) : this.$exp.g;
            if (num == null || (str = String.valueOf(num.intValue())) == null) {
                str = "";
            }
            h = tje.h(tseVar, null, null, new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$subtitleAsync$1(this.this$0, this.$exp, str, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = (String) this.L$5;
                kotlin.b.b(obj);
                str2 = str3;
                String str4 = (String) obj;
                String a = ((m7x0) this.this$0.b).a(this.$exp.d);
                return new hfn0(a == null ? new nfn0(a) : lfn0.a, str2, "voluntary_slowdown", 0, new sen0(this.$voluntarySlowdownToggleState, false), null, str4, null, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            }
            h = (noh) this.L$4;
            kotlin.b.b(obj);
        }
        String str5 = (String) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = str5;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str2 = str5;
            obj = k;
            String str42 = (String) obj;
            String a2 = ((m7x0) this.this$0.b).a(this.$exp.d);
            return new hfn0(a2 == null ? new nfn0(a2) : lfn0.a, str2, "voluntary_slowdown", 0, new sen0(this.$voluntarySlowdownToggleState, false), null, str42, null, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        }
        return coroutineSingletons;
    }
}
