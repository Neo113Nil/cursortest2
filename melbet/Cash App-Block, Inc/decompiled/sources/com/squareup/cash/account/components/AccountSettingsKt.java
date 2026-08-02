package com.squareup.cash.account.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsViewModel;
import com.squareup.cash.account.settings.viewmodels.GlobalSettings;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AccountSettingsKt {
    public static final void AccountSectionRow(AccountSettingsRow accountSettingsRow, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1220177219);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(accountSettingsRow) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean areEqual = Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.BusinessInfo.INSTANCE);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (areEqual) {
                gapComposer.startReplaceGroup(-1991096611);
                String stringResource = Room.stringResource(gapComposer, R.string.business_info_title);
                Icons icons = Icons.Business24;
                z = (i3 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda6(28, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AccountToDoKt.AccountSectionRow(companion, icons, stringResource, null, false, (Function0) rememberedValue, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.Documents.INSTANCE)) {
                gapComposer.startReplaceGroup(-1990842349);
                String stringResource2 = Room.stringResource(gapComposer, R.string.account_settings_documents_title);
                Icons icons2 = Icons.Document24;
                z = (i3 & 896) == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda6(19, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AccountToDoKt.AccountSectionRow(companion, icons2, stringResource2, null, false, (Function0) rememberedValue2, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                gapComposer.end(false);
            } else if (accountSettingsRow instanceof AccountSettingsRow.Family) {
                gapComposer.startReplaceGroup(-1990577454);
                String stringResource3 = Room.stringResource(gapComposer, R.string.account_settings_family);
                Icons icons3 = Icons.Family24;
                boolean z2 = ((AccountSettingsRow.Family) accountSettingsRow).shouldBadge;
                z = (i3 & 896) == 256;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new TabContentViewKt$$ExternalSyntheticLambda6(20, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AccountToDoKt.AccountSectionRow(companion, icons3, stringResource3, null, z2, (Function0) rememberedValue3, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 24);
                gapComposer.end(false);
            } else {
                Modifier.Companion companion2 = companion;
                if (accountSettingsRow instanceof AccountSettingsRow.Favorites) {
                    gapComposer.startReplaceGroup(-1990277932);
                    Modifier testTag = TestTagKt.testTag(companion2, "FavoritesButton");
                    String stringResource4 = Room.stringResource(gapComposer, R.string.favorites);
                    Icons icons4 = Icons.Favorite24;
                    z = (i3 & 896) == 256;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (z || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda6(21, function1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    AccountToDoKt.AccountSectionRow(testTag, icons4, stringResource4, null, false, (Function0) rememberedValue4, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes, 56);
                    gapComposer.end(false);
                } else if (accountSettingsRow instanceof AccountSettingsRow.Limits) {
                    gapComposer.startReplaceGroup(-1989983494);
                    String stringResource5 = Room.stringResource(gapComposer, R.string.account_settings_limits);
                    Icons icons5 = Icons.Limits24;
                    boolean z3 = ((AccountSettingsRow.Limits) accountSettingsRow).shouldBadge;
                    z = (i3 & 896) == 256;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (z || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TabContentViewKt$$ExternalSyntheticLambda6(22, function1);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    companion = companion2;
                    AccountToDoKt.AccountSectionRow(companion, icons5, stringResource5, null, z3, (Function0) rememberedValue5, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 24);
                    gapComposer.end(false);
                } else {
                    companion = companion2;
                    if (accountSettingsRow instanceof AccountSettingsRow.LinkedBanks) {
                        gapComposer.startReplaceGroup(-1989689366);
                        String stringResource6 = Room.stringResource(gapComposer, R.string.account_settings_linked_banks);
                        Icons icons6 = Icons.BankAccount24;
                        boolean z4 = ((AccountSettingsRow.LinkedBanks) accountSettingsRow).shouldBadge;
                        z = (i3 & 896) == 256;
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (z || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new TabContentViewKt$$ExternalSyntheticLambda6(23, function1);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        AccountToDoKt.AccountSectionRow(companion, icons6, stringResource6, null, z4, (Function0) rememberedValue6, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 24);
                        gapComposer.end(false);
                    } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.LinkedBusinesses.INSTANCE)) {
                        gapComposer.startReplaceGroup(-1989379211);
                        String stringResource7 = Room.stringResource(gapComposer, R.string.account_settings_businesses);
                        Icons icons7 = Icons.BankLinked24;
                        z = (i3 & 896) == 256;
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        if (z || rememberedValue7 == neverEqualPolicy) {
                            rememberedValue7 = new TabContentViewKt$$ExternalSyntheticLambda6(24, function1);
                            gapComposer.updateRememberedValue(rememberedValue7);
                        }
                        AccountToDoKt.AccountSectionRow(companion, icons7, stringResource7, null, false, (Function0) rememberedValue7, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                        gapComposer.end(false);
                    } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.Notifications.INSTANCE)) {
                        gapComposer.startReplaceGroup(-1989113076);
                        String stringResource8 = Room.stringResource(gapComposer, R.string.account_settings_notifications);
                        Icons icons8 = Icons.Notifications24;
                        z = (i3 & 896) == 256;
                        Object rememberedValue8 = gapComposer.rememberedValue();
                        if (z || rememberedValue8 == neverEqualPolicy) {
                            rememberedValue8 = new TabContentViewKt$$ExternalSyntheticLambda6(25, function1);
                            gapComposer.updateRememberedValue(rememberedValue8);
                        }
                        AccountToDoKt.AccountSectionRow(companion, icons8, stringResource8, null, false, (Function0) rememberedValue8, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                        gapComposer.end(false);
                    } else if (accountSettingsRow instanceof AccountSettingsRow.Personal) {
                        gapComposer.startReplaceGroup(-1988840865);
                        AccountSettingsRow.Personal personal = (AccountSettingsRow.Personal) accountSettingsRow;
                        String str = personal.title;
                        Icons icons9 = Icons.Avatar24;
                        boolean z5 = personal.shouldBadge;
                        z = (i3 & 896) == 256;
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        if (z || rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new TabContentViewKt$$ExternalSyntheticLambda6(26, function1);
                            gapComposer.updateRememberedValue(rememberedValue9);
                        }
                        AccountToDoKt.AccountSectionRow(companion, icons9, str, null, z5, (Function0) rememberedValue9, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 24);
                        gapComposer.end(false);
                    } else if (accountSettingsRow instanceof AccountSettingsRow.Support) {
                        gapComposer.startReplaceGroup(-1988586634);
                        String stringResource9 = Room.stringResource(gapComposer, R.string.account_settings_help_tab_title);
                        Icons icons10 = Icons.Help24;
                        boolean z6 = ((AccountSettingsRow.Support) accountSettingsRow).shouldBadge;
                        z = (i3 & 896) == 256;
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (z || rememberedValue10 == neverEqualPolicy) {
                            rememberedValue10 = new TabContentViewKt$$ExternalSyntheticLambda6(27, function1);
                            gapComposer.updateRememberedValue(rememberedValue10);
                        }
                        AccountToDoKt.AccountSectionRow(companion, icons10, stringResource9, null, z6, (Function0) rememberedValue10, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 24);
                        gapComposer.end(false);
                    } else {
                        companion2 = companion;
                        if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.ThemeSwitcher.INSTANCE)) {
                            gapComposer.startReplaceGroup(-1988271705);
                            Modifier testTag2 = TestTagKt.testTag(companion2, "Theme_Switcher");
                            String stringResource10 = Room.stringResource(gapComposer, R.string.account_settings_themes);
                            Icons icons11 = Icons.Themes24;
                            z = (i3 & 896) == 256;
                            Object rememberedValue11 = gapComposer.rememberedValue();
                            if (z || rememberedValue11 == neverEqualPolicy) {
                                rememberedValue11 = new TabContentViewKt$$ExternalSyntheticLambda6(29, function1);
                                gapComposer.updateRememberedValue(rememberedValue11);
                            }
                            AccountToDoKt.AccountSectionRow(testTag2, icons11, stringResource10, null, false, (Function0) rememberedValue11, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes, 56);
                            gapComposer.end(false);
                        } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.TrustedDevices.INSTANCE)) {
                            gapComposer.startReplaceGroup(-1987972431);
                            String stringResource11 = Room.stringResource(gapComposer, R.string.account_settings_devices);
                            Icons icons12 = Icons.DeviceDesktop24;
                            boolean z7 = (i3 & 896) == 256;
                            Object rememberedValue12 = gapComposer.rememberedValue();
                            if (z7 || rememberedValue12 == neverEqualPolicy) {
                                rememberedValue12 = new AccountToDoKt$$ExternalSyntheticLambda0(1, function1);
                                gapComposer.updateRememberedValue(rememberedValue12);
                            }
                            companion = companion2;
                            AccountToDoKt.AccountSectionRow(companion, icons12, stringResource11, null, false, (Function0) rememberedValue12, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                            gapComposer.end(false);
                        } else {
                            companion = companion2;
                            if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.Passkeys.INSTANCE)) {
                                gapComposer.startReplaceGroup(-1987689060);
                                String stringResource12 = Room.stringResource(gapComposer, R.string.account_settings_passkeys);
                                Icons icons13 = Icons.Passkey24;
                                z = (i3 & 896) == 256;
                                Object rememberedValue13 = gapComposer.rememberedValue();
                                if (z || rememberedValue13 == neverEqualPolicy) {
                                    rememberedValue13 = new AccountToDoKt$$ExternalSyntheticLambda0(2, function1);
                                    gapComposer.updateRememberedValue(rememberedValue13);
                                }
                                AccountToDoKt.AccountSectionRow(companion, icons13, stringResource12, null, false, (Function0) rememberedValue13, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                                gapComposer.end(false);
                            } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.Privacy.INSTANCE)) {
                                gapComposer.startReplaceGroup(-1987417066);
                                String stringResource13 = Room.stringResource(gapComposer, R.string.account_settings_privacy);
                                Icons icons14 = Icons.SensitiveHidden24;
                                z = (i3 & 896) == 256;
                                Object rememberedValue14 = gapComposer.rememberedValue();
                                if (z || rememberedValue14 == neverEqualPolicy) {
                                    rememberedValue14 = new TabContentViewKt$$ExternalSyntheticLambda6(15, function1);
                                    gapComposer.updateRememberedValue(rememberedValue14);
                                }
                                AccountToDoKt.AccountSectionRow(companion, icons14, stringResource13, null, false, (Function0) rememberedValue14, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                                gapComposer.end(false);
                            } else if (accountSettingsRow instanceof AccountSettingsRow.Security) {
                                gapComposer.startReplaceGroup(-1987135152);
                                String stringResource14 = Room.stringResource(gapComposer, R.string.account_settings_security);
                                Icons icons15 = Icons.SecurityLockOutline24;
                                z = (i3 & 896) == 256;
                                Object rememberedValue15 = gapComposer.rememberedValue();
                                if (z || rememberedValue15 == neverEqualPolicy) {
                                    rememberedValue15 = new TabContentViewKt$$ExternalSyntheticLambda6(16, function1);
                                    gapComposer.updateRememberedValue(rememberedValue15);
                                }
                                AccountToDoKt.AccountSectionRow(companion, icons15, stringResource14, null, false, (Function0) rememberedValue15, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                                gapComposer.end(false);
                            } else if (Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.Shopping.INSTANCE)) {
                                gapComposer.startReplaceGroup(-1986871156);
                                String stringResource15 = Room.stringResource(gapComposer, R.string.account_settings_shopping);
                                Icons icons16 = Icons.CategoryShopping24;
                                z = (i3 & 896) == 256;
                                Object rememberedValue16 = gapComposer.rememberedValue();
                                if (z || rememberedValue16 == neverEqualPolicy) {
                                    rememberedValue16 = new TabContentViewKt$$ExternalSyntheticLambda6(17, function1);
                                    gapComposer.updateRememberedValue(rememberedValue16);
                                }
                                AccountToDoKt.AccountSectionRow(companion, icons16, stringResource15, null, false, (Function0) rememberedValue16, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                                gapComposer.end(false);
                            } else {
                                if (!Intrinsics.areEqual(accountSettingsRow, AccountSettingsRow.PromotionsReferrals.INSTANCE)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -64226330, false);
                                }
                                gapComposer.startReplaceGroup(-1986595938);
                                String stringResource16 = Room.stringResource(gapComposer, R.string.account_settings_promotions_invites);
                                Icons icons17 = Icons.CategoryDesigner24;
                                z = (i3 & 896) == 256;
                                Object rememberedValue17 = gapComposer.rememberedValue();
                                if (z || rememberedValue17 == neverEqualPolicy) {
                                    rememberedValue17 = new TabContentViewKt$$ExternalSyntheticLambda6(18, function1);
                                    gapComposer.updateRememberedValue(rememberedValue17);
                                }
                                AccountToDoKt.AccountSectionRow(companion, icons17, stringResource16, null, false, (Function0) rememberedValue17, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | ((i3 >> 6) & 112), 56);
                                gapComposer.end(false);
                            }
                        }
                    }
                }
                companion = companion2;
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(accountSettingsRow, function1, modifier2, i, 21);
        }
    }

    public static final void AccountSettings(Modifier modifier, AccountSettingsViewModel accountSettingsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-750501419);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(accountSettingsViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            if (accountSettingsViewModel.equals(AccountSettingsViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(322647974);
                SettingsLoading(gapComposer, i3 & 14);
                gapComposer.end(false);
            } else {
                if (!(accountSettingsViewModel instanceof AccountSettingsViewModel.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 322646988, false);
                }
                gapComposer.startReplaceGroup(322649154);
                SettingsContent((AccountSettingsViewModel.Content) accountSettingsViewModel, function1, gapComposer, i3 & 8190);
                gapComposer.end(false);
            }
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 20, modifier2, accountSettingsViewModel, function1);
        }
    }

    public static final void SettingsContent(AccountSettingsViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(789233046);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(content) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1155) != 1154)) {
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(1111929551, new CartBannerViewKt$$ExternalSyntheticLambda2(content, 19), gapComposer), (Modifier) null, (Function2) null, (Function0) null, (Function2) null, gapComposer, 6, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-1756246824);
            Iterator it = content.rows.iterator();
            while (it.hasNext()) {
                AccountSectionRow((AccountSettingsRow) it.next(), function1, null, gapComposer, (i2 & 14) | ((i2 >> 3) & 896));
            }
            gapComposer.end(false);
            final GlobalSettings globalSettings = content.globalSettings;
            if (globalSettings == null) {
                gapComposer.startReplaceGroup(1391048793);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1391048794);
                ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m301paddingqDBjuR0(Modifier.Companion.$$INSTANCE, 16.0f, 16.0f, 16.0f, 44.0f));
                ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(131609926, new Function2() { // from class: com.squareup.cash.account.components.AccountSettingsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        GlobalSettings globalSettings2 = globalSettings;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, globalSettings2.header, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                    String str = globalSettings2.subtitle;
                                    int lastIndexOf$default = StringsKt.lastIndexOf$default(str, ": ", 0, 6);
                                    if (lastIndexOf$default > 0) {
                                        int i6 = lastIndexOf$default + 2;
                                        builder.append(str.substring(0, i6));
                                        int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.W500, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                                        try {
                                            builder.append(str.substring(i6));
                                        } finally {
                                            builder.pop(pushStyle);
                                        }
                                    } else {
                                        builder.append(str);
                                    }
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(278535618, new Function2() { // from class: com.squareup.cash.account.components.AccountSettingsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i3;
                        GlobalSettings globalSettings2 = globalSettings;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, globalSettings2.header, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                    String str = globalSettings2.subtitle;
                                    int lastIndexOf$default = StringsKt.lastIndexOf$default(str, ": ", 0, 6);
                                    if (lastIndexOf$default > 0) {
                                        int i6 = lastIndexOf$default + 2;
                                        builder.append(str.substring(0, i6));
                                        int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.W500, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                                        try {
                                            builder.append(str.substring(i6));
                                        } finally {
                                            builder.pop(pushStyle);
                                        }
                                    } else {
                                        builder.append(str);
                                    }
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), gapComposer, 24582, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.startReplaceGroup(-1756212648);
                Iterator it2 = globalSettings.rows.iterator();
                while (it2.hasNext()) {
                    AccountSectionRow((AccountSettingsRow) it2.next(), function1, null, gapComposer, (i2 & 14) | ((i2 >> 3) & 896));
                }
                gapComposer.end(false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(content, function1, i);
        }
    }

    public static final void SettingsLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-167180798);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            ComposeMooncakeThemeKt.MooncakeTheme(AccountToDoKt.lambda$1449070589, gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 2);
        }
    }
}
