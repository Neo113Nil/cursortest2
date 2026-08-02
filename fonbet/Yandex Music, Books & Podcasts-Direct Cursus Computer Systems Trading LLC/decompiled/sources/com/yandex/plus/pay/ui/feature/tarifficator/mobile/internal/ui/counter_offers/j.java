package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ k I;
    public int J;
    public PlusPayCounterOffers j;
    public com.yandex.plus.pay.ui.common.internal.error.content.h k;
    public CharSequence l;
    public CharSequence m;
    public Collection n;
    public Object o;
    public PlusPayCounterOffers.CounterOffer p;
    public List q;
    public CharSequence r;
    public CharSequence s;
    public Collection t;
    public Collection u;
    public Iterator v;
    public Collection w;
    public CharSequence x;
    public CharSequence y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.I = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return k.a(this.I, null, this);
    }
}
