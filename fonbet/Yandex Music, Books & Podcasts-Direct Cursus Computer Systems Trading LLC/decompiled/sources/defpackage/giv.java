package defpackage;

import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelFeedbackDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelItemFeedbackDto;
import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class giv {
    public static final hmm.a g = new hmm.a("key_wheel_feedbacks");
    public final frt a;
    public final cc7 b;
    public final tf6 c;
    public final jyr d;
    public final ArrayList e = new ArrayList();
    public final jyr f;

    public giv(frt frtVar, cc7 cc7Var, tf6 tf6Var) {
        this.a = frtVar;
        this.b = cc7Var;
        this.c = tf6Var;
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: aiv
            public final /* synthetic */ giv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        giv givVar = this.b;
                        return new c1f("storage_wheel_feedbacks", new buu(givVar, null, 3), givVar.b).c(giv.g, WheelFeedbackDto.class);
                    default:
                        giv givVar2 = this.b;
                        return bg3.i(givVar2.c, null, 30, null, new ocu(givVar2, null), 13);
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: aiv
            public final /* synthetic */ giv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        giv givVar = this.b;
                        return new c1f("storage_wheel_feedbacks", new buu(givVar, null, 3), givVar.b).c(giv.g, WheelFeedbackDto.class);
                    default:
                        giv givVar2 = this.b;
                        return bg3.i(givVar2.c, null, 30, null, new ocu(givVar2, null), 13);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005f, code lost:
    
        if (r14 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        if (r14.m(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        fiv fivVar;
        int i;
        gm5 j;
        ejv ejvVar;
        yhv yhvVar;
        Object obj;
        if (cg6Var instanceof fiv) {
            fivVar = (fiv) cg6Var;
            int i2 = fivVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fivVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = fivVar.k;
                nm6 nm6Var = nm6.a;
                i = fivVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    j = hld.j();
                    fgp fgpVar = (fgp) this.f.getValue();
                    div divVar = new div(j);
                    fivVar.j = j;
                    fivVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        ArrayList arrayList = new ArrayList();
                        for (WheelFeedbackDto wheelFeedbackDto : (Iterable) obj2) {
                            wheelFeedbackDto.getClass();
                            String wheelId = wheelFeedbackDto.getWheelId();
                            if (wheelId == null) {
                                dfi.r("wheelId is null: " + wheelFeedbackDto, "WheelFeedback");
                            }
                            if (wheelId != null) {
                                Long timestamp = wheelFeedbackDto.getTimestamp();
                                if (timestamp == null) {
                                    dfi.r("timestamp is null: " + wheelFeedbackDto, "WheelFeedback");
                                }
                                if (timestamp != null) {
                                    long longValue = timestamp.longValue();
                                    String eventType = wheelFeedbackDto.getEventType();
                                    if (eventType != null) {
                                        ejv.a.getClass();
                                        Iterator it = ejv.e.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it.next();
                                            if (Intrinsics.d(((ejv) obj).name(), eventType)) {
                                                break;
                                            }
                                        }
                                        ejvVar = (ejv) obj;
                                    } else {
                                        ejvVar = null;
                                    }
                                    if (ejvVar == null) {
                                        dfi.r("eventType is null: " + wheelFeedbackDto, "WheelFeedback");
                                    }
                                    if (ejvVar != null) {
                                        Integer position = wheelFeedbackDto.getPosition();
                                        if (position == null) {
                                            dfi.r("position is null: " + wheelFeedbackDto, "WheelFeedback");
                                        }
                                        if (position != null) {
                                            int intValue = position.intValue();
                                            WheelItemFeedbackDto item = wheelFeedbackDto.getItem();
                                            if (item == null) {
                                                dfi.r("item is null: " + wheelFeedbackDto, "WheelFeedback");
                                            }
                                            if (item != null) {
                                                yhvVar = new yhv(wheelId, new djv(item.getId(), item.getType()), intValue, ejvVar, longValue);
                                                if (yhvVar == null) {
                                                    arrayList.add(yhvVar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            yhvVar = null;
                            if (yhvVar == null) {
                            }
                        }
                        return arrayList;
                    }
                    j = fivVar.j;
                    qgg.h0(obj2);
                }
                fivVar.j = null;
                fivVar.m = 2;
                obj2 = j.s(fivVar);
            }
        }
        fivVar = new fiv(this, cg6Var);
        Object obj22 = fivVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fivVar.m;
        if (i != 0) {
        }
        fivVar.j = null;
        fivVar.m = 2;
        obj22 = j.s(fivVar);
    }
}
