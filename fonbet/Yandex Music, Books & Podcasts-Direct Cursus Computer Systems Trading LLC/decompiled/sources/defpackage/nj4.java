package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public final class nj4 extends ixf {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nj4(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ixf
    public final void C(int i) {
        switch (this.d) {
            case 0:
                break;
            default:
                las lasVar = (las) this.e;
                lasVar.e = true;
                kas kasVar = (kas) lasVar.f.get();
                if (kasVar != null) {
                    kasVar.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ixf
    public final void D(Typeface typeface, boolean z) {
        switch (this.d) {
            case 0:
                Chip chip = (Chip) this.e;
                qj4 qj4Var = chip.e;
                chip.setText(qj4Var.s1 ? qj4Var.Z : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    las lasVar = (las) this.e;
                    lasVar.e = true;
                    kas kasVar = (kas) lasVar.f.get();
                    if (kasVar != null) {
                        kasVar.a();
                        break;
                    }
                }
                break;
        }
    }

    private final void O(int i) {
    }
}
