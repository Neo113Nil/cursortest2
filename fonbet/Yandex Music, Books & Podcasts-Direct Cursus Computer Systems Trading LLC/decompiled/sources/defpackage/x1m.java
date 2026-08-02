package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class x1m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ long l;
    public final /* synthetic */ List m;
    public MainDatabase n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1m(long j, ueo ueoVar, List list, Continuation continuation) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = j;
        this.m = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new x1m(this.l, this.k, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x1m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            MainDatabase mainDatabase2 = (MainDatabase) this.k;
            q1m K = mainDatabase2.K();
            this.n = mainDatabase2;
            this.j = 1;
            Object c = K.c(this.l, this.m, this);
            if (c == nm6Var) {
                return nm6Var;
            }
            mainDatabase = mainDatabase2;
            obj = c;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mainDatabase = this.n;
            qgg.h0(obj);
        }
        int intValue = ((Number) obj).intValue();
        if (intValue != 0) {
            mainDatabase.F("playlist_track");
        }
        return new Integer(intValue);
    }
}
