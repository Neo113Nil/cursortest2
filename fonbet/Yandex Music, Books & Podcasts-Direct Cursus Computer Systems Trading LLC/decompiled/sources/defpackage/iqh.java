package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class iqh implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public iqh(zos zosVar) {
        this.c = zosVar;
        Context context = zosVar.a.getContext();
        CharSequence charSequence = zosVar.h;
        xf xfVar = new xf();
        xfVar.e = 4096;
        xfVar.g = 4096;
        xfVar.l = null;
        xfVar.m = null;
        xfVar.n = false;
        xfVar.o = false;
        xfVar.p = 16;
        xfVar.i = context;
        xfVar.a = charSequence;
        this.b = xfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jqh jqhVar = (jqh) this.c;
                lqh lqhVar = jqhVar.y.j;
                irh irhVar = (irh) this.b;
                lqhVar.n = irhVar;
                irhVar.l();
                jqhVar.v.setVisibility(4);
                jqhVar.w.setVisibility(0);
                break;
            default:
                zos zosVar = (zos) this.c;
                Window.Callback callback = zosVar.k;
                if (callback != null && zosVar.l) {
                    callback.onMenuItemSelected(0, (xf) this.b);
                    break;
                }
                break;
        }
    }

    public iqh(jqh jqhVar, irh irhVar) {
        this.c = jqhVar;
        this.b = irhVar;
    }
}
