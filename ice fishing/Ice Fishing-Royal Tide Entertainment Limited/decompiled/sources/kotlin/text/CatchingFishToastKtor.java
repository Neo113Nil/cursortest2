package kotlin.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishToastKtor {
    public final Set CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final Set CatchingFishSnackbar;
    public final Set CatchingFishViewModelScope;
    public final CatchingFishMockkAsyncTask CatchingFishWorkManager;

    public CatchingFishToastKtor(String str, Set set, Set set2, int i, int i2, CatchingFishMockkAsyncTask catchingFishMockkAsyncTask, Set set3) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = Collections.unmodifiableSet(set);
        this.CatchingFishCoroutine = Collections.unmodifiableSet(set2);
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = catchingFishMockkAsyncTask;
        this.CatchingFishViewModelScope = Collections.unmodifiableSet(set3);
    }

    public static CatchingFishToastKtor CatchingFishCoroutine(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
        for (Class cls2 : clsArr) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(cls2, "Null interface");
            hashSet.add(CatchingFishFABDagger.CatchingFishParcelableFAB(cls2));
        }
        return new CatchingFishToastKtor(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new CatchingFishLayoutCoroutine(1, obj), hashSet3);
    }

    public static CatchingFishCardViewKtor CatchingFishParcelableFAB(Class cls) {
        return new CatchingFishCardViewKtor(cls, new Class[0]);
    }

    public static CatchingFishCardViewKtor CatchingFishSnackbar(CatchingFishFABDagger catchingFishFABDagger) {
        return new CatchingFishCardViewKtor(catchingFishFABDagger, new CatchingFishFABDagger[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.CatchingFishSnackbar.toArray()) + ">{" + this.CatchingFishReduxKtor + ", type=" + this.CatchingFishDaggerWebsocket + ", deps=" + Arrays.toString(this.CatchingFishCoroutine.toArray()) + "}";
    }
}
