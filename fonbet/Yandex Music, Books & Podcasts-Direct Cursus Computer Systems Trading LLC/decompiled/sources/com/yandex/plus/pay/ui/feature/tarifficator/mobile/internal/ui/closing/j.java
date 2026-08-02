package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.cg6;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public /* synthetic */ Object A;
    public final /* synthetic */ k B;
    public int C;
    public PlusPayClosingOffer j;
    public y k;
    public CharSequence l;
    public Object m;
    public Object n;
    public String o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public CharSequence u;
    public Object v;
    public Collection w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.B = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return k.a(this.B, null, this);
    }
}
