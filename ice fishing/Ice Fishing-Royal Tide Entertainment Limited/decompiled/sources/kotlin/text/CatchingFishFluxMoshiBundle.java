package kotlin.text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishFluxMoshiBundle extends CatchingFishParcelable {
    public static final CatchingFishFluxMoshiBundle CatchingFishDaggerWebsocket = new CatchingFishFluxMoshiBundle(new Object[0]);
    public final Object[] CatchingFishReduxKtor;

    public CatchingFishFluxMoshiBundle(Object[] objArr) {
        this.CatchingFishReduxKtor = objArr;
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishCoroutine(Object obj) {
        Object[] objArr = this.CatchingFishReduxKtor;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new CatchingFishRealmFirebase(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[objArr.length] = obj;
        return new CatchingFishFluxMoshiBundle(copyOf);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishDaggerWebsocket(Collection collection) {
        Object[] objArr = this.CatchingFishReduxKtor;
        if (collection.size() + objArr.length > 32) {
            CatchingFishMVPMoshi CatchingFishWorkManager = CatchingFishWorkManager();
            CatchingFishWorkManager.addAll(collection);
            return CatchingFishWorkManager.CatchingFishCoroutine();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new CatchingFishFluxMoshiBundle(copyOf);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishLayout(int i, Object obj) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[i] = obj;
        return new CatchingFishFluxMoshiBundle(copyOf);
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.length;
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishSnackbar(int i, Object obj) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, objArr.length);
        if (i == objArr.length) {
            return CatchingFishCoroutine(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, objArr2, 0, i, 6);
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new CatchingFishFluxMoshiBundle(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new CatchingFishRealmFirebase(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishViewModelFAB(int i) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, objArr.length);
        if (objArr.length == 1) {
            return CatchingFishDaggerWebsocket;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, copyOf, i, i + 1, objArr.length);
        return new CatchingFishFluxMoshiBundle(copyOf);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishViewModelScope(CatchingFishMVPPicasso catchingFishMVPPicasso) {
        Object[] objArr = this.CatchingFishReduxKtor;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) catchingFishMVPPicasso.CatchingFishFragmentHandler(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr2, "copyOf(...)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? CatchingFishDaggerWebsocket : new CatchingFishFluxMoshiBundle(CatchingFishMVVMHilt.CatchingFishJUnitRealm(objArr2, 0, length));
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishMVPMoshi CatchingFishWorkManager() {
        return new CatchingFishMVPMoshi(this, null, this.CatchingFishReduxKtor, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, CatchingFishParcelableFAB());
        return this.CatchingFishReduxKtor[i];
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final int indexOf(Object obj) {
        return CatchingFishMVVMHilt.CatchingFishMoshiDaggerHilt(this.CatchingFishReduxKtor, obj);
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, objArr.length);
        return new CatchingFishReduxCustomView(objArr, i, objArr.length);
    }
}
