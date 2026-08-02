package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tj0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj0(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.r = i2;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.s = i;
        this.x = obj5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                Context context = (Context) this.t;
                Function1 function1 = (Function1) this.u;
                mq5 mq5Var = (mq5) this.v;
                koo kooVar = (koo) this.w;
                KeyEvent.Callback callback = (View) this.x;
                callback.getClass();
                return new keu(context, function1, mq5Var, kooVar, this.s, (uzj) callback).getLayoutNode();
            default:
                zc8 zc8Var = (zc8) this.t;
                List list = zc8Var.b;
                List list2 = list;
                List<bd8> list3 = null;
                if (list2 == null || list2.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    bd8 bd8Var = zc8Var.a;
                    if (bd8Var != null) {
                        list3 = t75.c(bd8Var);
                    }
                } else {
                    list3 = list;
                }
                List list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    qg8 qg8Var = ((pe8) this.u).a;
                    gc8 gc8Var = (gc8) this.v;
                    xzb xzbVar = (xzb) this.w;
                    qg8Var.getClass();
                    for (bd8 bd8Var2 : list3) {
                        if (((Boolean) bd8Var2.b.a(xzbVar)).booleanValue()) {
                            xzb xzbVar2 = xzbVar;
                            gc8 gc8Var2 = gc8Var;
                            qg8Var.b.d(gc8Var2, xzbVar2, this.s, (String) zc8Var.c.a(xzbVar2), bd8Var2);
                            qg8Var.c.b(bd8Var2, xzbVar2);
                            eg8 actionHandler = gc8Var2.getActionHandler();
                            gc8Var = gc8Var2;
                            xzbVar = xzbVar2;
                            qg8Var.b(gc8Var, xzbVar, bd8Var2, "menu", actionHandler);
                        }
                        gc8Var = gc8Var;
                        xzbVar = xzbVar;
                    }
                    ((tqn) this.x).a = true;
                }
                return Unit.a;
        }
    }
}
