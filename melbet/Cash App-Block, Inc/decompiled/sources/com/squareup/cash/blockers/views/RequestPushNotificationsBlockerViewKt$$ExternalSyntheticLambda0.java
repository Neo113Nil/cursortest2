package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RequestPushNotificationsBlockerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = requestPushNotificationsBlockerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 2;
        final int i3 = 0;
        final Function1 function1 = this.f$1;
        final RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel = this.f$0;
        final int i4 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-477437972, new Function3() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i5 = i3;
                            final RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel2 = requestPushNotificationsBlockerViewModel;
                            final int i6 = 1;
                            final int i7 = 0;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((ColumnScope) obj3).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        requestPushNotificationsBlockerViewModel2.getClass();
                                        gapComposer2.startReplaceGroup(1577268481);
                                        DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer2, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((ScrollingScaffoldContentScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        final int i8 = 2;
                                        Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-1437025831, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i7;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), (Modifier) null, Expect_jvmKt.rememberComposableLambda(1349892887, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i6;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), Expect_jvmKt.rememberComposableLambda(595868598, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i8;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 3462, 2);
                                        if (requestPushNotificationsBlockerViewModel2.showToggles) {
                                            gapComposer3.startReplaceGroup(1215506773);
                                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                            SsnViewKt.NotificationToggles(requestPushNotificationsBlockerViewModel2, function1, gapComposer3, 0);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(1215609600);
                                            gapComposer3.end(false);
                                        }
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1552212773, new RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(requestPushNotificationsBlockerViewModel, function1, i2), gapComposer), Expect_jvmKt.rememberComposableLambda(1154409666, new Function3() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i5 = i4;
                            final RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel2 = requestPushNotificationsBlockerViewModel;
                            final int i6 = 1;
                            final int i7 = 0;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((ColumnScope) obj3).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        requestPushNotificationsBlockerViewModel2.getClass();
                                        gapComposer2.startReplaceGroup(1577268481);
                                        DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer2, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((ScrollingScaffoldContentScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        final int i8 = 2;
                                        Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-1437025831, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i7;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), (Modifier) null, Expect_jvmKt.rememberComposableLambda(1349892887, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i6;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), Expect_jvmKt.rememberComposableLambda(595868598, new Function2() { // from class: com.squareup.cash.blockers.views.RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i9 = i8;
                                                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel3 = requestPushNotificationsBlockerViewModel2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel3.title, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer5 = (Composer) obj6;
                                                        int intValue5 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                                            SsnViewKt.NotificationIcon(requestPushNotificationsBlockerViewModel3.icon, gapComposer5, 0);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj6;
                                                        int intValue6 = ((Integer) obj7).intValue();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                                            String str = requestPushNotificationsBlockerViewModel3.subtitle;
                                                            Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors2 == null) {
                                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 3462, 2);
                                        if (requestPushNotificationsBlockerViewModel2.showToggles) {
                                            gapComposer3.startReplaceGroup(1215506773);
                                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                            SsnViewKt.NotificationToggles(requestPushNotificationsBlockerViewModel2, function1, gapComposer3, 0);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(1215609600);
                                            gapComposer3.end(false);
                                        }
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 224256, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                SsnViewKt.NotificationToggles(requestPushNotificationsBlockerViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    SsnViewKt.FooterButtons(requestPushNotificationsBlockerViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                SsnViewKt.FooterButtons(requestPushNotificationsBlockerViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = requestPushNotificationsBlockerViewModel;
        this.f$1 = function1;
    }
}
