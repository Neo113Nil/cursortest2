package com.yandex.plus.home.plaque.repository.graphql.formatter;

import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Build;
import com.yandex.passport.internal.flags.experiments.p;
import defpackage.b6e;

/* loaded from: classes5.dex */
public final class d {
    public final com.yandex.plus.core.gradient.api.c a;

    public d(com.yandex.plus.core.strings.a aVar) {
        com.yandex.plus.core.gradient.api.c bVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bVar = new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.b, com.yandex.plus.core.gradient.api.a.d, 90.0f);
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            com.yandex.plus.core.gradient.impl.b bVar2 = new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.c, com.yandex.plus.core.gradient.api.a.f, 56.31f);
            com.yandex.plus.core.gradient.impl.b bVar3 = new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.a, com.yandex.plus.core.gradient.api.a.e, 56.31f);
            if (Build.VERSION.SDK_INT >= 28) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
                bVar = new p(bVar2, bVar3);
            } else {
                bVar = new com.yandex.plus.core.gradient.impl.a(bVar2, bVar3);
            }
        }
        this.a = bVar;
    }
}
