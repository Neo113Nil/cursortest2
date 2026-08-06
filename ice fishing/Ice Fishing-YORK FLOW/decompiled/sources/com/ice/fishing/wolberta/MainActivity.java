package com.ice.fishing.wolberta;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class MainActivity extends defpackage.gh {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r0.run();
        r8 = getWindow();
        r8.getClass();
        r1.ZpBGe2uQfcn8(r8);
        r8 = defpackage.ma0.gUjdnLbkVAaA;
        r9 = defpackage.hh.ZpBGe2uQfcn8;
        r9 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        if ((r9 instanceof defpackage.xi) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r9 = (defpackage.xi) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        r9.setParentCompositionContext(null);
        r9.setContent(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r9 = new defpackage.xi(r8);
        r9.setParentCompositionContext(null);
        r9.setContent(r8);
        r8 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        if (defpackage.m90.BHfvd2J71qpO(r8) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        r8.setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
    
        if (defpackage.w60.OcTWLQzke1i2(r8) != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        r8.setTag(com.ice.fishing.wolberta.R.id.view_tree_view_model_store_owner, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (defpackage.wc1.Mearx7yMn90V(r8) != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r8.setTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        setContentView(r9, defpackage.hh.ZpBGe2uQfcn8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        r9 = null;
     */
    @Override // defpackage.gh, defpackage.fh, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        defpackage.vi1 vi1Var = new defpackage.vi1(new defpackage.ui1(i));
        defpackage.vi1 vi1Var2 = new defpackage.vi1(new defpackage.ui1(i));
        defpackage.au auVar = defpackage.tt.ZpBGe2uQfcn8;
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        defpackage.au auVar2 = defpackage.tt.ZpBGe2uQfcn8;
        if (auVar2 == null) {
            int i2 = android.os.Build.VERSION.SDK_INT;
            auVar2 = i2 >= 35 ? new defpackage.zt() : i2 >= 30 ? new defpackage.yt() : i2 >= 29 ? new defpackage.xt() : i2 >= 28 ? new defpackage.wt() : i2 >= 26 ? new defpackage.vt() : new defpackage.ut();
            defpackage.tt.ZpBGe2uQfcn8 = auVar2;
        }
        defpackage.au auVar3 = auVar2;
        defpackage.w9 w9Var = new defpackage.w9(auVar3, vi1Var, vi1Var2, this, decorView, 1);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            if (i3 >= viewGroup.getChildCount()) {
                defpackage.st stVar = new defpackage.st(w9Var, viewGroup.getContext());
                stVar.setTag(auVar3);
                stVar.setVisibility(8);
                stVar.setWillNotDraw(true);
                viewGroup.addView(stVar);
                break;
            }
            int i4 = i3 + 1;
            android.view.View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof defpackage.au) {
                break;
            } else {
                i3 = i4;
            }
        }
    }
}
