package x2;

import com.google.android.gms.internal.ads.ThreadFactoryC3330hg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5190b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f41850a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC3330hg("ClientDefault", 1));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f41851b = Executors.newSingleThreadExecutor(new ThreadFactoryC3330hg("ClientSingle", 1));
}
