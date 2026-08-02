package defpackage;

import android.net.Uri;
import java.util.Set;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class bjq implements z8h {
    public final cke a;

    static {
        btf.b(wjp.v);
    }

    public bjq(cke ckeVar, ujl ujlVar) {
        this.a = ckeVar;
    }

    public final void a(Uri.Builder builder, Uri uri, String str, String str2) {
        if (uri.getQueryParameter(str) == null) {
            builder.appendQueryParameter(str, str2);
        }
    }

    @Override // defpackage.z8h
    public final String b(String str, VideoData videoData, String str2, int i) {
        Object t7oVar;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            Integer valueOf = i == -1 ? null : Integer.valueOf(i);
            t7oVar = c(valueOf, str, videoData.getManifestUrl());
            if (t7oVar == null) {
                t7oVar = d(valueOf, str, videoData.getManifestUrl());
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object manifestUrl = videoData.getManifestUrl();
        if (t7oVar instanceof t7o) {
            t7oVar = manifestUrl;
        }
        return (String) t7oVar;
    }

    public final String c(Integer num, String str, String str2) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            str2.getClass();
            s7e s7eVar = new s7e();
            s7eVar.h(null, str2);
            u7e e = s7eVar.e();
            s7e f = e.f();
            String f2 = this.a.b.f();
            Set h = e.h();
            if (!h.contains(jpt.a(20).a)) {
                String str3 = jpt.a(20).a;
                f.l(str3);
                f.d(str3, str);
            }
            if (!h.contains(jpt.a(15).a)) {
                long currentTimeMillis = System.currentTimeMillis();
                String str4 = jpt.a(15).a;
                String valueOf = String.valueOf(currentTimeMillis);
                f.l(str4);
                f.d(str4, valueOf);
            }
            if (!h.contains(jpt.a(13).a) && num != null) {
                int intValue = num.intValue();
                String str5 = jpt.a(13).a;
                String valueOf2 = String.valueOf(intValue);
                f.l(str5);
                f.d(str5, valueOf2);
            }
            if (!h.contains(jpt.a(19).a) && f2 != null) {
                String str6 = jpt.a(19).a;
                f.l(str6);
                f.d(str6, f2);
            }
            t7oVar = f.e().i;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (String) (t7oVar instanceof t7o ? null : t7oVar);
    }

    public final String d(Integer num, String str, String str2) {
        Uri parse = Uri.parse(str2);
        String f = this.a.b.f();
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.getClass();
        a(buildUpon, parse, jpt.a(20).a, str);
        a(buildUpon, parse, jpt.a(15).a, String.valueOf(System.currentTimeMillis()));
        a(buildUpon, parse, jpt.a(13).a, String.valueOf(num));
        if (f != null) {
            a(buildUpon, parse, jpt.a(19).a, f);
        }
        String uri = buildUpon.build().toString();
        uri.getClass();
        return uri;
    }
}
