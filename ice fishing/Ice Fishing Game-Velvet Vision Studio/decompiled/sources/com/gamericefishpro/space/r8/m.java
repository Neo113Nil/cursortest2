package com.gamericefishpro.space.r8;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.ph.m0;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static m e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new k(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized m f(Context context) {
        try {
            if (e == null) {
                e = new m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.gamericefishpro.space.a9.a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public void a(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void b(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(o.v(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(o.B(i)));
        }
    }

    public void c(long j) {
        ((Paint) this.b).setColor(o.y(j));
    }

    public void d(com.gamericefishpro.space.o1.k kVar) {
        this.d = kVar;
        ((Paint) this.b).setColorFilter(kVar != null ? kVar.a : null);
    }

    public void e(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized com.gamericefishpro.space.r9.o g(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(lVar.toString());
            }
            if (!((k) this.d).d(lVar)) {
                k kVar = new k(this);
                this.d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.b.a;
    }

    public m(com.gamericefishpro.space.f5.k entry, int i) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.b = entry.y;
        this.a = i;
        com.gamericefishpro.space.i5.c cVar = entry.A;
        this.c = cVar.a();
        m0.c();
        Bundle outBundle = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(outBundle, "source");
        this.d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        cVar.h.q(outBundle);
    }

    public m(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public m(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("nav-entry-state:id", "key");
        String string = source.getString("nav-entry-state:id");
        if (string != null) {
            this.b = string;
            Intrinsics.checkNotNullParameter(source, "source");
            this.a = com.gamericefishpro.space.u6.f.A("nav-entry-state:destination-id", source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.c = com.gamericefishpro.space.u6.f.B("nav-entry-state:args", source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.d = com.gamericefishpro.space.u6.f.B("nav-entry-state:saved-state", source);
            return;
        }
        com.gamericefishpro.space.wa.b.K("nav-entry-state:id");
        throw null;
    }
}
