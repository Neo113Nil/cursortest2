package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class n5 {

    @NotNull
    public static final m5 Companion = new m5();
    public static final arf[] f;
    public final String a;
    public final h6 b;
    public final h6 c;
    public final List d;
    public final Map e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, null, null, btf.a(bwfVar, new com.yandex.passport.api.exception.l(29)), btf.a(bwfVar, new k5(0))};
    }

    public /* synthetic */ n5(int i, String str, h6 h6Var, h6 h6Var2, List list, Map map) {
        if (16 != (i & 16)) {
            u7g.V(i, 16, l5.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = h6Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = h6Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        this.e = map;
    }
}
