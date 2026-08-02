package defpackage;

import android.content.Context;
import androidx.media3.common.a;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.yandex.go.address.models.Address;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class r400 implements ua00, b920, ca20, al7, dq90, l0r0, igq0, qxr0, el40, iil0, ma41, hl81, pke {
    public static final /* synthetic */ r400 b = new r400(21);
    public final /* synthetic */ int a;

    public r400(Context context, mnb1 mnb1Var) {
        this.a = 22;
        d87 d87Var = d87.e;
        z811.b(context);
        j211 c = z811.a().c(d87Var);
        if (d87.d.contains(new pzn("json"))) {
            new j3y(new j0b1(c, 4));
        }
        new j3y(new j0b1(c, 5));
    }

    private final void k(yf7 yf7Var, IOException iOException) {
    }

    private final void l(yf7 yf7Var, kvj0 kvj0Var) {
    }

    @Override // defpackage.igq0
    public void I(Address address) {
    }

    @Override // defpackage.ma41
    public void a(rwq0 rwq0Var) {
    }

    @Override // defpackage.l0r0
    public void b(ap7 ap7Var) {
    }

    @Override // defpackage.l0r0
    public void c() {
    }

    @Override // defpackage.igq0
    public void cancel() {
    }

    @Override // defpackage.iil0
    public iil0 d() {
        return new xs01();
    }

    @Override // defpackage.iil0
    public jil0 e(int i) {
        wr11 wr11Var = new wr11();
        wr11 wr11Var2 = new wr11();
        try {
            wr11Var.a.open(wva1.c(0));
            int localPort = wr11Var.getLocalPort();
            boolean z = localPort % 2 == 0;
            wr11Var2.a.open(wva1.c(z ? localPort + 1 : localPort - 1));
            if (z) {
                wr11Var.b = wr11Var2;
                return wr11Var;
            }
            wr11Var2.b = wr11Var;
            return wr11Var2;
        } catch (IOException e) {
            yri0.b(wr11Var);
            yri0.b(wr11Var2);
            throw e;
        }
    }

    public ies0 f(a aVar) {
        String str = aVar.n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ou2();
                case "application/x-icy":
                    return new q5v();
                case "application/id3":
                    return new w5v();
                case "application/x-emsg":
                    return new ngo();
                case "application/x-scte35":
                    return new fst0();
            }
        }
        ny61.g(g8e.o("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.l0r0
    public void g() {
    }

    @Override // defpackage.el40
    public long getLastClickOnItemTimestamp() {
        return 0L;
    }

    @Override // defpackage.pke
    public /* synthetic */ Object h(Task task) {
        zm2 zm2Var = k991.k;
        return null;
    }

    public void i() {
        new n9r();
    }

    @Override // defpackage.l0r0
    public void j() {
    }

    public boolean m(a aVar) {
        String str = aVar.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        switch (this.a) {
            case 4:
                break;
            default:
                jst.e.k(iOException, "Can't send request to uz data storage");
                break;
        }
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        ((ba20) da20Var).success(null);
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        switch (this.a) {
            case 4:
                rvj0 rvj0Var = kvj0Var.z;
                if (rvj0Var != null) {
                    rvj0Var.close();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.el40
    public boolean satisfiesClickDelay() {
        return false;
    }

    @Override // defpackage.el40
    public void updateLastClickOnItemTimestamp() {
    }

    public /* synthetic */ r400(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ r400(int i) {
        this.a = i;
    }

    public r400(ru.yandex.taxi.walkroute.a aVar, ru.yandex.taxi.scootersroute.a aVar2) {
        this.a = 10;
    }

    public r400(Context context, nbp0 nbp0Var, hh51 hh51Var) {
        this.a = 6;
    }

    public r400() {
        this.a = 1;
        ImmutableList.p();
    }
}
