package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.a;

/* loaded from: classes.dex */
public final class gnp extends a implements fm6 {
    public final /* synthetic */ gjs c;
    public final /* synthetic */ aw0 d;
    public final /* synthetic */ Context e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gnp(gjs gjsVar, aw0 aw0Var, Context context) {
        super(r0);
        rre rreVar = rre.f;
        this.c = gjsVar;
        this.d = aw0Var;
        this.e = context;
    }

    @Override // defpackage.fm6
    public final void N(Throwable th) {
        aw0 aw0Var = this.d;
        Context context = this.e;
        gjs gjsVar = this.c;
        x97.y(gjsVar, null, null, new lco(aw0Var, context, th, gjsVar, (Continuation) null, 7), 3);
    }
}
