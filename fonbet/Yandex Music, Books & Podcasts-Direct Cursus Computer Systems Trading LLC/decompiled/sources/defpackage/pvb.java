package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class pvb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hvb b;
    public final /* synthetic */ sdr c;

    public /* synthetic */ pvb(hvb hvbVar, sdr sdrVar, int i) {
        this.a = i;
        this.b = hvbVar;
        this.c = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                dvb dvbVar = dvb.a;
                hvb hvbVar = this.b;
                if (!Intrinsics.d(hvbVar, dvbVar) && !(hvbVar instanceof fvb)) {
                    if (!(hvbVar instanceof evb)) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                } else {
                    jil jilVar = (jil) this.c.getValue();
                    if (!Intrinsics.d(jilVar, gil.a)) {
                        if (!(jilVar instanceof iil)) {
                            b6e.s();
                            break;
                        } else if (!szf.b0((wxk) ((iil) jilVar).a.b.a)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            default:
                dvb dvbVar2 = dvb.a;
                hvb hvbVar2 = this.b;
                if (!Intrinsics.d(hvbVar2, dvbVar2)) {
                    if (!(hvbVar2 instanceof gvb)) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                } else {
                    jil jilVar2 = (jil) this.c.getValue();
                    if (!Intrinsics.d(jilVar2, gil.a)) {
                        if (!(jilVar2 instanceof iil)) {
                            b6e.s();
                            break;
                        } else if (!szf.b0((wxk) ((iil) jilVar2).a.b.a)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
        }
        return qx0.c;
    }
}
