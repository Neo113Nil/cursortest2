package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.exoplayer.mediacodec.RecoverType;
import androidx.media3.exoplayer.video.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes6.dex */
public final class rsb extends wp7 {
    public final Context e;
    public final boolean f;
    public final ngl g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final RecoverType k;
    public final nlr l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final hr4 q;
    public final tq4 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final h9w v;
    public final boolean w;

    public rsb(Context context, boolean z, ngl nglVar, boolean z2, boolean z3, int i, RecoverType recoverType, nlr nlrVar, String str, boolean z4, boolean z5, boolean z6, hr4 hr4Var, tq4 tq4Var, boolean z7, boolean z8, boolean z9, pd pdVar, h9w h9wVar, boolean z10) {
        super(context);
        this.e = context;
        this.f = z;
        this.g = nglVar;
        this.h = z2;
        this.i = z3;
        this.j = i;
        this.k = recoverType;
        this.l = nlrVar;
        this.m = str;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = hr4Var;
        this.r = tq4Var;
        this.s = z7;
        this.t = z8;
        this.u = z9;
        this.v = h9wVar;
        this.w = z10;
    }

    @Override // defpackage.wp7
    public final void c(Context context, rih rihVar, boolean z, gk7 gk7Var, Handler handler, fy1 fy1Var, ArrayList arrayList) {
        context.getClass();
        rihVar.getClass();
        super.c(context, rihVar, z, gk7Var, handler, fy1Var, arrayList);
        if (this.s) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((at2) it.next()) instanceof jih) {
                    break;
                } else {
                    i++;
                }
            }
            gih gihVar = this.t ? this.v : this.b;
            gihVar.getClass();
            arrayList.set(i, new jqb(context, gihVar, rihVar, z, handler, fy1Var, gk7Var, null));
        }
    }

    @Override // defpackage.wp7
    public final void d(Context context, nds ndsVar, Looper looper, ArrayList arrayList) {
        context.getClass();
        looper.getClass();
        ArrayList arrayList2 = new ArrayList();
        super.d(context, ndsVar, looper, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            at2 at2Var = (at2) it.next();
            tds tdsVar = at2Var instanceof tds ? (tds) at2Var : null;
            if (tdsVar != null) {
                tdsVar.K = true;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add((at2) it2.next());
        }
    }

    @Override // defpackage.wp7
    public final void e(Context context, rih rihVar, boolean z, Handler handler, ccu ccuVar, ArrayList arrayList) {
        List split$default;
        context.getClass();
        rihVar.getClass();
        super.e(context, rihVar, z, handler, ccuVar, arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((at2) it.next()) instanceof a) {
                break;
            } else {
                i++;
            }
        }
        kqb kqbVar = new kqb(context, this.v, rihVar, z, handler, ccuVar, this.f, new zot(this.h, this.i), this.g, null);
        qq4 qq4Var = new qq4(this.j, this.k);
        Log.d("ExoRenderersFactory", "codec error recover options = " + qq4Var);
        kqbVar.o1 = qq4Var;
        split$default = StringsKt__StringsKt.split$default(this.m, new String[]{StringUtils.COMMA}, false, 0, 6, null);
        List list = split$default;
        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(StringsKt.t0((String) it2.next()).toString());
        }
        kqbVar.y0 = arrayList2.contains("amlogic");
        kqbVar.B0 = arrayList2.contains("amlogic2");
        nlr nlrVar = this.l;
        if (nlrVar != null) {
            kqbVar.q1 = nlrVar;
        }
        kqbVar.e2 = this.n;
        kqbVar.l1 = this.o;
        hr4 hr4Var = this.q;
        if (hr4Var != null) {
            kqbVar.O0 = hr4Var;
        }
        tq4 tq4Var = this.r;
        if (tq4Var != null) {
            kqbVar.m1 = tq4Var;
        }
        kqbVar.g2 = this.w;
        arrayList.set(i, kqbVar);
    }
}
