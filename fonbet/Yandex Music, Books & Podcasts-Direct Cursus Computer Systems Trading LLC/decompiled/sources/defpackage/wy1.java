package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class wy1 implements rjc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public wy1(rjc rjcVar, xy1 xy1Var, int i) {
        this.c = rjcVar;
        this.d = xy1Var;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x016d, code lost:
    
        if (r11.emit(r13, r3) == r7) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        vy1 vy1Var;
        int i;
        rjc rjcVar;
        dxa dxaVar;
        int i2;
        int i3;
        rjc rjcVar2;
        int i4;
        rjc rjcVar3;
        yy1 yy1Var;
        ilc ilcVar;
        int i5;
        int i6 = this.a;
        int i7 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i6) {
            case 0:
                xy1 xy1Var = (xy1) obj2;
                if (continuation instanceof vy1) {
                    vy1Var = (vy1) continuation;
                    int i8 = vy1Var.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        vy1Var.k = i8 - Integer.MIN_VALUE;
                        Object obj4 = vy1Var.j;
                        nm6 nm6Var = nm6.a;
                        i = vy1Var.k;
                        int i9 = 3;
                        yy1 yy1Var2 = yy1.e;
                        int i10 = 0;
                        if (i != 0) {
                            qgg.h0(obj4);
                            rjcVar = (rjc) obj3;
                            ByteBuffer byteBuffer = (ByteBuffer) obj;
                            if (byteBuffer.remaining() != 0) {
                                try {
                                    ByteBuffer byteBuffer2 = xy1.h;
                                    dxaVar = (dxa) xy1Var.b.getValue();
                                    vy1Var.m = rjcVar;
                                    vy1Var.n = dxaVar;
                                    vy1Var.o = 0;
                                    vy1Var.p = 0;
                                    vy1Var.k = 1;
                                    obj4 = sk3.S(g.a, new ap1(i9, byteBuffer, xy1Var), vy1Var);
                                    if (obj4 != nm6Var) {
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                } catch (zdh e) {
                                    e = e;
                                    rjcVar2 = null;
                                    ssg.a(6, null, "fft process error", e);
                                    vy1Var.m = rjcVar2;
                                    vy1Var.n = rjcVar2;
                                    vy1Var.o = i10;
                                    vy1Var.k = 3;
                                }
                                return nm6Var;
                            }
                            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                            rjcVar2 = null;
                            vy1Var.m = rjcVar2;
                            vy1Var.n = rjcVar2;
                            vy1Var.o = i10;
                            vy1Var.k = 3;
                        } else if (i == 1) {
                            i2 = vy1Var.p;
                            i3 = vy1Var.o;
                            dxaVar = (dxa) vy1Var.n;
                            rjcVar = vy1Var.m;
                            try {
                                qgg.h0(obj4);
                            } catch (zdh e2) {
                                e = e2;
                                i10 = i3;
                                rjcVar2 = null;
                                ssg.a(6, null, "fft process error", e);
                                vy1Var.m = rjcVar2;
                                vy1Var.n = rjcVar2;
                                vy1Var.o = i10;
                                vy1Var.k = 3;
                            }
                        } else if (i == 2) {
                            i4 = vy1Var.o;
                            yy1Var = (yy1) vy1Var.n;
                            rjcVar3 = vy1Var.m;
                            qgg.h0(obj4);
                            i10 = i4;
                            yy1Var2 = yy1Var;
                            rjcVar = rjcVar3;
                            rjcVar2 = null;
                            vy1Var.m = rjcVar2;
                            vy1Var.n = rjcVar2;
                            vy1Var.o = i10;
                            vy1Var.k = 3;
                            break;
                        } else {
                            if (i == 3) {
                                qgg.h0(obj4);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yy1 yy1Var3 = (yy1) obj4;
                        dxaVar.getClass();
                        yy1Var3.getClass();
                        yy1 yy1Var4 = new yy1(dxaVar.a.a(yy1Var3.a), dxaVar.b.a(yy1Var3.b), 0.0f, dxaVar.c.a(yy1Var3.d));
                        if (!xy1Var.e.compareAndSet(true, false)) {
                            msa msaVar = nsa.b;
                            long M = yd5.M(i7, ssa.MILLISECONDS);
                            vy1Var.m = rjcVar;
                            vy1Var.n = yy1Var4;
                            vy1Var.o = i3;
                            vy1Var.p = i2;
                            vy1Var.k = 2;
                            if (y2x.p(M, vy1Var) != nm6Var) {
                                i4 = i3;
                                rjcVar3 = rjcVar;
                                yy1Var = yy1Var4;
                                i10 = i4;
                                yy1Var2 = yy1Var;
                                rjcVar = rjcVar3;
                                rjcVar2 = null;
                                vy1Var.m = rjcVar2;
                                vy1Var.n = rjcVar2;
                                vy1Var.o = i10;
                                vy1Var.k = 3;
                            }
                            return nm6Var;
                        }
                        i10 = i3;
                        yy1Var2 = yy1Var4;
                        rjcVar2 = null;
                        vy1Var.m = rjcVar2;
                        vy1Var.n = rjcVar2;
                        vy1Var.o = i10;
                        vy1Var.k = 3;
                    }
                }
                vy1Var = new vy1(this, continuation);
                Object obj42 = vy1Var.j;
                nm6 nm6Var2 = nm6.a;
                i = vy1Var.k;
                int i92 = 3;
                yy1 yy1Var22 = yy1.e;
                int i102 = 0;
                if (i != 0) {
                }
                yy1 yy1Var32 = (yy1) obj42;
                dxaVar.getClass();
                yy1Var32.getClass();
                yy1 yy1Var42 = new yy1(dxaVar.a.a(yy1Var32.a), dxaVar.b.a(yy1Var32.b), 0.0f, dxaVar.c.a(yy1Var32.d));
                if (!xy1Var.e.compareAndSet(true, false)) {
                }
            case 1:
                if (continuation instanceof ilc) {
                    ilcVar = (ilc) continuation;
                    int i11 = ilcVar.l;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ilcVar.l = i11 - Integer.MIN_VALUE;
                        Object obj5 = ilcVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i5 = ilcVar.l;
                        if (i5 != 0) {
                            qgg.h0(obj5);
                            vqn vqnVar = (vqn) obj2;
                            int i12 = vqnVar.a;
                            if (i12 >= i7) {
                                ilcVar.l = 1;
                                if (((rjc) obj3).emit(obj, ilcVar) == nm6Var3) {
                                    return nm6Var3;
                                }
                            } else {
                                vqnVar.a = i12 + 1;
                            }
                        } else {
                            if (i5 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj5);
                        }
                        return Unit.a;
                    }
                }
                ilcVar = new ilc(this, continuation);
                Object obj52 = ilcVar.j;
                nm6 nm6Var32 = nm6.a;
                i5 = ilcVar.l;
                if (i5 != 0) {
                }
                return Unit.a;
            default:
                Pair pair = (Pair) obj;
                suf.c((suf) obj3, (jvf) pair.a, (List) pair.b, this.b, 0, (Function1) obj2);
                return Unit.a;
        }
    }

    public wy1(suf sufVar, int i, Function1 function1) {
        this.c = sufVar;
        this.b = i;
        this.d = function1;
    }

    public wy1(vqn vqnVar, int i, rjc rjcVar) {
        this.d = vqnVar;
        this.b = i;
        this.c = rjcVar;
    }
}
