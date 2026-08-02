package bo.app;

import android.content.Context;
import android.graphics.CornerPathEffect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import coil3.size.SizeKt;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ c7$$ExternalSyntheticLambda6(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int columnIndexOrThrow;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3 = this.$r8$classId;
        int i4 = 0;
        long j = this.f$0;
        switch (i3) {
            case 0:
                return c7.b(j, (id) obj);
            case 1:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() >> 32)) / 2.0f;
                return cacheDrawScope.onDrawWithContent(new ThumbNode$$ExternalSyntheticLambda0(intBitsToFloat, SimpleLayoutKt.createHandleImage(cacheDrawScope, intBitsToFloat), new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), 3));
            case 2:
                ((SemanticsPropertyReceiver) obj).set(SelectionHandlesKt.SelectionHandleInfoKey, new SelectionHandleInfo(Handle.Cursor, this.f$0, SelectionHandleAnchor.Middle, true));
                return Unit.INSTANCE;
            case 3:
                DrawScope drawScope = (DrawScope) obj;
                float min = Math.min(drawScope.mo236toPx0680j_4(4.0f), Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)));
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(6.0f);
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - min) / 2.0f;
                if (intBitsToFloat2 <= mo236toPx0680j_4) {
                    mo236toPx0680j_4 = intBitsToFloat2;
                }
                if (drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
                    long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
                    GrpcMethod drawContext = drawScope.getDrawContext();
                    long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        ((Extras.Key) drawContext.path).m1437scale0AR0LA0(-1.0f, 1.0f, mo752getCenterF1C5BW0);
                        MenuKt.drawStopIndicator_EgI2THU$drawIndicator(min, mo236toPx0680j_4, j, drawScope);
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    }
                } else {
                    MenuKt.drawStopIndicator_EgI2THU$drawIndicator(min, mo236toPx0680j_4, j, drawScope);
                }
                return Unit.INSTANCE;
            case 4:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    prepare.bindLong(1, j);
                    int columnIndexOrThrow2 = SizeKt.getColumnIndexOrThrow(prepare, "id");
                    int columnIndexOrThrow3 = SizeKt.getColumnIndexOrThrow(prepare, "state");
                    int columnIndexOrThrow4 = SizeKt.getColumnIndexOrThrow(prepare, "worker_class_name");
                    int columnIndexOrThrow5 = SizeKt.getColumnIndexOrThrow(prepare, "input_merger_class_name");
                    int columnIndexOrThrow6 = SizeKt.getColumnIndexOrThrow(prepare, "input");
                    int columnIndexOrThrow7 = SizeKt.getColumnIndexOrThrow(prepare, "output");
                    int columnIndexOrThrow8 = SizeKt.getColumnIndexOrThrow(prepare, "initial_delay");
                    int columnIndexOrThrow9 = SizeKt.getColumnIndexOrThrow(prepare, "interval_duration");
                    int columnIndexOrThrow10 = SizeKt.getColumnIndexOrThrow(prepare, "flex_duration");
                    int columnIndexOrThrow11 = SizeKt.getColumnIndexOrThrow(prepare, "run_attempt_count");
                    int columnIndexOrThrow12 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_policy");
                    int columnIndexOrThrow13 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
                    int columnIndexOrThrow14 = SizeKt.getColumnIndexOrThrow(prepare, "last_enqueue_time");
                    int columnIndexOrThrow15 = SizeKt.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
                    int columnIndexOrThrow16 = SizeKt.getColumnIndexOrThrow(prepare, "schedule_requested_at");
                    int columnIndexOrThrow17 = SizeKt.getColumnIndexOrThrow(prepare, "run_in_foreground");
                    int columnIndexOrThrow18 = SizeKt.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
                    int columnIndexOrThrow19 = SizeKt.getColumnIndexOrThrow(prepare, "period_count");
                    int columnIndexOrThrow20 = SizeKt.getColumnIndexOrThrow(prepare, "generation");
                    int columnIndexOrThrow21 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
                    columnIndexOrThrow = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
                    int columnIndexOrThrow22 = SizeKt.getColumnIndexOrThrow(prepare, "stop_reason");
                    int columnIndexOrThrow23 = SizeKt.getColumnIndexOrThrow(prepare, "trace_tag");
                    int columnIndexOrThrow24 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
                    int columnIndexOrThrow25 = SizeKt.getColumnIndexOrThrow(prepare, "required_network_type");
                    int columnIndexOrThrow26 = SizeKt.getColumnIndexOrThrow(prepare, "required_network_request");
                    int columnIndexOrThrow27 = SizeKt.getColumnIndexOrThrow(prepare, "requires_charging");
                    int columnIndexOrThrow28 = SizeKt.getColumnIndexOrThrow(prepare, "requires_device_idle");
                    int columnIndexOrThrow29 = SizeKt.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
                    int columnIndexOrThrow30 = SizeKt.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
                    int columnIndexOrThrow31 = SizeKt.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
                    int columnIndexOrThrow32 = SizeKt.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
                    int columnIndexOrThrow33 = SizeKt.getColumnIndexOrThrow(prepare, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (prepare.step()) {
                        String text = prepare.getText(columnIndexOrThrow2);
                        int i5 = columnIndexOrThrow12;
                        int i6 = columnIndexOrThrow13;
                        WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow3));
                        String text2 = prepare.getText(columnIndexOrThrow4);
                        String text3 = prepare.getText(columnIndexOrThrow5);
                        byte[] blob = prepare.getBlob(columnIndexOrThrow6);
                        Data data = Data.EMPTY;
                        Data fromByteArray = Strings.fromByteArray(blob);
                        Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow7));
                        long j2 = prepare.getLong(columnIndexOrThrow8);
                        long j3 = prepare.getLong(columnIndexOrThrow9);
                        long j4 = prepare.getLong(columnIndexOrThrow10);
                        int i7 = (int) prepare.getLong(columnIndexOrThrow11);
                        int i8 = columnIndexOrThrow4;
                        int i9 = columnIndexOrThrow3;
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(i5));
                        long j5 = prepare.getLong(i6);
                        long j6 = prepare.getLong(columnIndexOrThrow14);
                        long j7 = prepare.getLong(columnIndexOrThrow15);
                        int i10 = columnIndexOrThrow16;
                        long j8 = prepare.getLong(i10);
                        int i11 = columnIndexOrThrow2;
                        int i12 = columnIndexOrThrow17;
                        int i13 = columnIndexOrThrow14;
                        boolean z = ((int) prepare.getLong(i12)) != 0;
                        int i14 = columnIndexOrThrow18;
                        OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i14));
                        int i15 = columnIndexOrThrow19;
                        int i16 = columnIndexOrThrow15;
                        int i17 = (int) prepare.getLong(i15);
                        int i18 = columnIndexOrThrow20;
                        int i19 = (int) prepare.getLong(i18);
                        int i20 = columnIndexOrThrow21;
                        long j9 = prepare.getLong(i20);
                        int i21 = columnIndexOrThrow;
                        int i22 = (int) prepare.getLong(i21);
                        int i23 = columnIndexOrThrow22;
                        int i24 = (int) prepare.getLong(i23);
                        int i25 = columnIndexOrThrow23;
                        String text4 = prepare.isNull(i25) ? null : prepare.getText(i25);
                        int i26 = columnIndexOrThrow24;
                        if (prepare.isNull(i26)) {
                            i = i22;
                            i2 = i23;
                            valueOf = null;
                        } else {
                            i = i22;
                            i2 = i23;
                            valueOf = Integer.valueOf((int) prepare.getLong(i26));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i27 = columnIndexOrThrow25;
                        NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i27));
                        int i28 = columnIndexOrThrow26;
                        NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i28));
                        columnIndexOrThrow25 = i27;
                        columnIndexOrThrow26 = i28;
                        int i29 = columnIndexOrThrow27;
                        boolean z2 = ((int) prepare.getLong(i29)) != 0;
                        columnIndexOrThrow27 = i29;
                        int i30 = columnIndexOrThrow28;
                        boolean z3 = ((int) prepare.getLong(i30)) != 0;
                        int i31 = columnIndexOrThrow29;
                        boolean z4 = ((int) prepare.getLong(i31)) != 0;
                        columnIndexOrThrow29 = i31;
                        int i32 = columnIndexOrThrow30;
                        int i33 = columnIndexOrThrow31;
                        int i34 = columnIndexOrThrow32;
                        int i35 = columnIndexOrThrow33;
                        arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i32)) != 0, prepare.getLong(i33), prepare.getLong(i34), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i35))), i7, intToBackoffPolicy, j5, j6, j7, j8, z, intToOutOfQuotaPolicy, i17, i19, j9, i, i24, text4, bool));
                        columnIndexOrThrow33 = i35;
                        columnIndexOrThrow31 = i33;
                        columnIndexOrThrow32 = i34;
                        columnIndexOrThrow12 = i5;
                        columnIndexOrThrow3 = i9;
                        columnIndexOrThrow13 = i6;
                        columnIndexOrThrow2 = i11;
                        columnIndexOrThrow14 = i13;
                        columnIndexOrThrow16 = i10;
                        columnIndexOrThrow18 = i14;
                        columnIndexOrThrow17 = i12;
                        columnIndexOrThrow21 = i20;
                        columnIndexOrThrow20 = i18;
                        columnIndexOrThrow = i21;
                        columnIndexOrThrow22 = i2;
                        columnIndexOrThrow23 = i25;
                        columnIndexOrThrow24 = i26;
                        columnIndexOrThrow30 = i32;
                        columnIndexOrThrow28 = i30;
                        columnIndexOrThrow15 = i16;
                        columnIndexOrThrow4 = i8;
                        columnIndexOrThrow19 = i15;
                    }
                    prepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    prepare.close();
                    throw th;
                }
            case 5:
                CacheDrawScope cacheDrawScope2 = (CacheDrawScope) obj;
                cacheDrawScope2.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (cacheDrawScope2.cacheParams.mo587getSizeNHjbRc() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (cacheDrawScope2.cacheParams.mo587getSizeNHjbRc() & BodyPartID.bodyIdMax));
                AndroidPath Path = AndroidPath_androidKt.Path();
                Path.moveTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                float f = intBitsToFloat4 * 0.367f;
                float f2 = intBitsToFloat4 * 0.85f;
                Path.cubicTo(intBitsToFloat3 * 0.25f, intBitsToFloat4 * 0.05f, intBitsToFloat3 * 0.276f, f, intBitsToFloat3 * 0.395f, f2);
                float f3 = intBitsToFloat4 * 0.95f;
                Path.cubicTo(intBitsToFloat3 * 0.421f, f3, intBitsToFloat3 * 0.461f, intBitsToFloat4, intBitsToFloat3 * 0.5f, intBitsToFloat4);
                Path.cubicTo(intBitsToFloat3 * 0.539f, intBitsToFloat4, intBitsToFloat3 * 0.586f, f3, intBitsToFloat3 * 0.605f, f2);
                Path.cubicTo(intBitsToFloat3 * 0.73f, f, intBitsToFloat3 * 0.75f, RecyclerView.DECELERATION_RATE, intBitsToFloat3, RecyclerView.DECELERATION_RATE);
                Path.close();
                return cacheDrawScope2.onDrawWithContent(new LocalMapPinKt$$ExternalSyntheticLambda5(Path, j, i4));
            case 6:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                float mo236toPx0680j_42 = drawScope2.mo236toPx0680j_4(16.0f);
                float intBitsToFloat5 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits((-mo236toPx0680j_42) / 2.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & BodyPartID.bodyIdMax);
                long j10 = this.f$0;
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, j10, mo236toPx0680j_42, floatToRawIntBits, null, 0, 120);
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, j10, mo236toPx0680j_42, (Float.floatToRawIntBits((mo236toPx0680j_42 / 2.0f) + Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & BodyPartID.bodyIdMax), null, 0, 120);
                drawScope2.mo729drawLineNGM6Ib0(Color.m675copywmQWz5c$default(0.2f, j10, 14), (Float.floatToRawIntBits(mo236toPx0680j_42) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) - mo236toPx0680j_42) << 32), (r23 & 8) != 0 ? 0.0f : drawScope2.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 7:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(j));
                return Unit.INSTANCE;
            case 8:
                return hd.b(j, (c7) obj);
            case 9:
                ((MutablePreferences) obj).set(HeartBeatInfoStorage.GLOBAL, Long.valueOf(j));
                return null;
            case 10:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(j));
                return Unit.INSTANCE;
            case 11:
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.getClass();
                drawScope3.mo729drawLineNGM6Ib0(this.f$0, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> 32))) << 32), (r23 & 8) != 0 ? 0.0f : drawScope3.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 12:
                return Float.valueOf((((Long) obj).longValue() - j) / 1.0E9f);
            case 13:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindLong(0, Long.valueOf(j));
                return Unit.INSTANCE;
            case 14:
                DrawScope drawScope4 = (DrawScope) obj;
                drawScope4.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope4, this.f$0, Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() >> 32)) / 2.0f, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                return Unit.INSTANCE;
            case 15:
                DrawScope drawScope5 = (DrawScope) obj;
                drawScope5.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, this.f$0, drawScope5.mo236toPx0680j_4(44.0f) / 2.0f, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                return Unit.INSTANCE;
            case 16:
                DrawScope drawScope6 = (DrawScope) obj;
                drawScope6.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope6, this.f$0, RecyclerView.DECELERATION_RATE, 0L, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                DrawScope drawScope7 = (DrawScope) obj;
                drawScope7.getClass();
                float intBitsToFloat6 = Float.intBitsToFloat((int) (drawScope7.mo753getSizeNHjbRc() >> 32)) / 12.0f;
                float f4 = intBitsToFloat6 / 2.0f;
                DrawScope.m743drawOvalnJ9OG0$default(drawScope7, this.f$0, (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope7.mo753getSizeNHjbRc() >> 32)) - intBitsToFloat6) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope7.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - intBitsToFloat6) & BodyPartID.bodyIdMax), new Stroke(intBitsToFloat6, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
            case 18:
                DrawScope drawScope8 = (DrawScope) obj;
                drawScope8.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope8, this.f$0, RecyclerView.DECELERATION_RATE, 0L, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 19:
                Context context = (Context) obj;
                context.getClass();
                TimelineView timelineView = new TimelineView(context);
                timelineView.setColorPalette(ColorPalette.copy$default(timelineView.colorPalette, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorKt.m694toArgb8_81llA(j), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -16385, 268435455));
                timelineView.setTextStyle(TextStyles.smallTitle);
                return timelineView;
            case 20:
                DrawScope drawScope9 = (DrawScope) obj;
                drawScope9.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope9, this.f$0, drawScope9.mo236toPx0680j_4(44.0f) / 2.0f, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                return Unit.INSTANCE;
            case 21:
                ((Density) obj).getClass();
                return new IntOffset(j);
            case 22:
                DrawScope drawScope10 = (DrawScope) obj;
                drawScope10.getClass();
                Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, drawScope10.mo753getSizeNHjbRc());
                AndroidPath Path2 = AndroidPath_androidKt.Path();
                long m635getTopCenterF1C5BW0 = m1180Recttz77jQw.m635getTopCenterF1C5BW0();
                Path2.moveTo(Float.intBitsToFloat((int) (m635getTopCenterF1C5BW0 >> 32)), Float.intBitsToFloat((int) (m635getTopCenterF1C5BW0 & BodyPartID.bodyIdMax)));
                long m632getBottomRightF1C5BW0 = m1180Recttz77jQw.m632getBottomRightF1C5BW0();
                Path2.lineTo(Float.intBitsToFloat((int) (m632getBottomRightF1C5BW0 >> 32)), Float.intBitsToFloat((int) (m632getBottomRightF1C5BW0 & BodyPartID.bodyIdMax)));
                long m631getBottomLeftF1C5BW0 = m1180Recttz77jQw.m631getBottomLeftF1C5BW0();
                Path2.lineTo(Float.intBitsToFloat((int) (m631getBottomLeftF1C5BW0 >> 32)), Float.intBitsToFloat((int) (m631getBottomLeftF1C5BW0 & BodyPartID.bodyIdMax)));
                Path2.close();
                Canvas canvas = drawScope10.getDrawContext().getCanvas();
                Outline$Generic outline$Generic = new Outline$Generic(Path2);
                AndroidPaint Paint = ColorKt.Paint();
                Paint.m659setColor8_81llA(j);
                Paint.setPathEffect(new AndroidPathEffect(new CornerPathEffect(Math.max(Math.abs(m1180Recttz77jQw.right - m1180Recttz77jQw.left), Math.abs(m1180Recttz77jQw.bottom - m1180Recttz77jQw.top)) / 3.0f)));
                ColorKt.drawOutline(canvas, outline$Generic, Paint);
                return Unit.INSTANCE;
            case 23:
                Long l = (Long) obj;
                l.getClass();
                return Boolean.valueOf(l.longValue() == j);
            case 24:
                DrawScope drawScope11 = (DrawScope) obj;
                drawScope11.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope11, this.f$0, RecyclerView.DECELERATION_RATE, 0L, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            default:
                DrawScope drawScope12 = (DrawScope) obj;
                drawScope12.getClass();
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope12, this.f$0, RecyclerView.DECELERATION_RATE, 0L, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
        }
    }
}
