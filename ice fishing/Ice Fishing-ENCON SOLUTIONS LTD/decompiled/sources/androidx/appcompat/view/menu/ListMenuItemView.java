package androidx.appcompat.view.menu;

import I0.b;
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
import c.AbstractC0131a;
import com.watchfacestudio.spraktum.R;
import g.j;
import g.k;
import g.q;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public k f2051a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f2052b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f2053c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f2054d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f2055e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f2056f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f2057g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f2058h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f2059i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f2060j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2061k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f2062l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2063m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f2064n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2065o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f2066p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2067q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b H2 = b.H(getContext(), attributeSet, AbstractC0131a.f2631n, R.attr.listMenuViewStyle);
        this.f2060j = H2.A(5);
        TypedArray typedArray = (TypedArray) H2.f722c;
        this.f2061k = typedArray.getResourceId(1, -1);
        this.f2063m = typedArray.getBoolean(7, false);
        this.f2062l = context;
        this.f2064n = H2.A(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2065o = obtainStyledAttributes.hasValue(0);
        H2.K();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2066p == null) {
            this.f2066p = LayoutInflater.from(getContext());
        }
        return this.f2066p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f2057g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2058h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2058h.getLayoutParams();
        rect.top = this.f2058h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
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
        this.f2051a = kVar;
        int i2 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f3076e);
        setCheckable(kVar.isCheckable());
        if (kVar.f3085n.n()) {
            if ((kVar.f3085n.m() ? kVar.f3081j : kVar.f3079h) != 0) {
                z2 = true;
                kVar.f3085n.m();
                if (z2) {
                    k kVar2 = this.f2051a;
                    if (kVar2.f3085n.n()) {
                        if ((kVar2.f3085n.m() ? kVar2.f3081j : kVar2.f3079h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f2056f;
                    k kVar3 = this.f2051a;
                    char c2 = kVar3.f3085n.m() ? kVar3.f3081j : kVar3.f3079h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        j jVar = kVar3.f3085n;
                        Resources resources = jVar.f3051a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(jVar.f3051a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = jVar.m() ? kVar3.f3082k : kVar3.f3080i;
                        k.a(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        k.a(sb2, i3, Base64Utils.IO_BUFFER_SIZE, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
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
                if (this.f2056f.getVisibility() != i2) {
                    this.f2056f.setVisibility(i2);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f3088q);
            }
        }
        z2 = false;
        kVar.f3085n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f2056f.getVisibility() != i2) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f3088q);
    }

    @Override // g.q
    public k getItemData() {
        return this.f2051a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f8596a;
        setBackground(this.f2060j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2054d = textView;
        int i2 = this.f2061k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f2062l, i2);
        }
        this.f2056f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2057g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2064n);
        }
        this.f2058h = (ImageView) findViewById(R.id.group_divider);
        this.f2059i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f2052b != null && this.f2063m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2052b.getLayoutParams();
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
        if (!z2 && this.f2053c == null && this.f2055e == null) {
            return;
        }
        if ((this.f2051a.f3094x & 4) != 0) {
            if (this.f2053c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2053c = radioButton;
                LinearLayout linearLayout = this.f2059i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2053c;
            view = this.f2055e;
        } else {
            if (this.f2055e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2055e = checkBox;
                LinearLayout linearLayout2 = this.f2059i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2055e;
            view = this.f2053c;
        }
        if (z2) {
            compoundButton.setChecked(this.f2051a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f2055e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2053c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f2051a.f3094x & 4) != 0) {
            if (this.f2053c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2053c = radioButton;
                LinearLayout linearLayout = this.f2059i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2053c;
        } else {
            if (this.f2055e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2055e = checkBox;
                LinearLayout linearLayout2 = this.f2059i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2055e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f2067q = z2;
        this.f2063m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f2058h;
        if (imageView != null) {
            imageView.setVisibility((this.f2065o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2051a.f3085n.getClass();
        boolean z2 = this.f2067q;
        if (z2 || this.f2063m) {
            ImageView imageView = this.f2052b;
            if (imageView == null && drawable == null && !this.f2063m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2052b = imageView2;
                LinearLayout linearLayout = this.f2059i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2063m) {
                this.f2052b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2052b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2052b.getVisibility() != 0) {
                this.f2052b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2054d.getVisibility() != 8) {
                this.f2054d.setVisibility(8);
            }
        } else {
            this.f2054d.setText(charSequence);
            if (this.f2054d.getVisibility() != 0) {
                this.f2054d.setVisibility(0);
            }
        }
    }
}
