package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import dev.chrisbanes.haze.HazeState;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidMenu_androidKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ int f$8;

    public /* synthetic */ AndroidMenu_androidKt$$ExternalSyntheticLambda2(Modifier modifier, InstrumentIcon.RemoteIcon remoteIcon, RoundedCornerShape roundedCornerShape, HazeState hazeState, long j, boolean z, Function1 function1, int i) {
        this.f$2 = modifier;
        this.f$1 = remoteIcon;
        this.f$4 = roundedCornerShape;
        this.f$5 = hazeState;
        this.f$3 = j;
        this.f$0 = z;
        this.f$6 = function1;
        this.f$8 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function function = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1572913);
                AndroidMenu_androidKt.m460DropdownMenu4kj_NE(this.f$0, (Function0) obj5, this.f$2, this.f$3, (ScrollState) obj4, (PopupProperties) obj3, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$8 | 1);
                CardArtImageKt.m3577RemoteCardArtFHprtrg(this.f$2, (InstrumentIcon.RemoteIcon) obj5, (RoundedCornerShape) obj4, (HazeState) obj3, this.f$3, this.f$0, (Function1) function, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AndroidMenu_androidKt$$ExternalSyntheticLambda2(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$4 = scrollState;
        this.f$5 = popupProperties;
        this.f$6 = composableLambdaImpl;
        this.f$8 = i2;
    }
}
