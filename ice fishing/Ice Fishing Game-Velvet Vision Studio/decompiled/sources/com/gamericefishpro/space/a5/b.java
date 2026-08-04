package com.gamericefishpro.space.a5;

import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.l1;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.g5.p;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t0.g0;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.q1;
import com.gamericefishpro.space.z.u1;
import com.gamericefishpro.space.z4.o;
import com.gamericefishpro.space.z4.s;
import com.gamericefishpro.space.z4.u;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ b(com.gamericefishpro.space.z.i iVar, u1 u1Var, d1 d1Var, o1 o1Var) {
        this.d = 5;
        this.e = iVar;
        this.i = d1Var;
        this.v = o1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                u uVar = (u) this.e;
                final g gVar = (g) this.i;
                final Function1 function1 = (Function1) this.v;
                final a0 a0Var = new a0();
                s sVar = new s() { // from class: com.gamericefishpro.space.a5.d
                    @Override // com.gamericefishpro.space.z4.s
                    public final void j(u uVar2, o oVar) {
                        int i = f.a[oVar.ordinal()];
                        a0 a0Var2 = a0Var;
                        if (i == 1) {
                            a0Var2.d = function1.invoke(gVar);
                        } else {
                            if (i != 2) {
                                return;
                            }
                            com.gamericefishpro.space.e.h hVar = (com.gamericefishpro.space.e.h) a0Var2.d;
                            if (hVar != null) {
                                hVar.a();
                            }
                            a0Var2.d = null;
                        }
                    }
                };
                uVar.g().a(sVar);
                return new e(uVar, sVar, a0Var, 0);
            case 1:
                com.gamericefishpro.space.e1.d dVar = (com.gamericefishpro.space.e1.d) this.e;
                com.gamericefishpro.space.e1.i iVar = (com.gamericefishpro.space.e1.i) this.v;
                h0 h0Var = dVar.e;
                Object obj2 = this.i;
                if (!h0Var.b(obj2)) {
                    dVar.d.remove(obj2);
                    h0Var.m(obj2, iVar);
                    return new e(dVar, obj2, iVar, 1);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            case 2:
                com.gamericefishpro.space.f1.u uVar2 = (com.gamericefishpro.space.f1.u) this.e;
                k kVar = (k) this.i;
                p pVar = (p) this.v;
                uVar2.add(kVar);
                return new e(pVar, kVar, uVar2, 2);
            case 3:
                u uVar3 = (u) this.e;
                com.gamericefishpro.space.x7.c cVar = (com.gamericefishpro.space.x7.c) this.i;
                com.gamericefishpro.space.f1.u uVar4 = (com.gamericefishpro.space.f1.u) this.v;
                g0 DisposableEffect = (g0) obj;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                com.gamericefishpro.space.d.d dVar2 = new com.gamericefishpro.space.d.d(1, cVar, uVar4);
                uVar3.g().a(dVar2);
                return new l1(8, uVar3, dVar2);
            case 4:
                WebView webView = (WebView) this.e;
                com.gamericefishpro.space.f1.u uVar5 = (com.gamericefishpro.space.f1.u) this.i;
                com.gamericefishpro.space.v7.c cVar2 = (com.gamericefishpro.space.v7.c) this.v;
                Integer num = (Integer) obj;
                num.getClass();
                if (webView.equals(CollectionsKt.C(uVar5))) {
                    cVar2.invoke(num);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.z.i iVar2 = (com.gamericefishpro.space.z.i) this.e;
                d1 d1Var = (d1) this.i;
                o1 o1Var = (o1) this.v;
                float fFloatValue = ((Float) obj).floatValue();
                float f = iVar2.J ? 1.0f : -1.0f;
                q1 q1Var = iVar2.I;
                long jE = q1Var.e(q1Var.h(f * fFloatValue));
                q1 q1Var2 = o1Var.a;
                float fG = q1Var.g(q1Var.e(q1Var2.c(q1Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    d1Var.c(cancellationException);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
