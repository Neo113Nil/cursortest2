package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lpj extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qpj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpj(qpj qpjVar, int i) {
        super(1);
        this.r = i;
        this.s = qpjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.r) {
            case 0:
                ri2 ri2Var = (ri2) obj;
                ri2Var.getClass();
                qpj qpjVar = this.s;
                zx0 zx0Var = qpjVar.b;
                ListIterator listIterator = zx0Var.listIterator(zx0Var.f());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((kpj) obj2).isEnabled()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                kpj kpjVar = (kpj) obj2;
                if (qpjVar.c != null) {
                    qpjVar.c();
                }
                qpjVar.c = kpjVar;
                if (kpjVar != null) {
                    kpjVar.handleOnBackStarted(ri2Var);
                }
                break;
            default:
                ri2 ri2Var2 = (ri2) obj;
                ri2Var2.getClass();
                qpj qpjVar2 = this.s;
                kpj kpjVar2 = qpjVar2.c;
                if (kpjVar2 == null) {
                    zx0 zx0Var2 = qpjVar2.b;
                    ListIterator listIterator2 = zx0Var2.listIterator(zx0Var2.f());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((kpj) obj3).isEnabled()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    kpjVar2 = (kpj) obj3;
                }
                if (kpjVar2 != null) {
                    kpjVar2.handleOnBackProgressed(ri2Var2);
                }
                break;
        }
        return Unit.a;
    }
}
