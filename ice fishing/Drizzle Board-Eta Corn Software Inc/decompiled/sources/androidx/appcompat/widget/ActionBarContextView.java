package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;
import defpackage.CTE3lpUp;
import defpackage.NCTxEWno;
import defpackage.f7oeun2L;
import defpackage.fh0;
import defpackage.hg0;
import defpackage.m1;
import defpackage.pP9Y2m6O;
import defpackage.ra;
import defpackage.rs;
import defpackage.xg0;
import defpackage.yr;
import defpackage.yzvmSy3z;
import defpackage.z00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public boolean Ey6iv0m0;
    public final int I5GHvsYW;
    public final int KlHjfFWx;
    public final Context MdtA4re8;
    public final NCTxEWno NCTxEWno;
    public View OnDfzHZD;
    public TextView OxcuoDLp;
    public int P7K7Inc8;
    public boolean Qr9iLBAD;
    public CTE3lpUp VgvYg0wo;
    public final int amk52bBQ;
    public xg0 b2ZJblxo;
    public CharSequence eVhOlqcC;
    public boolean jb9XjC4I;
    public CharSequence k3x7lurq;
    public LinearLayout lDXGDhIF;
    public View ow5vqvCr;
    public TextView sjUBp5pO;
    public ActionMenuView wxUZMvaN;
    public View ygLcUYwZ;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.NCTxEWno = new NCTxEWno(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.MdtA4re8 = context;
        } else {
            this.MdtA4re8 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.wxUZMvaN, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : ra.Ey6iv0m0(context, resourceId));
        this.amk52bBQ = obtainStyledAttributes.getResourceId(5, 0);
        this.KlHjfFWx = obtainStyledAttributes.getResourceId(4, 0);
        this.P7K7Inc8 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.I5GHvsYW = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int P7K7Inc8(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int b2ZJblxo(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void MdtA4re8(yzvmSy3z yzvmsy3z) {
        View view = this.ow5vqvCr;
        int i = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.I5GHvsYW, (ViewGroup) this, false);
            this.ow5vqvCr = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.ow5vqvCr);
        }
        View findViewById = this.ow5vqvCr.findViewById(R.id.action_mode_close_button);
        this.OnDfzHZD = findViewById;
        findViewById.setOnClickListener(new pP9Y2m6O(i, yzvmsy3z));
        yr MdtA4re8 = yzvmsy3z.MdtA4re8();
        CTE3lpUp cTE3lpUp = this.VgvYg0wo;
        if (cTE3lpUp != null) {
            cTE3lpUp.wxUZMvaN();
            f7oeun2L f7oeun2l = cTE3lpUp.RXQxj5Oe;
            if (f7oeun2l != null && f7oeun2l.NCTxEWno()) {
                f7oeun2l.jb9XjC4I.dismiss();
            }
        }
        CTE3lpUp cTE3lpUp2 = new CTE3lpUp(getContext());
        this.VgvYg0wo = cTE3lpUp2;
        cTE3lpUp2.ygLcUYwZ = true;
        cTE3lpUp2.lDXGDhIF = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        MdtA4re8.NCTxEWno(this.VgvYg0wo, this.MdtA4re8);
        CTE3lpUp cTE3lpUp3 = this.VgvYg0wo;
        rs rsVar = cTE3lpUp3.jb9XjC4I;
        if (rsVar == null) {
            rs rsVar2 = (rs) cTE3lpUp3.VgvYg0wo.inflate(cTE3lpUp3.b2ZJblxo, (ViewGroup) this, false);
            cTE3lpUp3.jb9XjC4I = rsVar2;
            rsVar2.NCTxEWno(cTE3lpUp3.wxUZMvaN);
            cTE3lpUp3.eVhOlqcC(true);
        }
        rs rsVar3 = cTE3lpUp3.jb9XjC4I;
        if (rsVar != rsVar3) {
            ((ActionMenuView) rsVar3).setPresenter(cTE3lpUp3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) rsVar3;
        this.wxUZMvaN = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.wxUZMvaN, layoutParams);
    }

    @Override // android.view.View
    /* renamed from: Qr9iLBAD, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            xg0 xg0Var = this.b2ZJblxo;
            if (xg0Var != null) {
                xg0Var.NCTxEWno();
            }
            super.setVisibility(i);
        }
    }

    public final void VgvYg0wo() {
        removeAllViews();
        this.ygLcUYwZ = null;
        this.wxUZMvaN = null;
        this.VgvYg0wo = null;
        View view = this.OnDfzHZD;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.b2ZJblxo != null ? this.NCTxEWno.NCTxEWno : getVisibility();
    }

    public int getContentHeight() {
        return this.P7K7Inc8;
    }

    public CharSequence getSubtitle() {
        return this.k3x7lurq;
    }

    public CharSequence getTitle() {
        return this.eVhOlqcC;
    }

    public final xg0 jb9XjC4I(int i, long j) {
        xg0 xg0Var = this.b2ZJblxo;
        if (xg0Var != null) {
            xg0Var.NCTxEWno();
        }
        NCTxEWno nCTxEWno = this.NCTxEWno;
        if (i != 0) {
            xg0 qoPGr6Ce = hg0.qoPGr6Ce(this);
            qoPGr6Ce.qoPGr6Ce(0.0f);
            qoPGr6Ce.MdtA4re8(j);
            nCTxEWno.MdtA4re8.b2ZJblxo = qoPGr6Ce;
            nCTxEWno.NCTxEWno = i;
            qoPGr6Ce.wxUZMvaN(nCTxEWno);
            return qoPGr6Ce;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        xg0 qoPGr6Ce2 = hg0.qoPGr6Ce(this);
        qoPGr6Ce2.qoPGr6Ce(1.0f);
        qoPGr6Ce2.MdtA4re8(j);
        nCTxEWno.MdtA4re8.b2ZJblxo = qoPGr6Ce2;
        nCTxEWno.NCTxEWno = i;
        qoPGr6Ce2.wxUZMvaN(nCTxEWno);
        return qoPGr6Ce2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, z00.qoPGr6Ce, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        CTE3lpUp cTE3lpUp = this.VgvYg0wo;
        if (cTE3lpUp != null) {
            Configuration configuration2 = cTE3lpUp.MdtA4re8.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            cTE3lpUp.amk52bBQ = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            yr yrVar = cTE3lpUp.wxUZMvaN;
            if (yrVar != null) {
                yrVar.sjUBp5pO(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CTE3lpUp cTE3lpUp = this.VgvYg0wo;
        if (cTE3lpUp != null) {
            cTE3lpUp.wxUZMvaN();
            f7oeun2L f7oeun2l = this.VgvYg0wo.RXQxj5Oe;
            if (f7oeun2l == null || !f7oeun2l.NCTxEWno()) {
                return;
            }
            f7oeun2l.jb9XjC4I.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.jb9XjC4I = false;
        }
        if (!this.jb9XjC4I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.jb9XjC4I = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.jb9XjC4I = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = fh0.qoPGr6Ce;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.ow5vqvCr;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ow5vqvCr.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int b2ZJblxo = b2ZJblxo(this.ow5vqvCr, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? b2ZJblxo - i6 : b2ZJblxo + i6;
        }
        LinearLayout linearLayout = this.lDXGDhIF;
        if (linearLayout != null && this.ygLcUYwZ == null && linearLayout.getVisibility() != 8) {
            paddingRight += b2ZJblxo(this.lDXGDhIF, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.ygLcUYwZ;
        if (view2 != null) {
            b2ZJblxo(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.wxUZMvaN;
        if (actionMenuView != null) {
            b2ZJblxo(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            m1.Ey6iv0m0(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            m1.Ey6iv0m0(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.P7K7Inc8;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.ow5vqvCr;
        if (view != null) {
            int P7K7Inc8 = P7K7Inc8(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ow5vqvCr.getLayoutParams();
            paddingLeft = P7K7Inc8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.wxUZMvaN;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = P7K7Inc8(this.wxUZMvaN, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.lDXGDhIF;
        if (linearLayout != null && this.ygLcUYwZ == null) {
            if (this.Ey6iv0m0) {
                this.lDXGDhIF.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.lDXGDhIF.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.lDXGDhIF.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = P7K7Inc8(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.ygLcUYwZ;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.ygLcUYwZ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.P7K7Inc8 > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Qr9iLBAD = false;
        }
        if (!this.Qr9iLBAD) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.Qr9iLBAD = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.Qr9iLBAD = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.P7K7Inc8 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.ygLcUYwZ;
        if (view2 != null) {
            removeView(view2);
        }
        this.ygLcUYwZ = view;
        if (view != null && (linearLayout = this.lDXGDhIF) != null) {
            removeView(linearLayout);
            this.lDXGDhIF = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k3x7lurq = charSequence;
        wxUZMvaN();
    }

    public void setTitle(CharSequence charSequence) {
        this.eVhOlqcC = charSequence;
        wxUZMvaN();
        hg0.k3x7lurq(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.Ey6iv0m0) {
            requestLayout();
        }
        this.Ey6iv0m0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void wxUZMvaN() {
        if (this.lDXGDhIF == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.lDXGDhIF = linearLayout;
            this.sjUBp5pO = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.OxcuoDLp = (TextView) this.lDXGDhIF.findViewById(R.id.action_bar_subtitle);
            int i = this.amk52bBQ;
            if (i != 0) {
                this.sjUBp5pO.setTextAppearance(getContext(), i);
            }
            int i2 = this.KlHjfFWx;
            if (i2 != 0) {
                this.OxcuoDLp.setTextAppearance(getContext(), i2);
            }
        }
        this.sjUBp5pO.setText(this.eVhOlqcC);
        this.OxcuoDLp.setText(this.k3x7lurq);
        boolean isEmpty = TextUtils.isEmpty(this.eVhOlqcC);
        boolean isEmpty2 = TextUtils.isEmpty(this.k3x7lurq);
        this.OxcuoDLp.setVisibility(!isEmpty2 ? 0 : 8);
        this.lDXGDhIF.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.lDXGDhIF.getParent() == null) {
            addView(this.lDXGDhIF);
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
