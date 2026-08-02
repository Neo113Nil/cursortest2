package A3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class j extends com.bumptech.glide.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171b;

    public /* synthetic */ j(int i, Object obj) {
        this.f170a = i;
        this.f171b = obj;
    }

    @Override // com.bumptech.glide.g
    public final void v(int i) {
        switch (this.f170a) {
            case 0:
                l lVar = (l) this.f171b;
                lVar.f175d = true;
                k kVar = (k) lVar.f176e.get();
                if (kVar != null) {
                    v3.e eVar = (v3.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.g
    public final void w(Typeface typeface, boolean z6) {
        switch (this.f170a) {
            case 0:
                if (!z6) {
                    l lVar = (l) this.f171b;
                    lVar.f175d = true;
                    k kVar = (k) lVar.f176e.get();
                    if (kVar != null) {
                        v3.e eVar = (v3.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f171b;
                v3.e eVar2 = chip.f36697x;
                chip.setText(eVar2.f41189d1 ? eVar2.f41181X : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void C(int i) {
    }
}
