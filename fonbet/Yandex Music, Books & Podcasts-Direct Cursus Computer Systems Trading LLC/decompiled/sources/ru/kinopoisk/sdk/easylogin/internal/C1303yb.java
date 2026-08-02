package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager", f = "TvSearchManager.kt", l = {97}, m = "googleDeviceIdToKinopoiskDeviceId")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.yb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1303yb extends cg6 {
    public Gb a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303yb(Gb gb, cg6 cg6Var) {
        super(cg6Var);
        this.c = gb;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
