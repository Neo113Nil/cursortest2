package defpackage;

import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class snh extends ek41 {
    public final /* synthetic */ fyc a;
    public final /* synthetic */ qi9 b;

    public snh(fyc fycVar, qi9 qi9Var) {
        this.a = fycVar;
        this.b = qi9Var;
    }

    @Override // defpackage.ek41
    public final void b(ydi0 ydi0Var, int i, String str) {
        this.b.l(null);
    }

    @Override // defpackage.ek41
    public final void c(zj41 zj41Var, int i, String str) {
        this.a.T(zy11.a);
        this.b.l(new ApolloWebSocketClosedException(i, str));
    }

    @Override // defpackage.ek41
    public final void d(ydi0 ydi0Var, Exception exc, kvj0 kvj0Var) {
        this.a.T(zy11.a);
        this.b.l(exc);
    }

    @Override // defpackage.ek41
    public final void e(zj41 zj41Var, String str) {
        this.b.d(str);
    }

    @Override // defpackage.ek41
    public final void f(ByteString byteString) {
        this.b.d(byteString.w());
    }

    @Override // defpackage.ek41
    public final void g(kvj0 kvj0Var) {
        this.a.T(zy11.a);
    }
}
