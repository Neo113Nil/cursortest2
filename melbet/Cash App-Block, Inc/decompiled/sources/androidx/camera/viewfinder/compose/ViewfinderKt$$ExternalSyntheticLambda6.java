package androidx.camera.viewfinder.compose;

import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalStackedImageStyle;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewfinderKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda6(int i, int i2, TransformationInfo transformationInfo, ImplementationMode implementationMode, Modifier modifier, Function1 function1, int i3) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = transformationInfo;
        this.f$3 = implementationMode;
        this.f$4 = modifier;
        this.f$5 = function1;
        this.f$6 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj3 = this.f$3;
        Object obj4 = this.f$5;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$6 | 1);
                int i3 = this.f$0;
                int i4 = this.f$1;
                Modifier modifier = this.f$4;
                ViewfinderKt.TransformedSurface(i3, i4, (TransformationInfo) obj5, (ImplementationMode) obj3, modifier, (Function1) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier2 = this.f$4;
                int i5 = this.f$0;
                LocalMapKt.LocalStackedImage(modifier2, (List) obj5, i5, (LocalStackedImageStyle) obj3, (ContentScale) obj4, (Composer) obj, updateChangedFlags2, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier3 = this.f$4;
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormFields((EarnerEnrollmentBlockerViewModel.Form) obj5, (Function1) obj4, modifier3, (Modifier) obj3, this.f$0, (Composer) obj, updateChangedFlags3, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda6(Modifier modifier, List list, int i, LocalStackedImageStyle localStackedImageStyle, ContentScale contentScale, int i2, int i3) {
        this.f$4 = modifier;
        this.f$2 = list;
        this.f$0 = i;
        this.f$3 = localStackedImageStyle;
        this.f$5 = contentScale;
        this.f$1 = i2;
        this.f$6 = i3;
    }

    public /* synthetic */ ViewfinderKt$$ExternalSyntheticLambda6(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, Modifier modifier, Modifier modifier2, int i, int i2, int i3) {
        this.f$2 = form;
        this.f$5 = function1;
        this.f$4 = modifier;
        this.f$3 = modifier2;
        this.f$0 = i;
        this.f$1 = i2;
        this.f$6 = i3;
    }
}
