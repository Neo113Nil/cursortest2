package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface vg01 {
    Object a(Continuation continuation);

    Object d(FundDocsNoticeRequest fundDocsNoticeRequest, int i, Continuation continuation);

    Object e(TransfersPageRequest transfersPageRequest, String str, ContinuationImpl continuationImpl);

    Object f(String str, GetSuggestedTargetsRequest getSuggestedTargetsRequest, Continuation continuation);

    Object g(String str, Map map, TransferConfirmVersion2Request transferConfirmVersion2Request, ContinuationImpl continuationImpl);

    Object h(TransferGetResultRequest transferGetResultRequest, int i, ContinuationImpl continuationImpl);

    Object i(TransferRequest transferRequest, String str, ContinuationImpl continuationImpl);
}
