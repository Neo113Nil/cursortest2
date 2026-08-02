package com.yandex.plus.core.benchmark;

import defpackage.btf;
import defpackage.jyr;
import defpackage.w8a;

/* loaded from: classes4.dex */
public final class b0 implements n {
    public final jyr a;

    public b0(String str) {
        this.a = btf.b(new w8a(str, 4));
    }

    @Override // com.yandex.plus.core.benchmark.n
    public final m a(String str) {
        str.getClass();
        return (m) this.a.getValue();
    }
}
