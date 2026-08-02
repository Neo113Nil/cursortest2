package ru.yandex.taxi.requirements.glued.interactor;

import defpackage.jmw0;
import defpackage.lmw0;
import defpackage.tls;
import defpackage.w15;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class BaseGluedRequirementInteractor$mandatoryGluedSequence$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        lmw0 lmw0Var = (lmw0) obj;
        ((w15) this.receiver).getClass();
        return Boolean.valueOf((lmw0Var instanceof jmw0) && !((jmw0) lmw0Var).n());
    }
}
