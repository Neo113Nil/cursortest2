package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class kxj extends uif implements Function0 {
    public final /* synthetic */ lxj r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxj(lxj lxjVar, List list) {
        super(0);
        this.r = lxjVar;
        this.s = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        lxj lxjVar = this.r;
        String str = lxjVar.b.to(this.s);
        Timber.INSTANCE.tag("OttTrackingApiImpl").d(str, new Object[0]);
        OkHttpClient okHttpClient = lxjVar.a;
        b0o b0oVar = new b0o();
        b0oVar.g("https://tracking.ott.yandex.net/v1/watch-batch");
        b0oVar.a(HttpMessage.USER_AGENT, lxjVar.c);
        b0oVar.e(ServiceCommand.TYPE_POST, ybl.b(str, lxj.d));
        o3o o3oVar = new mkn(okHttpClient, b0oVar.b(), false).execute().g;
        if (o3oVar == null) {
            return null;
        }
        o3oVar.close();
        return Unit.a;
    }
}
