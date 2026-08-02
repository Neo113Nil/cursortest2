package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.video.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class wp7 implements mxn {
    public final Context a;
    public final vg0 b;
    public boolean c;
    public rih d = rih.m0;

    public wp7(Context context) {
        this.a = context;
        this.b = new vg0(context, false);
    }

    @Override // defpackage.mxn
    public final at2[] a(Handler handler, ccu ccuVar, fy1 fy1Var, nds ndsVar, c3i c3iVar) {
        ArrayList arrayList = new ArrayList();
        e(this.a, this.d, this.c, handler, ccuVar, arrayList);
        Context context = this.a;
        gk7 d = new jp0(context).d();
        c(this.a, this.d, this.c, d, handler, fy1Var, arrayList);
        d(context, ndsVar, handler.getLooper(), arrayList);
        Looper looper = handler.getLooper();
        arrayList.add(new e3i(c3iVar, looper));
        arrayList.add(new e3i(c3iVar, looper));
        arrayList.add(new ht3());
        arrayList.add(new kce(gbe.j0));
        return (at2[]) arrayList.toArray(new at2[0]);
    }

    @Override // defpackage.mxn
    public final void b(at2 at2Var) {
        int i = at2Var.b;
    }

    public void c(Context context, rih rihVar, boolean z, gk7 gk7Var, Handler handler, fy1 fy1Var, ArrayList arrayList) {
        arrayList.add(new jih(context, this.b, rihVar, z, handler, fy1Var, gk7Var));
    }

    public void d(Context context, nds ndsVar, Looper looper, ArrayList arrayList) {
        arrayList.add(new tds(ndsVar, looper));
    }

    public void e(Context context, rih rihVar, boolean z, Handler handler, ccu ccuVar, ArrayList arrayList) {
        bkh bkhVar = new bkh(context);
        bkhVar.d = this.b;
        bkhVar.c = rihVar;
        bkhVar.e = 5000L;
        bkhVar.f = z;
        bkhVar.g = handler;
        bkhVar.h = ccuVar;
        bkhVar.i = 50;
        vq1.A(!bkhVar.b);
        Handler handler2 = bkhVar.g;
        vq1.A((handler2 == null && bkhVar.h == null) || !(handler2 == null || bkhVar.h == null));
        bkhVar.b = true;
        arrayList.add(new a(bkhVar));
    }
}
