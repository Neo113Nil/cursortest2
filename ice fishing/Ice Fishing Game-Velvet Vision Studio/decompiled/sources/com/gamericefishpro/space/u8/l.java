package com.gamericefishpro.space.u8;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends w {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, v vVar, com.gamericefishpro.space.s8.b bVar) {
        super(vVar);
        this.d = nVar;
        this.c = bVar;
    }

    @Override // com.gamericefishpro.space.u8.w
    public final void a() {
        com.gamericefishpro.space.v8.j o0Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((n) obj).v.e((com.gamericefishpro.space.s8.b) obj2);
                break;
            default:
                r rVar = (r) obj2;
                com.gamericefishpro.space.p9.g gVar = (com.gamericefishpro.space.p9.g) obj;
                if (rVar.j(0)) {
                    com.gamericefishpro.space.s8.b bVar = gVar.e;
                    if (bVar.c()) {
                        com.gamericefishpro.space.v8.w wVar = gVar.i;
                        com.gamericefishpro.space.v8.c0.g(wVar);
                        com.gamericefishpro.space.s8.b bVar2 = wVar.i;
                        if (!bVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            rVar.e(bVar2);
                        } else {
                            rVar.G = true;
                            IBinder iBinder = wVar.e;
                            if (iBinder == null) {
                                o0Var = null;
                            } else {
                                int i2 = com.gamericefishpro.space.v8.a.e;
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                o0Var = iInterfaceQueryLocalInterface instanceof com.gamericefishpro.space.v8.j ? (com.gamericefishpro.space.v8.j) iInterfaceQueryLocalInterface : new com.gamericefishpro.space.v8.o0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                            }
                            com.gamericefishpro.space.v8.c0.g(o0Var);
                            rVar.H = o0Var;
                            rVar.I = wVar.v;
                            rVar.J = wVar.w;
                            rVar.h();
                        }
                    } else if (rVar.E && !bVar.b()) {
                        rVar.a();
                        rVar.h();
                    } else {
                        rVar.e(bVar);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, r rVar2, com.gamericefishpro.space.p9.g gVar) {
        super(rVar);
        this.c = rVar2;
        this.d = gVar;
    }
}
