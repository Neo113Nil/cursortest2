package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class kpj {

    @NotNull
    private final CopyOnWriteArrayList<xt3> cancellables = new CopyOnWriteArrayList<>();
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public kpj(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(@NotNull xt3 xt3Var) {
        xt3Var.getClass();
        this.cancellables.add(xt3Var);
    }

    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull ri2 ri2Var) {
        ri2Var.getClass();
    }

    public void handleOnBackStarted(@NotNull ri2 ri2Var) {
        ri2Var.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((xt3) it.next()).cancel();
        }
    }

    public final void removeCancellable(@NotNull xt3 xt3Var) {
        xt3Var.getClass();
        this.cancellables.remove(xt3Var);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }

    public void handleOnBackCancelled() {
    }
}
