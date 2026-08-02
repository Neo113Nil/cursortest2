package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewDeviceInfoResolver", f = "SmartViewDeviceInfoResolver.kt", l = {14}, m = "getModel")
/* loaded from: classes5.dex */
public final class Q8 extends cg6 {
    public /* synthetic */ Object a;
    public final /* synthetic */ O8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q8(O8 o8, cg6 cg6Var) {
        super(cg6Var);
        this.b = o8;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
