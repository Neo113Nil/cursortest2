package com.gamericefishpro.space.j7;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f1.s;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.f5.m;
import com.gamericefishpro.space.f5.q;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.v.k;
import java.net.URLEncoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ d0 e;

    public /* synthetic */ e(d0 d0Var, int i) {
        this.d = i;
        this.e = d0Var;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        String string2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k composable = (k) obj;
                com.gamericefishpro.space.f5.k backStackEntry = (com.gamericefishpro.space.f5.k) obj2;
                r rVar = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                com.gamericefishpro.space.i5.c cVar = backStackEntry.A;
                Bundle bundleA = cVar.a();
                final int i = bundleA != null ? bundleA.getInt("level") : 1;
                Bundle bundleA2 = cVar.a();
                int i2 = bundleA2 != null ? bundleA2.getInt("score") : 0;
                Bundle bundleA3 = cVar.a();
                int i3 = bundleA3 != null ? bundleA3.getInt("stars") : 0;
                rVar.a0(1690135161);
                final d0 d0Var = this.e;
                boolean zH = rVar.h(d0Var) | rVar.d(i);
                Object objP = rVar.P();
                com.gamericefishpro.space.t0.f fVar = n.a;
                if (zH || objP == fVar) {
                    final int i4 = 0;
                    objP = new Function0() { // from class: com.gamericefishpro.space.j7.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i + 1, "game/"), new c(2));
                                    break;
                                case 1:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i, "game/"), new c(1));
                                    break;
                                default:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i, "game/"), new c(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar.k0(objP);
                }
                Function0 function0 = (Function0) objP;
                rVar.p(false);
                rVar.a0(1690142773);
                boolean zH2 = rVar.h(d0Var) | rVar.d(i);
                Object objP2 = rVar.P();
                if (zH2 || objP2 == fVar) {
                    final int i5 = 1;
                    objP2 = new Function0() { // from class: com.gamericefishpro.space.j7.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i + 1, "game/"), new c(2));
                                    break;
                                case 1:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i, "game/"), new c(1));
                                    break;
                                default:
                                    d0Var.b(com.gamericefishpro.space.m5.a.g(i, "game/"), new c(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar.k0(objP2);
                }
                Function0 function1 = (Function0) objP2;
                rVar.p(false);
                rVar.a0(1690150189);
                boolean zH3 = rVar.h(d0Var);
                Object objP3 = rVar.P();
                if (zH3 || objP3 == fVar) {
                    objP3 = new m(d0Var, 3);
                    rVar.k0(objP3);
                }
                rVar.p(false);
                com.gamericefishpro.space.q7.d.a(i, i2, i3, function0, function1, (Function0) objP3, rVar, 0);
                break;
            case 1:
                k composable2 = (k) obj;
                com.gamericefishpro.space.f5.k backStackEntry2 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar2 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable2, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry2, "backStackEntry");
                Bundle bundleA4 = backStackEntry2.A.a();
                final int i6 = bundleA4 != null ? bundleA4.getInt("level") : 1;
                Bundle bundleA5 = backStackEntry2.A.a();
                if (bundleA5 == null || (string = bundleA5.getString("reason")) == null) {
                    string = "NO_MOVES";
                }
                String str = string;
                rVar2.a0(1690175630);
                final d0 d0Var2 = this.e;
                boolean zH4 = rVar2.h(d0Var2) | rVar2.d(i6);
                Object objP4 = rVar2.P();
                com.gamericefishpro.space.t0.f fVar2 = n.a;
                if (zH4 || objP4 == fVar2) {
                    final int i7 = 2;
                    objP4 = new Function0() { // from class: com.gamericefishpro.space.j7.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    d0Var2.b(com.gamericefishpro.space.m5.a.g(i6 + 1, "game/"), new c(2));
                                    break;
                                case 1:
                                    d0Var2.b(com.gamericefishpro.space.m5.a.g(i6, "game/"), new c(1));
                                    break;
                                default:
                                    d0Var2.b(com.gamericefishpro.space.m5.a.g(i6, "game/"), new c(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar2.k0(objP4);
                }
                Function0 function2 = (Function0) objP4;
                rVar2.p(false);
                rVar2.a0(1690182746);
                boolean zH5 = rVar2.h(d0Var2);
                Object objP5 = rVar2.P();
                if (zH5 || objP5 == fVar2) {
                    objP5 = new m(d0Var2, 4);
                    rVar2.k0(objP5);
                }
                rVar2.p(false);
                com.gamericefishpro.space.m7.a.a(i6, str, function2, (Function0) objP5, rVar2, 0);
                break;
            case 2:
                k composable3 = (k) obj;
                com.gamericefishpro.space.f5.k it = (com.gamericefishpro.space.f5.k) obj2;
                r rVar3 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable3, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                rVar3.a0(1690190106);
                d0 d0Var3 = this.e;
                boolean zH6 = rVar3.h(d0Var3);
                Object objP6 = rVar3.P();
                if (zH6 || objP6 == n.a) {
                    objP6 = new m(d0Var3, 5);
                    rVar3.k0(objP6);
                }
                rVar3.p(false);
                h.a((Function0) objP6, null, rVar3, 0);
                break;
            case 3:
                k composable4 = (k) obj;
                com.gamericefishpro.space.f5.k it2 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar4 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable4, "$this$composable");
                Intrinsics.checkNotNullParameter(it2, "it");
                rVar4.a0(1690195546);
                d0 d0Var4 = this.e;
                boolean zH7 = rVar4.h(d0Var4);
                Object objP7 = rVar4.P();
                if (zH7 || objP7 == n.a) {
                    objP7 = new m(d0Var4, 6);
                    rVar4.k0(objP7);
                }
                rVar4.p(false);
                com.gamericefishpro.space.p7.d.a((Function0) objP7, rVar4, 0);
                break;
            case 4:
                k composable5 = (k) obj;
                com.gamericefishpro.space.f5.k it3 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar5 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable5, "$this$composable");
                Intrinsics.checkNotNullParameter(it3, "it");
                rVar5.a0(1690201242);
                d0 d0Var5 = this.e;
                boolean zH8 = rVar5.h(d0Var5);
                Object objP8 = rVar5.P();
                if (zH8 || objP8 == n.a) {
                    objP8 = new m(d0Var5, 7);
                    rVar5.k0(objP8);
                }
                rVar5.p(false);
                com.gamericefishpro.space.s7.d.a((Function0) objP8, null, rVar5, 0);
                break;
            case i.STRING_FIELD_NUMBER /* 5 */:
                k composable6 = (k) obj;
                com.gamericefishpro.space.f5.k it4 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar6 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable6, "$this$composable");
                Intrinsics.checkNotNullParameter(it4, "it");
                rVar6.a0(1690207066);
                d0 d0Var6 = this.e;
                boolean zH9 = rVar6.h(d0Var6);
                Object objP9 = rVar6.P();
                if (zH9 || objP9 == n.a) {
                    objP9 = new m(d0Var6, 8);
                    rVar6.k0(objP9);
                }
                rVar6.p(false);
                com.gamericefishpro.space.wa.b.a((Function0) objP9, null, rVar6, 0);
                break;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                k composable7 = (k) obj;
                com.gamericefishpro.space.f5.k it5 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar7 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable7, "$this$composable");
                Intrinsics.checkNotNullParameter(it5, "it");
                rVar7.a0(1690212698);
                d0 d0Var7 = this.e;
                boolean zH10 = rVar7.h(d0Var7);
                Object objP10 = rVar7.P();
                if (zH10 || objP10 == n.a) {
                    objP10 = new m(d0Var7, 9);
                    rVar7.k0(objP10);
                }
                rVar7.p(false);
                com.gamericefishpro.space.i.a.b((Function0) objP10, null, rVar7, 0);
                break;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                k composable8 = (k) obj;
                com.gamericefishpro.space.f5.k it6 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar8 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable8, "$this$composable");
                Intrinsics.checkNotNullParameter(it6, "it");
                rVar8.a0(1690010566);
                final d0 d0Var8 = this.e;
                boolean zH11 = rVar8.h(d0Var8);
                Object objP11 = rVar8.P();
                com.gamericefishpro.space.t0.f fVar3 = n.a;
                if (zH11 || objP11 == fVar3) {
                    objP11 = new m(d0Var8, 2);
                    rVar8.k0(objP11);
                }
                Function0 function3 = (Function0) objP11;
                rVar8.p(false);
                rVar8.a0(1690018036);
                boolean zH12 = rVar8.h(d0Var8);
                Object objP12 = rVar8.P();
                if (zH12 || objP12 == fVar3) {
                    final int i8 = 0;
                    objP12 = new Function1() { // from class: com.gamericefishpro.space.j7.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i8) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    String urlParams = (String) obj5;
                                    Intrinsics.checkNotNullParameter(urlParams, "urlParams");
                                    d0Var8.b(com.gamericefishpro.space.m5.a.u("webview?url=", URLEncoder.encode(urlParams, "UTF-8")), new q(28));
                                    break;
                                default:
                                    d0.c(d0Var8, "game/" + ((Integer) obj5).intValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar8.k0(objP12);
                }
                rVar8.p(false);
                com.gamericefishpro.space.t7.b.a(function3, (Function1) objP12, null, rVar8, 0);
                break;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                k composable9 = (k) obj;
                com.gamericefishpro.space.f5.k backStackEntry3 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar9 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable9, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry3, "backStackEntry");
                Bundle bundleA6 = backStackEntry3.A.a();
                if (bundleA6 == null || (string2 = bundleA6.getString("url")) == null) {
                    string2 = "";
                }
                String str2 = string2;
                rVar9.a0(1690040263);
                d0 d0Var9 = this.e;
                boolean zH13 = rVar9.h(d0Var9);
                Object objP13 = rVar9.P();
                if (zH13 || objP13 == n.a) {
                    objP13 = new m(d0Var9, 10);
                    rVar9.k0(objP13);
                }
                rVar9.p(false);
                com.gamericefishpro.space.i.a.g(str2, (Function0) objP13, null, null, null, rVar9, 0);
                break;
            case 9:
                k composable10 = (k) obj;
                com.gamericefishpro.space.f5.k it7 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar10 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable10, "$this$composable");
                Intrinsics.checkNotNullParameter(it7, "it");
                rVar10.a0(1690074414);
                final d0 d0Var10 = this.e;
                boolean zH14 = rVar10.h(d0Var10);
                Object objP14 = rVar10.P();
                com.gamericefishpro.space.t0.f fVar4 = n.a;
                if (zH14 || objP14 == fVar4) {
                    final int i9 = 1;
                    objP14 = new Function1() { // from class: com.gamericefishpro.space.j7.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i9) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    String urlParams = (String) obj5;
                                    Intrinsics.checkNotNullParameter(urlParams, "urlParams");
                                    d0Var10.b(com.gamericefishpro.space.m5.a.u("webview?url=", URLEncoder.encode(urlParams, "UTF-8")), new q(28));
                                    break;
                                default:
                                    d0.c(d0Var10, "game/" + ((Integer) obj5).intValue());
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    rVar10.k0(objP14);
                }
                Function1 function4 = (Function1) objP14;
                rVar10.p(false);
                rVar10.a0(1690077530);
                boolean zH15 = rVar10.h(d0Var10);
                Object objP15 = rVar10.P();
                if (zH15 || objP15 == fVar4) {
                    objP15 = new m(d0Var10, 17);
                    rVar10.k0(objP15);
                }
                rVar10.p(false);
                com.gamericefishpro.space.r7.c.a(function4, (Function0) objP15, null, rVar10, 0);
                break;
            default:
                k composable11 = (k) obj;
                com.gamericefishpro.space.f5.k backStackEntry4 = (com.gamericefishpro.space.f5.k) obj2;
                r rVar11 = (r) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable11, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry4, "backStackEntry");
                Bundle bundleA7 = backStackEntry4.A.a();
                int i10 = bundleA7 != null ? bundleA7.getInt("level") : 1;
                rVar11.a0(1690091763);
                d0 d0Var11 = this.e;
                boolean zH16 = rVar11.h(d0Var11) | rVar11.d(i10);
                Object objP16 = rVar11.P();
                com.gamericefishpro.space.t0.f fVar5 = n.a;
                if (zH16 || objP16 == fVar5) {
                    objP16 = new com.gamericefishpro.space.f0.i(i10, 2, d0Var11);
                    rVar11.k0(objP16);
                }
                Function2 function5 = (Function2) objP16;
                rVar11.p(false);
                rVar11.a0(1690100192);
                boolean zH17 = rVar11.h(d0Var11) | rVar11.d(i10);
                Object objP17 = rVar11.P();
                if (zH17 || objP17 == fVar5) {
                    objP17 = new s(i10, 2, d0Var11);
                    rVar11.k0(objP17);
                }
                Function1 function6 = (Function1) objP17;
                rVar11.p(false);
                rVar11.a0(1690107866);
                boolean zH18 = rVar11.h(d0Var11);
                Object objP18 = rVar11.P();
                if (zH18 || objP18 == fVar5) {
                    objP18 = new m(d0Var11, 18);
                    rVar11.k0(objP18);
                }
                rVar11.p(false);
                com.gamericefishpro.space.n7.f.a(i10, function5, function6, (Function0) objP18, null, rVar11, 0);
                break;
        }
        return Unit.a;
    }
}
