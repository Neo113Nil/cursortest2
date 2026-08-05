package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class VZZbw3BB {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public final Object qoPGr6Ce;
    public Object wxUZMvaN;

    public VZZbw3BB(Typeface typeface, us usVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.wxUZMvaN = typeface;
        this.qoPGr6Ce = usVar;
        this.MdtA4re8 = new vs(1024);
        int qoPGr6Ce = usVar.qoPGr6Ce(6);
        if (qoPGr6Ce != 0) {
            int i5 = qoPGr6Ce + usVar.NCTxEWno;
            i = ((ByteBuffer) usVar.VgvYg0wo).getInt(((ByteBuffer) usVar.VgvYg0wo).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.NCTxEWno = new char[i * 2];
        int qoPGr6Ce2 = usVar.qoPGr6Ce(6);
        if (qoPGr6Ce2 != 0) {
            int i6 = qoPGr6Ce2 + usVar.NCTxEWno;
            i2 = ((ByteBuffer) usVar.VgvYg0wo).getInt(((ByteBuffer) usVar.VgvYg0wo).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            te0 te0Var = new te0(this, i7);
            ts NCTxEWno = te0Var.NCTxEWno();
            int qoPGr6Ce3 = NCTxEWno.qoPGr6Ce(4);
            Character.toChars(qoPGr6Ce3 != 0 ? ((ByteBuffer) NCTxEWno.VgvYg0wo).getInt(qoPGr6Ce3 + NCTxEWno.NCTxEWno) : 0, (char[]) this.NCTxEWno, i7 * 2);
            ts NCTxEWno2 = te0Var.NCTxEWno();
            int qoPGr6Ce4 = NCTxEWno2.qoPGr6Ce(16);
            if (qoPGr6Ce4 != 0) {
                int i8 = qoPGr6Ce4 + NCTxEWno2.NCTxEWno;
                i3 = ((ByteBuffer) NCTxEWno2.VgvYg0wo).getInt(((ByteBuffer) NCTxEWno2.VgvYg0wo).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                m1.sjUBp5pO("invalid metadata codepoint length");
                throw null;
            }
            vs vsVar = (vs) this.MdtA4re8;
            ts NCTxEWno3 = te0Var.NCTxEWno();
            int qoPGr6Ce5 = NCTxEWno3.qoPGr6Ce(16);
            if (qoPGr6Ce5 != 0) {
                int i9 = qoPGr6Ce5 + NCTxEWno3.NCTxEWno;
                i4 = ((ByteBuffer) NCTxEWno3.VgvYg0wo).getInt(((ByteBuffer) NCTxEWno3.VgvYg0wo).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            vsVar.qoPGr6Ce(te0Var, 0, i4 - 1);
        }
    }

    public li MdtA4re8(String str) {
        for (xj xjVar : ((HashMap) this.NCTxEWno).values()) {
            if (xjVar != null) {
                li liVar = xjVar.MdtA4re8;
                if (!str.equals(liVar.P7K7Inc8)) {
                    liVar = liVar.RXQxj5Oe.MdtA4re8.MdtA4re8(str);
                }
                if (liVar != null) {
                    return liVar;
                }
            }
        }
        return null;
    }

    public li NCTxEWno(String str) {
        xj xjVar = (xj) ((HashMap) this.NCTxEWno).get(str);
        if (xjVar != null) {
            return xjVar.MdtA4re8;
        }
        return null;
    }

    public Bundle OnDfzHZD(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.MdtA4re8;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public ArrayList P7K7Inc8() {
        ArrayList arrayList = new ArrayList();
        for (xj xjVar : ((HashMap) this.NCTxEWno).values()) {
            if (xjVar != null) {
                arrayList.add(xjVar.MdtA4re8);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ng0 Qr9iLBAD(p5 p5Var, String str) {
        ng0 ng0Var;
        ng0 qoPGr6Ce;
        synchronized (((k00) this.wxUZMvaN)) {
            try {
                ug0 ug0Var = (ug0) this.qoPGr6Ce;
                ug0Var.getClass();
                ng0Var = (ng0) ug0Var.qoPGr6Ce.get(str);
                if (p5Var.wxUZMvaN(ng0Var)) {
                    rg0 rg0Var = (rg0) this.NCTxEWno;
                    if (rg0Var instanceof t50) {
                        t50 t50Var = (t50) rg0Var;
                        ng0Var.getClass();
                        xo xoVar = t50Var.wxUZMvaN;
                        if (xoVar != null) {
                            mcXgUFR8 mcxgufr8 = t50Var.VgvYg0wo;
                            mcxgufr8.getClass();
                            le0.wxUZMvaN(ng0Var, mcxgufr8, xoVar);
                        }
                    }
                    ng0Var.getClass();
                } else {
                    mt mtVar = new mt((aa) this.MdtA4re8);
                    mtVar.qoPGr6Ce.put(tg0.wxUZMvaN, str);
                    rg0 rg0Var2 = (rg0) this.NCTxEWno;
                    rg0Var2.getClass();
                    try {
                        try {
                            qoPGr6Ce = rg0Var2.MdtA4re8(p5Var, mtVar);
                        } catch (AbstractMethodError unused) {
                            Class cls = p5Var.qoPGr6Ce;
                            cls.getClass();
                            qoPGr6Ce = rg0Var2.NCTxEWno(cls, mtVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = p5Var.qoPGr6Ce;
                        cls2.getClass();
                        qoPGr6Ce = rg0Var2.qoPGr6Ce(cls2);
                    }
                    ng0Var = qoPGr6Ce;
                    ug0 ug0Var2 = (ug0) this.qoPGr6Ce;
                    ug0Var2.getClass();
                    ng0Var.getClass();
                    ng0 ng0Var2 = (ng0) ug0Var2.qoPGr6Ce.put(str, ng0Var);
                    if (ng0Var2 != null) {
                        ng0Var2.NCTxEWno();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ng0Var;
    }

    public ArrayList VgvYg0wo() {
        ArrayList arrayList = new ArrayList();
        for (xj xjVar : ((HashMap) this.NCTxEWno).values()) {
            if (xjVar != null) {
                arrayList.add(xjVar);
            }
        }
        return arrayList;
    }

    public List b2ZJblxo() {
        ArrayList arrayList;
        if (((ArrayList) this.qoPGr6Ce).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.qoPGr6Ce)) {
            arrayList = new ArrayList((ArrayList) this.qoPGr6Ce);
        }
        return arrayList;
    }

    public void eVhOlqcC(xj xjVar) {
        HashMap hashMap = (HashMap) this.NCTxEWno;
        li liVar = xjVar.MdtA4re8;
        if (liVar.i7xS8jrb) {
            ((hj) this.wxUZMvaN).Qr9iLBAD(liVar);
        }
        if (hashMap.get(liVar.P7K7Inc8) == xjVar && ((xj) hashMap.put(liVar.P7K7Inc8, null)) != null && ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + liVar);
        }
    }

    public void jb9XjC4I(xj xjVar) {
        li liVar = xjVar.MdtA4re8;
        String str = liVar.P7K7Inc8;
        HashMap hashMap = (HashMap) this.NCTxEWno;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(liVar.P7K7Inc8, xjVar);
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + liVar);
        }
    }

    public boolean k3x7lurq(yzvmSy3z yzvmsy3z, MenuItem menuItem) {
        return ((ActionMode.Callback) this.qoPGr6Ce).onActionItemClicked(wxUZMvaN(yzvmsy3z), new gs((Context) this.NCTxEWno, (sa0) menuItem));
    }

    public boolean ow5vqvCr(yzvmSy3z yzvmsy3z, yr yrVar) {
        ActionMode.Callback callback = (ActionMode.Callback) this.qoPGr6Ce;
        oa0 wxUZMvaN = wxUZMvaN(yzvmsy3z);
        p70 p70Var = (p70) this.wxUZMvaN;
        Menu menu = (Menu) p70Var.get(yrVar);
        if (menu == null) {
            menu = new ss((Context) this.NCTxEWno, yrVar);
            p70Var.put(yrVar, menu);
        }
        return callback.onCreateActionMode(wxUZMvaN, menu);
    }

    public void qoPGr6Ce(li liVar) {
        if (((ArrayList) this.qoPGr6Ce).contains(liVar)) {
            throw new IllegalStateException("Fragment already added: " + liVar);
        }
        synchronized (((ArrayList) this.qoPGr6Ce)) {
            ((ArrayList) this.qoPGr6Ce).add(liVar);
        }
        liVar.ow5vqvCr = true;
    }

    public oa0 wxUZMvaN(yzvmSy3z yzvmsy3z) {
        ArrayList arrayList = (ArrayList) this.MdtA4re8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oa0 oa0Var = (oa0) arrayList.get(i);
            if (oa0Var != null && oa0Var.NCTxEWno == yzvmsy3z) {
                return oa0Var;
            }
        }
        oa0 oa0Var2 = new oa0((Context) this.NCTxEWno, yzvmsy3z);
        arrayList.add(oa0Var2);
        return oa0Var2;
    }

    public VZZbw3BB(int i) {
        switch (i) {
            case 5:
                this.qoPGr6Ce = new x0(0);
                this.NCTxEWno = new SparseArray();
                this.MdtA4re8 = new lq();
                this.wxUZMvaN = new x0(0);
                break;
            default:
                this.qoPGr6Ce = new ArrayList();
                this.NCTxEWno = new HashMap();
                this.MdtA4re8 = new HashMap();
                break;
        }
    }

    public VZZbw3BB(ug0 ug0Var, rg0 rg0Var, aa aaVar) {
        ug0Var.getClass();
        rg0Var.getClass();
        aaVar.getClass();
        this.qoPGr6Ce = ug0Var;
        this.NCTxEWno = rg0Var;
        this.MdtA4re8 = aaVar;
        this.wxUZMvaN = new k00(11);
    }

    public VZZbw3BB(BottomNavigationView bottomNavigationView, View view, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout) {
        this.qoPGr6Ce = bottomNavigationView;
        this.NCTxEWno = view;
        this.MdtA4re8 = fragmentContainerView;
        this.wxUZMvaN = constraintLayout;
    }

    public VZZbw3BB(LinearLayout linearLayout, TextView textView, View view, TextView textView2) {
        this.qoPGr6Ce = linearLayout;
        this.MdtA4re8 = textView;
        this.NCTxEWno = view;
        this.wxUZMvaN = textView2;
    }

    public VZZbw3BB(Context context, ActionMode.Callback callback) {
        this.NCTxEWno = context;
        this.qoPGr6Ce = callback;
        this.MdtA4re8 = new ArrayList();
        this.wxUZMvaN = new p70(0);
    }
}
