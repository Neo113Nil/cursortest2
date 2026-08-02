package androidx.activity;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistryImpl;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentActivity$$ExternalSyntheticLambda5 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComponentActivity$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ComponentActivity.$r8$lambda$QUUwrpYSdd6n6dD7wrAaa0S4oXg((ComponentActivity) obj);
            default:
                Map performSave = ((SaveableStateRegistryImpl) obj).performSave();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : performSave.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
        }
    }
}
