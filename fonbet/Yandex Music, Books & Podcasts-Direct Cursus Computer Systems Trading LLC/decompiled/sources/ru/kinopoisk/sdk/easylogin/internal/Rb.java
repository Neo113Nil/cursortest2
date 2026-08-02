package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.jfp;
import defpackage.uif;
import defpackage.wfp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Rb extends uif implements Function1<jfp, Unit> {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rb(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jfp jfpVar = (jfp) obj;
        jfpVar.getClass();
        wfp.k(jfpVar, this.a);
        return Unit.a;
    }
}
