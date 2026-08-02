package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.geometry.geo.XYPoint;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class v35 implements ym00 {
    public final if61 a;
    public final String b;
    public final XYPoint c;
    public final Set d;
    public final MapObjectComponentType e;
    public final vm00 f;
    public final float g;

    public v35(if61 if61Var, String str, XYPoint xYPoint, Set set, MapObjectComponentType mapObjectComponentType, vm00 vm00Var, float f) {
        this.a = if61Var;
        this.b = str;
        this.c = xYPoint;
        this.d = set;
        this.e = mapObjectComponentType;
        this.f = vm00Var;
        this.g = f;
    }

    @Override // defpackage.ym00
    public Set a() {
        return this.d;
    }

    @Override // defpackage.ym00
    public float b() {
        return this.g;
    }

    @Override // defpackage.ym00
    public if61 c() {
        return this.a;
    }

    @Override // defpackage.ym00
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v35 v35Var = (v35) obj;
        return jl40.l(c(), v35Var.c()) && jl40.l(e(), v35Var.e()) && jl40.l(a(), v35Var.a()) && this.e == v35Var.e && jl40.l(getAnimation(), v35Var.getAnimation());
    }

    @Override // defpackage.ym00
    public XYPoint f() {
        return this.c;
    }

    @Override // defpackage.ym00
    public vm00 getAnimation() {
        return this.f;
    }

    public final MapObjectComponentType h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.e.hashCode() + ((a().hashCode() + ((e().hashCode() + (c().hashCode() * 31)) * 31)) * 31)) * 31;
        vm00 animation = getAnimation();
        return hashCode + (animation != null ? animation.hashCode() : 0);
    }

    public /* synthetic */ v35(if61 if61Var, String str, XYPoint xYPoint, Set set, MapObjectComponentType mapObjectComponentType, vm00 vm00Var) {
        this(if61Var, str, xYPoint, set, mapObjectComponentType, vm00Var, 0.0f);
    }
}
