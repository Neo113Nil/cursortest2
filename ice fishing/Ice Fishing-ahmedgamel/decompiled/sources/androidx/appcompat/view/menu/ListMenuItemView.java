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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.b;
import g.AbstractC4528a;
import l.m;
import l.o;
import l.z;
import l4.g;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f4453A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f4454B;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f4455C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4456D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f4457E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4458F;

    /* renamed from: G, reason: collision with root package name */
    public final Drawable f4459G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f4460H;

    /* renamed from: I, reason: collision with root package name */
    public LayoutInflater f4461I;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public o f4462n;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f4463u;

    /* renamed from: v, reason: collision with root package name */
    public RadioButton f4464v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f4465w;

    /* renamed from: x, reason: collision with root package name */
    public CheckBox f4466x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f4467y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f4468z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g s9 = g.s(getContext(), attributeSet, AbstractC4528a.f37567s, C5248R.attr.listMenuViewStyle);
        this.f4455C = s9.i(5);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        this.f4456D = typedArray.getResourceId(1, -1);
        this.f4458F = typedArray.getBoolean(7, false);
        this.f4457E = context;
        this.f4459G = s9.i(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C5248R.attr.dropDownListViewStyle, 0);
        this.f4460H = obtainStyledAttributes.hasValue(0);
        s9.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4461I == null) {
            this.f4461I = LayoutInflater.from(getContext());
        }
        return this.f4461I;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f4468z;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4453A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4453A.getLayoutParams();
        rect.top = this.f4453A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
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
        boolean z6;
        String sb;
        boolean z9;
        this.f4462n = oVar;
        int i = 0;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.f38782x);
        setCheckable(oVar.isCheckable());
        if (oVar.f38763G.o()) {
            if ((oVar.f38763G.n() ? oVar.f38759C : oVar.f38757A) != 0) {
                z6 = true;
                oVar.f38763G.n();
                if (z6) {
                    o oVar2 = this.f4462n;
                    if (oVar2.f38763G.o()) {
                        if ((oVar2.f38763G.n() ? oVar2.f38759C : oVar2.f38757A) != 0) {
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f4467y;
                    o oVar3 = this.f4462n;
                    char c9 = oVar3.f38763G.n() ? oVar3.f38759C : oVar3.f38757A;
                    if (c9 == 0) {
                        sb = "";
                    } else {
                        m mVar = oVar3.f38763G;
                        Resources resources = mVar.f38747n.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(mVar.f38747n).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(C5248R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = mVar.n() ? oVar3.f38760D : oVar3.f38758B;
                        o.c(i4, b.aX, resources.getString(C5248R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i4, 4096, resources.getString(C5248R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i4, 2, resources.getString(C5248R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i4, 1, resources.getString(C5248R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i4, 4, resources.getString(C5248R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i4, 8, resources.getString(C5248R.string.abc_menu_function_shortcut_label), sb2);
                        if (c9 == '\b') {
                            sb2.append(resources.getString(C5248R.string.abc_menu_delete_shortcut_label));
                        } else if (c9 == '\n') {
                            sb2.append(resources.getString(C5248R.string.abc_menu_enter_shortcut_label));
                        } else if (c9 != ' ') {
                            sb2.append(c9);
                        } else {
                            sb2.append(resources.getString(C5248R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f4467y.getVisibility() != i) {
                    this.f4467y.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.J);
            }
        }
        z6 = false;
        oVar.f38763G.n();
        if (z6) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f4467y.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.J);
    }

    @Override // l.z
    public o getItemData() {
        return this.f4462n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4455C);
        TextView textView = (TextView) findViewById(C5248R.id.title);
        this.f4465w = textView;
        int i = this.f4456D;
        if (i != -1) {
            textView.setTextAppearance(this.f4457E, i);
        }
        this.f4467y = (TextView) findViewById(C5248R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C5248R.id.submenuarrow);
        this.f4468z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4459G);
        }
        this.f4453A = (ImageView) findViewById(C5248R.id.group_divider);
        this.f4454B = (LinearLayout) findViewById(C5248R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f4463u != null && this.f4458F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4463u.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f4464v == null && this.f4466x == null) {
            return;
        }
        if ((this.f4462n.f38772Q & 4) != 0) {
            if (this.f4464v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5248R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4464v = radioButton;
                LinearLayout linearLayout = this.f4454B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4464v;
            view = this.f4466x;
        } else {
            if (this.f4466x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5248R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4466x = checkBox;
                LinearLayout linearLayout2 = this.f4454B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4466x;
            view = this.f4464v;
        }
        if (z6) {
            compoundButton.setChecked(this.f4462n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4466x;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4464v;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f4462n.f38772Q & 4) != 0) {
            if (this.f4464v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5248R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4464v = radioButton;
                LinearLayout linearLayout = this.f4454B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4464v;
        } else {
            if (this.f4466x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5248R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4466x = checkBox;
                LinearLayout linearLayout2 = this.f4454B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4466x;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.J = z6;
        this.f4458F = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f4453A;
        if (imageView != null) {
            imageView.setVisibility((this.f4460H || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4462n.f38763G.getClass();
        boolean z6 = this.J;
        if (z6 || this.f4458F) {
            ImageView imageView = this.f4463u;
            if (imageView == null && drawable == null && !this.f4458F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C5248R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4463u = imageView2;
                LinearLayout linearLayout = this.f4454B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4458F) {
                this.f4463u.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4463u;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4463u.getVisibility() != 0) {
                this.f4463u.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4465w.getVisibility() != 8) {
                this.f4465w.setVisibility(8);
            }
        } else {
            this.f4465w.setText(charSequence);
            if (this.f4465w.getVisibility() != 0) {
                this.f4465w.setVisibility(0);
            }
        }
    }
}
