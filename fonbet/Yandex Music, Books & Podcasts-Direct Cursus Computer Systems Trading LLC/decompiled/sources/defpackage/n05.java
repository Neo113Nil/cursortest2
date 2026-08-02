package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class n05 extends aur implements Function2 {
    public Integer j;
    public Boolean k;
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
    public n05(e15 e15Var, Integer num, vhn vhnVar, Boolean bool, String str, Continuation continuation) {
        super(2, continuation);
        this.r = e15Var;
        this.s = num;
        this.t = vhnVar;
        this.u = bool;
        this.v = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new n05(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        if (r14 == r0) goto L28;
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
            num = this.s;
            this.j = num;
            this.k = bool;
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
                arrayList.add(h4a.X((zv) it.next()));
            }
            return arrayList;
        }
        i = this.p;
        i2 = this.o;
        str = this.n;
        bool2 = this.m;
        vhnVar = this.l;
        bool = this.k;
        num = this.j;
        qgg.h0(obj);
        cw w = ((MainDatabase) obj).w();
        ysr ysrVar = new ysr("album_mview");
        um4 um4Var = new um4(pgp.a);
        um4Var.i("(available=1 OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
        if (bool != null) {
            um4Var.c("liked", bool.booleanValue());
        }
        if (vhnVar != null) {
            um4Var.h("album_type", vhnVar);
        }
        if (bool2 != null) {
            um4Var.c("album_for_kids", bool2.booleanValue());
        }
        if (str != null) {
            um4Var.d(str);
        }
        tt0.K(ysrVar, um4Var);
        ysrVar.f = "timestamp DESC";
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
        obj = w.b(a, this);
    }
}
