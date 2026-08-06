package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f7498a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7499b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f7500c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f7501d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f7502e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7503f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7504g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i2);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f7499b = executor;
        this.f7500c = iExecutionPolicy;
        this.f7501d = exponentialBackoffPolicy;
        this.f7502e = underlyingNetworkTask;
        this.f7503f = list;
        this.f7504g = str;
    }

    private synchronized boolean a(int i2) {
        if (!a(i2)) {
            return false;
        }
        this.f7498a = i2;
        return true;
    }

    public String description() {
        return this.f7502e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f7500c;
    }

    public Executor getExecutor() {
        return this.f7499b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f7501d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f7502e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f7502e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7502e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f7502e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f7502e;
    }

    public String getUrl() {
        return this.f7502e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f7504g;
    }

    public boolean isRemoved() {
        return this.f7498a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f7502e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a2 = a(4);
        if (a2) {
            this.f7502e.getFullUrlFormer().incrementAttemptNumber();
            this.f7502e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f7502e.onPerformRequest();
        }
        return a2;
    }

    public boolean onRequestComplete() {
        boolean z2;
        boolean z3;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z2 = this.f7502e.onRequestComplete();
                    if (z2) {
                        this.f7498a = 5;
                    } else {
                        this.f7498a = 6;
                    }
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.f7502e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f7502e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f7502e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a2 = a(2);
        if (a2) {
            this.f7502e.onTaskAdded();
        }
        return a2;
    }

    public void onTaskFinished() {
        int i2;
        boolean a2;
        synchronized (this) {
            i2 = this.f7498a;
            a2 = a(8);
        }
        if (a2) {
            this.f7502e.onTaskFinished();
            if (i2 == 5) {
                this.f7502e.onSuccessfulTaskFinished();
            } else if (i2 == 6 || i2 == 7) {
                this.f7502e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f7502e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z2;
        int i2;
        try {
            hasMoreHosts = this.f7502e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f7502e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f7503f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            }
            i2 = this.f7498a;
        } catch (Throwable th) {
            throw th;
        }
        return i2 != 9 && i2 != 8 && hasMoreHosts && z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:8:0x0077, B:10:0x0081, B:22:0x002a, B:33:0x003f, B:34:0x0042, B:36:0x0047, B:38:0x004c, B:40:0x0051, B:46:0x005d, B:47:0x0060, B:49:0x0065, B:51:0x006a, B:54:0x0071, B:13:0x0084), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        try {
            bool = Boolean.TRUE;
            int i2 = this.f7498a;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    boolean z2 = true;
                    switch (e.a(iArr[i3])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i2 != 1) {
                                z2 = false;
                            }
                            bool3 = Boolean.valueOf(z2);
                            break;
                        case 2:
                            if (i2 == 2) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (i2 != 3 && i2 != 5 && i2 != 6) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 6:
                            if (i2 == 3) {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                            if (i2 == 2) {
                            }
                            break;
                        case 7:
                            if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 2 && i2 != 3 && i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (i2 != 1) {
                                if (i2 == 9) {
                                    z2 = false;
                                }
                                bool3 = Boolean.valueOf(z2);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(bool3)) {
                        i3++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
