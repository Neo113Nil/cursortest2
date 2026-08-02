package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ual implements zsq0, nyi {
    public final JsonParserComponent a;

    public ual(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.nyi
    public final java.lang.Object a(defpackage.yf90 r17, org.json.JSONObject r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            gal r7 = new gal
            wms r2 = defpackage.wm11.a
            java.lang.String r2 = "font_family"
            com.yandex.div.json.expressions.Expression r8 = com.yandex.div.internal.parser.a.c(r0, r1, r2)
            tms r3 = defpackage.wm11.b
            tls r4 = com.yandex.div.internal.parser.b.h
            y7l r5 = com.yandex.div2.f2.g
            kvo r6 = com.yandex.div2.f2.a
            java.lang.String r2 = "font_size"
            com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r3
            r10 = r4
            if (r2 != 0) goto L22
            r11 = r6
            goto L23
        L22:
            r11 = r2
        L23:
            qkj r3 = com.yandex.div2.f2.e
            tls r4 = com.yandex.div2.DivSizeUnit.FROM_STRING
            kvo r6 = com.yandex.div2.f2.b
            kbs r5 = defpackage.q5z.b
            java.lang.String r2 = "font_size_unit"
            r0 = r17
            r1 = r18
            com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            if (r2 != 0) goto L39
            r12 = r6
            goto L3a
        L39:
            r12 = r2
        L3a:
            yo40 r3 = defpackage.wm11.h
            abl0 r4 = defpackage.q5z.c
            r6 = 0
            java.lang.String r2 = "font_variation_settings"
            r0 = r17
            r1 = r18
            com.yandex.div.json.expressions.Expression r13 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            qkj r3 = com.yandex.div2.f2.f
            tls r4 = com.yandex.div2.DivFontWeight.FROM_STRING
            java.lang.String r2 = "font_weight"
            com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            r15 = r5
            y7l r5 = com.yandex.div2.f2.h
            java.lang.String r2 = "font_weight_value"
            r3 = r9
            r4 = r10
            com.yandex.div.json.expressions.Expression r9 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            sms r3 = defpackage.wm11.d
            tls r4 = com.yandex.div.internal.parser.b.g
            kvo r6 = com.yandex.div2.f2.c
            java.lang.String r2 = "letter_spacing"
            r5 = r15
            com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            if (r2 != 0) goto L71
            r10 = r6
        L6e:
            r2 = r16
            goto L73
        L71:
            r10 = r2
            goto L6e
        L73:
            com.yandex.div2.JsonParserComponent r2 = r2.a
            i3y r2 = r2.j6
            java.lang.String r3 = "offset"
            java.lang.Object r2 = defpackage.wwg.M(r0, r1, r3, r2)
            r15 = r2
            x4l r15 = (defpackage.x4l) r15
            rms r3 = defpackage.wm11.f
            tls r4 = com.yandex.div.internal.parser.b.b
            kvo r6 = com.yandex.div2.f2.d
            java.lang.String r2 = "text_color"
            com.yandex.div.json.expressions.Expression r0 = com.yandex.div.internal.parser.a.e(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L9a
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
            r8 = r15
            goto La4
        L9a:
            r6 = r9
            r9 = r0
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r8 = r15
            r0 = r7
            r7 = r10
        La4:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ual.a(yf90, org.json.JSONObject):java.lang.Object");
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, gal galVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "font_family", galVar.a);
        a.g(yf90Var, jSONObject, "font_size", galVar.b);
        a.h(yf90Var, jSONObject, "font_size_unit", galVar.c, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, galVar.d);
        a.h(yf90Var, jSONObject, FontsContractCompat$Columns.WEIGHT, galVar.e, DivFontWeight.TO_STRING);
        a.g(yf90Var, jSONObject, "font_weight_value", galVar.f);
        a.g(yf90Var, jSONObject, "letter_spacing", galVar.g);
        wwg.b0(yf90Var, jSONObject, "offset", galVar.h, this.a.j6);
        a.h(yf90Var, jSONObject, "text_color", galVar.i, b.a);
        return jSONObject;
    }
}
