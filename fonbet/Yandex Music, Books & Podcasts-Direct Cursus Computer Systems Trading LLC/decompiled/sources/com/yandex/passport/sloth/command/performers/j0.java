package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.z0;
import defpackage.l2b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.data.m a;

    public j0(com.yandex.passport.sloth.data.m mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final Object n(Object obj, com.yandex.passport.sloth.command.f fVar) {
        z0 z0Var = (z0) obj;
        if (Intrinsics.d(z0Var.a, "fullscreen")) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Nothing changes for fullscreen mode of setPopupSize", 8);
            }
            return new l2b(com.yandex.passport.sloth.command.v.c);
        }
        String str = "Not supported SetPopupSizeData.mode = " + z0Var.a + " for variant.mode = " + this.a.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, str, 8);
        }
        return new l2b(com.yandex.passport.sloth.command.v.b);
    }
}
