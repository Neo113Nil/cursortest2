package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.maps.core.geometry.FloatPointFactory;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class sub0 extends nub0 {
    public uub0 a;

    @Override // defpackage.nub0
    public final PointF a(mwb0 mwb0Var, PlacemarkType placemarkType, c3c0 c3c0Var) {
        Object obj = mwb0Var.a;
        uub0 uub0Var = this.a;
        if (uub0Var == null) {
            return FloatPointFactory.INSTANCE.create(0.0f, 0.0f);
        }
        if (mwb0Var instanceof g8c) {
            return tub0.a;
        }
        switch (rub0.a[placemarkType.ordinal()]) {
            case 1:
                return uub0Var.z(obj);
            case 2:
            case 3:
                return uub0Var.p(obj);
            case 4:
                return uub0Var.f(obj, c3c0Var);
            case 5:
                return uub0Var.D(obj, c3c0Var);
            case 6:
                return uub0Var.t(obj);
            case 7:
            case 8:
                return tub0.a;
            default:
                w511.b();
                return null;
        }
    }

    @Override // defpackage.nub0
    public final f2c0 b(mwb0 mwb0Var, PlacemarkType placemarkType, boolean z, c3c0 c3c0Var) {
        Object obj = mwb0Var.a;
        uub0 uub0Var = this.a;
        if (uub0Var != null) {
            if (mwb0Var instanceof g8c) {
                s7c s7cVar = ((g8c) mwb0Var).b;
                if (s7cVar instanceof r7c) {
                    return uub0Var.B((r7c) s7cVar);
                }
                if (s7cVar instanceof q7c) {
                    return uub0Var.g(((q7c) s7cVar).b);
                }
                w511.b();
                return null;
            }
            switch (rub0.a[placemarkType.ordinal()]) {
                case 1:
                    return uub0Var.E(obj, z);
                case 2:
                case 3:
                    return uub0Var.k(obj, z);
                case 4:
                    return uub0Var.j(obj, c3c0Var);
                case 5:
                    return uub0Var.u(obj, c3c0Var);
                case 6:
                    return uub0Var.r(obj);
                default:
                    w511.b();
                case 7:
                case 8:
                    return null;
            }
        }
        return null;
    }

    @Override // defpackage.nub0
    public final i2c0 c(mwb0 mwb0Var, PlacemarkType placemarkType, c3c0 c3c0Var) {
        Object obj = mwb0Var.a;
        uub0 uub0Var = this.a;
        if (uub0Var == null) {
            return new i2c0(0, 0);
        }
        if (mwb0Var instanceof g8c) {
            s7c s7cVar = ((g8c) mwb0Var).b;
            if (s7cVar instanceof r7c) {
                return uub0Var.v((r7c) s7cVar);
            }
            if (s7cVar instanceof q7c) {
                return uub0Var.x(((q7c) s7cVar).b);
            }
            w511.b();
            return null;
        }
        switch (rub0.a[placemarkType.ordinal()]) {
            case 1:
                return uub0Var.A(obj);
            case 2:
            case 3:
                return uub0Var.q(obj);
            case 4:
                return uub0Var.h(obj, c3c0Var);
            case 5:
                return uub0Var.n(obj, c3c0Var);
            case 6:
                return uub0Var.d(obj);
            case 7:
            case 8:
                throw new IllegalStateException((placemarkType + " size requested for non-cluster id " + mwb0Var).toString());
            default:
                w511.b();
                return null;
        }
    }

    @Override // defpackage.nub0
    public final List d(mwb0 mwb0Var) {
        uub0 uub0Var;
        List m;
        return ((mwb0Var instanceof g8c) || (uub0Var = this.a) == null || (m = uub0Var.m(mwb0Var.a)) == null) ? EmptyList.a : m;
    }
}
