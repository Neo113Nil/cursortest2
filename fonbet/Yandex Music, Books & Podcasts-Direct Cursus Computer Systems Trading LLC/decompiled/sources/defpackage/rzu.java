package defpackage;

import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rzu implements u3l {
    public final arf a;
    public final arf b;
    public final arf c;
    public final arf d;
    public final jyr e;
    public final y3l f;
    public final List g;
    public final kan h;
    public final pr3 i;

    public rzu(arf arfVar, arf arfVar2, arf arfVar3, arf arfVar4, jyr jyrVar, y3l y3lVar, List list, kan kanVar, pr3 pr3Var) {
        arfVar.getClass();
        arfVar2.getClass();
        arfVar3.getClass();
        arfVar4.getClass();
        y3lVar.getClass();
        list.getClass();
        this.a = arfVar;
        this.b = arfVar2;
        this.c = arfVar3;
        this.d = arfVar4;
        this.e = jyrVar;
        this.f = y3lVar;
        this.g = list;
        this.h = kanVar;
        this.i = pr3Var;
    }

    @Override // defpackage.u3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        return d((WaveQueueStartCommand) substituting, zrnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ezu ezuVar, cg6 cg6Var) {
        nzu nzuVar;
        int i;
        int i2;
        int intValue;
        ssu ssuVar;
        boolean z;
        Object obj;
        ssu ssuVar2;
        c5b c5bVar;
        boolean booleanValue;
        ssu ssuVar3;
        c5b c5bVar2;
        teq teqVar;
        List list2 = list;
        if (cg6Var instanceof nzu) {
            nzuVar = (nzu) cg6Var;
            int i3 = nzuVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nzuVar.p = i3 - Integer.MIN_VALUE;
                Object obj2 = nzuVar.n;
                nm6 nm6Var = nm6.a;
                i = nzuVar.p;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list2.isEmpty()) {
                        return rsu.a;
                    }
                    kcr kcrVar = ezuVar.a;
                    hcr hcrVar = hcr.a;
                    if (Intrinsics.d(kcrVar, hcrVar)) {
                        i2 = 0;
                    } else {
                        if (!(kcrVar instanceof icr) && !(kcrVar instanceof jcr)) {
                            b6e.s();
                            return null;
                        }
                        i2 = 1;
                    }
                    kcr kcrVar2 = ezuVar.a;
                    if (Intrinsics.d(kcrVar2, hcrVar)) {
                        ssuVar = new ssu(0, list2.size(), new Long(0L));
                    } else if (kcrVar2 instanceof icr) {
                        ssuVar = new ssu(((icr) kcrVar2).a, list2.size(), new Long(0L));
                    } else {
                        if (!(kcrVar2 instanceof jcr)) {
                            b6e.s();
                            return null;
                        }
                        Iterator it = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            if (Intrinsics.d(((jzs) it.next()).a, ((jcr) kcrVar2).a)) {
                                break;
                            }
                            i4++;
                        }
                        Integer num = new Integer(i4);
                        if (num.intValue() == -1) {
                            num = null;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                        } else {
                            Integer num2 = new Integer(0);
                            ssg.a(3, "WaveQueueStartSubstitutingExecutor", "No track " + ((jcr) kcrVar2).a + " found in " + list2, null);
                            intValue = num2.intValue();
                        }
                        ssuVar = new ssu(intValue, list2.size(), new Long(0L));
                    }
                    c5b c5bVar3 = c5b.a;
                    Boolean bool = ezuVar.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                        ssuVar3 = ssuVar;
                        c5bVar2 = c5bVar3;
                        z = true;
                        List list3 = list2;
                        if (booleanValue) {
                            teqVar = new seq(null, i2 != 0 ? z : false);
                        } else {
                            teqVar = req.a;
                        }
                        return new wsu(list3, c5bVar2, ssuVar3, teqVar, false);
                    }
                    xyk xykVar = (xyk) this.e.getValue();
                    nzuVar.j = list2;
                    nzuVar.k = c5bVar3;
                    nzuVar.l = ssuVar;
                    nzuVar.m = i2;
                    z = true;
                    nzuVar.p = 1;
                    ubn ubnVar = (ubn) xykVar;
                    ubnVar.getClass();
                    Object V = x97.V(dm6.b, new tbn(ubnVar, continuation, 0), nzuVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    obj = V;
                    ssuVar2 = ssuVar;
                    c5bVar = c5bVar3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = nzuVar.m;
                    ssuVar2 = nzuVar.l;
                    c5bVar = nzuVar.k;
                    List list4 = nzuVar.j;
                    qgg.h0(obj2);
                    i2 = i5;
                    list2 = list4;
                    obj = obj2;
                    z = true;
                }
                ssuVar3 = ssuVar2;
                booleanValue = ((Boolean) obj).booleanValue();
                c5bVar2 = c5bVar;
                List list32 = list2;
                if (booleanValue) {
                }
                return new wsu(list32, c5bVar2, ssuVar3, teqVar, false);
            }
        }
        nzuVar = new nzu(this, cg6Var);
        Object obj22 = nzuVar.n;
        nm6 nm6Var2 = nm6.a;
        i = nzuVar.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ssuVar3 = ssuVar2;
        booleanValue = ((Boolean) obj).booleanValue();
        c5bVar2 = c5bVar;
        List list322 = list2;
        if (booleanValue) {
        }
        return new wsu(list322, c5bVar2, ssuVar3, teqVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xsu xsuVar, oyu oyuVar, WaveQueueStartCommand waveQueueStartCommand, Function1 function1, cg6 cg6Var) {
        ozu ozuVar;
        int i;
        nyn repeatModeType;
        oyu oyuVar2;
        Function1 function12;
        xsu xsuVar2;
        WaveQueueStartCommand waveQueueStartCommand2;
        Function1 function13;
        xsu xsuVar3;
        if (cg6Var instanceof ozu) {
            ozuVar = (ozu) cg6Var;
            int i2 = ozuVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ozuVar.p = i2 - Integer.MIN_VALUE;
                Object obj = ozuVar.n;
                nm6 nm6Var = nm6.a;
                i = ozuVar.p;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    repeatModeType = waveQueueStartCommand.getRepeatModeType();
                    if (repeatModeType != null) {
                        oyuVar2 = oyuVar;
                        function12 = function1;
                        xsuVar2 = xsuVar;
                        waveQueueStartCommand2 = waveQueueStartCommand;
                        nyn nynVar = repeatModeType;
                        oyu oyuVar3 = oyuVar2;
                        mzu mzuVar = new mzu(xsuVar2, nynVar, oyuVar3, waveQueueStartCommand2.getInSecondaryQueue(), vys.a, null, waveQueueStartCommand2.getInitialFade(), false);
                        return new StartWaveQueueCommand(new ikc(i3, 14, continuation), mzuVar, waveQueueStartCommand2.getPlayWhenReady(), this.f, new wuu(22), function12);
                    }
                    xyk xykVar = (xyk) this.e.getValue();
                    ozuVar.j = xsuVar;
                    oyuVar2 = oyuVar;
                    ozuVar.k = oyuVar2;
                    ozuVar.l = waveQueueStartCommand;
                    ozuVar.m = function1;
                    ozuVar.p = 1;
                    ubn ubnVar = (ubn) xykVar;
                    ubnVar.getClass();
                    obj = x97.V(dm6.b, new tbn(ubnVar, continuation, 1), ozuVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    function13 = function1;
                    xsuVar3 = xsuVar;
                    waveQueueStartCommand2 = waveQueueStartCommand;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function13 = ozuVar.m;
                    waveQueueStartCommand2 = ozuVar.l;
                    oyuVar2 = ozuVar.k;
                    xsuVar3 = ozuVar.j;
                    qgg.h0(obj);
                }
                repeatModeType = (nyn) obj;
                xsuVar2 = xsuVar3;
                function12 = function13;
                nyn nynVar2 = repeatModeType;
                oyu oyuVar32 = oyuVar2;
                mzu mzuVar2 = new mzu(xsuVar2, nynVar2, oyuVar32, waveQueueStartCommand2.getInSecondaryQueue(), vys.a, null, waveQueueStartCommand2.getInitialFade(), false);
                return new StartWaveQueueCommand(new ikc(i3, 14, continuation), mzuVar2, waveQueueStartCommand2.getPlayWhenReady(), this.f, new wuu(22), function12);
            }
        }
        ozuVar = new ozu(this, cg6Var);
        Object obj2 = ozuVar.n;
        nm6 nm6Var2 = nm6.a;
        i = ozuVar.p;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        repeatModeType = (nyn) obj2;
        xsuVar2 = xsuVar3;
        function12 = function13;
        nyn nynVar22 = repeatModeType;
        oyu oyuVar322 = oyuVar2;
        mzu mzuVar22 = new mzu(xsuVar2, nynVar22, oyuVar322, waveQueueStartCommand2.getInSecondaryQueue(), vys.a, null, waveQueueStartCommand2.getInitialFade(), false);
        return new StartWaveQueueCommand(new ikc(i32, 14, continuation2), mzuVar22, waveQueueStartCommand2.getPlayWhenReady(), this.f, new wuu(22), function12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch$Basic] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(WaveQueueStartCommand waveQueueStartCommand, cg6 cg6Var) {
        pzu pzuVar;
        int i;
        WaveQueueStartCommand waveQueueStartCommand2;
        rj6 rj6Var;
        rzu rzuVar;
        int i2;
        Iterator it;
        StartWaveQueueCommand startWaveQueueCommand;
        kan kanVar;
        if (cg6Var instanceof pzu) {
            pzuVar = (pzu) cg6Var;
            int i3 = pzuVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pzuVar.p = i3 - Integer.MIN_VALUE;
                pzu pzuVar2 = pzuVar;
                Object obj = pzuVar2.n;
                nm6 nm6Var = nm6.a;
                i = pzuVar2.p;
                s3l s3lVar = s3l.a;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveQueueStartSubstitutingExecutor", "Starting queue with " + waveQueueStartCommand, null);
                    pzuVar2.j = waveQueueStartCommand;
                    pzuVar2.p = 1;
                    obj = e(waveQueueStartCommand, pzuVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else if (i == 1) {
                    waveQueueStartCommand = pzuVar2.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            startWaveQueueCommand = pzuVar2.k;
                            qgg.h0(obj);
                            ?? r13 = (PlaybackCommand$QueueLaunch.Basic) obj;
                            if (r13 != 0) {
                                startWaveQueueCommand = r13;
                            }
                            return new q3l(startWaveQueueCommand);
                        }
                        int i4 = pzuVar2.m;
                        Iterator it2 = pzuVar2.l;
                        StartWaveQueueCommand startWaveQueueCommand2 = pzuVar2.k;
                        waveQueueStartCommand2 = pzuVar2.j;
                        qgg.h0(obj);
                        xcr xcrVar = (xcr) obj;
                        if (xcrVar instanceof vcr) {
                            waveQueueStartCommand2.getOnError().invoke(((vcr) xcrVar).a);
                            return s3lVar;
                        }
                        i2 = i4;
                        it = it2;
                        startWaveQueueCommand = startWaveQueueCommand2;
                        rzuVar = this;
                        if (it.hasNext()) {
                            if (!waveQueueStartCommand2.getInSecondaryQueue() && (kanVar = rzuVar.h) != null) {
                                pzuVar2.j = null;
                                pzuVar2.k = startWaveQueueCommand;
                                pzuVar2.l = null;
                                pzuVar2.p = 4;
                                obj = ((d0l) kanVar).a(startWaveQueueCommand);
                            }
                            return new q3l(startWaveQueueCommand);
                        }
                        if (it.next() != null) {
                            l1j.f();
                            return null;
                        }
                        waveQueueStartCommand2.getClass();
                        pzuVar2.j = waveQueueStartCommand2;
                        pzuVar2.k = startWaveQueueCommand;
                        pzuVar2.l = it;
                        pzuVar2.m = i2;
                        pzuVar2.p = 3;
                        throw null;
                    }
                    WaveQueueStartCommand waveQueueStartCommand3 = pzuVar2.j;
                    qgg.h0(obj);
                    rzuVar = this;
                    waveQueueStartCommand2 = waveQueueStartCommand3;
                    StartWaveQueueCommand startWaveQueueCommand3 = (StartWaveQueueCommand) obj;
                    i2 = 0;
                    it = rzuVar.g.iterator();
                    startWaveQueueCommand = startWaveQueueCommand3;
                    if (it.hasNext()) {
                    }
                }
                waveQueueStartCommand2 = waveQueueStartCommand;
                rj6Var = (rj6) obj;
                oyu waveSessionInfo = waveQueueStartCommand2.getWaveSessionInfo();
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        waveQueueStartCommand2.getOnError().invoke(((pj6) rj6Var).a());
                        return s3lVar;
                    }
                    b6e.s();
                    return null;
                }
                xsu xsuVar = (xsu) ((qj6) rj6Var).a;
                Function1 onError = waveQueueStartCommand2.getOnError();
                pzuVar2.j = waveQueueStartCommand2;
                pzuVar2.p = 2;
                rzuVar = this;
                obj = rzuVar.c(xsuVar, waveSessionInfo, waveQueueStartCommand2, onError, pzuVar2);
            }
        }
        pzuVar = new pzu(this, cg6Var);
        pzu pzuVar22 = pzuVar;
        Object obj2 = pzuVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = pzuVar22.p;
        s3l s3lVar2 = s3l.a;
        if (i != 0) {
        }
        waveQueueStartCommand2 = waveQueueStartCommand;
        rj6Var = (rj6) obj2;
        oyu waveSessionInfo2 = waveQueueStartCommand2.getWaveSessionInfo();
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x050b, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03bd, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x034b, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0375, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02de, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0248, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01c3, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x017e, code lost:
    
        if (r1 != r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0151, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x00ea, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0599, code lost:
    
        if (r1 == r2) goto L277;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0255 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(WaveQueueStartCommand waveQueueStartCommand, cg6 cg6Var) {
        qzu qzuVar;
        int i;
        WaveQueueStartCommand waveQueueStartCommand2;
        kzu kzuVar;
        xsu xsuVar;
        xsu xsuVar2;
        List list;
        kzu kzuVar2;
        List list2;
        kzu kzuVar3;
        kzu kzuVar4;
        kzu kzuVar5;
        oq oqVar;
        qj6 qj6Var;
        rrl rrlVar;
        qj6 qj6Var2;
        Object h;
        kzu kzuVar6;
        Object obj;
        mr3 mr3Var;
        kzu kzuVar7;
        List list3;
        LinkedHashMap linkedHashMap;
        rj6 qj6Var3;
        if (cg6Var instanceof qzu) {
            qzuVar = (qzu) cg6Var;
            int i2 = qzuVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qzuVar.p = i2 - Integer.MIN_VALUE;
                qzu qzuVar2 = qzuVar;
                Object obj2 = qzuVar2.n;
                Object obj3 = nm6.a;
                i = qzuVar2.p;
                rsu rsuVar = rsu.a;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        qgg.h0(obj2);
                        Function1 initialPlayablesProvider = waveQueueStartCommand.getInitialPlayablesProvider();
                        waveQueueStartCommand2 = waveQueueStartCommand;
                        qzuVar2.j = waveQueueStartCommand2;
                        qzuVar2.p = 1;
                        obj2 = initialPlayablesProvider.invoke(qzuVar2);
                        break;
                    case 1:
                        waveQueueStartCommand2 = qzuVar2.j;
                        qgg.h0(obj2);
                        kzuVar = (kzu) obj2;
                        if (Intrinsics.d(kzuVar, dzu.a)) {
                            return new qj6(rsuVar);
                        }
                        boolean z = kzuVar instanceof gzu;
                        pr3 pr3Var = this.i;
                        if (z) {
                            if (pr3Var != null) {
                                String str = ((gzu) kzuVar).a.a;
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar;
                                qzuVar2.p = 2;
                                Object a = pr3Var.a(new ov(pr3Var, str, continuation, 5), qzuVar2);
                                if (a != obj3) {
                                    kzuVar5 = kzuVar;
                                    obj2 = a;
                                    oqVar = (oq) obj2;
                                    if (oqVar != null) {
                                        LinkedList linkedList = oqVar.F;
                                        if (oqVar.l == linkedList.size()) {
                                            gzu gzuVar = (gzu) kzuVar5;
                                            List O = ivf.O(linkedList, gzuVar.b, y5g.u0(oqVar), false);
                                            ezu ezuVar = gzuVar.c;
                                            qzuVar2.j = null;
                                            qzuVar2.k = kzuVar5;
                                            qzuVar2.l = null;
                                            qzuVar2.p = 3;
                                            obj2 = b(O, ezuVar, qzuVar2);
                                            break;
                                        } else {
                                            qj6Var = null;
                                            if (qj6Var != null) {
                                                return qj6Var;
                                            }
                                        }
                                    }
                                    yr yrVar = (yr) this.a.getValue();
                                    String str2 = ((gzu) kzuVar5).a.a;
                                    qzuVar2.j = null;
                                    qzuVar2.k = kzuVar5;
                                    qzuVar2.l = null;
                                    qzuVar2.p = 4;
                                    obj2 = yrVar.d(str2, qzuVar2);
                                    break;
                                }
                            } else {
                                kzuVar5 = kzuVar;
                                yr yrVar2 = (yr) this.a.getValue();
                                String str22 = ((gzu) kzuVar5).a.a;
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar5;
                                qzuVar2.l = null;
                                qzuVar2.p = 4;
                                obj2 = yrVar2.d(str22, qzuVar2);
                            }
                        } else if (kzuVar instanceof izu) {
                            if (pr3Var != null) {
                                bd5 bd5Var = ((izu) kzuVar).a;
                                String s = bd5Var.s();
                                String a2 = bd5Var.a();
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar;
                                qzuVar2.p = 6;
                                Object a3 = pr3Var.a(new nr3(s, a2, pr3Var, null), qzuVar2);
                                if (a3 != obj3) {
                                    kzuVar4 = kzuVar;
                                    obj2 = a3;
                                    rrlVar = (rrl) obj2;
                                    if (rrlVar != null) {
                                        List list4 = rrlVar.c;
                                        int size = (list4 == null ? c5b.a : list4).size();
                                        cvl cvlVar = rrlVar.a;
                                        if (size == cvlVar.g) {
                                            if (list4 == null) {
                                                list4 = c5b.a;
                                            }
                                            izu izuVar = (izu) kzuVar4;
                                            List O2 = ivf.O(list4, izuVar.b, y5g.w0(cvlVar), false);
                                            ezu ezuVar2 = izuVar.c;
                                            qzuVar2.j = null;
                                            qzuVar2.k = kzuVar4;
                                            qzuVar2.l = null;
                                            qzuVar2.p = 7;
                                            obj2 = b(O2, ezuVar2, qzuVar2);
                                            break;
                                        } else {
                                            qj6Var2 = null;
                                            if (qj6Var2 != null) {
                                                return qj6Var2;
                                            }
                                        }
                                    }
                                    kzuVar = kzuVar4;
                                }
                            }
                            cut cutVar = (cut) this.b.getValue();
                            izu izuVar2 = (izu) kzuVar;
                            String s2 = izuVar2.a.s();
                            String a4 = izuVar2.a.a();
                            qzuVar2.j = null;
                            qzuVar2.k = kzuVar;
                            qzuVar2.l = null;
                            qzuVar2.p = 8;
                            h = cut.h(cutVar, s2, a4, false, false, qzuVar2, 120);
                            if (h != obj3) {
                                kzuVar6 = kzuVar;
                                obj2 = h;
                                obj = (rj6) obj2;
                                if (!(obj instanceof qj6)) {
                                    rrl rrlVar2 = (rrl) ((qj6) obj).a;
                                    List list5 = rrlVar2.c;
                                    ArrayList O3 = list5 != null ? ivf.O(list5, ((izu) kzuVar6).b, y5g.w0(rrlVar2.a), false) : null;
                                    obj = O3 == null ? new nj6(null) : new qj6(O3);
                                } else if (!(obj instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                if (obj instanceof qj6) {
                                    if (obj instanceof pj6) {
                                        return obj;
                                    }
                                    b6e.s();
                                    return null;
                                }
                                List list6 = (List) ((qj6) obj).a;
                                ezu ezuVar3 = ((izu) kzuVar6).c;
                                qzuVar2.j = null;
                                qzuVar2.k = null;
                                qzuVar2.l = null;
                                qzuVar2.p = 9;
                                obj2 = b(list6, ezuVar3, qzuVar2);
                                break;
                            }
                        } else if (kzuVar instanceof hzu) {
                            if (pr3Var != null) {
                                String str3 = ((hzu) kzuVar).a.a;
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar;
                                qzuVar2.p = 10;
                                Object a5 = pr3Var.a(new v3(pr3Var, str3, (Continuation) null), qzuVar2);
                                if (a5 != obj3) {
                                    kzuVar3 = kzuVar;
                                    obj2 = a5;
                                    mr3Var = (mr3) obj2;
                                    if (mr3Var != null) {
                                        hzu hzuVar = (hzu) kzuVar3;
                                        List O4 = ivf.O(mr3Var.b, hzuVar.b, y5g.v0(mr3Var.a), false);
                                        ezu ezuVar4 = hzuVar.c;
                                        qzuVar2.j = null;
                                        qzuVar2.k = kzuVar3;
                                        qzuVar2.l = null;
                                        qzuVar2.p = 11;
                                        obj2 = b(O4, ezuVar4, qzuVar2);
                                        break;
                                    }
                                    k21 k21Var = (k21) this.c.getValue();
                                    String str4 = ((hzu) kzuVar3).a.a;
                                    qzuVar2.j = null;
                                    qzuVar2.k = kzuVar3;
                                    qzuVar2.l = null;
                                    qzuVar2.p = 12;
                                    obj2 = k21.b(k21Var, str4, false, qzuVar2, 28);
                                    break;
                                }
                            } else {
                                kzuVar3 = kzuVar;
                                k21 k21Var2 = (k21) this.c.getValue();
                                String str42 = ((hzu) kzuVar3).a.a;
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar3;
                                qzuVar2.l = null;
                                qzuVar2.p = 12;
                                obj2 = k21.b(k21Var2, str42, false, qzuVar2, 28);
                            }
                        } else if (kzuVar instanceof jzu) {
                            list = ((jzu) kzuVar).a;
                            if (pr3Var != null) {
                                qzuVar2.j = null;
                                qzuVar2.k = kzuVar;
                                qzuVar2.l = list;
                                qzuVar2.p = 14;
                                Object a6 = pr3Var.a(new k3(pr3Var, list, continuation, 24), qzuVar2);
                                if (a6 != obj3) {
                                    kzuVar2 = kzuVar;
                                    obj2 = a6;
                                    list2 = (List) obj2;
                                    arf arfVar = this.d;
                                    if (list2 == null) {
                                        psd psdVar = new psd(2);
                                        psdVar.b = "WaveQueue";
                                        psdVar.a("Starting with tracks");
                                        qzuVar2.j = null;
                                        qzuVar2.k = kzuVar2;
                                        qzuVar2.l = list;
                                        qzuVar2.p = 16;
                                        obj2 = ((l0t) arfVar.getValue()).d(list, false, psdVar, qzuVar2);
                                        break;
                                    } else {
                                        List list7 = list2;
                                        int a7 = tah.a(v75.o(list7, 10));
                                        if (a7 < 16) {
                                            a7 = 16;
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a7);
                                        for (Object obj4 : list7) {
                                            linkedHashMap2.put(((mqs) obj4).a, obj4);
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj5 : list) {
                                            if (!linkedHashMap2.containsKey((String) obj5)) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            qj6Var3 = new qj6(linkedHashMap2);
                                            if (qj6Var3 instanceof qj6) {
                                                if (qj6Var3 instanceof pj6) {
                                                    return qj6Var3;
                                                }
                                                b6e.s();
                                                return null;
                                            }
                                            Map map = (Map) ((qj6) qj6Var3).a;
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                mqs mqsVar = (mqs) map.get((String) it.next());
                                                if (mqsVar != null) {
                                                    arrayList2.add(mqsVar);
                                                }
                                            }
                                            jzu jzuVar = (jzu) kzuVar2;
                                            List O5 = ivf.O(arrayList2, jzuVar.c, jzuVar.b, false);
                                            ezu ezuVar5 = jzuVar.d;
                                            qzuVar2.j = null;
                                            qzuVar2.k = null;
                                            qzuVar2.l = null;
                                            qzuVar2.m = null;
                                            qzuVar2.p = 17;
                                            obj2 = b(O5, ezuVar5, qzuVar2);
                                            break;
                                        } else {
                                            l0t l0tVar = (l0t) arfVar.getValue();
                                            psd psdVar2 = new psd(2);
                                            psdVar2.b = "WaveQueue";
                                            psdVar2.a("Starting with tracks");
                                            qzuVar2.j = null;
                                            qzuVar2.k = kzuVar2;
                                            qzuVar2.l = list;
                                            qzuVar2.m = linkedHashMap2;
                                            qzuVar2.p = 15;
                                            obj2 = l0tVar.d(arrayList, false, psdVar2, qzuVar2);
                                            if (obj2 != obj3) {
                                                kzuVar7 = kzuVar2;
                                                list3 = list;
                                                linkedHashMap = linkedHashMap2;
                                                qj6Var3 = (rj6) obj2;
                                                if (!(qj6Var3 instanceof qj6)) {
                                                    List list8 = (List) ((qj6) qj6Var3).a;
                                                    int a8 = tah.a(v75.o(list8, 10));
                                                    if (a8 < 16) {
                                                        a8 = 16;
                                                    }
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(a8);
                                                    for (Object obj6 : list8) {
                                                        linkedHashMap3.put(((mqs) obj6).a, obj6);
                                                    }
                                                    qj6Var3 = new qj6(uah.i(linkedHashMap, linkedHashMap3));
                                                } else if (!(qj6Var3 instanceof pj6)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                list = list3;
                                                kzuVar2 = kzuVar7;
                                                if (qj6Var3 instanceof qj6) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                kzuVar2 = kzuVar;
                                list2 = null;
                                arf arfVar2 = this.d;
                                if (list2 == null) {
                                }
                            }
                        } else {
                            if (!(kzuVar instanceof fzu)) {
                                b6e.s();
                                return null;
                            }
                            if (waveQueueStartCommand2.getIsShuffleEnabled() != null) {
                                xsuVar2 = ((fzu) kzuVar).a;
                                return new qj6(xsuVar2);
                            }
                            xsu xsuVar3 = ((fzu) kzuVar).a;
                            xyk xykVar = (xyk) this.e.getValue();
                            qzuVar2.j = null;
                            qzuVar2.k = null;
                            qzuVar2.l = xsuVar3;
                            qzuVar2.p = 18;
                            ubn ubnVar = (ubn) xykVar;
                            ubnVar.getClass();
                            Object V = x97.V(dm6.b, new tbn(ubnVar, continuation, 0), qzuVar2);
                            if (V != obj3) {
                                xsuVar = xsuVar3;
                                obj2 = V;
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                xsuVar.getClass();
                                if (!(xsuVar instanceof qsu) && !xsuVar.equals(rsuVar)) {
                                    if (xsuVar instanceof wsu) {
                                        b6e.s();
                                        return null;
                                    }
                                    if (booleanValue) {
                                        wsu wsuVar = (wsu) xsuVar;
                                        if (wsuVar.d instanceof req) {
                                            xsuVar2 = wsu.a(wsuVar, null, null, new seq(null, true), 23);
                                            return new qj6(xsuVar2);
                                        }
                                    }
                                    xsuVar = (wsu) xsuVar;
                                }
                                xsuVar2 = xsuVar;
                                return new qj6(xsuVar2);
                            }
                        }
                        return obj3;
                    case 2:
                        kzuVar5 = qzuVar2.k;
                        qgg.h0(obj2);
                        oqVar = (oq) obj2;
                        if (oqVar != null) {
                        }
                        yr yrVar22 = (yr) this.a.getValue();
                        String str222 = ((gzu) kzuVar5).a.a;
                        qzuVar2.j = null;
                        qzuVar2.k = kzuVar5;
                        qzuVar2.l = null;
                        qzuVar2.p = 4;
                        obj2 = yrVar22.d(str222, qzuVar2);
                        break;
                    case 3:
                        kzuVar5 = qzuVar2.k;
                        qgg.h0(obj2);
                        qj6Var = new qj6((xsu) obj2);
                        if (qj6Var != null) {
                        }
                        yr yrVar222 = (yr) this.a.getValue();
                        String str2222 = ((gzu) kzuVar5).a.a;
                        qzuVar2.j = null;
                        qzuVar2.k = kzuVar5;
                        qzuVar2.l = null;
                        qzuVar2.p = 4;
                        obj2 = yrVar222.d(str2222, qzuVar2);
                        break;
                    case 4:
                        kzuVar5 = qzuVar2.k;
                        qgg.h0(obj2);
                        rj6 rj6Var = (rj6) obj2;
                        if (rj6Var instanceof qj6) {
                            oq oqVar2 = (oq) ((qj6) rj6Var).a;
                            rj6Var = new qj6(ivf.O(oqVar2.F, ((gzu) kzuVar5).b, y5g.u0(oqVar2), false));
                        } else if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        if (!(rj6Var instanceof qj6)) {
                            if (rj6Var instanceof pj6) {
                                return rj6Var;
                            }
                            b6e.s();
                            return null;
                        }
                        List list9 = (List) ((qj6) rj6Var).a;
                        ezu ezuVar6 = ((gzu) kzuVar5).c;
                        qzuVar2.j = null;
                        qzuVar2.k = null;
                        qzuVar2.l = null;
                        qzuVar2.p = 5;
                        obj2 = b(list9, ezuVar6, qzuVar2);
                        break;
                    case 5:
                        qgg.h0(obj2);
                        xsu xsuVar4 = (xsu) obj2;
                        return xsuVar4 == null ? new nj6(null) : new qj6(xsuVar4);
                    case 6:
                        kzuVar4 = qzuVar2.k;
                        qgg.h0(obj2);
                        rrlVar = (rrl) obj2;
                        if (rrlVar != null) {
                        }
                        kzuVar = kzuVar4;
                        cut cutVar2 = (cut) this.b.getValue();
                        izu izuVar22 = (izu) kzuVar;
                        String s22 = izuVar22.a.s();
                        String a42 = izuVar22.a.a();
                        qzuVar2.j = null;
                        qzuVar2.k = kzuVar;
                        qzuVar2.l = null;
                        qzuVar2.p = 8;
                        h = cut.h(cutVar2, s22, a42, false, false, qzuVar2, 120);
                        if (h != obj3) {
                        }
                        return obj3;
                    case 7:
                        kzuVar4 = qzuVar2.k;
                        qgg.h0(obj2);
                        qj6Var2 = new qj6(obj2);
                        if (qj6Var2 != null) {
                        }
                        kzuVar = kzuVar4;
                        cut cutVar22 = (cut) this.b.getValue();
                        izu izuVar222 = (izu) kzuVar;
                        String s222 = izuVar222.a.s();
                        String a422 = izuVar222.a.a();
                        qzuVar2.j = null;
                        qzuVar2.k = kzuVar;
                        qzuVar2.l = null;
                        qzuVar2.p = 8;
                        h = cut.h(cutVar22, s222, a422, false, false, qzuVar2, 120);
                        if (h != obj3) {
                        }
                        return obj3;
                    case 8:
                        kzuVar6 = qzuVar2.k;
                        qgg.h0(obj2);
                        obj = (rj6) obj2;
                        if (!(obj instanceof qj6)) {
                        }
                        if (obj instanceof qj6) {
                        }
                        break;
                    case 9:
                        qgg.h0(obj2);
                        xsu xsuVar5 = (xsu) obj2;
                        return xsuVar5 == null ? new nj6(null) : new qj6(xsuVar5);
                    case 10:
                        kzuVar3 = qzuVar2.k;
                        qgg.h0(obj2);
                        mr3Var = (mr3) obj2;
                        if (mr3Var != null) {
                        }
                        k21 k21Var22 = (k21) this.c.getValue();
                        String str422 = ((hzu) kzuVar3).a.a;
                        qzuVar2.j = null;
                        qzuVar2.k = kzuVar3;
                        qzuVar2.l = null;
                        qzuVar2.p = 12;
                        obj2 = k21.b(k21Var22, str422, false, qzuVar2, 28);
                        break;
                    case 11:
                        qgg.h0(obj2);
                        return new qj6(obj2);
                    case 12:
                        kzuVar3 = qzuVar2.k;
                        qgg.h0(obj2);
                        rj6 rj6Var2 = (rj6) obj2;
                        if (rj6Var2 instanceof qj6) {
                            i21 i21Var = (i21) ((qj6) rj6Var2).a;
                            rj6Var2 = new qj6(ivf.O(i21Var.g, ((hzu) kzuVar3).b, y5g.v0(i21Var.a), false));
                        } else if (!(rj6Var2 instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        if (!(rj6Var2 instanceof qj6)) {
                            if (rj6Var2 instanceof pj6) {
                                return rj6Var2;
                            }
                            b6e.s();
                            return null;
                        }
                        List list10 = (List) ((qj6) rj6Var2).a;
                        ezu ezuVar7 = ((hzu) kzuVar3).c;
                        qzuVar2.j = null;
                        qzuVar2.k = null;
                        qzuVar2.l = null;
                        qzuVar2.p = 13;
                        obj2 = b(list10, ezuVar7, qzuVar2);
                        break;
                    case 13:
                        qgg.h0(obj2);
                        xsu xsuVar6 = (xsu) obj2;
                        return xsuVar6 == null ? new nj6(null) : new qj6(xsuVar6);
                    case 14:
                        list = (List) qzuVar2.l;
                        kzuVar2 = qzuVar2.k;
                        qgg.h0(obj2);
                        list2 = (List) obj2;
                        arf arfVar22 = this.d;
                        if (list2 == null) {
                        }
                        return obj3;
                    case 15:
                        linkedHashMap = qzuVar2.m;
                        list3 = (List) qzuVar2.l;
                        kzuVar7 = qzuVar2.k;
                        qgg.h0(obj2);
                        qj6Var3 = (rj6) obj2;
                        if (!(qj6Var3 instanceof qj6)) {
                        }
                        list = list3;
                        kzuVar2 = kzuVar7;
                        if (qj6Var3 instanceof qj6) {
                        }
                        break;
                    case 16:
                        list = (List) qzuVar2.l;
                        kzuVar2 = qzuVar2.k;
                        qgg.h0(obj2);
                        qj6Var3 = (rj6) obj2;
                        if (qj6Var3 instanceof qj6) {
                            List list11 = (List) ((qj6) qj6Var3).a;
                            int a9 = tah.a(v75.o(list11, 10));
                            if (a9 < 16) {
                                a9 = 16;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(a9);
                            for (Object obj7 : list11) {
                                linkedHashMap4.put(((mqs) obj7).a, obj7);
                            }
                            qj6Var3 = new qj6(linkedHashMap4);
                        } else if (!(qj6Var3 instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        if (qj6Var3 instanceof qj6) {
                        }
                        break;
                    case 17:
                        qgg.h0(obj2);
                        xsu xsuVar7 = (xsu) obj2;
                        return xsuVar7 == null ? new nj6(null) : new qj6(xsuVar7);
                    case 18:
                        xsuVar = (xsu) qzuVar2.l;
                        qgg.h0(obj2);
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        xsuVar.getClass();
                        if (!(xsuVar instanceof qsu)) {
                            if (xsuVar instanceof wsu) {
                            }
                            break;
                        }
                        xsuVar2 = xsuVar;
                        return new qj6(xsuVar2);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        qzuVar = new qzu(this, cg6Var);
        qzu qzuVar22 = qzuVar;
        Object obj22 = qzuVar22.n;
        Object obj32 = nm6.a;
        i = qzuVar22.p;
        rsu rsuVar2 = rsu.a;
        Continuation continuation2 = null;
        switch (i) {
        }
    }
}
