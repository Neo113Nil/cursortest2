package ru.yandex.taxi.settings.main;

import defpackage.hs11;
import defpackage.tls;
import defpackage.z500;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class NativeMenuPresenter$startSubscriptions$8 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        hs11 hs11Var = (hs11) obj;
        f fVar = (f) this.receiver;
        fVar.getClass();
        if (!hs11Var.c || hs11Var.a.length() <= 0) {
            ((z500) fVar.Dg()).y4();
        } else {
            ((z500) fVar.Dg()).Df(hs11Var);
        }
        return zy11.a;
    }
}
