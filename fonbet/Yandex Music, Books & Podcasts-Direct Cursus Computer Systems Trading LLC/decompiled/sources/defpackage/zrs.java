package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class zrs implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ ass b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ m d;
    public final /* synthetic */ qe3 e;
    public final /* synthetic */ boolean f;

    public zrs(xdr xdrVar, ass assVar, Context context, m mVar, qe3 qe3Var, boolean z) {
        this.a = xdrVar;
        this.b = assVar;
        this.c = context;
        this.d = mVar;
        this.e = qe3Var;
        this.f = z;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new yrs(rjcVar, this.b, this.c, this.d, this.e, this.f), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
