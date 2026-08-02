package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w7 implements IPutIntoJson {
    public static final w7 A;
    public static final w7 B;
    public static final w7 C;
    public static final w7 D;
    public static final w7 E;
    public static final w7 F;
    public static final w7 G;
    public static final w7 H;
    public static final w7 I;
    public static final w7 J;
    public static final /* synthetic */ w7[] K;
    public static final v7 b;
    public static final LinkedHashMap c;
    public static final w7 d;
    public static final w7 e;
    public static final w7 f;
    public static final w7 g;
    public static final w7 h;
    public static final w7 i;
    public static final w7 j;
    public static final w7 k;
    public static final w7 l;
    public static final w7 m;
    public static final w7 n;
    public static final w7 o;
    public static final w7 p;
    public static final w7 q;
    public static final w7 r;
    public static final w7 s;
    public static final w7 t;
    public static final w7 u;
    public static final w7 v;
    public static final w7 w;
    public static final w7 x;
    public static final w7 y;
    public static final w7 z;
    public final String a;

    static {
        w7 w7Var = new w7("LOCATION_RECORDED", 0, "lr");
        d = w7Var;
        w7 w7Var2 = new w7("CUSTOM_EVENT", 1, "ce");
        e = w7Var2;
        w7 w7Var3 = new w7("PURCHASE", 2, "p");
        f = w7Var3;
        w7 w7Var4 = new w7("PUSH_STORY_PAGE_CLICK", 3, "cic");
        g = w7Var4;
        w7 w7Var5 = new w7("PUSH_CLICKED", 4, "pc");
        h = w7Var5;
        w7 w7Var6 = new w7("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        i = w7Var6;
        w7 w7Var7 = new w7("INTERNAL", 6, "i");
        w7 w7Var8 = new w7("INTERNAL_ERROR", 7, "ie");
        j = w7Var8;
        w7 w7Var9 = new w7("GEOFENCE", 8, "g");
        k = w7Var9;
        w7 w7Var10 = new w7("CONTENT_CARDS_CLICK", 9, "ccc");
        l = w7Var10;
        w7 w7Var11 = new w7("CONTENT_CARDS_IMPRESSION", 10, "cci");
        m = w7Var11;
        w7 w7Var12 = new w7("CONTENT_CARDS_CONTROL_IMPRESSION", 11, "ccic");
        n = w7Var12;
        w7 w7Var13 = new w7("CONTENT_CARDS_DISMISS", 12, "ccd");
        o = w7Var13;
        w7 w7Var14 = new w7("INCREMENT", 13, "inc");
        p = w7Var14;
        w7 w7Var15 = new w7("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 14, "add");
        q = w7Var15;
        w7 w7Var16 = new w7("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 15, "rem");
        r = w7Var16;
        w7 w7Var17 = new w7("SET_CUSTOM_ATTRIBUTE_ARRAY", 16, "set");
        s = w7Var17;
        w7 w7Var18 = new w7("INAPP_MESSAGE_IMPRESSION", 17, "si");
        t = w7Var18;
        w7 w7Var19 = new w7("INAPP_MESSAGE_CONTROL_IMPRESSION", 18, "iec");
        u = w7Var19;
        w7 w7Var20 = new w7("INAPP_MESSAGE_CLICK", 19, "sc");
        v = w7Var20;
        w7 w7Var21 = new w7("INAPP_MESSAGE_BUTTON_CLICK", 20, "sbc");
        w = w7Var21;
        w7 w7Var22 = new w7("INAPP_MESSAGE_MESSAGE_EXTRAS", 21, "message_extras");
        w7 w7Var23 = new w7("USER_ALIAS", 22, "uae");
        x = w7Var23;
        w7 w7Var24 = new w7("SESSION_START", 23, "ss");
        y = w7Var24;
        w7 w7Var25 = new w7("SESSION_END", 24, "se");
        z = w7Var25;
        w7 w7Var26 = new w7("TEST_TYPE", 25, "tt");
        w7 w7Var27 = new w7("LOCATION_CUSTOM_ATTRIBUTE_ADD", 26, "lcaa");
        A = w7Var27;
        w7 w7Var28 = new w7("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 27, "lcar");
        B = w7Var28;
        w7 w7Var29 = new w7("NESTED_CUSTOM_ATTRIBUTE_MERGE", 28, "ncam");
        C = w7Var29;
        w7 w7Var30 = new w7("SUBSCRIPTION_GROUP_UPDATE", 29, "sgu");
        D = w7Var30;
        w7 w7Var31 = new w7("FEATURE_FLAG_IMPRESSION_EVENT", 30, "ffi");
        E = w7Var31;
        w7 w7Var32 = new w7("BANNER_IMPRESSION_EVENT", 31, "bi");
        F = w7Var32;
        w7 w7Var33 = new w7("BANNER_CLICK_EVENT", 32, "bc");
        G = w7Var33;
        w7 w7Var34 = new w7("BANNER_DISMISS_EVENT", 33, "bd");
        H = w7Var34;
        w7 w7Var35 = new w7("PUSH_DELIVERY_EVENT", 34, "pde");
        I = w7Var35;
        w7 w7Var36 = new w7("UNKNOWN", 35, "");
        J = w7Var36;
        w7[] w7VarArr = {w7Var, w7Var2, w7Var3, w7Var4, w7Var5, w7Var6, w7Var7, w7Var8, w7Var9, w7Var10, w7Var11, w7Var12, w7Var13, w7Var14, w7Var15, w7Var16, w7Var17, w7Var18, w7Var19, w7Var20, w7Var21, w7Var22, w7Var23, w7Var24, w7Var25, w7Var26, w7Var27, w7Var28, w7Var29, w7Var30, w7Var31, w7Var32, w7Var33, w7Var34, w7Var35, w7Var36};
        K = w7VarArr;
        EnumEntriesList enumEntriesList = new EnumEntriesList(w7VarArr);
        b = new v7();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
        while (arrayIterator.hasNext()) {
            Object next = arrayIterator.next();
            linkedHashMap.put(((w7) next).a, next);
        }
        c = linkedHashMap;
    }

    public w7(String str, int i2, String str2) {
        this.a = str2;
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) K.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.a;
    }
}
