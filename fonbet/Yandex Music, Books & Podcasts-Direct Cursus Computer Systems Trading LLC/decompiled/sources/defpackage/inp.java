package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.bdui.action.a;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.handler.c;
import com.yandex.plus.bdui.shared.b;
import com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.d;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class inp extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inp(d dVar, Activity activity, ViewGroup viewGroup, b bVar, Map map, h hVar, a aVar, String str, Map map2, b bVar2, Continuation continuation) {
        super(2, continuation);
        this.l = dVar;
        this.m = activity;
        this.n = viewGroup;
        this.o = bVar;
        this.p = map;
        this.q = hVar;
        this.r = aVar;
        this.s = str;
        this.t = map2;
        this.u = bVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                inp inpVar = new inp((aw0) this.m, (cnn) this.n, (wqn) this.o, (xdr) this.p, (Context) this.q, (yvn) this.r, (gjs) this.s, (ajs) this.t, (mm6) this.u, continuation);
                inpVar.l = obj;
                return inpVar;
            default:
                return new inp((d) this.l, (Activity) this.m, (ViewGroup) this.n, (b) this.o, (Map) this.p, (h) this.q, (a) this.r, (String) this.s, (Map) this.t, (b) this.u, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((inp) create((zmn) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((inp) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                wqn wqnVar = (wqn) this.o;
                cnn cnnVar = (cnn) this.n;
                xdr xdrVar = (xdr) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    int ordinal = ((zmn) this.l).ordinal();
                    if (ordinal == 0) {
                        gld.L((mm6) this.u, null);
                    } else if (ordinal == 4) {
                        if (cnnVar.a > wqnVar.a || !((Boolean) xdrVar.getValue()).booleanValue()) {
                            aw0 aw0Var = (aw0) this.m;
                            Context context = (Context) this.q;
                            n3b n3bVar = (n3b) ((yvn) this.r).copy();
                            this.k = 1;
                            obj = aw0Var.b(context, n3bVar, this);
                            if (obj == nm6Var) {
                            }
                        }
                        wqnVar.a = cnnVar.a;
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    ((gjs) this.s).b(((ajs) this.t).a);
                    wqnVar.a = cnnVar.a;
                    break;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!((Boolean) xdrVar.getValue()).booleanValue() && booleanValue) {
                    Boolean bool = Boolean.TRUE;
                    this.k = 2;
                    xdrVar.m(null, bool);
                    if (Unit.a == nm6Var) {
                    }
                    ((gjs) this.s).b(((ajs) this.t).a);
                }
                wqnVar.a = cnnVar.a;
                break;
            default:
                h hVar = (h) this.q;
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) hVar.e;
                b bVar2 = (b) this.o;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    d dVar = (d) this.l;
                    Activity activity = (Activity) this.m;
                    Map map = (Map) this.p;
                    this.k = 1;
                    obj = dVar.a(activity, map, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                c cVar = (c) obj;
                if (!(cVar instanceof com.yandex.plus.bdui.plus.handler.b)) {
                    if (!Intrinsics.d(cVar, com.yandex.plus.bdui.plus.handler.a.a)) {
                        b6e.s();
                        break;
                    } else {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusDivContentController.HandlerInvoker", "invokeHandler(); handler result is cancel");
                        }
                    }
                } else {
                    a aVar2 = (a) this.r;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "PlusDivContentController.HandlerInvoker", "dispatchResultAction(); handler result is success");
                    }
                    if (aVar2 != null) {
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "PlusDivContentController.HandlerInvoker", "dispatchResultAction(); dispatch success action = " + aVar2 + " without payload");
                        }
                        ((m) hVar.b).a.a(aVar2, new com.yandex.plus.bdui.action.h(bVar2), null);
                    } else if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "PlusDivContentController.HandlerInvoker", "dispatchResultAction(); success action not defined in layout");
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inp(aw0 aw0Var, cnn cnnVar, wqn wqnVar, xdr xdrVar, Context context, yvn yvnVar, gjs gjsVar, ajs ajsVar, mm6 mm6Var, Continuation continuation) {
        super(2, continuation);
        this.m = aw0Var;
        this.n = cnnVar;
        this.o = wqnVar;
        this.p = xdrVar;
        this.q = context;
        this.r = yvnVar;
        this.s = gjsVar;
        this.t = ajsVar;
        this.u = mm6Var;
    }
}
