package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class wch implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vdi b;
    public final /* synthetic */ adh c;

    public /* synthetic */ wch(adh adhVar, vdi vdiVar, int i) {
        this.a = i;
        this.c = adhVar;
        this.b = vdiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                adh adhVar = this.c;
                int t1 = ((LinearLayoutManager) adhVar.n.getLayoutManager()).t1() - 1;
                Calendar a = fut.a(this.b.d.a.a);
                a.add(2, t1);
                adhVar.x(new sdi(a));
                break;
            default:
                adh adhVar2 = this.c;
                int r1 = ((LinearLayoutManager) adhVar2.n.getLayoutManager()).r1() + 1;
                Calendar a2 = fut.a(this.b.d.a.a);
                a2.add(2, r1);
                adhVar2.x(new sdi(a2));
                break;
        }
    }
}
