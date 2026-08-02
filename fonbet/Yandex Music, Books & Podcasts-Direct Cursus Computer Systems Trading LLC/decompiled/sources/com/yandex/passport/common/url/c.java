package com.yandex.passport.common.url;

import android.net.Uri;
import defpackage.avf;
import defpackage.csm;
import defpackage.eg7;
import defpackage.gsm;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class c implements t9f {
    public final /* synthetic */ int a;
    public final gsm b;

    public c(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = avf.g("java.math.BigDecimal", csm.j);
                break;
            case 2:
                this.b = avf.g("android.net.Uri", csm.j);
                break;
            default:
                this.b = avf.g("provider", csm.j);
                break;
        }
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String A;
        w4f f;
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                String A2 = eg7Var.A();
                A2.getClass();
                return new b(A2);
            case 1:
                eg7Var.getClass();
                s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
                if (s4fVar == null || (f = s4fVar.f()) == null || (A = x4f.g(f).a()) == null) {
                    A = eg7Var.A();
                }
                return new BigDecimal(A);
            default:
                eg7Var.getClass();
                return Uri.parse(eg7Var.A());
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                String str = ((b) obj).a;
                l6bVar.getClass();
                str.getClass();
                l6bVar.E(str);
                break;
            case 1:
                BigDecimal bigDecimal = (BigDecimal) obj;
                l6bVar.getClass();
                bigDecimal.getClass();
                String plainString = bigDecimal.toPlainString();
                plainString.getClass();
                l6bVar.E(plainString);
                break;
            default:
                Uri uri = (Uri) obj;
                l6bVar.getClass();
                uri.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                l6bVar.E(uri2);
                break;
        }
    }
}
