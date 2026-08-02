package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.video.m3.data.dto.VideoData;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class nnm {
    public final VideoData a;
    public final dnm b;
    public final jnm c;
    public final String d;
    public final int e;
    public final c5p f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;

    public nnm(VideoData videoData, dnm dnmVar, jnm jnmVar, String str, int i, c5p c5pVar, boolean z, boolean z2, boolean z3, boolean z4) {
        Uri uri;
        videoData.getClass();
        dnmVar.getClass();
        jnmVar.getClass();
        this.a = videoData;
        this.b = dnmVar;
        this.c = jnmVar;
        this.d = str;
        this.e = i;
        this.f = c5pVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        String c = vpt.c(videoData.getManifestUrl(), str);
        try {
            uri = Uri.parse(c);
        } catch (Throwable th) {
            Timber.INSTANCE.e(th, "url parsing error ".concat(c), new Object[0]);
            uri = null;
        }
        if (uri != null) {
            String path = uri.getPath();
            if (path != null && c.n(path, ".mpd", true)) {
                String str2 = jpt.a(2).a;
                Uri.Builder buildUpon = uri.buildUpon();
                if (uri.getQueryParameter(str2) != null) {
                    buildUpon.clearQuery();
                    for (String str3 : uri.getQueryParameterNames()) {
                        if (!Intrinsics.d(str3, str2)) {
                            buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                        }
                    }
                }
                buildUpon.appendQueryParameter(str2, "1");
                uri = buildUpon.build();
                uri.getClass();
            }
            Uri a = vpt.a(uri, jpt.a(13).a, String.valueOf(i));
            a = z ? vpt.a(a, jpt.a(1).a, "1") : a;
            a = z2 ? vpt.e(a, jpt.a(7).a) : a;
            c = (z3 ? vpt.e(a, jpt.a(6).a) : a).toString();
            c.getClass();
        }
        this.k = c;
        this.l = mnm.a(this.a);
    }

    public static nnm a(jnm jnmVar, nnm nnmVar) {
        VideoData videoData = nnmVar.a;
        dnm dnmVar = nnmVar.b;
        String str = nnmVar.d;
        int i = nnmVar.e;
        c5p c5pVar = nnmVar.f;
        boolean z = nnmVar.g;
        boolean z2 = nnmVar.h;
        boolean z3 = nnmVar.i;
        boolean z4 = nnmVar.j;
        videoData.getClass();
        dnmVar.getClass();
        jnmVar.getClass();
        return new nnm(videoData, dnmVar, jnmVar, str, i, c5pVar, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnm)) {
            return false;
        }
        nnm nnmVar = (nnm) obj;
        return Intrinsics.d(this.a, nnmVar.a) && Intrinsics.d(this.b, nnmVar.b) && Intrinsics.d(this.c, nnmVar.c) && this.d.equals(nnmVar.d) && this.e == nnmVar.e && this.f.equals(nnmVar.f) && this.g == nnmVar.g && this.h == nnmVar.h && this.i == nnmVar.i && this.j == nnmVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + k5r.e(k5r.e(k5r.e((this.f.hashCode() + f1d.a(this.e, k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadRequest(videoData=");
        sb.append(this.a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", priority=");
        sb.append(this.c);
        sb.append(", videoSessionId=");
        sb.append(this.d);
        sb.append(", sourceIndex=");
        sb.append(this.e);
        sb.append(", eventIndexGenerator=");
        sb.append(this.f);
        sb.append(", enableHevc=");
        sb.append(this.g);
        sb.append(", ignoreMinHeightWithService=");
        sb.append(this.h);
        sb.append(", ignoreMaxHeightWithService=");
        sb.append(this.i);
        sb.append(", omitAudio=");
        return dfi.j(sb, this.j, ')');
    }
}
