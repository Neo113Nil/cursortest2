package com.yandex.passport.internal.network.requester;

import android.graphics.Bitmap;
import androidx.core.app.q;
import com.yandex.passport.legacy.lx.g;
import com.yandex.passport.legacy.lx.h;
import com.yandex.passport.legacy.lx.i;
import defpackage.tn3;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements g, com.yandex.passport.legacy.lx.a {
    public final /* synthetic */ e a;
    public final /* synthetic */ String b;

    public /* synthetic */ d(e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    @Override // com.yandex.passport.legacy.lx.g
    public Object b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            return new i(new tn3(6, bitmap));
        }
        e eVar = this.a;
        String str = this.b;
        i iVar = new i(new c(eVar, str, 1));
        h hVar = new h(iVar, iVar, new q(6), 2);
        return new h(hVar, hVar, new d(eVar, str), 1);
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: b */
    public void mo1b(Object obj) {
        this.a.b.put(this.b, (Bitmap) obj);
    }
}
