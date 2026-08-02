package defpackage;

import android.content.Intent;
import com.appsflyer.AppsFlyerLib;
import com.yandex.plus.pay.api.model.AppDistribution;
import java.io.File;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final class yni extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ YMApplication k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yni(YMApplication yMApplication, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = yMApplication;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yni(this.k, continuation, 0);
            case 1:
                return new yni(this.k, continuation, 1);
            default:
                return new yni(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((yni) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                boolean z = zni.a;
                zni.a = new File(this.k.getFilesDir(), "mobile_api_enabled").exists();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "Relay:Broadcast", "send broadcast from the app", null);
                this.k.sendBroadcast(new Intent("ru.yandex.music.APP_READY"), "com.yandex.music.RELAY_PERMISSION");
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                YMApplication yMApplication = this.k;
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                appsFlyerLib.setHost("", "appsflyersdk.com");
                appsFlyerLib.setDebugLog(3 == wxf.u());
                rw0.c.getClass();
                Iterator it = rw0.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((rw0) obj2).b.equals(AppDistribution.GOOGLE_STORE)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                rw0 rw0Var = (rw0) obj2;
                if (rw0Var == null) {
                    rw0Var = rw0.d;
                    su4.s(2, null, "Unknown AppDistribution: GoogleStore", null);
                }
                appsFlyerLib.setOutOfStore(rw0Var.a);
                appsFlyerLib.init("2NSKGjzvktxfg6UX2gq5CX", new ax0(), yMApplication);
                appsFlyerLib.start(yMApplication);
                break;
        }
        return Unit.a;
    }
}
