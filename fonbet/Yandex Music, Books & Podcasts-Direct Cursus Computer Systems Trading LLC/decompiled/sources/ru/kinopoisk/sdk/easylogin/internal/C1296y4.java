package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1296y4 extends uif implements Function1<InterfaceC1177p6.a, Unit> {
    public final /* synthetic */ androidx.fragment.app.o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296y4(androidx.fragment.app.o oVar) {
        super(1);
        this.a = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1177p6.a aVar = (InterfaceC1177p6.a) obj;
        aVar.getClass();
        androidx.fragment.app.o oVar = this.a;
        oVar.getClass();
        aVar.a("fragment", oVar);
        return Unit.a;
    }
}
