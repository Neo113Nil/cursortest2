package com.yandex.passport.data.network.utils;

import defpackage.avf;
import defpackage.csm;
import defpackage.eg7;
import defpackage.gsm;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final gsm b = avf.g("IntAsBoolean", csm.g);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        boolean z = false;
        try {
            if (eg7Var.h() == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l6bVar.getClass();
        l6bVar.C(booleanValue ? 1 : 0);
    }
}
