package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class rmf implements qmf {
    public final pmf a(zh5 zh5Var, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("barcode", new xv4());
        linkedHashMap.put("DivCustomQrCodeView", new i6g0());
        Object obj = map.get("CustomViewConfiguration");
        ch8 ch8Var = obj instanceof ch8 ? (ch8) obj : null;
        if (ch8Var != null) {
        }
        Object obj2 = map.get("WebViewConfiguration");
        vm41 vm41Var = obj2 instanceof vm41 ? (vm41) obj2 : null;
        if (vm41Var != null) {
        }
        linkedHashMap.put("DivCustomLoaderView", new dzy());
        linkedHashMap.put("DivCustomCaretView", new hu8());
        return new pmf(linkedHashMap);
    }
}
