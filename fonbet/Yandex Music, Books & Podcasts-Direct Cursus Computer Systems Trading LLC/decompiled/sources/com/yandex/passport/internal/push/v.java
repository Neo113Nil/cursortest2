package com.yandex.passport.internal.push;

import defpackage.nm6;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class v extends x {
    public final /* synthetic */ int a;
    public final com.yandex.passport.common.core.f b;

    public v(com.yandex.passport.common.core.f fVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                fVar.getClass();
                this.b = fVar;
                break;
            default:
                this.b = fVar;
                break;
        }
    }

    @Override // com.yandex.passport.internal.push.x
    public final Object a(g gVar, y yVar) {
        switch (this.a) {
            case 0:
                Object i = gVar.i(yVar, null, this.b);
                nm6 nm6Var = nm6.a;
                if (i != nm6Var) {
                    i = Unit.a;
                }
                if (i != nm6Var) {
                    break;
                }
                break;
            default:
                Object h = gVar.h(this.b, yVar);
                if (h != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
