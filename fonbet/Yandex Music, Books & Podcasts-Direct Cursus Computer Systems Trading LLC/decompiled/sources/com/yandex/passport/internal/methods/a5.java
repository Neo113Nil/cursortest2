package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.e7o;
import defpackage.v75;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a5 extends v5 {
    public final ArrayList c;
    public final ArrayList d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Bundle bundle) {
        super(w5.F0);
        bundle.getClass();
        Set<String> keySet = bundle.keySet();
        keySet.getClass();
        Set<String> set = keySet;
        ArrayList arrayList = new ArrayList(v75.o(set, 10));
        for (String str : set) {
            str.getClass();
            String string = bundle.getString(str);
            if (string == null) {
                e7o.f("can't get required string ".concat(str));
                throw null;
            }
            arrayList.add(new p6(str, string));
        }
        this.c = arrayList;
        this.d = arrayList;
        this.e = e6.i;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.e;
    }
}
