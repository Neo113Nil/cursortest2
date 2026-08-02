package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.NonNull;
import com.android.billingclient.api.QueryProductDetailsResult;
import defpackage.pz2;
import defpackage.qtm;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f implements qtm {
    public final String a;
    public final pz2 b;
    public final UtilsProvider c;
    public final Function0 d;
    public final List e;
    public final d f;
    public final n g;

    public f(String str, pz2 pz2Var, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.a = str;
        this.b = pz2Var;
        this.c = utilsProvider;
        this.d = hVar;
        this.e = list;
        this.f = dVar;
        this.g = nVar;
    }

    public final void onProductDetailsResponse(uz2 uz2Var, QueryProductDetailsResult queryProductDetailsResult) {
        this.c.getWorkerExecutor().execute(new e(this, uz2Var, queryProductDetailsResult));
    }

    @Override // defpackage.qtm
    public abstract /* synthetic */ void onProductDetailsResponse(@NonNull uz2 uz2Var, @NonNull List list);
}
