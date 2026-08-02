package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsResult;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.tyf;
import defpackage.xq0;
import defpackage.z7o;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c implements a {
    public final g a;
    public final com.yandex.plus.pay.ui.common.api.a b;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a c;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b d;
    public final fkn e;
    public final com.yandex.plus.log.api.b f;

    public c(g gVar, com.yandex.plus.pay.ui.common.api.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar, fkn fknVar, com.yandex.plus.log.api.b bVar2) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = gVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
        this.e = fknVar;
        this.f = bVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:30|31))(7:32|(1:34)|35|(1:37)(1:42)|38|39|(1:41))|11|12|(4:14|(1:16)|17|(2:19|20)(2:22|23))(2:24|(2:26|27)(1:28))))|50|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0030, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b bVar;
        int i;
        Throwable a;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                com.yandex.plus.log.api.b bVar2 = this.f;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "ContactsCollectionRepositoryImpl", "Started loading contacts collection status");
                    }
                    PlusPayWebCollectContactsParams plusPayWebCollectContactsParams = new PlusPayWebCollectContactsParams(u.r(this.b.a(), (com.yandex.plus.ui.core.theme.a) this.e.a.getValue()) ? PlusPayWebCollectContactsParams.PageTheme.DARK : PlusPayWebCollectContactsParams.PageTheme.LIGHT);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, plusPayWebCollectContactsParams, continuation, 17);
                    bVar.l = 1;
                    obj = tyf.J(1000L, dVar, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar3 = this.d;
                if (a == null) {
                    bVar3.getClass();
                    cdk cdkVar = bVar3.a;
                    cdkVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("fail_reason", "Failed to get contacts status");
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CollectingContacts.Fail", linkedHashMap);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (!bVar2.b(aVar2)) {
                        return null;
                    }
                    bVar2.a(aVar2, "ContactsCollectionRepositoryImpl", "Failed to get contacts status", a);
                    return null;
                }
                PlusPayWebCollectContactsResult plusPayWebCollectContactsResult = (PlusPayWebCollectContactsResult) obj;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                if (bVar2.b(aVar3)) {
                    bVar2.c(aVar3, "ContactsCollectionRepositoryImpl", "Successfully got contacts status: " + plusPayWebCollectContactsResult);
                }
                if (plusPayWebCollectContactsResult.getAlreadyCollected()) {
                    bVar3.a("Already collected");
                    return d.a;
                }
                String uuid = this.c.a.a().a.toString();
                uuid.getClass();
                bVar3.b(uuid, plusPayWebCollectContactsResult.getUrl(), plusPayWebCollectContactsResult.getSkipText());
                return new e(plusPayWebCollectContactsResult.getUrl(), plusPayWebCollectContactsResult.getSkipText());
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        com.yandex.plus.log.api.b bVar22 = this.f;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar32 = this.d;
        if (a == null) {
        }
    }
}
