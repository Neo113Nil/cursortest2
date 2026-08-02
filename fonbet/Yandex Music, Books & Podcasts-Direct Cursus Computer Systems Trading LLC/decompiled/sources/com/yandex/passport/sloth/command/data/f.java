package com.yandex.passport.sloth.command.data;

import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public final String a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, d.a.getDescriptor());
            throw null;
        }
    }
}
