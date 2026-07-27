package kotlin.text;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishContextMockk extends CatchingFishOkHttpFAB {
    public final /* synthetic */ WeakReference CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishGradleJUnit CatchingFishReduxKtor;
    public final /* synthetic */ int CatchingFishSnackbar;

    public CatchingFishContextMockk(CatchingFishGradleJUnit catchingFishGradleJUnit, int i, int i2, WeakReference weakReference) {
        this.CatchingFishReduxKtor = catchingFishGradleJUnit;
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = weakReference;
    }

    @Override // kotlin.text.CatchingFishOkHttpFAB
    public final void CatchingFishEspressoMockk(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.CatchingFishParcelableFAB) != -1) {
            typeface = CatchingFishMockkParcelable.CatchingFishParcelableFAB(typeface, i, (this.CatchingFishSnackbar & 2) != 0);
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishReduxKtor;
        if (catchingFishGradleJUnit.CatchingFishOkHttp) {
            catchingFishGradleJUnit.CatchingFishEspressoTesting = typeface;
            TextView textView = (TextView) this.CatchingFishCoroutine.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new CatchingFishServiceIntent(textView, typeface, catchingFishGradleJUnit.CatchingFishFragmentHandler));
                } else {
                    textView.setTypeface(typeface, catchingFishGradleJUnit.CatchingFishFragmentHandler);
                }
            }
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpFAB
    public final void CatchingFishSensorManager(int i) {
    }
}
