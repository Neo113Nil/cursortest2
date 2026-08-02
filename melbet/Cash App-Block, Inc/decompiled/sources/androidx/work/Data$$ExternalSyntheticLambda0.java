package androidx.work;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import app.cash.arcade.values.internal.IntRangeSerializer;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardState;
import app.cash.local.presenters.brand.checkout.CheckoutTipState;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes3.dex */
public final /* synthetic */ class Data$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Data$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteStatement sQLiteStatement;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        switch (this.$r8$classId) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                m108m.append(value);
                return m108m.toString();
            case 1:
                NavDestination navDestination = (NavDestination) obj;
                navDestination.getClass();
                NavGraph navGraph = navDestination.parent;
                if (navGraph == null || navGraph.impl.state != navDestination.impl.id) {
                    return null;
                }
                return navGraph;
            case 2:
                NavDestination navDestination2 = (NavDestination) obj;
                navDestination2.getClass();
                return Integer.valueOf(navDestination2.impl.id);
            case 3:
                Function0 function0 = (Function0) obj;
                function0.getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 4:
                WindowMetricsCalculator windowMetricsCalculator = (WindowMetricsCalculator) obj;
                windowMetricsCalculator.getClass();
                return windowMetricsCalculator;
            case 5:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
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
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                        long j4 = prepare.getLong(columnIndexOrThrow12);
                        long j5 = prepare.getLong(columnIndexOrThrow13);
                        long j6 = prepare.getLong(i3);
                        int i5 = columnIndexOrThrow15;
                        long j7 = prepare.getLong(i5);
                        int i6 = columnIndexOrThrow;
                        int i7 = columnIndexOrThrow13;
                        int i8 = columnIndexOrThrow16;
                        int i9 = columnIndexOrThrow2;
                        boolean z = ((int) prepare.getLong(i8)) != 0;
                        int i10 = columnIndexOrThrow17;
                        OutOfQuotaPolicy intToOutOfQuotaPolicy = TransactorKt.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                        int i11 = columnIndexOrThrow18;
                        int i12 = (int) prepare.getLong(i11);
                        int i13 = columnIndexOrThrow19;
                        int i14 = (int) prepare.getLong(i13);
                        int i15 = columnIndexOrThrow20;
                        long j8 = prepare.getLong(i15);
                        int i16 = columnIndexOrThrow21;
                        int i17 = (int) prepare.getLong(i16);
                        int i18 = columnIndexOrThrow22;
                        int i19 = (int) prepare.getLong(i18);
                        int i20 = columnIndexOrThrow23;
                        String text4 = prepare.isNull(i20) ? null : prepare.getText(i20);
                        int i21 = columnIndexOrThrow24;
                        if (prepare.isNull(i21)) {
                            i = i17;
                            i2 = i18;
                            valueOf = null;
                        } else {
                            i = i17;
                            i2 = i18;
                            valueOf = Integer.valueOf((int) prepare.getLong(i21));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i22 = columnIndexOrThrow25;
                        NetworkType intToNetworkType = TransactorKt.intToNetworkType((int) prepare.getLong(i22));
                        int i23 = columnIndexOrThrow26;
                        NetworkRequestCompat networkRequest$work_runtime_release = TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i23));
                        columnIndexOrThrow25 = i22;
                        columnIndexOrThrow26 = i23;
                        int i24 = columnIndexOrThrow27;
                        boolean z2 = ((int) prepare.getLong(i24)) != 0;
                        columnIndexOrThrow27 = i24;
                        int i25 = columnIndexOrThrow28;
                        boolean z3 = ((int) prepare.getLong(i25)) != 0;
                        int i26 = columnIndexOrThrow29;
                        boolean z4 = ((int) prepare.getLong(i26)) != 0;
                        columnIndexOrThrow29 = i26;
                        int i27 = columnIndexOrThrow30;
                        int i28 = columnIndexOrThrow31;
                        int i29 = columnIndexOrThrow32;
                        int i30 = columnIndexOrThrow33;
                        columnIndexOrThrow33 = i30;
                        sQLiteStatement = prepare;
                        try {
                            arrayList2.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i27)) != 0, prepare.getLong(i28), prepare.getLong(i29), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(i30))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i12, i14, j8, i, i19, text4, bool));
                            arrayList = arrayList2;
                            prepare = sQLiteStatement;
                            columnIndexOrThrow31 = i28;
                            columnIndexOrThrow2 = i9;
                            columnIndexOrThrow16 = i8;
                            columnIndexOrThrow20 = i15;
                            columnIndexOrThrow21 = i16;
                            columnIndexOrThrow23 = i20;
                            columnIndexOrThrow28 = i25;
                            columnIndexOrThrow30 = i27;
                            columnIndexOrThrow14 = i3;
                            columnIndexOrThrow17 = i10;
                            columnIndexOrThrow19 = i13;
                            columnIndexOrThrow22 = i2;
                            columnIndexOrThrow24 = i21;
                            columnIndexOrThrow = i6;
                            columnIndexOrThrow32 = i29;
                            columnIndexOrThrow15 = i5;
                            columnIndexOrThrow13 = i7;
                            columnIndexOrThrow18 = i11;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteStatement.close();
                            throw th;
                        }
                    }
                    SQLiteStatement sQLiteStatement2 = prepare;
                    ArrayList arrayList3 = arrayList;
                    sQLiteStatement2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteStatement = prepare;
                }
            case 6:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement prepare2 = sQLiteConnection2.prepare("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i31 = prepare2.step() ? (int) prepare2.getLong(0) : 0;
                    prepare2.close();
                    return Integer.valueOf(i31);
                } catch (Throwable th3) {
                    prepare2.close();
                    throw th3;
                }
            case 7:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                KSerializer kSerializer = IntRangeSerializer.intSerializer;
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("start", descriptor, emptyList, false);
                classSerialDescriptorBuilder.element("endInclusive", kSerializer.getDescriptor(), emptyList, false);
                return Unit.INSTANCE;
            case 8:
                ((TabToolbarInternalViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((BuyerIntentScope) obj).getClass();
                return new AtomicLong();
            case 10:
                return ((CartEntry.ModifierSelection) obj).selectionToken;
            case 11:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("local_brand_collection");
                return Unit.INSTANCE;
            case 12:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("local_cash_detail_content");
                return Unit.INSTANCE;
            case 13:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("local_fulfillment_configuration");
                return Unit.INSTANCE;
            case 14:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("local_fulfillment_configuration");
                return Unit.INSTANCE;
            case 15:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("local_fulfillment_configuration");
                return Unit.INSTANCE;
            case 16:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("local_market_screen");
                return Unit.INSTANCE;
            case 17:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("local_tab_content");
                return Unit.INSTANCE;
            case 18:
                List list = (List) obj;
                list.getClass();
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(list);
                return snapshotStateList;
            case 19:
                List list2 = (List) obj;
                list2.getClass();
                String str2 = (String) list2.get(0);
                CharSequence charSequence = (CharSequence) list2.get(1);
                return new CheckoutGiftCardState(str2, (String) (charSequence.length() == 0 ? null : charSequence), Boolean.parseBoolean((String) list2.get(2)));
            case 20:
                List list3 = (List) obj;
                list3.getClass();
                Object obj2 = list3.get(2);
                obj2.getClass();
                LocalMoney localMoney = (LocalMoney) obj2;
                Object obj3 = list3.get(3);
                obj3.getClass();
                if (!((Boolean) obj3).booleanValue()) {
                    localMoney = null;
                }
                Object obj4 = list3.get(4);
                obj4.getClass();
                Object obj5 = list3.get(5);
                obj5.getClass();
                CheckoutTipState checkoutTipState = new CheckoutTipState(localMoney, (ArrayList) obj4, ((Boolean) obj5).booleanValue());
                Object obj6 = list3.get(0);
                obj6.getClass();
                Integer num = (Integer) obj6;
                Object obj7 = list3.get(1);
                obj7.getClass();
                if (!((Boolean) obj7).booleanValue()) {
                    num = null;
                }
                checkoutTipState.selectedTipIndex$delegate.setValue(num);
                Object obj8 = list3.get(6);
                obj8.getClass();
                String str3 = (String) obj8;
                Object obj9 = list3.get(7);
                obj9.getClass();
                if (!((Boolean) obj9).booleanValue()) {
                    str3 = null;
                }
                checkoutTipState.overrideTip$delegate.setValue(str3);
                Object obj10 = list3.get(8);
                obj10.getClass();
                String str4 = (String) obj10;
                Object obj11 = list3.get(9);
                obj11.getClass();
                checkoutTipState.currentTipLocalCashEarningsLabel$delegate.setValue(((Boolean) obj11).booleanValue() ? str4 : null);
                Object obj12 = list3.get(10);
                obj12.getClass();
                checkoutTipState.currentTip$delegate.setValue((String) obj12);
                return checkoutTipState;
            case 21:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj;
                featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options.enabled());
            case 22:
                return ((CartEntry.ModifierSelection) obj).selectionToken;
            case 23:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options2 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj;
                featureFlag$EnabledDisabledFeatureFlag$Options2.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options2.enabled());
            case 24:
                MenuItemModifierList menuItemModifierList = (MenuItemModifierList) obj;
                menuItemModifierList.getClass();
                return menuItemModifierList.inputType;
            case 25:
                MenuItemModifierList.InputType.SelectFromList selectFromList = (MenuItemModifierList.InputType.SelectFromList) obj;
                selectFromList.getClass();
                return selectFromList.modifiers;
            case 26:
                Modifier modifier = (Modifier) obj;
                modifier.getClass();
                return Boolean.valueOf((modifier.availability == LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_SOLD_OUT || modifier.price == null) ? false : true);
            case 27:
                return ((BrandSpot) obj).brandToken;
            case 28:
                CartEntry.ModifierFreeEntry modifierFreeEntry = (CartEntry.ModifierFreeEntry) obj;
                modifierFreeEntry.getClass();
                return modifierFreeEntry.listToken;
            default:
                CartEntry.ModifierFreeEntry modifierFreeEntry2 = (CartEntry.ModifierFreeEntry) obj;
                modifierFreeEntry2.getClass();
                return modifierFreeEntry2.input;
        }
    }
}
