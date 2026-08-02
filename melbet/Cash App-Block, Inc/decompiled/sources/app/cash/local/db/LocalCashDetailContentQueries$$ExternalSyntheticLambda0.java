package app.cash.local.db;

import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.wire.GrpcMethod;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalCashDetailContentQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalTabContentQueries f$1;

    public /* synthetic */ LocalCashDetailContentQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                int i2 = LocalCashDetailContentQueries$selectContent$2.$r8$clinit;
                break;
            case 2:
                int i3 = LocalCashDetailContentQueries$selectHowItWorks$2.$r8$clinit;
                break;
            default:
                int i4 = LocalCashDetailContentQueries$selectActivity$2.$r8$clinit;
                break;
        }
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        switch (i) {
            case 0:
                int i2 = LocalCashDetailContentQueries$selectActivity$2.$r8$clinit;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                ?? bytes = androidCursor.getBytes(0);
                return new SelectActivity(bytes != 0 ? (LocalCashActivity) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).requestAdapter).decode(bytes) : null);
            case 1:
                int i3 = LocalCashDetailContentQueries$selectContent$2.$r8$clinit;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ?? bytes2 = androidCursor2.getBytes(0);
                return new SelectContent(bytes2 != 0 ? (LocalCashInformationalContent) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).decode(bytes2) : null);
            default:
                int i4 = LocalCashDetailContentQueries$selectHowItWorks$2.$r8$clinit;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                ?? bytes3 = androidCursor3.getBytes(0);
                return new SelectHowItWorks(bytes3 != 0 ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).decode(bytes3) : null);
        }
    }
}
