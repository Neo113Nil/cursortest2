package defpackage;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.api.entities.b;
import com.ybsdk.feature.pin.api.entities.c;
import com.ybsdk.feature.pin.api.entities.d;
import com.ybsdk.feature.pin.api.entities.e;
import com.ybsdk.feature.pin.api.entities.f;
import com.ybsdk.feature.pin.api.entities.g;
import com.ybsdk.feature.pin.api.entities.h;
import com.ybsdk.feature.pin.api.entities.i;
import com.ybsdk.feature.pin.api.entities.j;
import com.ybsdk.feature.pin.api.entities.k;
import com.ybsdk.feature.pin.api.entities.l;
import com.ybsdk.feature.pin.api.entities.m;
import com.ybsdk.feature.pin.api.entities.n;
import com.ybsdk.feature.pin.api.entities.o;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import com.ybsdk.screens.initial.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zvb0 implements awv {
    public final /* synthetic */ a a;

    public zvb0(a aVar) {
        this.a = aVar;
    }

    public final FragmentScreen a(StartSessionState startSessionState, boolean z) {
        InternalSdkState startSessionDeeplink;
        InternalSdkState openProduct;
        InternalSdkState updateRequired;
        if (startSessionState == null) {
            return a.c(this.a);
        }
        if (startSessionState instanceof com.ybsdk.feature.pin.api.entities.a) {
            updateRequired = new InternalSdkState.AccountUpgrade(StartSessionCallSource.Pin.INSTANCE, xvb0.c(((com.ybsdk.feature.pin.api.entities.a) startSessionState).a));
        } else {
            if (startSessionState instanceof o) {
                o oVar = (o) startSessionState;
                openProduct = new InternalSdkState.YbRegistration(xvb0.a(oVar.a), oVar.b, StartSessionCallSource.Pin.INSTANCE, xvb0.c(oVar.c));
            } else if (startSessionState instanceof g) {
                updateRequired = new InternalSdkState.PinTokenClear(StartSessionCallSource.Pin.INSTANCE, xvb0.c(((g) startSessionState).a));
            } else if (startSessionState instanceof h) {
                updateRequired = new InternalSdkState.PinInput.PinTokenReissue(null, StartSessionCallSource.Pin.INSTANCE, xvb0.c(((h) startSessionState).b));
            } else if (startSessionState instanceof j) {
                updateRequired = new InternalSdkState.RequestNewAmToken(StartSessionCallSource.Pin.INSTANCE, xvb0.c(((j) startSessionState).a));
            } else {
                if (startSessionState instanceof b) {
                    b bVar = (b) startSessionState;
                    ArrayList arrayList = bVar.a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(xvb0.f((uzb0) it.next()));
                    }
                    startSessionDeeplink = new InternalSdkState.ApplicationStatusCheck(arrayList2, StartSessionCallSource.Pin.INSTANCE, xvb0.c(bVar.b));
                } else if (startSessionState instanceof d) {
                    updateRequired = new InternalSdkState.Error(((d) startSessionState).a, StartSessionCallSource.Pin.INSTANCE);
                } else if (startSessionState instanceof e) {
                    e eVar = (e) startSessionState;
                    ArrayList arrayList3 = eVar.a;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(xvb0.f((uzb0) it2.next()));
                    }
                    openProduct = new InternalSdkState.Ok(arrayList4, eVar.b, StartSessionCallSource.Pin.INSTANCE, xvb0.c(eVar.c));
                } else if (startSessionState instanceof i) {
                    i iVar = (i) startSessionState;
                    updateRequired = new InternalSdkState.PinInput.PinTokenRetry(iVar.a, StartSessionCallSource.Pin.INSTANCE, xvb0.c(iVar.b));
                } else if (startSessionState instanceof k) {
                    k kVar = (k) startSessionState;
                    updateRequired = new InternalSdkState.SmsAuthorization(kVar.a, StartSessionCallSource.Pin.INSTANCE, xvb0.c(kVar.b));
                } else if (startSessionState instanceof l) {
                    l lVar = (l) startSessionState;
                    updateRequired = new InternalSdkState.Support(lVar.a, StartSessionCallSource.Pin.INSTANCE, xvb0.c(lVar.b));
                } else if (startSessionState.equals(m.a)) {
                    updateRequired = new InternalSdkState.Unauthenticated(StartSessionCallSource.Pin.INSTANCE);
                } else if (startSessionState instanceof n) {
                    updateRequired = new InternalSdkState.UpdateRequired(StartSessionCallSource.Pin.INSTANCE, xvb0.c(((n) startSessionState).a));
                } else if (startSessionState instanceof f) {
                    f fVar = (f) startSessionState;
                    openProduct = new InternalSdkState.OpenProduct(xvb0.a(fVar.a), fVar.b, StartSessionCallSource.Pin.INSTANCE, xvb0.c(fVar.c));
                } else {
                    if (!(startSessionState instanceof c)) {
                        w511.b();
                        return null;
                    }
                    c cVar = (c) startSessionState;
                    startSessionDeeplink = new InternalSdkState.StartSessionDeeplink(cVar.a, null, StartSessionCallSource.Pin.INSTANCE, xvb0.c(cVar.b), 2, null);
                }
                updateRequired = startSessionDeeplink;
            }
            updateRequired = openProduct;
        }
        return a.b(new InitialFragmentScreenParams.ResponsePreloaded(updateRequired, z));
    }
}
