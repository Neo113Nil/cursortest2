package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class xp implements o70 {
    public static final Method U0LaHZX7;
    public static final Method i7xS8jrb;
    public boolean DK9slbsy;
    public final Handler FySoLYna;
    public ListAdapter MdtA4re8;
    public final Context NCTxEWno;
    public AdapterView.OnItemClickListener OxcuoDLp;
    public int Qr9iLBAD;
    public Rect WYNAV5pd;
    public AdapterView.OnItemSelectedListener amk52bBQ;
    public int b2ZJblxo;
    public boolean eVhOlqcC;
    public boolean k3x7lurq;
    public up lDXGDhIF;
    public final E3Msy4Bi lwWCatUu;
    public boolean ow5vqvCr;
    public View sjUBp5pO;
    public fe wxUZMvaN;
    public final int VgvYg0wo = -2;
    public int P7K7Inc8 = -2;
    public final int jb9XjC4I = 1002;
    public int OnDfzHZD = 0;
    public final int ygLcUYwZ = Integer.MAX_VALUE;
    public final tp KlHjfFWx = new tp(this, 1);
    public final wp Ey6iv0m0 = new wp(this);
    public final vp I5GHvsYW = new vp(this);
    public final tp RXQxj5Oe = new tp(this, 0);
    public final Rect gjV1z5T1 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                U0LaHZX7 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                i7xS8jrb = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public xp(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.NCTxEWno = context;
        this.FySoLYna = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.lDXGDhIF, i, 0);
        this.b2ZJblxo = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.Qr9iLBAD = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.eVhOlqcC = true;
        }
        obtainStyledAttributes.recycle();
        E3Msy4Bi e3Msy4Bi = new E3Msy4Bi(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.KlHjfFWx, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            e3Msy4Bi.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        e3Msy4Bi.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : ra.Ey6iv0m0(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.lwWCatUu = e3Msy4Bi;
        e3Msy4Bi.setInputMethodMode(1);
    }

    public final int MdtA4re8() {
        return this.b2ZJblxo;
    }

    @Override // defpackage.o70
    public final boolean NCTxEWno() {
        return this.lwWCatUu.isShowing();
    }

    public final void OnDfzHZD(int i) {
        this.b2ZJblxo = i;
    }

    public void OxcuoDLp(ListAdapter listAdapter) {
        up upVar = this.lDXGDhIF;
        if (upVar == null) {
            this.lDXGDhIF = new up(this);
        } else {
            ListAdapter listAdapter2 = this.MdtA4re8;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(upVar);
            }
        }
        this.MdtA4re8 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.lDXGDhIF);
        }
        fe feVar = this.wxUZMvaN;
        if (feVar != null) {
            feVar.setAdapter(this.MdtA4re8);
        }
    }

    public final Drawable VgvYg0wo() {
        return this.lwWCatUu.getBackground();
    }

    public final void amk52bBQ(int i) {
        Drawable background = this.lwWCatUu.getBackground();
        if (background == null) {
            this.P7K7Inc8 = i;
            return;
        }
        Rect rect = this.gjV1z5T1;
        background.getPadding(rect);
        this.P7K7Inc8 = rect.left + rect.right + i;
    }

    public final void b2ZJblxo(Drawable drawable) {
        this.lwWCatUu.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.o70
    public final void dismiss() {
        E3Msy4Bi e3Msy4Bi = this.lwWCatUu;
        e3Msy4Bi.dismiss();
        e3Msy4Bi.setContentView(null);
        this.wxUZMvaN = null;
        this.FySoLYna.removeCallbacks(this.KlHjfFWx);
    }

    @Override // defpackage.o70
    public final fe jb9XjC4I() {
        return this.wxUZMvaN;
    }

    public final void k3x7lurq(int i) {
        this.Qr9iLBAD = i;
        this.eVhOlqcC = true;
    }

    public final int lDXGDhIF() {
        if (this.eVhOlqcC) {
            return this.Qr9iLBAD;
        }
        return 0;
    }

    public fe qoPGr6Ce(Context context, boolean z) {
        return new fe(context, z);
    }

    @Override // defpackage.o70
    public final void wxUZMvaN() {
        int i;
        int paddingBottom;
        fe feVar;
        fe feVar2 = this.wxUZMvaN;
        Context context = this.NCTxEWno;
        E3Msy4Bi e3Msy4Bi = this.lwWCatUu;
        if (feVar2 == null) {
            fe qoPGr6Ce = qoPGr6Ce(context, !this.DK9slbsy);
            this.wxUZMvaN = qoPGr6Ce;
            qoPGr6Ce.setAdapter(this.MdtA4re8);
            this.wxUZMvaN.setOnItemClickListener(this.OxcuoDLp);
            this.wxUZMvaN.setFocusable(true);
            this.wxUZMvaN.setFocusableInTouchMode(true);
            this.wxUZMvaN.setOnItemSelectedListener(new qp(this));
            this.wxUZMvaN.setOnScrollListener(this.I5GHvsYW);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.amk52bBQ;
            if (onItemSelectedListener != null) {
                this.wxUZMvaN.setOnItemSelectedListener(onItemSelectedListener);
            }
            e3Msy4Bi.setContentView(this.wxUZMvaN);
        }
        Drawable background = e3Msy4Bi.getBackground();
        Rect rect = this.gjV1z5T1;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.eVhOlqcC) {
                this.Qr9iLBAD = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int qoPGr6Ce2 = rp.qoPGr6Ce(e3Msy4Bi, this.sjUBp5pO, this.Qr9iLBAD, e3Msy4Bi.getInputMethodMode() == 2);
        int i3 = this.VgvYg0wo;
        if (i3 == -1) {
            paddingBottom = qoPGr6Ce2 + i;
        } else {
            int i4 = this.P7K7Inc8;
            int qoPGr6Ce3 = this.wxUZMvaN.qoPGr6Ce(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), qoPGr6Ce2);
            paddingBottom = qoPGr6Ce3 + (qoPGr6Ce3 > 0 ? this.wxUZMvaN.getPaddingBottom() + this.wxUZMvaN.getPaddingTop() + i : 0);
        }
        boolean z = e3Msy4Bi.getInputMethodMode() == 2;
        e3Msy4Bi.setWindowLayoutType(this.jb9XjC4I);
        if (e3Msy4Bi.isShowing()) {
            if (this.sjUBp5pO.isAttachedToWindow()) {
                int i5 = this.P7K7Inc8;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.sjUBp5pO.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.P7K7Inc8;
                    if (z) {
                        e3Msy4Bi.setWidth(i6 == -1 ? -1 : 0);
                        e3Msy4Bi.setHeight(0);
                    } else {
                        e3Msy4Bi.setWidth(i6 == -1 ? -1 : 0);
                        e3Msy4Bi.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                e3Msy4Bi.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.sjUBp5pO;
                int i8 = this.b2ZJblxo;
                int i9 = this.Qr9iLBAD;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                e3Msy4Bi.update(view, i8, i9, i10, i3);
                return;
            }
            return;
        }
        int i11 = this.P7K7Inc8;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.sjUBp5pO.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        e3Msy4Bi.setWidth(i11);
        e3Msy4Bi.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = U0LaHZX7;
            if (method != null) {
                try {
                    method.invoke(e3Msy4Bi, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            sp.NCTxEWno(e3Msy4Bi, true);
        }
        e3Msy4Bi.setOutsideTouchable(true);
        e3Msy4Bi.setTouchInterceptor(this.Ey6iv0m0);
        if (this.ow5vqvCr) {
            e3Msy4Bi.setOverlapAnchor(this.k3x7lurq);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = i7xS8jrb;
            if (method2 != null) {
                try {
                    method2.invoke(e3Msy4Bi, this.WYNAV5pd);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            sp.qoPGr6Ce(e3Msy4Bi, this.WYNAV5pd);
        }
        e3Msy4Bi.showAsDropDown(this.sjUBp5pO, this.b2ZJblxo, this.Qr9iLBAD, this.OnDfzHZD);
        this.wxUZMvaN.setSelection(-1);
        if ((!this.DK9slbsy || this.wxUZMvaN.isInTouchMode()) && (feVar = this.wxUZMvaN) != null) {
            feVar.setListSelectionHidden(true);
            feVar.requestLayout();
        }
        if (this.DK9slbsy) {
            return;
        }
        this.FySoLYna.post(this.RXQxj5Oe);
    }
}
