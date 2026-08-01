package androidx.appcompat.view.menu;

import M0.h;
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
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;
import l.MenuC0229m;
import l.o;
import l.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public o f1756a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1757b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1758c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f1759d;
    public CheckBox e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1760f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1761g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f1762h;
    public LinearLayout i;
    public final Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1763k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1764l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1765m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1766n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1767o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1768p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1769q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h i = h.i(getContext(), attributeSet, AbstractC0155a.f3048r, R.attr.listMenuViewStyle);
        this.j = i.c(5);
        TypedArray typedArray = (TypedArray) i.f617c;
        this.f1763k = typedArray.getResourceId(1, -1);
        this.f1765m = typedArray.getBoolean(7, false);
        this.f1764l = context;
        this.f1766n = i.c(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1767o = obtainStyledAttributes.hasValue(0);
        i.l();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1768p == null) {
            this.f1768p = LayoutInflater.from(getContext());
        }
        return this.f1768p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1761g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1762h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1762h.getLayoutParams();
        rect.top = this.f1762h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
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
    public final void c(o oVar) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1756a = oVar;
        int i = 0;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.e);
        setCheckable(oVar.isCheckable());
        if (oVar.f3746n.o()) {
            if ((oVar.f3746n.n() ? oVar.j : oVar.f3742h) != 0) {
                z2 = true;
                oVar.f3746n.n();
                if (z2) {
                    o oVar2 = this.f1756a;
                    if (oVar2.f3746n.o()) {
                        if ((oVar2.f3746n.n() ? oVar2.j : oVar2.f3742h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1760f;
                    o oVar3 = this.f1756a;
                    char c2 = oVar3.f3746n.n() ? oVar3.j : oVar3.f3742h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0229m menuC0229m = oVar3.f3746n;
                        Resources resources = menuC0229m.f3709a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0229m.f3709a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0229m.n() ? oVar3.f3743k : oVar3.i;
                        o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c2 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb2.append(c2);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f1760f.getVisibility() != i) {
                    this.f1760f.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f3749q);
            }
        }
        z2 = false;
        oVar.f3746n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1760f.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f3749q);
    }

    @Override // l.z
    public o getItemData() {
        return this.f1756a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1759d = textView;
        int i = this.f1763k;
        if (i != -1) {
            textView.setTextAppearance(this.f1764l, i);
        }
        this.f1760f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1761g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1766n);
        }
        this.f1762h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1757b != null && this.f1765m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1757b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1758c == null && this.e == null) {
            return;
        }
        if ((this.f1756a.f3756x & 4) != 0) {
            if (this.f1758c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1758c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1758c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.f1758c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1756a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1758c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1756a.f3756x & 4) != 0) {
            if (this.f1758c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1758c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1758c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1769q = z2;
        this.f1765m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1762h;
        if (imageView != null) {
            imageView.setVisibility((this.f1767o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1756a.f3746n.getClass();
        boolean z2 = this.f1769q;
        if (z2 || this.f1765m) {
            ImageView imageView = this.f1757b;
            if (imageView == null && drawable == null && !this.f1765m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1757b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1765m) {
                this.f1757b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1757b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1757b.getVisibility() != 0) {
                this.f1757b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1759d.getVisibility() != 8) {
                this.f1759d.setVisibility(8);
            }
        } else {
            this.f1759d.setText(charSequence);
            if (this.f1759d.getVisibility() != 0) {
                this.f1759d.setVisibility(0);
            }
        }
    }
}
