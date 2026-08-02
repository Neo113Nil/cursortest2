package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import android.content.Context;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.ako0;
import defpackage.atd0;
import defpackage.bko0;
import defpackage.bym0;
import defpackage.cno0;
import defpackage.cyx;
import defpackage.fcj0;
import defpackage.g8n0;
import defpackage.gzx;
import defpackage.hpr0;
import defpackage.jpj0;
import defpackage.lym0;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.nym0;
import defpackage.po21;
import defpackage.pzf;
import defpackage.qwc;
import defpackage.tls;
import defpackage.ukn0;
import defpackage.w030;
import defpackage.wnt;
import defpackage.xvf0;
import defpackage.ysd0;
import defpackage.zzs;
import java.util.Optional;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.e;

/* loaded from: classes6.dex */
public final class e extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final ukn0 G;
    public final nym0 H;
    public final lym0 I;

    public e(w030 w030Var, ukn0 ukn0Var, nym0 nym0Var, lym0 lym0Var) {
        super("ScootersArbitraryDestinationSelectionRouter");
        this.F = w030Var;
        this.G = ukn0Var;
        this.H = nym0Var;
        this.I = lym0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(Optional optional, ContinuationImpl continuationImpl) {
        ScootersArbitraryDestinationSelectionRouter$provideModalView$1 scootersArbitraryDestinationSelectionRouter$provideModalView$1;
        int i;
        lym0 lym0Var;
        nym0 nym0Var;
        zzs zzsVar;
        if (continuationImpl instanceof ScootersArbitraryDestinationSelectionRouter$provideModalView$1) {
            scootersArbitraryDestinationSelectionRouter$provideModalView$1 = (ScootersArbitraryDestinationSelectionRouter$provideModalView$1) continuationImpl;
            int i2 = scootersArbitraryDestinationSelectionRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersArbitraryDestinationSelectionRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersArbitraryDestinationSelectionRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersArbitraryDestinationSelectionRouter$provideModalView$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar2 = (zzs) optional.orElse(null);
                    scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$0 = null;
                    lym0Var = this.I;
                    scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$1 = lym0Var;
                    nym0Var = this.H;
                    scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$2 = nym0Var;
                    scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$3 = zzsVar2;
                    scootersArbitraryDestinationSelectionRouter$provideModalView$1.label = 1;
                    Object b = this.G.a.b(scootersArbitraryDestinationSelectionRouter$provideModalView$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zzsVar = zzsVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzs zzsVar3 = (zzs) scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$3;
                    nym0Var = (nym0) scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$2;
                    lym0Var = (lym0) scootersArbitraryDestinationSelectionRouter$provideModalView$1.L$1;
                    kotlin.b.b(obj);
                    zzsVar = zzsVar3;
                }
                g0 g0Var = (g0) obj;
                pzf pzfVar = nym0Var.a;
                d dVar = new d((ako0) ((n3w) pzfVar.b).a, (bko0) ((n3w) pzfVar.e).a, (wnt) ((xvf0) pzfVar.a).get(), (ah00) ((xvf0) pzfVar.c).get(), (qwc) ((xvf0) pzfVar.d).get(), (hpr0) ((xvf0) pzfVar.i).get(), (atd0) ((xvf0) pzfVar.f).get(), (po21) ((xvf0) pzfVar.g).get(), (ysd0) ((xvf0) pzfVar.h).get(), (cno0) ((xvf0) pzfVar.j).get(), (u) ((xvf0) pzfVar.k).get(), (cyx) ((xvf0) pzfVar.l).get(), (bym0) ((xvf0) pzfVar.m).get(), zzsVar, g0Var);
                final int i4 = 0;
                tls tlsVar = new tls(this) { // from class: oym0
                    public final /* synthetic */ e b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        e eVar = this.b;
                        zzs zzsVar4 = (zzs) obj2;
                        switch (i5) {
                            case 0:
                                eVar.r(new zef(2, zzsVar4));
                                break;
                            default:
                                eVar.r(new zef(3, zzsVar4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                tls tlsVar2 = new tls(this) { // from class: oym0
                    public final /* synthetic */ e b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        e eVar = this.b;
                        zzs zzsVar4 = (zzs) obj2;
                        switch (i5) {
                            case 0:
                                eVar.r(new zef(2, zzsVar4));
                                break;
                            default:
                                eVar.r(new zef(3, zzsVar4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                fcj0 fcj0Var = lym0Var.a;
                return new ScootersArbitraryDestinationSelectionModalView((Context) ((xvf0) fcj0Var.a).get(), (a3v) ((xvf0) fcj0Var.b).get(), (gzx) ((xvf0) fcj0Var.c).get(), (ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a) ((jpj0) fcj0Var.d).get(), (g8n0) ((xvf0) fcj0Var.e).get(), tlsVar, tlsVar2, dVar);
            }
        }
        scootersArbitraryDestinationSelectionRouter$provideModalView$1 = new ScootersArbitraryDestinationSelectionRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersArbitraryDestinationSelectionRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersArbitraryDestinationSelectionRouter$provideModalView$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        g0 g0Var2 = (g0) obj2;
        pzf pzfVar2 = nym0Var.a;
        d dVar2 = new d((ako0) ((n3w) pzfVar2.b).a, (bko0) ((n3w) pzfVar2.e).a, (wnt) ((xvf0) pzfVar2.a).get(), (ah00) ((xvf0) pzfVar2.c).get(), (qwc) ((xvf0) pzfVar2.d).get(), (hpr0) ((xvf0) pzfVar2.i).get(), (atd0) ((xvf0) pzfVar2.f).get(), (po21) ((xvf0) pzfVar2.g).get(), (ysd0) ((xvf0) pzfVar2.h).get(), (cno0) ((xvf0) pzfVar2.j).get(), (u) ((xvf0) pzfVar2.k).get(), (cyx) ((xvf0) pzfVar2.l).get(), (bym0) ((xvf0) pzfVar2.m).get(), zzsVar, g0Var2);
        final int i42 = 0;
        tls tlsVar3 = new tls(this) { // from class: oym0
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj22) {
                int i5 = i42;
                zy11 zy11Var = zy11.a;
                e eVar = this.b;
                zzs zzsVar4 = (zzs) obj22;
                switch (i5) {
                    case 0:
                        eVar.r(new zef(2, zzsVar4));
                        break;
                    default:
                        eVar.r(new zef(3, zzsVar4));
                        break;
                }
                return zy11Var;
            }
        };
        tls tlsVar22 = new tls(this) { // from class: oym0
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj22) {
                int i5 = i32;
                zy11 zy11Var = zy11.a;
                e eVar = this.b;
                zzs zzsVar4 = (zzs) obj22;
                switch (i5) {
                    case 0:
                        eVar.r(new zef(2, zzsVar4));
                        break;
                    default:
                        eVar.r(new zef(3, zzsVar4));
                        break;
                }
                return zy11Var;
            }
        };
        fcj0 fcj0Var2 = lym0Var.a;
        return new ScootersArbitraryDestinationSelectionModalView((Context) ((xvf0) fcj0Var2.a).get(), (a3v) ((xvf0) fcj0Var2.b).get(), (gzx) ((xvf0) fcj0Var2.c).get(), (ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a) ((jpj0) fcj0Var2.d).get(), (g8n0) ((xvf0) fcj0Var2.e).get(), tlsVar3, tlsVar22, dVar2);
    }
}
