package J3;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class n extends A3.m {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f1498n;

    public n(r rVar) {
        this.f1498n = rVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1498n.b().a();
    }

    @Override // A3.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        this.f1498n.b().b();
    }
}
