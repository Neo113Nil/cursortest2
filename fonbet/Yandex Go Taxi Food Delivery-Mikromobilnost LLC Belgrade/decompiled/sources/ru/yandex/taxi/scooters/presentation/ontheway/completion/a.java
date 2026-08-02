package ru.yandex.taxi.scooters.presentation.ontheway.completion;

import defpackage.a4n0;
import defpackage.a6o0;
import defpackage.b6o0;
import defpackage.b9n0;
import defpackage.c9n0;
import defpackage.dan0;
import defpackage.e4n0;
import defpackage.e9n0;
import defpackage.ean0;
import defpackage.fan0;
import defpackage.gan0;
import defpackage.h55;
import defpackage.han0;
import defpackage.hz7;
import defpackage.ian0;
import defpackage.iar;
import defpackage.jl40;
import defpackage.jon0;
import defpackage.k4a;
import defpackage.k9n0;
import defpackage.kqe0;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.n6o;
import defpackage.ny61;
import defpackage.q8n0;
import defpackage.qdz;
import defpackage.r7p0;
import defpackage.tje;
import defpackage.v1n0;
import defpackage.w511;
import defpackage.wnn0;
import defpackage.xnn0;
import defpackage.yvf0;
import defpackage.z1b1;
import defpackage.zdk0;
import defpackage.zjn0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzc;
import defpackage.zzs;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final k4a J;
    public final xnn0 K;

    public a(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, k4a k4aVar, xnn0 xnn0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = yvf0Var3;
        this.G = yvf0Var4;
        this.H = yvf0Var5;
        this.I = yvf0Var6;
        this.J = k4aVar;
        this.K = xnn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, zuo0 zuo0Var, zzc zzcVar, ContinuationImpl continuationImpl) {
        ScootersCompletionRouter$executeCompletionLogicOfScooter$1 scootersCompletionRouter$executeCompletionLogicOfScooter$1;
        int i;
        qdz a;
        Object b;
        wnn0 wnn0Var;
        aVar.getClass();
        if (continuationImpl instanceof ScootersCompletionRouter$executeCompletionLogicOfScooter$1) {
            scootersCompletionRouter$executeCompletionLogicOfScooter$1 = (ScootersCompletionRouter$executeCompletionLogicOfScooter$1) continuationImpl;
            int i2 = scootersCompletionRouter$executeCompletionLogicOfScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionRouter$executeCompletionLogicOfScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionRouter$executeCompletionLogicOfScooter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionRouter$executeCompletionLogicOfScooter$1.label;
                boolean z = false;
                if (i != 0) {
                    b.b(obj);
                    if (jl40.l(zzcVar, hz7.a)) {
                        aVar.D((m950) aVar.G.get(), new e4n0(zuo0Var.m(), zuo0Var.getNumber(), new a4n0(kyh0.scooters_cancel_riding_title, kyh0.scooters_cancel_riding_button, kyh0.common_back)), new ean0(0, aVar));
                    } else if (zzcVar instanceof iar) {
                        a = z1b1.a(zuo0Var);
                        xnn0 xnn0Var = aVar.K;
                        scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$0 = zuo0Var;
                        scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$1 = zzcVar;
                        scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$2 = a;
                        scootersCompletionRouter$executeCompletionLogicOfScooter$1.label = 1;
                        b = xnn0Var.a.b(scootersCompletionRouter$executeCompletionLogicOfScooter$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (!(zzcVar instanceof n6o)) {
                            w511.b();
                            return null;
                        }
                        n6o n6oVar = (n6o) zzcVar;
                        ScootersEvolvingFailedException scootersEvolvingFailedException = n6oVar.a;
                        ScootersErrorCode errorCode = scootersEvolvingFailedException.getErrorCode();
                        int i3 = errorCode == null ? -1 : dan0.a[errorCode.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            r7p0 number = zuo0Var.getNumber();
                            String m = zuo0Var.m();
                            ScootersErrorCode errorCode2 = scootersEvolvingFailedException.getErrorCode();
                            aVar.D((m950) aVar.H.get(), new jon0(m, number, errorCode2), new ian0(aVar, new zdk0(20, zuo0Var, n6oVar, aVar), errorCode2));
                        } else {
                            aVar.D((m950) aVar.F.get(), new zjn0(zuo0Var.m(), scootersEvolvingFailedException, Collections.singletonList(zuo0Var.getNumber().a)), new gan0(aVar, scootersEvolvingFailedException, zuo0Var));
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qdz qdzVar = (qdz) scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$2;
                zzcVar = (zzc) scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$1;
                zuo0 zuo0Var2 = (zuo0) scootersCompletionRouter$executeCompletionLogicOfScooter$1.L$0;
                b.b(obj);
                a = qdzVar;
                zuo0Var = zuo0Var2;
                b = obj;
                wnn0Var = (wnn0) b;
                if (wnn0Var.b) {
                    List list = wnn0Var.c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            wnn0.a aVar2 = (wnn0.a) it.next();
                            if (jl40.l(aVar2.a, zuo0Var.e()) && !aVar2.b.isEmpty()) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                if (a == null && z) {
                    aVar.D((m950) aVar.J.get(), new q8n0(zuo0Var, ((iar) zzcVar).a ? new c9n0(a) : new b9n0(a)), new fan0(new kqe0(21, aVar, zzcVar, zuo0Var), aVar));
                } else {
                    iar iarVar = (iar) zzcVar;
                    Q(aVar, iarVar.a, new b6o0(zuo0Var), iarVar.b, null, false, null, 56);
                }
                return zy11.a;
            }
        }
        scootersCompletionRouter$executeCompletionLogicOfScooter$1 = new ScootersCompletionRouter$executeCompletionLogicOfScooter$1(aVar, continuationImpl);
        Object obj2 = scootersCompletionRouter$executeCompletionLogicOfScooter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionRouter$executeCompletionLogicOfScooter$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        wnn0Var = (wnn0) b;
        if (wnn0Var.b) {
        }
        if (a == null) {
        }
        iar iarVar2 = (iar) zzcVar;
        Q(aVar, iarVar2.a, new b6o0(zuo0Var), iarVar2.b, null, false, null, 56);
        return zy11.a;
    }

    public static void Q(a aVar, boolean z, a6o0 a6o0Var, zzs zzsVar, CharSequence charSequence, boolean z2, ScootersErrorCode scootersErrorCode, int i) {
        if ((i & 8) != 0) {
            charSequence = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            scootersErrorCode = null;
        }
        if (!z) {
            aVar.r(new v1n0(8));
            return;
        }
        boolean z3 = z2;
        CharSequence charSequence2 = charSequence;
        aVar.D((m950) aVar.I.get(), new k9n0(a6o0Var, charSequence2, z3, zzsVar, scootersErrorCode), new han0(aVar, a6o0Var, charSequence2, z3, zzsVar, scootersErrorCode));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        e9n0 e9n0Var = (e9n0) obj;
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersCompletionRouter$onLaunch$1(this, e9n0Var.b, e9n0Var, null), 1);
    }
}
