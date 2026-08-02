package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m44 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ p44 l;
    public final /* synthetic */ f24 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m44(p44 p44Var, f24 f24Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = p44Var;
        this.m = f24Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m44(this.l, this.m, continuation, 0);
            default:
                return new m44(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m44) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r12.emit(r1, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (defpackage.lmm.a(r12, r1, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r12.emit(r1, r11) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (defpackage.lmm.a(r12, r1, r11) == r0) goto L37;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        p44 p44Var = this.l;
        f24 f24Var = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str = p44.e;
                    wb7 a = p44Var.d().a("collection_section_pin_timestamps");
                    if (a != null) {
                        ssg.a(3, p44.e, "register pin for " + f24Var, null);
                        l44 l44Var = new l44(p44Var, f24Var, null);
                        this.k = 1;
                        break;
                    } else {
                        break;
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                x0q x0qVar = p44Var.c;
                String name = f24Var.name();
                this.k = 2;
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    String str2 = p44.e;
                    wb7 a2 = p44Var.d().a("collection_section_pin_timestamps");
                    if (a2 != null) {
                        ssg.a(3, p44.e, "register pin for " + f24Var, null);
                        o44 o44Var = new o44(p44Var, f24Var, null);
                        this.k = 1;
                        break;
                    } else {
                        break;
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                x0q x0qVar2 = p44Var.c;
                String name2 = f24Var.name();
                this.k = 2;
                break;
        }
        return Unit.a;
    }
}
