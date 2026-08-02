package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes6.dex */
public final class ij2 {
    public static final List c = Arrays.asList(503, Integer.valueOf(NetworkRequestException.TOO_MANY_REQUESTS));
    public final OkHttpClient a;
    public final String b;

    public ij2(String str) {
        this.b = str;
        y6e y6eVar = new y6e();
        y6eVar.c = 1;
        joj jojVar = new joj();
        jojVar.f = true;
        jojVar.c.add(new hj2(0));
        jojVar.c.add(y6eVar);
        this.a = new OkHttpClient(jojVar);
    }

    public final b0o a(String str, String str2) {
        b0o b0oVar = new b0o();
        Locale locale = Locale.ENGLISH;
        b0oVar.a("Authorization", "OAuth " + str);
        b0oVar.a(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        b0oVar.g(this.b.concat(str2));
        return b0oVar;
    }
}
