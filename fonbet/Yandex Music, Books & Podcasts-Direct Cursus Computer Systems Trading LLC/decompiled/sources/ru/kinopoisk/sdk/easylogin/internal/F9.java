package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.dh3;
import defpackage.hq5;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class F9 extends uif implements pyc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(boolean z, nbt nbtVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(3);
        this.a = z;
        this.b = nbtVar;
        this.c = function0;
        this.d = function02;
        this.e = function03;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dh3) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        G9.a(this.a, this.b, null, this.c, this.d, this.e, hq5Var, 0);
        return Unit.a;
    }
}
