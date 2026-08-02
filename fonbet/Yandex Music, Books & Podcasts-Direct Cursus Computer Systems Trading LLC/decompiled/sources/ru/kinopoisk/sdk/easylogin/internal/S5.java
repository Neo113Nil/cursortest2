package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor", f = "LgTvInteractor.kt", l = {110, 110}, m = "executeWithResult")
/* loaded from: classes5.dex */
public final class S5<T> extends cg6 {
    public C1004d1 a;
    public Type b;
    public JSONObject c;
    public O5 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ O5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(O5 o5, cg6 cg6Var) {
        super(cg6Var);
        this.f = o5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((C1004d1) null, (Type) null, this);
    }
}
