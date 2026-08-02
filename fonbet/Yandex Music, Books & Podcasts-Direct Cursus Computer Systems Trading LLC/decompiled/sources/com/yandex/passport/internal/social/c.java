package com.yandex.passport.internal.social;

import android.os.Bundle;
import android.util.Log;
import defpackage.au7;
import defpackage.i4w;
import defpackage.jxw;
import defpackage.k5r;
import defpackage.lyw;
import defpackage.mxw;
import defpackage.oww;
import defpackage.po0;
import defpackage.qww;
import defpackage.rmd;
import defpackage.rww;
import defpackage.sww;
import defpackage.uww;
import defpackage.vgr;
import defpackage.wb5;
import defpackage.xy0;
import defpackage.y1g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class c implements rmd {
    public final /* synthetic */ GoogleNativeSocialAuthActivity a;

    public c(GoogleNativeSocialAuthActivity googleNativeSocialAuthActivity) {
        this.a = googleNativeSocialAuthActivity;
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        GoogleNativeSocialAuthActivity googleNativeSocialAuthActivity = this.a;
        uww uwwVar = googleNativeSocialAuthActivity.d;
        c cVar = googleNativeSocialAuthActivity.h;
        lyw lywVar = uwwVar.c;
        lywVar.getClass();
        y1g.G(cVar);
        synchronized (lywVar.i) {
            try {
                if (!lywVar.b.remove(cVar)) {
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + String.valueOf(cVar) + " not found");
                } else if (lywVar.g) {
                    lywVar.c.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uww uwwVar2 = this.a.d;
        mxw mxwVar = uwwVar2.d;
        boolean z = true;
        y1g.I("GoogleApiClient is not connected yet.", mxwVar != null && mxwVar.g());
        Integer num = uwwVar2.v;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        y1g.I("Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API", z);
        vgr vgrVar = new vgr(uwwVar2, 0);
        if (uwwVar2.o.containsKey(wb5.a)) {
            wb5.c.getClass();
            uwwVar2.b(new jxw(wb5.b, uwwVar2)).h(new rww(uwwVar2, vgrVar, false, uwwVar2));
        } else {
            AtomicReference atomicReference = new AtomicReference();
            oww owwVar = new oww(uwwVar2, atomicReference, vgrVar);
            qww qwwVar = new qww(vgrVar);
            au7 au7Var = new au7(uwwVar2.f);
            po0 po0Var = wb5.b;
            y1g.H(po0Var, "Api must not be null");
            ((xy0) au7Var.h).put(po0Var, null);
            i4w i4wVar = po0Var.a;
            y1g.H(i4wVar, "Base client builder must not be null");
            List I = i4wVar.I(null);
            ((HashSet) au7Var.c).addAll(I);
            ((HashSet) au7Var.b).addAll(I);
            ((ArrayList) au7Var.n).add(owwVar);
            ((ArrayList) au7Var.o).add(qwwVar);
            sww swwVar = uwwVar2.l;
            y1g.H(swwVar, "Handler must not be null");
            au7Var.k = swwVar.getLooper();
            uww d = au7Var.d();
            atomicReference.set(d);
            d.g();
        }
        vgrVar.h(this.a.i);
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
        NativeSocialHelper.onFailure(this.a, new Exception(k5r.i(i, "Connection suspended: status = ")));
    }
}
