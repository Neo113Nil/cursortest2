package pl.droidsonroids.gif;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final B8.a f39944n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39945u;

    public GifIOException(int i, String str) {
        B8.a aVar;
        B8.a[] values = B8.a.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                aVar = B8.a.UNKNOWN;
                aVar.f227u = i;
                break;
            } else {
                aVar = values[i6];
                if (aVar.f227u == i) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f39944n = aVar;
        this.f39945u = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        B8.a aVar = this.f39944n;
        String str = this.f39945u;
        if (str == null) {
            aVar.getClass();
            Locale locale = Locale.ENGLISH;
            StringBuilder i = AbstractC4404f.i(aVar.f227u, "GifError ", ": ");
            i.append(aVar.f226n);
            return i.toString();
        }
        StringBuilder sb = new StringBuilder();
        aVar.getClass();
        Locale locale2 = Locale.ENGLISH;
        StringBuilder i6 = AbstractC4404f.i(aVar.f227u, "GifError ", ": ");
        i6.append(aVar.f226n);
        sb.append(i6.toString());
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
