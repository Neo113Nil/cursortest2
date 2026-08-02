package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class gfd extends aur implements Function2 {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        gfd gfdVar = new gfd(2, continuation);
        gfdVar.o = obj;
        return gfdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gfd) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (defpackage.y2x.o(10000, r10) != r1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0073 -> B:6:0x0018). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        rjc rjcVar = (rjc) this.o;
        nm6 nm6Var = nm6.a;
        int i7 = this.n;
        if (i7 == 0) {
            qgg.h0(obj);
            i = 100;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6 = this.k;
                i5 = this.j;
                qgg.h0(obj);
                i = i5;
                i2 = i6 + 1;
                if (i2 < i) {
                    ssg.a(4, null, "aggressive scan: completed", null);
                    return Unit.a;
                }
                ssg.a(3, null, dfi.c(i2 + 1, "rescan triggered: by aggressive scanner ", " repeat"), null);
                Unit unit = Unit.a;
                this.o = rjcVar;
                this.j = i;
                this.k = i2;
                this.l = i2;
                this.m = 0;
                this.n = 1;
                if (rjcVar.emit(unit, this) != nm6Var) {
                    i6 = i2;
                    i4 = i6;
                    i5 = i;
                    i3 = 0;
                    this.o = rjcVar;
                    this.j = i5;
                    this.k = i6;
                    this.l = i4;
                    this.m = i3;
                    this.n = 2;
                }
                return nm6Var;
            }
            int i8 = this.m;
            int i9 = this.l;
            int i10 = this.k;
            int i11 = this.j;
            qgg.h0(obj);
            i3 = i8;
            i6 = i10;
            i4 = i9;
            i5 = i11;
            this.o = rjcVar;
            this.j = i5;
            this.k = i6;
            this.l = i4;
            this.m = i3;
            this.n = 2;
        }
    }
}
