package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r05 extends aur implements Function2 {
    public thn j;
    public Boolean k;
    public Boolean l;
    public String m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ e15 q;
    public final /* synthetic */ thn r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r05(e15 e15Var, thn thnVar, String str, Continuation continuation) {
        super(2, continuation);
        this.q = e15Var;
        this.r = thnVar;
        this.s = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new r05(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        if (r13 == r0) goto L28;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Boolean bool2;
        thn thnVar;
        String str;
        int i;
        int i2;
        nm6 nm6Var = nm6.a;
        int i3 = this.p;
        if (i3 == 0) {
            qgg.h0(obj);
            bool = Boolean.TRUE;
            bool2 = Boolean.FALSE;
            String str2 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
            str2.getClass();
            i5h g = this.q.g();
            thnVar = this.r;
            this.j = thnVar;
            this.k = bool;
            this.l = bool2;
            str = this.s;
            this.m = str;
            this.n = 0;
            this.o = 0;
            this.p = 1;
            obj = g.b(str2, this);
            if (obj != nm6Var) {
                i = 0;
                i2 = 0;
            }
            return nm6Var;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            return new Integer(((Number) obj).intValue());
        }
        i = this.o;
        i2 = this.n;
        str = this.m;
        bool2 = this.l;
        bool = this.k;
        thnVar = this.j;
        qgg.h0(obj);
        uxs Q = ((MainDatabase) obj).Q();
        ysr ysrVar = new ysr("track_mview");
        ysrVar.c = new String[]{"COUNT(*)"};
        um4 um4Var = new um4(pgp.a);
        if (thnVar != null) {
            um4Var.h("track_type", thnVar);
        }
        if (bool != null) {
            um4Var.c("liked", bool.booleanValue());
        }
        if (bool2 != null) {
            um4Var.c("track_for_kids", bool2.booleanValue());
        }
        if (str != null) {
            um4Var.d(str);
        }
        if (!Intrinsics.d(bool, Boolean.TRUE)) {
            um4Var.i("(available='OK' OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
        }
        tt0.K(ysrVar, um4Var);
        atn a = ysrVar.a();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = i2;
        this.o = i;
        this.p = 2;
        obj = Q.a(a, this);
    }
}
