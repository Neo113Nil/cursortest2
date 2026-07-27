package androidx.appcompat.view.menu;

import L.C0051b;
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
import c.AbstractC0097a;
import com.icedrifter.arcticquest.R;
import g.j;
import g.k;
import g.q;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public k f1089f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1090g;

    /* renamed from: h, reason: collision with root package name */
    public RadioButton f1091h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f1092i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f1093j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f1094k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1095l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f1096m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1097n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f1098o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1099p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f1100q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f1101s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1102t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f1103u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1104v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0051b E2 = C0051b.E(getContext(), attributeSet, AbstractC0097a.f1642n, R.attr.listMenuViewStyle);
        this.f1098o = E2.x(5);
        TypedArray typedArray = (TypedArray) E2.f602g;
        this.f1099p = typedArray.getResourceId(1, -1);
        this.r = typedArray.getBoolean(7, false);
        this.f1100q = context;
        this.f1101s = E2.x(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1102t = obtainStyledAttributes.hasValue(0);
        E2.H();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1103u == null) {
            this.f1103u = LayoutInflater.from(getContext());
        }
        return this.f1103u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1095l;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1096m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1096m.getLayoutParams();
        rect.top = this.f1096m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // g.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k kVar) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1089f = kVar;
        int i2 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f1989e);
        setCheckable(kVar.isCheckable());
        if (kVar.f1998n.n()) {
            if ((kVar.f1998n.m() ? kVar.f1994j : kVar.f1992h) != 0) {
                z2 = true;
                kVar.f1998n.m();
                if (z2) {
                    k kVar2 = this.f1089f;
                    if (kVar2.f1998n.n()) {
                        if ((kVar2.f1998n.m() ? kVar2.f1994j : kVar2.f1992h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f1094k;
                    k kVar3 = this.f1089f;
                    char c2 = kVar3.f1998n.m() ? kVar3.f1994j : kVar3.f1992h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        j jVar = kVar3.f1998n;
                        Resources resources = jVar.f1964a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(jVar.f1964a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = jVar.m() ? kVar3.f1995k : kVar3.f1993i;
                        k.a(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        k.a(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        k.a(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        k.a(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        k.a(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        k.a(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.f1094k.getVisibility() != i2) {
                    this.f1094k.setVisibility(i2);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f2001q);
            }
        }
        z2 = false;
        kVar.f1998n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f1094k.getVisibility() != i2) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f2001q);
    }

    @Override // g.q
    public k getItemData() {
        return this.f1089f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f3069a;
        setBackground(this.f1098o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1092i = textView;
        int i2 = this.f1099p;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1100q, i2);
        }
        this.f1094k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1095l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1101s);
        }
        this.f1096m = (ImageView) findViewById(R.id.group_divider);
        this.f1097n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1090g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1090g.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1091h == null && this.f1093j == null) {
            return;
        }
        if ((this.f1089f.f2007x & 4) != 0) {
            if (this.f1091h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1091h = radioButton;
                LinearLayout linearLayout = this.f1097n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1091h;
            view = this.f1093j;
        } else {
            if (this.f1093j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1093j = checkBox;
                LinearLayout linearLayout2 = this.f1097n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1093j;
            view = this.f1091h;
        }
        if (z2) {
            compoundButton.setChecked(this.f1089f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1093j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1091h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1089f.f2007x & 4) != 0) {
            if (this.f1091h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1091h = radioButton;
                LinearLayout linearLayout = this.f1097n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1091h;
        } else {
            if (this.f1093j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1093j = checkBox;
                LinearLayout linearLayout2 = this.f1097n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1093j;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1104v = z2;
        this.r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1096m;
        if (imageView != null) {
            imageView.setVisibility((this.f1102t || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1089f.f1998n.getClass();
        boolean z2 = this.f1104v;
        if (z2 || this.r) {
            ImageView imageView = this.f1090g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1090g = imageView2;
                LinearLayout linearLayout = this.f1097n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.f1090g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1090g;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1090g.getVisibility() != 0) {
                this.f1090g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1092i.getVisibility() != 8) {
                this.f1092i.setVisibility(8);
            }
        } else {
            this.f1092i.setText(charSequence);
            if (this.f1092i.getVisibility() != 0) {
                this.f1092i.setVisibility(0);
            }
        }
    }
}
