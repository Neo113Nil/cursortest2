package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.H3;

@we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager", f = "TvSearchManager.kt", l = {84}, m = "mergeGoogleCastAndKinopoiskCast")
/* loaded from: classes5.dex */
public final class Ab extends cg6 {
    public H3.a a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Gb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab(Gb gb, cg6 cg6Var) {
        super(cg6Var);
        this.d = gb;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Gb.a(this.d, null, null, null, this);
    }
}
