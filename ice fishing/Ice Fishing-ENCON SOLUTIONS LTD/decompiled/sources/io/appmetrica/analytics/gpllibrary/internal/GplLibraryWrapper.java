package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f3938a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f3939b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f3940c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f3941d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f3942e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3943f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3944a;

        static {
            int[] iArr = new int[Priority.values().length];
            f3944a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3944a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3944a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f3945a;

        public ClientProvider(Context context) {
            this.f3945a = context;
        }

        public final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f3945a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this(new ClientProvider(context), locationListener, looper, executor, j2);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(Priority priority) {
        FusedLocationProviderClient fusedLocationProviderClient = this.f3938a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f3943f);
        int i2 = AnonymousClass1.f3944a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i2 != 1 ? i2 != 2 ? i2 != 3 ? 105 : 100 : 102 : 104), this.f3940c, this.f3941d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        this.f3938a.removeLocationUpdates(this.f3940c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() {
        this.f3938a.getLastLocation().a(this.f3942e, new GplOnSuccessListener(this.f3939b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this.f3938a = clientProvider.a();
        this.f3939b = locationListener;
        this.f3941d = looper;
        this.f3942e = executor;
        this.f3943f = j2;
        this.f3940c = new GplLocationCallback(locationListener);
    }
}
