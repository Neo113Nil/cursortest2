package com.squareup.cash.buynowpaylater.presenters;

import androidx.core.text.TextUtilsCompat;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import app.cash.api.ApiResult;
import app.cash.local.primitives.LocalErrorKt;
import app.cash.local.primitives.LocationMenuKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashapproxy.api.AfterpayHubRowItem;
import com.squareup.protos.cash.cashapproxy.api.AfterpayHubRowItem$DetailContent$ActionButton;
import com.squareup.protos.cash.cashapproxy.api.AfterpayHubRowItem$DetailContent$InfoIcon;
import com.squareup.protos.cash.cashapproxy.api.AfterpayHubRowItem$DetailContent$Text;
import com.squareup.protos.cash.cashapproxy.api.Avatar;
import com.squareup.protos.cash.cashapproxy.api.Button;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashapproxy.api.GetApOrdersHubRequest;
import com.squareup.protos.cash.cashapproxy.api.GetApOrdersHubResponse;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.OrderHubRow;
import com.squareup.protos.cash.cashapproxy.api.OrderHubRow$Content$RowItem;
import com.squareup.protos.cash.cashapproxy.api.OrderHubRow$Content$SectionHeader;
import com.squareup.protos.cash.cashapproxy.api.OrderHubRow$Content$SectionHeaderString;
import com.squareup.protos.cash.cashapproxy.api.Summary;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.cashapproxy.api.TextWithInfo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubDataSource extends PagingSource {
    public final boolean keyReuseSupported;
    public final Channel loadingStatus;
    public final CashApProxyClientService service;
    public final AndroidStringManager stringManager;

    public AfterPayOrderHubDataSource(CashApProxyClientService cashApProxyClientService, BufferedChannel bufferedChannel, AndroidStringManager androidStringManager) {
        bufferedChannel.getClass();
        this.service = cashApProxyClientService;
        this.loadingStatus = bufferedChannel;
        this.stringManager = androidStringManager;
        this.keyReuseSupported = true;
    }

    @Override // androidx.paging.PagingSource
    public final boolean getKeyReuseSupported() {
        return this.keyReuseSupported;
    }

    @Override // androidx.paging.PagingSource
    public final Object getRefreshKey(PagingState pagingState) {
        pagingState.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(PagingSource.LoadParams loadParams, ContinuationImpl continuationImpl) {
        AfterPayOrderHubDataSource$load$1 afterPayOrderHubDataSource$load$1;
        int i;
        ApiResult apiResult;
        ActionButton actionButton;
        AfterPayOrderHubRowModel paymentRowModel;
        TextWithInfo textWithInfo;
        Text text;
        Button button;
        PagingSource.LoadParams loadParams2 = loadParams;
        if (continuationImpl instanceof AfterPayOrderHubDataSource$load$1) {
            afterPayOrderHubDataSource$load$1 = (AfterPayOrderHubDataSource$load$1) continuationImpl;
            int i2 = afterPayOrderHubDataSource$load$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterPayOrderHubDataSource$load$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterPayOrderHubDataSource$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterPayOrderHubDataSource$load$1.label;
                Channel channel = this.loadingStatus;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (loadParams2.getKey() == null) {
                        ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(AfterPayOrderHubLoadingStatus.InitialLoadStatus.Loading.INSTANCE));
                    } else {
                        ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Loading.INSTANCE));
                    }
                    GetApOrdersHubRequest getApOrdersHubRequest = new GetApOrdersHubRequest((String) loadParams2.getKey(), new Long(loadParams2.loadSize), ByteString.EMPTY);
                    afterPayOrderHubDataSource$load$1.L$0 = loadParams2;
                    afterPayOrderHubDataSource$load$1.label = 1;
                    obj = this.service.getApOrdersHub(getApOrdersHubRequest, afterPayOrderHubDataSource$load$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    loadParams2 = afterPayOrderHubDataSource$load$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    String str = TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, null).message;
                    if (loadParams2.getKey() == null) {
                        ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(new AfterPayOrderHubLoadingStatus.InitialLoadStatus.Failure(str)));
                    } else {
                        ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(new AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Failure(str)));
                    }
                    return new PagingSource.LoadResult.Error(new IllegalStateException("Error loading AfterPay order hub - ".concat(str)));
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (loadParams2.getKey() == null) {
                    ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(AfterPayOrderHubLoadingStatus.InitialLoadStatus.Success.INSTANCE));
                } else {
                    ChannelResult.m4192getOrThrowimpl(channel.mo1159trySendJP2dKIU(AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Idle.INSTANCE));
                }
                GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) ((ApiResult.Success) apiResult).response;
                getApOrdersHubResponse.getClass();
                ArrayList arrayList = new ArrayList();
                Summary summary = getApOrdersHubResponse.summary;
                if (summary != null) {
                    Text text2 = summary.balance_title;
                    text2.getClass();
                    TextModel textModel = OfflineManagerKt.toTextModel(text2, true);
                    TextWithInfo textWithInfo2 = summary.balance_detail;
                    TextWithIcon parseTextWithInfo = textWithInfo2 != null ? OfflineManagerKt.parseTextWithInfo(textWithInfo2) : null;
                    Text text3 = summary.total_owed_title;
                    TextModel textModel2 = text3 != null ? OfflineManagerKt.toTextModel(text3, true) : null;
                    TextWithInfo textWithInfo3 = summary.total_owed_detail;
                    TextWithIcon parseTextWithInfo2 = textWithInfo3 != null ? OfflineManagerKt.parseTextWithInfo(textWithInfo3) : null;
                    InfoTile infoTile = summary.info_tile;
                    arrayList.add(new AfterPayOrderHubRowModel.HeaderModel(textModel, parseTextWithInfo, textModel2, parseTextWithInfo2, infoTile != null ? OfflineManagerKt.parseInfoCard(infoTile) : null));
                }
                for (OrderHubRow orderHubRow : getApOrdersHubResponse.rows) {
                    orderHubRow.getClass();
                    LocationMenuKt locationMenuKt = orderHubRow.content;
                    if (locationMenuKt instanceof OrderHubRow$Content$SectionHeaderString) {
                        paymentRowModel = new AfterPayOrderHubRowModel.SectionHeaderModel(new TextModel(((OrderHubRow$Content$SectionHeaderString) locationMenuKt).value, TextStyle.TEXT_STYLE_SMALL_BODY, null, null, true));
                    } else if (locationMenuKt instanceof OrderHubRow$Content$SectionHeader) {
                        paymentRowModel = new AfterPayOrderHubRowModel.SectionHeaderModel(OfflineManagerKt.toTextModel(((OrderHubRow$Content$SectionHeader) locationMenuKt).value, true));
                    } else {
                        if (!(locationMenuKt instanceof OrderHubRow$Content$RowItem)) {
                            if (locationMenuKt == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unsupported OrderHubRow type. Must contain header text or row_item");
                                return null;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AfterpayHubRowItem afterpayHubRowItem = ((OrderHubRow$Content$RowItem) locationMenuKt).value;
                        LocalErrorKt localErrorKt = afterpayHubRowItem.detail_content;
                        String str2 = afterpayHubRowItem.id;
                        str2.getClass();
                        Text text4 = afterpayHubRowItem.title;
                        text4.getClass();
                        TextModel textModel3 = OfflineManagerKt.toTextModel(text4, true);
                        Text text5 = afterpayHubRowItem.subtitle;
                        TextModel textModel4 = text5 != null ? OfflineManagerKt.toTextModel(text5, true) : null;
                        AfterpayHubRowItem$DetailContent$ActionButton afterpayHubRowItem$DetailContent$ActionButton = localErrorKt instanceof AfterpayHubRowItem$DetailContent$ActionButton ? (AfterpayHubRowItem$DetailContent$ActionButton) localErrorKt : null;
                        if (afterpayHubRowItem$DetailContent$ActionButton == null || (button = afterpayHubRowItem$DetailContent$ActionButton.value) == null) {
                            actionButton = null;
                        } else {
                            Text text6 = button.title;
                            text6.getClass();
                            TextModel textModel5 = OfflineManagerKt.toTextModel(text6, true);
                            String str3 = button.action_url;
                            str3.getClass();
                            actionButton = new ActionButton(textModel5, str3);
                        }
                        String str4 = afterpayHubRowItem.row_action_url;
                        AfterpayHubRowItem$DetailContent$Text afterpayHubRowItem$DetailContent$Text = localErrorKt instanceof AfterpayHubRowItem$DetailContent$Text ? (AfterpayHubRowItem$DetailContent$Text) localErrorKt : null;
                        TextModel textModel6 = (afterpayHubRowItem$DetailContent$Text == null || (text = afterpayHubRowItem$DetailContent$Text.value) == null) ? null : OfflineManagerKt.toTextModel(text, true);
                        AfterpayHubRowItem$DetailContent$InfoIcon afterpayHubRowItem$DetailContent$InfoIcon = localErrorKt instanceof AfterpayHubRowItem$DetailContent$InfoIcon ? (AfterpayHubRowItem$DetailContent$InfoIcon) localErrorKt : null;
                        TextWithIcon parseTextWithInfo3 = (afterpayHubRowItem$DetailContent$InfoIcon == null || (textWithInfo = afterpayHubRowItem$DetailContent$InfoIcon.value) == null) ? null : OfflineManagerKt.parseTextWithInfo(textWithInfo);
                        Avatar avatar = afterpayHubRowItem.avatar;
                        paymentRowModel = new AfterPayOrderHubRowModel.PaymentRowModel(str2, new com.squareup.cash.buynowpaylater.viewmodels.Avatar(avatar != null ? avatar.image : null, avatar != null ? avatar.badge : null), textModel3, textModel4, str4, actionButton, textModel6, parseTextWithInfo3);
                    }
                    arrayList.add(paymentRowModel);
                }
                return new PagingSource.LoadResult.Page(arrayList, null, getApOrdersHubResponse.next_completed_orders_pagination_token, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
            }
        }
        afterPayOrderHubDataSource$load$1 = new AfterPayOrderHubDataSource$load$1(this, continuationImpl);
        Object obj2 = afterPayOrderHubDataSource$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterPayOrderHubDataSource$load$1.label;
        Channel channel2 = this.loadingStatus;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }
}
