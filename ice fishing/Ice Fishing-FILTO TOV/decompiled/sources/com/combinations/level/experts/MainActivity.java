package com.combinations.level.experts;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ap;
import defpackage.dx0;
import defpackage.fd;
import defpackage.l6;
import defpackage.n71;
import defpackage.so;
import defpackage.to;
import defpackage.uo;
import defpackage.vo;
import defpackage.wo;
import defpackage.xo;
import defpackage.yo;
import defpackage.zo;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class MainActivity extends fd {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r0.run();
        r0 = getWindow();
        r0.getClass();
        r1.GWasM1elztuh(r0);
        super.onCreate(r8);
        r8 = defpackage.qj.rQPn8YBR;
        r0 = defpackage.gd.GWasM1elztuh;
        r7 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if ((r7 instanceof defpackage.pe) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r7 = (defpackage.pe) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        r7.setParentCompositionContext(null);
        r7.setContent(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        r7 = new defpackage.pe(r7);
        r7.setParentCompositionContext(null);
        r7.setContent(r8);
        r8 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
    
        if (defpackage.q70.WIEu4Ya2g8(r8) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        r8.setTag(com.combinations.level.experts.R.id.view_tree_lifecycle_owner, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (defpackage.z50.WIEu4Ya2g8(r8) != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        r8.setTag(com.combinations.level.experts.R.id.view_tree_view_model_store_owner, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        if (defpackage.o50.WIEu4Ya2g8(r8) != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        r8.setTag(com.combinations.level.experts.R.id.view_tree_saved_state_registry_owner, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        setContentView(r7, defpackage.gd.GWasM1elztuh);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        r7 = null;
     */
    @Override // defpackage.fd, defpackage.ed, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        n71 n71Var = new n71(new dx0(26));
        n71 n71Var2 = new n71(new dx0(26));
        ap apVar = to.GWasM1elztuh;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ap apVar2 = to.GWasM1elztuh;
        if (apVar2 == null) {
            int i = Build.VERSION.SDK_INT;
            apVar2 = i >= 35 ? new zo() : i >= 30 ? new yo() : i >= 29 ? new xo() : i >= 28 ? new wo() : i >= 26 ? new vo() : new uo();
            to.GWasM1elztuh = apVar2;
        }
        ap apVar3 = apVar2;
        l6 l6Var = new l6(apVar3, n71Var, n71Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                so soVar = new so(l6Var, viewGroup.getContext());
                soVar.setTag(apVar3);
                soVar.setVisibility(8);
                soVar.setWillNotDraw(true);
                viewGroup.addView(soVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof ap) {
                break;
            } else {
                i2 = i3;
            }
        }
    }
}
