package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class a2m extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ ueo l;
    public MainDatabase m;
    public int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2m(ueo ueoVar, Continuation continuation, MainDatabase mainDatabase, List list) {
        super(1, continuation);
        this.l = ueoVar;
        this.m = mainDatabase;
        this.o = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a2m(this.l, continuation, (nvl) this.o);
            default:
                return new a2m(this.l, continuation, this.m, (List) this.o);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((a2m) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
    
        if (r2 == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r3 == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0174, code lost:
    
        if (r2 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
    
        if (r3 == r1) goto L53;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        Object b;
        Object G;
        int i;
        int i2 = this.j;
        ueo ueoVar = this.l;
        Object obj2 = this.o;
        int i3 = 1;
        int i4 = 0;
        switch (i2) {
            case 0:
                nvl nvlVar = (nvl) obj2;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    mainDatabase = (MainDatabase) ueoVar;
                    r4m I = mainDatabase.I();
                    String str = nvlVar.a;
                    String str2 = nvlVar.b;
                    this.m = mainDatabase;
                    this.n = 0;
                    this.k = 1;
                    b = I.b(str, str2, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        G = obj;
                        Iterable<j2m> iterable = (Iterable) G;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (j2m j2mVar : iterable) {
                            long j = j2mVar.a;
                            long j2 = j2mVar.b;
                            String str3 = j2mVar.c;
                            String str4 = j2mVar.d;
                            int i6 = j2mVar.f;
                            tfs tfsVar = wc7.a;
                            arrayList.add(new i1m(j, j2, str3, str4, i6, wc7.a.b(j2mVar.e)));
                        }
                        return arrayList;
                    }
                    i4 = this.n;
                    mainDatabase = this.m;
                    qgg.h0(obj);
                    b = obj;
                }
                Long l = (Long) b;
                long longValue = l != null ? l.longValue() : -1L;
                if (longValue < 0) {
                    ssg.a(5, null, "Can not get playlist tracks for " + nvlVar + ", no such playlist", null);
                    return c5b.a;
                }
                q1m K = mainDatabase.K();
                this.m = null;
                this.n = i4;
                this.k = 2;
                G = up6.G(K.a, true, true, new fn1(longValue, 12), this);
                break;
            default:
                List list = (List) obj2;
                MainDatabase mainDatabase2 = this.m;
                Object obj3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    v3t T = mainDatabase2.T();
                    this.n = 0;
                    this.k = 1;
                    T.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM track WHERE original_id IN (");
                    swf.x(list.size(), sb);
                    sb.append(")");
                    Object G2 = up6.G(T.a, false, true, new i20(sb.toString(), list, 11), this);
                    if (G2 != obj3) {
                        G2 = Unit.a;
                    }
                    if (G2 != obj3) {
                        i = 0;
                    }
                    return obj3;
                }
                if (i7 == 1) {
                    i = this.n;
                    qgg.h0(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        mainDatabase2.F("track", "artist_track", "album_track");
                        return Unit.a;
                    }
                    i = this.n;
                    qgg.h0(obj);
                    j20 x = mainDatabase2.x();
                    this.n = i;
                    this.k = 3;
                    x.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM album_track WHERE track_id IN (");
                    swf.x(list.size(), sb2);
                    sb2.append(")");
                    Object G3 = up6.G(x.a, false, true, new i20(sb2.toString(), list, i4), this);
                    if (G3 != obj3) {
                        G3 = Unit.a;
                        break;
                    }
                }
                jk1 A = mainDatabase2.A();
                this.n = i;
                this.k = 2;
                A.getClass();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DELETE FROM artist_track WHERE track_id IN (");
                swf.x(list.size(), sb3);
                sb3.append(")");
                Object G4 = up6.G(A.a, false, true, new i20(sb3.toString(), list, i3), this);
                if (G4 != obj3) {
                    G4 = Unit.a;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2m(ueo ueoVar, Continuation continuation, nvl nvlVar) {
        super(1, continuation);
        this.l = ueoVar;
        this.o = nvlVar;
    }
}
