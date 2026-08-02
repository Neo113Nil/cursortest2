package defpackage;

import android.content.Context;
import io.opentelemetry.proto.common.v1.c;
import io.opentelemetry.proto.resource.v1.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class dtj {
    public x3r a;
    public final a b;
    public final c c;
    public final kn3 d;
    public final tnm e;
    public final jp0 f;
    public final sfm g;

    public dtj(Context context, j2o j2oVar, String str, mm6 mm6Var) {
        this.b = (a) j2oVar.b();
        fpe fpeVar = (fpe) c.b.createBuilder();
        fpeVar.d();
        c cVar = (c) fpeVar.b;
        cVar.getClass();
        cVar.a = "payment-sdk";
        this.c = (c) fpeVar.b();
        phn.a.getClass();
        n8 n8Var = phn.b;
        n8Var.getClass();
        byte[] bArr = new byte[16];
        n8Var.h().nextBytes(bArr);
        this.d = nn3.n(bArr, 0, 16);
        int i = 0;
        int i2 = 2;
        this.e = new tnm(mm6Var, new w4i(i2, this, dtj.class, "sendQueue", "sendQueue(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 10));
        this.f = new jp0(context, mm6Var, new w4i(i2, this, dtj.class, "sendUnsentSpan", "sendUnsentSpan(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 12));
        w4i w4iVar = new w4i(2, this, dtj.class, "errorSending", "errorSending([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 11);
        sfm sfmVar = new sfm();
        sfmVar.a = str;
        sfmVar.b = w4iVar;
        sfmVar.c = new OkHttpClient();
        this.g = sfmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dtj dtjVar, List list, Continuation continuation) {
        ctj ctjVar;
        int i;
        dtj dtjVar2;
        Iterator it;
        dtjVar.getClass();
        if (continuation instanceof ctj) {
            ctjVar = (ctj) continuation;
            int i2 = ctjVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ctjVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ctjVar.l;
                nm6 nm6Var = nm6.a;
                i = ctjVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Iterator it2 = list.iterator();
                    dtjVar2 = dtjVar;
                    it = it2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = ctjVar.k;
                    dtjVar2 = ctjVar.j;
                    qgg.h0(obj);
                }
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    sfm sfmVar = dtjVar2.g;
                    ctjVar.j = dtjVar2;
                    ctjVar.k = it;
                    ctjVar.n = 1;
                    if (sfmVar.I(bArr, ctjVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            }
        }
        ctjVar = new ctj(dtjVar, continuation);
        Object obj2 = ctjVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ctjVar.n;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public final y8p b(String str) {
        str.getClass();
        kn3 kn3Var = this.d;
        kn3Var.getClass();
        y8p y8pVar = new y8p(str, kn3Var, new kef(1, this, dtj.class, "addSpanToQueue", "addSpanToQueue(Lcom/yandex/paymentsdk/opentelemetry/Span;)V", 0, 23));
        x3r x3rVar = this.a;
        if (x3rVar != null) {
            y8pVar.k(x3rVar.c);
        }
        return y8pVar;
    }
}
