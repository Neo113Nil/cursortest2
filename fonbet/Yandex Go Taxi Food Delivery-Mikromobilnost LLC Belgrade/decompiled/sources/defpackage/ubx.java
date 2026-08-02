package defpackage;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ubx implements ol11 {
    public static final tbx c;
    public final tis0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i = 0;
        c = new tbx(i);
        new tbx(i);
    }

    public ubx(tis0 tis0Var) {
        this.a = tis0Var;
    }

    public final nl11 a(tis0 tis0Var, u3u u3uVar, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z) {
        nl11 create;
        Object i = tis0Var.J(TypeToken.get(jsonAdapter.value()), true).i();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (i instanceof nl11) {
            create = (nl11) i;
        } else {
            if (!(i instanceof ol11)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + i.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            ol11 ol11Var = (ol11) i;
            if (z) {
                ol11 ol11Var2 = (ol11) this.b.putIfAbsent(typeToken.getRawType(), ol11Var);
                if (ol11Var2 != null) {
                    ol11Var = ol11Var2;
                }
            }
            create = ol11Var.create(u3uVar, typeToken);
        }
        return (create == null || !nullSafe) ? create : create.nullSafe();
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return a(this.a, u3uVar, typeToken, jsonAdapter, true);
    }
}
