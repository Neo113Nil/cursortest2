package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class zlc {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Map b = Collections.synchronizedMap(new HashMap());
    public volatile String c;
    public final /* synthetic */ amc d;

    public zlc(amc amcVar) {
        this.d = amcVar;
    }
}
