package defpackage;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final /* synthetic */ class ydj implements hds {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ydj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hds
    public final void a(Fragment fragment) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cej cejVar = (cej) obj;
                LinkedHashSet linkedHashSet = cejVar.e;
                if (ym11.a(linkedHashSet).remove(fragment.getTag())) {
                    fragment.getLifecycle().a(cejVar.f);
                }
                LinkedHashMap linkedHashMap = cejVar.g;
                ym11.c(linkedHashMap).remove(fragment.getTag());
                break;
            default:
                fragment.getLifecycle().a((fjh) obj);
                break;
        }
    }
}
