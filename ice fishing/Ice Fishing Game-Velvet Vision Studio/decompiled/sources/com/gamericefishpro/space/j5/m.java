package com.gamericefishpro.space.j5;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.tb.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements OnBackAnimationCallback {
    public final /* synthetic */ k a;

    public m(k kVar) {
        this.a = kVar;
    }

    public final void onBackCancelled() {
        k input = this.a;
        s sVar = input.a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!input.b) {
            sVar.d(input, null);
        }
        Intrinsics.checkNotNullParameter(input, "input");
        g gVar = (g) sVar.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.equals(gVar.h) && -1 == gVar.g) {
            d dVarC = gVar.f;
            if (dVarC == null) {
                dVarC = gVar.c(-1);
            }
            gVar.f = null;
            gVar.g = 0;
            gVar.h = null;
            if (dVarC != null) {
                dVarC.a();
            }
            n0 n0Var = gVar.a;
            n0Var.getClass();
            n0Var.j(null, h.e);
        }
        input.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b latestEvent = com.gamericefishpro.space.i.a.j(backEvent);
        Intrinsics.checkNotNullParameter(latestEvent, "event");
        k input = this.a;
        s sVar = input.a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (input.b) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(latestEvent, "event");
            g gVar = (g) sVar.e;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(latestEvent, "event");
            if (input.equals(gVar.h) && -1 == gVar.g) {
                d dVarC = gVar.f;
                if (dVarC == null) {
                    dVarC = gVar.c(-1);
                }
                if (dVarC != null) {
                    Intrinsics.checkNotNullParameter(latestEvent, "event");
                    Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
                    dVarC.c(latestEvent);
                }
                n0 n0Var = gVar.a;
                i iVar = new i(latestEvent);
                n0Var.getClass();
                n0Var.j(null, iVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b event = com.gamericefishpro.space.i.a.j(backEvent);
        Intrinsics.checkNotNullParameter(event, "event");
        k kVar = this.a;
        s sVar = kVar.a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (kVar.b) {
            return;
        }
        sVar.d(kVar, event);
        kVar.b = true;
    }
}
