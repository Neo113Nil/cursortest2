package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapObject;

/* loaded from: classes14.dex */
public final class vo00 {
    public static sz1 a(MapObject mapObject) {
        String str = mapObject.a;
        MapObject.Style style = mapObject.d;
        String str2 = style.a;
        String str3 = style.d;
        oj4 oj4Var = style.e;
        String str4 = oj4Var != null ? oj4Var.a : null;
        String str5 = oj4Var != null ? oj4Var.c : null;
        return new sz1(str, str2, str3, str4, oj4Var != null ? oj4Var.b : null, str5, style.c, mapObject.c);
    }
}
