package app.cash.cdp.integration;

import app.cash.molecule.PlatformKt;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class CdpModule$Companion$provideCashCDP$1 implements FunctionAdapter {
    public final /* synthetic */ SessionManager $tmp0;

    public CdpModule$Companion$provideCashCDP$1(SessionManager sessionManager) {
        this.$tmp0 = sessionManager;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CdpModule$Companion$provideCashCDP$1) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(0, 1, PlatformKt.class, this.$tmp0, "appTokenOrNull", "appTokenOrNull(Lcom/squareup/cash/session/backend/SessionManager;)Ljava/lang/String;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
