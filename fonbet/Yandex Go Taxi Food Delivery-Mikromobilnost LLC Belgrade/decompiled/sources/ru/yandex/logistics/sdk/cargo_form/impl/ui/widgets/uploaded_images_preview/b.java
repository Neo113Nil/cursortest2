package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.uploaded_images_preview;

import defpackage.do6;
import defpackage.m7;
import defpackage.p6s;
import defpackage.s5s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final s5s b;
    public final p6s c;
    public final sae d;
    public final do6 e;

    public b(u3s u3sVar, s5s s5sVar, p6s p6sVar, sae saeVar, do6 do6Var) {
        super(u3sVar);
        this.b = s5sVar;
        this.c = p6sVar;
        this.d = saeVar;
        this.e = do6Var;
    }

    @Override // defpackage.m7
    public final String c() {
        return "uploaded-images-preview";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.X(new m0(b(str), this.c.e(), new UploadedImagesStateHolder$getWidgets$1(3, null)), new UploadedImagesStateHolder$getWidgets$$inlined$flatMapLatest$1(null, this));
    }
}
