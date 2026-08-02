package com.squareup.cash.borrow.presenters;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.protos.franklin.lending.GetLoanHistoryRequest;
import com.squareup.protos.franklin.lending.GetLoanHistoryResponse;
import com.squareup.protos.franklin.lending.LendingAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class ExpandedLoanHistoryListPresenter$models$pager$1$1$1 extends PagingSource {
    public final /* synthetic */ Ref$ObjectRef $nextPageToken;
    public final /* synthetic */ MusicPresenter this$0;

    public ExpandedLoanHistoryListPresenter$models$pager$1$1$1(MusicPresenter musicPresenter, Ref$ObjectRef ref$ObjectRef) {
        this.this$0 = musicPresenter;
        this.$nextPageToken = ref$ObjectRef;
    }

    @Override // androidx.paging.PagingSource
    public final Object getRefreshKey(PagingState pagingState) {
        pagingState.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(PagingSource.LoadParams loadParams, ContinuationImpl continuationImpl) {
        ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1 expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1) {
            expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1 = (ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1) continuationImpl;
            int i2 = expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.label;
                Ref$ObjectRef ref$ObjectRef = this.$nextPageToken;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LendingAppService lendingAppService = (LendingAppService) this.this$0.musicRepository;
                    GetLoanHistoryRequest getLoanHistoryRequest = new GetLoanHistoryRequest(null, (String) ref$ObjectRef.element, ByteString.EMPTY);
                    expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.label = 1;
                    obj = lendingAppService.getLoanHistory(getLoanHistoryRequest, expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest forest = Timber.Forest;
                    Object obj2 = ref$ObjectRef.element;
                    GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) ((ApiResult.Success) apiResult).response;
                    forest.v("Received loan page <%s> of size %d", obj2, new Integer(getLoanHistoryResponse.loans.size()));
                    ref$ObjectRef.element = getLoanHistoryResponse.next_page_pagination_token;
                    List list = getLoanHistoryResponse.loans;
                    Object obj3 = ref$ObjectRef.element;
                    list.getClass();
                    return new PagingSource.LoadResult.Page(list, null, obj3, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Timber.Forest.e("Failed to obtain next loan history page: %s", apiResult);
                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                if (failure instanceof ApiResult.Failure.NetworkFailure) {
                    return new PagingSource.LoadResult.Error(((ApiResult.Failure.NetworkFailure) apiResult).error);
                }
                if (failure instanceof ApiResult.Failure.HttpFailure) {
                    return new PagingSource.LoadResult.Error(new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "Http failure with code ")));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1 = new ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1(this, continuationImpl);
        Object obj4 = expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expandedLoanHistoryListPresenter$models$pager$1$1$1$load$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.$nextPageToken;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj4;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
