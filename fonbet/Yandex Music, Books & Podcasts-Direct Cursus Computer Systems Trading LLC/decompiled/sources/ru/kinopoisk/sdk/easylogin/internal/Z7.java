package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bvo;
import defpackage.e7o;
import defpackage.iuc;
import defpackage.jsc;
import defpackage.ni2;
import defpackage.vyn;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.E3;

/* loaded from: classes5.dex */
public final class Z7 {
    @NotNull
    public static final InterfaceC1274w8 a(@NotNull E3 e3, @NotNull InterfaceC1274w8 interfaceC1274w8) {
        e3.getClass();
        interfaceC1274w8.getClass();
        e3.getClass();
        interfaceC1274w8.getClass();
        e3.getClass();
        interfaceC1274w8.getClass();
        E3.a aVar = (E3.a) e3.a.get(interfaceC1274w8.getClass());
        InterfaceC1274w8 interfaceC1274w82 = null;
        InterfaceC1274w8 a = aVar != null ? aVar.a(interfaceC1274w8) : null;
        if (a != null) {
            interfaceC1274w82 = a;
        } else if (interfaceC1274w8 instanceof bvo) {
            interfaceC1274w82 = interfaceC1274w8;
        }
        if (interfaceC1274w82 != null) {
            return interfaceC1274w82;
        }
        e7o.i(interfaceC1274w8.b(), "Feature initializer not found for screen ");
        return null;
    }

    public static final void a(@NotNull T7 t7) {
        t7.getClass();
        t7.a(new ni2());
    }

    public static final void a(@NotNull T7 t7, @NotNull iuc iucVar) {
        t7.getClass();
        iucVar.getClass();
        t7.a(new vyn(iucVar));
    }

    public static final void a(@NotNull T7 t7, @NotNull InterfaceC1274w8... interfaceC1274w8Arr) {
        t7.getClass();
        interfaceC1274w8Arr.getClass();
        ArrayList arrayList = new ArrayList(interfaceC1274w8Arr.length);
        for (InterfaceC1274w8 interfaceC1274w8 : interfaceC1274w8Arr) {
            arrayList.add(new jsc(interfaceC1274w8));
        }
        jsc[] jscVarArr = (jsc[]) arrayList.toArray(new jsc[0]);
        t7.a((Z0[]) Arrays.copyOf(jscVarArr, jscVarArr.length));
    }
}
