package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b15 implements pjc {
    public final /* synthetic */ tc4 a;
    public final /* synthetic */ e15 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Boolean e;
    public final /* synthetic */ Boolean f;

    public b15(tc4 tc4Var, e15 e15Var, String str, String str2, Boolean bool, Boolean bool2) {
        this.a = tc4Var;
        this.b = e15Var;
        this.c = str;
        this.d = str2;
        this.e = bool;
        this.f = bool2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new fa3(rjcVar, this.b, this.c, this.d, this.e, this.f), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
