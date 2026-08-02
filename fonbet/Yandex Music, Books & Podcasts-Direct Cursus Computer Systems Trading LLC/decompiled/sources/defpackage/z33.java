package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class z33 extends aur implements Function2 {
    public qqi j;
    public c43 k;
    public nu2 l;
    public int m;
    public final /* synthetic */ c43 n;
    public final /* synthetic */ nu2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z33(c43 c43Var, nu2 nu2Var, Continuation continuation) {
        super(2, continuation);
        this.n = c43Var;
        this.o = nu2Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new z33(this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z33) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (r8.a(r16) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (defpackage.y2x.p(r4, r16) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0039, code lost:
    
        if (defpackage.y2x.p(r8, r16) == r0) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f7 -> B:7:0x00fa). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        c43 c43Var;
        nu2 nu2Var;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        int i2 = 2;
        if (i == 0) {
            qgg.h0(obj);
            long j = c43.e;
            this.m = 1;
        } else if (i == 1) {
            qgg.h0(obj);
        } else if (i == 2) {
            nu2Var = this.l;
            c43Var = this.k;
            qqiVar = this.j;
            qgg.h0(obj);
            try {
                LinkedHashSet z0 = CollectionsKt.z0(c43Var.c);
                for (lu2 lu2Var : c43Var.c) {
                    if (saf.X(getContext())) {
                        Timber.Companion companion = Timber.INSTANCE;
                        companion.tag("YP:BlckBaseUrlsManager").d("Work with " + lu2Var, new Object[0]);
                        if (nu2Var.a(lu2Var.a)) {
                            companion.tag("YP:BlckBaseUrlsManager").d("Check OK", new Object[0]);
                            z0.remove(lu2Var);
                            Iterator it = c43Var.b.iterator();
                            while (it.hasNext()) {
                                ((zlq) it.next()).a(lu2Var);
                            }
                        } else {
                            companion.tag("YP:BlckBaseUrlsManager").d("Check failed", new Object[0]);
                        }
                    }
                }
                c43Var.c = z0;
                qqiVar.b(null);
                long j2 = c43.f;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = 3;
            } catch (Throwable th) {
                qqiVar.b(null);
                throw th;
            }
        } else {
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            i2 = 2;
        }
        if (!saf.X(getContext())) {
            return Unit.a;
        }
        Timber.INSTANCE.tag("YP:BlckBaseUrlsManager").d("try to remove baseUrls from blacklist", new Object[0]);
        c43Var = this.n;
        qqiVar = c43Var.d;
        this.j = qqiVar;
        this.k = c43Var;
        nu2Var = this.o;
        this.l = nu2Var;
        this.m = i2;
    }
}
