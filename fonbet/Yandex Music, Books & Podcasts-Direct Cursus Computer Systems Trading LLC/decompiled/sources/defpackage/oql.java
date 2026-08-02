package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oql extends aur implements tyc {
    public /* synthetic */ e6l j;
    public /* synthetic */ boolean k;
    public /* synthetic */ wum l;
    public /* synthetic */ h4q m;
    public final /* synthetic */ grl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oql(grl grlVar, Continuation continuation) {
        super(5, continuation);
        this.n = grlVar;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        oql oqlVar = new oql(this.n, (Continuation) obj5);
        oqlVar.j = (e6l) obj;
        oqlVar.k = booleanValue;
        oqlVar.l = (wum) obj3;
        oqlVar.m = (h4q) obj4;
        return oqlVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        e6l e6lVar = this.j;
        boolean z = this.k;
        wum wumVar = this.l;
        h4q h4qVar = this.m;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        mwk G = this.n.G();
        mwk mwkVar = wumVar.c;
        long j = wumVar.a;
        long j2 = wumVar.b;
        boolean d = Intrinsics.d(G, mwkVar);
        boolean z2 = (e6lVar instanceof d6l) && ((d6l) e6lVar).b == w0l.b;
        float f = 0.0f;
        if (d) {
            Long l = new Long(j2);
            if (l.longValue() == 0) {
                l = null;
            }
            if (l != null) {
                f = j / l.longValue();
            }
        }
        if (!d) {
            j2 = 0;
        }
        if (!d) {
            j = 0;
        }
        return new v7l(z2, z, f, j2, j, h4qVar.a);
    }
}
