package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Y7 extends uif implements Function1<InterfaceC1274w8, InterfaceC1274w8> {
    public final /* synthetic */ T7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(T7 t7) {
        super(1);
        this.a = t7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1274w8 interfaceC1274w8 = (InterfaceC1274w8) obj;
        if (interfaceC1274w8 != null) {
            return Z7.a(this.a.c, interfaceC1274w8);
        }
        return null;
    }
}
