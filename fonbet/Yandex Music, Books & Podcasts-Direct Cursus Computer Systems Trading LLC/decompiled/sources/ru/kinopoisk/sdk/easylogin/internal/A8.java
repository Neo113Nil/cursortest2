package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.syc;
import defpackage.xjj;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class A8 implements xjj, zyc {
    public final /* synthetic */ C1313z8 a;

    public A8(C1313z8 c1313z8) {
        c1313z8.getClass();
        this.a = c1313z8;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xjj) && (obj instanceof zyc)) {
            return Intrinsics.d(this.a, ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    @NotNull
    public final syc getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void onChanged(Object obj) {
        this.a.invoke(obj);
    }
}
