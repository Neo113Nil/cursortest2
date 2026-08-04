package com.gamericefishpro.space.d5;

import android.view.View;
import com.gamericefishpro.space.a5.h;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.t0.a0;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final a0 a = new a0(new h(7));

    public static y0 a(r rVar) {
        y0 y0VarF = (y0) rVar.j(a);
        if (y0VarF == null) {
            rVar.a0(1260197608);
            y0VarF = m0.f((View) rVar.j(j0.f));
        } else {
            rVar.a0(1260196492);
        }
        rVar.p(false);
        return y0VarF;
    }
}
