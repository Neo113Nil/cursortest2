package B0;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.MaterialCalendar;
import h.C0164e;
import k.AbstractC0177a;
import m.X0;

/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59b;

    public /* synthetic */ l(int i, Object obj) {
        this.f58a = i;
        this.f59b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f58a) {
            case 0:
                q qVar = (q) this.f59b;
                if (qVar.j && qVar.isShowing()) {
                    if (!qVar.f71l) {
                        TypedArray obtainStyledAttributes = qVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        qVar.f70k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        qVar.f71l = true;
                    }
                    if (qVar.f70k) {
                        qVar.cancel();
                        break;
                    }
                }
                break;
            case 1:
                l.o itemData = ((N0.d) view).getItemData();
                A0.b bVar = (A0.b) this.f59b;
                if (!bVar.f676E.q(itemData, bVar.f675D, 0)) {
                    itemData.setChecked(true);
                    break;
                }
                break;
            case 2:
                MaterialCalendar materialCalendar = (MaterialCalendar) this.f59b;
                int i = materialCalendar.f2469a0;
                if (i != 2) {
                    if (i == 1) {
                        materialCalendar.N(2);
                        break;
                    }
                } else {
                    materialCalendar.N(1);
                    break;
                }
                break;
            case 3:
                C0164e c0164e = (C0164e) this.f59b;
                Button button = c0164e.f3191f;
                c0164e.f3205v.obtainMessage(1, c0164e.f3188b).sendToTarget();
                break;
            case 4:
                ((AbstractC0177a) this.f59b).a();
                break;
            default:
                X0 x02 = ((Toolbar) this.f59b).f1856L;
                l.o oVar = x02 == null ? null : x02.f3902b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
