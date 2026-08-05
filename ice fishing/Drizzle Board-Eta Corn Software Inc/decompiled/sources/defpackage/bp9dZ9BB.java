package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bp9dZ9BB {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public final Object P7K7Inc8;
    public final Object VgvYg0wo;
    public final Object qoPGr6Ce;
    public final Object wxUZMvaN;

    public bp9dZ9BB() {
        this.qoPGr6Ce = new int[]{2131165300, 2131165298, 2131165224};
        this.NCTxEWno = new int[]{2131165248, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.MdtA4re8 = new int[]{2131165297, 2131165299, 2131165241, R.drawable.abc_text_cursor_material, 2131165294, 2131165295, 2131165296};
        this.wxUZMvaN = new int[]{2131165273, R.drawable.abc_cab_background_internal_bg, 2131165272};
        this.VgvYg0wo = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.P7K7Inc8 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static ColorStateList MdtA4re8(Context context, int i) {
        int MdtA4re8 = ic0.MdtA4re8(context, R.attr.colorControlHighlight);
        int NCTxEWno = ic0.NCTxEWno(context, R.attr.colorButtonNormal);
        int[] iArr = ic0.NCTxEWno;
        int[] iArr2 = ic0.wxUZMvaN;
        int NCTxEWno2 = g6.NCTxEWno(MdtA4re8, i);
        return new ColorStateList(new int[][]{iArr, iArr2, ic0.MdtA4re8, ic0.P7K7Inc8}, new int[]{NCTxEWno, NCTxEWno2, g6.NCTxEWno(MdtA4re8, i), i});
    }

    public static bp9dZ9BB NCTxEWno(View view) {
        int i = R.id.panel_base_label;
        if (((TextView) n50.qoPGr6Ce(view, R.id.panel_base_label)) != null) {
            i = R.id.panel_base_value;
            TextView textView = (TextView) n50.qoPGr6Ce(view, R.id.panel_base_value);
            if (textView != null) {
                i = R.id.panel_cuisine_label;
                if (((TextView) n50.qoPGr6Ce(view, R.id.panel_cuisine_label)) != null) {
                    i = R.id.panel_cuisine_value;
                    TextView textView2 = (TextView) n50.qoPGr6Ce(view, R.id.panel_cuisine_value);
                    if (textView2 != null) {
                        i = R.id.panel_emoji;
                        TextView textView3 = (TextView) n50.qoPGr6Ce(view, R.id.panel_emoji);
                        if (textView3 != null) {
                            i = R.id.panel_intensity_label;
                            if (((TextView) n50.qoPGr6Ce(view, R.id.panel_intensity_label)) != null) {
                                i = R.id.panel_intensity_value;
                                TextView textView4 = (TextView) n50.qoPGr6Ce(view, R.id.panel_intensity_value);
                                if (textView4 != null) {
                                    i = R.id.panel_name;
                                    TextView textView5 = (TextView) n50.qoPGr6Ce(view, R.id.panel_name);
                                    if (textView5 != null) {
                                        i = R.id.panel_prep_label;
                                        if (((TextView) n50.qoPGr6Ce(view, R.id.panel_prep_label)) != null) {
                                            i = R.id.panel_prep_value;
                                            TextView textView6 = (TextView) n50.qoPGr6Ce(view, R.id.panel_prep_value);
                                            if (textView6 != null) {
                                                return new bp9dZ9BB(textView, textView2, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static void P7K7Inc8(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter P7K7Inc8;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = j5BPOSYv.NCTxEWno;
        }
        PorterDuff.Mode mode2 = j5BPOSYv.NCTxEWno;
        synchronized (j5BPOSYv.class) {
            P7K7Inc8 = e30.P7K7Inc8(i, mode);
        }
        mutate.setColorFilter(P7K7Inc8);
    }

    public static boolean qoPGr6Ce(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static LayerDrawable wxUZMvaN(e30 e30Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable wxUZMvaN = e30Var.wxUZMvaN(context, R.drawable.abc_star_black_48dp);
        Drawable wxUZMvaN2 = e30Var.wxUZMvaN(context, R.drawable.abc_star_half_black_48dp);
        if ((wxUZMvaN instanceof BitmapDrawable) && wxUZMvaN.getIntrinsicWidth() == dimensionPixelSize && wxUZMvaN.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) wxUZMvaN;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            wxUZMvaN.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            wxUZMvaN.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((wxUZMvaN2 instanceof BitmapDrawable) && wxUZMvaN2.getIntrinsicWidth() == dimensionPixelSize && wxUZMvaN2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) wxUZMvaN2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            wxUZMvaN2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            wxUZMvaN2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public ColorStateList VgvYg0wo(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return w30.RXQxj5Oe(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165290) {
            return w30.RXQxj5Oe(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return MdtA4re8(context, ic0.MdtA4re8(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return MdtA4re8(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return MdtA4re8(context, ic0.MdtA4re8(context, R.attr.colorAccent));
            }
            if (i == 2131165285 || i == R.drawable.abc_spinner_textfield_background_material) {
                return w30.RXQxj5Oe(context, R.color.abc_tint_spinner);
            }
            if (qoPGr6Ce((int[]) this.NCTxEWno, i)) {
                return ic0.wxUZMvaN(context, R.attr.colorControlNormal);
            }
            if (qoPGr6Ce((int[]) this.VgvYg0wo, i)) {
                return w30.RXQxj5Oe(context, R.color.abc_tint_default);
            }
            if (qoPGr6Ce((int[]) this.P7K7Inc8, i)) {
                return w30.RXQxj5Oe(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return w30.RXQxj5Oe(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList wxUZMvaN = ic0.wxUZMvaN(context, R.attr.colorSwitchThumbNormal);
        if (wxUZMvaN == null || !wxUZMvaN.isStateful()) {
            iArr[0] = ic0.NCTxEWno;
            iArr2[0] = ic0.NCTxEWno(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = ic0.VgvYg0wo;
            iArr2[1] = ic0.MdtA4re8(context, R.attr.colorControlActivated);
            iArr[2] = ic0.P7K7Inc8;
            iArr2[2] = ic0.MdtA4re8(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = ic0.NCTxEWno;
            iArr[0] = iArr3;
            iArr2[0] = wxUZMvaN.getColorForState(iArr3, 0);
            iArr[1] = ic0.VgvYg0wo;
            iArr2[1] = ic0.MdtA4re8(context, R.attr.colorControlActivated);
            iArr[2] = ic0.P7K7Inc8;
            iArr2[2] = wxUZMvaN.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public /* synthetic */ bp9dZ9BB(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, ViewGroup viewGroup, AppCompatButton appCompatButton, TextView textView3) {
        this.qoPGr6Ce = view;
        this.NCTxEWno = textView;
        this.MdtA4re8 = textView2;
        this.wxUZMvaN = viewGroup;
        this.VgvYg0wo = appCompatButton;
        this.P7K7Inc8 = textView3;
    }

    public /* synthetic */ bp9dZ9BB(View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.qoPGr6Ce = view;
        this.NCTxEWno = textView;
        this.MdtA4re8 = textView2;
        this.wxUZMvaN = textView3;
        this.VgvYg0wo = textView4;
        this.P7K7Inc8 = view2;
    }
}
