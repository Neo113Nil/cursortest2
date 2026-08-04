package com.gamericefishpro.space.na;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.fa.k {
    public final /* synthetic */ p d;

    public n(p pVar) {
        this.d = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.d.b().a();
    }

    @Override // com.gamericefishpro.space.fa.k, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d.b().b();
    }
}
