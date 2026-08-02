package com.yandex.plus.webview.internal.contract.request;

import com.yandex.plus.home.internal.di.y;
import defpackage.cg6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public String j;
    public Map k;
    public ArrayList l;
    public LinkedHashMap m;
    public /* synthetic */ Object n;
    public final /* synthetic */ y o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, null, this);
    }
}
