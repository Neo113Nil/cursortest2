package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cxq0;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public abstract class rqb1 {
    public static final void a(f530 f530Var, frv0 frv0Var, w49 w49Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1215050573);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(frv0Var) ? 32 : 16) | (btsVar.k(w49Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout.setClipChildren(false);
                frameLayout.setClipToOutline(false);
                ViewStub viewStub = new ViewStub(context);
                frameLayout.addView(viewStub);
                ((irv0) frv0Var.a(viewStub)).h.setImportantForAccessibility(4);
                btsVar.o0(frameLayout);
                obj = frameLayout;
            }
            FrameLayout frameLayout2 = (FrameLayout) obj;
            Object Q2 = btsVar.Q();
            Object obj2 = Q2;
            if (Q2 == o430Var) {
                new FrameLayout(context);
                View inflate = LayoutInflater.from(context).inflate(euh0.hub_multimodal_cashback_view, (ViewGroup) null, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    return;
                }
                final GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                final cxq0 a = ((t0w0) w49Var).a(goFrameLayout);
                WeakHashMap weakHashMap = b.a;
                if (goFrameLayout.isAttachedToWindow()) {
                    a.D();
                } else {
                    goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardHeaderContentKt$MultimodalRouteDetailedCardHeaderContent$lambda$1$0$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            goFrameLayout.removeOnAttachStateChangeListener(this);
                            ((cxq0) a).D();
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                }
                if (goFrameLayout.isAttachedToWindow()) {
                    goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardHeaderContentKt$MultimodalRouteDetailedCardHeaderContent$lambda$1$0$$inlined$doOnDetach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            goFrameLayout.removeOnAttachStateChangeListener(this);
                            ((cxq0) a).z();
                        }
                    });
                } else {
                    a.z();
                }
                btsVar.o0(goFrameLayout);
                obj2 = goFrameLayout;
            }
            GoFrameLayout goFrameLayout2 = (GoFrameLayout) obj2;
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 o2 = an91.o(cj6Var.a(c530Var, uo5Var), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean e = btsVar.e(frameLayout2);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new x240(14, frameLayout2);
                btsVar.o0(Q3);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q3, o2, null, btsVar, 0, 4);
            f530 o3 = an91.o(cj6Var.a(c530Var, x4c.w), 0.0f, 2.0f, 4.0f, 0.0f, 9);
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            boolean e2 = btsVar.e(goFrameLayout2);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var) {
                Q4 = new x240(15, goFrameLayout2);
                btsVar.o0(Q4);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q4, c530Var, null, btsVar, 48, 4);
            pi6.a(cj6Var.b(c530Var), btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(i, 23, tlsVar, f530Var, frv0Var, w49Var);
        }
    }

    public static final void b(Context context, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(context.getString(uyh0.plus_sdk_copied_info), str));
            Toast.makeText(context, context.getString(uyh0.plus_sdk_debug_panel_copied), 0).show();
        }
    }
}
