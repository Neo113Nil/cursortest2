package io.appmetrica.analytics.gpllibrary.internal;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import defpackage.bdz;
import defpackage.eqs;
import defpackage.k991;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";
    private final eqs a;
    private final LocationListener b;
    private final LocationCallback c;
    private final Looper d;
    private final Executor e;
    private final long f;

    public static class ClientProvider {
        private final Context a;

        public ClientProvider(Context context) {
            this.a = context;
        }

        public final eqs a() {
            return bdz.a(this.a);
        }
    }

    /* loaded from: classes4.dex */
    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.a = clientProvider.a();
        this.b = locationListener;
        this.d = looper;
        this.e = executor;
        this.f = j;
        this.c = new GplLocationCallback(locationListener);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void startLocationUpdates(Priority priority) throws Throwable {
        eqs eqsVar = this.a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f);
        int ordinal = priority.ordinal();
        ((k991) eqsVar).g(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 105 : 100 : 102 : 104), this.c, this.d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        ((k991) this.a).f(this.c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void updateLastKnownLocation() throws Throwable {
        ((k991) this.a).e().g(this.e, new GplOnSuccessListener(this.b));
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }
}
