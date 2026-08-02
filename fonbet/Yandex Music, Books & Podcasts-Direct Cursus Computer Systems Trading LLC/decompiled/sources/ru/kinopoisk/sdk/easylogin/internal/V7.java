package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ern;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1177p6;

/* loaded from: classes5.dex */
public final class V7 extends uif implements Function1<InterfaceC1177p6.a, Unit> {
    public final /* synthetic */ T7 a;
    public final /* synthetic */ K6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(T7 t7, K6 k6) {
        super(1);
        this.a = t7;
        this.b = k6;
    }

    public final void a(InterfaceC1177p6.a aVar) {
        String str;
        aVar.getClass();
        str = this.a.e;
        aVar.a("router", str);
        K6 k6 = this.b;
        aVar.a("navigator", ern.a(k6.getClass()).h() + "@" + System.identityHashCode(k6));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((InterfaceC1177p6.a) obj);
        return Unit.a;
    }
}
