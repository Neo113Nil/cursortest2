package ru.kinopoisk.sdk.easylogin.internal;

import com.squareup.anvil.annotations.ContributesTo;
import defpackage.dfu;
import defpackage.gfu;
import defpackage.nme;
import java.util.Arrays;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

@ContributesTo.Container({@ContributesTo(scope = InterfaceC1170p.class), @ContributesTo(scope = R3.class)})
/* loaded from: classes5.dex */
public interface Sc {

    public static final class a {
        @NotNull
        public static gfu a(@NotNull Set set) {
            set.getClass();
            dfu[] dfuVarArr = (dfu[]) set.toArray(new dfu[0]);
            dfu[] dfuVarArr2 = (dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length);
            dfu[] dfuVarArr3 = (dfu[]) Arrays.copyOf(dfuVarArr2, dfuVarArr2.length);
            return new nme((dfu[]) Arrays.copyOf(dfuVarArr3, dfuVarArr3.length));
        }
    }
}
