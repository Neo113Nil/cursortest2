package com.yandex.plus.core.insets;

import android.view.View;
import defpackage.zne;

/* loaded from: classes4.dex */
public interface g extends k {
    @Override // com.yandex.plus.core.insets.k
    default e a(View view) {
        view.getClass();
        return new e() { // from class: com.yandex.plus.core.insets.f
            @Override // com.yandex.plus.core.insets.e
            public final void a(zne zneVar) {
                zneVar.getClass();
                g.this.b(zneVar);
            }
        };
    }

    void b(zne zneVar);
}
