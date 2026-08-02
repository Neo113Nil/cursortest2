package com.squareup.cash.db2.entities;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults$AllDates$1;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.db2.InstrumentQueries;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;
import okio.internal.ResourceFileSystem;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncEntityQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ SyncEntityQueries$$ExternalSyntheticLambda3(String str, InstrumentQueries instrumentQueries, int i, byte[] bArr, Integer num, Long l, int i2) {
        this.f$0 = str;
        this.f$1 = instrumentQueries;
        this.f$2 = i;
        this.f$3 = bArr;
        this.f$4 = num;
        this.f$5 = l;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Integer num = (Integer) obj3;
                Long l = (Long) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj6);
                ((ResourceFileSystem.Companion) ((InstrumentQueries) obj5).instrumentAdapter).getClass();
                androidStatement.bindLong(1, Long.valueOf(this.f$2));
                androidStatement.bindBytes(2, (byte[]) obj4);
                androidStatement.bindLong(3, num != null ? Long.valueOf(num.intValue()) : null);
                androidStatement.bindLong(4, l);
                androidStatement.bindLong(5, Long.valueOf(this.f$6));
                break;
            default:
                final IntRange intRange = (IntRange) obj6;
                final CalendarModelImpl calendarModelImpl = (CalendarModelImpl) obj5;
                final Function1 function1 = (Function1) obj4;
                final DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1 = (DatePickerDefaults$AllDates$1) obj3;
                final DatePickerColors datePickerColors = (DatePickerColors) obj2;
                int count = CollectionsKt.count(intRange);
                final int i2 = this.f$2;
                final int i3 = this.f$6;
                LazyGridIntervalContent.items$default((LazyGridIntervalContent) obj, count, null, null, new ComposableLambdaImpl(new Function4() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int intValue = ((Number) obj8).intValue();
                        Composer composer = (Composer) obj9;
                        int intValue2 = ((Number) obj10).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                            int i4 = intValue + IntRange.this.first;
                            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i4, calendarModelImpl.locale);
                            Modifier m282requiredSizeVpY3zN4 = SizeKt.m282requiredSizeVpY3zN4(Modifier.Companion.$$INSTANCE, DatePickerModalTokens.SelectionYearContainerWidth, DatePickerModalTokens.SelectionYearContainerHeight);
                            boolean z = i4 == i2;
                            boolean z2 = i4 == i3;
                            Function1 function12 = function1;
                            boolean changed = gapComposer.changed(function12) | gapComposer.changed(i4);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i4, 1, function12);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            datePickerDefaults$AllDates$1.getClass();
                            DatePickerKt.Year(localString$default, m282requiredSizeVpY3zN4, z, z2, (Function0) rememberedValue, String.format(Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_picker_navigate_to_year_description), Arrays.copyOf(new Object[]{localString$default}, 1)), datePickerColors, gapComposer, 48);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 674613074), 14);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SyncEntityQueries$$ExternalSyntheticLambda3(IntRange intRange, CalendarModelImpl calendarModelImpl, int i, int i2, Function1 function1, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors) {
        this.f$0 = intRange;
        this.f$1 = calendarModelImpl;
        this.f$2 = i;
        this.f$6 = i2;
        this.f$3 = function1;
        this.f$4 = datePickerDefaults$AllDates$1;
        this.f$5 = datePickerColors;
    }
}
