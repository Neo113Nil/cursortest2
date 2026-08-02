package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor", f = "SamsungTvInteractor.kt", l = {105, 105}, m = "openAppInternal")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1206r8 extends cg6 {
    public C1109k8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1109k8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206r8(C1109k8 c1109k8, cg6 cg6Var) {
        super(cg6Var);
        this.c = c1109k8;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((cg6) this);
    }
}
