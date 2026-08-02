package com.fillr;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public abstract class v extends l1 {
    public w e;
    public String f;

    public String toString() {
        if (this.f == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(super.toString()));
        sb.append(" [id:");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.f, "]");
    }
}
