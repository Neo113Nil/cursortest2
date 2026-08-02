package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ltl extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ MainDatabase l;
    public Iterator m;
    public int n;
    public int o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltl(MainDatabase mainDatabase, Continuation continuation, List list, rtl rtlVar, String str, r4m r4mVar) {
        super(1, continuation);
        this.l = mainDatabase;
        this.p = list;
        this.q = rtlVar;
        this.r = str;
        this.s = r4mVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ltl(this.l, continuation, this.p, (rtl) this.q, (String) this.r, (r4m) this.s);
            default:
                return new ltl(this.l, continuation, (ArrayList) this.p, (ArrayList) this.q, (v3t) this.r);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ltl) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        int i2;
        Object b;
        Iterator it2;
        int i3;
        MainDatabase mainDatabase;
        int i4;
        Iterator it3;
        int i5;
        int i6;
        MainDatabase mainDatabase2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    it = CollectionsKt.B0(this.p).iterator();
                    i = 0;
                    i2 = 0;
                } else if (i7 == 1) {
                    i = this.o;
                    i2 = this.n;
                    it = this.m;
                    qgg.h0(obj);
                } else if (i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    b = obj;
                    ((MainDatabase) b).F("playlist");
                    break;
                }
                while (it.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) it.next();
                    int i8 = indexedValue.a;
                    nvl nvlVar = (nvl) indexedValue.b;
                    r4m r4mVar = (r4m) this.s;
                    String str = nvlVar.a;
                    String str2 = nvlVar.b;
                    this.m = it;
                    this.n = i2;
                    this.o = i;
                    this.k = 1;
                    Object G = up6.G(r4mVar.a, false, true, new ql3(2, i8, str, str2), this);
                    if (G != nm6.a) {
                        G = Unit.a;
                    }
                    if (G == nm6Var) {
                        break;
                    }
                }
                i5h i5hVar = ((rtl) this.q).b;
                String str3 = (String) this.r;
                this.m = null;
                this.n = i2;
                this.k = 2;
                b = i5hVar.b(str3, this);
                if (b == nm6Var) {
                }
                ((MainDatabase) b).F("playlist");
                break;
            default:
                v3t v3tVar = (v3t) this.r;
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    it2 = CollectionsKt.H((ArrayList) this.p, 950).iterator();
                    i3 = 0;
                    mainDatabase = this.l;
                    i4 = 0;
                } else if (i9 == 1) {
                    i3 = this.o;
                    i4 = this.n;
                    it2 = this.m;
                    mainDatabase = (MainDatabase) this.s;
                    qgg.h0(obj);
                } else if (i9 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i5 = this.o;
                    i6 = this.n;
                    it3 = this.m;
                    mainDatabase2 = (MainDatabase) this.s;
                    qgg.h0(obj);
                    while (it3.hasNext()) {
                        List list = (List) it3.next();
                        this.s = mainDatabase2;
                        this.m = it3;
                        this.n = i6;
                        this.o = i5;
                        this.k = 2;
                        if (v3tVar.b(list, "NOT_AVAILABLE", this) == nm6Var2) {
                            break;
                        }
                    }
                    mainDatabase2.F("track");
                    break;
                }
                while (it2.hasNext()) {
                    List list2 = (List) it2.next();
                    this.s = mainDatabase;
                    this.m = it2;
                    this.n = i4;
                    this.o = i3;
                    this.k = 1;
                    if (v3tVar.b(list2, "OK", this) == nm6Var2) {
                        break;
                    }
                }
                it3 = CollectionsKt.H((ArrayList) this.q, 950).iterator();
                i5 = 0;
                i6 = i4;
                mainDatabase2 = mainDatabase;
                while (it3.hasNext()) {
                }
                mainDatabase2.F("track");
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltl(MainDatabase mainDatabase, Continuation continuation, ArrayList arrayList, ArrayList arrayList2, v3t v3tVar) {
        super(1, continuation);
        this.l = mainDatabase;
        this.p = arrayList;
        this.q = arrayList2;
        this.r = v3tVar;
    }
}
