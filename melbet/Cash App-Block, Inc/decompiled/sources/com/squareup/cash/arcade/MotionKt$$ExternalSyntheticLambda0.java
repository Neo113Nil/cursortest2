package com.squareup.cash.arcade;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.treehouse.LegacyAmountPickerBinding;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class MotionKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new Motion();
            case 1:
                throw new IllegalStateException("No local MarkdownColors");
            case 2:
                throw new IllegalStateException("No local MarkdownTypography");
            case 3:
                throw new IllegalStateException("No local Padding");
            case 4:
                throw new IllegalStateException("AddressSearcher not provided");
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return RealUuidGenerator.generate().toString();
            case 9:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 10:
                return Updater.mutableStateOf$default(new InputFieldText.Simple(""));
            case 11:
                return Updater.mutableStateOf$default(Boolean.TRUE);
            case 12:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 13:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 14:
                return Unit.INSTANCE;
            case 15:
                return new SnapshotStateMap();
            case 16:
                return Unit.INSTANCE;
            case 17:
                return new LazyListState(0, 0);
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Integer.MAX_VALUE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return new DropdownState(false);
            case 27:
                return Unit.INSTANCE;
            case 28:
                int i = LegacyAmountPickerBinding.$r8$clinit;
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MotionKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
