package yads;

import android.content.Context;
import defpackage.jk81;
import defpackage.jp71;
import defpackage.nb71;
import defpackage.ny61;
import defpackage.r181;
import defpackage.sls;
import defpackage.tse;
import defpackage.v981;
import defpackage.wls;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ht2 extends Lambda implements sls {
    public final /* synthetic */ jp71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht2(jp71 jp71Var) {
        super(0);
        this.b = jp71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        jp71 jp71Var = this.b;
        if (jk81.d == null) {
            synchronized (jk81.c) {
                if (jk81.d == null) {
                    jk81.d = new jk81();
                }
            }
        }
        jk81 jk81Var = jk81.d;
        if (jk81Var == null) {
            ny61.g("Required value was null.");
            return null;
        }
        wls[] wlsVarArr = {null};
        yw0 yw0Var = yw0.d;
        Context context = jp71Var.a;
        v981 v981Var = jp71Var.b;
        tse tseVar = jp71Var.c;
        nb71 nb71Var = new nb71(jp71Var.c, b.i(new Pair(yw0Var, new r181(context, v981Var, jk81Var, tseVar, new ie0(wlsVarArr), 0)), new Pair(yw0.e, new r181(context, v981Var, jk81Var, tseVar, new je0(wlsVarArr), 1)), new Pair(yw0.f, new r181(context, v981Var, jk81Var, tseVar, new ke0(wlsVarArr), 2))));
        wlsVarArr[0] = new he0(2, nb71Var, nb71.class, "preload", "preload(Lcom/monetization/ads/common/AdRequestData;Lcom/monetization/ads/fullscreen/cache/FullscreenFormat;)V", 0);
        return nb71Var;
    }
}
