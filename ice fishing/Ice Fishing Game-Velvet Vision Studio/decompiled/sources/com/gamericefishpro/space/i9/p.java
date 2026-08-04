package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator {
    public final /* synthetic */ int d;
    public int e = 0;
    public final /* synthetic */ Object i;

    public /* synthetic */ p(int i, Object obj) {
        this.d = i;
        this.i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e < ((q) this.i).d.length();
            case 1:
                return this.e < ((q) this.i).d.length();
            default:
                return this.e < ((d) this.i).r();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = ((q) this.i).d;
                int i = this.e;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.e = i + 1;
                return new q(String.valueOf(i));
            case 1:
                q qVar = (q) this.i;
                String str2 = qVar.d;
                int i2 = this.e;
                if (i2 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.e = i2 + 1;
                return new q(String.valueOf(qVar.d.charAt(i2)));
            default:
                d dVar = (d) this.i;
                if (this.e < dVar.r()) {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    return dVar.s(i3);
                }
                int i4 = this.e;
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i4);
                throw new NoSuchElementException(sb.toString());
        }
    }
}
