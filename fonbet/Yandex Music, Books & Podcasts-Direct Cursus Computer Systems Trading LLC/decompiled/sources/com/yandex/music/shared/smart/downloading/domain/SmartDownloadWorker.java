package com.yandex.music.shared.smart.downloading.domain;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.bzq;
import defpackage.c72;
import defpackage.cg6;
import defpackage.cmj;
import defpackage.cxb;
import defpackage.czq;
import defpackage.dfi;
import defpackage.dzq;
import defpackage.e5w;
import defpackage.eta;
import defpackage.eyq;
import defpackage.f1j;
import defpackage.f9h;
import defpackage.fa6;
import defpackage.frt;
import defpackage.fxf;
import defpackage.g2j;
import defpackage.g4w;
import defpackage.gzq;
import defpackage.hag;
import defpackage.hzq;
import defpackage.ixf;
import defpackage.jyr;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.nzq;
import defpackage.opb;
import defpackage.ot0;
import defpackage.pyq;
import defpackage.q97;
import defpackage.qgg;
import defpackage.quk;
import defpackage.qyq;
import defpackage.ryq;
import defpackage.rzf;
import defpackage.ssa;
import defpackage.ssg;
import defpackage.su4;
import defpackage.syq;
import defpackage.t4w;
import defpackage.t70;
import defpackage.t75;
import defpackage.tcg;
import defpackage.tqn;
import defpackage.trj;
import defpackage.tyq;
import defpackage.urj;
import defpackage.vdr;
import defpackage.vyq;
import defpackage.wxf;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.yd5;
import defpackage.yyq;
import defpackage.z22;
import defpackage.z66;
import defpackage.zsd;
import defpackage.zwf;
import defpackage.zzi;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/music/shared/smart/downloading/domain/SmartDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lbzq;", "di", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lbzq;)V", "shared-smart-downloading"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SmartDownloadWorker extends CoroutineWorker {
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartDownloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull bzq bzqVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        bzqVar.getClass();
        this.g = bzqVar.b(hag.I(yyq.class), true);
        this.h = bzqVar.b(hag.I(cmj.class), true);
        this.i = bzqVar.b(hag.I(frt.class), true);
        this.j = bzqVar.b(hag.I(z66.class), true);
        this.k = bzqVar.b(hag.I(hzq.class), true);
        this.l = bzqVar.b(hag.I(vyq.class), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0247, code lost:
    
        if (r0 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0225, code lost:
    
        if (r0 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x06bf, code lost:
    
        if (r14 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x07bb, code lost:
    
        if (r21 == null) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x059d A[Catch: all -> 0x05b3, TRY_LEAVE, TryCatch #4 {all -> 0x05b3, blocks: (B:90:0x0595, B:92:0x059d), top: B:89:0x0595 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x068f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        tyq tyqVar;
        int i;
        jyr jyrVar;
        boolean z;
        Object obj;
        boolean z2;
        ryq ryqVar;
        boolean a;
        String str;
        String str2;
        String str3;
        hzq hzqVar;
        boolean z3;
        Long l;
        xqn xqnVar;
        String str4;
        boolean z4;
        xqn xqnVar2;
        boolean z5;
        Long l2;
        Object obj2;
        List c;
        boolean z6;
        xqn xqnVar3;
        Object obj3;
        Object obj4;
        vyq vyqVar;
        String uuid;
        xqn xqnVar4;
        yyq yyqVar;
        String str5;
        tyq tyqVar2;
        String str6;
        boolean z7;
        Object i0;
        nm6 nm6Var;
        Object obj5;
        List list;
        boolean z8;
        e5w e5wVar;
        Long l3;
        Long l4;
        String str7;
        boolean z9;
        boolean z10;
        String str8;
        WorkerParameters workerParameters;
        xqn xqnVar5;
        Long l5;
        Long l6;
        t70 t70Var;
        jyr jyrVar2;
        Long l7;
        Long l8;
        Long l9;
        xqn xqnVar6;
        xqn xqnVar7;
        String str9;
        String str10;
        String str11;
        String str12;
        WorkerParameters workerParameters2;
        String str13;
        Function0 function0;
        tqn tqnVar;
        Long l10;
        xqn xqnVar8;
        boolean z11;
        Object obj6;
        Long l11;
        xqn xqnVar9;
        tqn tqnVar2;
        String str14;
        boolean z12;
        Object obj7;
        SmartDownloadWorker smartDownloadWorker;
        eyq eyqVar;
        tqn tqnVar3;
        Function0 function02;
        xqn xqnVar10;
        Long l12;
        String str15;
        xqn xqnVar11;
        boolean z13;
        syq syqVar;
        Integer num;
        syq syqVar2;
        ryq ryqVar2;
        Integer num2;
        if (continuation instanceof tyq) {
            tyqVar = (tyq) continuation;
            int i2 = tyqVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tyqVar.A = i2 - Integer.MIN_VALUE;
                Object obj8 = tyqVar.y;
                nm6 nm6Var2 = nm6.a;
                i = tyqVar.A;
                jyr jyrVar3 = this.j;
                jyr jyrVar4 = this.g;
                jyr jyrVar5 = this.l;
                jyr jyrVar6 = this.k;
                String str16 = " requestUpdate=";
                qyq qyqVar = qyq.a;
                WorkerParameters workerParameters3 = this.b;
                switch (i) {
                    case 0:
                        qgg.h0(obj8);
                        yyq yyqVar2 = (yyq) jyrVar4.getValue();
                        tyqVar.A = 1;
                        yyqVar2.getClass();
                        jyr jyrVar7 = dzq.f;
                        if (!quk.f()) {
                            obj8 = Boolean.FALSE;
                            break;
                        } else {
                            obj8 = ((z22) ((c72) yyqVar2.b.getValue())).b(tyqVar);
                            break;
                        }
                    case 1:
                        qgg.h0(obj8);
                        if (!((Boolean) obj8).booleanValue()) {
                            return tcg.a();
                        }
                        frt frtVar = (frt) this.i.getValue();
                        tyqVar.A = 2;
                        obj8 = ixf.J(frtVar, tyqVar);
                        break;
                    case 2:
                        qgg.h0(obj8);
                        if (!((Boolean) obj8).booleanValue()) {
                            return tcg.a();
                        }
                        boolean a2 = workerParameters3.b.a("ignoreTimeIntervals");
                        jyrVar = jyrVar6;
                        boolean a3 = workerParameters3.b.a("ignoreRuntimeConstraints");
                        hzq hzqVar2 = (hzq) jyrVar.getValue();
                        tyqVar.j = a2;
                        tyqVar.k = a3;
                        tyqVar.A = 3;
                        Object a4 = ((nzq) hzqVar2).a(tyqVar);
                        if (a4 != nm6Var2) {
                            z = a3;
                            obj = a4;
                            z2 = a2;
                            Long l13 = (Long) obj;
                            ryqVar = qyqVar;
                            a = workerParameters3.b.a("retryFlag");
                            str = " needToRetry=";
                            String b = workerParameters3.b.b("workPolicy");
                            str2 = " requestUpdate=";
                            str3 = b != null ? "setup" : b;
                            hzqVar = (hzq) jyrVar.getValue();
                            z3 = z2 && !str3.equals("setup");
                            tyqVar.n = l13;
                            tyqVar.o = str3;
                            tyqVar.j = z2;
                            tyqVar.k = z;
                            tyqVar.l = a;
                            tyqVar.A = 4;
                            if (((nzq) hzqVar).c(z3, tyqVar) != nm6Var2) {
                                l = l13;
                                xqnVar = new xqn();
                                str4 = "finished: result=";
                                if (!z2) {
                                    c = t75.c(e5w.g);
                                    z4 = z2;
                                    z5 = z;
                                    l2 = l;
                                    z6 = a;
                                    xqnVar3 = xqnVar;
                                    xqnVar.a = c;
                                    xqn xqnVar12 = new xqn();
                                    xqnVar12.a = rzf.N((List) xqnVar3.a);
                                    e5w e5wVar2 = (e5w) CollectionsKt.firstOrNull((List) xqnVar3.a);
                                    String C = zwf.C(e5wVar2 != null ? e5wVar2.e : null);
                                    obj3 = "workPolicy";
                                    String y = rzf.y((List) xqnVar3.a);
                                    obj4 = "retryFlag";
                                    e5w e5wVar3 = (e5w) xqnVar12.a;
                                    String z14 = e5wVar3 != null ? rzf.z(e5wVar3) : null;
                                    UUID uuid2 = workerParameters3.a;
                                    tyq tyqVar3 = tyqVar;
                                    Long l14 = l2;
                                    StringBuilder j = eta.j("started[force=", z4, " ignoreRuntimeConstraints=", z5, "]: intervals=");
                                    su4.v(j, y, " selected=", z14, " date=");
                                    j.append(C);
                                    j.append(" retry=");
                                    j.append(z6);
                                    j.append(" policy=");
                                    j.append(str3);
                                    j.append(" id=");
                                    j.append(uuid2);
                                    ssg.a(3, "SmartDownloadWorker", j.toString(), null);
                                    vyqVar = (vyq) jyrVar5.getValue();
                                    uuid = workerParameters3.a.toString();
                                    uuid.getClass();
                                    List list2 = (List) xqnVar3.a;
                                    xqnVar4 = xqnVar12;
                                    e5w e5wVar4 = (e5w) xqnVar4.a;
                                    yyqVar = (yyq) jyrVar4.getValue();
                                    vdr d = ((z66) jyrVar3.getValue()).d();
                                    str5 = "SmartDownloadWorker";
                                    tyqVar2 = tyqVar3;
                                    str6 = " id=";
                                    tyqVar2.n = l14;
                                    tyqVar2.o = str3;
                                    tyqVar2.p = xqnVar3;
                                    tyqVar2.q = xqnVar4;
                                    tyqVar2.r = vyqVar;
                                    tyqVar2.s = uuid;
                                    tyqVar2.t = list2;
                                    tyqVar2.u = e5wVar4;
                                    tyqVar2.v = str3;
                                    tyqVar2.w = yyqVar;
                                    tyqVar2.x = l14;
                                    tyqVar2.j = z4;
                                    tyqVar2.k = z5;
                                    tyqVar2.l = z6;
                                    tyqVar2.m = z6;
                                    z7 = z6;
                                    tyqVar2.A = 6;
                                    i0 = zsd.i0(d, tyqVar2);
                                    nm6Var = nm6Var2;
                                    if (i0 != nm6Var) {
                                        obj5 = i0;
                                        list = list2;
                                        z8 = z5;
                                        e5wVar = e5wVar4;
                                        l3 = l14;
                                        l4 = l3;
                                        str7 = str3;
                                        z9 = z4;
                                        z10 = z7;
                                        zzi zziVar = (zzi) obj5;
                                        String name = zziVar == null ? zziVar.b.name() : null;
                                        vyqVar.getClass();
                                        uuid.getClass();
                                        list.getClass();
                                        str3.getClass();
                                        yyqVar.getClass();
                                        e5w e5wVar5 = (e5w) CollectionsKt.firstOrNull(list);
                                        TimeZone timeZone = e5wVar5 == null ? e5wVar5.e : null;
                                        if (l4 == null) {
                                            workerParameters = workerParameters3;
                                            xqnVar5 = xqnVar4;
                                            long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
                                            msa msaVar = nsa.b;
                                            str8 = " retry=";
                                            l5 = Long.valueOf(nsa.s(yd5.N(currentTimeMillis, ssa.MILLISECONDS), ssa.DAYS));
                                        } else {
                                            str8 = " retry=";
                                            workerParameters = workerParameters3;
                                            xqnVar5 = xqnVar4;
                                            l5 = null;
                                        }
                                        t70 t70Var2 = vyqVar.b;
                                        f9h f9hVar = new f9h();
                                        f9hVar.put("workId", uuid);
                                        f9hVar.put("intervals", rzf.y(list));
                                        f9hVar.put("interval", e5wVar == null ? rzf.z(e5wVar) : "none");
                                        f9hVar.put(PListParser.TAG_DATE, zwf.C(timeZone));
                                        f9hVar.put(obj4, Boolean.valueOf(z7));
                                        f9hVar.put(obj3, str3);
                                        jyr jyrVar8 = dzq.h;
                                        f9hVar.put("idleDeviceRequired", Boolean.valueOf(((czq) jyrVar8.getValue()).a));
                                        f9hVar.put("chargingRequired", Boolean.valueOf(((czq) jyrVar8.getValue()).b));
                                        l6 = ((czq) jyrVar8.getValue()).d;
                                        if (l6 == null) {
                                            msa msaVar2 = nsa.b;
                                            t70Var = t70Var2;
                                            jyrVar2 = jyrVar8;
                                            l7 = Long.valueOf(nsa.s(yd5.N(l6.longValue(), ssa.MILLISECONDS), ssa.MINUTES));
                                        } else {
                                            t70Var = t70Var2;
                                            jyrVar2 = jyrVar8;
                                            l7 = null;
                                        }
                                        f9hVar.put("retryDelayMinutes", l7);
                                        l8 = ((czq) jyrVar2.getValue()).e;
                                        if (l8 == null) {
                                            msa msaVar3 = nsa.b;
                                            l9 = Long.valueOf(nsa.s(yd5.N(l8.longValue(), ssa.MILLISECONDS), ssa.SECONDS));
                                        } else {
                                            l9 = null;
                                        }
                                        f9hVar.put("downloadTimeoutSec", l9);
                                        f9hVar.put("prevLaunchDate", l4 == null ? zwf.b0(l4.longValue(), timeZone) : null);
                                        f9hVar.put("daysWithoutLaunch", l5);
                                        f9hVar.put("networkType", name);
                                        ot0.A(t70Var.e(), "SMART_DOWNLOAD_STARTED", f9hVar.b());
                                        xqnVar6 = new xqn();
                                        xqnVar6.a = new pyq("Work cancelled");
                                        tqn tqnVar4 = new tqn();
                                        tqnVar4.a = true;
                                        if (z8) {
                                            try {
                                                z66 z66Var = (z66) jyrVar3.getValue();
                                                tyqVar2.n = l3;
                                                tyqVar2.o = str7;
                                                tyqVar2.p = xqnVar3;
                                                xqnVar7 = xqnVar5;
                                                try {
                                                    tyqVar2.q = xqnVar7;
                                                    tyqVar2.r = xqnVar6;
                                                    tyqVar2.s = tqnVar4;
                                                    tyqVar2.t = null;
                                                    tyqVar2.u = null;
                                                    tyqVar2.v = null;
                                                    tyqVar2.w = null;
                                                    tyqVar2.x = null;
                                                    tyqVar2.j = z9;
                                                    tyqVar2.k = z8;
                                                    tyqVar2.l = z10;
                                                    tyqVar2.A = 7;
                                                    Object H = fxf.H(z66Var, tyqVar2);
                                                    if (H != nm6Var) {
                                                        z11 = z8;
                                                        obj6 = H;
                                                        l11 = l3;
                                                        xqnVar9 = xqnVar7;
                                                        tqnVar2 = tqnVar4;
                                                        try {
                                                            if (((Boolean) obj6).booleanValue()) {
                                                                xqnVar6.a = new pyq("No WiFi");
                                                                function02 = null;
                                                                smartDownloadWorker = this;
                                                                l12 = l11;
                                                                xqnVar8 = xqnVar9;
                                                                tqnVar3 = tqnVar2;
                                                                str15 = str7;
                                                                xqnVar11 = xqnVar3;
                                                                z13 = false;
                                                                try {
                                                                    tqnVar3.a = z13;
                                                                    syqVar2 = function02 == null ? (syq) function02.invoke() : null;
                                                                    if (syqVar2 != null && (num2 = syqVar2.h) != null) {
                                                                        if (num2.intValue() > 0) {
                                                                            ryqVar2 = null;
                                                                            break;
                                                                        } else {
                                                                            ryqVar2 = ryqVar;
                                                                            break;
                                                                        }
                                                                    }
                                                                    ryqVar2 = (ryq) xqnVar6.a;
                                                                    xqnVar6.a = ryqVar2;
                                                                    Boolean valueOf = syqVar2 == null ? Boolean.valueOf(syqVar2.d) : null;
                                                                    boolean z15 = tqnVar3.a;
                                                                    WorkerParameters workerParameters4 = workerParameters;
                                                                    UUID uuid3 = workerParameters4.a;
                                                                    StringBuilder sb = new StringBuilder(str4);
                                                                    sb.append(ryqVar2);
                                                                    sb.append(str2);
                                                                    sb.append(valueOf);
                                                                    sb.append(str8);
                                                                    dfi.t(sb, z10, str, z15, str6);
                                                                    sb.append(uuid3);
                                                                    ssg.a(3, str5, sb.toString(), null);
                                                                    if (syqVar2 != null || (r2 = syqVar2.a) == null) {
                                                                        List list3 = (List) xqnVar11.a;
                                                                    }
                                                                    xqnVar11.a = list3;
                                                                    xqnVar8.a = rzf.N(list3);
                                                                    vyq vyqVar2 = (vyq) jyrVar5.getValue();
                                                                    ryq ryqVar3 = (ryq) xqnVar6.a;
                                                                    String uuid4 = workerParameters4.a.toString();
                                                                    uuid4.getClass();
                                                                    List list4 = (List) xqnVar11.a;
                                                                    e5w e5wVar6 = (e5w) xqnVar8.a;
                                                                    Long O = rzf.O(list4);
                                                                    vyqVar2.c(ryqVar3, uuid4, list4, e5wVar6, O == null ? O.longValue() : -1L, z10, tqnVar3.a, str15, l12, syqVar2);
                                                                    smartDownloadWorker.f((List) xqnVar11.a, (e5w) xqnVar8.a, tqnVar3.a, false);
                                                                    return tcg.a();
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    str14 = str5;
                                                                    str11 = str4;
                                                                    str16 = str2;
                                                                    str12 = str6;
                                                                    workerParameters2 = workerParameters;
                                                                    String str17 = str8;
                                                                    tqnVar = tqnVar3;
                                                                    str9 = str15;
                                                                    l10 = l12;
                                                                    str13 = str17;
                                                                    function0 = function02;
                                                                    str10 = str;
                                                                    xqnVar3 = xqnVar11;
                                                                    z12 = z10;
                                                                    if (function0 != null) {
                                                                    }
                                                                    if (syqVar != null) {
                                                                    }
                                                                    ryqVar = (ryq) xqnVar6.a;
                                                                    ryq ryqVar4 = ryqVar;
                                                                    xqnVar6.a = ryqVar4;
                                                                    Throwable th2 = th;
                                                                    if (syqVar != null) {
                                                                    }
                                                                    boolean z16 = tqnVar.a;
                                                                    tqn tqnVar5 = tqnVar;
                                                                    UUID uuid5 = workerParameters2.a;
                                                                    WorkerParameters workerParameters5 = workerParameters2;
                                                                    StringBuilder sb2 = new StringBuilder(str11);
                                                                    sb2.append(ryqVar4);
                                                                    sb2.append(str16);
                                                                    sb2.append(r0);
                                                                    sb2.append(str13);
                                                                    dfi.t(sb2, z12, str10, z16, str12);
                                                                    sb2.append(uuid5);
                                                                    ssg.a(3, str14, sb2.toString(), null);
                                                                    if (syqVar != null) {
                                                                    }
                                                                    List list5 = (List) xqnVar3.a;
                                                                    xqnVar3.a = list5;
                                                                    xqnVar8.a = rzf.N(list5);
                                                                    vyq vyqVar3 = (vyq) jyrVar5.getValue();
                                                                    ryq ryqVar5 = (ryq) xqnVar6.a;
                                                                    String uuid6 = workerParameters5.a.toString();
                                                                    uuid6.getClass();
                                                                    List list6 = (List) xqnVar3.a;
                                                                    e5w e5wVar7 = (e5w) xqnVar8.a;
                                                                    Long O2 = rzf.O(list6);
                                                                    vyqVar3.c(ryqVar5, uuid6, list6, e5wVar7, O2 != null ? O2.longValue() : -1L, z12, tqnVar5.a, str9, l10, syqVar);
                                                                    f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar5.a, false);
                                                                    throw th2;
                                                                }
                                                            }
                                                            z8 = z11;
                                                            tqnVar4 = tqnVar2;
                                                            try {
                                                                obj7 = xqnVar9.a;
                                                                if (obj7 != null) {
                                                                    smartDownloadWorker = this;
                                                                    try {
                                                                        xqnVar6.a = new pyq("Not in intervals");
                                                                        tqnVar3 = tqnVar4;
                                                                        l12 = l11;
                                                                        xqnVar8 = xqnVar9;
                                                                        str15 = str7;
                                                                        xqnVar11 = xqnVar3;
                                                                        z13 = false;
                                                                        function02 = null;
                                                                        tqnVar3.a = z13;
                                                                        if (function02 == null) {
                                                                        }
                                                                        if (syqVar2 != null) {
                                                                        }
                                                                        ryqVar2 = (ryq) xqnVar6.a;
                                                                        xqnVar6.a = ryqVar2;
                                                                        if (syqVar2 == null) {
                                                                        }
                                                                        boolean z152 = tqnVar3.a;
                                                                        WorkerParameters workerParameters42 = workerParameters;
                                                                        UUID uuid32 = workerParameters42.a;
                                                                        StringBuilder sb3 = new StringBuilder(str4);
                                                                        sb3.append(ryqVar2);
                                                                        sb3.append(str2);
                                                                        sb3.append(valueOf);
                                                                        sb3.append(str8);
                                                                        dfi.t(sb3, z10, str, z152, str6);
                                                                        sb3.append(uuid32);
                                                                        ssg.a(3, str5, sb3.toString(), null);
                                                                        if (syqVar2 != null) {
                                                                        }
                                                                        List list32 = (List) xqnVar11.a;
                                                                        xqnVar11.a = list32;
                                                                        xqnVar8.a = rzf.N(list32);
                                                                        vyq vyqVar22 = (vyq) jyrVar5.getValue();
                                                                        ryq ryqVar32 = (ryq) xqnVar6.a;
                                                                        String uuid42 = workerParameters42.a.toString();
                                                                        uuid42.getClass();
                                                                        List list42 = (List) xqnVar11.a;
                                                                        e5w e5wVar62 = (e5w) xqnVar8.a;
                                                                        Long O3 = rzf.O(list42);
                                                                        vyqVar22.c(ryqVar32, uuid42, list42, e5wVar62, O3 == null ? O3.longValue() : -1L, z10, tqnVar3.a, str15, l12, syqVar2);
                                                                        smartDownloadWorker.f((List) xqnVar11.a, (e5w) xqnVar8.a, tqnVar3.a, false);
                                                                        return tcg.a();
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        str14 = str5;
                                                                        str10 = str;
                                                                        str11 = str4;
                                                                        str16 = str2;
                                                                        str12 = str6;
                                                                        workerParameters2 = workerParameters;
                                                                        str13 = str8;
                                                                        l10 = l11;
                                                                        str9 = str7;
                                                                        function0 = null;
                                                                        tqnVar = tqnVar4;
                                                                        xqnVar8 = xqnVar9;
                                                                        z12 = z10;
                                                                        if (function0 != null) {
                                                                        }
                                                                        if (syqVar != null) {
                                                                        }
                                                                        ryqVar = (ryq) xqnVar6.a;
                                                                        ryq ryqVar42 = ryqVar;
                                                                        xqnVar6.a = ryqVar42;
                                                                        Throwable th22 = th;
                                                                        if (syqVar != null) {
                                                                        }
                                                                        boolean z162 = tqnVar.a;
                                                                        tqn tqnVar52 = tqnVar;
                                                                        UUID uuid52 = workerParameters2.a;
                                                                        WorkerParameters workerParameters52 = workerParameters2;
                                                                        StringBuilder sb22 = new StringBuilder(str11);
                                                                        sb22.append(ryqVar42);
                                                                        sb22.append(str16);
                                                                        sb22.append(r0);
                                                                        sb22.append(str13);
                                                                        dfi.t(sb22, z12, str10, z162, str12);
                                                                        sb22.append(uuid52);
                                                                        ssg.a(3, str14, sb22.toString(), null);
                                                                        if (syqVar != null) {
                                                                        }
                                                                        List list52 = (List) xqnVar3.a;
                                                                        xqnVar3.a = list52;
                                                                        xqnVar8.a = rzf.N(list52);
                                                                        vyq vyqVar32 = (vyq) jyrVar5.getValue();
                                                                        ryq ryqVar52 = (ryq) xqnVar6.a;
                                                                        String uuid62 = workerParameters52.a.toString();
                                                                        uuid62.getClass();
                                                                        List list62 = (List) xqnVar3.a;
                                                                        e5w e5wVar72 = (e5w) xqnVar8.a;
                                                                        Long O22 = rzf.O(list62);
                                                                        vyqVar32.c(ryqVar52, uuid62, list62, e5wVar72, O22 != null ? O22.longValue() : -1L, z12, tqnVar52.a, str9, l10, syqVar);
                                                                        f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar52.a, false);
                                                                        throw th22;
                                                                    }
                                                                }
                                                                try {
                                                                    smartDownloadWorker = this;
                                                                    try {
                                                                        smartDownloadWorker.f((List) xqnVar3.a, (e5w) obj7, true, true);
                                                                        eyqVar = new eyq(3, smartDownloadWorker);
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        str9 = str7;
                                                                        str14 = str5;
                                                                        str10 = str;
                                                                        str11 = str4;
                                                                        str16 = str2;
                                                                        str12 = str6;
                                                                        workerParameters2 = workerParameters;
                                                                        str13 = str8;
                                                                        tqnVar = tqnVar4;
                                                                        l10 = l11;
                                                                        xqnVar8 = xqnVar9;
                                                                        z12 = z10;
                                                                        function0 = null;
                                                                        if (function0 != null) {
                                                                        }
                                                                        if (syqVar != null) {
                                                                        }
                                                                        ryqVar = (ryq) xqnVar6.a;
                                                                        ryq ryqVar422 = ryqVar;
                                                                        xqnVar6.a = ryqVar422;
                                                                        Throwable th222 = th;
                                                                        if (syqVar != null) {
                                                                        }
                                                                        boolean z1622 = tqnVar.a;
                                                                        tqn tqnVar522 = tqnVar;
                                                                        UUID uuid522 = workerParameters2.a;
                                                                        WorkerParameters workerParameters522 = workerParameters2;
                                                                        StringBuilder sb222 = new StringBuilder(str11);
                                                                        sb222.append(ryqVar422);
                                                                        sb222.append(str16);
                                                                        sb222.append(r0);
                                                                        sb222.append(str13);
                                                                        dfi.t(sb222, z12, str10, z1622, str12);
                                                                        sb222.append(uuid522);
                                                                        ssg.a(3, str14, sb222.toString(), null);
                                                                        if (syqVar != null) {
                                                                        }
                                                                        List list522 = (List) xqnVar3.a;
                                                                        xqnVar3.a = list522;
                                                                        xqnVar8.a = rzf.N(list522);
                                                                        vyq vyqVar322 = (vyq) jyrVar5.getValue();
                                                                        ryq ryqVar522 = (ryq) xqnVar6.a;
                                                                        String uuid622 = workerParameters522.a.toString();
                                                                        uuid622.getClass();
                                                                        List list622 = (List) xqnVar3.a;
                                                                        e5w e5wVar722 = (e5w) xqnVar8.a;
                                                                        Long O222 = rzf.O(list622);
                                                                        vyqVar322.c(ryqVar522, uuid622, list622, e5wVar722, O222 != null ? O222.longValue() : -1L, z12, tqnVar522.a, str9, l10, syqVar);
                                                                        f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar522.a, false);
                                                                        throw th222;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                                try {
                                                                    cmj cmjVar = (cmj) smartDownloadWorker.h.getValue();
                                                                    tyqVar2.n = l11;
                                                                    tyqVar2.o = str7;
                                                                    tyqVar2.p = xqnVar3;
                                                                    tyqVar2.q = xqnVar9;
                                                                    tyqVar2.r = xqnVar6;
                                                                    tyqVar2.s = tqnVar4;
                                                                    tyqVar2.t = eyqVar;
                                                                    tyqVar2.u = xqnVar6;
                                                                    tyqVar2.v = null;
                                                                    tyqVar2.w = null;
                                                                    tyqVar2.x = null;
                                                                    tyqVar2.j = z9;
                                                                    tyqVar2.k = z8;
                                                                    tyqVar2.l = z10;
                                                                    tyqVar2.A = 8;
                                                                    obj8 = cmjVar.b(z9, tyqVar2);
                                                                    if (obj8 == nm6Var) {
                                                                        return nm6Var;
                                                                    }
                                                                    tqnVar3 = tqnVar4;
                                                                    xqnVar8 = xqnVar9;
                                                                    function02 = eyqVar;
                                                                    xqnVar10 = xqnVar6;
                                                                    z12 = z10;
                                                                    try {
                                                                        xqnVar10.a = obj8;
                                                                        l12 = l11;
                                                                        z10 = z12;
                                                                        str15 = str7;
                                                                        xqnVar11 = xqnVar3;
                                                                        z13 = false;
                                                                        tqnVar3.a = z13;
                                                                        if (function02 == null) {
                                                                        }
                                                                        if (syqVar2 != null) {
                                                                            if (num2.intValue() > 0) {
                                                                            }
                                                                        }
                                                                        ryqVar2 = (ryq) xqnVar6.a;
                                                                        xqnVar6.a = ryqVar2;
                                                                        if (syqVar2 == null) {
                                                                        }
                                                                        boolean z1522 = tqnVar3.a;
                                                                        WorkerParameters workerParameters422 = workerParameters;
                                                                        UUID uuid322 = workerParameters422.a;
                                                                        StringBuilder sb32 = new StringBuilder(str4);
                                                                        sb32.append(ryqVar2);
                                                                        sb32.append(str2);
                                                                        sb32.append(valueOf);
                                                                        sb32.append(str8);
                                                                        dfi.t(sb32, z10, str, z1522, str6);
                                                                        sb32.append(uuid322);
                                                                        ssg.a(3, str5, sb32.toString(), null);
                                                                        if (syqVar2 != null) {
                                                                        }
                                                                        List list322 = (List) xqnVar11.a;
                                                                        xqnVar11.a = list322;
                                                                        xqnVar8.a = rzf.N(list322);
                                                                        vyq vyqVar222 = (vyq) jyrVar5.getValue();
                                                                        ryq ryqVar322 = (ryq) xqnVar6.a;
                                                                        String uuid422 = workerParameters422.a.toString();
                                                                        uuid422.getClass();
                                                                        List list422 = (List) xqnVar11.a;
                                                                        e5w e5wVar622 = (e5w) xqnVar8.a;
                                                                        Long O32 = rzf.O(list422);
                                                                        vyqVar222.c(ryqVar322, uuid422, list422, e5wVar622, O32 == null ? O32.longValue() : -1L, z10, tqnVar3.a, str15, l12, syqVar2);
                                                                        smartDownloadWorker.f((List) xqnVar11.a, (e5w) xqnVar8.a, tqnVar3.a, false);
                                                                        return tcg.a();
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        str9 = str7;
                                                                        tqnVar = tqnVar3;
                                                                        str14 = str5;
                                                                        str11 = str4;
                                                                        str16 = str2;
                                                                        str12 = str6;
                                                                        workerParameters2 = workerParameters;
                                                                        str13 = str8;
                                                                        l10 = l11;
                                                                        function0 = function02;
                                                                        str10 = str;
                                                                        if (function0 != null) {
                                                                        }
                                                                        if (syqVar != null) {
                                                                        }
                                                                        ryqVar = (ryq) xqnVar6.a;
                                                                        ryq ryqVar4222 = ryqVar;
                                                                        xqnVar6.a = ryqVar4222;
                                                                        Throwable th2222 = th;
                                                                        if (syqVar != null) {
                                                                        }
                                                                        boolean z16222 = tqnVar.a;
                                                                        tqn tqnVar5222 = tqnVar;
                                                                        UUID uuid5222 = workerParameters2.a;
                                                                        WorkerParameters workerParameters5222 = workerParameters2;
                                                                        StringBuilder sb2222 = new StringBuilder(str11);
                                                                        sb2222.append(ryqVar4222);
                                                                        sb2222.append(str16);
                                                                        sb2222.append(r0);
                                                                        sb2222.append(str13);
                                                                        dfi.t(sb2222, z12, str10, z16222, str12);
                                                                        sb2222.append(uuid5222);
                                                                        ssg.a(3, str14, sb2222.toString(), null);
                                                                        if (syqVar != null) {
                                                                        }
                                                                        List list5222 = (List) xqnVar3.a;
                                                                        xqnVar3.a = list5222;
                                                                        xqnVar8.a = rzf.N(list5222);
                                                                        vyq vyqVar3222 = (vyq) jyrVar5.getValue();
                                                                        ryq ryqVar5222 = (ryq) xqnVar6.a;
                                                                        String uuid6222 = workerParameters5222.a.toString();
                                                                        uuid6222.getClass();
                                                                        List list6222 = (List) xqnVar3.a;
                                                                        e5w e5wVar7222 = (e5w) xqnVar8.a;
                                                                        Long O2222 = rzf.O(list6222);
                                                                        vyqVar3222.c(ryqVar5222, uuid6222, list6222, e5wVar7222, O2222 != null ? O2222.longValue() : -1L, z12, tqnVar5222.a, str9, l10, syqVar);
                                                                        f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar5222.a, false);
                                                                        throw th2222;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    str9 = str7;
                                                                    str10 = str;
                                                                    str11 = str4;
                                                                    str16 = str2;
                                                                    str12 = str6;
                                                                    workerParameters2 = workerParameters;
                                                                    str13 = str8;
                                                                    tqnVar = tqnVar4;
                                                                    l10 = l11;
                                                                    xqnVar8 = xqnVar9;
                                                                    function0 = eyqVar;
                                                                    z12 = z10;
                                                                    str14 = str5;
                                                                    if (function0 != null) {
                                                                    }
                                                                    if (syqVar != null) {
                                                                    }
                                                                    ryqVar = (ryq) xqnVar6.a;
                                                                    ryq ryqVar42222 = ryqVar;
                                                                    xqnVar6.a = ryqVar42222;
                                                                    Throwable th22222 = th;
                                                                    if (syqVar != null) {
                                                                    }
                                                                    boolean z162222 = tqnVar.a;
                                                                    tqn tqnVar52222 = tqnVar;
                                                                    UUID uuid52222 = workerParameters2.a;
                                                                    WorkerParameters workerParameters52222 = workerParameters2;
                                                                    StringBuilder sb22222 = new StringBuilder(str11);
                                                                    sb22222.append(ryqVar42222);
                                                                    sb22222.append(str16);
                                                                    sb22222.append(r0);
                                                                    sb22222.append(str13);
                                                                    dfi.t(sb22222, z12, str10, z162222, str12);
                                                                    sb22222.append(uuid52222);
                                                                    ssg.a(3, str14, sb22222.toString(), null);
                                                                    if (syqVar != null) {
                                                                    }
                                                                    List list52222 = (List) xqnVar3.a;
                                                                    xqnVar3.a = list52222;
                                                                    xqnVar8.a = rzf.N(list52222);
                                                                    vyq vyqVar32222 = (vyq) jyrVar5.getValue();
                                                                    ryq ryqVar52222 = (ryq) xqnVar6.a;
                                                                    String uuid62222 = workerParameters52222.a.toString();
                                                                    uuid62222.getClass();
                                                                    List list62222 = (List) xqnVar3.a;
                                                                    e5w e5wVar72222 = (e5w) xqnVar8.a;
                                                                    Long O22222 = rzf.O(list62222);
                                                                    vyqVar32222.c(ryqVar52222, uuid62222, list62222, e5wVar72222, O22222 != null ? O22222.longValue() : -1L, z12, tqnVar52222.a, str9, l10, syqVar);
                                                                    f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar52222.a, false);
                                                                    throw th22222;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            xqnVar8 = xqnVar9;
                                                            str9 = str7;
                                                            z12 = z10;
                                                            str10 = str;
                                                            str11 = str4;
                                                            str16 = str2;
                                                            str12 = str6;
                                                            workerParameters2 = workerParameters;
                                                            str13 = str8;
                                                            l10 = l11;
                                                            tqnVar = tqnVar2;
                                                            str14 = str5;
                                                            function0 = null;
                                                            if (function0 != null) {
                                                            }
                                                            if (syqVar != null) {
                                                            }
                                                            ryqVar = (ryq) xqnVar6.a;
                                                            ryq ryqVar422222 = ryqVar;
                                                            xqnVar6.a = ryqVar422222;
                                                            Throwable th222222 = th;
                                                            if (syqVar != null) {
                                                            }
                                                            boolean z1622222 = tqnVar.a;
                                                            tqn tqnVar522222 = tqnVar;
                                                            UUID uuid522222 = workerParameters2.a;
                                                            WorkerParameters workerParameters522222 = workerParameters2;
                                                            StringBuilder sb222222 = new StringBuilder(str11);
                                                            sb222222.append(ryqVar422222);
                                                            sb222222.append(str16);
                                                            sb222222.append(r0);
                                                            sb222222.append(str13);
                                                            dfi.t(sb222222, z12, str10, z1622222, str12);
                                                            sb222222.append(uuid522222);
                                                            ssg.a(3, str14, sb222222.toString(), null);
                                                            if (syqVar != null) {
                                                            }
                                                            List list522222 = (List) xqnVar3.a;
                                                            xqnVar3.a = list522222;
                                                            xqnVar8.a = rzf.N(list522222);
                                                            vyq vyqVar322222 = (vyq) jyrVar5.getValue();
                                                            ryq ryqVar522222 = (ryq) xqnVar6.a;
                                                            String uuid622222 = workerParameters522222.a.toString();
                                                            uuid622222.getClass();
                                                            List list622222 = (List) xqnVar3.a;
                                                            e5w e5wVar722222 = (e5w) xqnVar8.a;
                                                            Long O222222 = rzf.O(list622222);
                                                            vyqVar322222.c(ryqVar522222, uuid622222, list622222, e5wVar722222, O222222 != null ? O222222.longValue() : -1L, z12, tqnVar522222.a, str9, l10, syqVar);
                                                            f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar522222.a, false);
                                                            throw th222222;
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str9 = str7;
                                                    str10 = str;
                                                    str11 = str4;
                                                    str16 = str2;
                                                    str12 = str6;
                                                    workerParameters2 = workerParameters;
                                                    str13 = str8;
                                                    function0 = null;
                                                    tqnVar = tqnVar4;
                                                    l10 = l3;
                                                    xqnVar8 = xqnVar7;
                                                    z12 = z10;
                                                    str14 = str5;
                                                    if (function0 != null) {
                                                    }
                                                    if (syqVar != null) {
                                                    }
                                                    ryqVar = (ryq) xqnVar6.a;
                                                    ryq ryqVar4222222 = ryqVar;
                                                    xqnVar6.a = ryqVar4222222;
                                                    Throwable th2222222 = th;
                                                    if (syqVar != null) {
                                                    }
                                                    boolean z16222222 = tqnVar.a;
                                                    tqn tqnVar5222222 = tqnVar;
                                                    UUID uuid5222222 = workerParameters2.a;
                                                    WorkerParameters workerParameters5222222 = workerParameters2;
                                                    StringBuilder sb2222222 = new StringBuilder(str11);
                                                    sb2222222.append(ryqVar4222222);
                                                    sb2222222.append(str16);
                                                    sb2222222.append(r0);
                                                    sb2222222.append(str13);
                                                    dfi.t(sb2222222, z12, str10, z16222222, str12);
                                                    sb2222222.append(uuid5222222);
                                                    ssg.a(3, str14, sb2222222.toString(), null);
                                                    if (syqVar != null) {
                                                    }
                                                    List list5222222 = (List) xqnVar3.a;
                                                    xqnVar3.a = list5222222;
                                                    xqnVar8.a = rzf.N(list5222222);
                                                    vyq vyqVar3222222 = (vyq) jyrVar5.getValue();
                                                    ryq ryqVar5222222 = (ryq) xqnVar6.a;
                                                    String uuid6222222 = workerParameters5222222.a.toString();
                                                    uuid6222222.getClass();
                                                    List list6222222 = (List) xqnVar3.a;
                                                    e5w e5wVar7222222 = (e5w) xqnVar8.a;
                                                    Long O2222222 = rzf.O(list6222222);
                                                    vyqVar3222222.c(ryqVar5222222, uuid6222222, list6222222, e5wVar7222222, O2222222 != null ? O2222222.longValue() : -1L, z12, tqnVar5222222.a, str9, l10, syqVar);
                                                    f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar5222222.a, false);
                                                    throw th2222222;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                xqnVar7 = xqnVar5;
                                            }
                                        } else {
                                            l11 = l3;
                                            xqnVar9 = xqnVar5;
                                            obj7 = xqnVar9.a;
                                            if (obj7 != null) {
                                            }
                                        }
                                    }
                                    return nm6Var;
                                }
                                if (z2) {
                                    b6e.s();
                                    return null;
                                }
                                hzq hzqVar3 = (hzq) jyrVar.getValue();
                                tyqVar.n = l;
                                tyqVar.o = str3;
                                tyqVar.p = xqnVar;
                                tyqVar.q = xqnVar;
                                tyqVar.j = z2;
                                tyqVar.k = z;
                                tyqVar.l = a;
                                Long l15 = l;
                                tyqVar.A = 5;
                                Object b2 = ((nzq) hzqVar3).b(tyqVar);
                                if (b2 != nm6Var2) {
                                    z4 = z2;
                                    xqnVar2 = xqnVar;
                                    z5 = z;
                                    l2 = l15;
                                    obj2 = b2;
                                    gzq gzqVar = (gzq) obj2;
                                    c = gzqVar == null ? wxf.P(gzqVar.b) : t75.c(e5w.f);
                                    z6 = a;
                                    xqnVar3 = xqnVar;
                                    xqnVar = xqnVar2;
                                    xqnVar.a = c;
                                    xqn xqnVar122 = new xqn();
                                    xqnVar122.a = rzf.N((List) xqnVar3.a);
                                    e5w e5wVar22 = (e5w) CollectionsKt.firstOrNull((List) xqnVar3.a);
                                    String C2 = zwf.C(e5wVar22 != null ? e5wVar22.e : null);
                                    obj3 = "workPolicy";
                                    String y2 = rzf.y((List) xqnVar3.a);
                                    obj4 = "retryFlag";
                                    e5w e5wVar32 = (e5w) xqnVar122.a;
                                    if (e5wVar32 != null) {
                                    }
                                    UUID uuid22 = workerParameters3.a;
                                    tyq tyqVar32 = tyqVar;
                                    Long l142 = l2;
                                    StringBuilder j2 = eta.j("started[force=", z4, " ignoreRuntimeConstraints=", z5, "]: intervals=");
                                    su4.v(j2, y2, " selected=", z14, " date=");
                                    j2.append(C2);
                                    j2.append(" retry=");
                                    j2.append(z6);
                                    j2.append(" policy=");
                                    j2.append(str3);
                                    j2.append(" id=");
                                    j2.append(uuid22);
                                    ssg.a(3, "SmartDownloadWorker", j2.toString(), null);
                                    vyqVar = (vyq) jyrVar5.getValue();
                                    uuid = workerParameters3.a.toString();
                                    uuid.getClass();
                                    List list22 = (List) xqnVar3.a;
                                    xqnVar4 = xqnVar122;
                                    e5w e5wVar42 = (e5w) xqnVar4.a;
                                    yyqVar = (yyq) jyrVar4.getValue();
                                    vdr d2 = ((z66) jyrVar3.getValue()).d();
                                    str5 = "SmartDownloadWorker";
                                    tyqVar2 = tyqVar32;
                                    str6 = " id=";
                                    tyqVar2.n = l142;
                                    tyqVar2.o = str3;
                                    tyqVar2.p = xqnVar3;
                                    tyqVar2.q = xqnVar4;
                                    tyqVar2.r = vyqVar;
                                    tyqVar2.s = uuid;
                                    tyqVar2.t = list22;
                                    tyqVar2.u = e5wVar42;
                                    tyqVar2.v = str3;
                                    tyqVar2.w = yyqVar;
                                    tyqVar2.x = l142;
                                    tyqVar2.j = z4;
                                    tyqVar2.k = z5;
                                    tyqVar2.l = z6;
                                    tyqVar2.m = z6;
                                    z7 = z6;
                                    tyqVar2.A = 6;
                                    i0 = zsd.i0(d2, tyqVar2);
                                    nm6Var = nm6Var2;
                                    if (i0 != nm6Var) {
                                    }
                                    return nm6Var;
                                }
                            }
                        }
                        return nm6Var2;
                    case 3:
                        boolean z17 = tyqVar.k;
                        boolean z18 = tyqVar.j;
                        qgg.h0(obj8);
                        z = z17;
                        obj = obj8;
                        jyrVar = jyrVar6;
                        z2 = z18;
                        Long l132 = (Long) obj;
                        ryqVar = qyqVar;
                        a = workerParameters3.b.a("retryFlag");
                        str = " needToRetry=";
                        String b3 = workerParameters3.b.b("workPolicy");
                        str2 = " requestUpdate=";
                        if (b3 != null) {
                        }
                        hzqVar = (hzq) jyrVar.getValue();
                        if (z2) {
                            break;
                        }
                        tyqVar.n = l132;
                        tyqVar.o = str3;
                        tyqVar.j = z2;
                        tyqVar.k = z;
                        tyqVar.l = a;
                        tyqVar.A = 4;
                        if (((nzq) hzqVar).c(z3, tyqVar) != nm6Var2) {
                        }
                        return nm6Var2;
                    case 4:
                        boolean z19 = tyqVar.l;
                        z = tyqVar.k;
                        boolean z20 = tyqVar.j;
                        String str18 = tyqVar.o;
                        l = tyqVar.n;
                        qgg.h0(obj8);
                        ryqVar = qyqVar;
                        a = z19;
                        jyrVar = jyrVar6;
                        str2 = " requestUpdate=";
                        z2 = z20;
                        str3 = str18;
                        str = " needToRetry=";
                        xqnVar = new xqn();
                        str4 = "finished: result=";
                        if (!z2) {
                        }
                        break;
                    case 5:
                        obj2 = obj8;
                        boolean z21 = tyqVar.l;
                        boolean z22 = tyqVar.k;
                        boolean z23 = tyqVar.j;
                        xqn xqnVar13 = tyqVar.q;
                        xqn xqnVar14 = tyqVar.p;
                        String str19 = tyqVar.o;
                        Long l16 = tyqVar.n;
                        qgg.h0(obj2);
                        str2 = " requestUpdate=";
                        str3 = str19;
                        ryqVar = qyqVar;
                        a = z21;
                        xqnVar2 = xqnVar13;
                        str = " needToRetry=";
                        xqnVar = xqnVar14;
                        str4 = "finished: result=";
                        z4 = z23;
                        z5 = z22;
                        l2 = l16;
                        gzq gzqVar2 = (gzq) obj2;
                        c = gzqVar2 == null ? wxf.P(gzqVar2.b) : t75.c(e5w.f);
                        z6 = a;
                        xqnVar3 = xqnVar;
                        xqnVar = xqnVar2;
                        xqnVar.a = c;
                        xqn xqnVar1222 = new xqn();
                        xqnVar1222.a = rzf.N((List) xqnVar3.a);
                        e5w e5wVar222 = (e5w) CollectionsKt.firstOrNull((List) xqnVar3.a);
                        String C22 = zwf.C(e5wVar222 != null ? e5wVar222.e : null);
                        obj3 = "workPolicy";
                        String y22 = rzf.y((List) xqnVar3.a);
                        obj4 = "retryFlag";
                        e5w e5wVar322 = (e5w) xqnVar1222.a;
                        if (e5wVar322 != null) {
                        }
                        UUID uuid222 = workerParameters3.a;
                        tyq tyqVar322 = tyqVar;
                        Long l1422 = l2;
                        StringBuilder j22 = eta.j("started[force=", z4, " ignoreRuntimeConstraints=", z5, "]: intervals=");
                        su4.v(j22, y22, " selected=", z14, " date=");
                        j22.append(C22);
                        j22.append(" retry=");
                        j22.append(z6);
                        j22.append(" policy=");
                        j22.append(str3);
                        j22.append(" id=");
                        j22.append(uuid222);
                        ssg.a(3, "SmartDownloadWorker", j22.toString(), null);
                        vyqVar = (vyq) jyrVar5.getValue();
                        uuid = workerParameters3.a.toString();
                        uuid.getClass();
                        List list222 = (List) xqnVar3.a;
                        xqnVar4 = xqnVar1222;
                        e5w e5wVar422 = (e5w) xqnVar4.a;
                        yyqVar = (yyq) jyrVar4.getValue();
                        vdr d22 = ((z66) jyrVar3.getValue()).d();
                        str5 = "SmartDownloadWorker";
                        tyqVar2 = tyqVar322;
                        str6 = " id=";
                        tyqVar2.n = l1422;
                        tyqVar2.o = str3;
                        tyqVar2.p = xqnVar3;
                        tyqVar2.q = xqnVar4;
                        tyqVar2.r = vyqVar;
                        tyqVar2.s = uuid;
                        tyqVar2.t = list222;
                        tyqVar2.u = e5wVar422;
                        tyqVar2.v = str3;
                        tyqVar2.w = yyqVar;
                        tyqVar2.x = l1422;
                        tyqVar2.j = z4;
                        tyqVar2.k = z5;
                        tyqVar2.l = z6;
                        tyqVar2.m = z6;
                        z7 = z6;
                        tyqVar2.A = 6;
                        i0 = zsd.i0(d22, tyqVar2);
                        nm6Var = nm6Var2;
                        if (i0 != nm6Var) {
                        }
                        return nm6Var;
                    case 6:
                        boolean z24 = tyqVar.m;
                        boolean z25 = tyqVar.l;
                        boolean z26 = tyqVar.k;
                        boolean z27 = tyqVar.j;
                        Long l17 = tyqVar.x;
                        yyq yyqVar3 = tyqVar.w;
                        String str20 = tyqVar.v;
                        e5w e5wVar8 = (e5w) tyqVar.u;
                        list = (List) tyqVar.t;
                        String str21 = (String) tyqVar.s;
                        vyq vyqVar4 = (vyq) tyqVar.r;
                        xqn xqnVar15 = tyqVar.q;
                        xqn xqnVar16 = tyqVar.p;
                        String str22 = tyqVar.o;
                        Long l18 = tyqVar.n;
                        qgg.h0(obj8);
                        l3 = l18;
                        z8 = z26;
                        str7 = str22;
                        l4 = l17;
                        str = " needToRetry=";
                        yyqVar = yyqVar3;
                        str4 = "finished: result=";
                        z10 = z25;
                        xqnVar4 = xqnVar15;
                        obj5 = obj8;
                        obj3 = "workPolicy";
                        nm6Var = nm6Var2;
                        obj4 = "retryFlag";
                        z9 = z27;
                        ryqVar = qyqVar;
                        xqnVar3 = xqnVar16;
                        e5wVar = e5wVar8;
                        str2 = " requestUpdate=";
                        str3 = str20;
                        vyqVar = vyqVar4;
                        z7 = z24;
                        str5 = "SmartDownloadWorker";
                        tyqVar2 = tyqVar;
                        uuid = str21;
                        str6 = " id=";
                        zzi zziVar2 = (zzi) obj5;
                        if (zziVar2 == null) {
                        }
                        vyqVar.getClass();
                        uuid.getClass();
                        list.getClass();
                        str3.getClass();
                        yyqVar.getClass();
                        e5w e5wVar52 = (e5w) CollectionsKt.firstOrNull(list);
                        if (e5wVar52 == null) {
                        }
                        if (l4 == null) {
                        }
                        t70 t70Var22 = vyqVar.b;
                        f9h f9hVar2 = new f9h();
                        f9hVar2.put("workId", uuid);
                        f9hVar2.put("intervals", rzf.y(list));
                        f9hVar2.put("interval", e5wVar == null ? rzf.z(e5wVar) : "none");
                        f9hVar2.put(PListParser.TAG_DATE, zwf.C(timeZone));
                        f9hVar2.put(obj4, Boolean.valueOf(z7));
                        f9hVar2.put(obj3, str3);
                        jyr jyrVar82 = dzq.h;
                        f9hVar2.put("idleDeviceRequired", Boolean.valueOf(((czq) jyrVar82.getValue()).a));
                        f9hVar2.put("chargingRequired", Boolean.valueOf(((czq) jyrVar82.getValue()).b));
                        l6 = ((czq) jyrVar82.getValue()).d;
                        if (l6 == null) {
                        }
                        f9hVar2.put("retryDelayMinutes", l7);
                        l8 = ((czq) jyrVar2.getValue()).e;
                        if (l8 == null) {
                        }
                        f9hVar2.put("downloadTimeoutSec", l9);
                        f9hVar2.put("prevLaunchDate", l4 == null ? zwf.b0(l4.longValue(), timeZone) : null);
                        f9hVar2.put("daysWithoutLaunch", l5);
                        f9hVar2.put("networkType", name);
                        ot0.A(t70Var.e(), "SMART_DOWNLOAD_STARTED", f9hVar2.b());
                        xqnVar6 = new xqn();
                        xqnVar6.a = new pyq("Work cancelled");
                        tqn tqnVar42 = new tqn();
                        tqnVar42.a = true;
                        if (z8) {
                        }
                        break;
                    case 7:
                        boolean z28 = tyqVar.l;
                        boolean z29 = tyqVar.k;
                        z9 = tyqVar.j;
                        tqn tqnVar6 = (tqn) tyqVar.s;
                        xqn xqnVar17 = (xqn) tyqVar.r;
                        xqn xqnVar18 = tyqVar.q;
                        xqn xqnVar19 = tyqVar.p;
                        String str23 = tyqVar.o;
                        Long l19 = tyqVar.n;
                        try {
                            qgg.h0(obj8);
                            str8 = " retry=";
                            workerParameters = workerParameters3;
                            z11 = z29;
                            str6 = " id=";
                            str2 = " requestUpdate=";
                            tqnVar2 = tqnVar6;
                            obj6 = obj8;
                            str7 = str23;
                            nm6Var = nm6Var2;
                            str4 = "finished: result=";
                            z10 = z28;
                            xqnVar9 = xqnVar18;
                            str5 = "SmartDownloadWorker";
                            ryqVar = qyqVar;
                            xqnVar3 = xqnVar19;
                            tyqVar2 = tyqVar;
                            l11 = l19;
                            str = " needToRetry=";
                            xqnVar6 = xqnVar17;
                            if (((Boolean) obj6).booleanValue()) {
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            l10 = l19;
                            str10 = " needToRetry=";
                            str11 = "finished: result=";
                            tqnVar = tqnVar6;
                            xqnVar6 = xqnVar17;
                            z12 = z28;
                            str9 = str23;
                            function0 = null;
                            str13 = " retry=";
                            str14 = "SmartDownloadWorker";
                            workerParameters2 = workerParameters3;
                            str12 = " id=";
                            xqnVar8 = xqnVar18;
                            ryqVar = qyqVar;
                            xqnVar3 = xqnVar19;
                            syqVar = function0 != null ? (syq) function0.invoke() : null;
                            if (syqVar != null && (num = syqVar.h) != null) {
                                if (num.intValue() <= 0) {
                                    ryqVar = null;
                                    break;
                                }
                            }
                            ryqVar = (ryq) xqnVar6.a;
                            ryq ryqVar42222222 = ryqVar;
                            xqnVar6.a = ryqVar42222222;
                            Throwable th22222222 = th;
                            Boolean valueOf2 = syqVar != null ? Boolean.valueOf(syqVar.d) : null;
                            boolean z162222222 = tqnVar.a;
                            tqn tqnVar52222222 = tqnVar;
                            UUID uuid52222222 = workerParameters2.a;
                            WorkerParameters workerParameters52222222 = workerParameters2;
                            StringBuilder sb22222222 = new StringBuilder(str11);
                            sb22222222.append(ryqVar42222222);
                            sb22222222.append(str16);
                            sb22222222.append(valueOf2);
                            sb22222222.append(str13);
                            dfi.t(sb22222222, z12, str10, z162222222, str12);
                            sb22222222.append(uuid52222222);
                            ssg.a(3, str14, sb22222222.toString(), null);
                            if (syqVar != null || (list5222222 = syqVar.a) == null) {
                                List list52222222 = (List) xqnVar3.a;
                            }
                            xqnVar3.a = list52222222;
                            xqnVar8.a = rzf.N(list52222222);
                            vyq vyqVar32222222 = (vyq) jyrVar5.getValue();
                            ryq ryqVar52222222 = (ryq) xqnVar6.a;
                            String uuid62222222 = workerParameters52222222.a.toString();
                            uuid62222222.getClass();
                            List list62222222 = (List) xqnVar3.a;
                            e5w e5wVar72222222 = (e5w) xqnVar8.a;
                            Long O22222222 = rzf.O(list62222222);
                            vyqVar32222222.c(ryqVar52222222, uuid62222222, list62222222, e5wVar72222222, O22222222 != null ? O22222222.longValue() : -1L, z12, tqnVar52222222.a, str9, l10, syqVar);
                            f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar52222222.a, false);
                            throw th22222222;
                        }
                        break;
                    case 8:
                        boolean z30 = tyqVar.l;
                        xqn xqnVar20 = (xqn) tyqVar.u;
                        function02 = (Function0) tyqVar.t;
                        tqnVar3 = (tqn) tyqVar.s;
                        xqnVar6 = (xqn) tyqVar.r;
                        xqn xqnVar21 = tyqVar.q;
                        xqn xqnVar22 = tyqVar.p;
                        String str24 = tyqVar.o;
                        l11 = tyqVar.n;
                        try {
                            qgg.h0(obj8);
                            str8 = " retry=";
                            workerParameters = workerParameters3;
                            xqnVar10 = xqnVar20;
                            str6 = " id=";
                            str = " needToRetry=";
                            str2 = " requestUpdate=";
                            str4 = "finished: result=";
                            ryqVar = qyqVar;
                            xqnVar3 = xqnVar22;
                            smartDownloadWorker = this;
                            str7 = str24;
                            z12 = z30;
                            xqnVar8 = xqnVar21;
                            str5 = "SmartDownloadWorker";
                            xqnVar10.a = obj8;
                            l12 = l11;
                            z10 = z12;
                            str15 = str7;
                            xqnVar11 = xqnVar3;
                            z13 = false;
                            tqnVar3.a = z13;
                            if (function02 == null) {
                            }
                            if (syqVar2 != null) {
                            }
                            ryqVar2 = (ryq) xqnVar6.a;
                            xqnVar6.a = ryqVar2;
                            if (syqVar2 == null) {
                            }
                            boolean z15222 = tqnVar3.a;
                            WorkerParameters workerParameters4222 = workerParameters;
                            UUID uuid3222 = workerParameters4222.a;
                            StringBuilder sb322 = new StringBuilder(str4);
                            sb322.append(ryqVar2);
                            sb322.append(str2);
                            sb322.append(valueOf);
                            sb322.append(str8);
                            dfi.t(sb322, z10, str, z15222, str6);
                            sb322.append(uuid3222);
                            ssg.a(3, str5, sb322.toString(), null);
                            if (syqVar2 != null) {
                            }
                            List list3222 = (List) xqnVar11.a;
                            xqnVar11.a = list3222;
                            xqnVar8.a = rzf.N(list3222);
                            vyq vyqVar2222 = (vyq) jyrVar5.getValue();
                            ryq ryqVar3222 = (ryq) xqnVar6.a;
                            String uuid4222 = workerParameters4222.a.toString();
                            uuid4222.getClass();
                            List list4222 = (List) xqnVar11.a;
                            e5w e5wVar6222 = (e5w) xqnVar8.a;
                            Long O322 = rzf.O(list4222);
                            vyqVar2222.c(ryqVar3222, uuid4222, list4222, e5wVar6222, O322 == null ? O322.longValue() : -1L, z10, tqnVar3.a, str15, l12, syqVar2);
                            smartDownloadWorker.f((List) xqnVar11.a, (e5w) xqnVar8.a, tqnVar3.a, false);
                            return tcg.a();
                        } catch (Throwable th13) {
                            th = th13;
                            l10 = l11;
                            str9 = str24;
                            function0 = function02;
                            str10 = " needToRetry=";
                            str11 = "finished: result=";
                            ryqVar = qyqVar;
                            tqnVar = tqnVar3;
                            z12 = z30;
                            xqnVar3 = xqnVar22;
                            str13 = " retry=";
                            str14 = "SmartDownloadWorker";
                            workerParameters2 = workerParameters3;
                            str12 = " id=";
                            xqnVar8 = xqnVar21;
                            if (function0 != null) {
                            }
                            if (syqVar != null) {
                                if (num.intValue() <= 0) {
                                }
                                break;
                            }
                            ryqVar = (ryq) xqnVar6.a;
                            ryq ryqVar422222222 = ryqVar;
                            xqnVar6.a = ryqVar422222222;
                            Throwable th222222222 = th;
                            if (syqVar != null) {
                            }
                            boolean z1622222222 = tqnVar.a;
                            tqn tqnVar522222222 = tqnVar;
                            UUID uuid522222222 = workerParameters2.a;
                            WorkerParameters workerParameters522222222 = workerParameters2;
                            StringBuilder sb222222222 = new StringBuilder(str11);
                            sb222222222.append(ryqVar422222222);
                            sb222222222.append(str16);
                            sb222222222.append(valueOf2);
                            sb222222222.append(str13);
                            dfi.t(sb222222222, z12, str10, z1622222222, str12);
                            sb222222222.append(uuid522222222);
                            ssg.a(3, str14, sb222222222.toString(), null);
                            if (syqVar != null) {
                                break;
                            }
                            List list522222222 = (List) xqnVar3.a;
                            xqnVar3.a = list522222222;
                            xqnVar8.a = rzf.N(list522222222);
                            vyq vyqVar322222222 = (vyq) jyrVar5.getValue();
                            ryq ryqVar522222222 = (ryq) xqnVar6.a;
                            String uuid622222222 = workerParameters522222222.a.toString();
                            uuid622222222.getClass();
                            List list622222222 = (List) xqnVar3.a;
                            e5w e5wVar722222222 = (e5w) xqnVar8.a;
                            Long O222222222 = rzf.O(list622222222);
                            vyqVar322222222.c(ryqVar522222222, uuid622222222, list622222222, e5wVar722222222, O222222222 != null ? O222222222.longValue() : -1L, z12, tqnVar522222222.a, str9, l10, syqVar);
                            f((List) xqnVar3.a, (e5w) xqnVar8.a, tqnVar522222222.a, false);
                            throw th222222222;
                        }
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tyqVar = new tyq(this, (cg6) continuation);
        Object obj82 = tyqVar.y;
        nm6 nm6Var22 = nm6.a;
        i = tyqVar.A;
        jyr jyrVar32 = this.j;
        jyr jyrVar42 = this.g;
        jyr jyrVar52 = this.l;
        jyr jyrVar62 = this.k;
        String str162 = " requestUpdate=";
        qyq qyqVar2 = qyq.a;
        WorkerParameters workerParameters32 = this.b;
        switch (i) {
        }
    }

    public final void e(long j, boolean z, boolean z2) {
        ssg.a(3, "SmartDownloadWorker", "enqueueSelf: delayMinutes=" + (j / DiscoveryProvider.TIMEOUT) + " isRetry=" + z + " append=" + z2 + " id=" + this.b.a, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("retryFlag", Boolean.valueOf(z));
        linkedHashMap.put("workPolicy", z2 ? "append" : "replace");
        q97 q97Var = new q97(linkedHashMap);
        cxb.l0(q97Var);
        g2j g2jVar = g2j.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g2j g2jVar2 = g2j.c;
        f1j f1jVar = new f1j(null);
        jyr jyrVar = this.g;
        ((yyq) jyrVar.getValue()).getClass();
        jyr jyrVar2 = dzq.h;
        boolean z3 = ((czq) jyrVar2.getValue()).b;
        ((yyq) jyrVar.getValue()).getClass();
        fa6 fa6Var = new fa6(f1jVar, g2jVar2, z3, ((czq) jyrVar2.getValue()).a, true, false, -1L, -1L, CollectionsKt.A0(linkedHashSet));
        trj trjVar = new trj(SmartDownloadWorker.class);
        t4w t4wVar = (t4w) trjVar.c;
        t4wVar.e = q97Var;
        t4wVar.j = fa6Var;
        trj trjVar2 = (trj) trjVar.l(j, TimeUnit.MILLISECONDS);
        ((Set) trjVar2.d).add("SmartDownloadWorkerTag");
        urj urjVar = (urj) trjVar2.a();
        Context context = this.a;
        context.getClass();
        g4w d = g4w.d(context);
        d.getClass();
        d.c("SmartDownloadWorker", z2 ? opb.c : opb.a, urjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r3 <= r7) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(List list, e5w e5wVar, boolean z, boolean z2) {
        long j = 0;
        if (e5wVar != null) {
            Date date = e5wVar.c;
            TimeZone timeZone = e5wVar.e;
            long timeInMillis = rzf.F(date, timeZone).getTimeInMillis();
            Calendar F = rzf.F(date, timeZone);
            Calendar F2 = rzf.F(e5wVar.d, timeZone);
            if (F2.before(F)) {
                F2.add(5, 1);
            }
            long timeInMillis2 = F2.getTimeInMillis();
            long timeInMillis3 = Calendar.getInstance(timeZone).getTimeInMillis();
            if (timeInMillis > timeInMillis3 || timeInMillis3 > timeInMillis2) {
                timeInMillis2 -= 86400000;
                if (timeInMillis - 86400000 <= timeInMillis3) {
                }
            }
            j = timeInMillis2 - timeInMillis3;
        }
        ((yyq) this.g.getValue()).getClass();
        Long l = ((czq) dzq.h.getValue()).d;
        long longValue = l != null ? l.longValue() : 1800000L;
        if (z && j >= longValue) {
            e(longValue, true, z2);
            return;
        }
        Long O = rzf.O(list);
        if (O != null) {
            e(O.longValue(), z, z2);
        }
    }
}
