package ru.yandex.taxi.orderforanother.v1.ui;

import com.yandex.go.repositories.AvatarStatus;
import defpackage.bgv;
import defpackage.cgv;
import defpackage.egv;
import defpackage.jl40;
import defpackage.mz41;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wz41;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ wz41 a;
    public final /* synthetic */ mz41 b;

    public a(wz41 wz41Var, mz41 mz41Var) {
        this.a = wz41Var;
        this.b = mz41Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        egv egvVar = (egv) obj;
        boolean z = egvVar instanceof bgv;
        mz41 mz41Var = this.b;
        wz41 wz41Var = this.a;
        if (z) {
            bgv bgvVar = (bgv) egvVar;
            if (jl40.l(bgvVar.b, AvatarStatus.NOT_FOUND_STATUS.getText())) {
                wz41Var.Lg();
            } else {
                String str = bgvVar.a;
                if (str != null) {
                    mz41Var.showPhoto(str);
                } else {
                    wz41Var.Lg();
                }
            }
        } else {
            if (!(egvVar instanceof cgv)) {
                w511.b();
                return null;
            }
            String str2 = ((cgv) egvVar).a;
            if (str2 != null) {
                mz41Var.showPhoto(str2);
            } else {
                tje.N(wz41Var.Jg(), null, null, new WhoRidePresenter$setAccountAvatar$1(wz41Var, null), 3);
            }
        }
        return zy11.a;
    }
}
