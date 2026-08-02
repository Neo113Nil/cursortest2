package defpackage;

import android.graphics.drawable.BitmapDrawable;
import defpackage.zji0;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes6.dex */
public final class zji0 extends lys {
    public static final /* synthetic */ int U = 0;
    public final /* synthetic */ int S = 1;
    public final wls T;

    public zji0(bvw0 bvw0Var, wls wlsVar) {
        super(bvw0Var);
        this.T = wlsVar;
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.S) {
        }
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                this.T.invoke((zo31) obj2, obj);
                break;
            default:
                final otq otqVar = (otq) obj;
                bvw0 bvw0Var = (bvw0) ((zo31) obj2);
                ListItemCheckComponent listItemCheckComponent = bvw0Var.b;
                String str = otqVar.b;
                boolean z = otqVar.e;
                listItemCheckComponent.setTitle(str);
                ListItemCheckComponent listItemCheckComponent2 = bvw0Var.b;
                listItemCheckComponent2.setChecked(otqVar.d);
                listItemCheckComponent2.setCheckedChangeListener(new pry() { // from class: ru.yandex.taxi.surge.dialog.price_complain.b
                    @Override // defpackage.pry
                    public final void a(boolean z2) {
                        ((SurgePriceComplainModalView$feedBackOptionsAdapter$1) zji0.this.T).invoke(otqVar.a, Boolean.valueOf(z2));
                    }
                });
                BitmapDrawable bitmapDrawable = otqVar.c;
                if (bitmapDrawable != null) {
                    listItemCheckComponent2.setLeadImage(bitmapDrawable);
                } else {
                    listItemCheckComponent2.setLeadImage(e1h0.ic_coinsfill);
                }
                listItemCheckComponent2.setEnabled(z);
                if (!z) {
                    listItemCheckComponent2.trailFrame.setAlpha(0.5f);
                    break;
                } else {
                    listItemCheckComponent2.trailFrame.setAlpha(1.0f);
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zji0(wls wlsVar, zo31 zo31Var) {
        super(zo31Var);
        this.T = wlsVar;
    }
}
