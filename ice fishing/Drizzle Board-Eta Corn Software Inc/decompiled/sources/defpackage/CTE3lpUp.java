package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class CTE3lpUp implements ps {
    public int DK9slbsy;
    public XrPeKzBk FySoLYna;
    public f7oeun2L I5GHvsYW;
    public boolean KlHjfFWx;
    public Context MdtA4re8;
    public final Context NCTxEWno;
    public boolean OnDfzHZD;
    public int OxcuoDLp;
    public os P7K7Inc8;
    public f7oeun2L RXQxj5Oe;
    public final LayoutInflater VgvYg0wo;
    public int amk52bBQ;
    public int eVhOlqcC;
    public uQ3KJUK5 gjV1z5T1;
    public rs jb9XjC4I;
    public N2kLh4D5 k3x7lurq;
    public boolean lDXGDhIF;
    public Drawable ow5vqvCr;
    public int sjUBp5pO;
    public yr wxUZMvaN;
    public boolean ygLcUYwZ;
    public final int b2ZJblxo = R.layout.abc_action_menu_layout;
    public final int Qr9iLBAD = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray Ey6iv0m0 = new SparseBooleanArray();
    public final tg0 WYNAV5pd = new tg0(2, this);

    public CTE3lpUp(Context context) {
        this.NCTxEWno = context;
        this.VgvYg0wo = LayoutInflater.from(context);
    }

    @Override // defpackage.ps
    public final boolean MdtA4re8(cs csVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [qs] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View NCTxEWno(cs csVar, View view, ViewGroup viewGroup) {
        View actionView = csVar.getActionView();
        if (actionView == null || csVar.VgvYg0wo()) {
            ActionMenuItemView actionMenuItemView = view instanceof qs ? (qs) view : (qs) this.VgvYg0wo.inflate(this.Qr9iLBAD, viewGroup, false);
            actionMenuItemView.qoPGr6Ce(csVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.jb9XjC4I);
            uQ3KJUK5 uq3kjuk5 = this.gjV1z5T1;
            if (uq3kjuk5 == null) {
                uq3kjuk5 = new uQ3KJUK5(this);
                this.gjV1z5T1 = uq3kjuk5;
            }
            actionMenuItemView2.setPopupCallback(uq3kjuk5);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(csVar.i7xS8jrb ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof X1t0wlBd)) {
            actionView.setLayoutParams(ActionMenuView.eVhOlqcC(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        S7WAX0X5 s7wax0x5 = new S7WAX0X5();
        s7wax0x5.NCTxEWno = this.DK9slbsy;
        return s7wax0x5;
    }

    @Override // defpackage.ps
    public final void P7K7Inc8(os osVar) {
        throw null;
    }

    @Override // defpackage.ps
    public final void Qr9iLBAD(Context context, yr yrVar) {
        this.MdtA4re8 = context;
        LayoutInflater.from(context);
        this.wxUZMvaN = yrVar;
        Resources resources = context.getResources();
        if (!this.lDXGDhIF) {
            this.ygLcUYwZ = true;
        }
        int i = 2;
        this.sjUBp5pO = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.amk52bBQ = i;
        int i4 = this.sjUBp5pO;
        if (this.ygLcUYwZ) {
            if (this.k3x7lurq == null) {
                N2kLh4D5 n2kLh4D5 = new N2kLh4D5(this, this.NCTxEWno);
                this.k3x7lurq = n2kLh4D5;
                if (this.OnDfzHZD) {
                    n2kLh4D5.setImageDrawable(this.ow5vqvCr);
                    this.ow5vqvCr = null;
                    this.OnDfzHZD = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k3x7lurq.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k3x7lurq.getMeasuredWidth();
        } else {
            this.k3x7lurq = null;
        }
        this.OxcuoDLp = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof S7WAX0X5) && (i = ((S7WAX0X5) parcelable).NCTxEWno) > 0 && (findItem = this.wxUZMvaN.findItem(i)) != null) {
            k3x7lurq((ka0) findItem.getSubMenu());
        }
    }

    @Override // defpackage.ps
    public final boolean b2ZJblxo(cs csVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.jb9XjC4I;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            yr yrVar = this.wxUZMvaN;
            if (yrVar != null) {
                yrVar.jb9XjC4I();
                ArrayList ow5vqvCr = this.wxUZMvaN.ow5vqvCr();
                int size = ow5vqvCr.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    cs csVar = (cs) ow5vqvCr.get(i2);
                    if ((csVar.gjV1z5T1 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        cs itemData = childAt instanceof qs ? ((qs) childAt).getItemData() : null;
                        View NCTxEWno = NCTxEWno(csVar, childAt, viewGroup);
                        if (csVar != itemData) {
                            NCTxEWno.setPressed(false);
                            NCTxEWno.jumpDrawablesToCurrentState();
                        }
                        if (NCTxEWno != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) NCTxEWno.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(NCTxEWno);
                            }
                            ((ViewGroup) this.jb9XjC4I).addView(NCTxEWno, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k3x7lurq) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.jb9XjC4I).requestLayout();
        yr yrVar2 = this.wxUZMvaN;
        if (yrVar2 != null) {
            yrVar2.jb9XjC4I();
            ArrayList arrayList2 = yrVar2.jb9XjC4I;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ds dsVar = ((cs) arrayList2.get(i3)).lwWCatUu;
            }
        }
        yr yrVar3 = this.wxUZMvaN;
        if (yrVar3 != null) {
            yrVar3.jb9XjC4I();
            arrayList = yrVar3.eVhOlqcC;
        }
        if (this.ygLcUYwZ && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((cs) arrayList.get(0)).i7xS8jrb;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        N2kLh4D5 n2kLh4D5 = this.k3x7lurq;
        if (z2) {
            if (n2kLh4D5 == null) {
                n2kLh4D5 = new N2kLh4D5(this, this.NCTxEWno);
                this.k3x7lurq = n2kLh4D5;
            }
            ViewGroup viewGroup3 = (ViewGroup) n2kLh4D5.getParent();
            if (viewGroup3 != this.jb9XjC4I) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k3x7lurq);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.jb9XjC4I;
                N2kLh4D5 n2kLh4D52 = this.k3x7lurq;
                actionMenuView.getClass();
                X1t0wlBd jb9XjC4I = ActionMenuView.jb9XjC4I();
                jb9XjC4I.qoPGr6Ce = true;
                actionMenuView.addView(n2kLh4D52, jb9XjC4I);
            }
        } else if (n2kLh4D5 != null) {
            Object parent = n2kLh4D5.getParent();
            Object obj = this.jb9XjC4I;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.k3x7lurq);
            }
        }
        ((ActionMenuView) this.jb9XjC4I).setOverflowReserved(this.ygLcUYwZ);
    }

    @Override // defpackage.ps
    public final int getId() {
        return this.eVhOlqcC;
    }

    public final boolean jb9XjC4I() {
        f7oeun2L f7oeun2l = this.I5GHvsYW;
        return f7oeun2l != null && f7oeun2l.NCTxEWno();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        boolean z;
        if (ka0Var.hasVisibleItems()) {
            ka0 ka0Var2 = ka0Var;
            while (true) {
                yr yrVar = ka0Var2.DK9slbsy;
                if (yrVar == this.wxUZMvaN) {
                    break;
                }
                ka0Var2 = (ka0) yrVar;
            }
            cs csVar = ka0Var2.lwWCatUu;
            ViewGroup viewGroup = (ViewGroup) this.jb9XjC4I;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof qs) && ((qs) childAt).getItemData() == csVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.DK9slbsy = ka0Var.lwWCatUu.qoPGr6Ce;
                int size = ka0Var.P7K7Inc8.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = ka0Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                f7oeun2L f7oeun2l = new f7oeun2L(this, this.MdtA4re8, ka0Var, view);
                this.RXQxj5Oe = f7oeun2l;
                f7oeun2l.b2ZJblxo = z;
                hs hsVar = f7oeun2l.jb9XjC4I;
                if (hsVar != null) {
                    hsVar.OxcuoDLp(z);
                }
                f7oeun2L f7oeun2l2 = this.RXQxj5Oe;
                if (!f7oeun2l2.NCTxEWno()) {
                    if (f7oeun2l2.VgvYg0wo == null) {
                        m1.Ey6iv0m0("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    f7oeun2l2.wxUZMvaN(0, 0, false, false);
                }
                os osVar = this.P7K7Inc8;
                if (osVar != null) {
                    osVar.Ey6iv0m0(ka0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        CTE3lpUp cTE3lpUp = this;
        yr yrVar = cTE3lpUp.wxUZMvaN;
        if (yrVar != null) {
            arrayList = yrVar.ow5vqvCr();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = cTE3lpUp.amk52bBQ;
        int i4 = cTE3lpUp.OxcuoDLp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cTE3lpUp.jb9XjC4I;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            cs csVar = (cs) arrayList.get(i5);
            int i8 = csVar.WYNAV5pd;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (cTE3lpUp.KlHjfFWx && csVar.i7xS8jrb) {
                i3 = 0;
            }
            i5++;
        }
        if (cTE3lpUp.ygLcUYwZ && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = cTE3lpUp.Ey6iv0m0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            cs csVar2 = (cs) arrayList.get(i10);
            int i12 = csVar2.WYNAV5pd;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = csVar2.NCTxEWno;
            if (z3) {
                View NCTxEWno = cTE3lpUp.NCTxEWno(csVar2, null, viewGroup);
                NCTxEWno.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = NCTxEWno.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                csVar2.P7K7Inc8(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View NCTxEWno2 = cTE3lpUp.NCTxEWno(csVar2, null, viewGroup);
                    NCTxEWno2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = NCTxEWno2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        cs csVar3 = (cs) arrayList.get(i14);
                        if (csVar3.NCTxEWno == i13) {
                            if ((csVar3.gjV1z5T1 & 32) == 32) {
                                i9++;
                            }
                            csVar3.P7K7Inc8(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                csVar2.P7K7Inc8(z5);
            } else {
                csVar2.P7K7Inc8(false);
                i10++;
                i2 = 2;
                cTE3lpUp = this;
                z = true;
            }
            i10++;
            i2 = 2;
            cTE3lpUp = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
        wxUZMvaN();
        f7oeun2L f7oeun2l = this.RXQxj5Oe;
        if (f7oeun2l != null && f7oeun2l.NCTxEWno()) {
            f7oeun2l.jb9XjC4I.dismiss();
        }
        os osVar = this.P7K7Inc8;
        if (osVar != null) {
            osVar.qoPGr6Ce(yrVar, z);
        }
    }

    public final boolean wxUZMvaN() {
        Object obj;
        XrPeKzBk xrPeKzBk = this.FySoLYna;
        if (xrPeKzBk != null && (obj = this.jb9XjC4I) != null) {
            ((View) obj).removeCallbacks(xrPeKzBk);
            this.FySoLYna = null;
            return true;
        }
        f7oeun2L f7oeun2l = this.I5GHvsYW;
        if (f7oeun2l == null) {
            return false;
        }
        if (f7oeun2l.NCTxEWno()) {
            f7oeun2l.jb9XjC4I.dismiss();
        }
        return true;
    }

    public final boolean ygLcUYwZ() {
        yr yrVar;
        if (this.ygLcUYwZ && !jb9XjC4I() && (yrVar = this.wxUZMvaN) != null && this.jb9XjC4I != null && this.FySoLYna == null) {
            yrVar.jb9XjC4I();
            if (!yrVar.eVhOlqcC.isEmpty()) {
                XrPeKzBk xrPeKzBk = new XrPeKzBk(this, 0, new f7oeun2L(this, this.MdtA4re8, this.wxUZMvaN, this.k3x7lurq));
                this.FySoLYna = xrPeKzBk;
                ((View) this.jb9XjC4I).post(xrPeKzBk);
                return true;
            }
        }
        return false;
    }
}
