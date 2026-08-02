package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.music.views.TrackRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DividerKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda1(float f, Modifier modifier, long j, int i) {
        this.f$1 = f;
        this.f$0 = modifier;
        this.f$2 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                MenuKt.m536HorizontalDivider9IZ8Weo(this.f$1, updateChangedFlags, this.f$2, (Composer) obj, this.f$0);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(3121);
                TrackRowKt.m3666CircularProgressMBs18nI(this.f$1, updateChangedFlags2, this.f$2, (Composer) obj, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda1(Modifier modifier, float f, long j, int i) {
        this.f$0 = modifier;
        this.f$1 = f;
        this.f$2 = j;
    }
}
