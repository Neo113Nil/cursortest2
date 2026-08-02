package defpackage;

import androidx.compose.animation.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w8b extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x8b s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8b(x8b x8bVar, int i) {
        super(1);
        this.r = i;
        this.s = x8bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                x7t x7tVar = (x7t) obj;
                r8b r8bVar = r8b.a;
                r8b r8bVar2 = r8b.b;
                boolean c = x7tVar.c(r8bVar, r8bVar2);
                Object obj2 = null;
                x8b x8bVar = this.s;
                if (c) {
                    bc4 bc4Var = x8bVar.t.a.c;
                    if (bc4Var != null) {
                        obj2 = bc4Var.c;
                    }
                } else if (x7tVar.c(r8bVar2, r8b.c)) {
                    bc4 bc4Var2 = x8bVar.u.a.c;
                    if (bc4Var2 != null) {
                        obj2 = bc4Var2.c;
                    }
                } else {
                    obj2 = c.d;
                }
                return obj2 == null ? c.d : obj2;
            default:
                x7t x7tVar2 = (x7t) obj;
                r8b r8bVar3 = r8b.a;
                r8b r8bVar4 = r8b.b;
                boolean c2 = x7tVar2.c(r8bVar3, r8bVar4);
                x8b x8bVar2 = this.s;
                if (c2) {
                    ysq ysqVar = x8bVar2.t.a.b;
                    return ysqVar != null ? ysqVar.b : c.c;
                }
                if (!x7tVar2.c(r8bVar4, r8b.c)) {
                    return c.c;
                }
                ysq ysqVar2 = x8bVar2.u.a.b;
                return ysqVar2 != null ? ysqVar2.b : c.c;
        }
    }
}
