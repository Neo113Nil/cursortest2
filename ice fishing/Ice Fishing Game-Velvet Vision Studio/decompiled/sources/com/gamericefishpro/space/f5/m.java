package com.gamericefishpro.space.f5;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ d0 e;

    public /* synthetic */ m(d0 d0Var, int i) {
        this.d = i;
        this.e = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d0 d0Var = this.e;
                com.gamericefishpro.space.d.s sVar = d0Var.f;
                boolean z = false;
                if (d0Var.g) {
                    com.gamericefishpro.space.ph.r rVar = d0Var.b.f;
                    if (rVar == null || !rVar.isEmpty()) {
                        Iterator it = rVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((k) it.next()).e instanceof z) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                sVar.b(z);
                return Unit.a;
            case 1:
                d0 d0Var2 = this.e;
                Context context = d0Var2.a;
                q0 navigatorProvider = d0Var2.b.s;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
                return new e0();
            case 2:
                this.e.b("dashboard", new q(27));
                return Unit.a;
            case 3:
                this.e.b("dashboard", new com.gamericefishpro.space.j7.c(3));
                return Unit.a;
            case 4:
                d0.e(this.e);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                d0 d0Var3 = this.e;
                if (d0Var3.a() != null) {
                    d0Var3.d();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                d0 d0Var4 = this.e;
                if (d0Var4.a() != null) {
                    d0Var4.d();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                d0 d0Var5 = this.e;
                if (d0Var5.a() != null) {
                    d0Var5.d();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                d0 d0Var6 = this.e;
                if (d0Var6.a() != null) {
                    d0Var6.d();
                }
                return Unit.a;
            case 9:
                d0 d0Var7 = this.e;
                if (d0Var7.a() != null) {
                    d0Var7.d();
                }
                return Unit.a;
            case 10:
                this.e.b("dashboard", new com.gamericefishpro.space.j7.c(9));
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                d0.c(this.e, "level_select");
                return Unit.a;
            case 12:
                d0.c(this.e, "achievements");
                return Unit.a;
            case 13:
                d0.c(this.e, "settings");
                return Unit.a;
            case 14:
                d0.c(this.e, "info");
                return Unit.a;
            case 15:
                d0.c(this.e, "statistics");
                return Unit.a;
            case 16:
                d0.c(this.e, "history");
                return Unit.a;
            case 17:
                d0 d0Var8 = this.e;
                if (d0Var8.a() != null) {
                    d0Var8.d();
                }
                return Unit.a;
            default:
                d0.e(this.e);
                return Unit.a;
        }
    }
}
