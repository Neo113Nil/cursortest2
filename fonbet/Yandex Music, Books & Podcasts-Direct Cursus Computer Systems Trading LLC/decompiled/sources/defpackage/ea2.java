package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ea2 implements jic {
    public final fvf a;
    public final jic b;
    public final zya c;

    public ea2(fvf fvfVar, lic licVar, zya zyaVar) {
        licVar.getClass();
        this.a = fvfVar;
        this.b = licVar;
        this.c = zyaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        if (defpackage.fk0.c(r5, r11, r6, r10, r9, 4) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e1, code lost:
    
        if (r10.b(r11, r5, r12, r6, r9) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
    
        if (r5 == r4) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rwo rwoVar, float f, cg6 cg6Var) {
        da2 da2Var;
        int i;
        int h;
        Object a;
        final rwo rwoVar2 = rwoVar;
        float f2 = f;
        if (cg6Var instanceof da2) {
            da2Var = (da2) cg6Var;
            int i2 = da2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                da2Var.o = i2 - Integer.MIN_VALUE;
                da2 da2Var2 = da2Var;
                Object obj = da2Var2.m;
                nm6 nm6Var = nm6.a;
                i = da2Var2.o;
                zya zyaVar = this.c;
                fvf fvfVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    h = fvfVar.h();
                    if (h == 0 && f2 > 200.0f) {
                        cvf cvfVar = (cvf) CollectionsKt.firstOrNull(fvfVar.j().k);
                        if (cvfVar == null) {
                            return new Float(f2);
                        }
                        float f3 = -cvfVar.p;
                        float f4 = cvfVar.q - (((Number) zyaVar.invoke()).intValue() < 0 ? 0 : r16);
                        if (f4 > f3) {
                            final uqn uqnVar = new uqn();
                            uqnVar.a = f3;
                            fk0 a2 = vq2.a(f3);
                            a2.h(a2.f, new Float(f4));
                            Float f5 = new Float(f4);
                            b9r Q = weo.Q(0.0f, 400.0f, null, 5);
                            Float f6 = new Float(f2 <= 1000.0f ? f2 : 1000.0f);
                            final int i3 = 0;
                            Function1 function1 = new Function1() { // from class: ca2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    fk0 fk0Var = (fk0) obj2;
                                    switch (i3) {
                                        case 0:
                                            fk0Var.getClass();
                                            float floatValue = ((Number) fk0Var.e()).floatValue();
                                            uqn uqnVar2 = uqnVar;
                                            rwoVar2.a(floatValue - uqnVar2.a);
                                            uqnVar2.a = ((Number) fk0Var.e()).floatValue();
                                            break;
                                        default:
                                            fk0Var.getClass();
                                            float floatValue2 = ((Number) fk0Var.e()).floatValue();
                                            uqn uqnVar3 = uqnVar;
                                            rwoVar2.a(floatValue2 - uqnVar3.a);
                                            uqnVar3.a = ((Number) fk0Var.e()).floatValue();
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            da2Var2.j = null;
                            da2Var2.k = f2;
                            da2Var2.l = h;
                            da2Var2.o = 1;
                        }
                    }
                    da2Var2.j = rwoVar2;
                    da2Var2.k = f2;
                    da2Var2.l = h;
                    da2Var2.o = 2;
                    a = this.b.a(rwoVar2, f2, da2Var2);
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return new Float(0.0f);
                    }
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return new Float(0.0f);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = da2Var2.l;
                    f2 = da2Var2.k;
                    rwo rwoVar3 = da2Var2.j;
                    qgg.h0(obj);
                    h = i4;
                    rwoVar2 = rwoVar3;
                    a = obj;
                    float floatValue = ((Number) a).floatValue();
                    if (Math.abs(floatValue) > 1.0f) {
                        return new Float(floatValue);
                    }
                    if (fvfVar.h() != 0) {
                        return new Float(floatValue);
                    }
                    cvf cvfVar2 = (cvf) CollectionsKt.firstOrNull(fvfVar.j().k);
                    if (cvfVar2 == null) {
                        return new Float(floatValue);
                    }
                    float f7 = -cvfVar2.p;
                    float f8 = cvfVar2.q;
                    int intValue = ((Number) zyaVar.invoke()).intValue();
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    boolean z = h > 1 || Math.abs(f2) < 200.0f ? f7 > (f8 - ((float) intValue)) / ((float) 2) : f2 >= 0.0f;
                    float f9 = z ? f8 - intValue : 0.0f;
                    if (z && f9 <= f7) {
                        return new Float(0.0f);
                    }
                    final uqn uqnVar2 = new uqn();
                    uqnVar2.a = f7;
                    fk0 a3 = vq2.a(f7);
                    Float f10 = new Float(f9);
                    b9r Q2 = weo.Q(0.0f, 500.0f, null, 5);
                    final int i5 = 1;
                    Function1 function12 = new Function1() { // from class: ca2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            fk0 fk0Var = (fk0) obj2;
                            switch (i5) {
                                case 0:
                                    fk0Var.getClass();
                                    float floatValue2 = ((Number) fk0Var.e()).floatValue();
                                    uqn uqnVar22 = uqnVar2;
                                    rwoVar2.a(floatValue2 - uqnVar22.a);
                                    uqnVar22.a = ((Number) fk0Var.e()).floatValue();
                                    break;
                                default:
                                    fk0Var.getClass();
                                    float floatValue22 = ((Number) fk0Var.e()).floatValue();
                                    uqn uqnVar3 = uqnVar2;
                                    rwoVar2.a(floatValue22 - uqnVar3.a);
                                    uqnVar3.a = ((Number) fk0Var.e()).floatValue();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    da2Var2.j = null;
                    da2Var2.k = f2;
                    da2Var2.l = h;
                    da2Var2.o = 3;
                }
            }
        }
        da2Var = new da2(this, cg6Var);
        da2 da2Var22 = da2Var;
        Object obj2 = da2Var22.m;
        nm6 nm6Var2 = nm6.a;
        i = da2Var22.o;
        zya zyaVar2 = this.c;
        fvf fvfVar2 = this.a;
        if (i != 0) {
        }
    }
}
