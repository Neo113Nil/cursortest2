package defpackage;

import android.content.Context;
import com.yandex.messaging.MessengerEnvironment;
import java.io.File;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public abstract class tuu {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (defpackage.ydz.a.a() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OkHttpClient a(MessengerEnvironment messengerEnvironment, rz10 rz10Var, gsu gsuVar, Context context) {
        sa7 sa7Var = new sa7(new File(context.getCacheDir(), "network_cache"), 104857600L);
        OkHttpClient.a aVar = (OkHttpClient.a) rz10Var.n.invoke(new OkHttpClient.a());
        switch (n120.a[messengerEnvironment.ordinal()]) {
            case 3:
            case 6:
                break;
            case 1:
            case 2:
            case 4:
            case 5:
                aVar.d.add(new ahz(gsuVar, new dy00()));
                aVar.d.add(new a1s());
                aVar.l = sa7Var;
                return new OkHttpClient(aVar);
            default:
                w511.b();
                return null;
        }
    }
}
