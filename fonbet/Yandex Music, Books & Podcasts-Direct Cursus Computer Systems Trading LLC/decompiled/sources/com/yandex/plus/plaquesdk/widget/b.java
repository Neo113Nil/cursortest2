package com.yandex.plus.plaquesdk.widget;

import android.text.SpannableStringBuilder;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.plaquesdk.plaque.api.models.g;
import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public SpannableStringBuilder j;
    public g k;
    public Iterator l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ s p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, null, this);
    }
}
