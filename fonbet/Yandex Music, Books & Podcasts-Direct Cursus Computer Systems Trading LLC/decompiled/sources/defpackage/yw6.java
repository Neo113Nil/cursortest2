package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
public final class yw6 extends g7b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw6(a7b a7bVar, int i) {
        super(a7bVar);
        this.e = i;
    }

    @Override // defpackage.g7b
    public void q() {
        switch (this.e) {
            case 0:
                a7b a7bVar = this.b;
                a7bVar.o = null;
                CheckableImageButton checkableImageButton = a7bVar.g;
                checkableImageButton.setOnLongClickListener(null);
                cxb.k0(checkableImageButton, null);
                break;
        }
    }
}
