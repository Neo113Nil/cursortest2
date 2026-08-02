package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zai implements wxi {
    public final /* synthetic */ ka0 a;

    public zai(ka0 ka0Var) {
        bxj bxjVar = bxj.a;
        this.a = ka0Var;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        bxj bxjVar = bxj.a;
        return swf.i(0.0f, this.a.d(enj.f(j2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        xai xaiVar;
        int i;
        if (continuation instanceof xai) {
            xaiVar = (xai) continuation;
            int i2 = xaiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xaiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xaiVar.k;
                nm6 nm6Var = nm6.a;
                i = xaiVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    bxj bxjVar = bxj.a;
                    float c = yzt.c(j2);
                    xaiVar.j = j2;
                    xaiVar.m = 1;
                    if (this.a.j(c, xaiVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = xaiVar.j;
                    qgg.h0(obj);
                }
                return new yzt(j2);
            }
        }
        xaiVar = new xai(this, (cg6) continuation);
        Object obj2 = xaiVar.k;
        nm6 nm6Var2 = nm6.a;
        i = xaiVar.m;
        if (i != 0) {
        }
        return new yzt(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(long j, Continuation continuation) {
        yai yaiVar;
        int i;
        if (continuation instanceof yai) {
            yaiVar = (yai) continuation;
            int i2 = yaiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yaiVar.k;
                nm6 nm6Var = nm6.a;
                i = yaiVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    bxj bxjVar = bxj.a;
                    float c = yzt.c(j);
                    ka0 ka0Var = this.a;
                    float g = ka0Var.g();
                    if (c < 0.0f) {
                        Float c0 = CollectionsKt.c0(ka0Var.e().a.values());
                        if (g > (c0 != null ? c0.floatValue() : Float.NaN)) {
                            yaiVar.j = j;
                            yaiVar.m = 1;
                            if (ka0Var.j(c, yaiVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    j = 0;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = yaiVar.j;
                    qgg.h0(obj);
                }
                return new yzt(j);
            }
        }
        yaiVar = new yai(this, (cg6) continuation);
        Object obj2 = yaiVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yaiVar.m;
        if (i != 0) {
        }
        return new yzt(j);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        bxj bxjVar = bxj.a;
        float f = enj.f(j);
        if (f >= 0.0f || i != 1) {
            return 0L;
        }
        return swf.i(0.0f, this.a.d(f));
    }
}
