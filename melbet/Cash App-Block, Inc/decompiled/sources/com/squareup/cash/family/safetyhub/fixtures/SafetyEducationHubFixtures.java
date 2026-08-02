package com.squareup.cash.family.safetyhub.fixtures;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.protos.cash.aegis.core.ColoredString;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.protos.cash.aegis.core.SafetyEducationHubTile;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.StringsKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes7.dex */
public abstract class SafetyEducationHubFixtures {
    public static final SafetyEducationHub SAFETY_EDUCATION_HUB;

    static {
        BookletTile.ContentType contentType = BookletTile.ContentType.CONTENT_TYPE_STATIC_CONTENT;
        BookletTile.GridContent gridContent = null;
        int i = 25;
        SafetyEducationHubTile safetyEducationHubTile = new SafetyEducationHubTile("approved_contacts", new BookletTile(new BookletTile.StaticContent(StringsKt.localized("Approved contacts"), StringsKt.localized("You make the final call about who your kids can interact with."), new Image("fake:///bufo-art.png", "fake:///bufo-art.png", 4), null, 8, null), contentType, gridContent, i));
        int i2 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ByteString byteString = null;
        SafetyEducationHubTile safetyEducationHubTile2 = new SafetyEducationHubTile("blocked_experiences", new BookletTile(new BookletTile.StaticContent(StringsKt.localized("Blocked experiences"), StringsKt.localized("We block age-inappropriate businesses by default, but you can block more."), new Image("fake:///shrek.png", "fake:///shrek.png", 4), byteString, i2, defaultConstructorMarker), contentType, gridContent, i));
        SafetyEducationHubTile safetyEducationHubTile3 = new SafetyEducationHubTile("parental_controls", new BookletTile(new BookletTile.StaticContent(StringsKt.localized("Parental Controls"), StringsKt.localized("You can start your kids off slowly and give them room to grow as they become teens."), new Image("fake:///bufo.png", "fake:///bufo.png", 4), byteString, i2, defaultConstructorMarker), contentType, gridContent, i));
        SafetyEducationHubTile safetyEducationHubTile4 = new SafetyEducationHubTile("fraud_protection", new BookletTile(new BookletTile.StaticContent(StringsKt.localized("Fraud Protection"), StringsKt.localized("You and your kids are protected from unauthorized Cash App Card charges."), new Image("fake:///cash.png", "fake:///cash.png", 4), byteString, i2, defaultConstructorMarker), contentType, gridContent, i));
        BookletTile.ContentType contentType2 = BookletTile.ContentType.CONTENT_TYPE_GRID;
        LocalizedString localized = StringsKt.localized("We built in the protections kids need—you lead their way");
        zzd zzdVar = Icons.Companion;
        int i3 = 8;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        ByteString byteString2 = null;
        BookletTile.StaticContent staticContent = null;
        SAFETY_EDUCATION_HUB = new SafetyEducationHub(StringsKt.localized("How we keep kids safe"), CollectionsKt__CollectionsKt.listOf((Object[]) new ColoredString[]{new ColoredString(StringsKt.localized("We believe kids deserve a better start with money. That's why we designed accounts that grow with them, and "), ColorsKt.toColor(new Pair("#000000", "#FFFFFF"))), new ColoredString(StringsKt.localized("protect them every step of the way."), ColorsKt.toColor("#00D64F"))}), CollectionsKt__CollectionsKt.listOf((Object[]) new SafetyEducationHubTile[]{safetyEducationHubTile, safetyEducationHubTile2, safetyEducationHubTile3, safetyEducationHubTile4, new SafetyEducationHubTile("protections_grid", new BookletTile(staticContent, contentType2, new BookletTile.GridContent(localized, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletTile.GridContent.GridItem[]{new BookletTile.GridContent.GridItem(StringsKt.localized("24/7 monitoring"), StringsKt.localized("We stop anything unusual."), new Icon("hLUDah"), byteString, i2, defaultConstructorMarker), new BookletTile.GridContent.GridItem(StringsKt.localized("Card control"), StringsKt.localized("Lock or unlock their card with a tap."), new Icon("JBpEJg"), null, 8, null), new BookletTile.GridContent.GridItem(StringsKt.localized("Activity alerts"), StringsKt.localized("If something seems off, we let you know."), new Icon("jdlgXl"), null, 8, null), new BookletTile.GridContent.GridItem(StringsKt.localized("Merchant blocking"), StringsKt.localized("You say who they can do business with."), new Icon("yO80IX"), null, 8, null), new BookletTile.GridContent.GridItem(StringsKt.localized("Parental oversight"), StringsKt.localized("Review their activity whenever you need to."), new Icon("byOo1O"), null, 8, null), new BookletTile.GridContent.GridItem(StringsKt.localized("Limited networks"), StringsKt.localized("Teens can only be paid by people they know."), new Icon("KfLRUr"), null, 8, null), new BookletTile.GridContent.GridItem(StringsKt.localized("Zero fraud liability"), StringsKt.localized("All card purchases have zero fraud liability."), new Icon("2QZJ1D"), byteString2, i3, defaultConstructorMarker2), new BookletTile.GridContent.GridItem(StringsKt.localized("Limited interactions"), StringsKt.localized("Only pre-approved contacts can pay kids."), new Icon("rXAeTa"), byteString2, i3, defaultConstructorMarker2)}), null, 4, null), 19))}), CollectionsKt__CollectionsJVMKt.listOf(SafetyEducationPageFixtures.PARENTAL_CONTROLS_PAGE), ByteString.EMPTY);
    }
}
