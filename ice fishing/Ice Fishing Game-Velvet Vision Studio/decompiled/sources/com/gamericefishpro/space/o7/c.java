package com.gamericefishpro.space.o7;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f0.f;
import com.gamericefishpro.space.f0.h;
import com.gamericefishpro.space.t0.v0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v0 e;

    public /* synthetic */ c(v0 v0Var, int i) {
        this.d = i;
        this.e = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intent;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h LazyColumn = (h) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                v0 v0Var = this.e;
                List list = ((d) v0Var.getValue()).a;
                LazyColumn.b.a(list.size(), new f(null, new com.gamericefishpro.space.k7.a(1, list), new com.gamericefishpro.space.b1.h(802480018, new com.gamericefishpro.space.k7.b(1, list), true)));
                if (((d) v0Var.getValue()).a.size() < 4) {
                    h.p(LazyColumn, b.a);
                }
                break;
            default:
                com.gamericefishpro.space.h.b result = (com.gamericefishpro.space.h.b) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                Uri data = (result.d != -1 || (intent = result.e) == null) ? null : intent.getData();
                v0 v0Var2 = this.e;
                ValueCallback valueCallback = (ValueCallback) v0Var2.getValue();
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(data != null ? new Uri[]{data} : null);
                }
                v0Var2.setValue(null);
                break;
        }
        return Unit.a;
    }
}
