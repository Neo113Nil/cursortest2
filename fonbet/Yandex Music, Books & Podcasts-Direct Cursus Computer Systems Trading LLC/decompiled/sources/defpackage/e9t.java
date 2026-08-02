package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e9t {
    public final Context a;
    public final int b;
    public final boolean c;
    public final vof d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final xne h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;

    public e9t(Context context, int i, boolean z, vof vofVar, int i2, boolean z2, AtomicInteger atomicInteger, xne xneVar, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = vofVar;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = xneVar;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
    }

    public static e9t a(e9t e9tVar, int i, AtomicInteger atomicInteger, xne xneVar, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new e9t(e9tVar.a, e9tVar.b, e9tVar.c, e9tVar.d, (i2 & 16) != 0 ? e9tVar.e : i, (i2 & 32) != 0 ? e9tVar.f : true, (i2 & 64) != 0 ? e9tVar.g : atomicInteger, (i2 & 128) != 0 ? e9tVar.h : xneVar, (i2 & 256) != 0 ? e9tVar.i : atomicBoolean, (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? e9tVar.j : j, (i2 & 1024) != 0 ? e9tVar.k : 0, (i2 & 4096) != 0 ? e9tVar.l : true, (i2 & RemoteCameraConfig.Notification.ID) != 0 ? e9tVar.m : num, e9tVar.n);
    }

    public final e9t b(xne xneVar, int i) {
        return a(this, i, null, xneVar, null, 0L, null, 32623);
    }

    public final e9t c(xvn xvnVar) {
        return a(b(xvnVar.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9t)) {
            return false;
        }
        e9t e9tVar = (e9t) obj;
        return this.a.equals(e9tVar.a) && this.b == e9tVar.b && this.c == e9tVar.c && this.d.equals(e9tVar.d) && this.e == e9tVar.e && this.f == e9tVar.f && Intrinsics.d(this.g, e9tVar.g) && Intrinsics.d(this.h, e9tVar.h) && Intrinsics.d(this.i, e9tVar.i) && fma.a(this.j, e9tVar.j) && this.k == e9tVar.k && this.l == e9tVar.l && Intrinsics.d(this.m, e9tVar.m) && Intrinsics.d(this.n, e9tVar.n);
    }

    public final int hashCode() {
        int e = k5r.e(f1d.a(-1, f1d.a(this.k, tlm.c(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + k5r.e(f1d.a(this.e, (this.d.hashCode() + k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f)) * 31)) * 31)) * 31, 31), 31), 31), 31, this.l);
        Integer num = this.m;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.n;
        return hashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) fma.d(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ')';
    }
}
