package com.gamericefishpro.space.z3;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Context i;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;

    public /* synthetic */ d(String str, Context context, Object obj, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.i = context;
        this.w = obj;
        this.v = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object[] objArr = {(c) this.w};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.e, this.i, Collections.unmodifiableList(arrayList), this.v);
            default:
                try {
                    return g.b(this.e, this.i, (ArrayList) this.w, this.v);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
