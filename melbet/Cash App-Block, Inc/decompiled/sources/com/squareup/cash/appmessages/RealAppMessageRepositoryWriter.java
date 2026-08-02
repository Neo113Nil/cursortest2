package com.squareup.cash.appmessages;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.appmessages.db.SheetMessageQueries$$ExternalSyntheticLambda6;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage$VisualAsset$Video;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message$VisualAsset$Avatar;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.ui.Color;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Path;
import xyz.block.genie.expressions.EvalHelpersKt;

/* loaded from: classes.dex */
public final class RealAppMessageRepositoryWriter {
    public final LocalTabContentQueries cardMessageQueries;
    public final AndroidClock clock;
    public final LocalTabContentQueries fullScreenMessageQueries;
    public final LocalTabContentQueries inAppNotificationMessageQueries;
    public final LocalTabContentQueries inlineMessagesQueries;
    public final LocalTabContentQueries inlineMessagesV2Queries;
    public final CoroutineContext ioDispatcher;
    public final LocalTabContentQueries popupMessageQueries;
    public final LocalTabContentQueries sheetMessageQueries;
    public final LocalTabContentQueries tooltipMessageQueries;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                Path.Companion companion = MessageType.Companion;
                iArr[11] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Path.Companion companion2 = MessageType.Companion;
                iArr[10] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Path.Companion companion3 = MessageType.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Path.Companion companion4 = MessageType.Companion;
                iArr[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Path.Companion companion5 = MessageType.Companion;
                iArr[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Path.Companion companion6 = MessageType.Companion;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Path.Companion companion7 = MessageType.Companion;
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Path.Companion companion8 = MessageType.Companion;
                iArr[2] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Path.Companion companion9 = MessageType.Companion;
                iArr[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Path.Companion companion10 = MessageType.Companion;
                iArr[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Path.Companion companion11 = MessageType.Companion;
                iArr[3] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Path.Companion companion12 = MessageType.Companion;
                iArr[4] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealAppMessageRepositoryWriter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CoroutineContext coroutineContext) {
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.inlineMessagesQueries = cashAccountDatabaseImpl.inlineMessageQueries;
        this.inlineMessagesV2Queries = cashAccountDatabaseImpl.inlineMessageV2Queries;
        this.popupMessageQueries = cashAccountDatabaseImpl.popupMessageQueries;
        this.sheetMessageQueries = cashAccountDatabaseImpl.sheetMessageQueries;
        this.inAppNotificationMessageQueries = cashAccountDatabaseImpl.inAppNotificationMessageQueries;
        this.fullScreenMessageQueries = cashAccountDatabaseImpl.fullScreenMessageQueries;
        this.tooltipMessageQueries = cashAccountDatabaseImpl.tooltipMessageQueries;
        this.cardMessageQueries = cashAccountDatabaseImpl.cardMessageQueries;
    }

    public static final void access$insertWithoutTransaction(RealAppMessageRepositoryWriter realAppMessageRepositoryWriter, AppMessage appMessage) {
        boolean booleanValue;
        zzjo zzjoVar;
        zzjo zzjoVar2;
        zzjo zzjoVar3;
        zzjo zzjoVar4;
        zzjo zzjoVar5;
        zzjo zzjoVar6;
        zzjo zzjoVar7;
        zzjo zzjoVar8;
        AndroidClock androidClock = realAppMessageRepositoryWriter.clock;
        AppMessageFormat appMessageFormat = appMessage.app_message_format;
        MessageType messageType = appMessage.message_type;
        Long l = appMessage.expires_at;
        Boolean bool = appMessage.is_badged;
        final String str = appMessage.message_token;
        InlineMessage access$getInline_message = (appMessageFormat == null || (zzjoVar8 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getInline_message(zzjoVar8);
        InlineV2Message access$getInline_v2_message = (appMessageFormat == null || (zzjoVar7 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getInline_v2_message(zzjoVar7);
        PopupMessage access$getPopup_message = (appMessageFormat == null || (zzjoVar6 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getPopup_message(zzjoVar6);
        HalfSheetMessage access$getHalf_sheet_message = (appMessageFormat == null || (zzjoVar5 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getHalf_sheet_message(zzjoVar5);
        InAppNotificationMessage access$getIn_app_notification_message = (appMessageFormat == null || (zzjoVar4 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getIn_app_notification_message(zzjoVar4);
        FullScreenMessage access$getFull_screen_message = (appMessageFormat == null || (zzjoVar3 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getFull_screen_message(zzjoVar3);
        TooltipMessage access$getTooltip_message = (appMessageFormat == null || (zzjoVar2 = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getTooltip_message(zzjoVar2);
        CardMessage access$getCard_message = (appMessageFormat == null || (zzjoVar = appMessageFormat.message) == null) ? null : EvalHelpersKt.access$getCard_message(zzjoVar);
        if (access$getInline_message != null) {
            final LocalTabContentQueries localTabContentQueries = realAppMessageRepositoryWriter.inlineMessagesQueries;
            str.getClass();
            final String str2 = appMessage.campaign_token;
            final boolean booleanValue2 = bool != null ? bool.booleanValue() : true;
            final InlineMessage.Placement placement = access$getInline_message.placement;
            zzju zzjuVar = access$getInline_message.visualAsset;
            final Image access$getImage = zzjuVar != null ? EvalHelpersKt.access$getImage(zzjuVar) : null;
            final Animation access$getAnimation = zzjuVar != null ? EvalHelpersKt.access$getAnimation(zzjuVar) : null;
            final String str3 = access$getInline_message.message_title;
            final String str4 = access$getInline_message.message_subtitle;
            Boolean bool2 = access$getInline_message.cannot_be_dismissed;
            final boolean booleanValue3 = bool2 != null ? bool2.booleanValue() : false;
            final AppMessageAction appMessageAction = access$getInline_message.primary_navigation_action;
            appMessageAction.getClass();
            final AppMessageAction appMessageAction2 = access$getInline_message.secondary_navigation_action;
            final Instant ofEpochSecond = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            final int priority = priority(messageType);
            final MessageType messageType2 = appMessage.message_type;
            localTabContentQueries.getClass();
            localTabContentQueries.driver.execute(564030092, "INSERT INTO inlineMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  image,\n  animation,\n  title,\n  subtitle,\n  primaryNavigationAction,\n  secondaryNavigationAction,\n  cannotBeDismissed,\n  expiresAtUtc,\n  priority,\n  messageType\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.appmessages.db.InlineMessageQueries$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AndroidStatement androidStatement = (AndroidStatement) obj;
                    Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str2);
                    androidStatement.bindBoolean(2, Boolean.valueOf(booleanValue2));
                    InlineMessage.Placement placement2 = placement;
                    LocalTabContentQueries localTabContentQueries2 = localTabContentQueries;
                    androidStatement.bindString(3, placement2 != null ? (String) ((EnumColumnAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).program_detail_rowsAdapter).encode(placement2) : null);
                    Image image = access$getImage;
                    androidStatement.bindBytes(4, image != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).avatarsAdapter).encode(image) : null);
                    Animation animation = access$getAnimation;
                    androidStatement.bindBytes(5, animation != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).app_linksAdapter).encode(animation) : null);
                    androidStatement.bindString(6, str3);
                    androidStatement.bindString(7, str4);
                    AppMessageAction appMessageAction3 = appMessageAction;
                    androidStatement.bindBytes(8, appMessageAction3 != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).reward_selection_stateAdapter).encode(appMessageAction3) : null);
                    AppMessageAction appMessageAction4 = appMessageAction2;
                    androidStatement.bindBytes(9, appMessageAction4 != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).boost_detail_bottom_upsellAdapter).encode(appMessageAction4) : null);
                    androidStatement.bindBoolean(10, Boolean.valueOf(booleanValue3));
                    Instant instant = ofEpochSecond;
                    androidStatement.bindLong(11, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).boost_attributesAdapter).encode(instant)).longValue()) : null);
                    ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).getClass();
                    androidStatement.bindLong(12, Long.valueOf(priority));
                    MessageType messageType3 = messageType2;
                    androidStatement.bindString(13, messageType3 != null ? (String) ((EnumColumnAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).boost_detail_rowsAdapter).encode(messageType3) : null);
                    return Unit.INSTANCE;
                }
            });
            localTabContentQueries.notifyQueries(564030092, new CardMessageQueries$$ExternalSyntheticLambda7(9));
            return;
        }
        if (access$getInline_v2_message != null) {
            LocalTabContentQueries localTabContentQueries2 = realAppMessageRepositoryWriter.inlineMessagesV2Queries;
            str.getClass();
            String str5 = appMessage.campaign_token;
            booleanValue = bool != null ? bool.booleanValue() : true;
            InlineV2Message.Placement placement2 = access$getInline_v2_message.placement;
            InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = access$getInline_v2_message.visualAsset;
            localTabContentQueries2.insert(priority(messageType), placement2, inlineV2Message$VisualAsset$Avatar != null ? EvalHelpersKt.access$getAvatar(inlineV2Message$VisualAsset$Avatar) : null, str, str5, access$getInline_v2_message.message_title, access$getInline_v2_message.message_subtitle, access$getInline_v2_message.url, l != null ? Instant.ofEpochSecond(l.longValue()) : null, booleanValue);
            return;
        }
        if (access$getPopup_message != null) {
            final LocalTabContentQueries localTabContentQueries3 = realAppMessageRepositoryWriter.popupMessageQueries;
            str.getClass();
            final String str6 = appMessage.campaign_token;
            final boolean booleanValue4 = bool != null ? bool.booleanValue() : true;
            final PopupMessage.Placement placement3 = access$getPopup_message.placement;
            zzjv zzjvVar = access$getPopup_message.visualAsset;
            final Image access$getImage2 = zzjvVar != null ? EvalHelpersKt.access$getImage(zzjvVar) : null;
            final Animation access$getAnimation2 = zzjvVar != null ? EvalHelpersKt.access$getAnimation(zzjvVar) : null;
            final String str7 = access$getPopup_message.message_title;
            final String str8 = access$getPopup_message.message_subtitle;
            final AppMessageAction appMessageAction3 = access$getPopup_message.primary_navigation_action;
            appMessageAction3.getClass();
            final AppMessageAction appMessageAction4 = access$getPopup_message.secondary_navigation_action;
            final Instant now = DimensionKt.now(androidClock);
            final Instant ofEpochSecond2 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            final int priority2 = priority(messageType);
            localTabContentQueries3.getClass();
            now.getClass();
            localTabContentQueries3.driver.execute(220225035, "INSERT INTO popupMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  image,\n  animation,\n  title,\n  subtitle,\n  primaryNavigationAction,\n  secondaryNavigationAction,\n  insertedAtUtc,\n  expiresAtUtc,\n  priority\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.appmessages.db.PopupMessageQueries$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AndroidStatement androidStatement = (AndroidStatement) obj;
                    Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str6);
                    androidStatement.bindBoolean(2, Boolean.valueOf(booleanValue4));
                    PopupMessage.Placement placement4 = placement3;
                    LocalTabContentQueries localTabContentQueries4 = localTabContentQueries3;
                    androidStatement.bindString(3, placement4 != null ? (String) ((EnumColumnAdapter) ((Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter).program_detail_rowsAdapter).encode(placement4) : null);
                    Image image = access$getImage2;
                    androidStatement.bindBytes(4, image != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter).avatarsAdapter).encode(image) : null);
                    Animation animation = access$getAnimation2;
                    androidStatement.bindBytes(5, animation != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter).app_linksAdapter).encode(animation) : null);
                    androidStatement.bindString(6, str7);
                    androidStatement.bindString(7, str8);
                    AppMessageAction appMessageAction5 = appMessageAction3;
                    androidStatement.bindBytes(8, appMessageAction5 != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter).reward_selection_stateAdapter).encode(appMessageAction5) : null);
                    AppMessageAction appMessageAction6 = appMessageAction4;
                    androidStatement.bindBytes(9, appMessageAction6 != null ? (byte[]) ((WireAdapter) ((Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter).boost_detail_bottom_upsellAdapter).encode(appMessageAction6) : null);
                    Reward$Adapter reward$Adapter = (Reward$Adapter) localTabContentQueries4.local_tab_contentAdapter;
                    androidStatement.bindLong(10, (Long) ((AsyncTimeout.Companion) reward$Adapter.boost_detail_rowsAdapter).encode(now));
                    Instant instant = ofEpochSecond2;
                    androidStatement.bindLong(11, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) reward$Adapter.boost_attributesAdapter).encode(instant)).longValue()) : null);
                    androidStatement.bindLong(12, Long.valueOf(priority2));
                    return Unit.INSTANCE;
                }
            });
            localTabContentQueries3.notifyQueries(220225035, new CardMessageQueries$$ExternalSyntheticLambda7(21));
            return;
        }
        if (access$getHalf_sheet_message != null) {
            LocalTabContentQueries localTabContentQueries4 = realAppMessageRepositoryWriter.sheetMessageQueries;
            str.getClass();
            String str9 = appMessage.campaign_token;
            Instant now2 = DimensionKt.now(androidClock);
            Instant ofEpochSecond3 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            String str10 = appMessage.metadata_id;
            booleanValue = bool != null ? bool.booleanValue() : true;
            int priority3 = priority(messageType);
            localTabContentQueries4.getClass();
            now2.getClass();
            localTabContentQueries4.driver.execute(-1943007816, "INSERT INTO sheetMessage\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new SheetMessageQueries$$ExternalSyntheticLambda6(str, str9, booleanValue, localTabContentQueries4, access$getHalf_sheet_message, now2, str10, priority3, ofEpochSecond3));
            localTabContentQueries4.notifyQueries(-1943007816, new CardMessageQueries$$ExternalSyntheticLambda7(26));
            return;
        }
        if (access$getIn_app_notification_message != null) {
            LocalTabContentQueries localTabContentQueries5 = realAppMessageRepositoryWriter.inAppNotificationMessageQueries;
            str.getClass();
            String str11 = appMessage.campaign_token;
            boolean booleanValue5 = bool != null ? bool.booleanValue() : true;
            Integer num = access$getIn_app_notification_message.duration;
            ActionEvent.Usr.Companion companion = access$getIn_app_notification_message.visualAsset;
            Long valueOf = num != null ? Long.valueOf(num.intValue()) : null;
            String access$getAsset_url = companion != null ? EvalHelpersKt.access$getAsset_url(companion) : null;
            Animation access$getAnimation3 = companion != null ? EvalHelpersKt.access$getAnimation(companion) : null;
            AppMessageAction appMessageAction5 = access$getIn_app_notification_message.action;
            Image access$getImage3 = companion != null ? EvalHelpersKt.access$getImage(companion) : null;
            Image access$getAvatar = companion != null ? EvalHelpersKt.access$getAvatar(companion) : null;
            Instant ofEpochSecond4 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            int priority4 = priority(messageType);
            localTabContentQueries5.getClass();
            localTabContentQueries5.driver.execute(555485392, "INSERT INTO inAppNotificationMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  duration,\n  assetUrl,\n  animation,\n  action,\n  image,\n  avatar,\n  expiresAtUtc,\n  priority\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new CardMessageQueries$$ExternalSyntheticLambda4(str, str11, booleanValue5, valueOf, access$getAsset_url, access$getAnimation3, appMessageAction5, access$getImage3, access$getAvatar, ofEpochSecond4, localTabContentQueries5, priority4));
            localTabContentQueries5.notifyQueries(555485392, new CardMessageQueries$$ExternalSyntheticLambda7(6));
            return;
        }
        if (access$getFull_screen_message != null) {
            LocalTabContentQueries localTabContentQueries6 = realAppMessageRepositoryWriter.fullScreenMessageQueries;
            str.getClass();
            String str12 = appMessage.campaign_token;
            boolean booleanValue6 = bool != null ? bool.booleanValue() : true;
            FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = access$getFull_screen_message.visualAsset;
            Video access$getVideo = fullScreenMessage$VisualAsset$Video != null ? EvalHelpersKt.access$getVideo(fullScreenMessage$VisualAsset$Video) : null;
            AppMessageAction appMessageAction6 = access$getFull_screen_message.primary_action;
            AppMessageAction appMessageAction7 = access$getFull_screen_message.secondary_action;
            Color color = access$getFull_screen_message.primary_button_accent_color;
            Color color2 = access$getFull_screen_message.secondary_button_accent_color;
            int priority5 = priority(messageType);
            Instant now3 = DimensionKt.now(androidClock);
            Instant ofEpochSecond5 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            FullScreenMessage.Placement placement4 = access$getFull_screen_message.placement;
            localTabContentQueries6.getClass();
            now3.getClass();
            localTabContentQueries6.driver.execute(-1310933494, "INSERT INTO fullScreenMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  video,\n  primaryAction,\n  secondaryAction,\n  primaryActionColor,\n  secondaryActionColor,\n  priority,\n  insertedAtUtc,\n  expiresAtUtc,\n  placement\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new FullScreenMessageQueries$$ExternalSyntheticLambda3(str, str12, booleanValue6, access$getVideo, appMessageAction6, appMessageAction7, color, color2, localTabContentQueries6, priority5, now3, ofEpochSecond5, placement4));
            localTabContentQueries6.notifyQueries(-1310933494, new CardMessageQueries$$ExternalSyntheticLambda7(3));
            return;
        }
        int i = 29;
        if (access$getTooltip_message != null) {
            LocalTabContentQueries localTabContentQueries7 = realAppMessageRepositoryWriter.tooltipMessageQueries;
            str.getClass();
            String str13 = appMessage.campaign_token;
            boolean booleanValue7 = bool != null ? bool.booleanValue() : false;
            Placement placement5 = access$getTooltip_message.placement;
            TooltipMessage.ArrowPosition arrowPosition = access$getTooltip_message.arrow_position;
            AppMessageAction appMessageAction8 = access$getTooltip_message.tooltip;
            Instant ofEpochSecond6 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            int priority6 = priority(messageType);
            localTabContentQueries7.getClass();
            localTabContentQueries7.driver.execute(-1033268908, "INSERT INTO tooltipMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  arrowPosition,\n  tooltip,\n  expiresAtUtc,\n  priority\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new SheetMessageQueries$$ExternalSyntheticLambda6(str, str13, booleanValue7, placement5, arrowPosition, appMessageAction8, ofEpochSecond6, localTabContentQueries7, priority6));
            localTabContentQueries7.notifyQueries(-1033268908, new CardMessageQueries$$ExternalSyntheticLambda7(i));
            return;
        }
        if (access$getCard_message != null) {
            LocalTabContentQueries localTabContentQueries8 = realAppMessageRepositoryWriter.cardMessageQueries;
            str.getClass();
            String str14 = appMessage.campaign_token;
            boolean z = !Intrinsics.areEqual(bool, Boolean.FALSE);
            CardMessage.Placement placement6 = access$getCard_message.placement;
            ActionEvent.Os.Companion companion2 = access$getCard_message.visualAsset;
            Image access$getImage4 = companion2 != null ? EvalHelpersKt.access$getImage(companion2) : null;
            Animation access$getAnimation4 = companion2 != null ? EvalHelpersKt.access$getAnimation(companion2) : null;
            String str15 = access$getCard_message.message_title;
            String str16 = access$getCard_message.message_subtitle;
            AppMessageAction appMessageAction9 = access$getCard_message.primary_navigation_action;
            appMessageAction9.getClass();
            Instant ofEpochSecond7 = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
            int priority7 = priority(messageType);
            localTabContentQueries8.getClass();
            localTabContentQueries8.driver.execute(-72105803, "INSERT INTO cardMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  image,\n  animation,\n  title,\n  subtitle,\n  primaryNavigationAction,\n  expiresAtUtc,\n  priority\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new CardMessageQueries$$ExternalSyntheticLambda4(str, str14, z, placement6, access$getImage4, access$getAnimation4, str15, str16, appMessageAction9, ofEpochSecond7, localTabContentQueries8, priority7));
            localTabContentQueries8.notifyQueries(-72105803, new CardMessageQueries$$ExternalSyntheticLambda1(i));
        }
    }

    public static int priority(MessageType messageType) {
        switch (messageType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            default:
                return 1;
        }
    }
}
