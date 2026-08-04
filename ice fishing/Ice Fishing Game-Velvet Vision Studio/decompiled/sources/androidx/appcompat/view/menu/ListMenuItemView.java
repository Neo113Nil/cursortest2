package androidx.appcompat.view.menu;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.j.a;
import com.gamericefishpro.space.m.i;
import com.gamericefishpro.space.m.j;
import com.gamericefishpro.space.m.p;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p, AbsListView.SelectionBoundsAdjuster {
    public ImageView A;
    public LinearLayout B;
    public final Drawable C;
    public final int D;
    public final Context E;
    public boolean F;
    public final Drawable G;
    public final boolean H;
    public LayoutInflater I;
    public boolean J;
    public j d;
    public ImageView e;
    public RadioButton i;
    public TextView v;
    public CheckBox w;
    public TextView y;
    public ImageView z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVarT = c.t(getContext(), attributeSet, a.o, R.attr.listMenuViewStyle);
        this.C = cVarT.l(5);
        TypedArray typedArray = (TypedArray) cVarT.i;
        this.D = typedArray.getResourceId(1, -1);
        this.F = typedArray.getBoolean(7, false);
        this.E = context;
        this.G = cVarT.l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.H = typedArrayObtainStyledAttributes.hasValue(0);
        cVarT.u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.I == null) {
            this.I = LayoutInflater.from(getContext());
        }
        return this.I;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.z;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // com.gamericefishpro.space.m.p
    public final void a(j jVar) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.d = jVar;
        boolean zIsVisible = jVar.isVisible();
        i iVar = jVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(jVar.e);
        setCheckable(jVar.isCheckable());
        if (iVar.n()) {
            if ((iVar.m() ? jVar.j : jVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        iVar.m();
        if (z) {
            j jVar2 = this.d;
            i iVar2 = jVar2.n;
            if (iVar2.n()) {
                if ((iVar2.m() ? jVar2.j : jVar2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.y;
            j jVar3 = this.d;
            i iVar3 = jVar3.n;
            Context context = iVar3.a;
            char c = iVar3.m() ? jVar3.j : jVar3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = iVar3.m() ? jVar3.k : jVar3.i;
                j.a(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                j.a(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                j.a(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                j.a(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                j.a(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                j.a(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.y.getVisibility() != i) {
            this.y.setVisibility(i);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A.getLayoutParams();
        rect.top = this.A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // com.gamericefishpro.space.m.p
    public j getItemData() {
        return this.d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.C);
        TextView textView = (TextView) findViewById(R.id.title);
        this.v = textView;
        int i = this.D;
        if (i != -1) {
            textView.setTextAppearance(this.E, i);
        }
        this.y = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.G);
        }
        this.A = (ImageView) findViewById(R.id.group_divider);
        this.B = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e != null && this.F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.i == null && this.w == null) {
            return;
        }
        if ((this.d.x & 4) != 0) {
            if (this.i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.i = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.i;
            view = this.w;
        } else {
            if (this.w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.w = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.w;
            view = this.i;
        }
        if (z) {
            compoundButton.setChecked(this.d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.w;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.d.x & 4) != 0) {
            if (this.i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.i = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.i;
        } else {
            if (this.w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.w = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.w;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.J = z;
        this.F = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setVisibility((this.H || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        i iVar = this.d.n;
        boolean z = this.J;
        if (z || this.F) {
            ImageView imageView = this.e;
            if (imageView == null && drawable == null && !this.F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.e = imageView2;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.F) {
                this.e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.e;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.v.getVisibility() != 8) {
                this.v.setVisibility(8);
            }
        } else {
            this.v.setText(charSequence);
            if (this.v.getVisibility() != 0) {
                this.v.setVisibility(0);
            }
        }
    }
}
