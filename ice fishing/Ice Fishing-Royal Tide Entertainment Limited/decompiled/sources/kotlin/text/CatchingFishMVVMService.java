package kotlin.text;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class CatchingFishMVVMService extends CatchingFishContextGraphQL {
    public static final /* synthetic */ int CatchingFishDagger = 0;
    public CatchingFishJUnitAndroidX CatchingFishEspressoMockk;

    public final void CatchingFishJetpackCompose(float f, float f2, float f3, float f4) {
        RectF rectF = this.CatchingFishEspressoMockk.CatchingFishNavigation;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // kotlin.text.CatchingFishContextGraphQL
    public final void CatchingFishWorkManager(Canvas canvas) {
        if (this.CatchingFishEspressoMockk.CatchingFishNavigation.isEmpty()) {
            super.CatchingFishWorkManager(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.CatchingFishEspressoMockk.CatchingFishNavigation);
        } else {
            canvas.clipRect(this.CatchingFishEspressoMockk.CatchingFishNavigation, Region.Op.DIFFERENCE);
        }
        super.CatchingFishWorkManager(canvas);
        canvas.restore();
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.CatchingFishEspressoMockk = new CatchingFishJUnitAndroidX(this.CatchingFishEspressoMockk);
        return this;
    }
}
