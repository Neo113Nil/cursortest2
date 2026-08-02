package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ix6;
import defpackage.np3;
import defpackage.uif;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0961a0 extends uif implements Function1<np3, ix6> {
    public final /* synthetic */ Xb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0961a0(Xb xb) {
        super(1);
        this.a = xb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        np3 np3Var = (np3) obj;
        np3Var.getClass();
        return np3Var.a(new Z(this.a));
    }
}
