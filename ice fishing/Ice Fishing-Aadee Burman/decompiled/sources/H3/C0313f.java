package H3;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: H3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0313f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0313f(r rVar, int i) {
        super(rVar);
        this.f1119e = i;
    }

    @Override // H3.s
    public void r() {
        switch (this.f1119e) {
            case 0:
                r rVar = this.f1172b;
                rVar.f1157H = null;
                CheckableImageButton checkableImageButton = rVar.f1170z;
                checkableImageButton.setOnLongClickListener(null);
                t8.g.F(checkableImageButton, null);
                break;
        }
    }
}
