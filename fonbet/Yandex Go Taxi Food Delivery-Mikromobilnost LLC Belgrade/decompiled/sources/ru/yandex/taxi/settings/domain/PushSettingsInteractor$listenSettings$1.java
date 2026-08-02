package ru.yandex.taxi.settings.domain;

import defpackage.bms;
import defpackage.c3g0;
import defpackage.g4g0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qme0;
import defpackage.tcc;
import defpackage.u3g0;
import defpackage.xh9;
import defpackage.y4g0;
import defpackage.y5r0;
import defpackage.yxf0;
import defpackage.z0g0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lu3g0;", "model", "", "", "disabledChannelsIds", "Lxh9;", "changingSystemChannel", "<anonymous>", "(Lu3g0;Ljava/util/List;Lxh9;)Lu3g0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.PushSettingsInteractor$listenSettings$1", f = "PushSettingsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushSettingsInteractor$listenSettings$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSettingsInteractor$listenSettings$1(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PushSettingsInteractor$listenSettings$1 pushSettingsInteractor$listenSettings$1 = new PushSettingsInteractor$listenSettings$1(this.this$0, (Continuation) obj4);
        pushSettingsInteractor$listenSettings$1.L$0 = (u3g0) obj;
        pushSettingsInteractor$listenSettings$1.L$1 = (List) obj2;
        pushSettingsInteractor$listenSettings$1.L$2 = (xh9) obj3;
        return pushSettingsInteractor$listenSettings$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (((java.lang.Boolean) r12.c.getValue(r12, defpackage.g4g0.d[2])).booleanValue() == false) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u3g0 u3g0Var = (u3g0) this.L$0;
        List list = (List) this.L$1;
        xh9 xh9Var = (xh9) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        yxf0 yxf0Var = dVar.c;
        List<Object> list2 = u3g0Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Object obj2 : list2) {
            if (obj2 instanceof y5r0) {
                y5r0 y5r0Var = (y5r0) obj2;
                z0g0 z0g0Var = y5r0Var.j;
                String str = z0g0Var.a;
                y4g0 y4g0Var = dVar.d;
                boolean contains = list.contains(str);
                boolean l = jl40.l(xh9Var.a, str);
                if (!contains) {
                    if (((c3g0) yxf0Var.a).a.a("FIELD_DONT_SHOW_PROMO_PUSHES", false)) {
                        g4g0 g4g0Var = (g4g0) yxf0Var.b;
                    }
                    if (l && xh9Var.b) {
                        y4g0Var.a(z0g0Var, true);
                    }
                    y4g0Var.getClass();
                    obj2 = y5r0.b(y5r0Var, y4g0Var.c(str));
                }
                y4g0Var.a(z0g0Var, false);
                y4g0Var.getClass();
                obj2 = y5r0.b(y5r0Var, y4g0Var.c(str));
            }
            arrayList.add(obj2);
        }
        g4g0 g4g0Var2 = (g4g0) yxf0Var.b;
        qme0 qme0Var = g4g0Var2.c;
        kgx[] kgxVarArr = g4g0.d;
        if (!((Boolean) qme0Var.getValue(g4g0Var2, kgxVarArr[2])).booleanValue()) {
            g4g0 g4g0Var3 = (g4g0) yxf0Var.b;
            g4g0Var3.c.setValue(g4g0Var3, kgxVarArr[2], Boolean.TRUE);
        }
        return u3g0.a(u3g0Var, arrayList, 6);
    }
}
