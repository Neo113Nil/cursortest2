package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Float f$1;
    public final /* synthetic */ Function2 f$2;

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda2(long j, Float f, Function2 function2, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = f;
        this.f$2 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        long j = this.f$0;
        Function2 function2 = this.f$2;
        Float f = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
                    long j2 = this.f$0;
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-1624601445, new TextFieldImplKt$$ExternalSyntheticLambda2(this.f$1, this.f$2, j2, 1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (f != null) {
                    gapComposer2.startReplaceGroup(1484860324);
                    Updater.CompositionLocalProvider(ContentAlphaKt.LocalContentAlpha.defaultProvidedValue$runtime(f), function2, gapComposer2, 8);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1485059902);
                    Updater.CompositionLocalProvider(ContentAlphaKt.LocalContentAlpha.defaultProvidedValue$runtime(Float.valueOf(Color.m677getAlphaimpl(j))), function2, gapComposer2, 8);
                    gapComposer2.end(false);
                }
                break;
            case 2:
                int intValue3 = num.intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ContentColorKt.LocalContentColor;
                    long j3 = this.f$0;
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j3, dynamicProvidableCompositionLocal2), Expect_jvmKt.rememberComposableLambda(-1145200538, new TextFieldImplKt$$ExternalSyntheticLambda2(this.f$1, this.f$2, j3, 3), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                int intValue4 = num.intValue();
                GapComposer gapComposer4 = (GapComposer) composer;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                } else if (f != null) {
                    gapComposer4.startReplaceGroup(-1743950354);
                    Updater.CompositionLocalProvider(ContentAlphaKt.LocalContentAlpha.defaultProvidedValue$runtime(f), function2, gapComposer4, 8);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-1743771608);
                    Updater.CompositionLocalProvider(ContentAlphaKt.LocalContentAlpha.defaultProvidedValue$runtime(Float.valueOf(Color.m677getAlphaimpl(j))), function2, gapComposer4, 8);
                    gapComposer4.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda2(Float f, Function2 function2, long j, int i) {
        this.$r8$classId = i;
        this.f$1 = f;
        this.f$2 = function2;
        this.f$0 = j;
    }
}
