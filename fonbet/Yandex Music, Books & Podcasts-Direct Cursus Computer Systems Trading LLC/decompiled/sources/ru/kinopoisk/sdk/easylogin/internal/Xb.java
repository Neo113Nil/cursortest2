package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ai3;
import defpackage.nmq;
import defpackage.uif;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Xb extends uif implements Function1<nmq, ai3> {
    public final /* synthetic */ Vb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(Vb vb) {
        super(1);
        this.a = vb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return K4.a(((nmq) obj).a, (C1009d6) this.a.e0.getValue());
    }
}
