package defpackage;

import android.app.Application;
import android.content.ComponentName;
import com.yandex.plus2.sdk.widget.daily.internal.entry.DailyAppWidgetProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c87 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ n87 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c87(n87 n87Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = n87Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                c87 c87Var = new c87(this.m, continuation, 0);
                c87Var.l = obj;
                return c87Var;
            default:
                c87 c87Var2 = new c87(this.m, continuation, 1);
                c87Var2.l = obj;
                return c87Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e87 e87Var = (e87) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c87) create(e87Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7.h0(r8, r9, r10, r11, r12) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r14 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
    
        if (defpackage.n87.a(r4, false, r0, r13) == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r14 == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        if (defpackage.ime.I(r14, r1, r7, r13) == r6) goto L52;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        c87 c87Var;
        Object d2;
        int i = this.j;
        n87 n87Var = this.m;
        switch (i) {
            case 0:
                e87 e87Var = (e87) this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    n87Var.o.l(e87Var);
                    ime imeVar = n87Var.f;
                    z77 z77Var = e87Var.b;
                    String str = "New config received " + e87Var;
                    this.l = e87Var;
                    this.k = 1;
                    break;
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 == 2) {
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                    r7o r7oVar = z7o.b;
                    if (!(d instanceof t7o)) {
                        int i3 = DailyAppWidgetProvider.b;
                        Application application = n87Var.c.a;
                        application.getPackageManager().setComponentEnabledSetting(new ComponentName(application, (Class<?>) DailyAppWidgetProvider.class), e87Var.a ? 1 : 2, 1);
                    }
                    this.l = null;
                    this.k = 3;
                    break;
                } else if (i2 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    break;
                }
                ju0 ju0Var = n87Var.i;
                boolean z = e87Var.a;
                this.l = e87Var;
                this.k = 2;
                d = ju0Var.d(z, this);
                break;
            default:
                e87 e87Var2 = (e87) this.l;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    syb sybVar = n87Var.h;
                    String str2 = e87Var2.d;
                    String str3 = e87Var2.c;
                    z77 z77Var2 = e87Var2.b;
                    String str4 = n87Var.n;
                    str4.getClass();
                    this.l = e87Var2;
                    this.k = 1;
                    c87Var = this;
                    d2 = sybVar.d(str2, str3, z77Var2, str4, c87Var);
                    break;
                } else if (i4 == 1) {
                    qgg.h0(obj);
                    d2 = ((z7o) obj).a;
                    c87Var = this;
                } else if (i4 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                r7o r7oVar2 = z7o.b;
                if (d2 instanceof t7o) {
                    d2 = null;
                }
                j7a j7aVar = (j7a) d2;
                cr crVar = n87Var.e;
                String str5 = e87Var2.c;
                String str6 = j7aVar != null ? j7aVar.a : null;
                String str7 = j7aVar != null ? j7aVar.b : null;
                z77 z77Var3 = e87Var2.b;
                c87Var.l = null;
                c87Var.k = 2;
                break;
        }
        return Unit.a;
    }
}
