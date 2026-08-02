package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class otl extends aur implements Function1 {
    public int j;
    public final /* synthetic */ MainDatabase k;
    public final /* synthetic */ r4m l;
    public final /* synthetic */ nvl m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Long o;
    public final /* synthetic */ rtl p;
    public final /* synthetic */ String q;
    public int r;
    public long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otl(MainDatabase mainDatabase, Continuation continuation, r4m r4mVar, nvl nvlVar, boolean z, Long l, rtl rtlVar, String str) {
        super(1, continuation);
        this.k = mainDatabase;
        this.l = r4mVar;
        this.m = nvlVar;
        this.n = z;
        this.o = l;
        this.p = rtlVar;
        this.q = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new otl(this.k, continuation, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((otl) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        if (r15 != r0) goto L31;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        long j;
        nm6 nm6Var = nm6.a;
        int i3 = this.j;
        r4m r4mVar = this.l;
        String str = null;
        if (i3 == 0) {
            qgg.h0(obj);
            nvl nvlVar = this.m;
            String str2 = nvlVar.a;
            String str3 = nvlVar.b;
            this.r = 0;
            this.j = 1;
            obj = r4mVar.b(str2, str3, this);
            if (obj != nm6Var) {
                i = 0;
            }
            return nm6Var;
        }
        if (i3 == 1) {
            i = this.r;
            qgg.h0(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ((MainDatabase) obj).F("playlist");
                return Unit.a;
            }
            j = this.s;
            i2 = this.r;
            qgg.h0(obj);
            i5h i5hVar = this.p.b;
            this.r = i2;
            this.s = j;
            this.j = 3;
            obj = i5hVar.b(this.q, this);
        }
        Long l = (Long) obj;
        if (l == null) {
            return Unit.a;
        }
        long longValue = l.longValue();
        Long l2 = this.o;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            tfs tfsVar = wc7.a;
            str = wc7.a(new Date(longValue2));
        }
        this.r = i;
        this.s = longValue;
        this.j = 2;
        Object G = up6.G(r4mVar.a, false, true, new q4m(0, longValue, str, this.n), this);
        if (G != nm6Var) {
            G = Unit.a;
        }
        if (G != nm6Var) {
            i2 = i;
            j = longValue;
            i5h i5hVar2 = this.p.b;
            this.r = i2;
            this.s = j;
            this.j = 3;
            obj = i5hVar2.b(this.q, this);
        }
        return nm6Var;
    }
}
