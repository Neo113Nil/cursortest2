package S6;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;
import p6.C4846g;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2987a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f2987a) {
            case 0:
                IOException iOException = (IOException) obj;
                return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
            default:
                return !((C4846g) obj).f39830w;
        }
    }
}
