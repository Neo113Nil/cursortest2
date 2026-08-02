package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1313z8 extends uif implements Function1<InterfaceC1287x8, Unit> {
    public final /* synthetic */ Function1<InterfaceC1287x8, Boolean> a;
    public final /* synthetic */ C1300y8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1313z8(Function1<? super InterfaceC1287x8, Boolean> function1, C1300y8 c1300y8) {
        super(1);
        this.a = function1;
        this.b = c1300y8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1287x8 interfaceC1287x8 = (InterfaceC1287x8) obj;
        if (interfaceC1287x8 != null && ((Boolean) this.a.invoke(interfaceC1287x8)).booleanValue() && interfaceC1287x8.equals(this.b.a.d())) {
            this.b.a.l(null);
        }
        return Unit.a;
    }
}
