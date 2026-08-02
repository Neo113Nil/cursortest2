package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPClient;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class bs3 {
    public static final /* synthetic */ int b = 0;
    public Long a;

    static {
        long j = sdi.a(SSDPClient.PORT, 0).f;
        Calendar c = fut.c(null);
        c.setTimeInMillis(j);
        fut.a(c).getTimeInMillis();
        long j2 = sdi.a(2100, 11).f;
        Calendar c2 = fut.c(null);
        c2.setTimeInMillis(j2);
        fut.a(c2).getTimeInMillis();
    }
}
