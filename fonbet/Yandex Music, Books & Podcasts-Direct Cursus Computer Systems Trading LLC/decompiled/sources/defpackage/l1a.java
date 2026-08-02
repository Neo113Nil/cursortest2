package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l1a implements u1f, wj9 {
    public final zw8 a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final JSONObject e;
    public final szb f;
    public final String g;
    public final uk8 h;
    public final szb i;
    public final szb j;
    public final szb k;
    public Integer l;

    public l1a(uk8 uk8Var, zw8 zw8Var, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, String str, JSONObject jSONObject) {
        this.a = zw8Var;
        this.b = szbVar;
        this.c = szbVar2;
        this.d = szbVar3;
        this.e = jSONObject;
        this.f = szbVar4;
        this.g = str;
        this.h = uk8Var;
        this.i = szbVar5;
        this.j = szbVar6;
        this.k = szbVar7;
    }

    @Override // defpackage.wj9
    public final szb a() {
        return this.c;
    }

    @Override // defpackage.wj9
    public final uk8 b() {
        return this.h;
    }

    @Override // defpackage.wj9
    public final JSONObject c() {
        return this.e;
    }

    @Override // defpackage.wj9
    public final String d() {
        return this.g;
    }

    @Override // defpackage.wj9
    public final szb e() {
        return this.d;
    }

    public final boolean f(l1a l1aVar, xzb xzbVar, xzb xzbVar2) {
        if (l1aVar != null) {
            zw8 zw8Var = l1aVar.a;
            zw8 zw8Var2 = this.a;
            if ((zw8Var2 != null ? zw8Var2.a(zw8Var, xzbVar, xzbVar2) : zw8Var == null) && ((Boolean) this.b.a(xzbVar)).booleanValue() == ((Boolean) l1aVar.b.a(xzbVar2)).booleanValue() && Intrinsics.d(this.c.a(xzbVar), l1aVar.c.a(xzbVar2)) && ((Number) this.d.a(xzbVar)).longValue() == ((Number) l1aVar.d.a(xzbVar2)).longValue() && Intrinsics.d(this.e, l1aVar.e)) {
                szb szbVar = this.f;
                Uri uri = szbVar != null ? (Uri) szbVar.a(xzbVar) : null;
                szb szbVar2 = l1aVar.f;
                if (Intrinsics.d(uri, szbVar2 != null ? (Uri) szbVar2.a(xzbVar2) : null) && Intrinsics.d(this.g, l1aVar.g)) {
                    uk8 uk8Var = l1aVar.h;
                    uk8 uk8Var2 = this.h;
                    if (uk8Var2 != null ? uk8Var2.a(uk8Var, xzbVar, xzbVar2) : uk8Var == null) {
                        szb szbVar3 = this.i;
                        Uri uri2 = szbVar3 != null ? (Uri) szbVar3.a(xzbVar) : null;
                        szb szbVar4 = l1aVar.i;
                        if (Intrinsics.d(uri2, szbVar4 != null ? (Uri) szbVar4.a(xzbVar2) : null) && ((Number) this.j.a(xzbVar)).longValue() == ((Number) l1aVar.j.a(xzbVar2)).longValue() && ((Number) this.k.a(xzbVar)).longValue() == ((Number) l1aVar.k.a(xzbVar2)).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int g() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(l1a.class).hashCode();
        zw8 zw8Var = this.a;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (zw8Var != null ? zw8Var.b() : 0);
        JSONObject jSONObject = this.e;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        szb szbVar = this.f;
        int hashCode4 = hashCode3 + (szbVar != null ? szbVar.hashCode() : 0);
        String str = this.g;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        uk8 uk8Var = this.h;
        int b = hashCode5 + (uk8Var != null ? uk8Var.b() : 0);
        szb szbVar2 = this.i;
        int hashCode6 = this.k.hashCode() + this.j.hashCode() + b + (szbVar2 != null ? szbVar2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.wj9
    public final szb getUrl() {
        return this.i;
    }

    @Override // defpackage.wj9
    public final szb isEnabled() {
        return this.b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((n1a) rj3.b.U9.getValue()).b(rj3.a, this);
    }
}
