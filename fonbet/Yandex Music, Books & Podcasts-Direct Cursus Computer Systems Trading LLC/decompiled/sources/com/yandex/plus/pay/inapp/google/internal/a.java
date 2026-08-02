package com.yandex.plus.pay.inapp.google.internal;

import defpackage.gm5;
import defpackage.m4n;
import defpackage.qtm;
import defpackage.sz2;
import defpackage.uz2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements m4n, qtm {
    public final /* synthetic */ gm5 a;

    public /* synthetic */ a(gm5 gm5Var) {
        this.a = gm5Var;
    }

    public void a(uz2 uz2Var) {
        uz2Var.getClass();
        this.a.U(uz2Var);
    }

    public void b(uz2 uz2Var, sz2 sz2Var) {
        uz2Var.getClass();
        this.a.U(new b(uz2Var, sz2Var));
    }

    public void c(uz2 uz2Var, String str) {
        uz2Var.getClass();
        str.getClass();
        this.a.U(uz2Var);
    }

    @Override // defpackage.qtm
    public void onProductDetailsResponse(uz2 uz2Var, List list) {
        uz2Var.getClass();
        this.a.U(new i(uz2Var, (ArrayList) list));
    }

    @Override // defpackage.m4n
    public void onQueryPurchasesResponse(uz2 uz2Var, List list) {
        uz2Var.getClass();
        list.getClass();
        this.a.U(new j(uz2Var, list));
    }
}
