package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import kotlin.Deprecated;
import kotlin.Metadata;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {
    private final SimpleArrayMap extraDataMap = new SimpleArrayMap(0);
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);

    @Deprecated
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "<init>", "()V", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class ExtraData {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        KeyEventDispatcher.dispatchBeforeHierarchy();
        return KeyEventDispatcher.dispatchKeyEvent(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        KeyEventDispatcher.dispatchBeforeHierarchy();
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated
    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        cls.getClass();
        return (T) this.extraDataMap.get(cls);
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ReportFragment.$r8$clinit;
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(ExtraData extraData) {
        extraData.getClass();
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3.equals("--contentcapture") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r3.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r3.equals("--autofill") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = true;
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
        boolean z = false;
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
                    break;
                case 1455016274:
                    break;
            }
        }
        return true ^ z;
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }
}
