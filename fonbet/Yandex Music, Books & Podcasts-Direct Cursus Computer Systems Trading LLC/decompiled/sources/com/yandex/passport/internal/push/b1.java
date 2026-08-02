package com.yandex.passport.internal.push;

import android.content.Context;
import android.content.Intent;
import defpackage.cxb;
import defpackage.vq2;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class b1 extends m0 {
    public final /* synthetic */ int b;
    public final Context c;
    public final com.yandex.passport.common.core.f d;

    public b1(Context context, com.yandex.passport.common.core.f fVar, int i) {
        this.b = i;
        switch (i) {
            case 1:
                context.getClass();
                fVar.getClass();
                this.c = context;
                this.d = fVar;
                break;
            default:
                context.getClass();
                this.c = context;
                this.d = fVar;
                break;
        }
    }

    @Override // com.yandex.passport.internal.push.m0
    public final Intent a() {
        int i = this.b;
        com.yandex.passport.common.core.f fVar = this.d;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = PassportPushRegistrationService.j;
                context.getClass();
                return vq2.A(context, PassportPushRegistrationService.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[]{new Pair("intent_type", "refresh"), new Pair("uid", fVar)}, 2)));
            default:
                int i3 = PassportPushRegistrationService.j;
                context.getClass();
                fVar.getClass();
                return vq2.A(context, PassportPushRegistrationService.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[]{new Pair("intent_type", "remove"), new Pair("uid", fVar)}, 2)));
        }
    }

    @Override // com.yandex.passport.internal.push.m0
    public final x c() {
        switch (this.b) {
            case 0:
                return new v(this.d, 0);
            default:
                return new v(this.d, 1);
        }
    }
}
