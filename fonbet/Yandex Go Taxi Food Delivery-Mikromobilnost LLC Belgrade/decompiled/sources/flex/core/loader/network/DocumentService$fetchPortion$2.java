package flex.core.loader.network;

import core.network.mapi.exception.MapiClientException;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.ie7;
import defpackage.j1m;
import defpackage.j73;
import defpackage.kp50;
import defpackage.kq90;
import defpackage.lu00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7j0;
import defpackage.pu00;
import defpackage.q370;
import defpackage.qoh;
import defpackage.qu00;
import defpackage.s7s0;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tse;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uu00;
import defpackage.uyg;
import defpackage.uzl;
import defpackage.v5j0;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wwq;
import defpackage.wzl;
import defpackage.xu00;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.core.loader.network.DocumentService$fetchPortion$2", f = "DocumentService.kt", l = {562}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentService$fetchPortion$2 extends SuspendLambda implements wls {
    final /* synthetic */ q370 $context;
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ Map<String, kotlinx.serialization.json.b> $payload;
    final /* synthetic */ u1m $query;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentService$fetchPortion$2(d dVar, u1m u1mVar, Map map, kq90 kq90Var, wbe0 wbe0Var, q370 q370Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$query = u1mVar;
        this.$payload = map;
        this.$patchParams = kq90Var;
        this.$params = wbe0Var;
        this.$context = q370Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentService$fetchPortion$2 documentService$fetchPortion$2 = new DocumentService$fetchPortion$2(this.this$0, this.$query, this.$payload, this.$patchParams, this.$params, this.$context, continuation);
        documentService$fetchPortion$2.L$0 = obj;
        return documentService$fetchPortion$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentService$fetchPortion$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02dd A[Catch: all -> 0x0038, TryCatch #9 {all -> 0x0038, blocks: (B:6:0x002c, B:9:0x017d, B:14:0x0204, B:17:0x0212, B:24:0x02ae, B:27:0x031e, B:30:0x02dd, B:32:0x02ee, B:35:0x02f6, B:39:0x030e, B:43:0x0316, B:47:0x0342, B:50:0x03b2, B:51:0x0371, B:53:0x0382, B:56:0x038a, B:60:0x03a2, B:64:0x03aa, B:72:0x01bc, B:75:0x01cd, B:78:0x01d4, B:82:0x01ec, B:85:0x01fe, B:103:0x00dd, B:105:0x00f0, B:106:0x00f4, B:108:0x00f8, B:109:0x00fc, B:111:0x010e, B:112:0x0113, B:113:0x011b, B:114:0x0120, B:116:0x0124, B:119:0x0128, B:122:0x012b, B:124:0x012e, B:126:0x0130, B:129:0x013f, B:132:0x0144, B:157:0x014a, B:137:0x0161, B:140:0x0175), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0371 A[Catch: all -> 0x0038, TryCatch #9 {all -> 0x0038, blocks: (B:6:0x002c, B:9:0x017d, B:14:0x0204, B:17:0x0212, B:24:0x02ae, B:27:0x031e, B:30:0x02dd, B:32:0x02ee, B:35:0x02f6, B:39:0x030e, B:43:0x0316, B:47:0x0342, B:50:0x03b2, B:51:0x0371, B:53:0x0382, B:56:0x038a, B:60:0x03a2, B:64:0x03aa, B:72:0x01bc, B:75:0x01cd, B:78:0x01d4, B:82:0x01ec, B:85:0x01fe, B:103:0x00dd, B:105:0x00f0, B:106:0x00f4, B:108:0x00f8, B:109:0x00fc, B:111:0x010e, B:112:0x0113, B:113:0x011b, B:114:0x0120, B:116:0x0124, B:119:0x0128, B:122:0x012b, B:124:0x012e, B:126:0x0130, B:129:0x013f, B:132:0x0144, B:157:0x014a, B:137:0x0161, B:140:0x0175), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0389  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [i7x0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [i7x0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [flex.core.loader.network.d] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v72 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MapiClientException mapiClientException;
        Integer num;
        int i;
        ?? r2;
        StackTraceElement stackTraceElement;
        String fileName;
        Integer num2;
        String num3;
        uzl uzlVar;
        i7x0 i7x0Var;
        StackTraceElement stackTraceElement2;
        String fileName2;
        Integer num4;
        String num5;
        StackTraceElement stackTraceElement3;
        String str;
        tjr tjrVar;
        uu00 b;
        v5j0 v5j0Var;
        d dVar;
        lu00 lu00Var;
        i7x0 i7x0Var2;
        int i2;
        boolean z;
        int i3;
        int i4;
        pu00 pu00Var;
        j1m j1mVar;
        v5j0 v5j0Var2;
        Object executeRequest;
        xu00 xu00Var;
        zjr zjrVar;
        i3y g;
        String str2;
        tjr tjrVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        String str3 = "No line info";
        String str4 = "No file info";
        EmptyList emptyList = EmptyList.a;
        int i5 = 0;
        tjr tjrVar3 = tjr.d;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    r1 = new i7x0();
                    r1.b("partRequest");
                    d dVar2 = this.this$0;
                    zjr zjrVar2 = dVar2.B;
                    i3y g2 = d.g(dVar2, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                    s7s0 s7s0Var = zjrVar2.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName3 = stackTraceElement3.getFileName();
                        if (fileName3 == null) {
                            fileName3 = "No file info";
                        }
                        String methodName = stackTraceElement3.getMethodName();
                        Integer num6 = new Integer(stackTraceElement3.getLineNumber());
                        if (num6.intValue() <= 0) {
                            num6 = null;
                        }
                        if (num6 == null || (str = num6.toString()) == null) {
                            str = "No line info";
                        }
                        tjrVar = new tjr(fileName3, methodName, str);
                    } else {
                        tjrVar = tjrVar3;
                    }
                    zjrVar2.d(FlexLogLevel.DEBUG, "Fetch portion started", g2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    qoh h = tje.h(tseVar, null, null, new DocumentService$fetchPortion$2$parser$1(this.this$0, this.$query, null), 3);
                    try {
                        this.this$0.B.b();
                        d dVar3 = this.this$0;
                        u1m u1mVar = this.$query;
                        wbe0 wbe0Var = this.$params;
                        Map<String, kotlinx.serialization.json.b> map = this.$payload;
                        q370 q370Var = this.$context;
                        Object obj2 = q370Var != null ? q370Var.a : null;
                        b = d.b(dVar3, u1mVar, wbe0Var, map, obj2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj2 : null);
                        this.this$0.getClass();
                        v5j0Var = new v5j0(b, null);
                        dVar = this.this$0;
                        lu00Var = dVar.a;
                        try {
                            try {
                                try {
                                } catch (MapiClientException e) {
                                    e = e;
                                    num = null;
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    num = null;
                                }
                            } catch (MapiClientException e3) {
                                e = e3;
                                i7x0Var2 = r1;
                                num = null;
                            } catch (IllegalArgumentException e4) {
                                e = e4;
                                i7x0Var2 = r1;
                                num = null;
                            }
                        } catch (MapiClientException e5) {
                            e = e5;
                            i7x0Var2 = r1;
                            num = null;
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            i7x0Var2 = r1;
                            num = null;
                        }
                    } catch (MapiClientException e7) {
                        e = e7;
                        num = null;
                        r2 = i5;
                        mapiClientException = e;
                        i7x0Var = r1;
                        i = r2;
                        d dVar4 = this.this$0;
                        zjr zjrVar3 = dVar4.B;
                        i3y g3 = d.g(dVar4, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                        MapiClientException mapiClientException2 = mapiClientException;
                        s7s0 s7s0Var2 = zjrVar3.c.a;
                        if (Boolean.FALSE.booleanValue()) {
                            fileName2 = stackTraceElement2.getFileName();
                            if (fileName2 == null) {
                            }
                            String methodName2 = stackTraceElement2.getMethodName();
                            num4 = new Integer(stackTraceElement2.getLineNumber());
                            if (num4.intValue() > 0) {
                            }
                            if (num4 != null) {
                                str3 = num5;
                            }
                            tjrVar3 = new tjr(str4, methodName2, str3);
                        }
                        tjr tjrVar4 = tjrVar3;
                        zjrVar3.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g3, emptyList, tjrVar4.a, tjrVar4.b, tjrVar4.c);
                        this.this$0.k(this.$query, mapiClientException2, "DocumentService.fetchPortion", i7x0Var);
                        uzlVar = new uzl(mapiClientException2);
                        return uzlVar;
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        num = null;
                        r2 = i5;
                        d dVar5 = this.this$0;
                        zjr zjrVar4 = dVar5.B;
                        i3y g4 = d.g(dVar5, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                        s7s0 s7s0Var3 = zjrVar4.c.a;
                        if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) j73.G(r2, new Throwable().getStackTrace())) != null) {
                            fileName = stackTraceElement.getFileName();
                            if (fileName == null) {
                                str4 = fileName;
                            }
                            String methodName3 = stackTraceElement.getMethodName();
                            num2 = new Integer(stackTraceElement.getLineNumber());
                            if (num2.intValue() > 0) {
                                num2 = num;
                            }
                            if (num2 != null && (num3 = num2.toString()) != null) {
                                str3 = num3;
                            }
                            tjrVar3 = new tjr(str4, methodName3, str3);
                        }
                        tjr tjrVar5 = tjrVar3;
                        zjrVar4.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g4, emptyList, tjrVar5.a, tjrVar5.b, tjrVar5.c);
                        this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                        uzlVar = new uzl(e);
                        return uzlVar;
                    }
                    try {
                        try {
                            try {
                                ie7 ie7Var = new ie7(this.this$0.x, new p7j0(4, b.a, b.c), false, new qu00(b, (uyg) dVar.A.invoke(), v5j0Var, new c(h)), this.$patchParams);
                                i4 = 0;
                                try {
                                    pu00Var = new pu00(ie7Var);
                                } catch (MapiClientException e9) {
                                    e = e9;
                                    i7x0Var2 = r1;
                                    i3 = 0;
                                    num = null;
                                    i2 = i3;
                                    mapiClientException = e;
                                    i7x0Var = i7x0Var2;
                                    i = i2;
                                    d dVar42 = this.this$0;
                                    zjr zjrVar32 = dVar42.B;
                                    i3y g32 = d.g(dVar42, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                                    MapiClientException mapiClientException22 = mapiClientException;
                                    s7s0 s7s0Var22 = zjrVar32.c.a;
                                    if (Boolean.FALSE.booleanValue()) {
                                    }
                                    tjr tjrVar42 = tjrVar3;
                                    zjrVar32.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g32, emptyList, tjrVar42.a, tjrVar42.b, tjrVar42.c);
                                    this.this$0.k(this.$query, mapiClientException22, "DocumentService.fetchPortion", i7x0Var);
                                    uzlVar = new uzl(mapiClientException22);
                                    return uzlVar;
                                } catch (IllegalArgumentException e10) {
                                    e = e10;
                                    i7x0Var2 = r1;
                                    z = false;
                                    num = null;
                                    r2 = z;
                                    r1 = i7x0Var2;
                                    d dVar52 = this.this$0;
                                    zjr zjrVar42 = dVar52.B;
                                    i3y g42 = d.g(dVar52, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                                    s7s0 s7s0Var32 = zjrVar42.c.a;
                                    if (Boolean.FALSE.booleanValue()) {
                                        fileName = stackTraceElement.getFileName();
                                        if (fileName == null) {
                                        }
                                        String methodName32 = stackTraceElement.getMethodName();
                                        num2 = new Integer(stackTraceElement.getLineNumber());
                                        if (num2.intValue() > 0) {
                                        }
                                        if (num2 != null) {
                                            str3 = num3;
                                        }
                                        tjrVar3 = new tjr(str4, methodName32, str3);
                                    }
                                    tjr tjrVar52 = tjrVar3;
                                    zjrVar42.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g42, emptyList, tjrVar52.a, tjrVar52.b, tjrVar52.c);
                                    this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                                    uzlVar = new uzl(e);
                                    return uzlVar;
                                }
                                try {
                                    wwq wwqVar = this.this$0.z;
                                    if (wwqVar != null) {
                                        try {
                                            j1mVar = new j1m(b, wwqVar);
                                        } catch (MapiClientException e11) {
                                            mapiClientException = e11;
                                            i = 0;
                                            num = null;
                                            i7x0Var = r1;
                                            d dVar422 = this.this$0;
                                            zjr zjrVar322 = dVar422.B;
                                            i3y g322 = d.g(dVar422, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                                            MapiClientException mapiClientException222 = mapiClientException;
                                            s7s0 s7s0Var222 = zjrVar322.c.a;
                                            if (Boolean.FALSE.booleanValue()) {
                                            }
                                            tjr tjrVar422 = tjrVar3;
                                            zjrVar322.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g322, emptyList, tjrVar422.a, tjrVar422.b, tjrVar422.c);
                                            this.this$0.k(this.$query, mapiClientException222, "DocumentService.fetchPortion", i7x0Var);
                                            uzlVar = new uzl(mapiClientException222);
                                            return uzlVar;
                                        } catch (IllegalArgumentException e12) {
                                            e = e12;
                                            r2 = 0;
                                            num = null;
                                            d dVar522 = this.this$0;
                                            zjr zjrVar422 = dVar522.B;
                                            i3y g422 = d.g(dVar522, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                                            s7s0 s7s0Var322 = zjrVar422.c.a;
                                            if (Boolean.FALSE.booleanValue()) {
                                            }
                                            tjr tjrVar522 = tjrVar3;
                                            zjrVar422.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g422, emptyList, tjrVar522.a, tjrVar522.b, tjrVar522.c);
                                            this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                                            uzlVar = new uzl(e);
                                            return uzlVar;
                                        }
                                    } else {
                                        j1mVar = null;
                                    }
                                } catch (MapiClientException e13) {
                                    e = e13;
                                    r2 = 0;
                                    num = null;
                                    mapiClientException = e;
                                    i7x0Var = r1;
                                    i = r2;
                                    d dVar4222 = this.this$0;
                                    zjr zjrVar3222 = dVar4222.B;
                                    i3y g3222 = d.g(dVar4222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                                    MapiClientException mapiClientException2222 = mapiClientException;
                                    s7s0 s7s0Var2222 = zjrVar3222.c.a;
                                    if (Boolean.FALSE.booleanValue()) {
                                    }
                                    tjr tjrVar4222 = tjrVar3;
                                    zjrVar3222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g3222, emptyList, tjrVar4222.a, tjrVar4222.b, tjrVar4222.c);
                                    this.this$0.k(this.$query, mapiClientException2222, "DocumentService.fetchPortion", i7x0Var);
                                    uzlVar = new uzl(mapiClientException2222);
                                    return uzlVar;
                                } catch (IllegalArgumentException e14) {
                                    e = e14;
                                }
                            } catch (MapiClientException e15) {
                                e = e15;
                                i7x0Var2 = r1;
                                i3 = 0;
                            } catch (IllegalArgumentException e16) {
                                e = e16;
                                i7x0Var2 = r1;
                                z = false;
                            }
                        } catch (MapiClientException e17) {
                            e = e17;
                            r2 = 0;
                        } catch (IllegalArgumentException e18) {
                            e = e18;
                            r2 = 0;
                        }
                    } catch (MapiClientException e19) {
                        e = e19;
                        num = null;
                        i7x0Var2 = r1;
                        i2 = 0;
                        mapiClientException = e;
                        i7x0Var = i7x0Var2;
                        i = i2;
                        d dVar42222 = this.this$0;
                        zjr zjrVar32222 = dVar42222.B;
                        i3y g32222 = d.g(dVar42222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                        MapiClientException mapiClientException22222 = mapiClientException;
                        s7s0 s7s0Var22222 = zjrVar32222.c.a;
                        if (Boolean.FALSE.booleanValue()) {
                        }
                        tjr tjrVar42222 = tjrVar3;
                        zjrVar32222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g32222, emptyList, tjrVar42222.a, tjrVar42222.b, tjrVar42222.c);
                        this.this$0.k(this.$query, mapiClientException22222, "DocumentService.fetchPortion", i7x0Var);
                        uzlVar = new uzl(mapiClientException22222);
                        return uzlVar;
                    } catch (IllegalArgumentException e20) {
                        e = e20;
                        num = null;
                        i7x0Var2 = r1;
                        r2 = 0;
                        r1 = i7x0Var2;
                        d dVar5222 = this.this$0;
                        zjr zjrVar4222 = dVar5222.B;
                        i3y g4222 = d.g(dVar5222, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                        s7s0 s7s0Var3222 = zjrVar4222.c.a;
                        if (Boolean.FALSE.booleanValue()) {
                        }
                        tjr tjrVar5222 = tjrVar3;
                        zjrVar4222.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g4222, emptyList, tjrVar5222.a, tjrVar5222.b, tjrVar5222.c);
                        this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                        uzlVar = new uzl(e);
                        return uzlVar;
                    }
                    try {
                        this.L$0 = null;
                        this.L$1 = r1;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = v5j0Var;
                        this.label = 1;
                        i7x0Var2 = r1;
                        v5j0Var2 = v5j0Var;
                        num = null;
                        try {
                            executeRequest = lu00Var.executeRequest(b, pu00Var, j1mVar, v5j0Var2, this);
                            if (executeRequest == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r1 = i7x0Var2;
                        } catch (MapiClientException e21) {
                            e = e21;
                            i2 = 0;
                            mapiClientException = e;
                            i7x0Var = i7x0Var2;
                            i = i2;
                            d dVar422222 = this.this$0;
                            zjr zjrVar322222 = dVar422222.B;
                            i3y g322222 = d.g(dVar422222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                            MapiClientException mapiClientException222222 = mapiClientException;
                            s7s0 s7s0Var222222 = zjrVar322222.c.a;
                            if (Boolean.FALSE.booleanValue()) {
                            }
                            tjr tjrVar422222 = tjrVar3;
                            zjrVar322222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g322222, emptyList, tjrVar422222.a, tjrVar422222.b, tjrVar422222.c);
                            this.this$0.k(this.$query, mapiClientException222222, "DocumentService.fetchPortion", i7x0Var);
                            uzlVar = new uzl(mapiClientException222222);
                            return uzlVar;
                        } catch (IllegalArgumentException e22) {
                            e = e22;
                            r2 = 0;
                            r1 = i7x0Var2;
                            d dVar52222 = this.this$0;
                            zjr zjrVar42222 = dVar52222.B;
                            i3y g42222 = d.g(dVar52222, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                            s7s0 s7s0Var32222 = zjrVar42222.c.a;
                            if (Boolean.FALSE.booleanValue()) {
                            }
                            tjr tjrVar52222 = tjrVar3;
                            zjrVar42222.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g42222, emptyList, tjrVar52222.a, tjrVar52222.b, tjrVar52222.c);
                            this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                            uzlVar = new uzl(e);
                            return uzlVar;
                        }
                    } catch (MapiClientException e23) {
                        e = e23;
                        r2 = 0;
                        num = null;
                        mapiClientException = e;
                        i7x0Var = r1;
                        i = r2;
                        d dVar4222222 = this.this$0;
                        zjr zjrVar3222222 = dVar4222222.B;
                        i3y g3222222 = d.g(dVar4222222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                        MapiClientException mapiClientException2222222 = mapiClientException;
                        s7s0 s7s0Var2222222 = zjrVar3222222.c.a;
                        if (Boolean.FALSE.booleanValue()) {
                        }
                        tjr tjrVar4222222 = tjrVar3;
                        zjrVar3222222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g3222222, emptyList, tjrVar4222222.a, tjrVar4222222.b, tjrVar4222222.c);
                        this.this$0.k(this.$query, mapiClientException2222222, "DocumentService.fetchPortion", i7x0Var);
                        uzlVar = new uzl(mapiClientException2222222);
                        return uzlVar;
                    } catch (IllegalArgumentException e24) {
                        e = e24;
                        r2 = 0;
                        num = null;
                        d dVar522222 = this.this$0;
                        zjr zjrVar422222 = dVar522222.B;
                        i3y g422222 = d.g(dVar522222, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                        s7s0 s7s0Var322222 = zjrVar422222.c.a;
                        if (Boolean.FALSE.booleanValue()) {
                        }
                        tjr tjrVar522222 = tjrVar3;
                        zjrVar422222.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g422222, emptyList, tjrVar522222.a, tjrVar522222.b, tjrVar522222.c);
                        this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                        uzlVar = new uzl(e);
                        return uzlVar;
                    }
                } else {
                    if (r1 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v5j0 v5j0Var3 = (v5j0) this.L$4;
                    i7x0 i7x0Var3 = (i7x0) this.L$1;
                    kotlin.b.b(obj);
                    v5j0Var2 = v5j0Var3;
                    num = null;
                    i4 = 0;
                    executeRequest = obj;
                    r1 = i7x0Var3;
                }
                try {
                    try {
                        this.this$0.d(((xu00) executeRequest).b, v5j0Var2.l);
                        xu00Var = (xu00) executeRequest;
                        d dVar6 = this.this$0;
                        zjrVar = dVar6.B;
                        g = d.g(dVar6, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                        s7s0 s7s0Var4 = zjrVar.c.a;
                    } catch (MapiClientException e25) {
                        e = e25;
                        r2 = i4;
                    }
                } catch (IllegalArgumentException e26) {
                    e = e26;
                    r2 = i4;
                }
            } finally {
                this.this$0.B.a();
            }
        } catch (MapiClientException e27) {
            mapiClientException = e27;
            num = null;
            i = 0;
            i7x0Var = r1;
        } catch (IllegalArgumentException e28) {
            e = e28;
        }
        try {
            try {
                if (Boolean.FALSE.booleanValue()) {
                    StackTraceElement stackTraceElement4 = (StackTraceElement) j73.G(i4, new Throwable().getStackTrace());
                    if (stackTraceElement4 != null) {
                        try {
                            String fileName4 = stackTraceElement4.getFileName();
                            if (fileName4 == null) {
                                fileName4 = "No file info";
                            }
                            String methodName4 = stackTraceElement4.getMethodName();
                            Integer num7 = new Integer(stackTraceElement4.getLineNumber());
                            if (num7.intValue() <= 0) {
                                num7 = num;
                            }
                            if (num7 != null) {
                                str2 = num7.toString();
                                if (str2 == null) {
                                }
                                tjrVar2 = new tjr(fileName4, methodName4, str2);
                                i5 = i4;
                                r2 = i5;
                                zjrVar.d(FlexLogLevel.DEBUG, "Fetched portion successfully", g, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                                return kp50.W((wzl) xu00Var.a, r2);
                            }
                            str2 = "No line info";
                            tjrVar2 = new tjr(fileName4, methodName4, str2);
                            i5 = i4;
                            r2 = i5;
                            zjrVar.d(FlexLogLevel.DEBUG, "Fetched portion successfully", g, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                            return kp50.W((wzl) xu00Var.a, r2);
                        } catch (MapiClientException e29) {
                            mapiClientException = e29;
                            i = i4;
                            i7x0Var = r1;
                            d dVar42222222 = this.this$0;
                            zjr zjrVar32222222 = dVar42222222.B;
                            i3y g32222222 = d.g(dVar42222222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                            MapiClientException mapiClientException22222222 = mapiClientException;
                            s7s0 s7s0Var22222222 = zjrVar32222222.c.a;
                            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) j73.G(i, new Throwable().getStackTrace())) != null) {
                                fileName2 = stackTraceElement2.getFileName();
                                if (fileName2 == null) {
                                    str4 = fileName2;
                                }
                                String methodName22 = stackTraceElement2.getMethodName();
                                num4 = new Integer(stackTraceElement2.getLineNumber());
                                if (num4.intValue() > 0) {
                                    num4 = num;
                                }
                                if (num4 != null && (num5 = num4.toString()) != null) {
                                    str3 = num5;
                                }
                                tjrVar3 = new tjr(str4, methodName22, str3);
                            }
                            tjr tjrVar42222222 = tjrVar3;
                            zjrVar32222222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g32222222, emptyList, tjrVar42222222.a, tjrVar42222222.b, tjrVar42222222.c);
                            this.this$0.k(this.$query, mapiClientException22222222, "DocumentService.fetchPortion", i7x0Var);
                            uzlVar = new uzl(mapiClientException22222222);
                            return uzlVar;
                        }
                    }
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Fetched portion successfully", g, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                return kp50.W((wzl) xu00Var.a, r2);
            } catch (MapiClientException e30) {
                e = e30;
                mapiClientException = e;
                i7x0Var = r1;
                i = r2;
                d dVar422222222 = this.this$0;
                zjr zjrVar322222222 = dVar422222222.B;
                i3y g322222222 = d.g(dVar422222222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
                MapiClientException mapiClientException222222222 = mapiClientException;
                s7s0 s7s0Var222222222 = zjrVar322222222.c.a;
                if (Boolean.FALSE.booleanValue()) {
                }
                tjr tjrVar422222222 = tjrVar3;
                zjrVar322222222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g322222222, emptyList, tjrVar422222222.a, tjrVar422222222.b, tjrVar422222222.c);
                this.this$0.k(this.$query, mapiClientException222222222, "DocumentService.fetchPortion", i7x0Var);
                uzlVar = new uzl(mapiClientException222222222);
                return uzlVar;
            } catch (IllegalArgumentException e31) {
                e = e31;
                d dVar5222222 = this.this$0;
                zjr zjrVar4222222 = dVar5222222.B;
                i3y g4222222 = d.g(dVar5222222, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
                s7s0 s7s0Var3222222 = zjrVar4222222.c.a;
                if (Boolean.FALSE.booleanValue()) {
                }
                tjr tjrVar5222222 = tjrVar3;
                zjrVar4222222.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g4222222, emptyList, tjrVar5222222.a, tjrVar5222222.b, tjrVar5222222.c);
                this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
                uzlVar = new uzl(e);
                return uzlVar;
            }
            r2 = i5;
        } catch (MapiClientException e32) {
            e = e32;
            r2 = i5;
            mapiClientException = e;
            i7x0Var = r1;
            i = r2;
            d dVar4222222222 = this.this$0;
            zjr zjrVar3222222222 = dVar4222222222.B;
            i3y g3222222222 = d.g(dVar4222222222, this.$query, null, this.$payload, null, mapiClientException, this.$patchParams, 10);
            MapiClientException mapiClientException2222222222 = mapiClientException;
            s7s0 s7s0Var2222222222 = zjrVar3222222222.c.a;
            if (Boolean.FALSE.booleanValue()) {
            }
            tjr tjrVar4222222222 = tjrVar3;
            zjrVar3222222222.d(FlexLogLevel.DEBUG, "Failed to fetch portion", g3222222222, emptyList, tjrVar4222222222.a, tjrVar4222222222.b, tjrVar4222222222.c);
            this.this$0.k(this.$query, mapiClientException2222222222, "DocumentService.fetchPortion", i7x0Var);
            uzlVar = new uzl(mapiClientException2222222222);
            return uzlVar;
        } catch (IllegalArgumentException e33) {
            e = e33;
            r2 = i5;
            d dVar52222222 = this.this$0;
            zjr zjrVar42222222 = dVar52222222.B;
            i3y g42222222 = d.g(dVar52222222, this.$query, null, this.$payload, null, null, this.$patchParams, 26);
            s7s0 s7s0Var32222222 = zjrVar42222222.c.a;
            if (Boolean.FALSE.booleanValue()) {
            }
            tjr tjrVar52222222 = tjrVar3;
            zjrVar42222222.d(FlexLogLevel.DEBUG, "Failed create request while fetching portion", g42222222, emptyList, tjrVar52222222.a, tjrVar52222222.b, tjrVar52222222.c);
            this.this$0.k(this.$query, e, "DocumentService.fetchPortion", r1);
            uzlVar = new uzl(e);
            return uzlVar;
        }
        tjrVar2 = tjrVar3;
        i5 = i4;
    }
}
