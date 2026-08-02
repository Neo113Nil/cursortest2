package ru.yandex.taxi.widgets.data.repository;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.e551;
import defpackage.jb7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o801;
import defpackage.qtb1;
import defpackage.tpr;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.multiorder.multi.ServiceType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lx251;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$getWidgetListFlow$1", f = "WidgetsDtoRepository.kt", l = {109, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsDtoRepository$getWidgetListFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ yaf0 $screenType;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsDtoRepository$getWidgetListFlow$1(t tVar, yaf0 yaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$screenType = yaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WidgetsDtoRepository$getWidgetListFlow$1 widgetsDtoRepository$getWidgetListFlow$1 = new WidgetsDtoRepository$getWidgetListFlow$1(this.this$0, this.$screenType, continuation);
        widgetsDtoRepository$getWidgetListFlow$1.L$0 = obj;
        return widgetsDtoRepository$getWidgetListFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetsDtoRepository$getWidgetListFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d7, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r8, r1, r17) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0037, code lost:
    
        if (r3 == r2) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object Q;
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.h;
            this.L$0 = vprVar;
            this.label = 1;
            Q = yVar.Q(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            Q = obj;
        }
        boolean booleanValue = ((Boolean) Q).booleanValue();
        t tVar = this.this$0;
        if (booleanValue) {
            tprVar = new o((tpr) tVar.r.getValue(), this.$screenType);
        } else {
            Map map = (Map) tVar.j.getValue();
            o801 o801Var = new o801(vez0.D(this.$screenType));
            t tVar2 = this.this$0;
            yaf0 yaf0Var = this.$screenType;
            Object obj2 = map.get(o801Var);
            if (obj2 == null) {
                tVar2.getClass();
                ProductsScreenType$Type a = yaf0Var.a();
                int i2 = a == null ? -1 : e551.a[a.ordinal()];
                obj2 = new q(tVar2.d(kotlinx.coroutines.flow.e.X(new m((tpr) tVar2.s.getValue(), yaf0Var), new WidgetsDtoRepository$createWidgetsFlow$2(tVar2, false, new AtomicReference(), (i2 == 1 || i2 == 2 || i2 == 3) ? new jb7(tVar2.g, new ServiceType[]{ServiceType.TAXI}) : qtb1.b, yaf0Var, null))), yaf0Var);
                map.put(o801Var, obj2);
            }
            tprVar = (tpr) obj2;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = booleanValue;
        this.label = 2;
    }
}
