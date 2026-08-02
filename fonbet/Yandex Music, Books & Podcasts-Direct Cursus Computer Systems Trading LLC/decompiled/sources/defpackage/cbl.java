package defpackage;

import android.view.View;
import com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.d;

/* loaded from: classes.dex */
public final /* synthetic */ class cbl implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cbl(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dbl dblVar = (dbl) this.c;
                nbl nblVar = dblVar.g;
                int i = dblVar.f;
                int i2 = this.b;
                if (i2 != i) {
                    nblVar.setPlaybackSpeed(dblVar.e[i2]);
                }
                nblVar.k.dismiss();
                break;
            default:
                d dVar = (d) this.c;
                boolean z = !dVar.t().isChecked();
                dVar.t().setChecked(z);
                dVar.u.invoke(Integer.valueOf(this.b), Boolean.valueOf(z));
                break;
        }
    }
}
