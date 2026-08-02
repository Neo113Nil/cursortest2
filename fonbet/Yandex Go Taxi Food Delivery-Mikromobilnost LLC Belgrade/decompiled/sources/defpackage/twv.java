package defpackage;

import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.RootAvailableSecurityEbsException;

/* loaded from: classes4.dex */
public final /* synthetic */ class twv implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ uwv b;

    public /* synthetic */ twv(uwv uwvVar, int i) {
        this.a = i;
        this.b = uwvVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        uwv uwvVar = this.b;
        switch (i) {
            case 0:
                ISdkDispatchers iSdkDispatchers = uwvVar.g;
                return bvf0.a(iSdkDispatchers.io().plus(iSdkDispatchers.supervisorJob()));
            default:
                int rootAvailable = uwvVar.e.getRootAvailable();
                if (rootAvailable <= 0) {
                    return zy11.a;
                }
                throw new RootAvailableSecurityEbsException(rootAvailable);
        }
    }
}
