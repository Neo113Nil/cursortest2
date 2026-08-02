package D;

import O.InterfaceC0340j;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.InterfaceC0507v;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0283m extends Activity implements InterfaceC0507v, InterfaceC0340j {
    private final s.k extraDataMap = new s.k();
    private final C0509x lifecycleRegistry = new C0509x(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (X2.a.f(decorView, event)) {
            return true;
        }
        return X2.a.g(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (X2.a.f(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends AbstractC0282l> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.h.e(extraDataClass, "extraDataClass");
        if (this.extraDataMap.getOrDefault(extraDataClass, null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public AbstractC0502p getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = androidx.lifecycle.J.f5079u;
        androidx.lifecycle.H.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(AbstractC0282l extraData) {
        kotlin.jvm.internal.h.e(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z6 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        break;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        break;
                    }
                    break;
            }
        }
        return !z6;
    }

    @Override // O.InterfaceC0340j
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
