package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z3 extends hs implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener DK9slbsy;
    public int Ey6iv0m0;
    public boolean FySoLYna;
    public int I5GHvsYW;
    public boolean KlHjfFWx;
    public final Context MdtA4re8;
    public int OxcuoDLp;
    public final boolean P7K7Inc8;
    public final int VgvYg0wo;
    public ViewTreeObserver WYNAV5pd;
    public boolean amk52bBQ;
    public final Handler b2ZJblxo;
    public os gjV1z5T1;
    public View lDXGDhIF;
    public boolean lwWCatUu;
    public View sjUBp5pO;
    public final int wxUZMvaN;
    public final ArrayList Qr9iLBAD = new ArrayList();
    public final ArrayList jb9XjC4I = new ArrayList();
    public final c eVhOlqcC = new c(2, this);
    public final w3 k3x7lurq = new w3(0, this);
    public final tg0 ow5vqvCr = new tg0(10, this);
    public int OnDfzHZD = 0;
    public int ygLcUYwZ = 0;
    public boolean RXQxj5Oe = false;

    public z3(Context context, View view, int i, boolean z) {
        this.MdtA4re8 = context;
        this.lDXGDhIF = view;
        this.VgvYg0wo = i;
        this.P7K7Inc8 = z;
        this.OxcuoDLp = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.wxUZMvaN = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.b2ZJblxo = new Handler();
    }

    @Override // defpackage.hs
    public final void Ey6iv0m0(PopupWindow.OnDismissListener onDismissListener) {
        this.DK9slbsy = onDismissListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FySoLYna(yr yrVar) {
        boolean z;
        boolean z2;
        View view;
        y3 y3Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        vr vrVar;
        int i4;
        int firstVisiblePosition;
        Context context = this.MdtA4re8;
        LayoutInflater from = LayoutInflater.from(context);
        vr vrVar2 = new vr(yrVar, from, this.P7K7Inc8, R.layout.abc_cascading_menu_item_layout);
        if (!NCTxEWno() && this.RXQxj5Oe) {
            vrVar2.MdtA4re8 = true;
        } else if (NCTxEWno()) {
            int size = yrVar.P7K7Inc8.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = yrVar.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            vrVar2.MdtA4re8 = z;
        }
        int lDXGDhIF = hs.lDXGDhIF(vrVar2, context, this.wxUZMvaN);
        ns nsVar = new ns(context, null, this.VgvYg0wo, 0);
        nsVar.Mq3SeTnW = this.ow5vqvCr;
        nsVar.OxcuoDLp = this;
        E3Msy4Bi e3Msy4Bi = nsVar.lwWCatUu;
        e3Msy4Bi.setOnDismissListener(this);
        nsVar.sjUBp5pO = this.lDXGDhIF;
        nsVar.OnDfzHZD = this.ygLcUYwZ;
        nsVar.DK9slbsy = true;
        e3Msy4Bi.setFocusable(true);
        e3Msy4Bi.setInputMethodMode(2);
        nsVar.OxcuoDLp(vrVar2);
        nsVar.amk52bBQ(lDXGDhIF);
        nsVar.OnDfzHZD = this.ygLcUYwZ;
        ArrayList arrayList = this.jb9XjC4I;
        if (arrayList.size() > 0) {
            y3Var = (y3) arrayList.get(arrayList.size() - 1);
            yr yrVar2 = y3Var.NCTxEWno;
            int size2 = yrVar2.P7K7Inc8.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = yrVar2.getItem(i6);
                if (menuItem.hasSubMenu() && yrVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                z2 = 0;
                view = null;
            } else {
                fe feVar = y3Var.qoPGr6Ce.wxUZMvaN;
                ListAdapter adapter = feVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    vrVar = (vr) headerViewListAdapter.getWrappedAdapter();
                } else {
                    vrVar = (vr) adapter;
                    i4 = 0;
                }
                int count = vrVar.getCount();
                int i7 = 0;
                boolean z3 = false;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == vrVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i4) - feVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < feVar.getChildCount()) {
                    view = feVar.getChildAt(firstVisiblePosition);
                    z2 = z3;
                } else {
                    view = null;
                    z2 = z3;
                }
            }
        } else {
            z2 = 0;
            view = null;
            y3Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = ns.euDDoUNr;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(e3Msy4Bi, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                ls.qoPGr6Ce(e3Msy4Bi, z2);
            }
            ks.qoPGr6Ce(e3Msy4Bi, null);
            fe feVar2 = ((y3) arrayList.get(arrayList.size() - 1)).qoPGr6Ce.wxUZMvaN;
            int[] iArr = new int[2];
            feVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.sjUBp5pO.getWindowVisibleDisplayFrame(rect);
            if (this.OxcuoDLp == 1) {
                if (feVar2.getWidth() + iArr[0] + lDXGDhIF > rect.right) {
                    i = 0;
                    boolean z4 = i != 1;
                    this.OxcuoDLp = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        nsVar.sjUBp5pO = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.lDXGDhIF.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.ygLcUYwZ & 7) == 5) {
                            iArr2[0] = this.lDXGDhIF.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i8 = iArr3[0] - iArr2[0];
                        i2 = iArr3[1] - iArr2[1];
                        i3 = i8;
                    }
                    if ((this.ygLcUYwZ & 5) == 5) {
                        if (z4) {
                            width = i3 + view.getWidth();
                            nsVar.b2ZJblxo = width;
                            nsVar.ow5vqvCr = true;
                            nsVar.k3x7lurq = true;
                            nsVar.k3x7lurq(i2);
                        }
                        width = i3 - lDXGDhIF;
                        nsVar.b2ZJblxo = width;
                        nsVar.ow5vqvCr = true;
                        nsVar.k3x7lurq = true;
                        nsVar.k3x7lurq(i2);
                    } else if (z4) {
                        width = i3 + lDXGDhIF;
                        nsVar.b2ZJblxo = width;
                        nsVar.ow5vqvCr = true;
                        nsVar.k3x7lurq = true;
                        nsVar.k3x7lurq(i2);
                    } else {
                        lDXGDhIF = view.getWidth();
                        width = i3 - lDXGDhIF;
                        nsVar.b2ZJblxo = width;
                        nsVar.ow5vqvCr = true;
                        nsVar.k3x7lurq = true;
                        nsVar.k3x7lurq(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.OxcuoDLp = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.ygLcUYwZ & 5) == 5) {
                }
            } else {
                if (iArr[0] - lDXGDhIF >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.OxcuoDLp = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.ygLcUYwZ & 5) == 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.OxcuoDLp = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.ygLcUYwZ & 5) == 5) {
                }
            }
        } else {
            if (this.amk52bBQ) {
                nsVar.b2ZJblxo = this.Ey6iv0m0;
            }
            if (this.KlHjfFWx) {
                nsVar.k3x7lurq(this.I5GHvsYW);
            }
            Rect rect2 = this.NCTxEWno;
            nsVar.WYNAV5pd = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new y3(nsVar, yrVar, this.OxcuoDLp));
        nsVar.wxUZMvaN();
        fe feVar3 = nsVar.wxUZMvaN;
        feVar3.setOnKeyListener(this);
        if (y3Var == null && this.FySoLYna && yrVar.OnDfzHZD != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) feVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(yrVar.OnDfzHZD);
            feVar3.addHeaderView(frameLayout, null, false);
            nsVar.wxUZMvaN();
        }
    }

    @Override // defpackage.hs
    public final void I5GHvsYW(boolean z) {
        this.FySoLYna = z;
    }

    @Override // defpackage.hs
    public final void KlHjfFWx(int i) {
        this.amk52bBQ = true;
        this.Ey6iv0m0 = i;
    }

    @Override // defpackage.o70
    public final boolean NCTxEWno() {
        ArrayList arrayList = this.jb9XjC4I;
        return arrayList.size() > 0 && ((y3) arrayList.get(0)).qoPGr6Ce.lwWCatUu.isShowing();
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        return null;
    }

    @Override // defpackage.hs
    public final void OxcuoDLp(boolean z) {
        this.RXQxj5Oe = z;
    }

    @Override // defpackage.ps
    public final void P7K7Inc8(os osVar) {
        this.gjV1z5T1 = osVar;
    }

    @Override // defpackage.hs
    public final void RXQxj5Oe(int i) {
        this.KlHjfFWx = true;
        this.I5GHvsYW = i;
    }

    @Override // defpackage.hs
    public final void amk52bBQ(int i) {
        if (this.OnDfzHZD != i) {
            this.OnDfzHZD = i;
            this.ygLcUYwZ = Gravity.getAbsoluteGravity(i, this.lDXGDhIF.getLayoutDirection());
        }
    }

    @Override // defpackage.o70
    public final void dismiss() {
        ArrayList arrayList = this.jb9XjC4I;
        int size = arrayList.size();
        if (size > 0) {
            y3[] y3VarArr = (y3[]) arrayList.toArray(new y3[size]);
            for (int i = size - 1; i >= 0; i--) {
                y3 y3Var = y3VarArr[i];
                if (y3Var.qoPGr6Ce.lwWCatUu.isShowing()) {
                    y3Var.qoPGr6Ce.dismiss();
                }
            }
        }
    }

    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        ArrayList arrayList = this.jb9XjC4I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((y3) obj).qoPGr6Ce.wxUZMvaN.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((vr) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.o70
    public final fe jb9XjC4I() {
        ArrayList arrayList = this.jb9XjC4I;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((y3) arrayList.get(arrayList.size() - 1)).qoPGr6Ce.wxUZMvaN;
    }

    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        ArrayList arrayList = this.jb9XjC4I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y3 y3Var = (y3) obj;
            if (ka0Var == y3Var.NCTxEWno) {
                y3Var.qoPGr6Ce.wxUZMvaN.requestFocus();
                return true;
            }
        }
        if (!ka0Var.hasVisibleItems()) {
            return false;
        }
        ygLcUYwZ(ka0Var);
        os osVar = this.gjV1z5T1;
        if (osVar != null) {
            osVar.Ey6iv0m0(ka0Var);
        }
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        y3 y3Var;
        ArrayList arrayList = this.jb9XjC4I;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                y3Var = null;
                break;
            }
            y3Var = (y3) arrayList.get(i);
            if (!y3Var.qoPGr6Ce.lwWCatUu.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (y3Var != null) {
            y3Var.NCTxEWno.MdtA4re8(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        return false;
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
        ArrayList arrayList = this.jb9XjC4I;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (yrVar == ((y3) arrayList.get(i)).NCTxEWno) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((y3) arrayList.get(i2)).NCTxEWno.MdtA4re8(false);
        }
        y3 y3Var = (y3) arrayList.remove(i);
        yr yrVar2 = y3Var.NCTxEWno;
        ns nsVar = y3Var.qoPGr6Ce;
        E3Msy4Bi e3Msy4Bi = nsVar.lwWCatUu;
        yrVar2.amk52bBQ(this);
        if (this.lwWCatUu) {
            ks.NCTxEWno(e3Msy4Bi, null);
            e3Msy4Bi.setAnimationStyle(0);
        }
        nsVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.OxcuoDLp = ((y3) arrayList.get(size2 - 1)).MdtA4re8;
        } else {
            this.OxcuoDLp = this.lDXGDhIF.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((y3) arrayList.get(0)).NCTxEWno.MdtA4re8(false);
                return;
            }
            return;
        }
        dismiss();
        os osVar = this.gjV1z5T1;
        if (osVar != null) {
            osVar.qoPGr6Ce(yrVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.WYNAV5pd;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.WYNAV5pd.removeGlobalOnLayoutListener(this.eVhOlqcC);
            }
            this.WYNAV5pd = null;
        }
        this.sjUBp5pO.removeOnAttachStateChangeListener(this.k3x7lurq);
        this.DK9slbsy.onDismiss();
    }

    @Override // defpackage.hs
    public final void sjUBp5pO(View view) {
        if (this.lDXGDhIF != view) {
            this.lDXGDhIF = view;
            this.ygLcUYwZ = Gravity.getAbsoluteGravity(this.OnDfzHZD, view.getLayoutDirection());
        }
    }

    @Override // defpackage.o70
    public final void wxUZMvaN() {
        if (NCTxEWno()) {
            return;
        }
        ArrayList arrayList = this.Qr9iLBAD;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            FySoLYna((yr) obj);
        }
        arrayList.clear();
        View view = this.lDXGDhIF;
        this.sjUBp5pO = view;
        if (view != null) {
            boolean z = this.WYNAV5pd == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.WYNAV5pd = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.eVhOlqcC);
            }
            this.sjUBp5pO.addOnAttachStateChangeListener(this.k3x7lurq);
        }
    }

    @Override // defpackage.hs
    public final void ygLcUYwZ(yr yrVar) {
        yrVar.NCTxEWno(this, this.MdtA4re8);
        if (NCTxEWno()) {
            FySoLYna(yrVar);
        } else {
            this.Qr9iLBAD.add(yrVar);
        }
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
    }
}
