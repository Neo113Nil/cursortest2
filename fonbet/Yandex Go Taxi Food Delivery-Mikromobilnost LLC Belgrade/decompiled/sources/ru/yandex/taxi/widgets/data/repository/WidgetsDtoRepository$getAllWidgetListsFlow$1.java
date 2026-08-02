package ru.yandex.taxi.widgets.data.repository;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lo801;", "", "Lx251;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$getAllWidgetListsFlow$1", f = "WidgetsDtoRepository.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsDtoRepository$getAllWidgetListsFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsDtoRepository$getAllWidgetListsFlow$1(t tVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WidgetsDtoRepository$getAllWidgetListsFlow$1 widgetsDtoRepository$getAllWidgetListsFlow$1 = new WidgetsDtoRepository$getAllWidgetListsFlow$1(this.this$0, continuation);
        widgetsDtoRepository$getAllWidgetListsFlow$1.L$0 = obj;
        return widgetsDtoRepository$getAllWidgetListsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetsDtoRepository$getAllWidgetListsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r2, r0, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.h;
            this.L$0 = vprVar;
            this.label = 1;
            obj = yVar.Q(this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            tpr tprVar = (tpr) this.this$0.r.getValue();
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 2;
        } else {
            Map f = kotlin.collections.b.f();
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 3;
        }
    }
}
