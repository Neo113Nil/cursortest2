package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yr8 implements u1f, cn8 {
    public final List a;
    public final szb b;
    public final szb c;
    public final List d;
    public final szb e;
    public final String f;
    public final szb g;
    public final lu8 h;
    public final szb i;
    public final szb j;
    public final String k;
    public Integer l;

    public yr8(List list, szb szbVar, szb szbVar2, List list2, szb szbVar3, String str, szb szbVar4, lu8 lu8Var, szb szbVar5, szb szbVar6, String str2) {
        this.a = list;
        this.b = szbVar;
        this.c = szbVar2;
        this.d = list2;
        this.e = szbVar3;
        this.f = str;
        this.g = szbVar4;
        this.h = lu8Var;
        this.i = szbVar5;
        this.j = szbVar6;
        this.k = str2;
    }

    @Override // defpackage.cn8
    public final lu8 a() {
        return this.h;
    }

    @Override // defpackage.cn8
    public final szb b() {
        return this.b;
    }

    @Override // defpackage.cn8
    public final szb c() {
        return this.g;
    }

    @Override // defpackage.cn8
    public final List d() {
        return this.a;
    }

    @Override // defpackage.cn8
    public final List e() {
        return this.d;
    }

    @Override // defpackage.cn8
    public final szb f() {
        return this.i;
    }

    @Override // defpackage.cn8
    public final szb getDuration() {
        return this.c;
    }

    @Override // defpackage.cn8
    public final String getId() {
        return this.f;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((zr8) rj3.b.s2.getValue()).b(rj3.a, this);
    }
}
