package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.yandex.passport.internal.ui.social.gimap.m;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.d;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class mj4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                gdh gdhVar = chip.j;
                if (gdhVar != null) {
                    dj4 dj4Var = (dj4) ((znk) gdhVar).b;
                    if (!z ? dj4Var.j(chip, dj4Var.b) : dj4Var.a(chip)) {
                        dj4Var.e();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 1:
                znk znkVar = ((x46) obj).f;
                if (znkVar != null) {
                    u46 u46Var = (u46) znkVar.b;
                    x46 x46Var = u46Var.a;
                    x46Var.e.h0(new dy1(x46Var, u46.a(u46Var), 1));
                    break;
                }
                break;
            case 2:
                ((sv4) ((jp0) obj).c).invoke(Boolean.valueOf(z));
                break;
            case 3:
                c3j c3jVar = (c3j) obj;
                g0c z2 = c3jVar.z();
                qne o = gut.o(z, zso.NEW_CARD_PAY, false);
                x60 x60Var = (x60) z2;
                x60Var.getClass();
                x60Var.a(o);
                ow3 ow3Var = (ow3) c3jVar.i.b;
                if (ow3Var != null) {
                    ow3Var.setSaveCardOnPayment(z);
                }
                if (c3jVar.p) {
                    LinearLayout linearLayout = ((shk) c3jVar.x()).a;
                    linearLayout.getClass();
                    View findViewById = c3jVar.requireView().getRootView().findViewById(R.id.container_layout);
                    findViewById.getClass();
                    qdq.a(linearLayout, (ViewGroup) findViewById);
                    ((shk) c3jVar.x()).c.setVisibility(z ? 8 : 0);
                    break;
                }
                break;
            case 4:
                xw3 xw3Var = (xw3) ((wom) obj).j.a;
                if (xw3Var != null) {
                    xw3Var.setSaveCardOnPayment(z);
                    break;
                }
                break;
            case 5:
                m mVar = (m) obj;
                mVar.s.setEnabled(mVar.N());
                break;
            default:
                d dVar = (d) obj;
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    dVar.d.invoke(Boolean.valueOf(z));
                    break;
                }
                break;
        }
    }
}
