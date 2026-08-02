package ru.yandex.taxi.preorder.source.domain;

import android.location.Location;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import defpackage.git0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tls;
import defpackage.uzs;
import defpackage.zgc0;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class q {
    public final git0 a;
    public final com.yandex.go.route.interactor.c b;
    public final po21 c;

    public q(git0 git0Var, com.yandex.go.route.interactor.c cVar, po21 po21Var) {
        this.a = git0Var;
        this.b = cVar;
        this.c = po21Var;
    }

    public final void a(tls tlsVar) {
        ru.yandex.taxi.lifecycle.c.d(this.a.a, Lifecycle.Event.ON_STOP, new SourceAddressOrFallbackInteractor$doWithSourceAddress$1(tlsVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        SourceAddressOrFallbackInteractor$sourceAddressOrFallback$1 sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1;
        int i;
        zgc0 zgc0Var;
        uzs uzsVar;
        if (continuationImpl instanceof SourceAddressOrFallbackInteractor$sourceAddressOrFallback$1) {
            sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1 = (SourceAddressOrFallbackInteractor$sourceAddressOrFallback$1) continuationImpl;
            int i2 = sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address g = this.b.g();
                    if (g != null) {
                        return g;
                    }
                    zgc0 zgc0Var2 = PlainAddress.Companion;
                    uzs uzsVar2 = zzs.Companion;
                    sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.L$0 = zgc0Var2;
                    sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.L$1 = uzsVar2;
                    sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.label = 1;
                    Object h = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zgc0Var = zgc0Var2;
                    obj = h;
                    uzsVar = uzsVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uzsVar = (uzs) sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.L$1;
                    zgc0Var = (zgc0) sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.L$0;
                    kotlin.b.b(obj);
                }
                Location b = ((mo21) obj).b();
                uzsVar.getClass();
                zzs b2 = uzs.b(b);
                zgc0Var.getClass();
                return zgc0.a(b2);
            }
        }
        sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1 = new SourceAddressOrFallbackInteractor$sourceAddressOrFallback$1(this, continuationImpl);
        Object obj2 = sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressOrFallbackInteractor$sourceAddressOrFallback$1.label;
        if (i != 0) {
        }
        Location b3 = ((mo21) obj2).b();
        uzsVar.getClass();
        zzs b22 = uzs.b(b3);
        zgc0Var.getClass();
        return zgc0.a(b22);
    }
}
