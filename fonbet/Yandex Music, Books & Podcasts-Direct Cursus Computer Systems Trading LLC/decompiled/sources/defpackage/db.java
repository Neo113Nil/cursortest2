package defpackage;

import android.webkit.CookieManager;
import android.webkit.WebStorage;
import com.yandex.plus.home.internal.di.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class db extends aur implements Function2 {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new db(2, 0, continuation);
            case 1:
                return new db(2, 1, continuation);
            case 2:
                return new db(2, 2, continuation);
            case 3:
                return new db(2, 3, continuation);
            case 4:
                return new db(2, 4, continuation);
            case 5:
                return new db(2, 5, continuation);
            case 6:
                return new db(2, 6, continuation);
            case 7:
                return new db(2, 7, continuation);
            case 8:
                return new db(2, 8, continuation);
            case 9:
                return new db(2, 9, continuation);
            case 10:
                return new db(2, 10, continuation);
            case 11:
                return new db(2, 11, continuation);
            case 12:
                return new db(2, 12, continuation);
            case 13:
                return new db(2, 13, continuation);
            case 14:
                return new db(2, 14, continuation);
            case 15:
                return new db(2, 15, continuation);
            case 16:
                return new db(2, 16, continuation);
            case 17:
                return new db(2, 17, continuation);
            case 18:
                return new db(2, 18, continuation);
            case 19:
                return new db(2, 19, continuation);
            case 20:
                return new db(2, 20, continuation);
            case 21:
                return new db(2, 21, continuation);
            case 22:
                return new db(2, 22, continuation);
            default:
                return new db(2, 23, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 3:
                ((db) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 17:
                ((db) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((db) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        n4q n4qVar = n4q.b;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                bec a = bec.a();
                if (!a.a.b.h()) {
                    ssg.a(7, "CrashlyticsCore", "unexpected crashlytics collection state: expected enabled, was disabled", null);
                    a.b(true);
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                new z4l();
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "Relay:Service", "streamStateUpdates() - starting stream", null);
                break;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                break;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                break;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                break;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                break;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                break;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                break;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                break;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                break;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                break;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                CookieManager.getInstance().flush();
                WebStorage.getInstance().deleteAllData();
                break;
            default:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                ctm.i.f.a(s.g);
                break;
        }
        return Unit.a;
    }
}
