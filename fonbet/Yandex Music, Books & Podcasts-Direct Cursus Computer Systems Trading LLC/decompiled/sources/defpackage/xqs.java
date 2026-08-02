package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xqs extends aur implements uyc {
    public int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;
    public /* synthetic */ s1t n;
    public /* synthetic */ j1g o;
    public final /* synthetic */ brs p;
    public final /* synthetic */ mqs q;
    public final /* synthetic */ zus r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqs(brs brsVar, mqs mqsVar, zus zusVar, Continuation continuation) {
        super(6, continuation);
        this.p = brsVar;
        this.q = mqsVar;
        this.r = zusVar;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        mqs mqsVar = this.q;
        zus zusVar = this.r;
        xqs xqsVar = new xqs(this.p, mqsVar, zusVar, (Continuation) obj6);
        xqsVar.k = booleanValue;
        xqsVar.l = booleanValue2;
        xqsVar.m = booleanValue3;
        xqsVar.n = (s1t) obj4;
        xqsVar.o = (j1g) obj5;
        return xqsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        s1t s1tVar = this.n;
        j1g j1gVar = this.o;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        this.n = null;
        this.o = null;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.j = 1;
        Object c = brs.c(this.p, this.q, this.r, z, z2, z3, s1tVar, j1gVar, this);
        return c == nm6Var ? nm6Var : c;
    }
}
