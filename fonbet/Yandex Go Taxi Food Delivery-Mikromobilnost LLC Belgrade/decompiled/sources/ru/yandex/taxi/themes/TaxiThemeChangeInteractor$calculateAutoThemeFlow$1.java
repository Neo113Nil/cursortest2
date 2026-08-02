package ru.yandex.taxi.themes;

import defpackage.may0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/theme/ThemeType;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.themes.TaxiThemeChangeInteractor$calculateAutoThemeFlow$1", f = "TaxiThemeChangeInteractor.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 169, MSException.ERROR_BUSY, HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiThemeChangeInteractor$calculateAutoThemeFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeChangeInteractor$calculateAutoThemeFlow$1(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiThemeChangeInteractor$calculateAutoThemeFlow$1 taxiThemeChangeInteractor$calculateAutoThemeFlow$1 = new TaxiThemeChangeInteractor$calculateAutoThemeFlow$1(continuation, this.this$0);
        taxiThemeChangeInteractor$calculateAutoThemeFlow$1.L$0 = obj;
        return taxiThemeChangeInteractor$calculateAutoThemeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiThemeChangeInteractor$calculateAutoThemeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r11, r0, r10) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r10) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r11 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        may0 may0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            this.L$0 = vprVar;
            this.label = 1;
            obj = g.a(gVar, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            may0Var = (may0) this.L$1;
            kotlin.b.b(obj);
            long time = may0Var.b.getTime() - System.currentTimeMillis();
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            g gVar2 = this.this$0;
            gVar2.getClass();
            rol0 rol0Var = new rol0(new TaxiThemeChangeInteractor$calculateAutoThemeFlow$1(null, gVar2));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        may0Var = (may0) obj;
        ThemeType themeType = may0Var.a;
        this.L$0 = vprVar;
        this.L$1 = may0Var;
        this.label = 2;
    }
}
