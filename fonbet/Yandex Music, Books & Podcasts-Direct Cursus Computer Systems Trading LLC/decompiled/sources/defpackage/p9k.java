package defpackage;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class p9k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9k(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p9k(this.l, continuation, 0);
            case 1:
                return new p9k(this.l, continuation, 1);
            default:
                return new p9k(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p9k) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    String str = this.l;
                    this.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    if (str.equals("1087931301371")) {
                        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) aec.e("firebase_passport").b(FirebaseMessaging.class);
                        firebaseMessaging.getClass();
                        onx d = firebaseMessaging.d();
                        d.getClass();
                        d.o(new pv9(27, new oec(zt3Var, 2)));
                        d.a(j8s.a, new o9k(zt3Var));
                        d.n(new cib(20, zt3Var));
                        Object q = zt3Var.q();
                        return q == nm6Var ? nm6Var : q;
                    }
                    xq0.x("Unknown passport senderId");
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                p9k p9kVar = new p9k(this.l, null, 0);
                this.k = 1;
                Object L = tyf.L(30000L, p9kVar, this);
                return L == nm6Var2 ? nm6Var2 : L;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    yec yecVar = yec.a;
                    this.k = 1;
                    obj = yecVar.b(this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Collection<dp6> values = ((Map) obj).values();
                String str2 = this.l;
                for (dp6 dp6Var : values) {
                    zmp zmpVar = new zmp(str2);
                    dp6Var.getClass();
                    String str3 = "App Quality Sessions session changed: " + zmpVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    nsh nshVar = dp6Var.b;
                    synchronized (nshVar) {
                        if (!Objects.equals((String) nshVar.d, str2)) {
                            nsh.H((jac) nshVar.b, (String) nshVar.c, str2);
                            nshVar.d = str2;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ymp.a + " of new session " + str2);
                }
                return Unit.a;
        }
    }
}
