package com.yandex.passport.internal.flags;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class b extends g {
    public final Enum[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Enum r3, Enum[] enumArr) {
        super(r3, str);
        enumArr.getClass();
        f[] fVarArr = f.a;
        this.c = enumArr;
    }

    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        Object obj = this.b;
        if (intOrNull == null) {
            return (Enum) obj;
        }
        int intValue = intOrNull.intValue();
        if (intValue >= 0) {
            Enum[] enumArr = this.c;
            if (intValue < enumArr.length) {
                return enumArr[intValue];
            }
        }
        return (Enum) obj;
    }
}
