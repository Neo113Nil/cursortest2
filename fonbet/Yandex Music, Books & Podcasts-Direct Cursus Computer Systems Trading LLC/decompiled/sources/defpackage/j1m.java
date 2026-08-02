package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final /* synthetic */ class j1m implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k1m b;
    public final /* synthetic */ mqs c;

    public /* synthetic */ j1m(k1m k1mVar, mqs mqsVar) {
        this.b = k1mVar;
        this.c = mqsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r2.A.d() == false) goto L26;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                mqs mqsVar = this.c;
                k1m k1mVar = this.b;
                if (mqsVar.k != dg2.b) {
                    nnk nnkVar = k1mVar.f;
                    String str = mqsVar.a;
                    synchronized (nnkVar) {
                        cus cusVar = (cus) nnkVar.a;
                        cusVar.getClass();
                        str.getClass();
                        boolean booleanValue = ((Boolean) x97.D(g.a, new lxg(cusVar, str, null, 3))).booleanValue();
                        break;
                    }
                }
                break;
            default:
                k1m k1mVar2 = this.b;
                mqs mqsVar2 = this.c;
                ef3 ef3Var = ef3.b;
                muo muoVar = k1mVar2.g;
                if (muoVar == null) {
                    muoVar = muo.UNKNOWN;
                }
                df3 j = brs.j(mqsVar2);
                i1m i1mVar = mqsVar2.v;
                ef3.g(ef3Var, muoVar, j, pe3.DELETE_CACHE);
                k1mVar2.l.C(sjb.RemoveFromPlaylist);
                k1mVar2.d.e();
                Assertions.assertNonNull(i1mVar);
                Context context = k1mVar2.e;
                if (i1mVar == null) {
                    hag.x(context, R.string.error_unknown, 0);
                    return Unit.a;
                }
                cvl cvlVar = k1mVar2.A;
                context.getClass();
                cvlVar.getClass();
                x97.y(cmd.a, dm6.a, null, new j57(context, mqsVar2, cvlVar, (Continuation) null, 9), 2);
                return Unit.a;
        }
    }

    public /* synthetic */ j1m(mqs mqsVar, k1m k1mVar) {
        this.c = mqsVar;
        this.b = k1mVar;
    }
}
