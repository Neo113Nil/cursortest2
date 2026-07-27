package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishKtorViewModel;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVVMCoroutine;
import kotlin.text.CatchingFishRobolectricHilt;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] CatchingFishStripeAPI = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public ImageView.ScaleType CatchingFishAnimation;
    public Integer CatchingFishDataStoreIntent;
    public boolean CatchingFishJUnitRealm;
    public Boolean CatchingFishMVVMAppCompat;
    public boolean CatchingFishStateFlow;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishDaggerHiltFAB, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (CatchingFishCameraXIntent.hasValue(2)) {
            setNavigationIconTint(CatchingFishCameraXIntent.getColor(2, -1));
        }
        this.CatchingFishStateFlow = CatchingFishCameraXIntent.getBoolean(4, false);
        this.CatchingFishJUnitRealm = CatchingFishCameraXIntent.getBoolean(3, false);
        int i = CatchingFishCameraXIntent.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = CatchingFishStripeAPI;
            if (i < scaleTypeArr.length) {
                this.CatchingFishAnimation = scaleTypeArr[i];
            }
        }
        if (CatchingFishCameraXIntent.hasValue(0)) {
            this.CatchingFishMVVMAppCompat = Boolean.valueOf(CatchingFishCameraXIntent.getBoolean(0, false));
        }
        CatchingFishCameraXIntent.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : CatchingFishLayoutRoomFAB.CatchingFishCardViewView(background);
        if (valueOf != null) {
            CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL();
            catchingFishContextGraphQL.CatchingFishUnitTesting(valueOf);
            catchingFishContextGraphQL.CatchingFishCloudMessaging(context2);
            catchingFishContextGraphQL.CatchingFishOkHttp(getElevation());
            setBackground(catchingFishContextGraphQL);
        }
    }

    public final void CatchingFishCoroutineFlow(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.CatchingFishAnimation;
    }

    public Integer getNavigationIconTint() {
        return this.CatchingFishDataStoreIntent;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof CatchingFishContextGraphQL) {
            CatchingFishKtorViewModel.CatchingFishCardViewRealm(this, (CatchingFishContextGraphQL) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        CatchingFishMVVMCoroutine catchingFishMVVMCoroutine = CatchingFishRobolectricHilt.CatchingFish;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.CatchingFishStateFlow || this.CatchingFishJUnitRealm) {
            ArrayList CatchingFishPayPal = CatchingFishRobolectricHilt.CatchingFishPayPal(this, getTitle());
            TextView textView = CatchingFishPayPal.isEmpty() ? null : (TextView) Collections.min(CatchingFishPayPal, catchingFishMVVMCoroutine);
            ArrayList CatchingFishPayPal2 = CatchingFishRobolectricHilt.CatchingFishPayPal(this, getSubtitle());
            TextView textView2 = CatchingFishPayPal2.isEmpty() ? null : (TextView) Collections.max(CatchingFishPayPal2, catchingFishMVVMCoroutine);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.CatchingFishStateFlow && textView != null) {
                    CatchingFishCoroutineFlow(textView, pair);
                }
                if (this.CatchingFishJUnitRealm && textView2 != null) {
                    CatchingFishCoroutineFlow(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.CatchingFishMVVMAppCompat;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.CatchingFishAnimation;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof CatchingFishContextGraphQL) {
            ((CatchingFishContextGraphQL) background).CatchingFishOkHttp(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.CatchingFishMVVMAppCompat;
        if (bool == null || bool.booleanValue() != z) {
            this.CatchingFishMVVMAppCompat = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.CatchingFishAnimation != scaleType) {
            this.CatchingFishAnimation = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.CatchingFishDataStoreIntent != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.CatchingFishDataStoreIntent.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.CatchingFishDataStoreIntent = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.CatchingFishJUnitRealm != z) {
            this.CatchingFishJUnitRealm = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.CatchingFishStateFlow != z) {
            this.CatchingFishStateFlow = z;
            requestLayout();
        }
    }
}
