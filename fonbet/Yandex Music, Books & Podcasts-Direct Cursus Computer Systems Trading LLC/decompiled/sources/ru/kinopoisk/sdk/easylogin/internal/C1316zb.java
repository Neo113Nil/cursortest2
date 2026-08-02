package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.F4;

@we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager$googleDeviceIdToKinopoiskDeviceId$googleCastDeviceInfo$1", f = "TvSearchManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.zb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1316zb extends aur implements Function2<mm6, Continuation<? super F4.b>, Object> {
    public final /* synthetic */ Gb a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1316zb(Gb gb, String str, Continuation<? super C1316zb> continuation) {
        super(2, continuation);
        this.a = gb;
        this.b = str;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1316zb(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1316zb(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return this.a.c.a(this.b);
    }
}
