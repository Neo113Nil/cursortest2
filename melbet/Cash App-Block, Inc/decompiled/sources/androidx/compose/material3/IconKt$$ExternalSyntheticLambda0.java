package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class IconKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ int f$5;

    public /* synthetic */ IconKt$$ExternalSyntheticLambda0(Painter painter, String str, Modifier modifier, long j, int i) {
        this.f$0 = painter;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                IconKt.m534Iconww6aTOc((ImageVector) obj3, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags, this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                IconKt.m533Iconww6aTOc((Painter) obj3, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ IconKt$$ExternalSyntheticLambda0(ImageVector imageVector, String str, Modifier modifier, long j, int i, int i2) {
        this.f$0 = imageVector;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$5 = i2;
    }
}
