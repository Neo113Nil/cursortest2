package androidx.media3.ui.compose.modifiers;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transactionpicker.presenters.TransactionViewModelMapperKt$toTransactionViewModel$1;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcStatus;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class ExtensionsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAppStoreUpdate.deepLinkSpecs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier] */
    /* renamed from: resizeWithContentScale-XrYQPog, reason: not valid java name */
    public static final Modifier m1153resizeWithContentScaleXrYQPog(Modifier modifier, ContentScale contentScale, Size size, Composer composer, int i) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-363477779);
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier.Companion companion2 = null;
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxSize(companion, 1.0f), null, 3);
        if (size != null) {
            long j = size.packedValue;
            gapComposer.startReplaceGroup(-1859173400);
            boolean z = true;
            boolean changed = ((((i & 7168) ^ 3072) > 2048 && gapComposer.changed(density)) || (i & 3072) == 2048) | gapComposer.changed(j);
            if ((((i & 112) ^ 48) <= 32 || !gapComposer.changed(contentScale)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = changed | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                TaxToolTipViewKt$$ExternalSyntheticLambda3 taxToolTipViewKt$$ExternalSyntheticLambda3 = new TaxToolTipViewKt$$ExternalSyntheticLambda3(density, contentScale, j, 1);
                gapComposer.updateRememberedValue(taxToolTipViewKt$$ExternalSyntheticLambda3);
                rememberedValue = taxToolTipViewKt$$ExternalSyntheticLambda3;
            }
            gapComposer.end(false);
            companion2 = ValueInsets.layout(companion, (Function3) rememberedValue);
        }
        if (companion2 != null) {
            companion = companion2;
        }
        Modifier then = modifier.then(wrapContentSize$default.then(companion));
        gapComposer.end(false);
        return then;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toTransactionViewModel(CashActivity cashActivity, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, ContinuationImpl continuationImpl) {
        TransactionViewModelMapperKt$toTransactionViewModel$1 transactionViewModelMapperKt$toTransactionViewModel$1;
        int i;
        MerchantData merchantData;
        Color color;
        boolean z;
        Boolean bool;
        Boolean bool2;
        CashActivity cashActivity2 = cashActivity;
        if (continuationImpl instanceof TransactionViewModelMapperKt$toTransactionViewModel$1) {
            transactionViewModelMapperKt$toTransactionViewModel$1 = (TransactionViewModelMapperKt$toTransactionViewModel$1) continuationImpl;
            int i2 = transactionViewModelMapperKt$toTransactionViewModel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                transactionViewModelMapperKt$toTransactionViewModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                TransactionViewModelMapperKt$toTransactionViewModel$1 transactionViewModelMapperKt$toTransactionViewModel$12 = transactionViewModelMapperKt$toTransactionViewModel$1;
                Object obj = transactionViewModelMapperKt$toTransactionViewModel$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionViewModelMapperKt$toTransactionViewModel$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = cashActivity2.payment_render_data;
                    String str2 = cashActivity2.sender_render_data;
                    String str3 = cashActivity2.recipient_render_data;
                    String str4 = cashActivity2.receipt_render_data;
                    transactionViewModelMapperKt$toTransactionViewModel$12.L$2 = cashActivity2;
                    transactionViewModelMapperKt$toTransactionViewModel$12.label = 1;
                    obj = ziplineHistoryDataJavaScripter.paymentHistoryData(str, str2, str3, str4, transactionViewModelMapperKt$toTransactionViewModel$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cashActivity2 = transactionViewModelMapperKt$toTransactionViewModel$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                PaymentHistoryData paymentHistoryData = (PaymentHistoryData) obj;
                long j = cashActivity2._id;
                String str5 = cashActivity2.token;
                String str6 = paymentHistoryData.support_short_title;
                String str7 = paymentHistoryData.support_subtitle;
                String str8 = paymentHistoryData.support_accessibility_label;
                Image image = cashActivity2.photo;
                merchantData = cashActivity2.merchant_data;
                color = cashActivity2.themed_accent_color;
                if (color != null || (r11 = ColorsKt.validate(color)) == null) {
                    Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(28, cashActivity2.threaded_customer_id, cashActivity2.their_id, null, null, null));
                }
                ColorModel.Accented accented = new ColorModel.Accented(uiColor);
                String str9 = cashActivity2.display_name;
                z = false;
                boolean booleanValue = (merchantData != null || (bool2 = merchantData.should_colorize_avatar) == null) ? false : bool2.booleanValue();
                if (merchantData != null && (bool = merchantData.should_fill_background) != null) {
                    z = bool.booleanValue();
                }
                return new TransactionViewModel(j, str5, str6, str7, str8, GrpcStatus.Companion.toStackedAvatar(new AvatarViewModel(image, accented, str9, (String) null, booleanValue, z, cashActivity2.lookup_key, cashActivity2.email, cashActivity2.sms, (AvatarBadgeViewModel) null, (String) null, false, false, 31761)));
            }
        }
        transactionViewModelMapperKt$toTransactionViewModel$1 = new TransactionViewModelMapperKt$toTransactionViewModel$1(continuationImpl);
        TransactionViewModelMapperKt$toTransactionViewModel$1 transactionViewModelMapperKt$toTransactionViewModel$122 = transactionViewModelMapperKt$toTransactionViewModel$1;
        Object obj3 = transactionViewModelMapperKt$toTransactionViewModel$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionViewModelMapperKt$toTransactionViewModel$122.label;
        if (i != 0) {
        }
        PaymentHistoryData paymentHistoryData2 = (PaymentHistoryData) obj3;
        long j2 = cashActivity2._id;
        String str52 = cashActivity2.token;
        String str62 = paymentHistoryData2.support_short_title;
        String str72 = paymentHistoryData2.support_subtitle;
        String str82 = paymentHistoryData2.support_accessibility_label;
        Image image2 = cashActivity2.photo;
        merchantData = cashActivity2.merchant_data;
        color = cashActivity2.themed_accent_color;
        if (color != null) {
        }
        Color uiColor2 = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(28, cashActivity2.threaded_customer_id, cashActivity2.their_id, null, null, null));
        ColorModel.Accented accented2 = new ColorModel.Accented(uiColor2);
        String str92 = cashActivity2.display_name;
        z = false;
        if (merchantData != null) {
        }
        if (merchantData != null) {
            z = bool.booleanValue();
        }
        return new TransactionViewModel(j2, str52, str62, str72, str82, GrpcStatus.Companion.toStackedAvatar(new AvatarViewModel(image2, accented2, str92, (String) null, booleanValue, z, cashActivity2.lookup_key, cashActivity2.email, cashActivity2.sms, (AvatarBadgeViewModel) null, (String) null, false, false, 31761)));
    }
}
