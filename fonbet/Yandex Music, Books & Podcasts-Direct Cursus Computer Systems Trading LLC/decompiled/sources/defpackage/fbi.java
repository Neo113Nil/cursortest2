package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class fbi extends aur implements Function1 {
    public int j;
    public int k;
    public int l;
    public int m;
    public yoc n;
    public toc o;
    public int p;
    public final /* synthetic */ yoc q;
    public final /* synthetic */ toc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbi(yoc yocVar, toc tocVar, Continuation continuation) {
        super(1, continuation);
        this.q = yocVar;
        this.r = tocVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new fbi(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((fbi) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0082 -> B:6:0x0018). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yoc yocVar;
        toc tocVar;
        int i;
        int i2;
        int i3;
        toc tocVar2;
        yoc yocVar2;
        int i4;
        int i5;
        int i6;
        nm6 nm6Var = nm6.a;
        int i7 = this.p;
        if (i7 == 0) {
            qgg.h0(obj);
            yocVar = this.q;
            tocVar = this.r;
            i = 0;
            i2 = 2;
            if (i < i2) {
            }
        } else {
            if (i7 == 1) {
                int i8 = this.m;
                int i9 = this.l;
                int i10 = this.k;
                int i11 = this.j;
                tocVar2 = this.o;
                yoc yocVar3 = this.n;
                qgg.h0(obj);
                i3 = i8;
                i6 = i10;
                i4 = i9;
                i5 = i11;
                yocVar2 = yocVar3;
                yocVar2.getClass();
                yocVar2.a(new u8b(1, 4));
                this.n = yocVar2;
                this.o = tocVar2;
                this.j = i5;
                this.k = i6;
                this.l = i4;
                this.m = i3;
                this.p = 2;
                if (y2x.o(100L, this) != nm6Var) {
                }
                return nm6Var;
            }
            if (i7 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = this.k;
            i5 = this.j;
            toc tocVar3 = this.o;
            yocVar2 = this.n;
            qgg.h0(obj);
            yocVar = yocVar2;
            uoc uocVar = (uoc) tocVar3;
            uocVar.b(8, true, true);
            int i12 = i5;
            i = i6 + 1;
            tocVar = uocVar;
            i2 = i12;
            if (i < i2) {
                this.n = yocVar;
                this.o = tocVar;
                this.j = i2;
                this.k = i;
                this.l = i;
                this.m = 0;
                this.p = 1;
                if (y2x.o(500L, this) != nm6Var) {
                    yocVar2 = yocVar;
                    tocVar2 = tocVar;
                    i3 = 0;
                    i6 = i;
                    i5 = i2;
                    i4 = i6;
                    yocVar2.getClass();
                    yocVar2.a(new u8b(1, 4));
                    this.n = yocVar2;
                    this.o = tocVar2;
                    this.j = i5;
                    this.k = i6;
                    this.l = i4;
                    this.m = i3;
                    this.p = 2;
                    if (y2x.o(100L, this) != nm6Var) {
                        tocVar3 = tocVar2;
                        yocVar = yocVar2;
                        uoc uocVar2 = (uoc) tocVar3;
                        uocVar2.b(8, true, true);
                        int i122 = i5;
                        i = i6 + 1;
                        tocVar = uocVar2;
                        i2 = i122;
                        if (i < i2) {
                            return Unit.a;
                        }
                    }
                }
                return nm6Var;
            }
        }
    }
}
