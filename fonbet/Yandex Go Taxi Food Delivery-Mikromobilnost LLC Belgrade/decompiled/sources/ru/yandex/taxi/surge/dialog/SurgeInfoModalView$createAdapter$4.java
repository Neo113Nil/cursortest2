package ru.yandex.taxi.surge.dialog;

import defpackage.dru;
import defpackage.hhs0;
import defpackage.tls;
import defpackage.xsw0;
import defpackage.zow0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class SurgeInfoModalView$createAdapter$4 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dru druVar = (dru) obj;
        xsw0 xsw0Var = (xsw0) this.receiver;
        hhs0 hhs0Var = xsw0Var.E;
        String str = druVar.a;
        zow0 zow0Var = (zow0) hhs0Var.b;
        String str2 = (String) hhs0Var.c;
        zow0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str2);
        hashMap.put("id", str);
        zow0Var.a.a("SurgeCard.Shortcut.Tap", hashMap, 1, new HashMap());
        xsw0Var.z.a(druVar);
        return zy11.a;
    }
}
