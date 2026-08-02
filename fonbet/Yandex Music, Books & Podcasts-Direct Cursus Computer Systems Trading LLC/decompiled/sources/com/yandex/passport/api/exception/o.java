package com.yandex.passport.api.exception;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o extends j {

    @NotNull
    public static final n Companion = new n();
    public static final arf[] b = {btf.a(bwf.b, new l(0))};
    public final List a;

    public o(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, m.a.getDescriptor());
            throw null;
        }
    }

    public o(ArrayList arrayList) {
        super("Host-processed errors: " + arrayList);
        this.a = arrayList;
    }
}
