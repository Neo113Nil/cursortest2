package kotlin.text;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLWidget implements CatchingFishHiltAsyncTask {
    public final CatchingFishSnackbarRealm CatchingFishReduxKtor;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishDaggerWebsocket = AtomicIntegerFieldUpdater.newUpdater(CatchingFishGraphQLWidget.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishWorkManager = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGraphQLWidget.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishViewModelScope = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGraphQLWidget.class, Object.class, "_exceptionsHolder$volatile");

    public CatchingFishGraphQLWidget(CatchingFishSnackbarRealm catchingFishSnackbarRealm, Throwable th) {
        this.CatchingFishReduxKtor = catchingFishSnackbarRealm;
        this._rootCause$volatile = th;
    }

    public final Throwable CatchingFishCoroutine() {
        return (Throwable) CatchingFishWorkManager.get(this);
    }

    public final boolean CatchingFishDaggerWebsocket() {
        return CatchingFishCoroutine() != null;
    }

    public final void CatchingFishParcelableFAB(Throwable th) {
        Throwable CatchingFishCoroutine = CatchingFishCoroutine();
        if (CatchingFishCoroutine == null) {
            CatchingFishWorkManager.set(this, th);
            return;
        }
        if (th == CatchingFishCoroutine) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishViewModelScope;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final CatchingFishSnackbarRealm CatchingFishReduxKtor() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final boolean CatchingFishSnackbar() {
        return CatchingFishCoroutine() == null;
    }

    public final ArrayList CatchingFishWorkManager(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishViewModelScope;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable CatchingFishCoroutine = CatchingFishCoroutine();
        if (CatchingFishCoroutine != null) {
            arrayList.add(0, CatchingFishCoroutine);
        }
        if (th != null && !th.equals(CatchingFishCoroutine)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, CatchingFishXMLLayoutGlide.CatchingFishLayout);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(CatchingFishDaggerWebsocket());
        sb.append(", completing=");
        sb.append(CatchingFishDaggerWebsocket.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(CatchingFishCoroutine());
        sb.append(", exceptions=");
        sb.append(CatchingFishViewModelScope.get(this));
        sb.append(", list=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(']');
        return sb.toString();
    }
}
