package defpackage;

import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.congratulations.CongratulationsScreenActivity;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes5.dex */
public final class e7h extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ MainScreenActivity l;
    public final /* synthetic */ yxc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h(yxc yxcVar, MainScreenActivity mainScreenActivity, Continuation continuation) {
        super(2, continuation);
        this.m = yxcVar;
        this.l = mainScreenActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e7h(this.m, this.l, continuation);
            default:
                return new e7h(this.l, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e7h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (defpackage.tyf.M(r8, r11, r10) == r0) goto L22;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        yxc yxcVar = this.m;
        MainScreenActivity mainScreenActivity = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (yxcVar != null && yxcVar.h) {
                        efe efeVar = mainScreenActivity.M0;
                        String str = yxcVar.a.a;
                        this.k = 1;
                        obj = ((hfe) efeVar).a(str, this);
                        if (obj == nm6Var) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i3 = CongratulationsScreenActivity.x;
                    mainScreenActivity.startActivity(new Intent(mainScreenActivity, (Class<?>) CongratulationsScreenActivity.class));
                }
                break;
            default:
                Object obj2 = nm6.a;
                int i4 = this.k;
                int i5 = 2;
                if (i4 == 0) {
                    qgg.h0(obj);
                    if (!mainScreenActivity.isFinishing()) {
                        long j = MainScreenActivity.S0;
                        e7h e7hVar = new e7h(yxcVar, mainScreenActivity, (Continuation) null);
                        this.k = 1;
                        break;
                    } else {
                        break;
                    }
                } else if (i4 == 1) {
                    qgg.h0(obj);
                } else if (i4 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                efe efeVar2 = mainScreenActivity.M0;
                this.k = 2;
                Object a = lmm.a(((hfe) efeVar2).a, new xc(i5, 25, continuation), this);
                if (a != obj2) {
                    a = Unit.a;
                    break;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h(MainScreenActivity mainScreenActivity, yxc yxcVar, Continuation continuation) {
        super(2, continuation);
        this.l = mainScreenActivity;
        this.m = yxcVar;
    }
}
