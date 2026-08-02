package com.squareup.cash.family.safetyhub.fixtures;

import com.squareup.protos.cash.aegis.core.BulletPoints;
import com.squareup.protos.cash.aegis.core.ColoredString;
import com.squareup.protos.cash.aegis.core.ContentSection;
import com.squareup.protos.cash.aegis.core.DropDownElement;
import com.squareup.protos.cash.aegis.core.DropDownSection;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import com.squareup.protos.cash.aegis.core.Subsection;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.aegis.core.SubsectionBlock$Type$BulletPoints;
import com.squareup.protos.cash.aegis.core.SubsectionBlock$Type$Paragraph;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.StringsKt;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okio.ByteString;

/* loaded from: classes7.dex */
public abstract class SafetyEducationPageFixtures {
    public static final SafetyEducationPage PARENTAL_CONTROLS_PAGE;

    static {
        Subsection subsection = new Subsection(StringsKt.localized("FOR KIDS"), CollectionsKt__CollectionsKt.listOf((Object[]) new SubsectionBlock[]{new SubsectionBlock(new SubsectionBlock$Type$Paragraph(StringsKt.localized("Until they're 13, your kid's account is 100% managed by you. As their money manager, you can choose what's best for them like:"))), new SubsectionBlock(new SubsectionBlock$Type$BulletPoints(new BulletPoints(CollectionsKt__CollectionsKt.listOf((Object[]) new LocalizedString[]{StringsKt.localized("Setting up with a savings account"), StringsKt.localized("Ordering them a Cash App Card"), StringsKt.localized("Setting a monthly card spending limit"), StringsKt.localized("Approving up to 5 contacts who can send them money (like grandparents for their birthday)")}))))}));
        Subsection subsection2 = new Subsection(StringsKt.localized("FOR TEENS"), CollectionsKt__CollectionsKt.listOf((Object[]) new SubsectionBlock[]{new SubsectionBlock(new SubsectionBlock$Type$Paragraph(StringsKt.localized("As your teen's sponsor, you can guide them from a distance. You decide:"))), new SubsectionBlock(new SubsectionBlock$Type$BulletPoints(new BulletPoints(CollectionsKt__CollectionsKt.listOf((Object[]) new LocalizedString[]{StringsKt.localized("When they can have their own login"), StringsKt.localized("Who they can exchange money with"), StringsKt.localized("Their monthly card spending limit"), StringsKt.localized("Where they can spend money"), StringsKt.localized("If they can invest in stocks & ETFs"), StringsKt.localized("If they can buy Bitcoin")})))), new SubsectionBlock(new SubsectionBlock$Type$Paragraph(StringsKt.localized("You can also review their activity and see their monthly statements.")))}));
        LocalizedString localized = StringsKt.localized("Parental Controls");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ColoredString[]{new ColoredString(StringsKt.localized("We build in safeguards.\n"), ColorsKt.toColor(new Pair("#000000", "#FFFFFF"))), new ColoredString(StringsKt.localized("You shape the rest"), ColorsKt.toColor("#666666"))});
        LocalizedString localized2 = StringsKt.localized("What we do");
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new LocalizedString[]{StringsKt.localized("We built in protections for everyone under 18, and designed controls so you can tailor your kid's or teen's experience."), StringsKt.localized("You can gradually offer more independence when you think the time is right—and pull things back if you need to.")});
        Image image = new Image("fake:///bufo-art.png", "fake:///bufo-art.png", 4);
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Subsection[]{subsection, subsection2});
        ByteString byteString = ByteString.EMPTY;
        PARENTAL_CONTROLS_PAGE = new SafetyEducationPage("parental_controls", localized, listOf, new ContentSection(localized2, listOf2, image, listOf3, byteString), new DropDownSection(StringsKt.localized("What you can do"), CollectionsKt__CollectionsKt.listOf((Object[]) new DropDownElement[]{new DropDownElement(StringsKt.localized("Give your teen their own login"), CollectionsKt__CollectionsJVMKt.listOf(StringsKt.localized("Only approved contacts can pay your child, and teens' networks are limited to people they know."))), new DropDownElement(StringsKt.localized("Order a Cash App Card"), CollectionsKt__CollectionsJVMKt.listOf(StringsKt.localized("Only approved contacts can pay your child, and teens' networks are limited to people they know."))), new DropDownElement(StringsKt.localized("Allow investing"), CollectionsKt__CollectionsJVMKt.listOf(StringsKt.localized("Only approved contacts can pay your child, and teens' networks are limited to people they know."))), new DropDownElement(StringsKt.localized("Allow bitcoin"), CollectionsKt__CollectionsJVMKt.listOf(StringsKt.localized("Only approved contacts can pay your child, and teens' networks are limited to people they know.")))}), byteString), null, byteString);
    }
}
