package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pb {
    public final ArrayList MdtA4re8;
    public final ArrayList NCTxEWno;
    public boolean VgvYg0wo;
    public final ViewGroup qoPGr6Ce;
    public boolean wxUZMvaN;

    public pb(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.qoPGr6Ce = viewGroup;
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = new ArrayList();
    }

    public static final pb P7K7Inc8(ViewGroup viewGroup, ej ejVar) {
        viewGroup.getClass();
        ejVar.getClass();
        ejVar.euDDoUNr().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof pb) {
            return (pb) tag;
        }
        pb pbVar = new pb(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, pbVar);
        return pbVar;
    }

    public final void MdtA4re8() {
        if (this.VgvYg0wo) {
            return;
        }
        ViewGroup viewGroup = this.qoPGr6Ce;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        if (!viewGroup.isAttachedToWindow()) {
            VgvYg0wo();
            this.wxUZMvaN = false;
            return;
        }
        synchronized (this.NCTxEWno) {
            try {
                if (!this.NCTxEWno.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.MdtA4re8);
                    this.MdtA4re8.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        d80 d80Var = (d80) obj;
                        if (ej.ytu5o6f4(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + d80Var);
                        }
                        d80Var.qoPGr6Ce();
                        if (!d80Var.b2ZJblxo) {
                            this.MdtA4re8.add(d80Var);
                        }
                    }
                    b2ZJblxo();
                    ArrayList arrayList2 = new ArrayList(this.NCTxEWno);
                    this.NCTxEWno.clear();
                    this.MdtA4re8.addAll(arrayList2);
                    if (ej.ytu5o6f4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((d80) obj2).wxUZMvaN();
                    }
                    NCTxEWno(arrayList2, this.wxUZMvaN);
                    this.wxUZMvaN = false;
                    if (ej.ytu5o6f4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029c, code lost:
    
        if (r2 >= r0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029e, code lost:
    
        r3 = r17;
        r4 = r3.get(r2);
        r2 = r2 + 1;
        r4 = (defpackage.kb) r4;
        r5 = (defpackage.d80) r4.qoPGr6Ce;
        r6 = r5.MdtA4re8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b0, code lost:
    
        if (r23 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d2, code lost:
    
        if (r20 == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f2, code lost:
    
        r6 = r6.ytu5o6f4;
        r15.getClass();
        r12 = r4.amk52bBQ(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fd, code lost:
    
        if (r12 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ff, code lost:
    
        r12 = (android.view.animation.Animation) r12.MdtA4re8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0303, code lost:
    
        if (r12 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0305, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x030c, code lost:
    
        if (r5.qoPGr6Ce == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030e, code lost:
    
        r6.startAnimation(r12);
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0342, code lost:
    
        ((defpackage.o3) r4.NCTxEWno).qoPGr6Ce(new defpackage.jb(r4, r1, r5, r6));
        r17 = r3;
        r0 = r18;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0315, code lost:
    
        r14.startViewTransition(r6);
        r0 = new defpackage.oi(r12, r14, r6);
        r0.setAnimationListener(new defpackage.ob(r4, r1, r5, r6));
        r6.startAnimation(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032c, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x032e, code lost:
    
        android.util.Log.v("FragmentManager", "Animation from operation " + r5 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0356, code lost:
    
        defpackage.m1.Ey6iv0m0("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0359, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035a, code lost:
    
        defpackage.m1.Ey6iv0m0("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x035d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d8, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02da, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r6 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ee, code lost:
    
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02cf, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b6, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b8, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r6 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cc, code lost:
    
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x035e, code lost:
    
        r0 = r13.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0363, code lost:
    
        if (r6 >= r0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0365, code lost:
    
        r1 = r13.get(r6);
        r6 = r6 + 1;
        r1 = (defpackage.d80) r1;
        r2 = r1.MdtA4re8.ytu5o6f4;
        r1 = r1.qoPGr6Ce;
        r2.getClass();
        defpackage.q70.qoPGr6Ce(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x037a, code lost:
    
        r13.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0381, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0383, code lost:
    
        android.util.Log.v("FragmentManager", "Completed executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x039a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0078, code lost:
    
        r13 = r13.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x007c, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x007e, code lost:
    
        if (r13 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0080, code lost:
    
        if (r13 != 8) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0083, code lost:
    
        defpackage.m1.sjUBp5pO(defpackage.q70.VgvYg0wo("Unknown visibility ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r11 = (defpackage.d80) r11;
        r2 = r23.listIterator(r23.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r2.hasPrevious() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r3 = r2.previous();
        r12 = (defpackage.d80) r3;
        r13 = r12.MdtA4re8.ytu5o6f4;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r13.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r12.qoPGr6Ce != 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        r7 = (defpackage.d80) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (defpackage.ej.ytu5o6f4(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r12 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r13 = new java.util.ArrayList(r23);
        r3 = ((defpackage.d80) defpackage.x5.LvHlPNBd(r23)).MdtA4re8;
        r4 = r23.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r5 >= r4) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        r14 = r23.get(r5);
        r5 = r5 + 1;
        r14 = ((defpackage.d80) r14).MdtA4re8.VhgXwMj9;
        r15 = r3.VhgXwMj9;
        r14.NCTxEWno = r15.NCTxEWno;
        r14.MdtA4re8 = r15.MdtA4re8;
        r14.wxUZMvaN = r15.wxUZMvaN;
        r14.VgvYg0wo = r15.VgvYg0wo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        r3 = r23.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r4 >= r3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        r5 = r23.get(r4);
        r4 = r4 + 1;
        r5 = (defpackage.d80) r5;
        r6 = new defpackage.o3();
        r5.wxUZMvaN();
        r14 = r5.VgvYg0wo;
        r14.add(r6);
        r12.add(new defpackage.kb(r5, r6, r24));
        r6 = new defpackage.o3();
        r5.wxUZMvaN();
        r14.add(r6);
        r2.add(new defpackage.lb(r5, r6));
        r5.wxUZMvaN.add(new defpackage.a1GxQO7H(r13, r5, r1));
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0139, code lost:
    
        r16 = r10;
        r6 = new java.util.LinkedHashMap();
        r0 = new java.util.ArrayList();
        r3 = r2.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        if (r4 >= r3) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        r5 = r2.get(r4);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
    
        if (((defpackage.lb) r5).k3x7lurq() != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015f, code lost:
    
        r3 = new java.util.ArrayList();
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0169, code lost:
    
        if (r5 >= r4) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016b, code lost:
    
        r10 = r0.get(r5);
        r5 = r5 + 1;
        ((defpackage.lb) r10).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        r0 = r3.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (r4 >= r0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        r5 = r3.get(r4);
        r4 = r4 + 1;
        ((defpackage.lb) r5).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r0 = r2.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018f, code lost:
    
        if (r3 >= r0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        r4 = r2.get(r3);
        r3 = r3 + 1;
        r4 = (defpackage.lb) r4;
        r6.put((defpackage.d80) r4.qoPGr6Ce, java.lang.Boolean.FALSE);
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a6, code lost:
    
        r10 = r6.containsValue(java.lang.Boolean.TRUE);
        r14 = r1.qoPGr6Ce;
        r15 = r14.getContext();
        r0 = new java.util.ArrayList();
        r2 = r12.size();
        r3 = false;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bd, code lost:
    
        r23 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:
    
        if (r4 >= r2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c3, code lost:
    
        r18 = r4 + 1;
        r4 = (defpackage.kb) r12.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d1, code lost:
    
        if (r4.k3x7lurq() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01dd, code lost:
    
        r15.getClass();
        r5 = r4.amk52bBQ(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e4, code lost:
    
        if (r5 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ea, code lost:
    
        r5 = (android.animation.Animator) r5.wxUZMvaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ee, code lost:
    
        if (r5 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f4, code lost:
    
        r17 = r0;
        r0 = (defpackage.d80) r4.qoPGr6Ce;
        r1 = r0.MdtA4re8;
        r19 = r2;
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020a, code lost:
    
        if (defpackage.fn.qoPGr6Ce(r6.get(r0), java.lang.Boolean.TRUE) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023b, code lost:
    
        if (r0.qoPGr6Ce != 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0240, code lost:
    
        if (r3 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0242, code lost:
    
        r13.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0245, code lost:
    
        r2 = r1.ytu5o6f4;
        r14.startViewTransition(r2);
        r21 = r6;
        r1 = r22;
        r5.addListener(new defpackage.mb(r1, r2, r3, r0, r4));
        r5.setTarget(r2);
        r5.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0264, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0266, code lost:
    
        android.util.Log.v("FragmentManager", "Animator from operation " + r0 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x027a, code lost:
    
        ((defpackage.o3) r4.NCTxEWno).qoPGr6Ce(new defpackage.ib(r5, r0));
        r10 = r23;
        r0 = r17;
        r4 = r18;
        r2 = r19;
        r6 = r21;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0210, code lost:
    
        if (defpackage.ej.ytu5o6f4(r16) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0212, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animator set on " + r1 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0228, code lost:
    
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022b, code lost:
    
        r1 = r22;
        r10 = r23;
        r0 = r17;
        r4 = r18;
        r2 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f0, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r17 = r0;
        r19 = r2;
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e6, code lost:
    
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d3, code lost:
    
        r4.VgvYg0wo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0293, code lost:
    
        r17 = r0;
        r20 = r3;
        r0 = r17.size();
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void NCTxEWno(ArrayList arrayList, boolean z) {
        Object obj;
        final pb pbVar = this;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            Object obj2 = null;
            int i2 = 2;
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            d80 d80Var = (d80) obj;
            View view = d80Var.MdtA4re8.ytu5o6f4;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        m1.sjUBp5pO(q70.VgvYg0wo("Unknown visibility ", visibility));
                        return;
                    }
                } else if (d80Var.qoPGr6Ce != 2) {
                    break;
                }
            }
        }
    }

    public final void VgvYg0wo() {
        String str;
        String str2;
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.qoPGr6Ce;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.NCTxEWno) {
            try {
                b2ZJblxo();
                ArrayList arrayList = this.NCTxEWno;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((d80) obj).wxUZMvaN();
                }
                ArrayList arrayList2 = new ArrayList(this.MdtA4re8);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    d80 d80Var = (d80) obj2;
                    if (ej.ytu5o6f4(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.qoPGr6Ce + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + d80Var);
                    }
                    d80Var.qoPGr6Ce();
                }
                ArrayList arrayList3 = new ArrayList(this.NCTxEWno);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    d80 d80Var2 = (d80) obj3;
                    if (ej.ytu5o6f4(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.qoPGr6Ce + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + d80Var2);
                    }
                    d80Var2.qoPGr6Ce();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b2ZJblxo() {
        ArrayList arrayList = this.NCTxEWno;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d80 d80Var = (d80) obj;
            int i2 = 2;
            if (d80Var.NCTxEWno == 2) {
                int visibility = d80Var.MdtA4re8.Xkz7p5xa().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            m1.sjUBp5pO(q70.VgvYg0wo("Unknown visibility ", visibility));
                            return;
                        }
                        i2 = 3;
                    }
                }
                d80Var.MdtA4re8(i2, 1);
            }
        }
    }

    public final void qoPGr6Ce(int i, int i2, xj xjVar) {
        synchronized (this.NCTxEWno) {
            o3 o3Var = new o3();
            d80 wxUZMvaN = wxUZMvaN(xjVar.MdtA4re8);
            if (wxUZMvaN != null) {
                wxUZMvaN.MdtA4re8(i, i2);
                return;
            }
            final d80 d80Var = new d80(i, i2, xjVar, o3Var);
            this.NCTxEWno.add(d80Var);
            final int i3 = 0;
            d80Var.wxUZMvaN.add(new Runnable(this) { // from class: c80
                public final /* synthetic */ pb MdtA4re8;

                {
                    this.MdtA4re8 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    d80 d80Var2 = d80Var;
                    pb pbVar = this.MdtA4re8;
                    switch (i4) {
                        case 0:
                            if (pbVar.NCTxEWno.contains(d80Var2)) {
                                int i5 = d80Var2.qoPGr6Ce;
                                View view = d80Var2.MdtA4re8.ytu5o6f4;
                                view.getClass();
                                q70.qoPGr6Ce(view, i5);
                                break;
                            }
                            break;
                        default:
                            pbVar.NCTxEWno.remove(d80Var2);
                            pbVar.MdtA4re8.remove(d80Var2);
                            break;
                    }
                }
            });
            final int i4 = 1;
            d80Var.wxUZMvaN.add(new Runnable(this) { // from class: c80
                public final /* synthetic */ pb MdtA4re8;

                {
                    this.MdtA4re8 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i42 = i4;
                    d80 d80Var2 = d80Var;
                    pb pbVar = this.MdtA4re8;
                    switch (i42) {
                        case 0:
                            if (pbVar.NCTxEWno.contains(d80Var2)) {
                                int i5 = d80Var2.qoPGr6Ce;
                                View view = d80Var2.MdtA4re8.ytu5o6f4;
                                view.getClass();
                                q70.qoPGr6Ce(view, i5);
                                break;
                            }
                            break;
                        default:
                            pbVar.NCTxEWno.remove(d80Var2);
                            pbVar.MdtA4re8.remove(d80Var2);
                            break;
                    }
                }
            });
        }
    }

    public final d80 wxUZMvaN(li liVar) {
        Object obj;
        ArrayList arrayList = this.NCTxEWno;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            d80 d80Var = (d80) obj;
            if (d80Var.MdtA4re8.equals(liVar) && !d80Var.P7K7Inc8) {
                break;
            }
        }
        return (d80) obj;
    }
}
