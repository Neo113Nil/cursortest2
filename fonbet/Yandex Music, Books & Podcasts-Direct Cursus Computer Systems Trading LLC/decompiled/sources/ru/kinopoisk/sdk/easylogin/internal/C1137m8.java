package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.oqi;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1109k8;

@we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor", f = "SamsungTvInteractor.kt", l = {306, 131}, m = "ensureAppInitialized")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1137m8 extends cg6 {
    public C1109k8 a;
    public oqi b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1109k8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137m8(C1109k8 c1109k8, cg6 cg6Var) {
        super(cg6Var);
        this.d = c1109k8;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        C1109k8 c1109k8 = this.d;
        C1109k8.a aVar = C1109k8.p;
        return c1109k8.b(this);
    }
}
