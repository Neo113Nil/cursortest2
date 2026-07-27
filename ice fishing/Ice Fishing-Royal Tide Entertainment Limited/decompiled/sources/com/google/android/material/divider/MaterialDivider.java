package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public int CatchingFishDaggerWebsocket;
    public final CatchingFishContextGraphQL CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.CatchingFishReduxKtor = new CatchingFishContextGraphQL();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishStateLiveData, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.CatchingFishDaggerWebsocket = CatchingFishCameraXIntent.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.CatchingFishViewModelScope = CatchingFishCameraXIntent.getDimensionPixelOffset(2, 0);
        this.CatchingFishViewModelFAB = CatchingFishCameraXIntent.getDimensionPixelOffset(1, 0);
        setDividerColor(CatchingFishDaggerBiometric.CatchingFishNavigation(context2, CatchingFishCameraXIntent, 0).getDefaultColor());
        CatchingFishCameraXIntent.recycle();
    }

    public int getDividerColor() {
        return this.CatchingFishWorkManager;
    }

    public int getDividerInsetEnd() {
        return this.CatchingFishViewModelFAB;
    }

    public int getDividerInsetStart() {
        return this.CatchingFishViewModelScope;
    }

    public int getDividerThickness() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.CatchingFishViewModelFAB : this.CatchingFishViewModelScope;
        if (z) {
            width = getWidth();
            i = this.CatchingFishViewModelScope;
        } else {
            width = getWidth();
            i = this.CatchingFishViewModelFAB;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishReduxKtor;
        catchingFishContextGraphQL.setBounds(i2, 0, i3, bottom);
        catchingFishContextGraphQL.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.CatchingFishDaggerWebsocket;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.CatchingFishWorkManager != i) {
            this.CatchingFishWorkManager = i;
            this.CatchingFishReduxKtor.CatchingFishUnitTesting(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.CatchingFishViewModelFAB = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.CatchingFishViewModelScope = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.CatchingFishDaggerWebsocket != i) {
            this.CatchingFishDaggerWebsocket = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
