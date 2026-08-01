package H3;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class n extends y3.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f1142n;

    public n(r rVar) {
        this.f1142n = rVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1142n.b().a();
    }

    @Override // y3.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        this.f1142n.b().b();
    }
}
