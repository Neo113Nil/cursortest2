package androidx.media3.datasource;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: type, reason: collision with root package name */
    public final int f874type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i, int i2) {
        super(i, iOException);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.f874type = i2;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new HttpDataSource$HttpDataSourceException(iOException, i2, i);
    }

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.f874type = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i, IOException iOException, String str) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.f874type = 1;
    }
}
