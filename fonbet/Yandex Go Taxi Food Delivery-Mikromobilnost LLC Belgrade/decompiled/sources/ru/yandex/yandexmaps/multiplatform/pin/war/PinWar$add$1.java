package ru.yandex.yandexmaps.multiplatform.pin.war;

import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.maps.core.geometry.PointExtensionKt;
import defpackage.cxb0;
import defpackage.k8c;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tls;
import defpackage.wp7;
import defpackage.wrr;
import defpackage.wub0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWar$add$1", f = "PinWar.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinWar$add$1 extends SuspendLambda implements tls {
    final /* synthetic */ cxb0 $callback;
    final /* synthetic */ Collection<qzb0> $seeds;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinWar$add$1(b bVar, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$seeds = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PinWar$add$1(this.this$0, this.$seeds, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PinWar$add$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Float f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            wrr wrrVar = this.this$0.f;
            Collection<qzb0> collection = this.$seeds;
            wub0 wub0Var = (wub0) wrrVar.b;
            for (qzb0 qzb0Var : collection) {
                mwb0 mwb0Var = qzb0Var.a;
                qzb0 qzb0Var2 = (qzb0) wub0Var.b.get(mwb0Var);
                if (qzb0Var2 != null) {
                    if (PointExtensionKt.isIdentical$default(qzb0Var2.c, qzb0Var.c, 0.0f, 2, null)) {
                        qzb0Var2 = null;
                    }
                    if (qzb0Var2 != null) {
                        ((wub0) wrrVar.A).b(mwb0Var, qzb0Var);
                    }
                }
                wub0Var.b(mwb0Var, qzb0Var);
                ((wub0) wrrVar.c).b(mwb0Var, qzb0Var);
            }
            c cVar = (c) this.this$0;
            wrr wrrVar2 = cVar.f;
            if (!((wub0) wrrVar2.c).c().isEmpty() && (f = cVar.n) != null) {
                float floatValue = f.floatValue();
                List c = ((wub0) wrrVar2.c).c();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c) {
                    if (((qzb0) obj2).b >= floatValue) {
                        arrayList.add(obj2);
                    }
                }
                wub0 wub0Var2 = (wub0) wrrVar2.w;
                wub0Var2.b.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qzb0 qzb0Var3 = (qzb0) it.next();
                    wub0Var2.b(qzb0Var3.a, qzb0Var3);
                }
            }
            b bVar = this.this$0;
            PinInvalidationReason pinInvalidationReason = PinInvalidationReason.ADD;
            this.label = 1;
            if (bVar.r(true, pinInvalidationReason, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar2 = this.this$0;
        if (bVar2.j && !bVar2.k) {
            bVar2.k = true;
            k8c k8cVar = bVar2.a;
            a aVar = bVar2.i;
            LinkedHashMap linkedHashMap = (LinkedHashMap) k8cVar.b;
            if (((CameraListener) linkedHashMap.get(aVar)) == null) {
                wp7 wp7Var = new wp7(i2, aVar);
                ((Map) k8cVar.c).addCameraListener(wp7Var);
                linkedHashMap.put(aVar, wp7Var);
            }
        }
        return zy11.a;
    }
}
