package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* loaded from: classes.dex */
public final class j30 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j30(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.a) {
            case 0:
                k30 k30Var = (k30) this.c;
                DialogInterface.OnClickListener onClickListener = k30Var.q;
                n30 n30Var = (n30) this.b;
                onClickListener.onClick(n30Var.b, i);
                if (k30Var.s) {
                    return;
                }
                n30Var.b.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) this.b;
                tdi a = materialCalendarGridView.a();
                if (i < a.a() || i > a.c()) {
                    return;
                }
                if (materialCalendarGridView.a().getItem(i).longValue() >= ((adh) ((vdi) this.c).e.a).i.c.a) {
                    throw null;
                }
                return;
        }
    }
}
