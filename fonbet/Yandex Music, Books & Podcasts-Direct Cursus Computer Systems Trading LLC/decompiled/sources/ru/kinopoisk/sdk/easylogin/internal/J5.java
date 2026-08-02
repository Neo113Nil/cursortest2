package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgDeviceConnector", f = "LgDeviceConnector.kt", l = {77}, m = "connect")
/* loaded from: classes5.dex */
public final class J5 extends cg6 {
    public I5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J5(I5 i5, cg6 cg6Var) {
        super(cg6Var);
        this.c = i5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
