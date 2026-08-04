package com.gamericefishpro.space.b2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Function1 {
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ z() {
        this.d = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                v vVar = (v) this.e;
                if (vVar != null) {
                    vVar.c = zBooleanValue;
                }
                return Unit.a;
            case 1:
                try {
                    ((InstallReferrerClient) this.e).endConnection();
                    break;
                } catch (Exception unused) {
                }
                return Unit.a;
            case 2:
                ((com.gamericefishpro.space.e7.g) this.e).b = null;
                return Unit.a;
            case 3:
                com.gamericefishpro.space.f1.m mVar = (com.gamericefishpro.space.f1.m) obj;
                synchronized (com.gamericefishpro.space.f1.p.c) {
                    j = com.gamericefishpro.space.f1.p.e;
                    com.gamericefishpro.space.f1.p.e = ((long) 1) + j;
                }
                return new com.gamericefishpro.space.f1.f(j, mVar, (Function1) this.e);
            case 4:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                throw new IllegalStateException(y0.j(new StringBuilder("Unable to open database '"), (String) this.e, "'. Was a proper path / name used in Room's database builder?"), error);
            default:
                ((com.gamericefishpro.space.t0.g) this.e).cancel();
                return Unit.a;
        }
    }

    public /* synthetic */ z(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
