package app.cash.cdp.integration;

import app.cash.molecule.PlatformKt;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class CdpModule$Companion$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SessionManager f$0;

    public /* synthetic */ CdpModule$Companion$$ExternalSyntheticLambda0(SessionManager sessionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SessionManager sessionManager = this.f$0;
        switch (i) {
            case 0:
                return PlatformKt.activeAccountTokenOrNull(sessionManager);
            default:
                return Boolean.valueOf(PlatformKt.activeAccountTokenOrNull(sessionManager) != null);
        }
    }
}
