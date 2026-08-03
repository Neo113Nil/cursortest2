package androidx.appcompat.view.menu;

import a5.c;
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
import h3.w;
import i.a;
import java.lang.reflect.Field;
import l.h;
import l.i;
import l.o;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: g, reason: collision with root package name */
    public i f364g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f365h;

    /* renamed from: i, reason: collision with root package name */
    public RadioButton f366i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f367j;

    /* renamed from: k, reason: collision with root package name */
    public CheckBox f368k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f369l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f370m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f371n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f372o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f373p;

    /* renamed from: q, reason: collision with root package name */
    public final int f374q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f375r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f376s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f377t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f378u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutInflater f379v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f380w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c C = c.C(getContext(), attributeSet, a.f2923n, R.attr.listMenuViewStyle);
        this.f373p = C.v(5);
        TypedArray typedArray = (TypedArray) C.f261g;
        this.f374q = typedArray.getResourceId(1, -1);
        this.f376s = typedArray.getBoolean(7, false);
        this.f375r = context;
        this.f377t = C.v(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f378u = obtainStyledAttributes.hasValue(0);
        C.F();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f379v == null) {
            this.f379v = LayoutInflater.from(getContext());
        }
        return this.f379v;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f370m;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f371n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f371n.getLayoutParams();
        rect.top = this.f371n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // l.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(i iVar) {
        boolean z10;
        String sb;
        boolean z11;
        this.f364g = iVar;
        boolean isVisible = iVar.isVisible();
        h hVar = iVar.f3723n;
        int i10 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(iVar.f3714e);
        setCheckable(iVar.isCheckable());
        if (hVar.n()) {
            if ((hVar.m() ? iVar.f3719j : iVar.f3717h) != 0) {
                z10 = true;
                hVar.m();
                if (z10) {
                    i iVar2 = this.f364g;
                    h hVar2 = iVar2.f3723n;
                    if (hVar2.n()) {
                        if ((hVar2.m() ? iVar2.f3719j : iVar2.f3717h) != 0) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                i10 = 8;
                if (i10 == 0) {
                    TextView textView = this.f369l;
                    i iVar3 = this.f364g;
                    h hVar3 = iVar3.f3723n;
                    Context context = hVar3.f3690a;
                    char c3 = hVar3.m() ? iVar3.f3719j : iVar3.f3717h;
                    if (c3 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i11 = hVar3.m() ? iVar3.f3720k : iVar3.f3718i;
                        i.a(sb2, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        i.a(sb2, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        i.a(sb2, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        i.a(sb2, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        i.a(sb2, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        i.a(sb2, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c3 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c3 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c3 != ' ') {
                            sb2.append(c3);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f369l.getVisibility() != i10) {
                    this.f369l.setVisibility(i10);
                }
                setIcon(iVar.getIcon());
                setEnabled(iVar.isEnabled());
                setSubMenuArrowVisible(iVar.hasSubMenu());
                setContentDescription(iVar.f3726q);
            }
        }
        z10 = false;
        hVar.m();
        if (z10) {
        }
        i10 = 8;
        if (i10 == 0) {
        }
        if (this.f369l.getVisibility() != i10) {
        }
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.f3726q);
    }

    @Override // l.o
    public i getItemData() {
        return this.f364g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = w.f2829a;
        setBackground(this.f373p);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f367j = textView;
        int i10 = this.f374q;
        if (i10 != -1) {
            textView.setTextAppearance(this.f375r, i10);
        }
        this.f369l = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f370m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f377t);
        }
        this.f371n = (ImageView) findViewById(R.id.group_divider);
        this.f372o = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f365h != null && this.f376s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f365h.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f366i == null && this.f368k == null) {
            return;
        }
        if ((this.f364g.f3733x & 4) != 0) {
            if (this.f366i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f366i = radioButton;
                LinearLayout linearLayout = this.f372o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f366i;
            view = this.f368k;
        } else {
            if (this.f368k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f368k = checkBox;
                LinearLayout linearLayout2 = this.f372o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f368k;
            view = this.f366i;
        }
        if (z10) {
            compoundButton.setChecked(this.f364g.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f368k;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f366i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f364g.f3733x & 4) != 0) {
            if (this.f366i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f366i = radioButton;
                LinearLayout linearLayout = this.f372o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f366i;
        } else {
            if (this.f368k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f368k = checkBox;
                LinearLayout linearLayout2 = this.f372o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f368k;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f380w = z10;
        this.f376s = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f371n;
        if (imageView != null) {
            imageView.setVisibility((this.f378u || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        h hVar = this.f364g.f3723n;
        boolean z10 = this.f380w;
        if (z10 || this.f376s) {
            ImageView imageView = this.f365h;
            if (imageView == null && drawable == null && !this.f376s) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f365h = imageView2;
                LinearLayout linearLayout = this.f372o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f376s) {
                this.f365h.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f365h;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f365h.getVisibility() != 0) {
                this.f365h.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f367j.getVisibility() != 8) {
                this.f367j.setVisibility(8);
            }
        } else {
            this.f367j.setText(charSequence);
            if (this.f367j.getVisibility() != 0) {
                this.f367j.setVisibility(0);
            }
        }
    }
}
