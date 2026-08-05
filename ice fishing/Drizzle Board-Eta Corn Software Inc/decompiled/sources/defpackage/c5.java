package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c5 extends e50 {
    public final /* synthetic */ Object VgvYg0wo;
    public final /* synthetic */ int wxUZMvaN;

    public /* synthetic */ c5(int i, Object obj) {
        this.wxUZMvaN = i;
        this.VgvYg0wo = obj;
    }

    @Override // defpackage.e50
    public final void k3x7lurq(int i) {
        switch (this.wxUZMvaN) {
            case 0:
                break;
            default:
                ec0 ec0Var = (ec0) this.VgvYg0wo;
                ec0Var.VgvYg0wo = true;
                dc0 dc0Var = (dc0) ec0Var.P7K7Inc8.get();
                if (dc0Var != null) {
                    dc0Var.qoPGr6Ce();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e50
    public final void ow5vqvCr(Typeface typeface, boolean z) {
        int i = this.wxUZMvaN;
        Object obj = this.VgvYg0wo;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                g5 g5Var = chip.P7K7Inc8;
                chip.setText(g5Var.QKkyGhhI ? g5Var.zCflySGU : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    ec0 ec0Var = (ec0) obj;
                    ec0Var.VgvYg0wo = true;
                    dc0 dc0Var = (dc0) ec0Var.P7K7Inc8.get();
                    if (dc0Var != null) {
                        dc0Var.qoPGr6Ce();
                        break;
                    }
                }
                break;
        }
    }

    private final void sjUBp5pO(int i) {
    }
}
