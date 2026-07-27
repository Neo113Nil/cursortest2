package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class CatchingFishSnackbarRoom extends CatchingFishGsonDatabinding implements CatchingFishStripeAPIBundle, CatchingFishHiltAsyncTask {
    public CatchingFishPicassoView CatchingFishViewModelScope;

    public abstract boolean CatchingFishCloudMessaging();

    public abstract void CatchingFishEspressoTesting(Throwable th);

    public final CatchingFishPicassoView CatchingFishFragmentHandler() {
        CatchingFishPicassoView catchingFishPicassoView = this.CatchingFishViewModelScope;
        if (catchingFishPicassoView != null) {
            return catchingFishPicassoView;
        }
        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("job");
        throw null;
    }

    @Override // kotlin.text.CatchingFishStripeAPIBundle
    public final void CatchingFishParcelableFAB() {
        CatchingFishPicassoView CatchingFishFragmentHandler = CatchingFishFragmentHandler();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishPicassoView.CatchingFishReduxKtor;
            Object obj = atomicReferenceFieldUpdater.get(CatchingFishFragmentHandler);
            if (obj instanceof CatchingFishSnackbarRoom) {
                if (obj != this) {
                    return;
                }
                CatchingFishManifestMVVM catchingFishManifestMVVM = CatchingFishXMLLayoutGlide.CatchingFishCloudMessaging;
                while (!atomicReferenceFieldUpdater.compareAndSet(CatchingFishFragmentHandler, obj, catchingFishManifestMVVM)) {
                    if (atomicReferenceFieldUpdater.get(CatchingFishFragmentHandler) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof CatchingFishHiltAsyncTask) || ((CatchingFishHiltAsyncTask) obj).CatchingFishReduxKtor() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishGsonDatabinding.CatchingFishReduxKtor;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof CatchingFishGlideFirebase) {
                    CatchingFishGsonDatabinding catchingFishGsonDatabinding = ((CatchingFishGlideFirebase) obj2).CatchingFishParcelableFAB;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                CatchingFishGsonDatabinding catchingFishGsonDatabinding2 = (CatchingFishGsonDatabinding) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = CatchingFishGsonDatabinding.CatchingFishWorkManager;
                CatchingFishGlideFirebase catchingFishGlideFirebase = (CatchingFishGlideFirebase) atomicReferenceFieldUpdater3.get(catchingFishGsonDatabinding2);
                if (catchingFishGlideFirebase == null) {
                    catchingFishGlideFirebase = new CatchingFishGlideFirebase(catchingFishGsonDatabinding2);
                    atomicReferenceFieldUpdater3.set(catchingFishGsonDatabinding2, catchingFishGlideFirebase);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, catchingFishGlideFirebase)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                catchingFishGsonDatabinding2.CatchingFishWorkManager();
                return;
            }
        }
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final CatchingFishSnackbarRealm CatchingFishReduxKtor() {
        return null;
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final boolean CatchingFishSnackbar() {
        return true;
    }

    public CatchingFishRoomViewGson getParent() {
        return CatchingFishFragmentHandler();
    }

    @Override // kotlin.text.CatchingFishGsonDatabinding
    public final String toString() {
        return getClass().getSimpleName() + '@' + CatchingFishBiometricBundle.CatchingFish(this) + "[job@" + CatchingFishBiometricBundle.CatchingFish(CatchingFishFragmentHandler()) + ']';
    }
}
