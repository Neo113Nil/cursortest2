package app.cash.cdp.backend.jvm;

import com.squareup.protos.cash.cdpproxy.api.SendAnalyticsMessageBatchRequest;
import com.squareup.protos.cash.cdpproxy.api.SendAnalyticsMessageBatchResponse;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lapp/cash/cdp/backend/jvm/BatchUploader;", "", "upload", "Lretrofit2/Call;", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse;", "batchRequest", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchRequest;", "jvm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BatchUploader {
    @POST("/cash-app/cdp/send-analytics-message-batch")
    Call<SendAnalyticsMessageBatchResponse> upload(@Body SendAnalyticsMessageBatchRequest batchRequest);
}
