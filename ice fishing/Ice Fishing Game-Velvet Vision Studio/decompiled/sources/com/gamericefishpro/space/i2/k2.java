package com.gamericefishpro.space.i2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends com.gamericefishpro.space.vh.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int d = 0;
    public Object e;
    public int i;
    public Object v;
    public Object w;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(ContentResolver contentResolver, Uri uri, l2 l2Var, com.gamericefishpro.space.ri.e eVar, Context context, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.w = contentResolver;
        this.y = uri;
        this.z = l2Var;
        this.A = eVar;
        this.B = context;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k2 k2Var = new k2((ContentResolver) this.w, (Uri) this.y, (l2) this.z, (com.gamericefishpro.space.ri.e) this.A, (Context) this.B, aVar);
                k2Var.e = obj;
                return k2Var;
            default:
                k2 k2Var2 = new k2((Function0) this.B, aVar);
                k2Var2.A = obj;
                return k2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        com.gamericefishpro.space.si.f fVar = (com.gamericefishpro.space.si.f) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((k2) create(fVar, aVar)).invokeSuspend(Unit.a);
            default:
                ((k2) create(fVar, aVar)).invokeSuspend(Unit.a);
                return com.gamericefishpro.space.uh.a.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0256  */
    /* JADX WARN: Code duplicated, block: B:130:0x0257  */
    /* JADX WARN: Code duplicated, block: B:133:0x0264 A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #4 {all -> 0x0216, blocks: (B:116:0x020e, B:127:0x0249, B:131:0x025c, B:133:0x0264, B:123:0x0229, B:126:0x0240), top: B:148:0x01fe }] */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x028a -> B:127:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01b2 -> B:81:0x01b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d3 -> B:81:0x01b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.i2.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Function0 function0, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.B = function0;
    }
}
