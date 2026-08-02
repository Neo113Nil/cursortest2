package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.iti0;
import defpackage.ken;
import defpackage.rme;
import defpackage.tls;
import defpackage.x3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class EatsNativeApi$requestReload$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        iti0 iti0Var = (iti0) obj;
        rme rmeVar = (rme) ((x3) ((ken) this.receiver)).b;
        rmeVar.e = iti0Var != null ? iti0Var.c : null;
        rmeVar.r(iti0Var, false);
        return zy11.a;
    }
}
