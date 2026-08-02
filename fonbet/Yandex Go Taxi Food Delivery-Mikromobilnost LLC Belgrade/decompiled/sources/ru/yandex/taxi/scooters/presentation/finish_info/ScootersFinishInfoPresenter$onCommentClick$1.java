package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.tls;
import defpackage.uln0;
import defpackage.wmn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class ScootersFinishInfoPresenter$onCommentClick$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        d dVar = (d) this.receiver;
        ((wmn0) dVar.Dg()).ve(charSequence.toString());
        r0 r0Var = (r0) dVar.O.e.x;
        r0Var.m(null, uln0.a((uln0) r0Var.getValue(), null, false, 0, charSequence, null, 23));
        dVar.Lg();
        return zy11.a;
    }
}
