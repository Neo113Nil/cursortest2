package F3;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: F3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0312f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0312f(r rVar, int i) {
        super(rVar);
        this.f1032e = i;
    }

    @Override // F3.s
    public void r() {
        switch (this.f1032e) {
            case 0:
                r rVar = this.f1085b;
                rVar.f1070H = null;
                CheckableImageButton checkableImageButton = rVar.f1083z;
                checkableImageButton.setOnLongClickListener(null);
                Z5.c.o(checkableImageButton, null);
                break;
        }
    }
}
