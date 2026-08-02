package androidx.room;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotationType;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.StringAnnotation;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.Locale_jvmAndAndroidKt;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.common.MoleculePresenterStateRegistryKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.protos.cash.money.content.FinishSetupTileV1;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile$Payload$V1;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class TransactorKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TransactorKt$$ExternalSyntheticLambda0(FinishSetupTileBadgeCounter finishSetupTileBadgeCounter) {
        this.$r8$classId = 25;
    }

    private final Object invoke$androidx$work$impl$model$WorkSpecDao_Impl$$ExternalSyntheticLambda3(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int columnIndexOrThrow = SizeKt.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SizeKt.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SizeKt.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SizeKt.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SizeKt.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SizeKt.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SizeKt.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SizeKt.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SizeKt.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SizeKt.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SizeKt.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SizeKt.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SizeKt.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SizeKt.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SizeKt.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SizeKt.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SizeKt.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
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
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                byte[] blob = prepare.getBlob(columnIndexOrThrow5);
                Data data = Data.EMPTY;
                Data fromByteArray = Strings.fromByteArray(blob);
                Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(columnIndexOrThrow13);
                long j6 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i7);
                int i8 = columnIndexOrThrow;
                int i9 = columnIndexOrThrow16;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = columnIndexOrThrow5;
                int i14 = (int) prepare.getLong(i12);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = columnIndexOrThrow25;
                Boolean bool2 = bool;
                NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                columnIndexOrThrow27 = i26;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                int i32 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i32;
                arrayList2.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i, i21, text4, bool2));
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow22 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow31 = i30;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow3 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow = i8;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow21 = i18;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow5 = i13;
                columnIndexOrThrow18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            prepare.close();
            return arrayList3;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    private final Object invoke$androidx$work$impl$model$WorkSpecDao_Impl$$ExternalSyntheticLambda8(Object obj) {
        int i;
        Integer valueOf;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            prepare.bindLong(1, 200L);
            int columnIndexOrThrow = SizeKt.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SizeKt.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SizeKt.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SizeKt.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SizeKt.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SizeKt.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SizeKt.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SizeKt.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SizeKt.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SizeKt.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SizeKt.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SizeKt.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SizeKt.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SizeKt.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SizeKt.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SizeKt.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SizeKt.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
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
                String text = prepare.getText(columnIndexOrThrow);
                int i2 = columnIndexOrThrow13;
                int i3 = columnIndexOrThrow14;
                WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                byte[] blob = prepare.getBlob(columnIndexOrThrow5);
                Data data = Data.EMPTY;
                Data fromByteArray = Strings.fromByteArray(blob);
                Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow;
                int i6 = columnIndexOrThrow2;
                BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(i2);
                long j6 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i7);
                columnIndexOrThrow15 = i7;
                int i8 = columnIndexOrThrow16;
                int i9 = columnIndexOrThrow3;
                boolean z = ((int) prepare.getLong(i8)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = (int) prepare.getLong(i12);
                int i14 = columnIndexOrThrow19;
                int i15 = (int) prepare.getLong(i14);
                int i16 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i16);
                int i17 = columnIndexOrThrow21;
                int i18 = (int) prepare.getLong(i17);
                columnIndexOrThrow21 = i17;
                int i19 = columnIndexOrThrow22;
                int i20 = (int) prepare.getLong(i19);
                int i21 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i21) ? null : prepare.getText(i21);
                int i22 = columnIndexOrThrow24;
                if (prepare.isNull(i22)) {
                    i = i21;
                    columnIndexOrThrow22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    columnIndexOrThrow22 = i19;
                    valueOf = Integer.valueOf((int) prepare.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = columnIndexOrThrow25;
                NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i23));
                int i24 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i24));
                int i25 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i25)) != 0;
                int i26 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i26)) != 0;
                int i27 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i27)) != 0;
                columnIndexOrThrow29 = i27;
                int i28 = columnIndexOrThrow30;
                int i29 = columnIndexOrThrow31;
                int i30 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i29;
                int i31 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i28)) != 0, prepare.getLong(i29), prepare.getLong(i30), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i31))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i13, i15, j8, i18, i20, text4, bool2));
                columnIndexOrThrow28 = i26;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow18 = i12;
                columnIndexOrThrow19 = i14;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow23 = i;
                columnIndexOrThrow24 = i22;
                columnIndexOrThrow25 = i23;
                columnIndexOrThrow26 = i24;
                columnIndexOrThrow27 = i25;
                columnIndexOrThrow33 = i31;
                columnIndexOrThrow32 = i30;
                columnIndexOrThrow30 = i28;
                columnIndexOrThrow = i5;
                columnIndexOrThrow3 = i9;
                columnIndexOrThrow13 = i2;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow16 = i8;
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnnotatedString.Range range;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        TextMotion textMotion;
        SQLiteStatement prepare;
        int i5;
        int i6;
        Integer valueOf;
        boolean canBeSavedToBundle;
        switch (this.$r8$classId) {
            case 0:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                sQLiteStatement.getClass();
                return Boolean.valueOf(sQLiteStatement.step());
            case 1:
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.areEqual(obj, bool)) {
                    return new TextUnit(TextUnit.Unspecified);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.TextUnitTypeSaver;
                Intrinsics.areEqual(obj3, bool);
                TextUnitType textUnitType = obj3 != null ? (TextUnitType) saversKt$NonNullValueClassSaver$1.$restore.invoke(obj3) : null;
                textUnitType.getClass();
                return new TextUnit(Room.pack(textUnitType.f861type, floatValue));
            case 2:
                return Intrinsics.areEqual(obj, (Object) 0) ? new TextUnitType(8589934592L) : Intrinsics.areEqual(obj, (Object) 1) ? new TextUnitType(4294967296L) : new TextUnitType(0L);
            case 3:
                if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                    return new Offset(9205357640488583168L);
                }
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                Float f2 = obj4 != null ? (Float) obj4 : null;
                f2.getClass();
                float floatValue2 = f2.floatValue();
                Object obj5 = list2.get(1);
                (obj5 != null ? (Float) obj5 : null).getClass();
                return new Offset((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r13.floatValue()) & BodyPartID.bodyIdMax));
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj6 = list3.get(i7);
                    Locale locale = (Intrinsics.areEqual(obj6, Boolean.FALSE) || obj6 == null) ? null : (Locale) ((Function1) SaversKt.LocaleSaver.workTaskExecutor).invoke(obj6);
                    locale.getClass();
                    arrayList.add(locale);
                }
                return new LocaleList(arrayList);
            case 5:
                obj.getClass();
                return new Locale(Locale_jvmAndAndroidKt.access$parseLanguageTag((String) obj));
            case 6:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                Object obj8 = list4.get(1);
                return new LinkAnnotation.Clickable(str, (Intrinsics.areEqual(obj8, Boolean.FALSE) || obj8 == null) ? null : (TextLinkStyles) ((Function1) SaversKt.TextLinkStylesSaver.workTaskExecutor).invoke(obj8), null);
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                float f3 = LineHeightStyle.Alignment.Center;
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.LineHeightStyleAlignmentSaver;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.areEqual(obj9, bool2);
                LineHeightStyle.Alignment alignment = obj9 != null ? (LineHeightStyle.Alignment) saversKt$NonNullValueClassSaver$12.$restore.invoke(obj9) : null;
                alignment.getClass();
                float f4 = alignment.topRatio;
                Object obj10 = list5.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$13 = SaversKt.LineHeightStyleTrimSaver;
                Intrinsics.areEqual(obj10, bool2);
                LineHeightStyle.Trim trim = obj10 != null ? (LineHeightStyle.Trim) saversKt$NonNullValueClassSaver$13.$restore.invoke(obj10) : null;
                trim.getClass();
                int i8 = trim.value;
                Object obj11 = list5.get(2);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$14 = SaversKt.LineHeightStyleModeSaver;
                Intrinsics.areEqual(obj11, bool2);
                LineHeightStyle.Mode mode = obj11 != null ? (LineHeightStyle.Mode) saversKt$NonNullValueClassSaver$14.$restore.invoke(obj11) : null;
                mode.getClass();
                return new LineHeightStyle(f4, i8, mode.value);
            case 8:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                LineHeightStyle.Alignment.m1011constructorimpl(floatValue3);
                return new LineHeightStyle.Alignment(floatValue3);
            case 9:
                obj.getClass();
                return new LineHeightStyle.Trim(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                AnnotationType annotationType = obj12 != null ? (AnnotationType) obj12 : null;
                annotationType.getClass();
                Object obj13 = list6.get(2);
                Integer num = obj13 != null ? (Integer) obj13 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj14 = list6.get(3);
                Integer num2 = obj14 != null ? (Integer) obj14 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj15 = list6.get(4);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                switch (annotationType.ordinal()) {
                    case 0:
                        Object obj16 = list6.get(1);
                        ParagraphStyle paragraphStyle = (Intrinsics.areEqual(obj16, Boolean.FALSE) || obj16 == null) ? null : (ParagraphStyle) ((Function1) SaversKt.ParagraphStyleSaver.workTaskExecutor).invoke(obj16);
                        paragraphStyle.getClass();
                        range = new AnnotatedString.Range(paragraphStyle, intValue, intValue2, str2);
                        break;
                    case 1:
                        Object obj17 = list6.get(1);
                        SpanStyle spanStyle = (Intrinsics.areEqual(obj17, Boolean.FALSE) || obj17 == null) ? null : (SpanStyle) ((Function1) SaversKt.SpanStyleSaver.workTaskExecutor).invoke(obj17);
                        spanStyle.getClass();
                        range = new AnnotatedString.Range(spanStyle, intValue, intValue2, str2);
                        break;
                    case 2:
                        Object obj18 = list6.get(1);
                        VerbatimTtsAnnotation verbatimTtsAnnotation = (Intrinsics.areEqual(obj18, Boolean.FALSE) || obj18 == null) ? null : (VerbatimTtsAnnotation) ((Function1) SaversKt.VerbatimTtsAnnotationSaver.workTaskExecutor).invoke(obj18);
                        verbatimTtsAnnotation.getClass();
                        range = new AnnotatedString.Range(verbatimTtsAnnotation, intValue, intValue2, str2);
                        break;
                    case 3:
                        Object obj19 = list6.get(1);
                        UrlAnnotation urlAnnotation = (Intrinsics.areEqual(obj19, Boolean.FALSE) || obj19 == null) ? null : (UrlAnnotation) ((Function1) SaversKt.UrlAnnotationSaver.workTaskExecutor).invoke(obj19);
                        urlAnnotation.getClass();
                        range = new AnnotatedString.Range(urlAnnotation, intValue, intValue2, str2);
                        break;
                    case 4:
                        Object obj20 = list6.get(1);
                        LinkAnnotation.Url url = (Intrinsics.areEqual(obj20, Boolean.FALSE) || obj20 == null) ? null : (LinkAnnotation.Url) ((Function1) SaversKt.LinkSaver.workTaskExecutor).invoke(obj20);
                        url.getClass();
                        range = new AnnotatedString.Range(url, intValue, intValue2, str2);
                        break;
                    case 5:
                        Object obj21 = list6.get(1);
                        LinkAnnotation.Clickable clickable = (Intrinsics.areEqual(obj21, Boolean.FALSE) || obj21 == null) ? null : (LinkAnnotation.Clickable) ((Function1) SaversKt.ClickableSaver.workTaskExecutor).invoke(obj21);
                        clickable.getClass();
                        range = new AnnotatedString.Range(clickable, intValue, intValue2, str2);
                        break;
                    case 6:
                        Object obj22 = list6.get(1);
                        String str3 = obj22 != null ? (String) obj22 : null;
                        str3.getClass();
                        range = new AnnotatedString.Range(StringAnnotation.m976boximpl(str3), intValue, intValue2, str2);
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                return range;
            case 11:
                obj.getClass();
                return new LineHeightStyle.Mode(((Integer) obj).intValue());
            case 12:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new VerbatimTtsAnnotation(str4);
            case 13:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new UrlAnnotation(str5);
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj23 = list7.get(0);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$15 = SaversKt.TextAlignSaver;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.areEqual(obj23, bool3);
                TextAlign textAlign = obj23 != null ? (TextAlign) saversKt$NonNullValueClassSaver$15.$restore.invoke(obj23) : null;
                textAlign.getClass();
                int i9 = textAlign.value;
                Object obj24 = list7.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$16 = SaversKt.TextDirectionSaver;
                Intrinsics.areEqual(obj24, bool3);
                TextDirection textDirection = obj24 != null ? (TextDirection) saversKt$NonNullValueClassSaver$16.$restore.invoke(obj24) : null;
                textDirection.getClass();
                int i10 = textDirection.value;
                Object obj25 = list7.get(2);
                TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$17 = SaversKt.TextUnitSaver;
                Intrinsics.areEqual(obj25, bool3);
                TextUnit textUnit = obj25 != null ? (TextUnit) saversKt$NonNullValueClassSaver$17.$restore.invoke(obj25) : null;
                textUnit.getClass();
                long j2 = textUnit.packedValue;
                Object obj26 = list7.get(3);
                TextIndent textIndent = TextIndent.None;
                TextIndent textIndent2 = (Intrinsics.areEqual(obj26, bool3) || obj26 == null) ? null : (TextIndent) ((Function1) SaversKt.TextIndentSaver.workTaskExecutor).invoke(obj26);
                Object obj27 = list7.get(4);
                PlatformParagraphStyle platformParagraphStyle = (Intrinsics.areEqual(obj27, bool3) || obj27 == null) ? null : (PlatformParagraphStyle) ((Function1) TextPainterKt.PlatformParagraphStyleSaver.workTaskExecutor).invoke(obj27);
                Object obj28 = list7.get(5);
                LineHeightStyle lineHeightStyle = LineHeightStyle.Default;
                LineHeightStyle lineHeightStyle2 = (Intrinsics.areEqual(obj28, bool3) || obj28 == null) ? null : (LineHeightStyle) ((Function1) SaversKt.LineHeightStyleSaver.workTaskExecutor).invoke(obj28);
                Object obj29 = list7.get(6);
                int i11 = LineBreak.Simple;
                LineBreak lineBreak = (Intrinsics.areEqual(obj29, bool3) || obj29 == null) ? null : (LineBreak) ((Function1) TextPainterKt.LineBreakSaver.workTaskExecutor).invoke(obj29);
                lineBreak.getClass();
                int i12 = lineBreak.mask;
                Object obj30 = list7.get(7);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$18 = SaversKt.HyphensSaver;
                Intrinsics.areEqual(obj30, bool3);
                Hyphens hyphens = obj30 != null ? (Hyphens) saversKt$NonNullValueClassSaver$18.$restore.invoke(obj30) : null;
                hyphens.getClass();
                int i13 = hyphens.value;
                Object obj31 = list7.get(8);
                WorkLauncherImpl workLauncherImpl = TextPainterKt.TextMotionSaver;
                if (Intrinsics.areEqual(obj31, bool3) || obj31 == null) {
                    i = i9;
                    i2 = i10;
                    i3 = i13;
                    i4 = i12;
                    j = j2;
                    textMotion = null;
                } else {
                    i = i9;
                    i2 = i10;
                    i3 = i13;
                    i4 = i12;
                    j = j2;
                    textMotion = (TextMotion) ((Function1) workLauncherImpl.workTaskExecutor).invoke(obj31);
                }
                return new ParagraphStyle(i, i2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, i4, i3, textMotion);
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj32 = list8.get(0);
                int i14 = Color.$r8$clinit;
                Boolean bool4 = Boolean.FALSE;
                Intrinsics.areEqual(obj32, bool4);
                Color color = obj32 != null ? obj32.equals(bool4) ? new Color(Color.Unspecified) : new Color(ColorKt.Color(((Integer) obj32).intValue())) : null;
                color.getClass();
                long j3 = color.value;
                Object obj33 = list8.get(1);
                TextUnitType[] textUnitTypeArr2 = TextUnit.TextUnitTypes;
                Function1 function1 = SaversKt.TextUnitSaver.$restore;
                Intrinsics.areEqual(obj33, bool4);
                TextUnit textUnit2 = obj33 != null ? (TextUnit) function1.invoke(obj33) : null;
                textUnit2.getClass();
                long j4 = textUnit2.packedValue;
                Object obj34 = list8.get(2);
                FontWeight fontWeight = FontWeight.W400;
                FontWeight fontWeight2 = (Intrinsics.areEqual(obj34, bool4) || obj34 == null) ? null : (FontWeight) ((Function1) SaversKt.FontWeightSaver.workTaskExecutor).invoke(obj34);
                Object obj35 = list8.get(3);
                FontStyle fontStyle = (Intrinsics.areEqual(obj35, bool4) || obj35 == null) ? null : (FontStyle) ((Function1) SaversKt.FontStyleSaver.workTaskExecutor).invoke(obj35);
                Object obj36 = list8.get(4);
                FontSynthesis fontSynthesis = (Intrinsics.areEqual(obj36, bool4) || obj36 == null) ? null : (FontSynthesis) ((Function1) SaversKt.FontSynthesisSaver.workTaskExecutor).invoke(obj36);
                Object obj37 = list8.get(6);
                String str6 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list8.get(7);
                Intrinsics.areEqual(obj38, bool4);
                TextUnit textUnit3 = obj38 != null ? (TextUnit) function1.invoke(obj38) : null;
                textUnit3.getClass();
                long j5 = textUnit3.packedValue;
                Object obj39 = list8.get(8);
                BaselineShift baselineShift = (Intrinsics.areEqual(obj39, bool4) || obj39 == null) ? null : (BaselineShift) ((Function1) SaversKt.BaselineShiftSaver.workTaskExecutor).invoke(obj39);
                Object obj40 = list8.get(9);
                TextGeometricTransform textGeometricTransform = (Intrinsics.areEqual(obj40, bool4) || obj40 == null) ? null : (TextGeometricTransform) ((Function1) SaversKt.TextGeometricTransformSaver.workTaskExecutor).invoke(obj40);
                Object obj41 = list8.get(10);
                LocaleList localeList = LocaleList.Empty;
                LocaleList localeList2 = (Intrinsics.areEqual(obj41, bool4) || obj41 == null) ? null : (LocaleList) ((Function1) SaversKt.LocaleListSaver.workTaskExecutor).invoke(obj41);
                Object obj42 = list8.get(11);
                Intrinsics.areEqual(obj42, bool4);
                Color color2 = obj42 != null ? obj42.equals(bool4) ? new Color(Color.Unspecified) : new Color(ColorKt.Color(((Integer) obj42).intValue())) : null;
                color2.getClass();
                long j6 = color2.value;
                Object obj43 = list8.get(12);
                TextDecoration textDecoration = (Intrinsics.areEqual(obj43, bool4) || obj43 == null) ? null : (TextDecoration) ((Function1) SaversKt.TextDecorationSaver.workTaskExecutor).invoke(obj43);
                Object obj44 = list8.get(13);
                Shadow shadow = Shadow.None;
                return new SpanStyle(j3, j4, fontWeight2, fontStyle, fontSynthesis, (FontFamily) null, str6, j5, baselineShift, textGeometricTransform, localeList2, j6, textDecoration, (Intrinsics.areEqual(obj44, bool4) || obj44 == null) ? null : (Shadow) ((Function1) SaversKt.ShadowSaver.workTaskExecutor).invoke(obj44), 49184);
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                WorkLauncherImpl workLauncherImpl2 = SaversKt.AnnotatedStringSaver;
                Boolean bool5 = Boolean.FALSE;
                AnnotatedString annotatedString = (Intrinsics.areEqual(obj45, bool5) || obj45 == null) ? null : (AnnotatedString) ((Function1) workLauncherImpl2.workTaskExecutor).invoke(obj45);
                annotatedString.getClass();
                Object obj46 = list9.get(1);
                int i15 = TextRange.$r8$clinit;
                TextRange textRange = (Intrinsics.areEqual(obj46, bool5) || obj46 == null) ? null : (TextRange) ((Function1) SaversKt.TextRangeSaver.workTaskExecutor).invoke(obj46);
                textRange.getClass();
                return new TextFieldValue(annotatedString, textRange.packedValue, (TextRange) null);
            case 17:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                sQLiteStatement2.getClass();
                SetBuilder setBuilder = new SetBuilder();
                while (sQLiteStatement2.step()) {
                    setBuilder.add(Integer.valueOf((int) sQLiteStatement2.getLong(0)));
                }
                return SetsKt__SetsJVMKt.build(setBuilder);
            case 18:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (prepare.step()) {
                        arrayList2.add(prepare.getText(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 19:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                prepare = sQLiteConnection2.prepare("DELETE FROM WorkProgress");
                try {
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 20:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                prepare = sQLiteConnection3.prepare("SELECT * FROM workspec WHERE state=1");
                try {
                    int columnIndexOrThrow = SizeKt.getColumnIndexOrThrow(prepare, "id");
                    int columnIndexOrThrow2 = SizeKt.getColumnIndexOrThrow(prepare, "state");
                    int columnIndexOrThrow3 = SizeKt.getColumnIndexOrThrow(prepare, "worker_class_name");
                    int columnIndexOrThrow4 = SizeKt.getColumnIndexOrThrow(prepare, "input_merger_class_name");
                    int columnIndexOrThrow5 = SizeKt.getColumnIndexOrThrow(prepare, "input");
                    int columnIndexOrThrow6 = SizeKt.getColumnIndexOrThrow(prepare, "output");
                    int columnIndexOrThrow7 = SizeKt.getColumnIndexOrThrow(prepare, "initial_delay");
                    int columnIndexOrThrow8 = SizeKt.getColumnIndexOrThrow(prepare, "interval_duration");
                    int columnIndexOrThrow9 = SizeKt.getColumnIndexOrThrow(prepare, "flex_duration");
                    int columnIndexOrThrow10 = SizeKt.getColumnIndexOrThrow(prepare, "run_attempt_count");
                    int columnIndexOrThrow11 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_policy");
                    int columnIndexOrThrow12 = SizeKt.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
                    int columnIndexOrThrow13 = SizeKt.getColumnIndexOrThrow(prepare, "last_enqueue_time");
                    int columnIndexOrThrow14 = SizeKt.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
                    int columnIndexOrThrow15 = SizeKt.getColumnIndexOrThrow(prepare, "schedule_requested_at");
                    int columnIndexOrThrow16 = SizeKt.getColumnIndexOrThrow(prepare, "run_in_foreground");
                    int columnIndexOrThrow17 = SizeKt.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
                    int columnIndexOrThrow18 = SizeKt.getColumnIndexOrThrow(prepare, "period_count");
                    int columnIndexOrThrow19 = SizeKt.getColumnIndexOrThrow(prepare, "generation");
                    int columnIndexOrThrow20 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
                    int columnIndexOrThrow21 = SizeKt.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
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
                    ArrayList arrayList3 = new ArrayList();
                    while (prepare.step()) {
                        String text = prepare.getText(columnIndexOrThrow);
                        int i16 = columnIndexOrThrow14;
                        int i17 = columnIndexOrThrow13;
                        WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(columnIndexOrThrow2));
                        String text2 = prepare.getText(columnIndexOrThrow3);
                        String text3 = prepare.getText(columnIndexOrThrow4);
                        byte[] blob = prepare.getBlob(columnIndexOrThrow5);
                        Data data = Data.EMPTY;
                        Data fromByteArray = Strings.fromByteArray(blob);
                        Data fromByteArray2 = Strings.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                        long j7 = prepare.getLong(columnIndexOrThrow7);
                        long j8 = prepare.getLong(columnIndexOrThrow8);
                        long j9 = prepare.getLong(columnIndexOrThrow9);
                        int i18 = (int) prepare.getLong(columnIndexOrThrow10);
                        int i19 = columnIndexOrThrow2;
                        int i20 = columnIndexOrThrow3;
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                        long j10 = prepare.getLong(columnIndexOrThrow12);
                        long j11 = prepare.getLong(i17);
                        long j12 = prepare.getLong(i16);
                        int i21 = columnIndexOrThrow;
                        int i22 = columnIndexOrThrow15;
                        long j13 = prepare.getLong(i22);
                        columnIndexOrThrow15 = i22;
                        int i23 = columnIndexOrThrow16;
                        boolean z = ((int) prepare.getLong(i23)) != 0;
                        int i24 = columnIndexOrThrow17;
                        int i25 = columnIndexOrThrow4;
                        OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i24));
                        int i26 = columnIndexOrThrow18;
                        int i27 = columnIndexOrThrow5;
                        int i28 = (int) prepare.getLong(i26);
                        int i29 = columnIndexOrThrow19;
                        int i30 = (int) prepare.getLong(i29);
                        int i31 = columnIndexOrThrow20;
                        long j14 = prepare.getLong(i31);
                        int i32 = columnIndexOrThrow21;
                        int i33 = (int) prepare.getLong(i32);
                        int i34 = columnIndexOrThrow22;
                        int i35 = (int) prepare.getLong(i34);
                        int i36 = columnIndexOrThrow23;
                        String text4 = prepare.isNull(i36) ? null : prepare.getText(i36);
                        int i37 = columnIndexOrThrow24;
                        if (prepare.isNull(i37)) {
                            i5 = i33;
                            i6 = i34;
                            valueOf = null;
                        } else {
                            i5 = i33;
                            i6 = i34;
                            valueOf = Integer.valueOf((int) prepare.getLong(i37));
                        }
                        Boolean valueOf2 = valueOf != null ? Boolean.valueOf(valueOf.intValue() != 0) : null;
                        int i38 = columnIndexOrThrow25;
                        NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i38));
                        int i39 = columnIndexOrThrow26;
                        NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i39));
                        columnIndexOrThrow25 = i38;
                        columnIndexOrThrow26 = i39;
                        int i40 = columnIndexOrThrow27;
                        boolean z2 = ((int) prepare.getLong(i40)) != 0;
                        columnIndexOrThrow27 = i40;
                        int i41 = columnIndexOrThrow28;
                        boolean z3 = ((int) prepare.getLong(i41)) != 0;
                        int i42 = columnIndexOrThrow29;
                        boolean z4 = ((int) prepare.getLong(i42)) != 0;
                        columnIndexOrThrow29 = i42;
                        int i43 = columnIndexOrThrow30;
                        int i44 = columnIndexOrThrow31;
                        int i45 = columnIndexOrThrow32;
                        int i46 = columnIndexOrThrow33;
                        arrayList3.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j7, j8, j9, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i43)) != 0, prepare.getLong(i44), prepare.getLong(i45), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i46))), i18, intToBackoffPolicy, j10, j11, j12, j13, z, intToOutOfQuotaPolicy, i28, i30, j14, i5, i35, text4, valueOf2));
                        columnIndexOrThrow30 = i43;
                        columnIndexOrThrow4 = i25;
                        columnIndexOrThrow17 = i24;
                        columnIndexOrThrow19 = i29;
                        columnIndexOrThrow22 = i6;
                        columnIndexOrThrow24 = i37;
                        columnIndexOrThrow14 = i16;
                        columnIndexOrThrow33 = i46;
                        columnIndexOrThrow31 = i44;
                        columnIndexOrThrow32 = i45;
                        columnIndexOrThrow2 = i19;
                        columnIndexOrThrow16 = i23;
                        columnIndexOrThrow20 = i31;
                        columnIndexOrThrow21 = i32;
                        columnIndexOrThrow23 = i36;
                        columnIndexOrThrow = i21;
                        columnIndexOrThrow13 = i17;
                        columnIndexOrThrow3 = i20;
                        columnIndexOrThrow28 = i41;
                        columnIndexOrThrow5 = i27;
                        columnIndexOrThrow18 = i26;
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
            case 21:
                return invoke$androidx$work$impl$model$WorkSpecDao_Impl$$ExternalSyntheticLambda3(obj);
            case 22:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                prepare = sQLiteConnection4.prepare("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    boolean z5 = prepare.step() ? ((int) prepare.getLong(0)) != 0 : false;
                    prepare.close();
                    return Boolean.valueOf(z5);
                } finally {
                }
            case 23:
                return invoke$androidx$work$impl$model$WorkSpecDao_Impl$$ExternalSyntheticLambda8(obj);
            case 24:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                prepare = sQLiteConnection5.prepare("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    prepare.step();
                    int totalChangedRows = DimensionKt.getTotalChangedRows(sQLiteConnection5);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 25:
                VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
                versionedFinishSetupTile.getClass();
                VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
                if (versionedFinishSetupTile$Payload$V1 == null) {
                    versionedFinishSetupTile$Payload$V1 = null;
                }
                FinishSetupTileV1 value = versionedFinishSetupTile$Payload$V1 != null ? versionedFinishSetupTile$Payload$V1.getValue() : null;
                return Long.valueOf(value != null ? Intrinsics.areEqual(value.is_badged, Boolean.TRUE) : false ? 1L : 0L);
            case 26:
                obj.getClass();
                canBeSavedToBundle = MoleculePresenterStateRegistryKt.canBeSavedToBundle(obj);
                return Boolean.valueOf(canBeSavedToBundle);
            case 27:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("analytics_message");
                return Unit.INSTANCE;
            case 28:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("analytics_message");
                return Unit.INSTANCE;
            default:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("analytics_message");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TransactorKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
