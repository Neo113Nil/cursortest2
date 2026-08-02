package com.squareup.cash.borrow.fixtures;

import com.google.mlkit.common.internal.zzd;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.arcade.Icons;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.util.cash.StringsKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class BorrowOverlaysTestDataKt {
    public static BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet createBulletinInfoSheet$default(BorrowAppletBulletinsTile.Data.Bulletin.Icon icon, Color color, int i) {
        BorrowAppletBulletinsTile.Data.Bulletin.Icon icon2 = (i & 1) != 0 ? BorrowAppletBulletinsTile.Data.Bulletin.Icon.LIMIT : icon;
        Color color2 = (i & 4) != 0 ? BorrowCommonTestDataKt.cashGreenColorProto : color;
        String str = (i & 8) != 0 ? "$200 borrow limit" : "$150 borrow limit";
        zzd zzdVar = Icons.Companion;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet[]{new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet(StringsKt.localized("Whether you pay your loan on time"), new Icon("35X0rU")), new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet(StringsKt.localized("How much money you deposit into Cash App and keep there"), new Icon("LQUx2D")), new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet(StringsKt.localized("If you direct deposit $300+ in paychecks each month"), new Icon("0IwHcW"))});
        String str2 = (i & 512) != 0 ? null : "See more details in [Profile > Documents](https://example.com) to understand why your limit decreased.";
        int i2 = i & 1024;
        String str3 = Constants.META_CLOSE;
        String str4 = i2 != 0 ? Constants.META_CLOSE : "Learn more";
        String str5 = (i & 2048) != 0 ? null : "https://example.com/learn-more";
        if ((i & 4096) != 0) {
            str3 = null;
        }
        color2.getClass();
        listOf.getClass();
        return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet(icon2, null, StringsKt.localized(str), null, StringsKt.localized("This is the total amount you can borrow. It may change based on several factors, including:"), null, listOf, null, str2 != null ? StringsKt.localized(str2) : null, StringsKt.localized(str4), str5, null, str3 != null ? StringsKt.localized(str3) : null, color2, null, ByteString.EMPTY);
    }
}
