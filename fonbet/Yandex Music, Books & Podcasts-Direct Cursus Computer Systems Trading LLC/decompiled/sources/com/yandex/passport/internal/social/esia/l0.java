package com.yandex.passport.internal.social.esia;

import com.yandex.passport.internal.ui.sloth.ebs.f1;
import com.yandex.passport.internal.ui.sloth.ebs.g1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import defpackage.bfu;
import defpackage.eir;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class l0 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public l0(String str, com.yandex.plus.bdui.plus.content.controller.f fVar, rjc rjcVar) {
        this.a = 2;
        this.c = str;
        this.d = fVar;
        this.b = rjcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r3.emit((java.lang.String) r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r3.emit(null, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(d5 d5Var, Continuation continuation) {
        com.yandex.plus.home.feature.webviews.internal.h hVar;
        int i;
        Object Q;
        if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.h) {
            hVar = (com.yandex.plus.home.feature.webviews.internal.h) continuation;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                rjc rjcVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((String) this.c).equals(d5Var.b)) {
                        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i iVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i(d5Var.a, d5Var.c, d5Var.d);
                        com.yandex.passport.internal.core.accounts.h hVar2 = (com.yandex.passport.internal.core.accounts.h) ((com.yandex.plus.bdui.plus.content.controller.f) this.d).b;
                        hVar.l = 1;
                        Q = hVar2.Q(iVar, hVar);
                    } else {
                        hVar.l = 3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Q = ((z7o) obj).a;
                r7o r7oVar = z7o.b;
                Object obj2 = Q instanceof t7o ? null : Q;
                hVar.l = 2;
            }
        }
        hVar = new com.yandex.plus.home.feature.webviews.internal.h(this, continuation);
        Object obj3 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        rjc rjcVar2 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        k0 k0Var;
        int i;
        f1 f1Var;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof k0) {
                    k0Var = (k0) continuation;
                    int i3 = k0Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k0Var.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = k0Var.j;
                        nm6 nm6Var = nm6.a;
                        i = k0Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            a0 a0Var = (a0) ((eir) this.c).getValue();
                            ((n0) this.d).l.b("KEY_STATE", a0Var);
                            e0 e0Var = a0Var.b;
                            k0Var.k = 1;
                            if (this.b.emit(e0Var, k0Var) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                        }
                        return Unit.a;
                    }
                }
                k0Var = new k0(this, continuation);
                Object obj22 = k0Var.j;
                nm6 nm6Var2 = nm6.a;
                i = k0Var.k;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (continuation instanceof f1) {
                    f1Var = (f1) continuation;
                    int i4 = f1Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        f1Var.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = f1Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = f1Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            com.yandex.passport.internal.ui.sloth.ebs.s0 s0Var = (com.yandex.passport.internal.ui.sloth.ebs.s0) ((eir) this.c).getValue();
                            ((g1) this.d).m.b("KEY_EBS_STATE", s0Var);
                            f1Var.k = 1;
                            if (this.b.emit(s0Var, f1Var) == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                        }
                        return Unit.a;
                    }
                }
                f1Var = new f1(this, continuation);
                Object obj32 = f1Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = f1Var.k;
                if (i2 != 0) {
                }
                return Unit.a;
            default:
                return b((d5) obj, continuation);
        }
    }

    public /* synthetic */ l0(rjc rjcVar, eir eirVar, bfu bfuVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = eirVar;
        this.d = bfuVar;
    }
}
