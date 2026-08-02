package ru.yandex.taxi.themes;

import defpackage.g92;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.m3x0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nay0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.s5w0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.themes.TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1", f = "TaxiThemeChangeInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
public final class TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1(Continuation continuation, g gVar) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1 taxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1 = new TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        taxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        taxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return taxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) pair.getFirst();
            ThemeChangeMode themeChangeMode = (ThemeChangeMode) pair.getSecond();
            g gVar = this.this$0;
            gVar.getClass();
            h3y h3yVar = gVar.f;
            if (!darkThemeSwitchExperiment.b) {
                g92Var = new g92(2, ThemeType.LIGHT);
            } else if (themeChangeMode != null) {
                int i2 = nay0.a[themeChangeMode.ordinal()];
                if (i2 == 1) {
                    g92Var = new g92(2, ThemeType.DARK);
                } else if (i2 == 2) {
                    g92Var = new g92(2, ThemeType.LIGHT);
                } else if (i2 == 3) {
                    g92Var = darkThemeSwitchExperiment.d ? kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new jqr(new d(new jqr(new mth(new j0(null, new n(new b(((ru.yandex.taxi.preorder.source.userposition.e) ((po21) gVar.e.get())).n()), new TaxiThemeChangeInteractor$locationUpdatesFlow$2(null, gVar)), new TaxiThemeChangeInteractor$locationUpdatesFlow$$inlined$withPreviousEmit$1()), 6), new TaxiThemeChangeInteractor$locationUpdatesFlow$3(), 0)), new TaxiThemeChangeInteractor$autoThemeFlow$1(null, gVar), 3), kotlinx.coroutines.flow.e.g(new TaxiThemeChangeInteractor$systemTimeChangedFlow$$inlined$simpleCallbackApiToFlow$1(new s5w0(25, gVar), null))}, 2)), new TaxiThemeChangeInteractor$autoThemeFlow$$inlined$flatMapLatest$1(null, gVar)) : new g92(2, ThemeType.LIGHT);
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    g92Var = darkThemeSwitchExperiment.f ? new f(((m3x0) h3yVar.get()).b) : new g92(2, ThemeType.LIGHT);
                }
            } else {
                int i3 = nay0.b[darkThemeSwitchExperiment.e.ordinal()];
                if (i3 == 1) {
                    g92Var = new g92(2, ThemeType.DARK);
                } else if (i3 == 2) {
                    g92Var = new g92(2, ThemeType.LIGHT);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    g92Var = new f(((m3x0) h3yVar.get()).b);
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
