package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes11.dex */
public final class wpb extends eky0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wpb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c(int i) {
    }

    @Override // defpackage.eky0
    public final void a(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                bmy0 bmy0Var = (bmy0) this.b;
                bmy0Var.e = true;
                amy0 amy0Var = (amy0) bmy0Var.f.get();
                if (amy0Var != null) {
                    amy0Var.onTextSizeChange();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eky0
    public final void b(Typeface typeface, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                chip.setText(chip.chipDrawable.shouldDrawText() ? chip.chipDrawable.getText() : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    bmy0 bmy0Var = (bmy0) obj;
                    bmy0Var.e = true;
                    amy0 amy0Var = (amy0) bmy0Var.f.get();
                    if (amy0Var != null) {
                        amy0Var.onTextSizeChange();
                        break;
                    }
                }
                break;
        }
    }
}
