package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import defpackage.cg6;
import defpackage.oqi;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.O5;

@we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor", f = "LgTvInteractor.kt", l = {353, 188}, m = "launchApp")
/* loaded from: classes5.dex */
public final class T5 extends cg6 {
    public O5 a;
    public Object b;
    public String c;
    public oqi d;
    public /* synthetic */ Object e;
    public final /* synthetic */ O5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(O5 o5, cg6 cg6Var) {
        super(cg6Var);
        this.f = o5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        O5 o5 = this.f;
        O5.a aVar = O5.p;
        return o5.a((ConnectableDevice) null, (String) null, this);
    }
}
