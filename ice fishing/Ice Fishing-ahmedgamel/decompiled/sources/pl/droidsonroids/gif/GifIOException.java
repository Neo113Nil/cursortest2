package pl.droidsonroids.gif;

import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final B8.a f39991n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39992u;

    public GifIOException(int i, String str) {
        B8.a aVar;
        B8.a[] values = B8.a.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = B8.a.UNKNOWN;
                aVar.f293u = i;
                break;
            } else {
                aVar = values[i4];
                if (aVar.f293u == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f39991n = aVar;
        this.f39992u = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        B8.a aVar = this.f39991n;
        String str = this.f39992u;
        if (str == null) {
            aVar.getClass();
            Locale locale = Locale.ENGLISH;
            StringBuilder k9 = Wv.k(aVar.f293u, "GifError ", ": ");
            k9.append(aVar.f292n);
            return k9.toString();
        }
        StringBuilder sb = new StringBuilder();
        aVar.getClass();
        Locale locale2 = Locale.ENGLISH;
        StringBuilder k10 = Wv.k(aVar.f293u, "GifError ", ": ");
        k10.append(aVar.f292n);
        sb.append(k10.toString());
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
