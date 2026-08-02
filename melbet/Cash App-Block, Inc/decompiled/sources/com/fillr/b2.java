package com.fillr;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import javax.xml.namespace.QName;

/* loaded from: classes4.dex */
public abstract class b2 extends v {
    public String i;
    public final t j;

    public b2(t tVar) {
        this.j = tVar;
        new c2("none", 2);
    }

    public final QName e() {
        if (this.i == null) {
            return null;
        }
        return new QName(this.j.u, this.i);
    }

    @Override // com.fillr.v
    public final String toString() {
        if (this.i == null) {
            return String.valueOf(super.toString()).concat("[anonymous]");
        }
        t tVar = this.j;
        if (tVar.u == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(super.toString()));
            sb.append("[{}");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.i, "]");
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(super.toString()));
        sb2.append("[{");
        sb2.append(tVar.u);
        sb2.append("}");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, this.i, "]");
    }
}
