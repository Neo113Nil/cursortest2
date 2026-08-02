package com.yandex.plus.bdui.plus.utils;

import com.yandex.plus.bdui.action.k;

/* loaded from: classes4.dex */
public final class b extends Exception implements k {
    public final com.yandex.plus.bdui.action.a a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(String str, Throwable th, com.yandex.plus.bdui.action.a aVar, int i) {
        super(str, th);
        th = (i & 2) != 0 ? null : th;
        aVar = (i & 4) != 0 ? null : aVar;
        this.a = aVar;
    }

    @Override // com.yandex.plus.bdui.action.k
    public final com.yandex.plus.bdui.action.a a() {
        return this.a;
    }
}
