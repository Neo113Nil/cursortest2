package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a9w implements vvh, voh, Handler.Callback {
    public final wvh a;
    public final b9w b;
    public final zi7 c = new zi7();
    public final ArrayList d = new ArrayList();
    public final Handler e = dvt.q(new xcg(3, this));
    public final HandlerThread f;
    public final Handler g;
    public sis h;
    public woh[] i;
    public boolean j;

    public a9w(wvh wvhVar, b9w b9wVar) {
        this.a = wvhVar;
        this.b = b9wVar;
        HandlerThread handlerThread = new HandlerThread("YP:YDownloadHelper");
        this.f = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.g = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // defpackage.vvh
    public final void a(wvh wvhVar, sis sisVar) {
        woh[] wohVarArr;
        if (this.h != null) {
            return;
        }
        if (sisVar.m(0, new ris(), 0L).a()) {
            this.e.obtainMessage(2, new pg5()).sendToTarget();
            return;
        }
        this.h = sisVar;
        this.i = new woh[sisVar.h()];
        int i = 0;
        while (true) {
            wohVarArr = this.i;
            if (i >= wohVarArr.length) {
                break;
            }
            woh n = this.a.n(new uvh(sisVar.l(i)), this.c, 0L);
            this.i[i] = n;
            this.d.add(n);
            i++;
        }
        for (woh wohVar : wohVarArr) {
            wohVar.l(this, 0L);
        }
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        woh wohVar = (woh) ahpVar;
        if (this.d.contains(wohVar)) {
            this.g.obtainMessage(3, wohVar).sendToTarget();
        }
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(wohVar);
        if (arrayList.isEmpty()) {
            this.g.removeMessages(2);
            this.e.sendEmptyMessage(1);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Handler handler = this.g;
        wvh wvhVar = this.a;
        if (i == 1) {
            wvhVar.l(this, null, ndl.d);
            handler.sendEmptyMessage(2);
            return true;
        }
        ArrayList arrayList = this.d;
        int i2 = 0;
        if (i == 2) {
            try {
                if (this.i == null) {
                    wvhVar.p();
                } else {
                    while (i2 < arrayList.size()) {
                        ((woh) arrayList.get(i2)).k();
                        i2++;
                    }
                }
                handler.sendEmptyMessageDelayed(2, 100L);
                return true;
            } catch (IOException e) {
                this.e.obtainMessage(2, e).sendToTarget();
                return true;
            }
        }
        if (i == 3) {
            woh wohVar = (woh) message.obj;
            if (arrayList.contains(wohVar)) {
                chg chgVar = new chg();
                chgVar.a = 0L;
                wohVar.n(new dhg(chgVar));
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        woh[] wohVarArr = this.i;
        if (wohVarArr != null) {
            int length = wohVarArr.length;
            while (i2 < length) {
                wvhVar.s(wohVarArr[i2]);
                i2++;
            }
        }
        wvhVar.h(this);
        handler.removeCallbacksAndMessages(null);
        this.f.quit();
        return true;
    }
}
