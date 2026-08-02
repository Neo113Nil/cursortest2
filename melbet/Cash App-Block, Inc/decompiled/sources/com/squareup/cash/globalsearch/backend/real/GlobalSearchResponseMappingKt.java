package com.squareup.cash.globalsearch.backend.real;

import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import coil3.decode.StaticImageDecoderKt;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel$Item$Accessory$ButtonAccessory;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$StyledText;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection$Item$Item$ActivityRow;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection$Item$Item$SearchRow;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.discover.api.app.v2.model.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class GlobalSearchResponseMappingKt {
    public static final String getText(Button button) {
        FetcherKt fetcherKt = button.content;
        if (fetcherKt instanceof Button$Content$Text) {
            return ((Button$Content$Text) fetcherKt).value;
        }
        if (fetcherKt instanceof Button$Content$StyledText) {
            return ((Button$Content$StyledText) fetcherKt).value.text;
        }
        return null;
    }

    public static final boolean isMerchantOrBrand(String str) {
        str.getClass();
        return StringsKt__StringsJVMKt.startsWith(str, "M_", false) || StringsKt__StringsJVMKt.startsWith(str, "BRAND_", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x038e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0165  */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.squareup.cash.arcade.Icons] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [com.squareup.protos.cash.discover.api.app.v2.model.RowSection$Item$Item$SearchRow] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [com.squareup.protos.cash.discover.api.app.v2.model.RowSection$SearchRow] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GlobalSearchResponseSectionModel mapToResponseModel(RowSection.Page page, String str, String str2) {
        RowSection.SearchRow searchRow;
        ActivityRow activityRow;
        GlobalSearchViewModel.Modal modal;
        String str3;
        GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel;
        PaymentHistoryData paymentHistoryData;
        GlobalSearchViewModel.Modal modal2;
        String str4;
        GlobalSearchResponseSectionModel globalSearchResponseSectionModel;
        ?? r25;
        GlobalSearchViewModel.Avatar avatar;
        Icon icon;
        String str5;
        String str6;
        page.getClass();
        str.getClass();
        str2.getClass();
        List<RowSection.Item> list = page.items;
        Section.Modal modal3 = page.warning;
        RowSection.Item item = (RowSection.Item) CollectionsKt.firstOrNull(list);
        GlobalSearchResponseSectionModel globalSearchResponseSectionModel2 = null;
        if (item == null) {
            return null;
        }
        StaticImageDecoderKt staticImageDecoderKt = item.item;
        if (staticImageDecoderKt != null) {
            RowSection$Item$Item$SearchRow rowSection$Item$Item$SearchRow = staticImageDecoderKt instanceof RowSection$Item$Item$SearchRow ? (RowSection$Item$Item$SearchRow) staticImageDecoderKt : null;
            if (rowSection$Item$Item$SearchRow != null) {
                searchRow = rowSection$Item$Item$SearchRow.value;
                int i = 2;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                String str7 = "";
                if (searchRow == null) {
                    ArrayList arrayList = new ArrayList();
                    for (RowSection.Item item2 : list) {
                        StaticImageDecoderKt staticImageDecoderKt2 = item2.item;
                        if (staticImageDecoderKt2 != null) {
                            ?? r5 = staticImageDecoderKt2 instanceof RowSection$Item$Item$SearchRow ? (RowSection$Item$Item$SearchRow) staticImageDecoderKt2 : globalSearchResponseSectionModel2;
                            ?? r52 = r5 != 0 ? r5.value : globalSearchResponseSectionModel2;
                            if (r52 != 0) {
                                String str8 = r52.id;
                                if (str8 == null) {
                                    GlobalSearchError globalSearchError = new GlobalSearchError("Global search row missing required id field", Thread$State$EnumUnboxingLocalUtility.m("entity_type", r52.entity_type), i);
                                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                                    if (errorReporter == null) {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                        return globalSearchResponseSectionModel2;
                                    }
                                    errorReporter.report(globalSearchError, defaultSamplingStrategy);
                                    globalSearchResponseSectionModel = globalSearchResponseSectionModel2;
                                } else {
                                    Text text = r52.title;
                                    String str9 = (text == null || (str6 = text.text) == null) ? "" : str6;
                                    if (text == null || (icon = text.icon) == null || (str5 = icon.arcade_id) == null) {
                                        r25 = globalSearchResponseSectionModel2;
                                    } else {
                                        Icons.Companion.getClass();
                                        r25 = zzd.get(str5);
                                    }
                                    Text text2 = r52.subtitle;
                                    ?? r18 = text2 != null ? text2.text : globalSearchResponseSectionModel2;
                                    String str10 = r52.action_url;
                                    UiAvatar uiAvatar = r52.avatar;
                                    if (uiAvatar != null) {
                                        String str11 = uiAvatar.monogram_text;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        avatar = new GlobalSearchViewModel.Avatar(str11, uiAvatar.image, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, r52.id, null, null, null))));
                                    } else {
                                        avatar = null;
                                    }
                                    globalSearchResponseSectionModel2 = new GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel(str9, r18, str10, avatar, null, str8, r52.entity_type, item2.metadata_json, r25);
                                    globalSearchResponseSectionModel = null;
                                }
                                if (globalSearchResponseSectionModel2 == null) {
                                    arrayList.add(globalSearchResponseSectionModel2);
                                }
                                globalSearchResponseSectionModel2 = globalSearchResponseSectionModel;
                                i = 2;
                            }
                        }
                        globalSearchResponseSectionModel = null;
                        GlobalSearchError globalSearchError2 = new GlobalSearchError("Global search row item missing search_row field", null, 6);
                        ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter2 == null) {
                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                            return null;
                        }
                        errorReporter2.report(globalSearchError2, defaultSamplingStrategy);
                        globalSearchResponseSectionModel2 = null;
                        if (globalSearchResponseSectionModel2 == null) {
                        }
                        globalSearchResponseSectionModel2 = globalSearchResponseSectionModel;
                        i = 2;
                    }
                    String str12 = page.cursor;
                    boolean z = str12 != null && modal3 == null;
                    if (modal3 != null) {
                        Text text3 = modal3.text;
                        if (text3 != null && (str4 = text3.text) != null) {
                            str7 = str4;
                        }
                        Button button = modal3.button;
                        modal2 = new GlobalSearchViewModel.Modal(str7, button != null ? getText(button) : null);
                    } else {
                        modal2 = null;
                    }
                    return new GlobalSearchResponseSectionModel.Rows(str, str2, arrayList, str12, z, modal2);
                }
                if (staticImageDecoderKt != null) {
                    RowSection$Item$Item$ActivityRow rowSection$Item$Item$ActivityRow = staticImageDecoderKt instanceof RowSection$Item$Item$ActivityRow ? (RowSection$Item$Item$ActivityRow) staticImageDecoderKt : null;
                    if (rowSection$Item$Item$ActivityRow != null) {
                        activityRow = rowSection$Item$Item$ActivityRow.value;
                        if (activityRow != null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            StaticImageDecoderKt staticImageDecoderKt3 = ((RowSection.Item) it.next()).item;
                            if (staticImageDecoderKt3 != null) {
                                RowSection$Item$Item$ActivityRow rowSection$Item$Item$ActivityRow2 = staticImageDecoderKt3 instanceof RowSection$Item$Item$ActivityRow ? (RowSection$Item$Item$ActivityRow) staticImageDecoderKt3 : null;
                                ActivityRow activityRow2 = rowSection$Item$Item$ActivityRow2 != null ? rowSection$Item$Item$ActivityRow2.value : null;
                                if (activityRow2 != null) {
                                    ActivityRow.Body body = activityRow2.body;
                                    if (body != null) {
                                        ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow = body instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body : null;
                                        PaymentHistoryInputsRow value = paymentHistoryInputsRow != null ? paymentHistoryInputsRow.getValue() : null;
                                        if (value != null) {
                                            UiPayment uiPayment = value.payment;
                                            if (uiPayment == null || (paymentHistoryData = uiPayment.history_data) == null) {
                                                UiPayment uiPayment2 = value.payment;
                                                Pair pair = new Pair("payment_token", uiPayment2 != null ? uiPayment2.token : null);
                                                UiCustomer uiCustomer = value.sender;
                                                Pair pair2 = new Pair("sender_id", uiCustomer != null ? uiCustomer.id : null);
                                                UiCustomer uiCustomer2 = value.recipient;
                                                GlobalSearchError globalSearchError3 = new GlobalSearchError("Global search payment missing history_data field", MapsKt__MapsKt.mapOf(pair, pair2, new Pair("recipient_id", uiCustomer2 != null ? uiCustomer2.id : null)), 2);
                                                ErrorReporter errorReporter3 = ErrorReporter.Companion.INSTANCE;
                                                if (errorReporter3 == null) {
                                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                    return null;
                                                }
                                                errorReporter3.report(globalSearchError3, defaultSamplingStrategy);
                                            } else {
                                                ActivityItemGlobalId activityItemGlobalId = activityRow2.activity_item_global_id;
                                                if (activityItemGlobalId == null) {
                                                    Pair pair3 = new Pair("row_id", activityRow2.row_id);
                                                    UiPayment uiPayment3 = value.payment;
                                                    GlobalSearchError globalSearchError4 = new GlobalSearchError("Global search activity row missing activity_item_global_id field", MapsKt__MapsKt.mapOf(pair3, new Pair("payment_token", uiPayment3 != null ? uiPayment3.token : null)), 2);
                                                    ErrorReporter errorReporter4 = ErrorReporter.Companion.INSTANCE;
                                                    if (errorReporter4 == null) {
                                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                        return null;
                                                    }
                                                    errorReporter4.report(globalSearchError4, defaultSamplingStrategy);
                                                } else {
                                                    String str13 = activityRow2.row_id;
                                                    if (str13 == null) {
                                                        Pair pair4 = new Pair("activity_item_global_id", activityItemGlobalId.toString());
                                                        UiPayment uiPayment4 = value.payment;
                                                        GlobalSearchError globalSearchError5 = new GlobalSearchError("Global search activity row missing row_id field", MapsKt__MapsKt.mapOf(pair4, new Pair("payment_token", uiPayment4 != null ? uiPayment4.token : null)), 2);
                                                        ErrorReporter errorReporter5 = ErrorReporter.Companion.INSTANCE;
                                                        if (errorReporter5 == null) {
                                                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                            return null;
                                                        }
                                                        errorReporter5.report(globalSearchError5, defaultSamplingStrategy);
                                                    } else {
                                                        UiCustomer uiCustomer3 = value.sender;
                                                        if (uiCustomer3 == null) {
                                                            GlobalSearchError globalSearchError6 = new GlobalSearchError("Global search payment data missing sender field", MapsKt__MapsKt.mapOf(new Pair("row_id", str13), new Pair("payment_token", uiPayment.token)), 2);
                                                            ErrorReporter errorReporter6 = ErrorReporter.Companion.INSTANCE;
                                                            if (errorReporter6 == null) {
                                                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                                return null;
                                                            }
                                                            errorReporter6.report(globalSearchError6, defaultSamplingStrategy);
                                                        } else {
                                                            UiCustomer uiCustomer4 = value.recipient;
                                                            if (uiCustomer4 == null) {
                                                                GlobalSearchError globalSearchError7 = new GlobalSearchError("Global search payment data missing recipient field", MapsKt__MapsKt.mapOf(new Pair("row_id", str13), new Pair("payment_token", uiPayment.token)), 2);
                                                                ErrorReporter errorReporter7 = ErrorReporter.Companion.INSTANCE;
                                                                if (errorReporter7 == null) {
                                                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                                    return null;
                                                                }
                                                                errorReporter7.report(globalSearchError7, defaultSamplingStrategy);
                                                            } else {
                                                                boolean areEqual = Intrinsics.areEqual(activityRow2.is_badged, Boolean.TRUE);
                                                                Long l = activityRow2.version;
                                                                globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = new GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel(new FormattedPaymentHistoryActivityData(uiPayment, uiCustomer3, uiCustomer4, areEqual, l != null ? l.longValue() : 0L, null, activityItemGlobalId, str13, paymentHistoryData, CollectionsKt.toSet(activityRow2.product_classifiers), null));
                                                                if (globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel == null) {
                                                                    arrayList2.add(globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = null;
                                            if (globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel == null) {
                                            }
                                        }
                                    }
                                    Pair pair5 = new Pair("row_id", activityRow2.row_id);
                                    ActivityItemGlobalId activityItemGlobalId2 = activityRow2.activity_item_global_id;
                                    GlobalSearchError globalSearchError8 = new GlobalSearchError("Global search activity row missing payment_history_inputs_row field", MapsKt__MapsKt.mapOf(pair5, new Pair("activity_item_global_id", activityItemGlobalId2 != null ? activityItemGlobalId2.toString() : null), new Pair("is_badged", activityRow2.is_badged)), 2);
                                    ErrorReporter errorReporter8 = ErrorReporter.Companion.INSTANCE;
                                    if (errorReporter8 == null) {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                        return null;
                                    }
                                    errorReporter8.report(globalSearchError8, defaultSamplingStrategy);
                                    globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = null;
                                    if (globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel == null) {
                                    }
                                }
                            }
                            GlobalSearchError globalSearchError9 = new GlobalSearchError("Global search activity item missing activity_row field", null, 6);
                            ErrorReporter errorReporter9 = ErrorReporter.Companion.INSTANCE;
                            if (errorReporter9 == null) {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                return null;
                            }
                            errorReporter9.report(globalSearchError9, defaultSamplingStrategy);
                            globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = null;
                            if (globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel == null) {
                            }
                        }
                        String str14 = page.cursor;
                        boolean z2 = str14 != null && modal3 == null;
                        if (modal3 != null) {
                            Text text4 = modal3.text;
                            if (text4 != null && (str3 = text4.text) != null) {
                                str7 = str3;
                            }
                            Button button2 = modal3.button;
                            modal = new GlobalSearchViewModel.Modal(str7, button2 != null ? getText(button2) : null);
                        } else {
                            modal = null;
                        }
                        return new GlobalSearchResponseSectionModel.Activities(str, str2, arrayList2, str14, z2, modal);
                    }
                }
                activityRow = null;
                if (activityRow != null) {
                }
            }
        }
        searchRow = null;
        int i2 = 2;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        String str72 = "";
        if (searchRow == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel toGlobalSearchResponseItemModel(RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData, RealClientRouteFormatter realClientRouteFormatter, AndroidStringManager androidStringManager, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Image image;
        GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory;
        String str8;
        ClientRoute viewPaySms;
        GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory2;
        Icons icons;
        Icons icons2;
        String str9;
        Character firstOrNull;
        ClientRoute viewCustomerProfileSms;
        String str10;
        recipientSuggestionsProvider$RecipientWithAnalyticsData.getClass();
        Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
        String str11 = recipient.customerId;
        if (str11 == null && (str11 = recipient.sms) == null && (str11 = recipient.email) == null) {
            GlobalSearchError globalSearchError = new GlobalSearchError("Global search recipient missing entity identifier", MapsKt__MapsKt.mapOf(new Pair("has_display_name", Boolean.valueOf(recipient.displayName != null)), new Pair("has_cashtag", Boolean.valueOf(recipient.cashtag != null)), new Pair("has_category", Boolean.valueOf(recipient.category != null)), new Pair("entity_type", str)), 2);
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter != null) {
                errorReporter.report(globalSearchError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return null;
            }
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
            return null;
        }
        String str12 = str11;
        String str13 = recipient.displayName;
        String str14 = str13 == null ? "" : str13;
        String str15 = recipient.category;
        if (str15 == null) {
            str15 = Cashtags.fromString(recipient.cashtag, recipient.region);
        }
        String str16 = str15;
        String str17 = recipient.actionUrl;
        String str18 = recipient.cashtag;
        Button button = recipient.actionButton;
        String str19 = recipient.sms;
        String str20 = recipient.email;
        String str21 = recipient.customerId;
        if (str17 == null) {
            if (str21 == null) {
                str3 = "";
                str5 = str21;
                if (str20 != null) {
                    ByteString.Companion companion = ByteString.Companion;
                    str4 = str18;
                    viewCustomerProfileSms = new ClientRoute.ViewCustomerProfileEmail(ClientRoute.ViewCustomerProfileEmail.spec, ClientRoute.ViewCustomerProfileEmail.deepLinkSpecs, null, ByteString.Companion.encodeUtf8(str20).base64Url());
                } else {
                    str4 = str18;
                    if (str19 != null) {
                        ByteString.Companion companion2 = ByteString.Companion;
                        viewCustomerProfileSms = new ClientRoute.ViewCustomerProfileSms(ClientRoute.ViewCustomerProfileSms.spec, ClientRoute.ViewCustomerProfileSms.deepLinkSpecs, null, ByteString.Companion.encodeUtf8(str19).base64Url());
                    } else {
                        str17 = null;
                    }
                }
            } else if (isMerchantOrBrand(str21)) {
                if (str2 != null) {
                    String uuid = UUID.randomUUID().toString();
                    ContextWrapper.Origin.OriginType originType = ContextWrapper.Origin.OriginType.GLOBAL_SEARCH;
                    str3 = "";
                    ByteString byteString = ByteString.EMPTY;
                    String base64 = new ContextWrapper(null, uuid, null, str2, new ContextWrapper.Origin(originType, null, byteString), byteString).encodeByteString().base64();
                    if (base64 != null) {
                        str10 = base64;
                        ClientRoute.ViewMerchantProfile viewMerchantProfile = new ClientRoute.ViewMerchantProfile(ClientRoute.ViewMerchantProfile.spec, null, str21, str10, ClientRoute.ViewMerchantProfile.deepLinkSpecs);
                        str5 = str21;
                        str4 = str18;
                        viewCustomerProfileSms = viewMerchantProfile;
                    }
                } else {
                    str3 = "";
                }
                str10 = str3;
                ClientRoute.ViewMerchantProfile viewMerchantProfile2 = new ClientRoute.ViewMerchantProfile(ClientRoute.ViewMerchantProfile.spec, null, str21, str10, ClientRoute.ViewMerchantProfile.deepLinkSpecs);
                str5 = str21;
                str4 = str18;
                viewCustomerProfileSms = viewMerchantProfile2;
            } else {
                str3 = "";
                str5 = str21;
                viewCustomerProfileSms = new ClientRoute.ViewCustomerProfile(ClientRoute.ViewCustomerProfile.spec, ClientRoute.ViewCustomerProfile.deepLinkSpecs, null, str5);
                str4 = str18;
            }
            str17 = zzjm.format(realClientRouteFormatter, viewCustomerProfileSms);
        } else {
            str3 = "";
            str4 = str18;
            str5 = str21;
        }
        String str22 = recipient.displayName;
        if (str22 == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(str22)) == null || (str6 = String.valueOf(firstOrNull.charValue())) == null) {
            str6 = str3;
        }
        Image image2 = recipient.photo;
        if (image2 != null) {
            str7 = str17;
            image = new Image(image2.light_url, image2.dark_url, 4);
        } else {
            str7 = str17;
            image = null;
        }
        Color color = recipient.themedAccentColor;
        GlobalSearchViewModel.Avatar avatar = new GlobalSearchViewModel.Avatar(str6, image, color != null ? new ColorModel.Accented(color) : new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(1, null, recipient.customerId, recipient.displayName, recipient.sms, recipient.email))));
        if (button != null) {
            String text = getText(button);
            if (text == null) {
                text = androidStringManager.get(R.string.payment_send);
            }
            if (button == null || (str9 = button.action_url) == null) {
                str9 = str3;
            }
            globalSearchViewModel$Item$Accessory$ButtonAccessory2 = new GlobalSearchViewModel$Item$Accessory$ButtonAccessory(new GlobalSearchViewModel.Button(text, str9));
            globalSearchViewModel$Item$Accessory$ButtonAccessory = null;
        } else {
            if (str4 != null) {
                Set set = Cashtags.SUPPORTED_SYMBOLS;
                String symbol = Moneys.symbol(Cashtags.guessCashtagCurrency(recipient.region));
                str4.getClass();
                viewPaySms = new ClientRoute.ViewPayCashtag(ClientRoute.ViewPayCashtag.spec, null, symbol, str4, ClientRoute.ViewPayCashtag.deepLinkSpecs);
            } else if (str5 == null || isMerchantOrBrand(str5)) {
                if (str20 != null) {
                    ByteString.Companion companion3 = ByteString.Companion;
                    String base64Url = ByteString.Companion.encodeUtf8(str20).base64Url();
                    globalSearchViewModel$Item$Accessory$ButtonAccessory = null;
                    viewPaySms = new ClientRoute.ViewPayEmail(ClientRoute.ViewPayEmail.spec, ClientRoute.ViewPayEmail.deepLinkSpecs, null, base64Url);
                } else {
                    globalSearchViewModel$Item$Accessory$ButtonAccessory = null;
                    if (str19 != null) {
                        ByteString.Companion companion4 = ByteString.Companion;
                        viewPaySms = new ClientRoute.ViewPaySms(ClientRoute.ViewPaySms.spec, ClientRoute.ViewPaySms.deepLinkSpecs, null, ByteString.Companion.encodeUtf8(str19).base64Url());
                    } else {
                        str8 = null;
                        globalSearchViewModel$Item$Accessory$ButtonAccessory2 = str8 != null ? new GlobalSearchViewModel$Item$Accessory$ButtonAccessory(new GlobalSearchViewModel.Button(androidStringManager.get(R.string.payment_send), str8)) : globalSearchViewModel$Item$Accessory$ButtonAccessory;
                    }
                }
                str8 = zzjm.format(realClientRouteFormatter, viewPaySms);
                if (str8 != null) {
                }
            } else {
                viewPaySms = new ClientRoute.ViewPayProfile(str5, 7);
            }
            globalSearchViewModel$Item$Accessory$ButtonAccessory = null;
            str8 = zzjm.format(realClientRouteFormatter, viewPaySms);
            if (str8 != null) {
            }
        }
        if (recipient.isVerified) {
            icons2 = Icons.AccountVerified16;
        } else {
            if (!recipient.isBusiness) {
                icons = globalSearchViewModel$Item$Accessory$ButtonAccessory;
                return new GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel(str14, str16, str7, avatar, globalSearchViewModel$Item$Accessory$ButtonAccessory2, str12, str, null, icons);
            }
            icons2 = Icons.Business16;
        }
        icons = icons2;
        return new GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel(str14, str16, str7, avatar, globalSearchViewModel$Item$Accessory$ButtonAccessory2, str12, str, null, icons);
    }
}
