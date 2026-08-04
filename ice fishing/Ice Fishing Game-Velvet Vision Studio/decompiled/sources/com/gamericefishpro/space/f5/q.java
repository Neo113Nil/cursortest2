package com.gamericefishpro.space.f5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.data.db.IceFishingDatabase;
import com.gamericefishpro.space.i9.g4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ q(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        e eVar = n0.i;
        int i2 = 29;
        int i3 = 0;
        e eVar2 = n0.a;
        int i4 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.c5.c) obj, "$this$initializer");
                return new p();
            case 1:
                x it = (x) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.i;
            case 2:
                x it2 = (x) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof z)) {
                    return null;
                }
                com.gamericefishpro.space.i5.j jVar = ((z) it2).y;
                return jVar.a(jVar.c);
            case 3:
                h0 navOptions = (h0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.b = true;
                return Unit.a;
            case 4:
                com.gamericefishpro.space.ki.b it3 = (com.gamericefishpro.space.ki.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return com.gamericefishpro.space.qj.a.a(it3);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                List list = (List) obj;
                return new com.gamericefishpro.space.g0.v(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj).intValue();
                return com.gamericefishpro.space.ph.g0.d;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj).getClass();
                com.gamericefishpro.space.g0.l lVar = com.gamericefishpro.space.g0.w.a;
                return -1;
            case 9:
                return new com.gamericefishpro.space.g5.a(com.gamericefishpro.space.z4.m0.c((com.gamericefishpro.space.c5.c) obj));
            case 10:
                return com.gamericefishpro.space.v.f0.a(com.gamericefishpro.space.w.c.o(700, 6, null));
            case RequestError.STOP_TRACKING /* 11 */:
                x xVar = ((k) ((com.gamericefishpro.space.v.q) obj).c()).e;
                Intrinsics.c(xVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i5 = x.w;
                for (x xVar2 : h.b((com.gamericefishpro.space.g5.h) xVar)) {
                }
                return null;
            case 12:
                return com.gamericefishpro.space.v.f0.b(com.gamericefishpro.space.w.c.o(700, 6, null));
            case 13:
                return ((k) obj).y;
            case 14:
                com.gamericefishpro.space.jj.a module = (com.gamericefishpro.space.jj.a) obj;
                Intrinsics.checkNotNullParameter(module, "$this$module");
                com.gamericefishpro.space.d0.b bVar = new com.gamericefishpro.space.d0.b(17);
                com.gamericefishpro.space.mj.b bVar2 = com.gamericefishpro.space.nj.a.e;
                com.gamericefishpro.space.fj.b bVar3 = com.gamericefishpro.space.fj.b.d;
                com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.ph.g0.d;
                com.gamericefishpro.space.fj.a beanDefinition = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(IceFishingDatabase.class), bVar, bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
                com.gamericefishpro.space.hj.d factory = new com.gamericefishpro.space.hj.d(beanDefinition);
                module.a(factory);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory, "factory");
                com.gamericefishpro.space.fj.a beanDefinition2 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.c.class), new com.gamericefishpro.space.d0.b(9), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition2, "beanDefinition");
                com.gamericefishpro.space.hj.d factory2 = new com.gamericefishpro.space.hj.d(beanDefinition2);
                module.a(factory2);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                com.gamericefishpro.space.fj.a beanDefinition3 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.n.class), new com.gamericefishpro.space.d0.b(15), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition3, "beanDefinition");
                com.gamericefishpro.space.hj.d factory3 = new com.gamericefishpro.space.hj.d(beanDefinition3);
                module.a(factory3);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                com.gamericefishpro.space.fj.a beanDefinition4 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.f.class), new com.gamericefishpro.space.d0.b(16), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition4, "beanDefinition");
                com.gamericefishpro.space.hj.d factory4 = new com.gamericefishpro.space.hj.d(beanDefinition4);
                module.a(factory4);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                com.gamericefishpro.space.fj.a beanDefinition5 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.d7.k.class), new com.gamericefishpro.space.d0.b(18), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition5, "beanDefinition");
                com.gamericefishpro.space.hj.d factory5 = new com.gamericefishpro.space.hj.d(beanDefinition5);
                module.a(factory5);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                com.gamericefishpro.space.fj.a beanDefinition6 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.h.class), new com.gamericefishpro.space.d0.b(19), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition6, "beanDefinition");
                com.gamericefishpro.space.hj.d factory6 = new com.gamericefishpro.space.hj.d(beanDefinition6);
                module.a(factory6);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory6, "factory");
                com.gamericefishpro.space.fj.a beanDefinition7 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.e.class), new com.gamericefishpro.space.d0.b(20), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition7, "beanDefinition");
                com.gamericefishpro.space.hj.d factory7 = new com.gamericefishpro.space.hj.d(beanDefinition7);
                module.a(factory7);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory7, "factory");
                com.gamericefishpro.space.fj.a beanDefinition8 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.g.class), new com.gamericefishpro.space.d0.b(21), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition8, "beanDefinition");
                com.gamericefishpro.space.hj.d factory8 = new com.gamericefishpro.space.hj.d(beanDefinition8);
                module.a(factory8);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory8, "factory");
                com.gamericefishpro.space.fj.a beanDefinition9 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.e7.b.class), new com.gamericefishpro.space.d0.b(22), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition9, "beanDefinition");
                com.gamericefishpro.space.hj.d factory9 = new com.gamericefishpro.space.hj.d(beanDefinition9);
                module.a(factory9);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory9, "factory");
                com.gamericefishpro.space.fj.a beanDefinition10 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.c7.m.class), new com.gamericefishpro.space.d0.b(23), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition10, "beanDefinition");
                com.gamericefishpro.space.hj.d factory10 = new com.gamericefishpro.space.hj.d(beanDefinition10);
                module.a(factory10);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory10, "factory");
                com.gamericefishpro.space.fj.a beanDefinition11 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.j.class), new com.gamericefishpro.space.d0.b(24), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition11, "beanDefinition");
                com.gamericefishpro.space.hj.d factory11 = new com.gamericefishpro.space.hj.d(beanDefinition11);
                module.a(factory11);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory11, "factory");
                com.gamericefishpro.space.fj.a beanDefinition12 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class), new com.gamericefishpro.space.d0.b(25), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition12, "beanDefinition");
                com.gamericefishpro.space.hj.d factory12 = new com.gamericefishpro.space.hj.d(beanDefinition12);
                module.a(factory12);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory12, "factory");
                com.gamericefishpro.space.fj.a beanDefinition13 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.x7.g.class), new com.gamericefishpro.space.d0.b(26), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition13, "beanDefinition");
                com.gamericefishpro.space.hj.d factory13 = new com.gamericefishpro.space.hj.d(beanDefinition13);
                module.a(factory13);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory13, "factory");
                com.gamericefishpro.space.fj.a beanDefinition14 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.x7.c.class), new com.gamericefishpro.space.d0.b(27), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition14, "beanDefinition");
                com.gamericefishpro.space.hj.d factory14 = new com.gamericefishpro.space.hj.d(beanDefinition14);
                module.a(factory14);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory14, "factory");
                com.gamericefishpro.space.fj.a beanDefinition15 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.x7.f.class), new com.gamericefishpro.space.d0.b(28), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition15, "beanDefinition");
                com.gamericefishpro.space.hj.d factory15 = new com.gamericefishpro.space.hj.d(beanDefinition15);
                module.a(factory15);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory15, "factory");
                com.gamericefishpro.space.fj.a beanDefinition16 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.w7.b.class), new com.gamericefishpro.space.d0.b(i2), bVar3, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition16, "beanDefinition");
                com.gamericefishpro.space.hj.d factory16 = new com.gamericefishpro.space.hj.d(beanDefinition16);
                module.a(factory16);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory16, "factory");
                com.gamericefishpro.space.g7.a aVar = new com.gamericefishpro.space.g7.a(i3);
                com.gamericefishpro.space.fj.b bVar4 = com.gamericefishpro.space.fj.b.e;
                com.gamericefishpro.space.fj.a beanDefinition17 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.t7.d.class), aVar, bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition17, "beanDefinition");
                com.gamericefishpro.space.hj.a factory17 = new com.gamericefishpro.space.hj.a(beanDefinition17);
                module.a(factory17);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory17, "factory");
                com.gamericefishpro.space.fj.a beanDefinition18 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.v7.i.class), new com.gamericefishpro.space.g7.a(i4), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition18, "beanDefinition");
                com.gamericefishpro.space.hj.a factory18 = new com.gamericefishpro.space.hj.a(beanDefinition18);
                module.a(factory18);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory18, "factory");
                com.gamericefishpro.space.fj.a beanDefinition19 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.l7.e.class), new com.gamericefishpro.space.d0.b(7), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition19, "beanDefinition");
                com.gamericefishpro.space.hj.a factory19 = new com.gamericefishpro.space.hj.a(beanDefinition19);
                module.a(factory19);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory19, "factory");
                com.gamericefishpro.space.fj.a beanDefinition20 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.r7.e.class), new com.gamericefishpro.space.d0.b(8), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition20, "beanDefinition");
                com.gamericefishpro.space.hj.a factory20 = new com.gamericefishpro.space.hj.a(beanDefinition20);
                module.a(factory20);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory20, "factory");
                com.gamericefishpro.space.fj.a beanDefinition21 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.n7.q.class), new com.gamericefishpro.space.d0.b(10), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition21, "beanDefinition");
                com.gamericefishpro.space.hj.a factory21 = new com.gamericefishpro.space.hj.a(beanDefinition21);
                module.a(factory21);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory21, "factory");
                com.gamericefishpro.space.fj.a beanDefinition22 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.k7.f.class), new com.gamericefishpro.space.d0.b(11), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition22, "beanDefinition");
                com.gamericefishpro.space.hj.a factory22 = new com.gamericefishpro.space.hj.a(beanDefinition22);
                module.a(factory22);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory22, "factory");
                com.gamericefishpro.space.fj.a beanDefinition23 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.s7.i.class), new com.gamericefishpro.space.d0.b(12), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition23, "beanDefinition");
                com.gamericefishpro.space.hj.a factory23 = new com.gamericefishpro.space.hj.a(beanDefinition23);
                module.a(factory23);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory23, "factory");
                com.gamericefishpro.space.fj.a beanDefinition24 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.u7.c.class), new com.gamericefishpro.space.d0.b(13), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition24, "beanDefinition");
                com.gamericefishpro.space.hj.a factory24 = new com.gamericefishpro.space.hj.a(beanDefinition24);
                module.a(factory24);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory24, "factory");
                com.gamericefishpro.space.fj.a beanDefinition25 = new com.gamericefishpro.space.fj.a(bVar2, com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.o7.e.class), new com.gamericefishpro.space.d0.b(14), bVar4, g0Var);
                Intrinsics.checkNotNullParameter(beanDefinition25, "beanDefinition");
                com.gamericefishpro.space.hj.a factory25 = new com.gamericefishpro.space.hj.a(beanDefinition25);
                module.a(factory25);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory25, "factory");
                return Unit.a;
            case 15:
                com.gamericefishpro.space.c5.c initializer = (com.gamericefishpro.space.c5.c) obj;
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new com.gamericefishpro.space.i5.b(com.gamericefishpro.space.z4.m0.c(initializer));
            case 16:
                x it4 = (x) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Integer.valueOf(it4.e.a);
            case 17:
                h0 navOptions2 = (h0) obj;
                Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                navOptions2.c = true;
                return Unit.a;
            case 18:
                x destination = (x) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                z zVar = destination.i;
                if (zVar == null || zVar.y.c != destination.e.a) {
                    return null;
                }
                return zVar;
            case 19:
                x destination2 = (x) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                z zVar2 = destination2.i;
                if (zVar2 == null || zVar2.y.c != destination2.e.a) {
                    return null;
                }
                return zVar2;
            case 20:
                j navArgument = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                navArgument.a(eVar);
                g4 g4Var = navArgument.a;
                g4Var.c = "";
                g4Var.a = true;
                return Unit.a;
            case 21:
                j navArgument2 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument2, "$this$navArgument");
                navArgument2.a(eVar2);
                return Unit.a;
            case 22:
                j navArgument3 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument3, "$this$navArgument");
                navArgument3.a(eVar2);
                return Unit.a;
            case 23:
                j navArgument4 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument4, "$this$navArgument");
                navArgument4.a(eVar2);
                return Unit.a;
            case 24:
                j navArgument5 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument5, "$this$navArgument");
                navArgument5.a(eVar2);
                return Unit.a;
            case 25:
                j navArgument6 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument6, "$this$navArgument");
                navArgument6.a(eVar2);
                return Unit.a;
            case 26:
                j navArgument7 = (j) obj;
                Intrinsics.checkNotNullParameter(navArgument7, "$this$navArgument");
                navArgument7.a(eVar);
                g4 g4Var2 = navArgument7.a;
                g4Var2.c = "NO_MOVES";
                g4Var2.a = true;
                return Unit.a;
            case 27:
                h0 navigate = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                navigate.a("splash", new q(i2));
                return Unit.a;
            case 28:
                h0 navigate2 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate2, "$this$navigate");
                navigate2.a("splash", new com.gamericefishpro.space.j7.c(i3));
                return Unit.a;
            default:
                r0 popUpTo = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.a = true;
                return Unit.a;
        }
    }
}
