package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.d85;
import defpackage.ix6;
import defpackage.nmq;
import defpackage.np3;
import defpackage.swf;
import defpackage.uif;
import defpackage.y9w;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class W extends uif implements Function1<np3, ix6> {
    public final /* synthetic */ Pair<Float, d85>[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Pair<Float, d85>[] pairArr) {
        super(1);
        this.a = pairArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        np3 np3Var = (np3) obj;
        np3Var.getClass();
        Pair<Float, d85>[] pairArr = this.a;
        return np3Var.a(new V(y9w.L((Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0L, swf.i(nmq.b(np3Var.a.e()), nmq.b(np3Var.a.e())))));
    }
}
