package app.cash.sqldelight;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EnumColumnAdapter {
    public final Enum[] enumValues;

    public EnumColumnAdapter(Enum[] enumArr) {
        enumArr.getClass();
        this.enumValues = enumArr;
    }

    public final Enum decode(String str) {
        str.getClass();
        for (Enum r2 : this.enumValues) {
            if (Intrinsics.areEqual(r2.name(), str)) {
                return r2;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array contains no element matching the predicate.");
        return null;
    }

    public final Object encode(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1.name();
    }
}
