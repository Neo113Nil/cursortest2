package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tw8 implements u1f, wj9 {
    public final szb a;
    public final zw8 b;
    public final szb c;
    public final szb d;
    public final szb e;
    public final JSONObject f;
    public final szb g;
    public final String h;
    public final uk8 i;
    public final szb j;
    public final szb k;
    public Integer l;

    public tw8(uk8 uk8Var, zw8 zw8Var, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, String str, JSONObject jSONObject) {
        this.a = szbVar;
        this.b = zw8Var;
        this.c = szbVar2;
        this.d = szbVar3;
        this.e = szbVar4;
        this.f = jSONObject;
        this.g = szbVar5;
        this.h = str;
        this.i = uk8Var;
        this.j = szbVar6;
        this.k = szbVar7;
    }

    @Override // defpackage.wj9
    public final szb a() {
        return this.d;
    }

    @Override // defpackage.wj9
    public final uk8 b() {
        return this.i;
    }

    @Override // defpackage.wj9
    public final JSONObject c() {
        return this.f;
    }

    @Override // defpackage.wj9
    public final String d() {
        return this.h;
    }

    @Override // defpackage.wj9
    public final szb e() {
        return this.e;
    }

    public final boolean f(tw8 tw8Var, xzb xzbVar, xzb xzbVar2) {
        if (tw8Var != null && ((Number) this.a.a(xzbVar)).longValue() == ((Number) tw8Var.a.a(xzbVar2)).longValue()) {
            zw8 zw8Var = tw8Var.b;
            zw8 zw8Var2 = this.b;
            if ((zw8Var2 != null ? zw8Var2.a(zw8Var, xzbVar, xzbVar2) : zw8Var == null) && ((Boolean) this.c.a(xzbVar)).booleanValue() == ((Boolean) tw8Var.c.a(xzbVar2)).booleanValue() && Intrinsics.d(this.d.a(xzbVar), tw8Var.d.a(xzbVar2)) && ((Number) this.e.a(xzbVar)).longValue() == ((Number) tw8Var.e.a(xzbVar2)).longValue() && Intrinsics.d(this.f, tw8Var.f)) {
                szb szbVar = this.g;
                Uri uri = szbVar != null ? (Uri) szbVar.a(xzbVar) : null;
                szb szbVar2 = tw8Var.g;
                if (Intrinsics.d(uri, szbVar2 != null ? (Uri) szbVar2.a(xzbVar2) : null) && Intrinsics.d(this.h, tw8Var.h)) {
                    uk8 uk8Var = tw8Var.i;
                    uk8 uk8Var2 = this.i;
                    if (uk8Var2 != null ? uk8Var2.a(uk8Var, xzbVar, xzbVar2) : uk8Var == null) {
                        szb szbVar3 = this.j;
                        Uri uri2 = szbVar3 != null ? (Uri) szbVar3.a(xzbVar) : null;
                        szb szbVar4 = tw8Var.j;
                        if (Intrinsics.d(uri2, szbVar4 != null ? (Uri) szbVar4.a(xzbVar2) : null) && ((Number) this.k.a(xzbVar)).longValue() == ((Number) tw8Var.k.a(xzbVar2)).longValue()) {
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
        int hashCode = this.a.hashCode() + ern.a(tw8.class).hashCode();
        zw8 zw8Var = this.b;
        int hashCode2 = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + hashCode + (zw8Var != null ? zw8Var.b() : 0);
        JSONObject jSONObject = this.f;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        szb szbVar = this.g;
        int hashCode4 = hashCode3 + (szbVar != null ? szbVar.hashCode() : 0);
        String str = this.h;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        uk8 uk8Var = this.i;
        int b = hashCode5 + (uk8Var != null ? uk8Var.b() : 0);
        szb szbVar2 = this.j;
        int hashCode6 = this.k.hashCode() + b + (szbVar2 != null ? szbVar2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.wj9
    public final szb getUrl() {
        return this.j;
    }

    @Override // defpackage.wj9
    public final szb isEnabled() {
        return this.c;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((vw8) rj3.b.Y2.getValue()).b(rj3.a, this);
    }
}
