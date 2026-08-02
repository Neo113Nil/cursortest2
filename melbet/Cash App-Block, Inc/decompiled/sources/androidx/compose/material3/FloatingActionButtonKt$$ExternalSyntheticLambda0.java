package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.borrow.views.LimitHubProgressSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class FloatingActionButtonKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ FloatingActionButtonKt$$ExternalSyntheticLambda0(Character ch, long j, TextStyle textStyle, long j2, Function2 function2, ColorFilter colorFilter) {
        this.f$0 = ch;
        this.f$3 = j;
        this.f$1 = textStyle;
        this.f$4 = j2;
        this.f$2 = function2;
        this.f$5 = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        Object obj4 = this.f$5;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                FloatingActionButtonKt.m530ExtendedFloatingActionButtonXz6DiA((Function0) obj6, (Modifier) obj3, (Shape) obj5, this.f$3, this.f$4, (FloatingActionButtonElevation) obj4, (Composer) obj, Updater.updateChangedFlags(12582913));
                break;
            case 1:
                Character ch = (Character) obj6;
                TextStyle textStyle = (TextStyle) obj3;
                Function2 function2 = (Function2) obj5;
                ColorFilter colorFilter = (ColorFilter) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (ch != null) {
                    gapComposer.startReplaceGroup(-756012970);
                    BadgedAvatarKt.m3410MonogramIDZO9PQ(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), this.f$3, ch.charValue(), textStyle, this.f$4, gapComposer, 6);
                    gapComposer.end(false);
                } else if (function2 == null) {
                    gapComposer.startReplaceGroup(-755646891);
                    BadgedAvatarKt.DefaultAvatar(null, colorFilter, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-755553767);
                    function2.invoke(gapComposer, 0);
                    gapComposer.end(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                LimitHubProgressSectionKt.m3427LabeledTextStackY0xEhic((String) obj6, (String) obj5, this.f$3, this.f$4, (BiasAlignment.Horizontal) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(24577));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FloatingActionButtonKt$$ExternalSyntheticLambda0(String str, String str2, long j, long j2, BiasAlignment.Horizontal horizontal, Modifier modifier, int i) {
        this.f$0 = str;
        this.f$2 = str2;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = horizontal;
        this.f$1 = modifier;
    }

    public /* synthetic */ FloatingActionButtonKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = shape;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = floatingActionButtonElevation;
    }
}
