package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class qtl extends aur implements Function1 {
    public int j;
    public final /* synthetic */ MainDatabase k;
    public final /* synthetic */ r4m l;
    public final /* synthetic */ long m;
    public final /* synthetic */ byr n;
    public final /* synthetic */ rtl o;
    public final /* synthetic */ String p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtl(MainDatabase mainDatabase, Continuation continuation, r4m r4mVar, long j, byr byrVar, rtl rtlVar, String str) {
        super(1, continuation);
        this.k = mainDatabase;
        this.l = r4mVar;
        this.m = j;
        this.n = byrVar;
        this.o = rtlVar;
        this.p = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new qtl(this.k, continuation, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qtl) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        nm6 nm6Var = nm6.a;
        int i2 = this.j;
        if (i2 == 0) {
            qgg.h0(obj);
            int i3 = this.n.a;
            i = 0;
            this.q = 0;
            this.j = 1;
            Object G = up6.G(this.l.a, false, true, new n1m(i3, this.m), this);
            if (G != nm6Var) {
                G = Unit.a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ((MainDatabase) obj).F("playlist");
                return Unit.a;
            }
            i = this.q;
            qgg.h0(obj);
        }
        i5h i5hVar = this.o.b;
        this.q = i;
        this.j = 2;
        obj = i5hVar.b(this.p, this);
    }
}
