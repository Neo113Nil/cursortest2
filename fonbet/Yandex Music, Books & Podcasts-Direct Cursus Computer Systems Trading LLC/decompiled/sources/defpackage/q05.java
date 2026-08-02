package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class q05 extends aur implements Function2 {
    public Integer j;
    public Boolean k;
    public Boolean l;
    public String m;
    public String n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ e15 r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ Boolean t;
    public final /* synthetic */ Boolean u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q05(e15 e15Var, Integer num, Boolean bool, Boolean bool2, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.r = e15Var;
        this.s = num;
        this.t = bool;
        this.u = bool2;
        this.v = str;
        this.w = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new q05(this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0143, code lost:
    
        if (r2 == r1) goto L33;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        int i;
        Integer num;
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        int i2;
        Object a;
        nm6 nm6Var = nm6.a;
        int i3 = this.q;
        if (i3 == 0) {
            qgg.h0(obj);
            String str3 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
            str3.getClass();
            i5h g = this.r.g();
            Integer num2 = this.s;
            this.j = num2;
            Boolean bool3 = this.t;
            this.k = bool3;
            Boolean bool4 = this.u;
            this.l = bool4;
            String str4 = this.v;
            this.m = str4;
            String str5 = this.w;
            this.n = str5;
            this.o = 0;
            this.p = 0;
            this.q = 1;
            b = g.b(str3, this);
            if (b != nm6Var) {
                i = 0;
                num = num2;
                bool = bool3;
                bool2 = bool4;
                str = str4;
                str2 = str5;
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
            a = obj;
            List list = (List) a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ezf.W((qwl) it.next()));
            }
            return arrayList;
        }
        int i4 = this.p;
        int i5 = this.o;
        String str6 = this.n;
        String str7 = this.m;
        Boolean bool5 = this.l;
        Boolean bool6 = this.k;
        Integer num3 = this.j;
        qgg.h0(obj);
        num = num3;
        bool = bool6;
        bool2 = bool5;
        str = str7;
        str2 = str6;
        i2 = i5;
        i = i4;
        b = obj;
        swl J = ((MainDatabase) b).J();
        ysr ysrVar = new ysr("playlist_mview");
        um4 um4Var = new um4(pgp.a);
        if (bool != null) {
            um4Var.c("playlist_for_kids", bool.booleanValue());
        }
        if (bool2 != null) {
            um4Var.c("liked", bool2.booleanValue());
        }
        List h = u75.h(xxr.b, yxr.b);
        ArrayList arrayList2 = new ArrayList(v75.o(h, 10));
        Iterator it2 = h.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((byr) it2.next()).a));
        }
        um4Var.g("sync", arrayList2);
        if (str != null) {
            um4Var.i("uid = ?", xz0.X(new Object[]{str}));
        }
        if (str2 != null) {
            um4Var.i("uid != ?", xz0.X(new Object[]{str2}));
        }
        tt0.K(ysrVar, um4Var);
        ysrVar.f = "original_id = 3 DESC, position ASC";
        if (num != null) {
            ysrVar.b(String.valueOf(num.intValue()));
        }
        atn a2 = ysrVar.a();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = i2;
        this.p = i;
        this.q = 2;
        a = J.a(a2, this);
    }
}
