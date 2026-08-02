package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.f580;
import defpackage.lot0;
import defpackage.tls;
import defpackage.vot0;
import defpackage.yot0;
import defpackage.zot0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SpecialNeedsPresenter$provideSpecialRequirements$commentModel$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zot0 zot0Var = (zot0) obj;
        vot0 vot0Var = (vot0) this.receiver;
        lot0 lot0Var = vot0Var.z;
        f580 f580Var = vot0Var.H;
        String str = zot0Var.g;
        yot0 yot0Var = zot0Var.e;
        f580Var.f(str, yot0Var != null ? yot0Var.f : false);
        if (yot0Var == null || !yot0Var.f) {
            lot0Var.a().w(str);
        } else {
            String str2 = yot0Var.e;
            if (str2 == null) {
                str2 = "";
            }
            lot0Var.a().r(str, str2);
        }
        return zy11.a;
    }
}
