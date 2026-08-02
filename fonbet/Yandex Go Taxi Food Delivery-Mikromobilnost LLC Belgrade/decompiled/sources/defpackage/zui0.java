package defpackage;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import com.ybsdk.rconfig.retriever.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class zui0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ zui0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        RemoteConfigUpdateTrigger remoteConfigUpdateTrigger;
        switch (this.a) {
            case 0:
                InternalSdkState internalSdkState = (InternalSdkState) obj;
                d dVar = this.b;
                InternalSdkState internalSdkState2 = dVar.i;
                dVar.i = internalSdkState;
                if (internalSdkState2 == null) {
                    remoteConfigUpdateTrigger = RemoteConfigUpdateTrigger.INITIAL;
                } else if (((internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) || (internalSdkState instanceof InternalSdkState.Ok)) && ((internalSdkState2 instanceof InternalSdkState.YbRegistration) || (internalSdkState2 instanceof InternalSdkState.OpenProduct))) {
                    remoteConfigUpdateTrigger = RemoteConfigUpdateTrigger.BANK_REGISTRATION;
                } else {
                    boolean z = internalSdkState2 instanceof InternalSdkState.Unauthenticated;
                    remoteConfigUpdateTrigger = (!z || (internalSdkState instanceof InternalSdkState.Unauthenticated)) ? (z || !(internalSdkState instanceof InternalSdkState.Unauthenticated)) ? RemoteConfigUpdateTrigger.SDK_STATE_CHANGE : RemoteConfigUpdateTrigger.LOGOUT : RemoteConfigUpdateTrigger.LOGIN;
                }
                if ((internalSdkState2 instanceof InternalSdkState.PinInput.PinTokenReissue) && (internalSdkState instanceof InternalSdkState.Ok)) {
                    i5z0.a.g("Ignore state=" + internalSdkState, new Object[0]);
                    yui0 yui0Var = dVar.j;
                    if (yui0Var != null) {
                        yui0Var.b.a(null);
                    }
                    dVar.h.f();
                    yui0 yui0Var2 = dVar.j;
                    if (yui0Var2 != null) {
                        dVar.h.g(new yui0(internalSdkState, yui0Var2.b));
                    }
                } else {
                    d.c(dVar, internalSdkState, remoteConfigUpdateTrigger);
                }
                break;
            default:
                d dVar2 = this.b;
                d.c(dVar2, dVar2.i, RemoteConfigUpdateTrigger.PASSPORT_LOGIN);
                break;
        }
        return zy11.a;
    }
}
