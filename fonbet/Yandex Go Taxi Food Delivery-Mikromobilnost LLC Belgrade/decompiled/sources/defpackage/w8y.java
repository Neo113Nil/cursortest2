package defpackage;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.SublayerManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class w8y implements qyx {
    public static final w8y a = new w8y();
    public static final HashMap b = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // defpackage.qyx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fzu0 a(Map map) {
        MapObjectCollection addMapObjectLayer;
        SublayerManager sublayerManager = map.getSublayerManager();
        HashMap hashMap = b;
        fzu0 fzu0Var = (fzu0) hashMap.get("drive_main");
        if (fzu0Var != null) {
            addMapObjectLayer = fzu0Var.a;
            if (!addMapObjectLayer.isValid()) {
                addMapObjectLayer = null;
            }
        }
        addMapObjectLayer = map.addMapObjectLayer("drive_main");
        for (Map.Entry entry : hashMap.entrySet()) {
            ((fzu0) entry.getValue()).getClass();
            ((fzu0) entry.getValue()).getClass();
            Integer findFirstOf = sublayerManager.findFirstOf("drive_main");
            if (findFirstOf != null) {
                sublayerManager.moveToEnd(findFirstOf.intValue());
            }
        }
        fzu0 fzu0Var2 = new fzu0(addMapObjectLayer);
        hashMap.put("drive_main", fzu0Var2);
        return fzu0Var2;
    }

    @Override // defpackage.qyx
    public final void b(com.yandex.mapkit.map.Map map, fzu0 fzu0Var) {
        fzu0Var.a.clear();
    }
}
