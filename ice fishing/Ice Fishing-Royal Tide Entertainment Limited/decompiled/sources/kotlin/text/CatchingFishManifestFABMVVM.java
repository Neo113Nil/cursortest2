package kotlin.text;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishManifestFABMVVM {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishSnackbar = AtomicIntegerFieldUpdater.newUpdater(CatchingFishManifestFABMVVM.class, "_size$volatile");
    public CatchingFishViewMoshi[] CatchingFishParcelableFAB;
    private volatile /* synthetic */ int _size$volatile;

    public final void CatchingFishCoroutine(int i) {
        while (i > 0) {
            CatchingFishViewMoshi[] catchingFishViewMoshiArr = this.CatchingFishParcelableFAB;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshiArr);
            int i2 = (i - 1) / 2;
            CatchingFishViewMoshi catchingFishViewMoshi = catchingFishViewMoshiArr[i2];
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi);
            CatchingFishViewMoshi catchingFishViewMoshi2 = catchingFishViewMoshiArr[i];
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi2);
            if (catchingFishViewMoshi.compareTo(catchingFishViewMoshi2) <= 0) {
                return;
            }
            CatchingFishReduxKtor(i, i2);
            i = i2;
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishViewMoshi catchingFishViewMoshi) {
        catchingFishViewMoshi.CatchingFishReduxKtor((CatchingFishFirebaseContext) this);
        CatchingFishViewMoshi[] catchingFishViewMoshiArr = this.CatchingFishParcelableFAB;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishSnackbar;
        if (catchingFishViewMoshiArr == null) {
            catchingFishViewMoshiArr = new CatchingFishViewMoshi[4];
            this.CatchingFishParcelableFAB = catchingFishViewMoshiArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= catchingFishViewMoshiArr.length) {
            Object[] copyOf = Arrays.copyOf(catchingFishViewMoshiArr, atomicIntegerFieldUpdater.get(this) * 2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            catchingFishViewMoshiArr = (CatchingFishViewMoshi[]) copyOf;
            this.CatchingFishParcelableFAB = catchingFishViewMoshiArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        catchingFishViewMoshiArr[i] = catchingFishViewMoshi;
        catchingFishViewMoshi.CatchingFishDaggerWebsocket = i;
        CatchingFishCoroutine(i);
    }

    public final void CatchingFishReduxKtor(int i, int i2) {
        CatchingFishViewMoshi[] catchingFishViewMoshiArr = this.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshiArr);
        CatchingFishViewMoshi catchingFishViewMoshi = catchingFishViewMoshiArr[i2];
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi);
        CatchingFishViewMoshi catchingFishViewMoshi2 = catchingFishViewMoshiArr[i];
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi2);
        catchingFishViewMoshiArr[i] = catchingFishViewMoshi;
        catchingFishViewMoshiArr[i2] = catchingFishViewMoshi2;
        catchingFishViewMoshi.CatchingFishDaggerWebsocket = i;
        catchingFishViewMoshi2.CatchingFishDaggerWebsocket = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishViewMoshi CatchingFishSnackbar(int i) {
        Object[] objArr = this.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishSnackbar;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            CatchingFishReduxKtor(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                CatchingFishViewMoshi catchingFishViewMoshi = objArr[i];
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi);
                Object obj = objArr[i2];
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
                if (catchingFishViewMoshi.compareTo(obj) < 0) {
                    CatchingFishReduxKtor(i, i2);
                    CatchingFishCoroutine(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.CatchingFishParcelableFAB;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr2);
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(comparable);
                    Object obj2 = objArr2[i4];
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj2);
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(comparable2);
                Comparable comparable3 = objArr2[i5];
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                CatchingFishReduxKtor(i, i5);
                i = i5;
            }
        }
        CatchingFishViewMoshi catchingFishViewMoshi2 = objArr[atomicIntegerFieldUpdater.get(this)];
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishViewMoshi2);
        catchingFishViewMoshi2.CatchingFishReduxKtor(null);
        catchingFishViewMoshi2.CatchingFishDaggerWebsocket = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return catchingFishViewMoshi2;
    }
}
