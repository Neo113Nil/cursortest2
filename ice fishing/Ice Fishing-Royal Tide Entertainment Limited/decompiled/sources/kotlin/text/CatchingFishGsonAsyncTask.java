package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishGsonAsyncTask implements Cloneable {
    public /* synthetic */ Object[] CatchingFishDaggerWebsocket;
    public /* synthetic */ int[] CatchingFishReduxKtor;
    public /* synthetic */ int CatchingFishWorkManager;

    public CatchingFishGsonAsyncTask(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.CatchingFishReduxKtor = new int[i5];
        this.CatchingFishDaggerWebsocket = new Object[i5];
    }

    public final Object CatchingFishCoroutine(int i) {
        Object obj;
        int CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishLayout(this.CatchingFishWorkManager, i, this.CatchingFishReduxKtor);
        if (CatchingFishLayout < 0 || (obj = this.CatchingFishDaggerWebsocket[CatchingFishLayout]) == CatchingFishGsonCardView.CatchingFishRoomDatabase) {
            return null;
        }
        return obj;
    }

    public final Object CatchingFishDaggerWebsocket(int i) {
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void CatchingFishParcelableFAB(int i, Object obj) {
        int i2 = this.CatchingFishWorkManager;
        if (i2 != 0 && i <= this.CatchingFishReduxKtor[i2 - 1]) {
            CatchingFishReduxKtor(i, obj);
            return;
        }
        if (i2 >= this.CatchingFishReduxKtor.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] copyOf = Arrays.copyOf(this.CatchingFishReduxKtor, i6);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i6);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf2;
        }
        this.CatchingFishReduxKtor[i2] = i;
        this.CatchingFishDaggerWebsocket[i2] = obj;
        this.CatchingFishWorkManager = i2 + 1;
    }

    public final void CatchingFishReduxKtor(int i, Object obj) {
        int CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishLayout(this.CatchingFishWorkManager, i, this.CatchingFishReduxKtor);
        if (CatchingFishLayout >= 0) {
            this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj;
            return;
        }
        int i2 = ~CatchingFishLayout;
        int i3 = this.CatchingFishWorkManager;
        if (i2 < i3) {
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            if (objArr[i2] == CatchingFishGsonCardView.CatchingFishRoomDatabase) {
                this.CatchingFishReduxKtor[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.CatchingFishReduxKtor.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] copyOf = Arrays.copyOf(this.CatchingFishReduxKtor, i7);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i7);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf2;
        }
        int i8 = this.CatchingFishWorkManager;
        if (i8 - i2 != 0) {
            int[] iArr = this.CatchingFishReduxKtor;
            int i9 = i2 + 1;
            CatchingFishMVVMHilt.CatchingFishParcelable(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i9, i2, this.CatchingFishWorkManager);
        }
        this.CatchingFishReduxKtor[i2] = i;
        this.CatchingFishDaggerWebsocket[i2] = obj;
        this.CatchingFishWorkManager++;
    }

    /* renamed from: CatchingFishSnackbar, reason: merged with bridge method [inline-methods] */
    public final CatchingFishGsonAsyncTask clone() {
        Object clone = super.clone();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = (CatchingFishGsonAsyncTask) clone;
        catchingFishGsonAsyncTask.CatchingFishReduxKtor = (int[]) this.CatchingFishReduxKtor.clone();
        catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket = (Object[]) this.CatchingFishDaggerWebsocket.clone();
        return catchingFishGsonAsyncTask;
    }

    public final String toString() {
        int i = this.CatchingFishWorkManager;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.CatchingFishWorkManager;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.CatchingFishReduxKtor[i3]);
            sb.append('=');
            Object CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i3);
            if (CatchingFishDaggerWebsocket != this) {
                sb.append(CatchingFishDaggerWebsocket);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }
}
