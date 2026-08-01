package G0;

import L0.i;
import L0.j;
import a.AbstractC0078a;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends AbstractC0078a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f280f;

    public /* synthetic */ b(int i, Object obj) {
        this.e = i;
        this.f280f = obj;
    }

    private final void e0(int i) {
    }

    @Override // a.AbstractC0078a
    public final void R(int i) {
        switch (this.e) {
            case 0:
                break;
            default:
                j jVar = (j) this.f280f;
                jVar.e = true;
                i iVar = (i) jVar.f515f.get();
                if (iVar != null) {
                    iVar.a();
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0078a
    public final void S(Typeface typeface, boolean z2) {
        switch (this.e) {
            case 0:
                Chip chip = (Chip) this.f280f;
                f fVar = chip.e;
                chip.setText(fVar.f290C0 ? fVar.f293E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    j jVar = (j) this.f280f;
                    jVar.e = true;
                    i iVar = (i) jVar.f515f.get();
                    if (iVar != null) {
                        iVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
