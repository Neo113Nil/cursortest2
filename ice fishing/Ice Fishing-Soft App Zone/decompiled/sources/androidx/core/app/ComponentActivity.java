package androidx.core.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.datatransport.WinterFlowConfigurationHandler;
import com.google.android.datatransport.WinterFlowDatabaseProtocol;
import com.google.android.datatransport.WinterFlowDatabaseUtility;
import com.google.android.datatransport.WinterFlowDecoratorVersion;
import com.google.android.datatransport.WinterFlowIDEComponent;
import com.google.android.datatransport.WinterFlowQuerySyntax;
import com.google.android.datatransport.WinterFlowRefactoringSessionManager;
import com.google.android.datatransport.WinterFlowSerializerProvider;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements WinterFlowDecoratorVersion {
    public final WinterFlowDatabaseUtility WinterFlowVariableVersionControl = new WinterFlowDatabaseUtility(this, true);

    public WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (WinterFlowIDEComponent.WinterFlowRouterStructure(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!WinterFlowQuerySyntax.WinterFlowServerProtocol) {
                    try {
                        WinterFlowQuerySyntax.WinterFlowThreadListener = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    WinterFlowQuerySyntax.WinterFlowServerProtocol = true;
                }
                Method method = WinterFlowQuerySyntax.WinterFlowThreadListener;
                boolean z = false;
                if (method != null) {
                    try {
                        Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            z = ((Boolean) invoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = WinterFlowSerializerProvider.WinterFlowArrayNetwork;
            WinterFlowSerializerProvider winterFlowSerializerProvider = (WinterFlowSerializerProvider) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (winterFlowSerializerProvider == null) {
                winterFlowSerializerProvider = new WinterFlowSerializerProvider();
                winterFlowSerializerProvider.WinterFlowRouterStructure = null;
                winterFlowSerializerProvider.WinterFlowHookDataSource = null;
                winterFlowSerializerProvider.WinterFlowCacheManagerAgent = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, winterFlowSerializerProvider);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = winterFlowSerializerProvider.WinterFlowRouterStructure;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = WinterFlowSerializerProvider.WinterFlowArrayNetwork;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (winterFlowSerializerProvider.WinterFlowRouterStructure == null) {
                                winterFlowSerializerProvider.WinterFlowRouterStructure = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = WinterFlowSerializerProvider.WinterFlowArrayNetwork;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    winterFlowSerializerProvider.WinterFlowRouterStructure.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        winterFlowSerializerProvider.WinterFlowRouterStructure.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View WinterFlowRouterStructure = winterFlowSerializerProvider.WinterFlowRouterStructure(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (WinterFlowRouterStructure != null && !KeyEvent.isModifierKey(keyCode)) {
                    SparseArray sparseArray = winterFlowSerializerProvider.WinterFlowHookDataSource;
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        winterFlowSerializerProvider.WinterFlowHookDataSource = sparseArray;
                    }
                    sparseArray.put(keyCode, new WeakReference(WinterFlowRouterStructure));
                }
            }
            if (WinterFlowRouterStructure != null) {
                return true;
            }
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (WinterFlowIDEComponent.WinterFlowRouterStructure(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
        WinterFlowConfigurationHandler.WinterFlowHookDataSource(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse);
        super.onSaveInstanceState(bundle);
    }
}
