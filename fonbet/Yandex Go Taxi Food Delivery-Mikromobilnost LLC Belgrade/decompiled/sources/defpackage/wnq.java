package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.go.image.api.domain.models.ImageSource;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wnq implements f16 {
    public final String a;
    public final vit b;
    public final f16 c;
    public final long w;
    public final String x;
    public final String y;

    public wnq(String str, vit vitVar, f16 f16Var) {
        Object obj;
        String queryParameter;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = str;
        this.b = vitVar;
        this.c = f16Var;
        this.w = elapsedRealtime;
        String scheme = Uri.parse(str).getScheme();
        this.x = (scheme == null ? "unknown" : scheme).equals("divkit-asset") ? "asset" : "network";
        String encodedFragment = Uri.parse(str).getEncodedFragment();
        String str2 = null;
        if (encodedFragment != null && encodedFragment.length() != 0) {
            Uri build = new Uri.Builder().encodedQuery(encodedFragment).build();
            Iterator<T> it = build.getQueryParameterNames().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (cvu0.t((String) obj, "snippetSource", true)) {
                        break;
                    }
                }
            }
            String str3 = (String) obj;
            if (str3 != null && (queryParameter = build.getQueryParameter(str3)) != null && queryParameter.length() > 0) {
                str2 = queryParameter;
            }
        }
        this.y = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    @Override // defpackage.f16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bitmap bitmap, ebv ebvVar, ImageSource imageSource) {
        long byteCount;
        int i;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.w;
        if (ebvVar != null) {
            long j = ebvVar.d;
            Long valueOf = Long.valueOf(j);
            if (j <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                byteCount = valueOf.longValue();
                long j2 = byteCount / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                String str2 = j2 >= 50 ? "<50KB" : j2 < 100 ? "50-100KB" : j2 < 200 ? "100-200KB" : j2 < 500 ? "200-500KB" : j2 < 1000 ? "500-1000KB" : j2 < 2000 ? "1000KB-2000KB" : j2 < 4000 ? "2000KB-4000KB" : j2 < 8000 ? "4000KB-8000KB" : j2 < 16000 ? "8000KB-16000KB" : j2 < 32000 ? "16000KB-32000KB" : "32000+KB";
                i = ooq.a[imageSource.ordinal()];
                if (i != 1) {
                    str = "memory";
                } else if (i == 2) {
                    str = "disk";
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    str = "network";
                }
                String str3 = str;
                vit vitVar = this.b;
                vitVar.getClass();
                ((lv2) vitVar.b).a("Feed.ImageLoaded", vit.d(this.a, this.x, str3, null, elapsedRealtime, str2, this.y));
                this.c.b(bitmap, ebvVar, imageSource);
            }
        }
        byteCount = bitmap.getByteCount();
        long j22 = byteCount / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        String str22 = j22 >= 50 ? "<50KB" : j22 < 100 ? "50-100KB" : j22 < 200 ? "100-200KB" : j22 < 500 ? "200-500KB" : j22 < 1000 ? "500-1000KB" : j22 < 2000 ? "1000KB-2000KB" : j22 < 4000 ? "2000KB-4000KB" : j22 < 8000 ? "4000KB-8000KB" : j22 < 16000 ? "8000KB-16000KB" : j22 < 32000 ? "16000KB-32000KB" : "32000+KB";
        i = ooq.a[imageSource.ordinal()];
        if (i != 1) {
        }
        String str32 = str;
        vit vitVar2 = this.b;
        vitVar2.getClass();
        ((lv2) vitVar2.b).a("Feed.ImageLoaded", vit.d(this.a, this.x, str32, null, elapsedRealtime, str22, this.y));
        this.c.b(bitmap, ebvVar, imageSource);
    }

    @Override // defpackage.f16
    public final void onError(Throwable th) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.w;
        String value = jla1.h(th).getValue();
        vit vitVar = this.b;
        vitVar.getClass();
        ((lv2) vitVar.b).a("Feed.ImageError", vit.d(this.a, this.x, null, value, elapsedRealtime, "unknown", this.y));
        this.c.onError(th);
    }
}
