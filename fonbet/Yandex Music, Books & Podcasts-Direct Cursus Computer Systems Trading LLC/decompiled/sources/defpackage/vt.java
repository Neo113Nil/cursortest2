package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class vt extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ z20 l;
    public final /* synthetic */ List m;
    public final /* synthetic */ Iterable n;
    public final /* synthetic */ yq o;
    public final /* synthetic */ xiu p;
    public MainDatabase q;
    public Iterator r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(ueo ueoVar, Continuation continuation, z20 z20Var, List list, Iterable iterable, yq yqVar, xiu xiuVar) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = z20Var;
        this.m = list;
        this.n = iterable;
        this.o = yqVar;
        this.p = xiuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new vt(this.k, continuation, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vt) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        int i;
        MainDatabase mainDatabase2;
        Iterator it;
        Object obj2 = nm6.a;
        int i2 = this.j;
        if (i2 == 0) {
            qgg.h0(obj);
            mainDatabase = (MainDatabase) this.k;
            this.q = mainDatabase;
            this.s = 0;
            this.j = 1;
            z20 z20Var = this.l;
            Object G = up6.G(z20Var.a, false, true, new kc(9, z20Var, this.m), this);
            if (G != obj2) {
                G = Unit.a;
            }
            if (G != obj2) {
                i = 0;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.s;
            it = this.r;
            mainDatabase2 = this.q;
            qgg.h0(obj);
            while (it.hasNext()) {
                oq oqVar = (oq) it.next();
                List<zp2> list = oqVar.n;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (zp2 zp2Var : list) {
                    arrayList.add(new vq(oqVar.a, zp2Var.a, zp2Var.b));
                }
                this.q = mainDatabase2;
                this.r = it;
                this.s = i;
                this.j = 2;
                yq yqVar = this.o;
                Object G2 = up6.G(yqVar.a, false, true, new kc(3, yqVar, arrayList), this);
                if (G2 != nm6.a) {
                    G2 = Unit.a;
                }
                if (G2 == obj2) {
                    return obj2;
                }
            }
            mainDatabase2.F("album", "album_artist");
            return Unit.a;
        }
        i = this.s;
        mainDatabase = this.q;
        qgg.h0(obj);
        mainDatabase2 = mainDatabase;
        it = this.n.iterator();
        while (it.hasNext()) {
        }
        mainDatabase2.F("album", "album_artist");
        return Unit.a;
    }
}
