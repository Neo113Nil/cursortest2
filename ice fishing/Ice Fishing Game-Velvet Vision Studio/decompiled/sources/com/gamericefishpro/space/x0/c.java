package com.gamericefishpro.space.x0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public final /* synthetic */ int i = 1;
    public final Object v;

    public c(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.v = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.v;
                int i = this.d;
                this.d = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.d++;
                return this.v;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.v;
                int i = this.d - 1;
                this.d = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.d--;
                return this.v;
        }
    }

    public c(int i, Object obj) {
        super(i, 1);
        this.v = obj;
    }
}
