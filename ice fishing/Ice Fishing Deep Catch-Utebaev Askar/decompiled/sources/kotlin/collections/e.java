package kotlin.collections;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f163c;

    public e(h hVar) {
        this.f163c = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f161a;
        Object obj = this.f163c;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f162b < ((h) obj).a();
            default:
                return this.f162b < ((Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f161a;
        Object obj = this.f163c;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f162b;
                this.f162b = i3 + 1;
                return ((h) obj).get(i3);
            default:
                try {
                    int i4 = this.f162b;
                    this.f162b = i4 + 1;
                    return ((Object[]) obj)[i4];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f162b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f161a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f163c = array;
    }
}
