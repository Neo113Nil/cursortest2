package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y7x {
    public static final msg j = new msg("ConnectivityMonitor", null);
    public final nlx a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = Collections.synchronizedSet(new HashSet());
    public final Map d = Collections.synchronizedMap(new HashMap());
    public final List e = Collections.synchronizedList(new ArrayList());
    public final xd0 b = new xd0(10, this);

    public y7x(Context context, nlx nlxVar) {
        this.a = nlxVar;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            try {
                if (this.d != null && this.e != null) {
                    j.b("a new network is available", new Object[0]);
                    if (this.d.containsKey(network)) {
                        this.e.remove(network);
                    }
                    this.d.put(network, linkProperties);
                    this.e.add(network);
                    b();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        synchronized (this.i) {
            try {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!this.a.a.isShutdown()) {
                        this.a.execute(new yyo(21, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
