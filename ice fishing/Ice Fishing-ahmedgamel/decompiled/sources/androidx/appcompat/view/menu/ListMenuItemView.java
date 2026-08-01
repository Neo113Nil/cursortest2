package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anythink.basead.exoplayer.b;
import com.icefishing.icefishingbigwin.C5275R;
import g.AbstractC4518a;
import j4.g;
import l.m;
import l.o;
import l.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f4485A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f4486B;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f4487C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4488D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f4489E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4490F;

    /* renamed from: G, reason: collision with root package name */
    public final Drawable f4491G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f4492H;

    /* renamed from: I, reason: collision with root package name */
    public LayoutInflater f4493I;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public o f4494n;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f4495u;

    /* renamed from: v, reason: collision with root package name */
    public RadioButton f4496v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f4497w;

    /* renamed from: x, reason: collision with root package name */
    public CheckBox f4498x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f4499y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f4500z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g s9 = g.s(getContext(), attributeSet, AbstractC4518a.f37605s, C5275R.attr.listMenuViewStyle);
        this.f4487C = s9.i(5);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        this.f4488D = typedArray.getResourceId(1, -1);
        this.f4490F = typedArray.getBoolean(7, false);
        this.f4489E = context;
        this.f4491G = s9.i(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C5275R.attr.dropDownListViewStyle, 0);
        this.f4492H = obtainStyledAttributes.hasValue(0);
        s9.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4493I == null) {
            this.f4493I = LayoutInflater.from(getContext());
        }
        return this.f4493I;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f4500z;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4485A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4485A.getLayoutParams();
        rect.top = this.f4485A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // l.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(o oVar) {
        boolean z3;
        String sb;
        boolean z6;
        this.f4494n = oVar;
        int i = 0;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.f38855x);
        setCheckable(oVar.isCheckable());
        if (oVar.f38836G.o()) {
            if ((oVar.f38836G.n() ? oVar.f38832C : oVar.f38830A) != 0) {
                z3 = true;
                oVar.f38836G.n();
                if (z3) {
                    o oVar2 = this.f4494n;
                    if (oVar2.f38836G.o()) {
                        if ((oVar2.f38836G.n() ? oVar2.f38832C : oVar2.f38830A) != 0) {
                            z6 = true;
                        }
                    }
                    z6 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f4499y;
                    o oVar3 = this.f4494n;
                    char c9 = oVar3.f38836G.n() ? oVar3.f38832C : oVar3.f38830A;
                    if (c9 == 0) {
                        sb = "";
                    } else {
                        m mVar = oVar3.f38836G;
                        Resources resources = mVar.f38820n.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(mVar.f38820n).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(C5275R.string.abc_prepend_shortcut_label));
                        }
                        int i6 = mVar.n() ? oVar3.f38833D : oVar3.f38831B;
                        o.c(i6, b.aX, resources.getString(C5275R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i6, 4096, resources.getString(C5275R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i6, 2, resources.getString(C5275R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i6, 1, resources.getString(C5275R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i6, 4, resources.getString(C5275R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i6, 8, resources.getString(C5275R.string.abc_menu_function_shortcut_label), sb2);
                        if (c9 == '\b') {
                            sb2.append(resources.getString(C5275R.string.abc_menu_delete_shortcut_label));
                        } else if (c9 == '\n') {
                            sb2.append(resources.getString(C5275R.string.abc_menu_enter_shortcut_label));
                        } else if (c9 != ' ') {
                            sb2.append(c9);
                        } else {
                            sb2.append(resources.getString(C5275R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f4499y.getVisibility() != i) {
                    this.f4499y.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.J);
            }
        }
        z3 = false;
        oVar.f38836G.n();
        if (z3) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f4499y.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.J);
    }

    @Override // l.z
    public o getItemData() {
        return this.f4494n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4487C);
        TextView textView = (TextView) findViewById(C5275R.id.title);
        this.f4497w = textView;
        int i = this.f4488D;
        if (i != -1) {
            textView.setTextAppearance(this.f4489E, i);
        }
        this.f4499y = (TextView) findViewById(C5275R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C5275R.id.submenuarrow);
        this.f4500z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4491G);
        }
        this.f4485A = (ImageView) findViewById(C5275R.id.group_divider);
        this.f4486B = (LinearLayout) findViewById(C5275R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        if (this.f4495u != null && this.f4490F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4495u.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i, i6);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f4496v == null && this.f4498x == null) {
            return;
        }
        if ((this.f4494n.f38845Q & 4) != 0) {
            if (this.f4496v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5275R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4496v = radioButton;
                LinearLayout linearLayout = this.f4486B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4496v;
            view = this.f4498x;
        } else {
            if (this.f4498x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5275R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4498x = checkBox;
                LinearLayout linearLayout2 = this.f4486B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4498x;
            view = this.f4496v;
        }
        if (z3) {
            compoundButton.setChecked(this.f4494n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4498x;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4496v;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f4494n.f38845Q & 4) != 0) {
            if (this.f4496v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5275R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4496v = radioButton;
                LinearLayout linearLayout = this.f4486B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4496v;
        } else {
            if (this.f4498x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5275R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4498x = checkBox;
                LinearLayout linearLayout2 = this.f4486B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4498x;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.J = z3;
        this.f4490F = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f4485A;
        if (imageView != null) {
            imageView.setVisibility((this.f4492H || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4494n.f38836G.getClass();
        boolean z3 = this.J;
        if (z3 || this.f4490F) {
            ImageView imageView = this.f4495u;
            if (imageView == null && drawable == null && !this.f4490F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C5275R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4495u = imageView2;
                LinearLayout linearLayout = this.f4486B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4490F) {
                this.f4495u.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4495u;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4495u.getVisibility() != 0) {
                this.f4495u.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4497w.getVisibility() != 8) {
                this.f4497w.setVisibility(8);
            }
        } else {
            this.f4497w.setText(charSequence);
            if (this.f4497w.getVisibility() != 0) {
                this.f4497w.setVisibility(0);
            }
        }
    }
}
