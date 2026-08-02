package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* loaded from: classes10.dex */
public final class rc2 implements pjy0 {
    public final sc2 a;
    public final pc2 b;
    public final pc2 c;
    public final View d;

    public rc2(sc2 sc2Var, pc2 pc2Var, pc2 pc2Var2, View view) {
        this.a = sc2Var;
        this.b = pc2Var;
        this.c = pc2Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        zky0 zky0Var = (zky0) this.b.invoke();
        int i2 = 0;
        if (jl40.l(zky0Var, null)) {
            return false;
        }
        menu.clear();
        List list = zky0Var.a;
        int size = list.size();
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            yky0 yky0Var = (yky0) list.get(i3);
            if (yky0Var instanceof hly0) {
                i = i4 + 1;
                Object obj = yky0Var.a;
                hly0 hly0Var = (hly0) yky0Var;
                MenuItem add = menu.add(i5, jl40.l(obj, b4a1.a) ? R.id.cut : jl40.l(obj, b4a1.b) ? R.id.copy : jl40.l(obj, b4a1.c) ? R.id.paste : jl40.l(obj, b4a1.d) ? R.id.selectAll : jl40.l(obj, b4a1.e) ? R.id.autofill : i4, i4, hly0Var.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new qc2(i2, hly0Var, this));
            } else if (yky0Var instanceof mly0) {
                i = i4 + 1;
                Context context = this.d.getContext();
                mly0 mly0Var = (mly0) yky0Var;
                TextClassification textClassification = mly0Var.b;
                int i6 = mly0Var.c;
                if (i6 < 0) {
                    MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                    add2.setShowAsAction(2);
                    add2.setIcon(textClassification.getIcon());
                    add2.setOnMenuItemClickListener(new qc2(r11, context, textClassification));
                } else {
                    int i7 = i6 == 0 ? 1 : i2;
                    RemoteAction remoteAction = textClassification.getActions().get(i6);
                    MenuItem add3 = menu.add(R.id.textAssist, i7 != 0 ? 16908353 : i2, i4, remoteAction.getTitle());
                    add3.setShowAsAction(i7 == 0 ? 0 : 2);
                    if (i7 != 0 || remoteAction.shouldShowIcon()) {
                        add3.setIcon(remoteAction.getIcon().loadDrawable(context));
                    }
                    add3.setOnMenuItemClickListener(new h710(1, remoteAction));
                }
            } else {
                if (yky0Var instanceof kly0) {
                    i5++;
                }
                i3++;
                i2 = 0;
            }
            i4 = i;
            i3++;
            i2 = 0;
        }
        return true;
    }
}
