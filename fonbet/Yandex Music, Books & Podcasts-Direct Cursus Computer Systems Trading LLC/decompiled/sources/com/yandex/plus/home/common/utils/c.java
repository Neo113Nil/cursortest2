package com.yandex.plus.home.common.utils;

import defpackage.ezc;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ezc b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(int i, Function0 function0) {
        this.a = i;
        this.b = (ezc) function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
