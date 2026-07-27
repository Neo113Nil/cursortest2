package O6;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;
import l6.C4700g;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2540a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f2540a) {
            case 0:
                IOException iOException = (IOException) obj;
                return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
            default:
                return !((C4700g) obj).f39063w;
        }
    }
}
