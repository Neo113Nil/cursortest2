package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v7.AbstractC5129j;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467j {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4992b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4993c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4994d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4995e;

    public C0467j(ViewGroup container) {
        kotlin.jvm.internal.h.e(container, "container");
        this.f4991a = container;
        this.f4992b = new ArrayList();
        this.f4993c = new ArrayList();
    }

    public static final C0467j f(ViewGroup container, N fragmentManager) {
        kotlin.jvm.internal.h.e(container, "container");
        kotlin.jvm.internal.h.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.h.d(fragmentManager.C(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(C5275R.id.special_effects_controller_view_tag);
        if (tag instanceof C0467j) {
            return (C0467j) tag;
        }
        C0467j c0467j = new C0467j(container);
        container.setTag(C5275R.id.special_effects_controller_view_tag, c0467j);
        return c0467j;
    }

    public final void a(int i, int i6, V v9) {
        synchronized (this.f4992b) {
            K.f fVar = new K.f();
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
            kotlin.jvm.internal.h.d(abstractComponentCallbacksC0475s, "fragmentStateManager.fragment");
            a0 d2 = d(abstractComponentCallbacksC0475s);
            if (d2 != null) {
                d2.c(i, i6);
                return;
            }
            final a0 a0Var = new a0(i, i6, v9, fVar);
            this.f4992b.add(a0Var);
            final int i9 = 0;
            a0Var.f4949d.add(new Runnable(this) { // from class: androidx.fragment.app.Z

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0467j f4927u;

                {
                    this.f4927u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            C0467j this$0 = this.f4927u;
                            kotlin.jvm.internal.h.e(this$0, "this$0");
                            a0 a0Var2 = a0Var;
                            if (this$0.f4992b.contains(a0Var2)) {
                                int i10 = a0Var2.f4946a;
                                View view = a0Var2.f4948c.f5050X;
                                kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                D.y.a(i10, view);
                                break;
                            }
                            break;
                        default:
                            C0467j this$02 = this.f4927u;
                            kotlin.jvm.internal.h.e(this$02, "this$0");
                            a0 a0Var3 = a0Var;
                            this$02.f4992b.remove(a0Var3);
                            this$02.f4993c.remove(a0Var3);
                            break;
                    }
                }
            });
            final int i10 = 1;
            a0Var.f4949d.add(new Runnable(this) { // from class: androidx.fragment.app.Z

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0467j f4927u;

                {
                    this.f4927u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            C0467j this$0 = this.f4927u;
                            kotlin.jvm.internal.h.e(this$0, "this$0");
                            a0 a0Var2 = a0Var;
                            if (this$0.f4992b.contains(a0Var2)) {
                                int i102 = a0Var2.f4946a;
                                View view = a0Var2.f4948c.f5050X;
                                kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                D.y.a(i102, view);
                                break;
                            }
                            break;
                        default:
                            C0467j this$02 = this.f4927u;
                            kotlin.jvm.internal.h.e(this$02, "this$0");
                            a0 a0Var3 = a0Var;
                            this$02.f4992b.remove(a0Var3);
                            this$02.f4993c.remove(a0Var3);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022b, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0231, code lost:
    
        r12 = (androidx.fragment.app.a0) r4.f731u;
        r23 = r0;
        r0 = kotlin.jvm.internal.h.a(r13.get(r12), java.lang.Boolean.TRUE);
        r1 = r12.f4948c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0243, code lost:
    
        if (r0 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026e, code lost:
    
        if (r12.f4946a != 3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0270, code lost:
    
        r0 = r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0275, code lost:
    
        if (r3 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0277, code lost:
    
        r10.remove(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027a, code lost:
    
        r2 = r1.f5050X;
        r15.startViewTransition(r2);
        r1 = r0;
        r20 = r10;
        r1 = r21;
        r6.addListener(new androidx.fragment.app.C0465h(r1, r2, r3, r12, r4));
        r6.setTarget(r2);
        r6.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029d, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029f, code lost:
    
        android.util.Log.v("FragmentManager", "Animator from operation " + r12 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b3, code lost:
    
        ((K.f) r4.f732v).a(new androidx.fragment.app.C0461d(0, r6, r12));
        r0 = r23;
        r6 = r17;
        r3 = r1;
        r10 = r20;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0273, code lost:
    
        r0 = r3;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0249, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024b, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animator set on " + r1 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0264, code lost:
    
        r1 = r21;
        r0 = r23;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022d, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0217, code lost:
    
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0223, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0214, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ca, code lost:
    
        r12 = r0;
        r20 = r10;
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d8, code lost:
    
        if (r0.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02da, code lost:
    
        r3 = (androidx.fragment.app.C0463f) r0.next();
        r4 = (androidx.fragment.app.a0) r3.f731u;
        r5 = r4.f4948c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e8, code lost:
    
        if (r14 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0308, code lost:
    
        if (r2 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0328, code lost:
    
        r5 = r5.f5050X;
        kotlin.jvm.internal.h.d(r12, "context");
        r13 = r3.s(r12);
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0335, code lost:
    
        if (r13 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0337, code lost:
    
        r13 = (android.view.animation.Animation) r13.f2840u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x033b, code lost:
    
        if (r13 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033d, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0342, code lost:
    
        if (r4.f4946a == 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0344, code lost:
    
        r5.startAnimation(r13);
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0378, code lost:
    
        ((K.f) r3.f732v).a(new androidx.fragment.app.C0462e(r5, r3, r1, r4));
        r0 = r22;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x034b, code lost:
    
        r15.startViewTransition(r5);
        r0 = new androidx.fragment.app.RunnableC0481y(r13, r15, r5);
        r0.setAnimationListener(new androidx.fragment.app.AnimationAnimationListenerC0466i(r5, r3, r1, r4));
        r5.startAnimation(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0362, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0364, code lost:
    
        android.util.Log.v("FragmentManager", "Animation from operation " + r4 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x038f, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0395, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r11 = (androidx.fragment.app.a0) r3;
        r2 = r22.listIterator(r22.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x030e, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0310, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0324, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ee, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f0, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0304, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0396, code lost:
    
        r0 = r20.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x039e, code lost:
    
        if (r0.hasNext() == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a0, code lost:
    
        r2 = (androidx.fragment.app.a0) r0.next();
        r3 = r2.f4948c.f5050X;
        r2 = r2.f4946a;
        kotlin.jvm.internal.h.d(r3, "view");
        D.y.a(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03b5, code lost:
    
        r20.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03bc, code lost:
    
        if (androidx.fragment.app.N.E(r17) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03be, code lost:
    
        android.util.Log.v("FragmentManager", "Completed executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r2.hasPrevious() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0080, code lost:
    
        r14 = r14.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0084, code lost:
    
        if (r14 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0086, code lost:
    
        if (r14 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0088, code lost:
    
        if (r14 != 8) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r12 = r2.previous();
        r13 = (androidx.fragment.app.a0) r12;
        r14 = r13.f4948c.f5050X;
        kotlin.jvm.internal.h.d(r14, "operation.fragment.mView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0094, code lost:
    
        throw new java.lang.IllegalArgumentException(com.icefishing.icefishingbigwin.AbstractC4404f.e(r14, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r14.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r14.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r13.f4946a != 2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r7 = (androidx.fragment.app.a0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (androidx.fragment.app.N.E(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r2 = new java.util.ArrayList();
        r4 = new java.util.ArrayList();
        r10 = v7.AbstractC5129j.M(r22);
        r5 = ((androidx.fragment.app.a0) v7.AbstractC5129j.F(r22)).f4948c;
        r12 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r12.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r13 = ((androidx.fragment.app.a0) r12.next()).f4948c.f5053n0;
        r14 = r5.f5053n0;
        r13.f5018b = r14.f5018b;
        r13.f5019c = r14.f5019c;
        r13.f5020d = r14.f5020d;
        r13.f5021e = r14.f5021e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        r3 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        if (r3.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
    
        r5 = (androidx.fragment.app.a0) r3.next();
        r14 = new K.f();
        r5.d();
        r15 = r5.f4950e;
        r15.add(r14);
        r2.add(new androidx.fragment.app.C0463f(r5, r14, r23));
        r13 = new K.f();
        r5.d();
        r15.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012d, code lost:
    
        if (r23 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        if (r5 != r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        r14 = new androidx.fragment.app.C0464g(2, r5, r13);
        r13 = r5.f4946a;
        r15 = r5.f4948c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        if (r13 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0142, code lost:
    
        if (r23 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0144, code lost:
    
        r13 = r15.f5053n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        if (r5.f4946a != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        if (r23 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        r13 = r15.f5053n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015c, code lost:
    
        r13 = r15.f5053n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015e, code lost:
    
        if (r12 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0160, code lost:
    
        if (r23 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0162, code lost:
    
        r12 = r15.f5053n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r4.add(r14);
        r5.f4949d.add(new androidx.emoji2.text.k(1, r10, r5, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0165, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0147, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (r23 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        r13 = r15.f5053n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        if (r5 != r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        r13 = new java.util.LinkedHashMap();
        r0 = new java.util.ArrayList();
        r3 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0189, code lost:
    
        if (r3.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0196, code lost:
    
        if (((androidx.fragment.app.C0464g) r5).k() != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        r3 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a9, code lost:
    
        if (r0.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        ((androidx.fragment.app.C0464g) r0.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        if (r0.hasNext() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        ((androidx.fragment.app.C0464g) r0.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        r0 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        if (r0.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d3, code lost:
    
        r3 = (androidx.fragment.app.C0464g) r0.next();
        r13.put((androidx.fragment.app.a0) r3.f731u, java.lang.Boolean.FALSE);
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e6, code lost:
    
        r14 = r13.containsValue(java.lang.Boolean.TRUE);
        r15 = r1.f4991a;
        r0 = r15.getContext();
        r3 = new java.util.ArrayList();
        r16 = r2.iterator();
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0206, code lost:
    
        if (r16.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0208, code lost:
    
        r4 = (androidx.fragment.app.C0463f) r16.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0212, code lost:
    
        if (r4.k() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021a, code lost:
    
        kotlin.jvm.internal.h.d(r0, "context");
        r6 = r4.s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0221, code lost:
    
        if (r6 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
    
        r6 = (android.animation.Animator) r6.f2841v;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z3) {
        Object obj;
        final C0467j c0467j = this;
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 2;
            Object obj2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a0 a0Var = (a0) obj;
            View view = a0Var.f4948c.f5050X;
            kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC4404f.e(visibility, "Unknown visibility "));
                    }
                } else if (a0Var.f4946a != 2) {
                    break;
                }
            }
        }
    }

    public final void c() {
        if (this.f4995e) {
            return;
        }
        ViewGroup viewGroup = this.f4991a;
        WeakHashMap weakHashMap = O.X.f2054a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f4994d = false;
            return;
        }
        synchronized (this.f4992b) {
            try {
                if (!this.f4992b.isEmpty()) {
                    ArrayList M8 = AbstractC5129j.M(this.f4993c);
                    this.f4993c.clear();
                    Iterator it = M8.iterator();
                    while (it.hasNext()) {
                        a0 a0Var = (a0) it.next();
                        if (N.E(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a0Var);
                        }
                        a0Var.a();
                        if (!a0Var.f4952g) {
                            this.f4993c.add(a0Var);
                        }
                    }
                    g();
                    ArrayList M9 = AbstractC5129j.M(this.f4992b);
                    this.f4992b.clear();
                    this.f4993c.addAll(M9);
                    if (N.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = M9.iterator();
                    while (it2.hasNext()) {
                        ((a0) it2.next()).d();
                    }
                    b(M9, this.f4994d);
                    this.f4994d = false;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a0 d(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        Object obj;
        Iterator it = this.f4992b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a0 a0Var = (a0) obj;
            if (kotlin.jvm.internal.h.a(a0Var.f4948c, abstractComponentCallbacksC0475s) && !a0Var.f4951f) {
                break;
            }
        }
        return (a0) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (N.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f4991a;
        WeakHashMap weakHashMap = O.X.f2054a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f4992b) {
            try {
                g();
                Iterator it = this.f4992b.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).d();
                }
                Iterator it2 = AbstractC5129j.M(this.f4993c).iterator();
                while (it2.hasNext()) {
                    a0 a0Var = (a0) it2.next();
                    if (N.E(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4991a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + a0Var);
                    }
                    a0Var.a();
                }
                Iterator it3 = AbstractC5129j.M(this.f4992b).iterator();
                while (it3.hasNext()) {
                    a0 a0Var2 = (a0) it3.next();
                    if (N.E(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4991a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + a0Var2);
                    }
                    a0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it = this.f4992b.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            int i = 2;
            if (a0Var.f4947b == 2) {
                int visibility = a0Var.f4948c.z().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC4404f.e(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                a0Var.c(i, 1);
            }
        }
    }
}
