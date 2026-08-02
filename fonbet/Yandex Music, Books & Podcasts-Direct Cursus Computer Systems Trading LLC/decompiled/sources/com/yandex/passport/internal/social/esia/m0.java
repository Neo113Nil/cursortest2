package com.yandex.passport.internal.social.esia;

import com.yandex.passport.internal.ui.sloth.ebs.g1;
import defpackage.bfu;
import defpackage.eir;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m0 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ eir b;
    public final /* synthetic */ eir c;
    public final /* synthetic */ bfu d;

    public /* synthetic */ m0(eir eirVar, eir eirVar2, bfu bfuVar, int i) {
        this.a = i;
        this.b = eirVar;
        this.c = eirVar2;
        this.d = bfuVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.collect(new l0(rjcVar, this.c, (n0) this.d, 0), continuation);
                break;
            default:
                this.b.collect(new l0(rjcVar, this.c, (g1) this.d, 1), continuation);
                break;
        }
        return nm6.a;
    }
}
