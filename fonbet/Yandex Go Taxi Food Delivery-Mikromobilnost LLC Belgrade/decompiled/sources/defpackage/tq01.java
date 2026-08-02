package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class tq01 {
    public abstract tq01 a(Map map, boolean z);

    public abstract Map b();

    public final vqj0 c(ItemType itemType) {
        Object obj = b().get(itemType);
        if (obj instanceof vqj0) {
            return (vqj0) obj;
        }
        return null;
    }

    public abstract boolean d();

    public abstract tq01 e(rqj0... rqj0VarArr);
}
