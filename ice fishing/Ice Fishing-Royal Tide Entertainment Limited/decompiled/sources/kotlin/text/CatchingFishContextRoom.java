package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public abstract class CatchingFishContextRoom extends ConstraintLayout {
    public int CatchingFishCoroutineFlow;
    public final CatchingFishContextGraphQL CatchingFishDaggerHiltFAB;
    public final CatchingFishMVPLayout CatchingFishJetpackCompose;

    public CatchingFishContextRoom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL();
        this.CatchingFishDaggerHiltFAB = catchingFishContextGraphQL;
        CatchingFishGsonRobolectric catchingFishGsonRobolectric = new CatchingFishGsonRobolectric(0.5f);
        CatchingFishKtorMVI CatchingFishWorkManager = catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishWorkManager();
        CatchingFishWorkManager.CatchingFishDaggerWebsocket = catchingFishGsonRobolectric;
        CatchingFishWorkManager.CatchingFishWorkManager = catchingFishGsonRobolectric;
        CatchingFishWorkManager.CatchingFishViewModelScope = catchingFishGsonRobolectric;
        CatchingFishWorkManager.CatchingFishViewModelFAB = catchingFishGsonRobolectric;
        catchingFishContextGraphQL.setShapeAppearanceModel(CatchingFishWorkManager.CatchingFishParcelableFAB());
        this.CatchingFishDaggerHiltFAB.CatchingFishUnitTesting(ColorStateList.valueOf(-1));
        setBackground(this.CatchingFishDaggerHiltFAB);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishSpannableWidget, R.attr.materialClockStyle, 0);
        this.CatchingFishCoroutineFlow = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.CatchingFishJetpackCompose = new CatchingFishMVPLayout(15, this);
        obtainStyledAttributes.recycle();
    }

    public abstract void CatchingFishOkHttp();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            CatchingFishMVPLayout catchingFishMVPLayout = this.CatchingFishJetpackCompose;
            handler.removeCallbacks(catchingFishMVPLayout);
            handler.post(catchingFishMVPLayout);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        CatchingFishOkHttp();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            CatchingFishMVPLayout catchingFishMVPLayout = this.CatchingFishJetpackCompose;
            handler.removeCallbacks(catchingFishMVPLayout);
            handler.post(catchingFishMVPLayout);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.CatchingFishDaggerHiltFAB.CatchingFishUnitTesting(ColorStateList.valueOf(i));
    }
}
