package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class tdb implements Serializable {

    @NotNull
    private static final sdb b = new sdb(null);
    private static final long serialVersionUID = 0;
    public final Class a;

    public tdb(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return new rdb((Enum[]) enumConstants);
    }
}
