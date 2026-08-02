package com.squareup.cash.securityhub.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardId;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardLinkViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletSummary;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowId;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class BookletViewKt {
    public static final BookletViewModel COMMON_SCAMS_PREVIEW_MODEL;
    public static final BookletViewModel PREVENT_FRAUD_PREVIEW_MODEL;
    public static final BookletViewModel PREVIEW_MODEL;
    public static final BookletViewModel SECURITY_FEATURES_PREVIEW_MODEL;
    public static final BookletViewModel SPOT_SCAMS_PREVIEW_MODEL;
    public static final List SUPPORT_ROWS;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, "I've been scammed", "Steps to stop and report", false), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, "I've been hacked", "Steps to recover and report", false), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, "Report another issue", "Chat with support 24/7", true)});
        SUPPORT_ROWS = listOf;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.ALWAYS_ON_MONITORING, "Always-on monitoring", "Our machine-learning systems analyze every interaction in real time, scan for patterns and emerging tactics, and block threats before they ever reach you.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.SECURITY_ALERTS, "Security alerts", "We send alerts when we detect something unusual like a login from an unknown device, a PIN reset, a personal info change, or a protection turned off.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.SCAM_WARNINGS, "Scam warnings", "After you hit send, we evaluate the payment for scam signals. If we detect something risky, you'll get a warning and the choice is yours: send it through, or stop.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.ACCOUNT_LOCKS, "Account locks", "If we detect unusual activity on your account, we lock it immediately to block unauthorized access. No one can move your money or change your details.", "fake:///trust-hub-placeholder.png", null)});
        BookletSummary bookletSummary = new BookletSummary(BookletId.SECURITY_FEATURES, "Security features", "Keep your account secure", "fake:///trust-hub-placeholder.png");
        BookletId bookletId = BookletId.SPOT_SCAMS;
        PREVIEW_MODEL = new BookletViewModel("Built-in protections", "We help protect what you care about", "Bad actors evolve constantly, and so do we. Our 24/7 scam and fraud protection all happens in the background so you can transact with confidence.", listOf2, "Related", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletSummary[]{bookletSummary, new BookletSummary(bookletId, "How to spot scams", "Telltale signs of a scammer", "fake:///trust-hub-placeholder.png")}), "Get support", listOf);
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.GOODS_AND_SERVICES_SCAM, "Goods & services scam", "A seller offers a product at a price that seems too good to pass up. You pay through Cash App. They stop responding and never send the item.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.CUSTOMER_SUPPORT_SCAM, "Customer support scam", "Someone pretends to be Amazon, your bank, or a utility says there's a problem and asks you to pay through Cash App. But, that's not really them. The problem doesn't exist.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.FRIEND_OR_FAMILY_IMPERSONATION, "Friend or family impersonation", "You get a Cash App request or a message from what looks like a friend or family member. They say it's an emergency and they need money right now. But it's not them.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.ROMANCE_OR_INVESTMENT_SCAM, "Romance or investment scam", "Someone you meet online builds trust over time, even years, then asks for money. They may show fake returns to keep you sending. But the emergency or opportunity isn't real.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.DEPOSIT_SCAM, "Deposit scam", "A listing for an apartment, pet, or in-demand item asks for a Cash App deposit to hold it before someone else gets it. After you pay, the seller disappears.", "fake:///trust-hub-placeholder.png", null)});
        BookletSummary bookletSummary2 = new BookletSummary(bookletId, "How to spot scams", "Telltale signs of a scammer", "fake:///trust-hub-placeholder.png");
        BookletId bookletId2 = BookletId.PREVENT_FRAUD;
        COMMON_SCAMS_PREVIEW_MODEL = new BookletViewModel("Common scams", "Recognize common scams", "The most common types of scams might appear in your feeds, arrive in your email inbox or messages, or call you on the phone.", listOf3, "Related", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletSummary[]{bookletSummary2, new BookletSummary(bookletId2, "Prevent fraud", "Protect yourself against bad actors", "fake:///trust-hub-placeholder.png")}), "Get support", listOf);
        List listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.TOO_GOOD_TO_BE_TRUE, "It's too good to be true", "Free money, gifts, or huge returns for almost nothing. If it sounds too good to be true, it likely is.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.UNKNOWN_CONTACT, "You don't know who's contacting you", "Strangers asking for info often impersonate the IRS, your bank, or a debt collector.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.UNUSUAL_PAYMENT_METHOD, "It's an unusual payment method", "Wire transfers, gift cards, or bitcoin to a stranger are very often a scam.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.URGENT, "It feels urgent", "Limited-time offers, hacked accounts, threats, family emergencies — pressure is the tell.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.PERSONAL_INFO_REQUEST, "They ask for personal info", "Passwords, PINs, SSN, security questions, card information. Real companies don't ask this out of the blue.", "fake:///trust-hub-placeholder.png", null)});
        BookletId bookletId3 = BookletId.COMMON_SCAMS;
        SPOT_SCAMS_PREVIEW_MODEL = new BookletViewModel("Spot scams", "Know the telltale signs of a scam", "Scams are getting more sophisticated. Watch for these five signs before you send money or share personal info.", listOf4, "Related", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletSummary[]{new BookletSummary(bookletId3, "Common scams", "Scams everyone should know about", "fake:///trust-hub-placeholder.png"), new BookletSummary(bookletId2, "Prevent fraud", "Protect yourself against bad actors", "fake:///trust-hub-placeholder.png")}), "Get support", listOf);
        PREVENT_FRAUD_PREVIEW_MODEL = new BookletViewModel("Prevent fraud", "Stop fraudsters before they start", "Fraudsters change their stories, but they always need the same things from you: whether it's your sign-in code, a rushed payment, or your trust. Block those and the fraud attempt fails.", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.NEVER_SHARE_LOGIN_INFO, "Never share your login info", "This includes things like your PIN or a one-time passcode. Cash App will never ask for it. Anyone who does is a bad actor.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.WATCH_ACCOUNT_ALERTS, "Watch for account alerts", "Check notifications and the activity feed for anything you don't recognize.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.VERIFY_RECIPIENT, "Verify the recipient", "Double-check the $cashtag, name, and amount before you send.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.MAKE_SURE_ITS_CASH_APP, "Make sure it's Cash App", "The real Cash App is @CashApp on social media and cash.app online. Watch for lookalikes.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.DONT_OPEN_UNKNOWN_MESSAGES, "Don't open unknown messages", "Be skeptical of unsolicited contact. Don't click links in messages from unknown senders, and always check your sources or ask a friend.", "fake:///trust-hub-placeholder.png", null), new BookletFeatureCardViewModel(BookletFeatureCardId.FOLLOW_BEST_PRACTICES, "Follow best practices", "Monitor your financial accounts and credit reports frequently. Use unique passwords and a password manager for all your services.", "fake:///trust-hub-placeholder.png", null)}), "Related", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletSummary[]{new BookletSummary(bookletId3, "Common scams", "Scams everyone should know about", "fake:///trust-hub-placeholder.png"), new BookletSummary(bookletId, "How to spot scams", "Telltale signs of a scammer", "fake:///trust-hub-placeholder.png")}), "Get support", listOf);
        SECURITY_FEATURES_PREVIEW_MODEL = new BookletViewModel("Security features", "Boost your account security", "While Cash App works in the background to keep your account safe, here's what you can do to help keep your account safe.", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.SECURITY_LOCK, "Turn on Security Lock", "Approve payments with Face ID or PIN. No one else can move your money.", "fake:///trust-hub-placeholder.png", new BookletFeatureCardLinkViewModel("Enable security lock")), new BookletFeatureCardViewModel(BookletFeatureCardId.IDENTITY_VERIFICATION, "Verify your identity", "Confirms it's really you. Help us stop someone from opening Cash App with stolen info.", "fake:///trust-hub-placeholder.png", new BookletFeatureCardLinkViewModel("Verify now")), new BookletFeatureCardViewModel(BookletFeatureCardId.CONTACT_SYNC, "Sync contacts", "Find the right person faster. Catches typos before you tap send.", "fake:///trust-hub-placeholder.png", new BookletFeatureCardLinkViewModel("Link contacts")), new BookletFeatureCardViewModel(BookletFeatureCardId.ENABLE_NOTIFICATIONS, "Enable notifications", "Stay on top of all your payment, sign-in, and security alerts. Pick push, email, or text.", "fake:///trust-hub-placeholder.png", new BookletFeatureCardLinkViewModel("Turn on notifications")), new BookletFeatureCardViewModel(BookletFeatureCardId.SECURE_PIN, "Use a secure PIN", "Pick a random PIN, not a pattern. Skip 1234, your birthday, or repeating digits.", "fake:///trust-hub-placeholder.png", new BookletFeatureCardLinkViewModel("Update PIN"))}), "Related", CollectionsKt__CollectionsKt.listOf((Object[]) new BookletSummary[]{new BookletSummary(BookletId.BUILT_IN_PROTECTIONS, "Built-in protections", "How Cash App protects you", "fake:///trust-hub-placeholder.png"), new BookletSummary(bookletId3, "Common scams", "Scams everyone should know about", "fake:///trust-hub-placeholder.png")}), "Get support", listOf);
    }

    public static final void BookletView(BookletViewModel bookletViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        bookletViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(211990397);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(bookletViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(4, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = bookletViewModel.navigationTitle;
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(5, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            boolean changedInstance = gapComposer2.changedInstance(bookletViewModel) | (i4 == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda3(2, bookletViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyColumn(navigationBarsPadding, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 510);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(bookletViewModel, function1, modifier2, i, 25);
        }
    }
}
