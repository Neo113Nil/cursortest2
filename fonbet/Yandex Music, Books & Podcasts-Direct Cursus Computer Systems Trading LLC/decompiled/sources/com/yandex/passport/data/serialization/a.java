package com.yandex.passport.data.serialization;

import defpackage.avf;
import defpackage.csm;
import defpackage.eg7;
import defpackage.gsm;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final gsm b = avf.g("com.yandex.passport.uuid", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        UUID fromString = UUID.fromString(eg7Var.A());
        fromString.getClass();
        return fromString;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        UUID uuid = (UUID) obj;
        l6bVar.getClass();
        uuid.getClass();
        String uuid2 = uuid.toString();
        uuid2.getClass();
        l6bVar.E(uuid2);
    }
}
