package app.cash.local.views.sheet;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class EducationalSheetKt$EducationalTiledHeroImage$1$1$1 implements Function1 {
    public static final EducationalSheetKt$EducationalTiledHeroImage$1$1$1 INSTANCE = new EducationalSheetKt$EducationalTiledHeroImage$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainScope = (ConstrainScope) obj;
        constrainScope.getClass();
        Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
        ConstrainedLayoutReference constrainedLayoutReference = constrainScope.parent;
        Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
        constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
        constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
        return Unit.INSTANCE;
    }
}
