package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.room.util.RelationUtil;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class IconKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ IconKt$$ExternalSyntheticLambda1(Modifier modifier, KeypadViewModel keypadViewModel, TextStyle textStyle, long j, int i, int i2) {
        this.$r8$classId = 2;
        this.f$2 = modifier;
        this.f$0 = keypadViewModel;
        this.f$1 = textStyle;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                IconKt.m492Iconww6aTOc((Painter) this.f$0, (String) this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) this.f$0, (Function1) this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                RelationUtil.m1189KeypadViewww6aTOc(this.f$2, (KeypadViewModel) this.f$0, (TextStyle) this.f$1, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ IconKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Modifier modifier, long j, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
    }
}
