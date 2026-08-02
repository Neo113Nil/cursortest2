package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o05 extends aur implements Function2 {
    public Boolean j;
    public Integer k;
    public vhn l;
    public Boolean m;
    public String n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ e15 r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ vhn t;
    public final /* synthetic */ Boolean u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o05(e15 e15Var, Integer num, vhn vhnVar, Boolean bool, String str, Continuation continuation) {
        super(2, continuation);
        this.r = e15Var;
        this.s = num;
        this.t = vhnVar;
        this.u = bool;
        this.v = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new o05(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        if (r14 == r0) goto L35;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Integer num;
        vhn vhnVar;
        Boolean bool2;
        String str;
        int i;
        int i2;
        nm6 nm6Var = nm6.a;
        int i3 = this.q;
        if (i3 == 0) {
            qgg.h0(obj);
            bool = Boolean.TRUE;
            String str2 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
            str2.getClass();
            i5h g = this.r.g();
            this.j = bool;
            num = this.s;
            this.k = num;
            vhnVar = this.t;
            this.l = vhnVar;
            bool2 = this.u;
            this.m = bool2;
            str = this.v;
            this.n = str;
            this.o = 0;
            this.p = 0;
            this.q = 1;
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
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ngg.M((rxs) it.next()));
            }
            return arrayList;
        }
        i = this.p;
        i2 = this.o;
        str = this.n;
        bool2 = this.m;
        vhnVar = this.l;
        num = this.k;
        bool = this.j;
        qgg.h0(obj);
        uxs Q = ((MainDatabase) obj).Q();
        ysr ysrVar = new ysr("track_mview");
        um4 um4Var = new um4(pgp.a);
        if (vhnVar != null) {
            um4Var.h("track_type", vhnVar);
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
        Boolean bool3 = Boolean.TRUE;
        if (!Intrinsics.d(bool, bool3)) {
            um4Var.i("(available='OK' OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
        }
        tt0.K(ysrVar, um4Var);
        ysrVar.f = Intrinsics.d(bool, bool3) ? "liked_timestamp DESC, position ASC" : "timestamp DESC, position ASC";
        if (num != null) {
            ysrVar.b(String.valueOf(num.intValue()));
        }
        atn a = ysrVar.a();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = i2;
        this.p = i;
        this.q = 2;
        obj = Q.b(a, this);
    }
}
