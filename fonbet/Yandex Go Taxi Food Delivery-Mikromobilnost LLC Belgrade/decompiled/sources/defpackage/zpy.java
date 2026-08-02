package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.c;

/* loaded from: classes11.dex */
public final class zpy extends c {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zpy(LinkedTreeMap linkedTreeMap, int i) {
        super(linkedTreeMap);
        this.x = i;
    }

    @Override // com.google.gson.internal.c, java.util.Iterator
    public Object next() {
        switch (this.x) {
            case 1:
                return a().y;
            default:
                return super.next();
        }
    }
}
