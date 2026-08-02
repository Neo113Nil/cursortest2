package com.yandex.plus.plaquesdk.widget;

import android.text.SpannableStringBuilder;
import com.yandex.plus.bdui.flex.ui.s;
import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public SpannableStringBuilder j;
    public Iterator k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, this);
    }
}
