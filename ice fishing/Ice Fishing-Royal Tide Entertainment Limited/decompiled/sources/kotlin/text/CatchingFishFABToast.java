package kotlin.text;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishFABToast implements RandomAccess {
    public CatchingFishFABFirebase CatchingFishDaggerWebsocket;
    public Object[] CatchingFishReduxKtor;
    public int CatchingFishWorkManager = 0;

    public CatchingFishFABToast(Object[] objArr) {
        this.CatchingFishReduxKtor = objArr;
    }

    public final void CatchingFishCloudMessaging(int i, int i2) {
        if (i2 > i) {
            int i3 = this.CatchingFishWorkManager;
            if (i2 < i3) {
                Object[] objArr = this.CatchingFishReduxKtor;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.CatchingFishWorkManager;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.CatchingFishReduxKtor[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.CatchingFishWorkManager = i5;
        }
    }

    public final void CatchingFishCoroutine(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.CatchingFishWorkManager + size;
        if (this.CatchingFishReduxKtor.length < i2) {
            CatchingFishEspressoTesting(i2);
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishWorkManager;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.CatchingFishWorkManager += size;
    }

    public final boolean CatchingFishDaggerWebsocket(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.CatchingFishWorkManager + size;
        if (this.CatchingFishReduxKtor.length < i3) {
            CatchingFishEspressoTesting(i3);
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i4 = this.CatchingFishWorkManager;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.CatchingFishWorkManager += size;
        return true;
    }

    public final void CatchingFishEspressoTesting(int i) {
        Object[] objArr = this.CatchingFishReduxKtor;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.CatchingFishReduxKtor = objArr2;
    }

    public final Object CatchingFishFragmentHandler(int i) {
        Object[] objArr = this.CatchingFishReduxKtor;
        Object obj = objArr[i];
        int i2 = this.CatchingFishWorkManager;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.CatchingFishWorkManager - 1;
        this.CatchingFishWorkManager = i4;
        objArr[i4] = null;
        return obj;
    }

    public final boolean CatchingFishLayout(Object obj) {
        Object[] objArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishWorkManager;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, objArr[i2])) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return false;
        }
        CatchingFishFragmentHandler(i2);
        return true;
    }

    public final void CatchingFishParcelableFAB(int i, Object obj) {
        int i2 = this.CatchingFishWorkManager + 1;
        if (this.CatchingFishReduxKtor.length < i2) {
            CatchingFishEspressoTesting(i2);
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishWorkManager;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.CatchingFishWorkManager++;
    }

    public final void CatchingFishReduxKtor(int i, CatchingFishFABToast catchingFishFABToast) {
        int i2 = catchingFishFABToast.CatchingFishWorkManager;
        if (i2 == 0) {
            return;
        }
        int i3 = this.CatchingFishWorkManager + i2;
        if (this.CatchingFishReduxKtor.length < i3) {
            CatchingFishEspressoTesting(i3);
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i4 = this.CatchingFishWorkManager;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(catchingFishFABToast.CatchingFishReduxKtor, 0, objArr, i, i2);
        this.CatchingFishWorkManager += i2;
    }

    public final void CatchingFishSnackbar(Object obj) {
        int i = this.CatchingFishWorkManager + 1;
        if (this.CatchingFishReduxKtor.length < i) {
            CatchingFishEspressoTesting(i);
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i2 = this.CatchingFishWorkManager;
        objArr[i2] = obj;
        this.CatchingFishWorkManager = i2 + 1;
    }

    public final boolean CatchingFishViewModelFAB(Object obj) {
        int i = this.CatchingFishWorkManager - 1;
        if (i >= 0) {
            for (int i2 = 0; !CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void CatchingFishViewModelScope() {
        Object[] objArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.CatchingFishWorkManager = 0;
    }

    public final List CatchingFishWorkManager() {
        CatchingFishFABFirebase catchingFishFABFirebase = this.CatchingFishDaggerWebsocket;
        if (catchingFishFABFirebase != null) {
            return catchingFishFABFirebase;
        }
        CatchingFishFABFirebase catchingFishFABFirebase2 = new CatchingFishFABFirebase(this);
        this.CatchingFishDaggerWebsocket = catchingFishFABFirebase2;
        return catchingFishFABFirebase2;
    }
}
