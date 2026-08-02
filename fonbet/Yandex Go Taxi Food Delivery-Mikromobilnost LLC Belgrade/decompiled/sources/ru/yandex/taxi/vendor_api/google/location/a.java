package ru.yandex.taxi.vendor_api.google.location;

import android.content.Context;
import com.google.android.gms.tasks.zzw;
import defpackage.bdz;
import defpackage.dqs;
import defpackage.dvw;
import defpackage.fqs;
import defpackage.j18;
import defpackage.jln;
import defpackage.k991;
import defpackage.mc3;
import defpackage.si3;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a implements dqs {
    public final k991 a;

    public a(Context context) {
        this.a = bdz.a(context);
    }

    @Override // defpackage.dqs
    public final Object a(ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        zzw e = this.a.e();
        e.f(new jln(28, new si3(j18Var, 9)));
        e.d(new mc3(j18Var, 3));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    @Override // defpackage.dqs
    public final tpr b(fqs fqsVar) {
        return e.g(new GoogleFusedLocationAPIHelperImpl$locationUpdates$1(this, fqsVar, null));
    }
}
