package defpackage;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1187q2;

/* loaded from: classes5.dex */
public abstract class su2 extends bfu implements dzf, yn7 {

    @NotNull
    private final uyf eventDispatchingObserver;

    @NotNull
    private WeakReference<dzf> lifecycleOwnerRef;

    @NotNull
    private final gzf viewModelLifecycle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(String str) {
        super(gld.e(j5h.a.g.plus(a4g.n()).plus(new C1187q2(str))));
        dq7 dq7Var = ca8.a;
        this.lifecycleOwnerRef = new WeakReference<>(null);
        gzf gzfVar = new gzf(this);
        this.viewModelLifecycle = gzfVar;
        this.eventDispatchingObserver = new ru2(0, this);
        gzfVar.a(this);
    }

    public static void a(su2 su2Var, dzf dzfVar, kyf kyfVar) {
        if (kyfVar != kyf.ON_DESTROY) {
            su2Var.viewModelLifecycle.g(kyfVar);
        }
    }

    public final void addCloseables(@NotNull AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            addCloseable(autoCloseable);
        }
    }

    @Override // defpackage.dzf
    @NotNull
    public nyf getLifecycle() {
        return this.viewModelLifecycle;
    }

    @Override // defpackage.bfu
    public void onCleared() {
        nyf lifecycle;
        gzf gzfVar = this.viewModelLifecycle;
        if (gzfVar.d != lyf.b) {
            gzfVar.g(kyf.ON_DESTROY);
        }
        dzf dzfVar = this.lifecycleOwnerRef.get();
        if (dzfVar != null && (lifecycle = dzfVar.getLifecycle()) != null) {
            lifecycle.d(this.eventDispatchingObserver);
        }
        this.lifecycleOwnerRef.clear();
        super.onCleared();
    }

    public final void registerLifecycleOwner(@NotNull dzf dzfVar) {
        nyf lifecycle;
        dzfVar.getClass();
        dzf dzfVar2 = this.lifecycleOwnerRef.get();
        if (Intrinsics.d(dzfVar2, dzfVar)) {
            return;
        }
        if (dzfVar2 != null && (lifecycle = dzfVar2.getLifecycle()) != null) {
            lifecycle.d(this.eventDispatchingObserver);
        }
        this.lifecycleOwnerRef = new WeakReference<>(dzfVar);
        dzfVar.getLifecycle().a(this.eventDispatchingObserver);
    }
}
