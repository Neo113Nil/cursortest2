package androidx.appcompat.view.menu;

import L.C0026b;
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
import com.icecatchbiger.hookfrostmaster.R;
import g.j;
import g.k;
import g.q;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    public k f1097e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f1098f;

    /* renamed from: g, reason: collision with root package name */
    public RadioButton f1099g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1100h;

    /* renamed from: i, reason: collision with root package name */
    public CheckBox f1101i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1102j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1103k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1104l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f1105m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1106n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1107o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1108p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1109q;
    public final Drawable r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1110s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f1111t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1112u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0026b E2 = C0026b.E(getContext(), attributeSet, AbstractC0097a.f1650n, R.attr.listMenuViewStyle);
        this.f1106n = E2.x(5);
        TypedArray typedArray = (TypedArray) E2.f524f;
        this.f1107o = typedArray.getResourceId(1, -1);
        this.f1109q = typedArray.getBoolean(7, false);
        this.f1108p = context;
        this.r = E2.x(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1110s = obtainStyledAttributes.hasValue(0);
        E2.H();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1111t == null) {
            this.f1111t = LayoutInflater.from(getContext());
        }
        return this.f1111t;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1103k;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1104l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1104l.getLayoutParams();
        rect.top = this.f1104l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
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
        this.f1097e = kVar;
        int i2 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f1997e);
        setCheckable(kVar.isCheckable());
        if (kVar.f2006n.n()) {
            if ((kVar.f2006n.m() ? kVar.f2002j : kVar.f2000h) != 0) {
                z2 = true;
                kVar.f2006n.m();
                if (z2) {
                    k kVar2 = this.f1097e;
                    if (kVar2.f2006n.n()) {
                        if ((kVar2.f2006n.m() ? kVar2.f2002j : kVar2.f2000h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f1102j;
                    k kVar3 = this.f1097e;
                    char c2 = kVar3.f2006n.m() ? kVar3.f2002j : kVar3.f2000h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        j jVar = kVar3.f2006n;
                        Resources resources = jVar.f1972a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(jVar.f1972a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = jVar.m() ? kVar3.f2003k : kVar3.f2001i;
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
                if (this.f1102j.getVisibility() != i2) {
                    this.f1102j.setVisibility(i2);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f2009q);
            }
        }
        z2 = false;
        kVar.f2006n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f1102j.getVisibility() != i2) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f2009q);
    }

    @Override // g.q
    public k getItemData() {
        return this.f1097e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f3074a;
        setBackground(this.f1106n);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1100h = textView;
        int i2 = this.f1107o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1108p, i2);
        }
        this.f1102j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1103k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.f1104l = (ImageView) findViewById(R.id.group_divider);
        this.f1105m = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1098f != null && this.f1109q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1098f.getLayoutParams();
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
        if (!z2 && this.f1099g == null && this.f1101i == null) {
            return;
        }
        if ((this.f1097e.f2015x & 4) != 0) {
            if (this.f1099g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1099g = radioButton;
                LinearLayout linearLayout = this.f1105m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1099g;
            view = this.f1101i;
        } else {
            if (this.f1101i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1101i = checkBox;
                LinearLayout linearLayout2 = this.f1105m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1101i;
            view = this.f1099g;
        }
        if (z2) {
            compoundButton.setChecked(this.f1097e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1101i;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1099g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1097e.f2015x & 4) != 0) {
            if (this.f1099g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1099g = radioButton;
                LinearLayout linearLayout = this.f1105m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1099g;
        } else {
            if (this.f1101i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1101i = checkBox;
                LinearLayout linearLayout2 = this.f1105m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1101i;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1112u = z2;
        this.f1109q = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1104l;
        if (imageView != null) {
            imageView.setVisibility((this.f1110s || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1097e.f2006n.getClass();
        boolean z2 = this.f1112u;
        if (z2 || this.f1109q) {
            ImageView imageView = this.f1098f;
            if (imageView == null && drawable == null && !this.f1109q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1098f = imageView2;
                LinearLayout linearLayout = this.f1105m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1109q) {
                this.f1098f.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1098f;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1098f.getVisibility() != 0) {
                this.f1098f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1100h.getVisibility() != 8) {
                this.f1100h.setVisibility(8);
            }
        } else {
            this.f1100h.setText(charSequence);
            if (this.f1100h.getVisibility() != 0) {
                this.f1100h.setVisibility(0);
            }
        }
    }
}
