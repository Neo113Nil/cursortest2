package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;
import defpackage.cs;
import defpackage.f0;
import defpackage.qs;
import defpackage.yr;
import defpackage.z00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements qs, AbsListView.SelectionBoundsAdjuster {
    public ImageView MdtA4re8;
    public cs NCTxEWno;
    public final Context OnDfzHZD;
    public LayoutInflater OxcuoDLp;
    public CheckBox P7K7Inc8;
    public ImageView Qr9iLBAD;
    public TextView VgvYg0wo;
    public boolean amk52bBQ;
    public TextView b2ZJblxo;
    public LinearLayout eVhOlqcC;
    public ImageView jb9XjC4I;
    public final Drawable k3x7lurq;
    public final Drawable lDXGDhIF;
    public final int ow5vqvCr;
    public final boolean sjUBp5pO;
    public RadioButton wxUZMvaN;
    public boolean ygLcUYwZ;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f0 Mq3SeTnW = f0.Mq3SeTnW(getContext(), attributeSet, z00.amk52bBQ, R.attr.listMenuViewStyle);
        this.k3x7lurq = Mq3SeTnW.OxcuoDLp(5);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        this.ow5vqvCr = typedArray.getResourceId(1, -1);
        this.ygLcUYwZ = typedArray.getBoolean(7, false);
        this.OnDfzHZD = context;
        this.lDXGDhIF = Mq3SeTnW.OxcuoDLp(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.sjUBp5pO = obtainStyledAttributes.hasValue(0);
        Mq3SeTnW.SgZGMMPL();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.OxcuoDLp;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.OxcuoDLp = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.Qr9iLBAD;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.jb9XjC4I;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.jb9XjC4I.getLayoutParams();
        rect.top = this.jb9XjC4I.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.qs
    public cs getItemData() {
        return this.NCTxEWno;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.k3x7lurq);
        TextView textView = (TextView) findViewById(R.id.title);
        this.VgvYg0wo = textView;
        int i = this.ow5vqvCr;
        if (i != -1) {
            textView.setTextAppearance(this.OnDfzHZD, i);
        }
        this.b2ZJblxo = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.Qr9iLBAD = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.lDXGDhIF);
        }
        this.jb9XjC4I = (ImageView) findViewById(R.id.group_divider);
        this.eVhOlqcC = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.MdtA4re8 != null && this.ygLcUYwZ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.MdtA4re8.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r1.ygLcUYwZ() ? r0.eVhOlqcC : r0.Qr9iLBAD) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // defpackage.qs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qoPGr6Ce(cs csVar) {
        boolean z;
        String sb;
        this.NCTxEWno = csVar;
        boolean isVisible = csVar.isVisible();
        yr yrVar = csVar.ygLcUYwZ;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(csVar.VgvYg0wo);
        setCheckable(csVar.isCheckable());
        if (yrVar.lDXGDhIF()) {
            if ((yrVar.ygLcUYwZ() ? csVar.eVhOlqcC : csVar.Qr9iLBAD) != 0) {
                z = true;
                yrVar.ygLcUYwZ();
                if (z) {
                    cs csVar2 = this.NCTxEWno;
                    yr yrVar2 = csVar2.ygLcUYwZ;
                    if (yrVar2.lDXGDhIF()) {
                    }
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.b2ZJblxo;
                    cs csVar3 = this.NCTxEWno;
                    yr yrVar3 = csVar3.ygLcUYwZ;
                    Context context = yrVar3.qoPGr6Ce;
                    char c = yrVar3.ygLcUYwZ() ? csVar3.eVhOlqcC : csVar3.Qr9iLBAD;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = yrVar3.ygLcUYwZ() ? csVar3.k3x7lurq : csVar3.jb9XjC4I;
                        cs.MdtA4re8(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        cs.MdtA4re8(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        cs.MdtA4re8(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        cs.MdtA4re8(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        cs.MdtA4re8(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        cs.MdtA4re8(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.b2ZJblxo.getVisibility() != i) {
                    this.b2ZJblxo.setVisibility(i);
                }
                setIcon(csVar.getIcon());
                setEnabled(csVar.isEnabled());
                setSubMenuArrowVisible(csVar.hasSubMenu());
                setContentDescription(csVar.OxcuoDLp);
            }
        }
        z = false;
        yrVar.ygLcUYwZ();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.b2ZJblxo.getVisibility() != i) {
        }
        setIcon(csVar.getIcon());
        setEnabled(csVar.isEnabled());
        setSubMenuArrowVisible(csVar.hasSubMenu());
        setContentDescription(csVar.OxcuoDLp);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.wxUZMvaN == null && this.P7K7Inc8 == null) {
            return;
        }
        if ((this.NCTxEWno.gjV1z5T1 & 4) != 0) {
            if (this.wxUZMvaN == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.wxUZMvaN = radioButton;
                LinearLayout linearLayout = this.eVhOlqcC;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.wxUZMvaN;
            compoundButton2 = this.P7K7Inc8;
            compoundButton3 = compoundButton2;
        } else {
            if (this.P7K7Inc8 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.P7K7Inc8 = checkBox;
                LinearLayout linearLayout2 = this.eVhOlqcC;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.P7K7Inc8;
            compoundButton2 = this.wxUZMvaN;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.wxUZMvaN;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.NCTxEWno.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.NCTxEWno.gjV1z5T1 & 4) != 0) {
            if (this.wxUZMvaN == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.wxUZMvaN = radioButton;
                LinearLayout linearLayout = this.eVhOlqcC;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.wxUZMvaN;
        } else {
            if (this.P7K7Inc8 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.P7K7Inc8 = checkBox;
                LinearLayout linearLayout2 = this.eVhOlqcC;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.P7K7Inc8;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.amk52bBQ = z;
        this.ygLcUYwZ = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.jb9XjC4I;
        if (imageView != null) {
            imageView.setVisibility((this.sjUBp5pO || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        yr yrVar = this.NCTxEWno.ygLcUYwZ;
        boolean z = this.amk52bBQ;
        if (z || this.ygLcUYwZ) {
            ImageView imageView = this.MdtA4re8;
            if (imageView == null && drawable == null && !this.ygLcUYwZ) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.MdtA4re8 = imageView2;
                LinearLayout linearLayout = this.eVhOlqcC;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.ygLcUYwZ) {
                this.MdtA4re8.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.MdtA4re8;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.MdtA4re8.getVisibility() != 0) {
                this.MdtA4re8.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.VgvYg0wo;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.VgvYg0wo.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.VgvYg0wo.getVisibility() != 0) {
                this.VgvYg0wo.setVisibility(0);
            }
        }
    }
}
