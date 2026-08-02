package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class yqs extends aur implements uyc {
    public int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;
    public /* synthetic */ mwj n;
    public /* synthetic */ j1g o;
    public final /* synthetic */ brs p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqs(brs brsVar, Continuation continuation) {
        super(6, continuation);
        this.p = brsVar;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        yqs yqsVar = new yqs(this.p, (Continuation) obj6);
        yqsVar.k = booleanValue;
        yqsVar.l = booleanValue2;
        yqsVar.m = booleanValue3;
        yqsVar.n = (mwj) obj4;
        yqsVar.o = (j1g) obj5;
        return yqsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        xe xeVar;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        mwj mwjVar = this.n;
        j1g j1gVar = this.o;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            brs brsVar = this.p;
            mqs mqsVar = brsVar.a;
            zus zusVar = brsVar.c;
            this.n = mwjVar;
            this.o = null;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.j = 1;
            obj = brs.c(brsVar, mqsVar, zusVar, z, z2, z3, null, j1gVar, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        Collection collection = (List) obj;
        Pair pair = mwjVar.a;
        if (pair != null && (xeVar = (xe) pair.b) != null) {
            collection = CollectionsKt.h0(collection, xeVar);
        }
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        eh ehVar = new eh();
        arrayList.addAll(collection);
        return CollectionsKt.o0(arrayList, ehVar);
    }
}
