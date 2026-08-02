package com.yandex.passport.internal.account;

import defpackage.j9f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e implements Iterable, j9f {
    public final List a;

    public e(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
