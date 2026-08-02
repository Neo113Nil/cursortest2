package app.cash.api.wrapper;

import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.protos.franklin.common.RequestContext;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ServiceContextWrapper {
    public static final RequestContext EMPTY = new RequestContext(null, null, null, null, null, null, null, null, 8191);
    public final RealServiceContextManager contextManager;
    public final List requestListeners;

    public ServiceContextWrapper(RealServiceContextManager realServiceContextManager, List list) {
        list.getClass();
        this.contextManager = realServiceContextManager;
        this.requestListeners = list;
    }
}
