package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l7o {
    public final TextView a;
    public String b;
    public final View c;
    public final mmo d;
    public final List e;

    public l7o(View view, TextView textView, mmo mmoVar, List list) {
        view.getClass();
        textView.getClass();
        mmoVar.getClass();
        list.getClass();
        textView.getClass();
        this.a = textView;
        this.b = null;
        this.c = view;
        this.d = mmoVar;
        this.e = list;
        b6n b6nVar = new b6n(22, this);
        axj[] axjVarArr = axj.a;
        view.setImportantForAccessibility(1);
        view.setAccessibilityDelegate(new fb(0, b6nVar));
    }

    public final void a(int i) {
        this.c.setVisibility(i);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((m7o) it.next()).a.setVisibility(i);
        }
    }
}
