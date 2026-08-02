package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class k1c implements bpv {
    public final WindowLayoutComponent a;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public k1c(WindowLayoutComponent windowLayoutComponent) {
        this.a = windowLayoutComponent;
    }

    @Override // defpackage.bpv
    public final void a(Context context, gx0 gx0Var, rtc rtcVar) {
        Unit unit;
        LinkedHashMap linkedHashMap = this.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.d;
            if (multicastConsumer != null) {
                multicastConsumer.a(rtcVar);
                linkedHashMap2.put(rtcVar, context);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(rtcVar, context);
                multicastConsumer2.a(rtcVar);
                this.a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.bpv
    public final void b(rtc rtcVar) {
        LinkedHashMap linkedHashMap = this.c;
        LinkedHashMap linkedHashMap2 = this.d;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(rtcVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(rtcVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(rtcVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(multicastConsumer);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
