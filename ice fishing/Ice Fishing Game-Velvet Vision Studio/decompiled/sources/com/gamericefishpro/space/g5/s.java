package com.gamericefishpro.space.g5;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.v.j0;
import com.gamericefishpro.space.v.k0;
import com.gamericefishpro.space.v.p0;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ v0 e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s(com.gamericefishpro.space.t.b0 b0Var, i iVar, Function1 function1, Function1 function2, Function1 function3, s2 s2Var, v0 v0Var) {
        this.i = b0Var;
        this.v = iVar;
        this.w = function1;
        this.y = function2;
        this.z = function3;
        this.A = s2Var;
        this.e = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.A;
        Object obj3 = this.z;
        v0 v0Var = this.e;
        Object obj4 = this.y;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t.b0 b0Var = (com.gamericefishpro.space.t.b0) obj7;
                i iVar = (i) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function2 = (Function1) obj4;
                Function1 function3 = (Function1) obj3;
                com.gamericefishpro.space.v.q qVar = (com.gamericefishpro.space.v.q) obj;
                float f = 0.0f;
                if (!((List) ((s2) obj2).getValue()).contains(qVar.a())) {
                    j0 j0Var = j0.b;
                    k0 k0Var = k0.b;
                    int i2 = com.gamericefishpro.space.v.h.b;
                    return new com.gamericefishpro.space.v.x(j0Var, k0Var, 0.0f, new p0(com.gamericefishpro.space.v.g.d));
                }
                String str = ((com.gamericefishpro.space.f5.k) qVar.a()).y;
                int iB = b0Var.b(str);
                if (iB >= 0) {
                    f = b0Var.c[iB];
                } else {
                    b0Var.d(str, 0.0f);
                }
                if (!Intrinsics.a(((com.gamericefishpro.space.f5.k) qVar.c()).y, ((com.gamericefishpro.space.f5.k) qVar.a()).y)) {
                    f = (((Boolean) iVar.c.getValue()).booleanValue() || ((Boolean) v0Var.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                b0Var.d(((com.gamericefishpro.space.f5.k) qVar.c()).y, f);
                return new com.gamericefishpro.space.v.x((j0) function1.invoke(qVar), (k0) function2.invoke(qVar), f, (p0) function3.invoke(qVar));
            default:
                String strDecode = (String) obj5;
                com.gamericefishpro.space.v7.i iVar2 = (com.gamericefishpro.space.v7.i) obj4;
                Context ctx = (Context) obj;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                FrameLayout frameLayout = new FrameLayout(ctx);
                WebView webViewA = ((com.gamericefishpro.space.x7.f) obj7).a(ctx, (com.gamericefishpro.space.f1.u) obj6, frameLayout, new com.gamericefishpro.space.v7.c(iVar2, 1), new com.gamericefishpro.space.d0.w(frameLayout, v0Var, (com.gamericefishpro.space.e.q) obj3), new com.gamericefishpro.space.e.e(11, iVar2, (Function0) obj2));
                try {
                    strDecode = URLDecoder.decode(strDecode, "UTF-8");
                    break;
                } catch (Exception unused) {
                }
                webViewA.loadUrl(com.gamericefishpro.space.m5.a.u("https://icegamerfishingpro.online/profish_onboarding?", strDecode), l0.b(new Pair("X-Requested-With", "")));
                return frameLayout;
        }
    }

    public /* synthetic */ s(com.gamericefishpro.space.x7.f fVar, com.gamericefishpro.space.f1.u uVar, String str, com.gamericefishpro.space.v7.i iVar, v0 v0Var, com.gamericefishpro.space.e.q qVar, Function0 function0) {
        this.i = fVar;
        this.v = uVar;
        this.w = str;
        this.y = iVar;
        this.e = v0Var;
        this.z = qVar;
        this.A = function0;
    }
}
