package com.squareup.cash.borrow.fixtures;

import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.plaid.internal.EnumC0170g;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.pseudolocalization.MaybePseudoLocalizeKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class BorrowHomeTestDataKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BorrowAppletBulletinsTile.Data.Bulletin createBulletin$default(BorrowAppletBulletinsTile.Data.Bulletin.Icon icon, String str, String str2, BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet, String str3, Color color, SegmentedCircle segmentedCircle, int i) {
        zzjg zzjgVar;
        zzjg borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl;
        Boolean bool = Boolean.TRUE;
        BorrowAppletBulletinsTile.Data.Bulletin.IconShape iconShape = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.CIRCLE;
        Float valueOf = Float.valueOf(0.5f);
        BorrowAppletBulletinsTile.Data.Bulletin.Icon icon2 = (i & 1) != 0 ? BorrowAppletBulletinsTile.Data.Bulletin.Icon.LIMIT : icon;
        String str4 = (i & 2) != 0 ? "Limit" : str;
        String str5 = (i & 4) != 0 ? "$200 borrow limit" : str2;
        BorrowAppletBulletinsTile.Data.Bulletin.Accessory accessory = BorrowAppletBulletinsTile.Data.Bulletin.Accessory.INFO;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet2 = (i & 16) != 0 ? null : infoSheet;
        String str6 = (i & 32) != 0 ? null : "https://example.com";
        Boolean bool2 = (i & 128) != 0 ? null : bool;
        Color color2 = (i & 256) != 0 ? null : color;
        if ((i & 512) != 0) {
            iconShape = null;
        }
        SegmentedCircle segmentedCircle2 = (i & 1024) != 0 ? null : segmentedCircle;
        Float f = (i & 2048) != 0 ? null : valueOf;
        String str7 = (i & 4096) != 0 ? null : "50% remaining";
        LocalizedString localized = StringsKt.localized(str4);
        LocalizedString localized2 = StringsKt.localized(str5);
        if (infoSheet2 != null) {
            borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl = new BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet(infoSheet2);
        } else {
            if (str6 == null) {
                zzjgVar = null;
                return new BorrowAppletBulletinsTile.Data.Bulletin(icon2, iconShape, segmentedCircle2, localized, localized2, accessory, zzjgVar, bool2, str3, color2, f, str7 != null ? StringsKt.localized(str7) : null, ByteString.EMPTY);
            }
            borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl = new BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl(str6);
        }
        zzjgVar = borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl;
        return new BorrowAppletBulletinsTile.Data.Bulletin(icon2, iconShape, segmentedCircle2, localized, localized2, accessory, zzjgVar, bool2, str3, color2, f, str7 != null ? StringsKt.localized(str7) : null, ByteString.EMPTY);
    }

    public static final BorrowAppletLoanHistoryTile.Data.Loan.Details createHistoryTileLoanDetails(boolean z) {
        LocalizedString localized = StringsKt.localized("$50 on Jan 29");
        LocalizedString localized2 = StringsKt.localized("$52.50 left to repay");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row[]{new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Amount borrowed"), StringsKt.localized("$50"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("5% flat fee"), StringsKt.localized("$2.50"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Overdue interest"), StringsKt.localized("1.25%"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Balance due"), StringsKt.localized("Fri, Feb 28"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Autopay 1"), StringsKt.localized("On"), null, 120), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Repayment"), StringsKt.localized("As you get cash"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Autopay 2"), StringsKt.localized("Off"), new Color(new Color.ModeVariant("#FF4A4A", null, null, null, null, 30, null), (Color.ModeVariant) null, 6), 104), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Loan ID"), StringsKt.localized("JH78FM9SD"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)});
        Timeline timeline = BorrowCommonTestDataKt.threeWeekTimeline;
        Object details = new BorrowAppletLoanHistoryTile.Data.Loan.Details(localized, localized2, listOf, Timeline.copy$default(timeline, CollectionsKt.plus((Iterable) timeline.events, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new Timeline.Event(Timeline.Event.Icon.HIGHLIGHT_COMPLETED, "Fri, Jan 31", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null))), null, 14), StringsKt.localized("Timeline"), StringsKt.localized("Details"), new BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData(StringsKt.localized("Repay Early"), new BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action("https://example.com/repay"), ByteString.EMPTY), 640);
        if (z) {
            details = MaybePseudoLocalizeKt.maybePseudoLocalize$default(details);
        }
        return (BorrowAppletLoanHistoryTile.Data.Loan.Details) details;
    }
}
