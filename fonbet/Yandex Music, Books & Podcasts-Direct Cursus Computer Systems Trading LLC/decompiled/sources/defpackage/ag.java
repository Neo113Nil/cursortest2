package defpackage;

import android.content.Context;
import android.view.View;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ag extends ayh {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ dg m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(dg dgVar, Context context, tmr tmrVar, View view) {
        super(context, tmrVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = dgVar;
        if ((tmrVar.A.x & 32) != 32) {
            View view2 = dgVar.i;
            this.e = view2 == null ? (View) dgVar.h : view2;
        }
        ozw ozwVar = dgVar.w;
        this.h = ozwVar;
        yxh yxhVar = this.i;
        if (yxhVar != null) {
            yxhVar.d(ozwVar);
        }
    }

    @Override // defpackage.ayh
    public final void c() {
        switch (this.l) {
            case 0:
                this.m.t = null;
                super.c();
                break;
            default:
                dg dgVar = this.m;
                hxh hxhVar = dgVar.c;
                if (hxhVar != null) {
                    hxhVar.c(true);
                }
                dgVar.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(dg dgVar, Context context, hxh hxhVar, View view) {
        super(context, hxhVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = dgVar;
        this.f = 8388613;
        ozw ozwVar = dgVar.w;
        this.h = ozwVar;
        yxh yxhVar = this.i;
        if (yxhVar != null) {
            yxhVar.d(ozwVar);
        }
    }
}
