package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import defpackage.cg6;
import defpackage.oqi;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.O5;

@we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor", f = "LgTvInteractor.kt", l = {353, 145}, m = "ensureDeviceConnected")
/* loaded from: classes5.dex */
public final class Q5 extends cg6 {
    public O5 a;
    public oqi b;
    public ConnectableDevice c;
    public /* synthetic */ Object d;
    public final /* synthetic */ O5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(O5 o5, cg6 cg6Var) {
        super(cg6Var);
        this.e = o5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        O5 o5 = this.e;
        O5.a aVar = O5.p;
        return o5.b(this);
    }
}
