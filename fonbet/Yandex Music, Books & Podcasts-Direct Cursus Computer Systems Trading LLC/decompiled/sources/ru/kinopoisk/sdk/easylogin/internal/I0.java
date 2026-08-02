package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.sdr;
import defpackage.uif;
import defpackage.zco;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class I0 extends uif implements Function1<zco, Unit> {
    public final /* synthetic */ sdr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(sdr sdrVar) {
        super(1);
        this.a = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        zcoVar.j(((Number) this.a.getValue()).floatValue());
        return Unit.a;
    }
}
