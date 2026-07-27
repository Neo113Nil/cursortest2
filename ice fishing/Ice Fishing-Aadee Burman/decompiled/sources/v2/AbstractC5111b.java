package v2;

import com.google.android.gms.internal.ads.ThreadFactoryC3307hg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5111b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f41393a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC3307hg("ClientDefault", 1));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f41394b = Executors.newSingleThreadExecutor(new ThreadFactoryC3307hg("ClientSingle", 1));
}
