package V0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.e = i;
    }

    @Override // V0.q
    public void r() {
        switch (this.e) {
            case 0:
                p pVar = this.f1319b;
                pVar.f1310o = null;
                CheckableImageButton checkableImageButton = pVar.f1304g;
                checkableImageButton.setOnLongClickListener(null);
                R.j.l0(checkableImageButton, null);
                break;
        }
    }
}
