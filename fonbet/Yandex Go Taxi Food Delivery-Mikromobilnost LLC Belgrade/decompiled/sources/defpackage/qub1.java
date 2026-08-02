package defpackage;

import android.nfc.tech.MifareClassic;
import android.os.SystemClock;
import android.view.View;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.payment.sdk.transportcards.nfc.exception.DetectedTypeReadingException;
import com.yandex.payment.sdk.transportcards.nfc.exception.DetectedTypeWritingException;
import com.yandex.plus.home.common.utils.OnClickListenerExtKt$toDebounced$1;

/* loaded from: classes11.dex */
public abstract class qub1 {
    public static final void a(irl irlVar, f530 f530Var, fid fidVar, int i) {
        float f;
        ety0 ety0Var;
        SlotSize slotSize = irlVar.g;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1263782889);
        int i2 = (btsVar.k(irlVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean c = btsVar.c(slotSize.ordinal());
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                int i4 = njf.a[slotSize.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    f = 0.0f;
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return;
                    }
                    f = 4.0f;
                }
                Q = ly3.h(f, btsVar);
            }
            float f2 = ((y7m) Q).a;
            int i5 = njf.b[irlVar.e.ordinal()];
            if (i5 == 1) {
                btsVar.e0(327757952);
                ety0Var = xya1.e(btsVar).g.a;
                btsVar.t(false);
            } else if (i5 == 2) {
                btsVar.e0(327894910);
                ety0Var = xya1.e(btsVar).h.b;
                btsVar.t(false);
            } else {
                if (i5 != 3) {
                    throw unr0.y(980400155, btsVar, false);
                }
                btsVar.e0(328020894);
                ety0Var = xya1.e(btsVar).h.b;
                btsVar.t(false);
            }
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new dye(11, irlVar);
                btsVar.o0(Q2);
            }
            ydb1.a(an91.m(fnq0.a(f530Var, (tls) Q2), f2, 0.0f, 2), null, wwg.S(-334359194, true, new sp5(27, irlVar, ety0Var), btsVar), null, null, irlVar.f, irlVar.g, false, btsVar, 384, 154);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(irlVar, f530Var, i, i3);
        }
    }

    public static boolean b(lgr lgrVar, MifareClassic mifareClassic, int i) {
        String str = lgrVar.f;
        String str2 = lgrVar.e;
        if (jl40.l(str, "A")) {
            return mifareClassic.authenticateSectorWithKeyA(i, ofu.a(str2));
        }
        if (jl40.l(str, "B")) {
            return mifareClassic.authenticateSectorWithKeyB(i, ofu.a(str2));
        }
        throw new DetectedTypeReadingException(lgrVar.j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.plus.home.common.utils.OnClickListenerExtKt$toDebounced$1] */
    public static final OnClickListenerExtKt$toDebounced$1 c(final View.OnClickListener onClickListener) {
        final long j = 400;
        return new View.OnClickListener() { // from class: com.yandex.plus.home.common.utils.OnClickListenerExtKt$toDebounced$1
            private long lastClickTime;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(elapsedRealtime - this.lastClickTime) > j) {
                    this.lastClickTime = elapsedRealtime;
                    onClickListener.onClick(view);
                }
            }
        };
    }

    public static boolean d(lgr lgrVar, MifareClassic mifareClassic, int i) {
        String str = lgrVar.j;
        String str2 = lgrVar.i;
        if (jl40.l(str, "A")) {
            return mifareClassic.authenticateSectorWithKeyA(i, ofu.a(str2));
        }
        if (jl40.l(str, "B")) {
            return mifareClassic.authenticateSectorWithKeyB(i, ofu.a(str2));
        }
        throw new DetectedTypeWritingException("Failed to detected type of block: ".concat(str));
    }
}
