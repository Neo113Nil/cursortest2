package com.squareup.cash.appmessages.db;

import androidx.datastore.core.SimpleActor;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.GrpcMethod;
import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class SheetMessageQueries$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ AndroidMessage f$4;
    public final /* synthetic */ Instant f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ SheetMessageQueries$$ExternalSyntheticLambda6(String str, String str2, boolean z, LocalTabContentQueries localTabContentQueries, HalfSheetMessage halfSheetMessage, Instant instant, String str3, int i, Instant instant2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$3 = localTabContentQueries;
        this.f$4 = halfSheetMessage;
        this.f$5 = instant;
        this.f$6 = str3;
        this.f$7 = i;
        this.f$8 = instant2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj2 = this.f$8;
        Instant instant = this.f$5;
        AndroidMessage androidMessage = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$6;
        boolean z = this.f$2;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj3;
                Instant instant2 = (Instant) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str2, 1, str);
                androidStatement.bindBoolean(2, Boolean.valueOf(z));
                androidStatement.bindBytes(3, (byte[]) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode((HalfSheetMessage) androidMessage));
                GrpcMethod grpcMethod = (GrpcMethod) localTabContentQueries.local_tab_contentAdapter;
                androidStatement.bindLong(4, (Long) ((AsyncTimeout.Companion) grpcMethod.requestAdapter).encode(instant));
                androidStatement.bindString(5, (String) obj4);
                androidStatement.bindLong(6, Long.valueOf(i2));
                androidStatement.bindLong(7, instant2 != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) grpcMethod.responseAdapter).encode(instant2)).longValue()) : null);
                break;
            default:
                Placement placement = (Placement) obj4;
                TooltipMessage.ArrowPosition arrowPosition = (TooltipMessage.ArrowPosition) obj3;
                AppMessageAction appMessageAction = (AppMessageAction) androidMessage;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, str2, 1, str);
                androidStatement2.bindBoolean(2, Boolean.valueOf(z));
                androidStatement2.bindString(3, placement != null ? (String) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries2.local_tab_contentAdapter).scope).encode(placement) : null);
                androidStatement2.bindString(4, arrowPosition != null ? (String) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries2.local_tab_contentAdapter).consumeMessage).encode(arrowPosition) : null);
                androidStatement2.bindBytes(5, appMessageAction != null ? (byte[]) ((WireAdapter) ((SimpleActor) localTabContentQueries2.local_tab_contentAdapter).messageQueue).encode(appMessageAction) : null);
                androidStatement2.bindLong(6, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((SimpleActor) localTabContentQueries2.local_tab_contentAdapter).remainingMessages).encode(instant)).longValue()) : null);
                ((SimpleActor) localTabContentQueries2.local_tab_contentAdapter).getClass();
                androidStatement2.bindLong(7, Long.valueOf(i2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SheetMessageQueries$$ExternalSyntheticLambda6(String str, String str2, boolean z, Placement placement, TooltipMessage.ArrowPosition arrowPosition, AppMessageAction appMessageAction, Instant instant, LocalTabContentQueries localTabContentQueries, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$6 = placement;
        this.f$3 = arrowPosition;
        this.f$4 = appMessageAction;
        this.f$5 = instant;
        this.f$8 = localTabContentQueries;
        this.f$7 = i;
    }
}
