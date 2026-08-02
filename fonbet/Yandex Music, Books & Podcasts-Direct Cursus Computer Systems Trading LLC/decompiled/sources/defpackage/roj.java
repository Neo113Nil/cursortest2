package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class roj implements l6e {
    public final OkHttpClient a;

    public roj(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    public final byte[] a(String str, Map map, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        map.getClass();
        try {
            OkHttpClient okHttpClient = this.a;
            b0o b0oVar = new b0o();
            for (Map.Entry entry : map.entrySet()) {
                b0oVar.a((String) entry.getKey(), (String) entry.getValue());
            }
            b0oVar.c(new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null));
            b0oVar.g(str);
            int length = bArr.length;
            cvt.c(bArr.length, 0, length);
            String str2 = null;
            b0oVar.e(ServiceCommand.TYPE_POST, new g0o(null, length, bArr));
            l3o execute = new mkn(okHttpClient, b0oVar.b(), false).execute();
            o3o o3oVar = execute.g;
            byte[] a = o3oVar != null ? o3oVar.a() : null;
            try {
                if (execute.b()) {
                    if (a == null) {
                        a = new byte[0];
                    }
                    execute.close();
                    return a;
                }
                int i = execute.d;
                if (a != null) {
                    Charset defaultCharset = Charset.defaultCharset();
                    defaultCharset.getClass();
                    str2 = new String(a, defaultCharset);
                }
                throw new PlaybackException.DrmThrowable.ErrorDrmProxyConnection(i, str2, new Throwable());
            } finally {
            }
        } catch (IOException e) {
            throw new PlaybackException.DrmThrowable.ErrorDrmProxyConnection(-1, null, e, 2, null);
        }
    }
}
