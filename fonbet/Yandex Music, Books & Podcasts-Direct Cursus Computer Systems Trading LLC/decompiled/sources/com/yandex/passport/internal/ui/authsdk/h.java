package com.yandex.passport.internal.ui.authsdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements g {
    public final /* synthetic */ int a;

    @Override // com.yandex.passport.internal.ui.authsdk.g
    public final void a(o oVar) {
        switch (this.a) {
            case 0:
                q qVar = ((z) oVar).s;
                if (qVar != null) {
                    qVar.m.l(Unit.a);
                    return;
                } else {
                    Intrinsics.j("commonViewModel");
                    throw null;
                }
            default:
                q qVar2 = ((z) oVar).s;
                if (qVar2 != null) {
                    qVar2.k.l(Unit.a);
                    return;
                } else {
                    Intrinsics.j("commonViewModel");
                    throw null;
                }
        }
    }
}
