package com.squareup.cash.invitations;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import app.cash.local.views.internal.menus.LocalMenuCardKt$$ExternalSyntheticLambda0;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.collections.immutable.ImmutableList;
import org.intellij.markdown.ast.ASTUtilKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteContactsBodyKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId = 3;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda8(RecurringPreferenceQueries recurringPreferenceQueries, String str, boolean z, Money money, RecurringSchedule recurringSchedule, Long l, ScheduledTransactionPreference.Type type2, String str2) {
        this.f$1 = recurringPreferenceQueries;
        this.f$7 = str;
        this.f$0 = z;
        this.f$2 = money;
        this.f$4 = recurringSchedule;
        this.f$3 = l;
        this.f$5 = type2;
        this.f$6 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 4;
        final int i3 = 0;
        boolean z = this.f$0;
        int i4 = 3;
        Object obj2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$7;
        Object obj8 = this.f$1;
        final int i5 = 1;
        switch (i) {
            case 0:
                InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel = (InviteContactsViewModel.PromotionUpsellViewModel) obj8;
                ImmutableList immutableList = (ImmutableList) obj6;
                final List list = (List) obj4;
                final ImmutableList immutableList2 = (ImmutableList) obj5;
                Function1 function1 = (Function1) obj3;
                final Function1 function12 = (Function1) obj2;
                final String str = (String) obj7;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, Spacer.f1511type, InviteErrorDialogKt.lambda$865192275, 1);
                if (!z && promotionUpsellViewModel != null) {
                    LazyListScope.item$default(lazyListScope, null, "promotion", new ComposableLambdaImpl(new InviteContactsBodyKt$$ExternalSyntheticLambda9(promotionUpsellViewModel, function1, 1), true, 1464297585), 1);
                }
                if (!immutableList.isEmpty()) {
                    LazyListScope.item$default(lazyListScope, null, "section_header", InviteErrorDialogKt.lambda$407103781, 1);
                    lazyListScope.items(list.size(), new VerifyCheckDepositPresenter$models$3$2(12, new CashMapViewKt$$ExternalSyntheticLambda1(24), list), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 27), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$InviteContactsBody$lambda$10$1$0$4$0$$inlined$itemsIndexed$3
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i6;
                            int i7;
                            int i8 = i3;
                            List list2 = list;
                            switch (i8) {
                                case 0:
                                    LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj9;
                                    int intValue = ((Number) obj10).intValue();
                                    Composer composer = (Composer) obj11;
                                    int intValue2 = ((Number) obj12).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        i6 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                    } else {
                                        i6 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i6 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                                        InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) list2.get(intValue);
                                        gapComposer.startReplaceGroup(535412800);
                                        ASTUtilKt.InviteContactItem(null, function12, str, contact, gapComposer, 48);
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj9;
                                    int intValue3 = ((Number) obj10).intValue();
                                    Composer composer2 = (Composer) obj11;
                                    int intValue4 = ((Number) obj12).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        i7 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                    } else {
                                        i7 = intValue4;
                                    }
                                    if ((intValue4 & 48) == 0) {
                                        i7 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                                        InviteContactsViewModel.Contact contact2 = (InviteContactsViewModel.Contact) list2.get(intValue3);
                                        gapComposer2.startReplaceGroup(-608546150);
                                        ASTUtilKt.InviteContactItem(null, function12, str, contact2, gapComposer2, 48);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2039820996));
                    LazyListScope.item$default(lazyListScope, null, "divider", InviteErrorDialogKt.f459lambda$1942506276, 1);
                }
                if (!immutableList2.isEmpty()) {
                    LazyListScope.item$default(lazyListScope, null, "section_header", InviteErrorDialogKt.f457lambda$1439697370, 1);
                }
                lazyListScope.items(immutableList2.size(), new VerifyCheckDepositPresenter$models$3$2(13, new CashMapViewKt$$ExternalSyntheticLambda1(25), immutableList2), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(immutableList2, 28), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.invitations.InviteContactsBodyKt$InviteContactsBody$lambda$10$1$0$4$0$$inlined$itemsIndexed$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                        int i6;
                        int i7;
                        int i8 = i5;
                        List list2 = immutableList2;
                        switch (i8) {
                            case 0:
                                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj9;
                                int intValue = ((Number) obj10).intValue();
                                Composer composer = (Composer) obj11;
                                int intValue2 = ((Number) obj12).intValue();
                                if ((intValue2 & 6) == 0) {
                                    i6 = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                                } else {
                                    i6 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i6 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                }
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                                    InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) list2.get(intValue);
                                    gapComposer.startReplaceGroup(535412800);
                                    ASTUtilKt.InviteContactItem(null, function12, str, contact, gapComposer, 48);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj9;
                                int intValue3 = ((Number) obj10).intValue();
                                Composer composer2 = (Composer) obj11;
                                int intValue4 = ((Number) obj12).intValue();
                                if ((intValue4 & 6) == 0) {
                                    i7 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                                } else {
                                    i7 = intValue4;
                                }
                                if ((intValue4 & 48) == 0) {
                                    i7 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                                    InviteContactsViewModel.Contact contact2 = (InviteContactsViewModel.Contact) list2.get(intValue3);
                                    gapComposer2.startReplaceGroup(-608546150);
                                    ASTUtilKt.InviteContactItem(null, function12, str, contact2, gapComposer2, 48);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 2039820996));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj7;
                String str3 = (String) obj8;
                MutableState mutableState = (MutableState) obj6;
                TextLinkStyles textLinkStyles = (TextLinkStyles) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    if (textLayoutResult.getHasVisualOverflow()) {
                        int lineEnd = (textLayoutResult.multiParagraph.getLineEnd(1, true) - (str2.length() + 2)) - 3;
                        if (lineEnd < 0) {
                            lineEnd = 0;
                        }
                        String substring = str3.substring(0, lineEnd);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.append(substring.concat("… "));
                        int pushLink = builder.pushLink(new LinkAnnotation.Clickable("expand_collapse", textLinkStyles, new BitcoinLocationViewKt$$ExternalSyntheticLambda8(1, mutableState2)));
                        try {
                            builder.append(str2);
                            builder.pop(pushLink);
                            mutableState3.setValue(builder.toAnnotatedString());
                            mutableState4.setValue(Boolean.TRUE);
                            mutableState2.setValue(Boolean.valueOf(z));
                        } catch (Throwable th) {
                            builder.pop(pushLink);
                            throw th;
                        }
                    }
                    mutableState.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 2:
                Function2 function2 = (Function2) obj8;
                final Function1 function13 = (Function1) obj3;
                final Map map = (Map) obj6;
                final Function1 function14 = (Function1) obj2;
                final LazyListState lazyListState = (LazyListState) obj5;
                final Function1 function15 = (Function1) obj7;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                for (SectionViewModel sectionViewModel : (List) obj4) {
                    String str4 = sectionViewModel.name;
                    SectionViewModel.Type type2 = sectionViewModel.f1193type;
                    final List list2 = sectionViewModel.recipients;
                    String str5 = sectionViewModel.description;
                    if (str4.length() > 0) {
                        if (type2 != SectionViewModel.Type.CONTACTS_OFF_CASH || str5 == null) {
                            LazyListScope.stickyHeader$default(lazyListScope2, null, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str4, i4), true, -368186264), 3);
                        } else {
                            LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new NoteInputViewKt$$ExternalSyntheticLambda4(str4, str5, i2), true, -345136291), 3);
                        }
                    }
                    int size = list2.size();
                    OpenSourceKt$$ExternalSyntheticLambda6 openSourceKt$$ExternalSyntheticLambda6 = new OpenSourceKt$$ExternalSyntheticLambda6(list2, 7);
                    final boolean z2 = this.f$0;
                    LazyListScope.items$default(lazyListScope2, size, openSourceKt$$ExternalSyntheticLambda6, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i6;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj9;
                            int intValue = ((Integer) obj10).intValue();
                            Composer composer = (Composer) obj11;
                            int intValue2 = ((Integer) obj12).intValue();
                            lazyItemScopeImpl.getClass();
                            if ((intValue2 & 6) == 0) {
                                i6 = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                            } else {
                                i6 = intValue2;
                            }
                            if ((intValue2 & 48) == 0) {
                                i6 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                            }
                            int i7 = 0;
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                                RecipientViewModel recipientViewModel = (RecipientViewModel) list2.get(intValue);
                                Object rememberedValue = gapComposer.rememberedValue();
                                Object obj13 = Composer.Companion.Empty;
                                if (rememberedValue == obj13) {
                                    rememberedValue = Updater.derivedStateOf(new OffersHomeV2Kt$$ExternalSyntheticLambda7(28, lazyListState, recipientViewModel));
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                ComposableLambdaImpl composableLambdaImpl = null;
                                if (((Boolean) ((State) rememberedValue).getValue()).booleanValue()) {
                                    gapComposer.startReplaceGroup(-899006580);
                                    Function1 function16 = function13;
                                    boolean changed = gapComposer.changed(function16) | gapComposer.changedInstance(recipientViewModel);
                                    Object rememberedValue2 = gapComposer.rememberedValue();
                                    if (changed || rememberedValue2 == obj13) {
                                        rememberedValue2 = new RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1(function16, recipientViewModel, null, 0);
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    Updater.LaunchedEffect(gapComposer, recipientViewModel, (Function2) rememberedValue2);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(-898933544);
                                    gapComposer.end(false);
                                }
                                Map map2 = map;
                                boolean changed2 = gapComposer.changed(map2);
                                Object rememberedValue3 = gapComposer.rememberedValue();
                                if (changed2 || rememberedValue3 == obj13) {
                                    rememberedValue3 = Boolean.valueOf(CollectionsKt.contains(map2.keySet(), recipientViewModel.recipient.customerId));
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                boolean booleanValue = ((Boolean) rememberedValue3).booleanValue();
                                Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
                                Function1 function17 = function14;
                                boolean changed3 = gapComposer.changed(function17) | gapComposer.changedInstance(recipientViewModel);
                                Object rememberedValue4 = gapComposer.rememberedValue();
                                if (changed3 || rememberedValue4 == obj13) {
                                    rememberedValue4 = new RecipientListViewKt$$ExternalSyntheticLambda10(function17, recipientViewModel, 0);
                                    gapComposer.updateRememberedValue(rememberedValue4);
                                }
                                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(animateItem$default, false, null, null, (Function0) rememberedValue4, 15);
                                String str6 = recipientViewModel.subtitle;
                                if (str6 == null) {
                                    gapComposer.startReplaceGroup(-894787512);
                                } else {
                                    gapComposer.startReplaceGroup(-894787511);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1758137127, new PoolCreateViewKt$$ExternalSyntheticLambda5(str6, 23), gapComposer);
                                }
                                gapComposer.end(false);
                                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-486187512, new ShiftListViewKt$$ExternalSyntheticLambda16(recipientViewModel, function15, lazyItemScopeImpl, z2), gapComposer), Expect_jvmKt.rememberComposableLambda(530032615, new RecipientListViewKt$$ExternalSyntheticLambda13(recipientViewModel, i7), gapComposer), m183clickableoSLSa3U$default, null, null, false, false, composableLambdaImpl, null, new CellDefaultAccessory.Radio(booleanValue), 0L, null, gapComposer, 54, 0, 3448);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -775087894), 4);
                }
                if (function2 != null) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new LocalMenuCardKt$$ExternalSyntheticLambda0(1, function2), true, 1951967730), 3);
                }
                return Unit.INSTANCE;
            default:
                RecurringPreferenceQueries recurringPreferenceQueries = (RecurringPreferenceQueries) obj8;
                String str6 = (String) obj7;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                recurringPreferenceQueries.recurring_preferenceAdapter.getClass();
                str6.getClass();
                androidStatement.bindString(0, str6);
                androidStatement.bindBoolean(1, Boolean.valueOf(z));
                Recurring_preference.Adapter adapter = recurringPreferenceQueries.recurring_preferenceAdapter;
                androidStatement.bindBytes(2, (byte[]) adapter.amountAdapter.encode((Money) obj6));
                androidStatement.bindBytes(3, (byte[]) adapter.scheduleAdapter.encode((RecurringSchedule) obj5));
                androidStatement.bindLong(4, (Long) obj4);
                androidStatement.bindString(5, (String) adapter.typeAdapter.encode((ScheduledTransactionPreference.Type) obj3));
                androidStatement.bindString(6, (String) obj2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda8(String str, String str2, boolean z, MutableState mutableState, TextLinkStyles textLinkStyles, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f$7 = str;
        this.f$1 = str2;
        this.f$0 = z;
        this.f$2 = mutableState;
        this.f$4 = textLinkStyles;
        this.f$3 = mutableState2;
        this.f$5 = mutableState3;
        this.f$6 = mutableState4;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda8(List list, Function2 function2, Function1 function1, Map map, Function1 function12, LazyListState lazyListState, Function1 function13, boolean z) {
        this.f$3 = list;
        this.f$1 = function2;
        this.f$5 = function1;
        this.f$2 = map;
        this.f$6 = function12;
        this.f$4 = lazyListState;
        this.f$7 = function13;
        this.f$0 = z;
    }

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda8(boolean z, InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel, ImmutableList immutableList, List list, ImmutableList immutableList2, Function1 function1, Function1 function12, String str) {
        this.f$0 = z;
        this.f$1 = promotionUpsellViewModel;
        this.f$2 = immutableList;
        this.f$3 = list;
        this.f$4 = immutableList2;
        this.f$5 = function1;
        this.f$6 = function12;
        this.f$7 = str;
    }
}
