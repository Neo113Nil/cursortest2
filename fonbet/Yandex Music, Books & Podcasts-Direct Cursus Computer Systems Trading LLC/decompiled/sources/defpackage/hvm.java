package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class hvm extends h7o implements Function2 {
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xqn n;
    public final /* synthetic */ long o;
    public final /* synthetic */ float p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvm(xqn xqnVar, long j, float f, long j2, Continuation continuation) {
        super(2, continuation);
        this.n = xqnVar;
        this.o = j;
        this.p = f;
        this.q = j2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        hvm hvmVar = new hvm(this.n, this.o, this.p, this.q, continuation);
        hvmVar.m = obj;
        return hvmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hvm) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        hur hurVar = (hur) this.m;
        nm6 nm6Var = nm6.a;
        int i2 = this.l;
        if (i2 == 0) {
            qgg.h0(obj);
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            qgg.h0(obj);
            Iterator it = ((ffm) obj).a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (ywf.u(((lfm) obj2).a, this.q)) {
                    break;
                }
            }
            lfm lfmVar = (lfm) obj2;
            xqn xqnVar = this.n;
            if (lfmVar == null && lfmVar.d) {
                if (enj.d(enj.g(lfmVar.c, this.o)) > this.p) {
                    xqnVar.a = avg.b;
                }
                if (i != 0) {
                    return Unit.a;
                }
                this.m = hurVar;
                this.k = i;
                this.l = 1;
                obj = hurVar.a(gfm.b, this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
                Iterator it2 = ((ffm) obj).a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                lfm lfmVar2 = (lfm) obj2;
                xqn xqnVar2 = this.n;
                if (lfmVar2 == null) {
                }
                xqnVar2.a = avg.a;
            } else {
                xqnVar2.a = avg.a;
            }
            i = 1;
            if (i != 0) {
            }
        }
    }
}
