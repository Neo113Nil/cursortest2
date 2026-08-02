package defpackage;

import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetLayout;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class b1e extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ HomeLandingBottomSheetLayout c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b1e(HomeLandingBottomSheetLayout homeLandingBottomSheetLayout, int i) {
        super(r2);
        this.b = i;
        switch (i) {
            case 1:
                Float valueOf = Float.valueOf(0.0f);
                this.c = homeLandingBottomSheetLayout;
                super(valueOf);
                break;
            case 2:
                Float valueOf2 = Float.valueOf(0.0f);
                this.c = homeLandingBottomSheetLayout;
                super(valueOf2);
                break;
            default:
                Float valueOf3 = Float.valueOf(0.0f);
                this.c = homeLandingBottomSheetLayout;
                break;
        }
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Object obj, Object obj2) {
        int i = this.b;
        s9fVar.getClass();
        switch (i) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                HomeLandingBottomSheetLayout homeLandingBottomSheetLayout = this.c;
                homeLandingBottomSheetLayout.f.setAlpha((int) (floatValue * KotlinVersion.MAX_COMPONENT_VALUE));
                homeLandingBottomSheetLayout.invalidate();
                break;
            case 1:
                float floatValue2 = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                HomeLandingBottomSheetLayout homeLandingBottomSheetLayout2 = this.c;
                homeLandingBottomSheetLayout2.f.setAlpha((int) (floatValue2 * KotlinVersion.MAX_COMPONENT_VALUE));
                homeLandingBottomSheetLayout2.invalidate();
                break;
            default:
                float floatValue3 = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                HomeLandingBottomSheetLayout homeLandingBottomSheetLayout3 = this.c;
                homeLandingBottomSheetLayout3.f.setAlpha((int) (floatValue3 * KotlinVersion.MAX_COMPONENT_VALUE));
                homeLandingBottomSheetLayout3.invalidate();
                break;
        }
    }
}
