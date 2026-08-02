package defpackage;

import com.google.gson.stream.JsonToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class r4o extends nl11 {
    public static final q4o d = new q4o();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public r4o(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int ceil = (int) Math.ceil(i / 0.75f);
            this.a = new HashMap(ceil);
            this.b = new HashMap(ceil);
            this.c = new HashMap(ceil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String name = r5.name();
                String str = r5.toString();
                ysq0 ysq0Var = (ysq0) field2.getAnnotation(ysq0.class);
                if (ysq0Var != null) {
                    name = ysq0Var.value();
                    for (String str2 : ysq0Var.alternate()) {
                        this.a.put(str2, r5);
                    }
                }
                this.a.put(name, r5);
                this.b.put(str, r5);
                this.c.put(r5, name);
            }
        } catch (IllegalAccessException e) {
            ny61.f(e);
            throw null;
        }
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        Enum r0 = (Enum) this.a.get(nextString);
        return r0 == null ? (Enum) this.b.get(nextString) : r0;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        Enum r2 = (Enum) obj;
        afxVar.W(r2 == null ? null : (String) this.c.get(r2));
    }
}
