package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tl9 implements gip, py7 {
    public final t6f a;

    public tl9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.py7
    public final java.lang.Object a(defpackage.t7k r18, org.json.JSONObject r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            yk9 r7 = new yk9
            ox8 r2 = defpackage.vct.a
            java.lang.String r2 = "font_family"
            szb r8 = defpackage.e5f.c(r0, r1, r2)
            ox8 r3 = defpackage.vct.b
            kzj r4 = defpackage.kzj.F
            mb9 r5 = defpackage.vl9.g
            ozb r6 = defpackage.vl9.a
            java.lang.String r2 = "font_size"
            szb r2 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r3
            r10 = r4
            if (r2 != 0) goto L22
            r11 = r6
            goto L23
        L22:
            r11 = r2
        L23:
            tct r3 = defpackage.vl9.e
            gd9 r4 = defpackage.gd9.w0
            ozb r6 = defpackage.vl9.b
            ns9 r5 = defpackage.bcx.h
            java.lang.String r2 = "font_size_unit"
            r0 = r18
            r1 = r19
            szb r2 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            if (r2 != 0) goto L39
            r12 = r6
            goto L3a
        L39:
            r12 = r2
        L3a:
            px8 r3 = defpackage.vct.h
            s3f r4 = defpackage.bcx.i
            r6 = 0
            java.lang.String r2 = "font_variation_settings"
            r0 = r18
            r1 = r19
            szb r13 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            tct r3 = defpackage.vl9.f
            vv8 r4 = defpackage.vv8.B
            java.lang.String r2 = "font_weight"
            szb r14 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            r15 = r5
            mb9 r5 = defpackage.vl9.h
            java.lang.String r2 = "font_weight_value"
            r3 = r9
            r4 = r10
            szb r9 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            ox8 r3 = defpackage.vct.d
            kzj r4 = defpackage.kzj.E
            ozb r6 = defpackage.vl9.c
            java.lang.String r2 = "letter_spacing"
            r5 = r15
            szb r2 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            if (r2 != 0) goto L71
            r10 = r6
        L6e:
            r15 = r17
            goto L73
        L71:
            r10 = r2
            goto L6e
        L73:
            t6f r2 = r15.a
            jyr r2 = r2.l6
            java.lang.String r3 = "offset"
            java.lang.Object r2 = defpackage.etn.U(r0, r1, r3, r2)
            r16 = r2
            bf9 r16 = (defpackage.bf9) r16
            ox8 r3 = defpackage.vct.f
            kzj r4 = defpackage.kzj.G
            ozb r6 = defpackage.vl9.d
            java.lang.String r2 = "text_color"
            szb r0 = defpackage.e5f.e(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L9c
            r0 = r9
            r9 = r6
            r6 = r0
            r0 = r7
            r1 = r8
            r7 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r8 = r16
            goto La7
        L9c:
            r6 = r9
            r9 = r0
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r8 = r16
            r0 = r7
            r7 = r10
        La7:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl9.a(t7k, org.json.JSONObject):java.lang.Object");
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yk9 yk9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "font_family", yk9Var.a);
        e5f.g(t7kVar, jSONObject, "font_size", yk9Var.b);
        szb szbVar = yk9Var.c;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("font_size_unit", b);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_variation_settings", yk9Var.d);
        szb szbVar2 = yk9Var.e;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("font_weight", b2);
                } else {
                    jSONObject.put("font_weight", ((e09) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_weight_value", yk9Var.f);
        e5f.g(t7kVar, jSONObject, "letter_spacing", yk9Var.g);
        etn.m0(t7kVar, jSONObject, "offset", yk9Var.h, this.a.l6);
        szb szbVar3 = yk9Var.i;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("text_color", b3);
                } else {
                    jSONObject.put("text_color", c85.a(((Number) b3).intValue()));
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        return jSONObject;
    }
}
