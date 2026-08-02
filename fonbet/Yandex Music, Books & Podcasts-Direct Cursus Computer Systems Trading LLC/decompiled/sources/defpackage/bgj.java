package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.plus.home.api.panel.b;
import com.yandex.plus.home.api.panel.c;
import com.yandex.plus.home.api.panel.d;
import com.yandex.plus.home.api.panel.e;
import com.yandex.pulse.metrics.o;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bgj implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ bgj(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        agj agjVar;
        int i;
        cgj cgjVar;
        int i2;
        blj bljVar;
        int i3;
        hlj hljVar;
        int i4;
        kmj kmjVar;
        int i5;
        r5k r5kVar;
        int i6;
        xsk xskVar;
        int i7;
        String str;
        Object obj2;
        ywk ywkVar;
        int i8;
        qzk qzkVar;
        int i9;
        uzk uzkVar;
        int i10;
        q0l q0lVar;
        int i11;
        r0l r0lVar;
        int i12;
        y0l y0lVar;
        int i13;
        z0l z0lVar;
        int i14;
        m1l m1lVar;
        int i15;
        mqs a;
        n1l n1lVar;
        int i16;
        n7q n7qVar;
        o1l o1lVar;
        int i17;
        mqs a2;
        q1l q1lVar;
        int i18;
        k2l k2lVar;
        int i19;
        p2l p2lVar;
        int i20;
        q2l q2lVar;
        int i21;
        a4l a4lVar;
        int i22;
        b4l b4lVar;
        int i23;
        c4l c4lVar;
        int i24;
        h4l h4lVar;
        int i25;
        i4l i4lVar;
        int i26;
        t4l t4lVar;
        int i27;
        v4l v4lVar;
        int i28;
        a5l a5lVar;
        int i29;
        h7l h7lVar;
        int i30;
        d6l d6lVar;
        v0l v0lVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof agj) {
                    agjVar = (agj) continuation;
                    int i31 = agjVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        agjVar.k = i31 - Integer.MIN_VALUE;
                        Object obj3 = agjVar.j;
                        nm6 nm6Var = nm6.a;
                        i = agjVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            Boolean valueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                            agjVar.k = 1;
                            if (this.b.emit(valueOf, agjVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                agjVar = new agj(this, continuation);
                Object obj32 = agjVar.j;
                nm6 nm6Var2 = nm6.a;
                i = agjVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof cgj) {
                    cgjVar = (cgj) continuation;
                    int i32 = cgjVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        cgjVar.k = i32 - Integer.MIN_VALUE;
                        Object obj4 = cgjVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = cgjVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            Object c = ((Boolean) obj).booleanValue() ? t75.c(new vfj(rf3.l)) : c5b.a;
                            cgjVar.k = 1;
                            if (this.b.emit(c, cgjVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                cgjVar = new cgj(this, continuation);
                Object obj42 = cgjVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = cgjVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof blj) {
                    bljVar = (blj) continuation;
                    int i33 = bljVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        bljVar.k = i33 - Integer.MIN_VALUE;
                        Object obj5 = bljVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = bljVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf2 = Boolean.valueOf(((x66) obj).b == u0j.a);
                            bljVar.k = 1;
                            if (this.b.emit(valueOf2, bljVar) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                bljVar = new blj(this, continuation);
                Object obj52 = bljVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = bljVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof hlj) {
                    hljVar = (hlj) continuation;
                    int i34 = hljVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hljVar.k = i34 - Integer.MIN_VALUE;
                        Object obj6 = hljVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = hljVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            if (((xxq) obj).a()) {
                                hljVar.k = 1;
                                if (this.b.emit(obj, hljVar) == nm6Var5) {
                                }
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                hljVar = new hlj(this, continuation);
                Object obj62 = hljVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = hljVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof kmj) {
                    kmjVar = (kmj) continuation;
                    int i35 = kmjVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        kmjVar.k = i35 - Integer.MIN_VALUE;
                        Object obj7 = kmjVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = kmjVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj7);
                            Boolean valueOf3 = Boolean.valueOf(((mmj) obj).c);
                            kmjVar.k = 1;
                            if (this.b.emit(valueOf3, kmjVar) == nm6Var6) {
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                kmjVar = new kmj(this, continuation);
                Object obj72 = kmjVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = kmjVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof r5k) {
                    r5kVar = (r5k) continuation;
                    int i36 = r5kVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        r5kVar.k = i36 - Integer.MIN_VALUE;
                        Object obj8 = r5kVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = r5kVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj8);
                            e eVar = (e) obj;
                            eVar.getClass();
                            Object k5kVar = eVar.equals(b.a) ? i5k.a : eVar.equals(c.a) ? j5k.a : eVar instanceof d ? new k5k(((d) eVar).a) : h5k.a;
                            r5kVar.k = 1;
                            if (this.b.emit(k5kVar, r5kVar) == nm6Var7) {
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                r5kVar = new r5k(this, continuation);
                Object obj82 = r5kVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = r5kVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof xsk) {
                    xskVar = (xsk) continuation;
                    int i37 = xskVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        xskVar.k = i37 - Integer.MIN_VALUE;
                        Object obj9 = xskVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = xskVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj9);
                            Map map = (Map) obj;
                            String str2 = (String) map.get("notification_kind");
                            String str3 = null;
                            if (str2 != null) {
                                str = str2.toLowerCase(Locale.ROOT);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (Intrinsics.d(str, "small")) {
                                obj2 = btk.a;
                            } else if (Intrinsics.d(str, "big")) {
                                obj2 = zsk.a;
                            } else {
                                String str4 = (String) map.get("isDefault");
                                if (str4 != null) {
                                    str3 = str4.toLowerCase(Locale.ROOT);
                                    str3.getClass();
                                }
                                obj2 = Intrinsics.d(str3, PListParser.TAG_TRUE) ? atk.a : ctk.a;
                            }
                            xskVar.k = 1;
                            if (this.b.emit(obj2, xskVar) == nm6Var8) {
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                xskVar = new xsk(this, continuation);
                Object obj92 = xskVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = xskVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof ywk) {
                    ywkVar = (ywk) continuation;
                    int i38 = ywkVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        ywkVar.k = i38 - Integer.MIN_VALUE;
                        Object obj10 = ywkVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = ywkVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj10);
                            xwk xwkVar = new xwk((j1g) obj, System.currentTimeMillis());
                            ywkVar.k = 1;
                            if (this.b.emit(xwkVar, ywkVar) == nm6Var9) {
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                        }
                        break;
                    }
                }
                ywkVar = new ywk(this, continuation);
                Object obj102 = ywkVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = ywkVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof qzk) {
                    qzkVar = (qzk) continuation;
                    int i39 = qzkVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qzkVar.k = i39 - Integer.MIN_VALUE;
                        Object obj11 = qzkVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = qzkVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj11);
                            if (obj instanceof d6l) {
                                qzkVar.k = 1;
                                if (this.b.emit(obj, qzkVar) == nm6Var10) {
                                }
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                qzkVar = new qzk(this, continuation);
                Object obj112 = qzkVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = qzkVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof uzk) {
                    uzkVar = (uzk) continuation;
                    int i40 = uzkVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        uzkVar.k = i40 - Integer.MIN_VALUE;
                        Object obj12 = uzkVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = uzkVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj12);
                            vri vriVar = new vri(1, (Throwable) obj);
                            uzkVar.k = 1;
                            if (this.b.emit(vriVar, uzkVar) == nm6Var11) {
                            }
                        } else if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                uzkVar = new uzk(this, continuation);
                Object obj122 = uzkVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = uzkVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof q0l) {
                    q0lVar = (q0l) continuation;
                    int i41 = q0lVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        q0lVar.k = i41 - Integer.MIN_VALUE;
                        Object obj13 = q0lVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = q0lVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj13);
                            Pair pair = new Pair(null, (nvm) obj);
                            q0lVar.k = 1;
                            if (this.b.emit(pair, q0lVar) == nm6Var12) {
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                q0lVar = new q0l(this, continuation);
                Object obj132 = q0lVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = q0lVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof r0l) {
                    r0lVar = (r0l) continuation;
                    int i42 = r0lVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        r0lVar.k = i42 - Integer.MIN_VALUE;
                        Object obj14 = r0lVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = r0lVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj14);
                            Pair pair2 = new Pair((u8l) obj, null);
                            r0lVar.k = 1;
                            if (this.b.emit(pair2, r0lVar) == nm6Var13) {
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                r0lVar = new r0l(this, continuation);
                Object obj142 = r0lVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = r0lVar.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof y0l) {
                    y0lVar = (y0l) continuation;
                    int i43 = y0lVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        y0lVar.k = i43 - Integer.MIN_VALUE;
                        Object obj15 = y0lVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = y0lVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            v8n v8nVar = (v8n) obj;
                            Pair pair3 = new Pair(v8nVar, v8nVar != null ? (a0q) v8nVar.a(new jwl(3)) : null);
                            y0lVar.k = 1;
                            if (this.b.emit(pair3, y0lVar) == nm6Var14) {
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                        }
                        break;
                    }
                }
                y0lVar = new y0l(this, continuation);
                Object obj152 = y0lVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = y0lVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof z0l) {
                    z0lVar = (z0l) continuation;
                    int i44 = z0lVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        z0lVar.k = i44 - Integer.MIN_VALUE;
                        Object obj16 = z0lVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = z0lVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj16);
                            y7q y7qVar = (y7q) obj;
                            x7q x7qVar = y7qVar instanceof x7q ? (x7q) y7qVar : null;
                            z0lVar.k = 1;
                            if (this.b.emit(x7qVar, z0lVar) == nm6Var15) {
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                z0lVar = new z0l(this, continuation);
                Object obj162 = z0lVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = z0lVar.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof m1l) {
                    m1lVar = (m1l) continuation;
                    int i45 = m1lVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        m1lVar.k = i45 - Integer.MIN_VALUE;
                        Object obj17 = m1lVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = m1lVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj17);
                            nvm nvmVar = (nvm) obj;
                            mwk mwkVar = nvmVar.a;
                            if (!Intrinsics.d(mwkVar, h1b.e) && (a = mwkVar.a()) != null && a.l && nvmVar.e) {
                                m1lVar.k = 1;
                                if (this.b.emit(obj, m1lVar) == nm6Var16) {
                                }
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                m1lVar = new m1l(this, continuation);
                Object obj172 = m1lVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = m1lVar.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof n1l) {
                    n1lVar = (n1l) continuation;
                    int i46 = n1lVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        n1lVar.k = i46 - Integer.MIN_VALUE;
                        Object obj18 = n1lVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = n1lVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj18);
                            d6l x = p6g.x((e6l) obj);
                            mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
                            n1lVar.k = 1;
                            if (this.b.emit(b, n1lVar) == nm6Var17) {
                            }
                        } else if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                n1lVar = new n1l(this, continuation);
                Object obj182 = n1lVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = n1lVar.k;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof o1l) {
                    o1lVar = (o1l) continuation;
                    int i47 = o1lVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        o1lVar.k = i47 - Integer.MIN_VALUE;
                        Object obj19 = o1lVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = o1lVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj19);
                            mwk mwkVar2 = (mwk) obj;
                            boolean z = false;
                            if (mwkVar2 != null && !Intrinsics.d(mwkVar2, h1b.e) && (a2 = mwkVar2.a()) != null && a2.l) {
                                z = true;
                            }
                            Boolean valueOf4 = Boolean.valueOf(z);
                            o1lVar.k = 1;
                            if (this.b.emit(valueOf4, o1lVar) == nm6Var18) {
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                o1lVar = new o1l(this, continuation);
                Object obj192 = o1lVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = o1lVar.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof q1l) {
                    q1lVar = (q1l) continuation;
                    int i48 = q1lVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        q1lVar.k = i48 - Integer.MIN_VALUE;
                        Object obj20 = q1lVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = q1lVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj20);
                            Unit unit = Unit.a;
                            q1lVar.k = 1;
                            if (this.b.emit(unit, q1lVar) == nm6Var19) {
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                q1lVar = new q1l(this, continuation);
                Object obj202 = q1lVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = q1lVar.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof k2l) {
                    k2lVar = (k2l) continuation;
                    int i49 = k2lVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        k2lVar.k = i49 - Integer.MIN_VALUE;
                        Object obj21 = k2lVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = k2lVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj21);
                            nvm nvmVar2 = (nvm) obj;
                            if (nvmVar2.d == null || nvmVar2.c == null) {
                                nvmVar2 = null;
                            }
                            if (nvmVar2 != null) {
                                k2lVar.k = 1;
                                if (this.b.emit(nvmVar2, k2lVar) == nm6Var20) {
                                }
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                k2lVar = new k2l(this, continuation);
                Object obj212 = k2lVar.j;
                nm6 nm6Var202 = nm6.a;
                i19 = k2lVar.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof p2l) {
                    p2lVar = (p2l) continuation;
                    int i50 = p2lVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        p2lVar.k = i50 - Integer.MIN_VALUE;
                        Object obj22 = p2lVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = p2lVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj22);
                            if (obj instanceof d6l) {
                                p2lVar.k = 1;
                                if (this.b.emit(obj, p2lVar) == nm6Var21) {
                                }
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj22);
                        }
                        break;
                    }
                }
                p2lVar = new p2l(this, continuation);
                Object obj222 = p2lVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = p2lVar.k;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof q2l) {
                    q2lVar = (q2l) continuation;
                    int i51 = q2lVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        q2lVar.k = i51 - Integer.MIN_VALUE;
                        Object obj23 = q2lVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = q2lVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj23);
                            nvm nvmVar3 = (nvm) obj;
                            if (nvmVar3.d == null || nvmVar3.c == null) {
                                nvmVar3 = null;
                            }
                            if (nvmVar3 != null) {
                                q2lVar.k = 1;
                                if (this.b.emit(nvmVar3, q2lVar) == nm6Var22) {
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                q2lVar = new q2l(this, continuation);
                Object obj232 = q2lVar.j;
                nm6 nm6Var222 = nm6.a;
                i21 = q2lVar.k;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof a4l) {
                    a4lVar = (a4l) continuation;
                    int i52 = a4lVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        a4lVar.k = i52 - Integer.MIN_VALUE;
                        Object obj24 = a4lVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = a4lVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj24);
                            Object obj25 = (y7q) obj;
                            if (obj25 == null) {
                                obj25 = v7q.a;
                            }
                            a4lVar.k = 1;
                            if (this.b.emit(obj25, a4lVar) == nm6Var23) {
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                a4lVar = new a4l(this, continuation);
                Object obj242 = a4lVar.j;
                nm6 nm6Var232 = nm6.a;
                i22 = a4lVar.k;
                if (i22 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof b4l) {
                    b4lVar = (b4l) continuation;
                    int i53 = b4lVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        b4lVar.k = i53 - Integer.MIN_VALUE;
                        Object obj26 = b4lVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = b4lVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj26);
                            Object obj27 = (y7q) obj;
                            if (obj27 == null) {
                                obj27 = u7q.a;
                            }
                            b4lVar.k = 1;
                            if (this.b.emit(obj27, b4lVar) == nm6Var24) {
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                b4lVar = new b4l(this, continuation);
                Object obj262 = b4lVar.j;
                nm6 nm6Var242 = nm6.a;
                i23 = b4lVar.k;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof c4l) {
                    c4lVar = (c4l) continuation;
                    int i54 = c4lVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        c4lVar.k = i54 - Integer.MIN_VALUE;
                        Object obj28 = c4lVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = c4lVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj28);
                            l7l z2 = p6g.z((e6l) obj);
                            c4lVar.k = 1;
                            if (this.b.emit(z2, c4lVar) == nm6Var25) {
                            }
                        } else if (i24 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                        }
                        break;
                    }
                }
                c4lVar = new c4l(this, continuation);
                Object obj282 = c4lVar.j;
                nm6 nm6Var252 = nm6.a;
                i24 = c4lVar.k;
                if (i24 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof h4l) {
                    h4lVar = (h4l) continuation;
                    int i55 = h4lVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        h4lVar.k = i55 - Integer.MIN_VALUE;
                        Object obj29 = h4lVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = h4lVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj29);
                            if (obj instanceof d6l) {
                                h4lVar.k = 1;
                                if (this.b.emit(obj, h4lVar) == nm6Var26) {
                                }
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj29);
                        }
                        break;
                    }
                }
                h4lVar = new h4l(this, continuation);
                Object obj292 = h4lVar.j;
                nm6 nm6Var262 = nm6.a;
                i25 = h4lVar.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof i4l) {
                    i4lVar = (i4l) continuation;
                    int i56 = i4lVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        i4lVar.k = i56 - Integer.MIN_VALUE;
                        Object obj30 = i4lVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = i4lVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj30);
                            Object A = wdg.A(((d6l) obj).a, ofc.k);
                            i4lVar.k = 1;
                            if (this.b.emit(A, i4lVar) == nm6Var27) {
                            }
                        } else if (i26 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj30);
                        }
                        break;
                    }
                }
                i4lVar = new i4l(this, continuation);
                Object obj302 = i4lVar.j;
                nm6 nm6Var272 = nm6.a;
                i26 = i4lVar.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof t4l) {
                    t4lVar = (t4l) continuation;
                    int i57 = t4lVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        t4lVar.k = i57 - Integer.MIN_VALUE;
                        Object obj31 = t4lVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = t4lVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj31);
                            Pair pair4 = (Pair) obj;
                            x66 x66Var = (x66) pair4.a;
                            x66 x66Var2 = (x66) pair4.b;
                            if (!x66Var.a && x66Var2.a) {
                                t4lVar.k = 1;
                                if (this.b.emit(obj, t4lVar) == nm6Var28) {
                                }
                            }
                        } else if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                        }
                        break;
                    }
                }
                t4lVar = new t4l(this, continuation);
                Object obj312 = t4lVar.j;
                nm6 nm6Var282 = nm6.a;
                i27 = t4lVar.k;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof v4l) {
                    v4lVar = (v4l) continuation;
                    int i58 = v4lVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        v4lVar.k = i58 - Integer.MIN_VALUE;
                        Object obj33 = v4lVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = v4lVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj33);
                            String str5 = ((xxq) obj).a;
                            v4lVar.k = 1;
                            if (this.b.emit(str5, v4lVar) == nm6Var29) {
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj33);
                        }
                        break;
                    }
                }
                v4lVar = new v4l(this, continuation);
                Object obj332 = v4lVar.j;
                nm6 nm6Var292 = nm6.a;
                i28 = v4lVar.k;
                if (i28 != 0) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof a5l) {
                    a5lVar = (a5l) continuation;
                    int i59 = a5lVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        a5lVar.k = i59 - Integer.MIN_VALUE;
                        Object obj34 = a5lVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = a5lVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj34);
                            String str6 = ((xxq) obj).a;
                            a5lVar.k = 1;
                            if (this.b.emit(str6, a5lVar) == nm6Var30) {
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj34);
                        }
                        break;
                    }
                }
                a5lVar = new a5l(this, continuation);
                Object obj342 = a5lVar.j;
                nm6 nm6Var302 = nm6.a;
                i29 = a5lVar.k;
                if (i29 != 0) {
                }
                break;
            default:
                if (continuation instanceof h7l) {
                    h7lVar = (h7l) continuation;
                    int i60 = h7lVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        h7lVar.k = i60 - Integer.MIN_VALUE;
                        Object obj35 = h7lVar.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = h7lVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj35);
                            e6l e6lVar = (e6l) obj;
                            Boolean valueOf5 = Boolean.valueOf((e6lVar instanceof d6l) && ((v0lVar = (d6lVar = (d6l) e6lVar).c) == v0l.c || v0lVar == v0l.b) && d6lVar.b == w0l.b);
                            h7lVar.k = 1;
                            if (this.b.emit(valueOf5, h7lVar) == nm6Var31) {
                            }
                        } else if (i30 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj35);
                        }
                        break;
                    }
                }
                h7lVar = new h7l(this, continuation);
                Object obj352 = h7lVar.j;
                nm6 nm6Var312 = nm6.a;
                i30 = h7lVar.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bgj(rjc rjcVar, kz3 kz3Var, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
