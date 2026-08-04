package com.gamericefishpro.space.qh;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h implements Iterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int w;

    public f(i map, int i) {
        this.w = i;
        Intrinsics.checkNotNullParameter(map, "map");
        this.v = map;
        this.e = -1;
        this.i = map.A;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b();
                int i = this.d;
                i iVar = (i) this.v;
                if (i >= iVar.y) {
                    throw new NoSuchElementException();
                }
                this.d = i + 1;
                this.e = i;
                g gVar = new g(iVar, i);
                c();
                return gVar;
            case 1:
                b();
                int i2 = this.d;
                i iVar2 = (i) this.v;
                if (i2 >= iVar2.y) {
                    throw new NoSuchElementException();
                }
                this.d = i2 + 1;
                this.e = i2;
                Object obj = iVar2.d[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.d;
                i iVar3 = (i) this.v;
                if (i3 >= iVar3.y) {
                    throw new NoSuchElementException();
                }
                this.d = i3 + 1;
                this.e = i3;
                Object[] objArr = iVar3.e;
                Intrinsics.b(objArr);
                Object obj2 = objArr[this.e];
                c();
                return obj2;
        }
    }
}
