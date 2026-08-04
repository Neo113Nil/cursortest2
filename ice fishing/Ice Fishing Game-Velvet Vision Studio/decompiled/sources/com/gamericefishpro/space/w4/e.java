package com.gamericefishpro.space.w4;

import android.content.DialogInterface;
import com.gamericefishpro.space.ka.a0;
import com.gamericefishpro.space.tb.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e extends g implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final d E;
    public final boolean F;
    public int G;
    public boolean H;
    public boolean I;

    public e() {
        new com.gamericefishpro.space.h4.b(26, this);
        new c(this);
        this.E = new d(this);
        this.F = true;
        this.G = -1;
        new u(22, this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.H) {
            return;
        }
        if (a0.l(3)) {
            toString();
        }
        if (this.I) {
            return;
        }
        this.I = true;
        this.H = true;
        if (this.G >= 0) {
            a0 a0VarH = h();
            int i = this.G;
            if (i < 0) {
                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Bad id: "));
            }
            synchronized (((ArrayList) a0VarH.c)) {
            }
            this.G = -1;
            return;
        }
        a aVar = new a(h());
        l lVar = new l();
        lVar.a = 3;
        lVar.b = this;
        lVar.c = false;
        com.gamericefishpro.space.z4.p pVar = com.gamericefishpro.space.z4.p.w;
        aVar.a.add(lVar);
        lVar.d = 0;
        lVar.e = 0;
        lVar.f = 0;
        lVar.g = 0;
        aVar.a(true);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
