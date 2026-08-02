package app.cash.local.views.composeuiview;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.semantics.Role;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalAddBrandsViewKt$$ExternalSyntheticLambda14 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ LocalAddBrandsViewKt$$ExternalSyntheticLambda14(int i, long j, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier alpha = AlphaKt.alpha(Modifier.Companion.$$INSTANCE, booleanValue ? 1.0f : 0.4f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    Role role = new Role(1);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Trace.m1191Iconww6aTOc(booleanValue ? Icons.CheckFill24 : Icons.AddFill24, Room.stringResource(gapComposer, booleanValue ? R.string.local_views_remove : R.string.local_views_add), SelectableKt.m336toggleableO2vRcR0(alpha, booleanValue, mutableInteractionSourceImpl, null, true, role, (Function1) rememberedValue2), this.f$1, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    long j = this.f$1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(668412663, new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(j, 1), gapComposer2);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BrandSheetViewKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue3, null, Expect_jvmKt.rememberComposableLambda(-1404299244, new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(j, 2), gapComposer2), null, false, null, null, gapComposer2, 3078, 500);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
