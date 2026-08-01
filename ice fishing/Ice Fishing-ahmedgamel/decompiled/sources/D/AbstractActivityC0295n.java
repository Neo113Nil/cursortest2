package D;

import O.InterfaceC0335j;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.InterfaceC0503v;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0295n extends Activity implements InterfaceC0503v, InterfaceC0335j {
    private final s.k extraDataMap = new s.k();
    private final C0505x lifecycleRegistry = new C0505x(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (X2.e.G(decorView, event)) {
            return true;
        }
        return X2.e.H(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (X2.e.G(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends AbstractC0294m> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.h.e(extraDataClass, "extraDataClass");
        if (this.extraDataMap.getOrDefault(extraDataClass, null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public AbstractC0498p getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = androidx.lifecycle.J.f5112u;
        androidx.lifecycle.H.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(AbstractC0294m extraData) {
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
        boolean z3 = false;
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
        return !z3;
    }

    @Override // O.InterfaceC0335j
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
