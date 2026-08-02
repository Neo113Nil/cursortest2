package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class d2m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;
    public final /* synthetic */ List n;
    public MainDatabase o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2m(ueo ueoVar, Continuation continuation, boolean z, long j, List list) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = z;
        this.m = j;
        this.n = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new d2m(this.k, continuation, this.l, this.m, this.n);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d2m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9.b(r8.m, r8) == r0) goto L21;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        int i;
        MainDatabase mainDatabase2;
        Object obj2 = nm6.a;
        int i2 = this.j;
        if (i2 == 0) {
            qgg.h0(obj);
            mainDatabase = (MainDatabase) this.k;
            if (this.l) {
                q1m K = mainDatabase.K();
                this.o = mainDatabase;
                this.p = 0;
                this.j = 1;
            }
            i = 0;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mainDatabase2 = this.o;
                qgg.h0(obj);
                mainDatabase2.F("playlist_track");
                return Unit.a;
            }
            i = this.p;
            mainDatabase = this.o;
            qgg.h0(obj);
        }
        q1m K2 = mainDatabase.K();
        this.o = mainDatabase;
        this.p = i;
        this.j = 2;
        Object G = up6.G(K2.a, false, true, new avi(20, K2, this.n), this);
        if (G != obj2) {
            G = Unit.a;
        }
        if (G != obj2) {
            mainDatabase2 = mainDatabase;
            mainDatabase2.F("playlist_track");
            return Unit.a;
        }
        return obj2;
    }
}
