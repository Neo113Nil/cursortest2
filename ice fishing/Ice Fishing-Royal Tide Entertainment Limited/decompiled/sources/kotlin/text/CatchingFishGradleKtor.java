package kotlin.text;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishGradleKtor extends View {
    public boolean CatchingFishReduxKtor;

    public CatchingFishGradleKtor(Context context) {
        super(context);
        this.CatchingFishReduxKtor = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.CatchingFishReduxKtor = z;
    }

    public void setGuidelineBegin(int i) {
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) getLayoutParams();
        if (this.CatchingFishReduxKtor && catchingFishGraphQLBundle.CatchingFishParcelableFAB == i) {
            return;
        }
        catchingFishGraphQLBundle.CatchingFishParcelableFAB = i;
        setLayoutParams(catchingFishGraphQLBundle);
    }

    public void setGuidelineEnd(int i) {
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) getLayoutParams();
        if (this.CatchingFishReduxKtor && catchingFishGraphQLBundle.CatchingFishSnackbar == i) {
            return;
        }
        catchingFishGraphQLBundle.CatchingFishSnackbar = i;
        setLayoutParams(catchingFishGraphQLBundle);
    }

    public void setGuidelinePercent(float f) {
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) getLayoutParams();
        if (this.CatchingFishReduxKtor && catchingFishGraphQLBundle.CatchingFishCoroutine == f) {
            return;
        }
        catchingFishGraphQLBundle.CatchingFishCoroutine = f;
        setLayoutParams(catchingFishGraphQLBundle);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
