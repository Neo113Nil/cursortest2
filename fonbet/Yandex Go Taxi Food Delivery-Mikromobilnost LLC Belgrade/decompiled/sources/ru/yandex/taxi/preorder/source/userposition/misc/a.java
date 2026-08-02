package ru.yandex.taxi.preorder.source.userposition.misc;

import android.location.Location;
import android.location.LocationListener;
import defpackage.mth;
import defpackage.tpr;
import defpackage.y6f0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes9.dex */
public abstract class a {
    public static LocationListener a(y6f0 y6f0Var) {
        return new MultipleLocationEmitter(y6f0Var);
    }

    public static tpr b(tpr tprVar, Location location) {
        return e.t(new mth(new j0(location, tprVar, new LocationRepositoryMisc$takeBestLocation$1(3, null)), 6));
    }
}
