package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import coil3.size.SizeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeSelectableRow$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ SelectableRowViewModel.Action f$1;

    public /* synthetic */ ArcadeSelectableRow$$ExternalSyntheticLambda6(Function0 function0, SelectableRowViewModel.Action action, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = action;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final SelectableRowViewModel.Action action = this.f$1;
        Function0 function0 = this.f$0;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    if (function0 == null) {
                        gapComposer.startReplaceGroup(-804983825);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(2);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function0 = (Function0) rememberedValue;
                    } else {
                        gapComposer.startReplaceGroup(-857251554);
                    }
                    gapComposer.end(false);
                    SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1912721945, new Function3() { // from class: com.squareup.cash.formview.components.arcade.ArcadeSelectableRow$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = i3;
                            SelectableRowViewModel.Action action2 = action;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SelectableRowViewModel.Action.ButtonAccessory) action2).label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SelectableRowViewModel.Action.ButtonAccessory) action2).label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1572864, 62);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (function0 == null) {
                        gapComposer2.startReplaceGroup(1411467578);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda0(3);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        function0 = (Function0) rememberedValue2;
                    } else {
                        gapComposer2.startReplaceGroup(-93016461);
                    }
                    gapComposer2.end(false);
                    SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-946339426, new Function3() { // from class: com.squareup.cash.formview.components.arcade.ArcadeSelectableRow$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = i2;
                            SelectableRowViewModel.Action action2 = action;
                            switch (i4) {
                                case 0:
                                    Composer composer22 = (Composer) obj4;
                                    int intValue22 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SelectableRowViewModel.Action.ButtonAccessory) action2).label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SelectableRowViewModel.Action.ButtonAccessory) action2).label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1572864, 62);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
