package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oho;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.sn5;
import defpackage.uif;
import defpackage.wn5;
import kotlin.Unit;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.oc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1169oc extends uif implements pyc {
    public final /* synthetic */ sn5 a;
    public final /* synthetic */ C1068h9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169oc(sn5 sn5Var, C1068h9 c1068h9) {
        super(3);
        this.a = sn5Var;
        this.b = c1068h9;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        ((oho) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        ((wn5) this.a).invoke(this.b, hq5Var, 0);
        return Unit.a;
    }
}
