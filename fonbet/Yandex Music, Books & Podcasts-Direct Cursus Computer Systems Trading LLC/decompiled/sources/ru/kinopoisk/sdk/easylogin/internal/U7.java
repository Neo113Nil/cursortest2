package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* loaded from: classes5.dex */
public final class U7 extends uif implements Function1<InterfaceC1177p6.a, Unit> {
    public final /* synthetic */ T7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(T7 t7) {
        super(1);
        this.a = t7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1177p6.a aVar = (InterfaceC1177p6.a) obj;
        aVar.getClass();
        aVar.a("router", this.a.e);
        return Unit.a;
    }
}
