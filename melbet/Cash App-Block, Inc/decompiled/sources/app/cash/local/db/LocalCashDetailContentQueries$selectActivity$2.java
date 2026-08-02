package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalCashDetailContentQueries$selectActivity$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LocalCashDetailContentQueries$selectActivity$2() {
        super(1, SelectActivity.class, "<init>", "<init>(Lcom/squareup/protos/cash/local/client/v1/LocalCashActivity;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new SelectActivity((LocalCashActivity) obj);
    }
}
