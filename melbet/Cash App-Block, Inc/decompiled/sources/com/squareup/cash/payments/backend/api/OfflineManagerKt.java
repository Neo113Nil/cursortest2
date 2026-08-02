package com.squareup.cash.payments.backend.api;

import android.os.Parcelable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.primitives.MarketingMessageDataKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.buynowpaylater.presenters.AfterPayViewModelMapperKt$WhenMappings;
import com.squareup.cash.buynowpaylater.viewmodels.Alignment;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.InfoTileCardViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OrderPaymentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.StackableRow;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.OrderPaymentMethod;
import com.squareup.protos.cash.cashapproxy.api.RowItem;
import com.squareup.protos.cash.cashapproxy.api.StackableElement;
import com.squareup.protos.cash.cashapproxy.api.StackableElement$Content$RowItem;
import com.squareup.protos.cash.cashapproxy.api.StackableElement$Content$Text;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashapproxy.api.TextAlignment;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.cashapproxy.api.TextWithInfo;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes5.dex */
public abstract class OfflineManagerKt {
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, RecyclerView.DECELERATION_RATE, metrics, z, truncateAt, i2);
    }

    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    public static final InfoTileCardViewModel parseInfoCard(InfoTile infoTile) {
        if (infoTile == null) {
            return null;
        }
        Text text = infoTile.title;
        text.getClass();
        TextModel textModel = toTextModel(text, true);
        Text text2 = infoTile.info;
        return new InfoTileCardViewModel(textModel, text2 != null ? toTextModel(text2, true) : null, infoTile.icon);
    }

    public static final OrderPaymentViewModel parseOrderPaymentViewModel(OrderPaymentMethod orderPaymentMethod) {
        orderPaymentMethod.getClass();
        Image image = orderPaymentMethod.image;
        Text text = orderPaymentMethod.method_name;
        TextModel textModel = text != null ? toTextModel(text, true) : null;
        Text text2 = orderPaymentMethod.method_details;
        TextModel textModel2 = text2 != null ? toTextModel(text2, true) : null;
        Text text3 = orderPaymentMethod.extra_info_title;
        TextModel textModel3 = text3 != null ? toTextModel(text3, true) : null;
        Text text4 = orderPaymentMethod.extra_info_text;
        return new OrderPaymentViewModel(image, textModel, textModel2, textModel3, text4 != null ? toTextModel(text4, true) : null, orderPaymentMethod.payment_method_id);
    }

    public static final TextWithIcon parseTextWithInfo(TextWithInfo textWithInfo) {
        Parcelable rowItem;
        textWithInfo.getClass();
        Text text = textWithInfo.text;
        TextModel textModel = text != null ? toTextModel(text, true) : null;
        List list = textWithInfo.info_halfsheet_contents;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            MarketingMessageDataKt marketingMessageDataKt = ((StackableElement) it.next()).content;
            if (marketingMessageDataKt instanceof StackableElement$Content$Text) {
                rowItem = new StackableRow.Text(toTextModel(((StackableElement$Content$Text) marketingMessageDataKt).value, true));
            } else {
                if (!(marketingMessageDataKt instanceof StackableElement$Content$RowItem)) {
                    if (marketingMessageDataKt == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("No text or row_item defined in StackableElement.");
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RowItem rowItem2 = ((StackableElement$Content$RowItem) marketingMessageDataKt).value;
                Text text2 = rowItem2.title;
                TextModel textModel2 = text2 != null ? toTextModel(text2, true) : null;
                Text text3 = rowItem2.detail;
                rowItem = new StackableRow.RowItem(textModel2, text3 != null ? toTextModel(text3, true) : null);
            }
            arrayList.add(rowItem);
        }
        return new TextWithIcon(textModel, new InfoSheetViewModel(arrayList));
    }

    public static final String reasonDesc(ApiResult.Failure failure, boolean z) {
        return failure instanceof ApiResult.Failure.HttpFailure ? String.valueOf(((ApiResult.Failure.HttpFailure) failure).code) : !z ? "No network available" : "Network error";
    }

    public static final TextModel toTextModel(Text text, boolean z) {
        Alignment alignment;
        text.getClass();
        String str = text.text;
        TextStyle textStyle = text.style;
        if (textStyle == null) {
            textStyle = TextStyle.TEXT_STYLE_SMALL_BODY;
        }
        TextAlignment textAlignment = text.alignment;
        Alignment alignment2 = null;
        if (textAlignment != null) {
            int i = AfterPayViewModelMapperKt$WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
            if (i == -1) {
                alignment = Alignment.LEADING;
            } else if (i == 1) {
                alignment = Alignment.LEADING;
            } else if (i == 2) {
                alignment = Alignment.TRAILING;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                alignment = Alignment.CENTER;
            }
            alignment2 = alignment;
        }
        return new TextModel(str, textStyle, alignment2, text.text_color, z);
    }
}
