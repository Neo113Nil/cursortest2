package com.gamericefishpro.space.l4;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.i implements Function1 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(1, aVar);
        this.d = i;
        this.i = obj;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new f((com.gamericefishpro.space.n4.c) this.i, aVar, 0);
            default:
                return new f((y) this.i, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((f) create(aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.n4.c cVar = (com.gamericefishpro.space.n4.c) this.i;
                    this.e = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.e.getValue()).edit();
                    LinkedHashSet linkedHashSet = cVar.f;
                    if (linkedHashSet == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) cVar.e.getValue()).getAll().isEmpty() && (context = cVar.c) != null && (str = cVar.d) != null) {
                        com.gamericefishpro.space.n4.a.a(context, str);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                y yVar = (y) this.i;
                this.e = 1;
                Object objInvoke = yVar.invoke(this);
                return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
    }
}
