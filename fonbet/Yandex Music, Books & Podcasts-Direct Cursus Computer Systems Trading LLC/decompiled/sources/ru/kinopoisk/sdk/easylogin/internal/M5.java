package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgDeviceConnector", f = "LgDeviceConnector.kt", l = {155}, m = "connectInternal")
/* loaded from: classes5.dex */
public final class M5 extends cg6 {
    public I5 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ I5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M5(I5 i5, cg6 cg6Var) {
        super(cg6Var);
        this.d = i5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        I5 i5 = this.d;
        int i = I5.e;
        return i5.b(null, this);
    }
}
