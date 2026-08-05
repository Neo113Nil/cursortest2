package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRoundFragment;
import defpackage.b2ZJblxo;
import defpackage.c90;
import defpackage.d90;
import defpackage.ej0;
import defpackage.fn;
import defpackage.fo;
import defpackage.g9;
import defpackage.h90;
import defpackage.hd0;
import defpackage.ig0;
import defpackage.io;
import defpackage.j0;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.n50;
import defpackage.px;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.u6;
import defpackage.vl;
import defpackage.w30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SprintRoundFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public final u6 Sjrx9cEN;
    public ig0 TrssYQ34;
    public hd0 pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public SprintRoundFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(9, new px(8, this)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(h90.class), new qx(eIA6dogk, 10), new rx(this, eIA6dogk, 5), new qx(eIA6dogk, 11));
        this.Sjrx9cEN = new u6(new b2ZJblxo(6, this), (byte) 0);
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        hd0 hd0Var = this.pP9Y2m6O;
        hd0Var.getClass();
        ((RecyclerView) hd0Var.MdtA4re8).setAdapter(null);
        this.pP9Y2m6O = null;
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        zCflySGU();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((d90) NCTxEWno()).getClass();
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        if (this.ESscZ9M1 == null) {
            synchronized (this.VGmz0ccI) {
                try {
                    if (this.ESscZ9M1 == null) {
                        this.ESscZ9M1 = new j0(this);
                    }
                } finally {
                }
            }
        }
        return this.ESscZ9M1.NCTxEWno();
    }

    @Override // defpackage.li
    public final void RXQxj5Oe(Activity activity) {
        this.euDDoUNr = true;
        ig0 ig0Var = this.TrssYQ34;
        ej0.P7K7Inc8(ig0Var == null || j0.MdtA4re8(ig0Var) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        zCflySGU();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((d90) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_sprint_round, viewGroup, false);
        int i = R.id.actions_row;
        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.actions_row)) != null) {
            i = R.id.back_button;
            ImageView imageView = (ImageView) n50.qoPGr6Ce(inflate, R.id.back_button);
            if (imageView != null) {
                i = R.id.header;
                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                    i = R.id.header_title;
                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                        i = R.id.round_hint;
                        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.round_hint);
                        if (textView != null) {
                            i = R.id.round_list;
                            RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.round_list);
                            if (recyclerView != null) {
                                i = R.id.round_skip;
                                AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.round_skip);
                                if (appCompatButton != null) {
                                    i = R.id.round_submit;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.round_submit);
                                    if (appCompatButton2 != null) {
                                        i = R.id.round_timer;
                                        TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.round_timer);
                                        if (textView2 != null) {
                                            i = R.id.round_trait_label;
                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.round_trait_label)) != null) {
                                                i = R.id.round_trait_value;
                                                TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.round_trait_value);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    this.pP9Y2m6O = new hd0(constraintLayout, imageView, textView, recyclerView, appCompatButton, appCompatButton2, textView2, textView3);
                                                    constraintLayout.getClass();
                                                    return constraintLayout;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.li
    public final Context eVhOlqcC() {
        if (super.eVhOlqcC() == null && !this.g2aRJUAd) {
            return null;
        }
        zCflySGU();
        return this.TrssYQ34;
    }

    @Override // defpackage.li, defpackage.gm
    public final rg0 wxUZMvaN() {
        return le0.OxcuoDLp(this, super.wxUZMvaN());
    }

    @Override // defpackage.li
    public final void ytu5o6f4(View view) {
        view.getClass();
        hd0 hd0Var = this.pP9Y2m6O;
        hd0Var.getClass();
        g9 g9Var = null;
        ((RecyclerView) hd0Var.MdtA4re8).setItemAnimator(null);
        hd0 hd0Var2 = this.pP9Y2m6O;
        hd0Var2.getClass();
        ((RecyclerView) hd0Var2.MdtA4re8).setAdapter(this.Sjrx9cEN);
        hd0 hd0Var3 = this.pP9Y2m6O;
        hd0Var3.getClass();
        final int i = 0;
        ((ImageView) hd0Var3.NCTxEWno).setOnClickListener(new View.OnClickListener(this) { // from class: a90
            public final /* synthetic */ SprintRoundFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                SprintRoundFragment sprintRoundFragment = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        ej0.sjUBp5pO(sprintRoundFragment).wxUZMvaN();
                        return;
                    case 1:
                        h90 h90Var = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var.OnDfzHZD) {
                            return;
                        }
                        h90Var.k3x7lurq = null;
                        q90 q90Var = h90Var.ygLcUYwZ;
                        if (q90Var != null) {
                            q90Var.b2ZJblxo(null);
                        }
                        h90Var.ygLcUYwZ = fn.Ey6iv0m0(le0.FySoLYna(h90Var), null, new y7(h90Var, null, 7), 3);
                        return;
                    default:
                        h90 h90Var2 = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var2.OnDfzHZD || h90Var2.jb9XjC4I.isEmpty()) {
                            return;
                        }
                        h90Var2.OnDfzHZD = true;
                        List list = h90Var2.jb9XjC4I;
                        int i3 = 0;
                        final zk[] zkVarArr = {new b2ZJblxo(7, h90Var2), new x80(3)};
                        List XrPeKzBk = x5.XrPeKzBk(list, new Comparator() { // from class: y6
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                for (zk zkVar : zkVarArr) {
                                    int k3x7lurq = w30.k3x7lurq((Comparable) zkVar.ow5vqvCr(obj), (Comparable) zkVar.ow5vqvCr(obj2));
                                    if (k3x7lurq != 0) {
                                        return k3x7lurq;
                                    }
                                }
                                return 0;
                            }
                        });
                        ArrayList arrayList = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
                        Iterator it = XrPeKzBk.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((xx) it.next()).qoPGr6Ce));
                        }
                        List list2 = h90Var2.eVhOlqcC;
                        list2.getClass();
                        Iterable enVar = new en(0, list2.size() - 1, 1);
                        if (!(enVar instanceof Collection) || !((Collection) enVar).isEmpty()) {
                            Iterator it2 = enVar.iterator();
                            while (((dn) it2).wxUZMvaN) {
                                int nextInt = ((cn) it2).nextInt();
                                if (((Number) h90Var2.eVhOlqcC.get(nextInt)).longValue() == ((Number) arrayList.get(nextInt)).longValue() && (i3 = i3 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                        fn.Ey6iv0m0(le0.FySoLYna(h90Var2), null, new g90(h90Var2, System.currentTimeMillis() - h90Var2.ow5vqvCr, (i3 * 100) / h90Var2.eVhOlqcC.size(), arrayList, null), 3);
                        return;
                }
            }
        });
        hd0 hd0Var4 = this.pP9Y2m6O;
        hd0Var4.getClass();
        final int i2 = 1;
        ((AppCompatButton) hd0Var4.wxUZMvaN).setOnClickListener(new View.OnClickListener(this) { // from class: a90
            public final /* synthetic */ SprintRoundFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                SprintRoundFragment sprintRoundFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(sprintRoundFragment).wxUZMvaN();
                        return;
                    case 1:
                        h90 h90Var = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var.OnDfzHZD) {
                            return;
                        }
                        h90Var.k3x7lurq = null;
                        q90 q90Var = h90Var.ygLcUYwZ;
                        if (q90Var != null) {
                            q90Var.b2ZJblxo(null);
                        }
                        h90Var.ygLcUYwZ = fn.Ey6iv0m0(le0.FySoLYna(h90Var), null, new y7(h90Var, null, 7), 3);
                        return;
                    default:
                        h90 h90Var2 = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var2.OnDfzHZD || h90Var2.jb9XjC4I.isEmpty()) {
                            return;
                        }
                        h90Var2.OnDfzHZD = true;
                        List list = h90Var2.jb9XjC4I;
                        int i3 = 0;
                        final zk[] zkVarArr = {new b2ZJblxo(7, h90Var2), new x80(3)};
                        List XrPeKzBk = x5.XrPeKzBk(list, new Comparator() { // from class: y6
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                for (zk zkVar : zkVarArr) {
                                    int k3x7lurq = w30.k3x7lurq((Comparable) zkVar.ow5vqvCr(obj), (Comparable) zkVar.ow5vqvCr(obj2));
                                    if (k3x7lurq != 0) {
                                        return k3x7lurq;
                                    }
                                }
                                return 0;
                            }
                        });
                        ArrayList arrayList = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
                        Iterator it = XrPeKzBk.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((xx) it.next()).qoPGr6Ce));
                        }
                        List list2 = h90Var2.eVhOlqcC;
                        list2.getClass();
                        Iterable enVar = new en(0, list2.size() - 1, 1);
                        if (!(enVar instanceof Collection) || !((Collection) enVar).isEmpty()) {
                            Iterator it2 = enVar.iterator();
                            while (((dn) it2).wxUZMvaN) {
                                int nextInt = ((cn) it2).nextInt();
                                if (((Number) h90Var2.eVhOlqcC.get(nextInt)).longValue() == ((Number) arrayList.get(nextInt)).longValue() && (i3 = i3 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                        fn.Ey6iv0m0(le0.FySoLYna(h90Var2), null, new g90(h90Var2, System.currentTimeMillis() - h90Var2.ow5vqvCr, (i3 * 100) / h90Var2.eVhOlqcC.size(), arrayList, null), 3);
                        return;
                }
            }
        });
        hd0 hd0Var5 = this.pP9Y2m6O;
        hd0Var5.getClass();
        final int i3 = 2;
        ((AppCompatButton) hd0Var5.VgvYg0wo).setOnClickListener(new View.OnClickListener(this) { // from class: a90
            public final /* synthetic */ SprintRoundFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                SprintRoundFragment sprintRoundFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(sprintRoundFragment).wxUZMvaN();
                        return;
                    case 1:
                        h90 h90Var = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var.OnDfzHZD) {
                            return;
                        }
                        h90Var.k3x7lurq = null;
                        q90 q90Var = h90Var.ygLcUYwZ;
                        if (q90Var != null) {
                            q90Var.b2ZJblxo(null);
                        }
                        h90Var.ygLcUYwZ = fn.Ey6iv0m0(le0.FySoLYna(h90Var), null, new y7(h90Var, null, 7), 3);
                        return;
                    default:
                        h90 h90Var2 = (h90) sprintRoundFragment.tef3qNMP.getValue();
                        if (h90Var2.OnDfzHZD || h90Var2.jb9XjC4I.isEmpty()) {
                            return;
                        }
                        h90Var2.OnDfzHZD = true;
                        List list = h90Var2.jb9XjC4I;
                        int i32 = 0;
                        final zk[] zkVarArr = {new b2ZJblxo(7, h90Var2), new x80(3)};
                        List XrPeKzBk = x5.XrPeKzBk(list, new Comparator() { // from class: y6
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                for (zk zkVar : zkVarArr) {
                                    int k3x7lurq = w30.k3x7lurq((Comparable) zkVar.ow5vqvCr(obj), (Comparable) zkVar.ow5vqvCr(obj2));
                                    if (k3x7lurq != 0) {
                                        return k3x7lurq;
                                    }
                                }
                                return 0;
                            }
                        });
                        ArrayList arrayList = new ArrayList(z5.bvfAo0eO(XrPeKzBk, 10));
                        Iterator it = XrPeKzBk.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((xx) it.next()).qoPGr6Ce));
                        }
                        List list2 = h90Var2.eVhOlqcC;
                        list2.getClass();
                        Iterable enVar = new en(0, list2.size() - 1, 1);
                        if (!(enVar instanceof Collection) || !((Collection) enVar).isEmpty()) {
                            Iterator it2 = enVar.iterator();
                            while (((dn) it2).wxUZMvaN) {
                                int nextInt = ((cn) it2).nextInt();
                                if (((Number) h90Var2.eVhOlqcC.get(nextInt)).longValue() == ((Number) arrayList.get(nextInt)).longValue() && (i32 = i32 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                        fn.Ey6iv0m0(le0.FySoLYna(h90Var2), null, new g90(h90Var2, System.currentTimeMillis() - h90Var2.ow5vqvCr, (i32 * 100) / h90Var2.eVhOlqcC.size(), arrayList, null), 3);
                        return;
                }
            }
        });
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new c90(this, g9Var, 3), 3);
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new c90(this, g9Var, i2), 3);
    }

    public final void zCflySGU() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }
}
