package com.google.android.datatransport;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareVersion extends Fragment {
    public final WinterFlowNodeSerializer WinterFlowVariableVersionControl = new WinterFlowNodeSerializer(12);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values().iterator();
        while (it.hasNext()) {
            ((WinterFlowHookLibrary) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values().iterator();
        if (it.hasNext()) {
            ((WinterFlowHookLibrary) it.next()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).entrySet()) {
            ((WinterFlowHookLibrary) entry.getValue()).WinterFlowHookDataSource(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values().iterator();
        while (it.hasNext()) {
            ((WinterFlowHookLibrary) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values().iterator();
        while (it.hasNext()) {
            ((WinterFlowHookLibrary) it.next()).WinterFlowArrayNetwork();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((WinterFlowHookLibrary) entry.getValue()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        for (WinterFlowHookLibrary winterFlowHookLibrary : ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values()) {
            winterFlowHookLibrary.WinterFlowVariableVersionControl = true;
            winterFlowHookLibrary.WinterFlowArrayNetwork();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator it = ((Map) this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl).values().iterator();
        while (it.hasNext()) {
            ((WinterFlowHookLibrary) it.next()).WinterFlowCacheManagerAgent();
        }
    }
}
