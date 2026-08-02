package com.squareup.cash.clientsync;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.network.GatewayServiceKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$Option;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncRangeQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SyncRangeQueries$$ExternalSyntheticLambda1() {
        this.$r8$classId = 3;
        AuditLogEntryQueries$selectAll$2 auditLogEntryQueries$selectAll$2 = AuditLogEntryQueries$selectAll$2.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Recorder$$ExternalSyntheticOutline2.m((String) entry.getKey(), "-", (String) entry.getValue());
            case 2:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("audit_log_entry");
                return Unit.INSTANCE;
            case 3:
                AuditLogEntryQueries$selectAll$2 auditLogEntryQueries$selectAll$2 = AuditLogEntryQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                string2.getClass();
                return auditLogEntryQueries$selectAll$2.invoke(m, string2);
            case 4:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, 200L);
                return Unit.INSTANCE;
            case 5:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("audit_log_entry");
                return Unit.INSTANCE;
            case 6:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("component_migration");
                return Unit.INSTANCE;
            case 7:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 8:
                FeatureFlag$Option featureFlag$Option = (FeatureFlag$Option) obj;
                featureFlag$Option.getClass();
                return Boolean.valueOf(featureFlag$Option == FeatureFlag$EnabledDisabledFeatureFlag$Options.Enabled);
            case 9:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 10:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("sync_entity");
                return Unit.INSTANCE;
            case 11:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("sync_entity");
                return Unit.INSTANCE;
            case 12:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("sync_entity");
                return Unit.INSTANCE;
            case 13:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("sync_range");
                return Unit.INSTANCE;
            case 14:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("sync_range");
                return Unit.INSTANCE;
            case 15:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("sync_range");
                return Unit.INSTANCE;
            case 16:
                int intValue = ((Integer) obj).intValue();
                ArrayList arrayList = GatewayServiceKt.RETRY_DELAYS;
                return (Duration) ((intValue < 0 || intValue >= arrayList.size()) ? new Duration(((Duration) CollectionsKt.last((List) arrayList)).rawValue) : arrayList.get(intValue));
            case 17:
                Pair pair = (Pair) obj;
                pair.getClass();
                return ((String) pair.first) + ": " + pair.second;
            case 18:
                obj.getClass();
                return obj;
            case 19:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.US;
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale);
            case 20:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("entity_lookup");
                return Unit.INSTANCE;
            case 21:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("entity_fts");
                return Unit.INSTANCE;
            case 22:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("entity_fts");
                return Unit.INSTANCE;
            case 23:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("entity_lookup");
                return Unit.INSTANCE;
            case 24:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("entity_fts");
                return Unit.INSTANCE;
            case 25:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("entity_lookup");
                return Unit.INSTANCE;
            case 26:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 200, null, 4), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(200, 0, null, 6), 2));
            case 28:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl);
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                Boolean bool = (Boolean) pair2.second;
                bool.booleanValue();
                return bool;
        }
    }

    public /* synthetic */ SyncRangeQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
