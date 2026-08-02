package J3;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: J3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0322f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0322f(r rVar, int i) {
        super(rVar);
        this.f1475e = i;
    }

    @Override // J3.s
    public void r() {
        switch (this.f1475e) {
            case 0:
                r rVar = this.f1528b;
                rVar.f1513H = null;
                CheckableImageButton checkableImageButton = rVar.f1526z;
                checkableImageButton.setOnLongClickListener(null);
                com.bumptech.glide.f.t(checkableImageButton, null);
                break;
        }
    }
}
