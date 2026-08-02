package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* loaded from: classes5.dex */
public final class C4 extends uif implements Function1<InterfaceC1177p6.a, Unit> {
    public final /* synthetic */ Z0[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4(Z0[] z0Arr) {
        super(1);
        this.a = z0Arr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1177p6.a aVar = (InterfaceC1177p6.a) obj;
        aVar.getClass();
        aVar.a("commands", this.a);
        return Unit.a;
    }
}
