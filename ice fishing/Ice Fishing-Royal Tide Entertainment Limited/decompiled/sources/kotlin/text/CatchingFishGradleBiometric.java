package kotlin.text;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGradleBiometric {
    public float CatchingFishCoroutine;
    public float CatchingFishDaggerWebsocket;
    public float CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public float CatchingFishSnackbar;
    public final ArrayList CatchingFishWorkManager = new ArrayList();
    public final ArrayList CatchingFishViewModelScope = new ArrayList();

    public CatchingFishGradleBiometric() {
        CatchingFishReduxKtor(0.0f, 270.0f, 0.0f);
    }

    public final void CatchingFishCoroutine(float f, float f2) {
        CatchingFishReduxFluxJUnit catchingFishReduxFluxJUnit = new CatchingFishReduxFluxJUnit();
        catchingFishReduxFluxJUnit.CatchingFishSnackbar = f;
        catchingFishReduxFluxJUnit.CatchingFishCoroutine = f2;
        this.CatchingFishWorkManager.add(catchingFishReduxFluxJUnit);
        CatchingFishJUnitToast catchingFishJUnitToast = new CatchingFishJUnitToast(catchingFishReduxFluxJUnit, this.CatchingFishSnackbar, this.CatchingFishCoroutine);
        float CatchingFishSnackbar = catchingFishJUnitToast.CatchingFishSnackbar() + 270.0f;
        float CatchingFishSnackbar2 = catchingFishJUnitToast.CatchingFishSnackbar() + 270.0f;
        CatchingFishParcelableFAB(CatchingFishSnackbar);
        this.CatchingFishViewModelScope.add(catchingFishJUnitToast);
        this.CatchingFishReduxKtor = CatchingFishSnackbar2;
        this.CatchingFishSnackbar = f;
        this.CatchingFishCoroutine = f2;
    }

    public final void CatchingFishParcelableFAB(float f) {
        float f2 = this.CatchingFishReduxKtor;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.CatchingFishSnackbar;
        float f5 = this.CatchingFishCoroutine;
        CatchingFishGradleStateFlow catchingFishGradleStateFlow = new CatchingFishGradleStateFlow(f4, f5, f4, f5);
        catchingFishGradleStateFlow.CatchingFishWorkManager = this.CatchingFishReduxKtor;
        catchingFishGradleStateFlow.CatchingFishViewModelScope = f3;
        this.CatchingFishViewModelScope.add(new CatchingFishDaggerHiltKtor(catchingFishGradleStateFlow));
        this.CatchingFishReduxKtor = f;
    }

    public final void CatchingFishReduxKtor(float f, float f2, float f3) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = 0.0f;
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
        this.CatchingFishDaggerWebsocket = (f2 + f3) % 360.0f;
        this.CatchingFishWorkManager.clear();
        this.CatchingFishViewModelScope.clear();
    }

    public final void CatchingFishSnackbar(Matrix matrix, Path path) {
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishGradleManifest) arrayList.get(i)).CatchingFishParcelableFAB(matrix, path);
        }
    }
}
